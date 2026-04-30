import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String n = req.getParameter("name");
		String x = req.getParameter("pwd");
		if(x.equals("123")) {
			Cookie ck = new Cookie("name", n);
			res.addCookie(ck);
			out.println("Logged in.");
			req.getRequestDispatcher("flink.html").include(req, res);;
		} else {
			out.println("Wrong password.");
			RequestDispatcher rd = req.getRequestDispatcher("flink.html");
			rd.include(req, res);
		}
	}

}
