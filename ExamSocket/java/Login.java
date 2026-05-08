

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String pwd = request.getParameter("pwd");
		String uname = request.getParameter("uname");
		if(pwd.equals("123")) {
//			Cookie ck = new Cookie("uname", uname);
//			response.addCookie(ck);
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			out.println("Logged in");
			request.getRequestDispatcher("link.html").include(request, response);
		} else {
			out.println("Wrong password");
			request.getRequestDispatcher("link.html").include(request, response);
		}
	}

}
