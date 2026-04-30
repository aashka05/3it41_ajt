import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FProfile() {
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
		req.getRequestDispatcher("flink.html").include(req, res);
		Cookie[] ck = req.getCookies();
		if(ck != null) {
			String n = ck[0].getValue();
			if(!n.equals("")) {
				out.println("Hello " + n);
			} else {
				out.println("Login first.");
				req.getRequestDispatcher("flogin.html").include(req,  res);
			}
		}
	}

}
