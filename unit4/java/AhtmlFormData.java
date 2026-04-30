import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AhtmlFormData extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AhtmlFormData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String x = req.getParameter("username");
		out.println(x);
		out.close();
	}
}
