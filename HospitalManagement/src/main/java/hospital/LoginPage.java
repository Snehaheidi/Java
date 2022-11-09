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
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ArrayList<Patient> patientDetail = new ArrayList<Patient>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPage() {
        super();
    }

//    public void init() {
//    	DaoOperation dao = new DaoOperation();
//    }
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
		String inTime = request.getParameter("inTime");
		String docTime = request.getParameter("docTime");
		System.out.println(pName+" "+phNo+" "+inTime+""+docTime);
		try {
			DaoOperation dao = new DaoOperation();
			Patient p = new Patient(pName,phNo,inTime,docTime);
			dao.insert(p);
//			insertData(request,response);
		} catch (ClassNotFoundException  | SQLException s) {
			s.printStackTrace();
		} 
	   	request.setAttribute("pName", pName);
	   	request.setAttribute("phNo", phNo);
	   	request.setAttribute("inTime", inTime);
	   	request.setAttribute("docTime", docTime);
	       RequestDispatcher rd=request.getRequestDispatcher("SuccessPage.jsp");
			rd.forward(request, response);
//		display(pName,phNo,inTime,docTime,request,response);
		doGet(request, response);
	}
   
//    public void insertData(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException, ClassNotFoundException, SQLException {
//    	String pName = request.getParameter("pName");
//		String phNo = request.getParameter("phNo");
//		String inTime = request.getParameter("inTime");
//		String docTime = request.getParameter("docTime");
//        
//		DaoOperation dao = new DaoOperation();
//		
//		Patient p = new Patient(pName,phNo,inTime,docTime);
//		patientDetail.add(p);  // List store
//		dao.insert(p); // insert data in DBMS
//		display(pName,phNo,inTime,docTime,request,response);
//    }
    public void display(String pName, String phNo, String inTime, String docTime,HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
   	 // get response writer
   	System.out.println(pName+" "+phNo+" "+inTime+""+docTime);
//       PrintWriter writer = response.getWriter();
//        
//       // build HTML code
//       String htmlRespone = "<html>";
//       htmlRespone += "<h5>Your Patient Name : " + pName + "<br/>";      
//       htmlRespone += "Patient Phone Number : " + phNo + "<br/>";   
//       htmlRespone += "Patient inTime : " + inTime + "<br/>"; 
//       htmlRespone += "Doctor Time : " + docTime + "</h5>"; 
//       htmlRespone += "</html>";
   	request.setAttribute("pName", pName);
   	request.setAttribute("phNo", phNo);
   	request.setAttribute("inTime", inTime);
   	request.setAttribute("docTime", docTime);
       RequestDispatcher rd=request.getRequestDispatcher("SuccessPage.jsp");
		rd.forward(request, response);
//       writer.println(htmlRespone);
   }
}
