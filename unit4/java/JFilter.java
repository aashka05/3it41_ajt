import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class JFilter implements Filter {
	FilterConfig f;
	public void init(FilterConfig fConfig) throws ServletException {
		f = fConfig;
	}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String x = req.getParameter("pwd");
		if(x.equals("123")) {
			chain.doFilter(req, res);
		} else {
			out.print("Error");
			req.getRequestDispatcher("jfilter.html").include(req, res);
		}
	}
	
	public void destroy() {}
}

