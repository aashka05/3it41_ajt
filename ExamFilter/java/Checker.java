import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Checker extends HttpFilter implements Filter {
    
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		
		String number = request.getParameter("number");
		int n = Integer.parseInt(number);
		int flag = 0;
		for(int i = 2; i < (n/2); i++) {
			if(n % i == 0) {
				flag = 1; 
				break;
			}
		}
		
		
//		int flag = 1;
//		String s = request.getParameter("number");
//
//		char arr[] = s.toCharArray();
//		
//		int n = s.length();
//		for(int i = 0; i < n; i++) {
//			for(int j = i+1; j < n - i - 1; j++) {
//				if(arr[j] > arr[j+1]) {
//					char temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		String new_s = new String(arr);
		
		if (flag == 0) 
			chain.doFilter(request, response);

		
		else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("Prime number required");
//			out.println(new_s);
			request.getRequestDispatcher("index.html").include(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
