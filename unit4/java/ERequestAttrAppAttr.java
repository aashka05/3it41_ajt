import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ERequestAttrAppAttr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ERequestAttrAppAttr() {
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
		req.setAttribute("name", "Aashka");
		String x = (String)req.getAttribute("name");
		out.println(x);
		ServletContext context = getServletContext();
		context.setAttribute("name", "PetrificusTotalus");
	}


}
