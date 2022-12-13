package hospital;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	  ArrayList<Patient> patientDetail = new ArrayList<Patient>();
      DaoOperation dao = new DaoOperation();       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pName = request.getParameter("pName");
		String phNo = request.getParameter("phNo");

		System.out.println(pName+" "+phNo);
		try {			
			Patient p = new Patient(pName,phNo);
			dao.insert(p);		
//			insertData(request,response);
		} catch (ClassNotFoundException  | SQLException s) {
			s.printStackTrace();
		} 
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
//	   	request.setAttribute("pName", pName);
//	   	request.setAttribute("phNo", phNo);
//	   	request.setAttribute("inTime", inTime);
//	   	request.setAttribute("docTime", docTime);	
		out.println("Register SuccessFul...");
		try {
			out.println("Your Patient Id : "+dao.findPatientId(phNo));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
//		display(pName,phNo,inTime,docTime,request,response);
//		doGet(request, response);
	}
//	   public void display(String pName, String phNo, String inTime, String docTime,HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
//		   	 // get response writer
//		   	System.out.println(pName+" "+phNo+" "+inTime+""+docTime);
////		       PrintWriter writer = response.getWriter();		        
////		       // build HTML code
////		       String htmlRespone = "<html>";
////		       htmlRespone += "<h5>Your Patient Name : " + pName + "<br/>";      
////		       htmlRespone += "Patient Phone Number : " + phNo + "<br/>";   
////		       htmlRespone += "Patient inTime : " + inTime + "<br/>"; 
////		       htmlRespone += "Doctor Time : " + docTime + "</h5>"; 
////		       htmlRespone += "</html>";
//		   	request.setAttribute("pName", pName);
//		   	request.setAttribute("phNo", phNo);
//		   	request.setAttribute("inTime", inTime);
//		   	request.setAttribute("docTime", docTime);
//		       RequestDispatcher rd=request.getRequestDispatcher("SuccessPage.jsp");
//				rd.forward(request, response);
////		       writer.println(htmlRespone);
//		   }
}
