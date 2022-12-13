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
import javax.servlet.http.HttpSession;

@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ArrayList<Patient> patientDetail = new ArrayList<Patient>();
       DaoOperation dao = new DaoOperation();
       
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
	@SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		  PrintWriter out = response.getWriter();
		   int id =  Integer.parseInt(request.getParameter("pId"));
		  String phNo = request.getParameter("phNo");
		  System.out.println(id+"-----"+phNo);
//		  Patient p = new Patient(id,phNo);
			try {
				if(dao.select(id,phNo)) {
//					response.sendRedirect("NewAppointment.jsp");
					HttpSession session = request.getSession(true);
					session.putValue("id",id);
					 RequestDispatcher rd=request.getRequestDispatcher("NewAppointment.jsp");
					 rd.forward(request, response);
				  }else {
					  out.println("Invalid User or Passward Name:");
					  response.sendRedirect("Login.jsp");	  
				  }
			} catch (SQLException e) {
				e.printStackTrace();
			}
//		doGet(request, response);
	}
}
