import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class JServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        PrintWriter out = res.getWriter();
        out.println("Access Granted");
    }
}