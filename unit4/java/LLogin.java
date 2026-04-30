import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LLogin extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String age = req.getParameter("age");
		Cookie ck = new Cookie("age", age);
		res.addCookie(ck);
		req.getRequestDispatcher("/LWelcomePage").forward(req, res);
	}

}
