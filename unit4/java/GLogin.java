import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class GLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GLogin() {
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
		String pwd = req.getParameter("pwd");
		
		if(pwd.equals("123")) {
			HttpSession session = req.getSession();
			session.setAttribute("name", n);
		} else {
			out.println("Wrong password.");
		}
		req.getRequestDispatcher("glink.html").include(req, res);
	}
}
