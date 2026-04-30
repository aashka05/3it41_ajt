

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FLogout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		Cookie ck = new Cookie("name", "");
		ck.setMaxAge(0);
		res.addCookie(ck);
		out.println("Logged out");
		req.getRequestDispatcher("flink.html").include(req, res);;
	}

}
