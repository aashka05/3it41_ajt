import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class BLogin extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String x = req.getParameter("pwd");
		if(x.equals("bvm")) {
			RequestDispatcher rd = req.getRequestDispatcher("BProfile");
			rd.forward(req, res);
		} else if(x.equals("123")) {
			res.sendRedirect("https://google.com");
		} else {
			out.println("Wrong password");
			RequestDispatcher rd = req.getRequestDispatcher("brequest_dispatcher.html");
			rd.include(req, res);
		}
	}
}
