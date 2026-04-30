

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class KMembershipFilter implements Filter{
	FilterConfig f;
	public void init(FilterConfig f) throws ServletException {
		this.f = f;
	}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		
		String mid = req.getParameter("mid");
		String cmp = mid.substring(0, 3);
		if(cmp.equals("MEM")) {
			chain.doFilter(req, res);
		} else {
			out.println("Invalid id.");
		}
	}
}
