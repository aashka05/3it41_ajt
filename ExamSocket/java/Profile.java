

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Profile extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		if (session != null) {
			String n = (String)session.getAttribute("uname");
			out.println("Hello " + n);
			request.getRequestDispatcher("link.html").include(request, response);
			
		//Cookie[] ck = request.getCookies();
//		if(ck != null) {
//			String name = ck[0].getValue();
//			if(!name.equals("")) {
//				out.println("Hello " + name);
//				request.getRequestDispatcher("link.html").include(request, response);				
//			} 
		} else {
			out.println("Login first");
			request.getRequestDispatcher("link.html").include(request, response);
		}
	}

}
