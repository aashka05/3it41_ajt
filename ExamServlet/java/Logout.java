

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
//		Cookie ck = new Cookie("uname", "");
//		ck.setMaxAge(0);
//		response.addCookie(ck);
		HttpSession session = request.getSession();
		session.invalidate();
		out.println("Logged out");
		request.getRequestDispatcher("link.html").include(request, response);
	}
}
