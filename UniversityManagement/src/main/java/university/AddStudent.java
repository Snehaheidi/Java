package university;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddStudent
 */
@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studname = request.getParameter("studName");
		String studrollNo = request.getParameter("studRollNo");
		String studdob =request.getParameter("studDob") ;
		String studphNo = request.getParameter("studPhno");
		String studemail =request.getParameter("studMail") ;
		String studcity = request.getParameter("studCity");
		System.out.println(studname+" "+studrollNo+" "+studdob+" "+studphNo+" "+studemail+" "+studcity);
		Student s = new Student(studname,studrollNo,studdob,studphNo,studemail,studcity);
		System.out.println("AddStudent servlet class");
		try {
			Boolean flag = DaoOperation.insertStud(s);
			if(flag) {
				System.out.println("Register Successfull..");
				response.sendRedirect("NewStudent.jsp");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
   }

}
