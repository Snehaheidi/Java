package university;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddFaculty
 */
@WebServlet("/AddFaculty")
public class AddFaculty extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String facname = request.getParameter("facName");
		String facdob =request.getParameter("facDob") ;
		String facphNo = request.getParameter("facPhno");
		String facemail =request.getParameter("facMail");
		String facCollege = request.getParameter("facCollege");
		String facCourse = request.getParameter("facCourse");
		String faccity = request.getParameter("facCity");
		System.out.println(facname+" " +facdob+" "+facphNo+" "+facemail+" "+facCollege+" "+facCourse+" "+faccity);
		Faculty f = new Faculty(facname,facdob,facphNo,facemail,facCollege,facCourse,faccity);
		System.out.println("AddStudent servlet class");
		Boolean flag = null;
		try {
			flag = DaoOperation.insertFac(f);
			if(flag) {
				System.out.println("Register Successfull..");
				response.sendRedirect("AddNewFaculty.jsp");
			}
			else {
				response.sendRedirect("AddNewFaculty.jsp");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
