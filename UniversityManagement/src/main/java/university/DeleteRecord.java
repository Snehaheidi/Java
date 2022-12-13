package university;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteRecord")
public class DeleteRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pass = request.getParameter("uPass");
		System.out.println(pass);
		try {
			//flag = DaoOperation.Studdelete(name,pass);
			if(DaoOperation.studDelete(pass)) {
				System.out.println("Record Student Successfully Deleted");
				System.out.println(pass);
				response.sendRedirect("DeleteRecord.jsp");			
			}
			else if(DaoOperation.facdelete(pass)) {
				System.out.println("Record Faculty Successfully Deleted");
				System.out.println(pass);
				response.sendRedirect("DeleteRecord.jsp");
			}
			else {
				request.setAttribute("message", "Enter the Valid Record");
				RequestDispatcher rs = request.getRequestDispatcher("DeleteRecord.jsp");
				rs.include(request, response);
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}