package hospital;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SummaryServlet")
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SummaryServlet() {
        super();
    }

	private Patient hospitalTimeCalculate(int p_id,String inTime,int doctorTime) throws SQLException {

		int minutes=0;
		//MEDICAL PROFESSIONALS: -- 5MINS EACH
		final int medicalProfessionals=10; //2.
		/*-----------------------------------------------------------*/
		//MEET DOCTOR TOOK TIME BETWEEN 2 TO 20 MINS   
		//(int)(Math.random()*(max-min+1)+min);   ---> format
        int max=20;
//        int doctorTime=(int)(Math.random()*(max-min+1)+min);  //----> below code randomly generate we given numbers
        //System.out.println("Doctor Time : " + doctorTime);
        /*-----------------------------------------------------------*/
        int pharmacy = 5;
        
        minutes=medicalProfessionals+doctorTime+pharmacy;

        int aboveTime=10;
        int waitingTime=0;
  
        if(doctorTime>aboveTime) {
        	waitingTime=doctorTime-max+aboveTime;
        	System.out.println("Waiting Time          : " +waitingTime);
        	System.out.println("<*****SorrY FoR LatE*****>");
        }else {
        	System.out.println("Waiting Time          : " +waitingTime);
        }      	
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
	    LocalTime lt = LocalTime.parse(inTime);
	    String outtime=df.format(lt.plusMinutes(minutes));
	      Patient p = new Patient(p_id,inTime,doctorTime,waitingTime,outtime);
	      if(DaoOperation.update(p)) {
	    	  return p;
	      }
	      return p;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*RETRIVE SESSION*/
		
		HttpSession session = request.getSession(true);
		int p_id=(int) session.getValue("id");
		System.out.println("Id : " + p_id);
		//		if() {
//			
//		}
		
		
		/*********************************************/
		String inTime=request.getParameter("inTime");
		int doctorTime=Integer.parseInt(request.getParameter("docTime"));
		System.out.println(inTime+" "+doctorTime);
		try {
			Patient p = hospitalTimeCalculate(p_id,inTime,doctorTime);

	    	request.setAttribute("pid", p.getpId());
			request.setAttribute("inTime", p.getInTime() );
			request.setAttribute("docTime", p.getDocTime() );
			request.setAttribute("waitTime", p.getWaitTime());
			request.setAttribute("outTime", p.getOutTime());
			System.out.println(p.docTime +" "+p.inTime+" "+p.outTime+" "+p.waitTime);
//			DaoOperation .update(p);
			RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
//			response.sendRedirect("welcome.jsp");
//		doGet(request, response);
	}
}
