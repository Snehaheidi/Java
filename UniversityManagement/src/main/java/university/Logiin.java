package university;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

/**
 * Servlet implementation class Logiin
 */
@WebServlet("/Logiin")
public class Logiin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		PrintWriter out = response.getWriter();
		String name="",rollNo="";
		name = request.getParameter("uName");
		rollNo = request.getParameter("uPass");
		
		System.out.println(name+" "+rollNo);
		try {
			String res = null;
			if(DaoOperation.validateStudId(name,rollNo)) {
				Student stud = new Student();
				stud.setStudName(name);
				stud.setStudrollNo(rollNo);
				System.out.println("if");				
				System.out.println(name+"-----"+rollNo);
//				String uString=new Gson().toJson(stud);
//				out.print(uString);
				res = "student";
//				out.print(res);
			}else if(DaoOperation.validateFacId(name, rollNo)) {
				Faculty fac = new Faculty();
				fac.setFacname(name);
				fac.setFacemail(rollNo);
//				System.out.println("else if");				
//				System.out.println(name+"-----"+rollNo);
//				String uString=new Gson().toJson(fac);
//				out.println(uString);
				res = "faculty";
				System.out.println(res);
//				out.print(res);
			}
//			else if(name.equals("admin") && rollNo.equals("1111")){
//				HttpSession session = request.getSession(true);
//				session.putValue("name",name);
//				RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");
//				rd.forward(request, response);
//			}
			response.setContentType("text/plain");
			out.print(res);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
