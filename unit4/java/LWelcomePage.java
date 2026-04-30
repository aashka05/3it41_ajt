
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LWelcomePage extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		Cookie[] ck = req.getCookies();
		if(ck != null) {
			String val = ck[0].getValue();
			int age = Integer.parseInt(val);
			if (age > 18) {
				out.println("Welcome" + name);
			} else {
				out.println("Error. age <= 18");
				req.getRequestDispatcher("l2025.html").include(req, res);
			}
		}
	}
}
