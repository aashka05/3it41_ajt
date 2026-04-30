import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;

public class KDashboard extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String mid = req.getParameter("mid");
		String name = req.getParameter("fname");
		
		out.println("Welcome " + name);
		out.println("\nYour membership id is " + mid);
		Date now = new Date();
		out.println("Registration Date: " + now.toString());
	}
}