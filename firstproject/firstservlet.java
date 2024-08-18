package firstproject;

import javax.servlet.http.*;
import java.io.*;

// to create servlet we have 4 ways one way is to implement Servlet interface
/* 
public class firstservlet implements Servlet {
    public void init(ServletConfig config) {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest req, ServletResponse res) {

    }

    public String getServletInfo() {
        return "";
    }

    public void destroy() {

    }
}*/
// Generic Servlet is for all protocols
// http servlet is for only http protocol
/*public class firstservlet extends GenericServlet {// http ftp smtp
    public void service(ServletRequest req, ServletResponse res) {

    }
}*/

public class firstservlet extends HttpServlet {// http ftp smtp
    public void service(HttpServletRequest req, HttpServletResponse res) {
        // PrintWriterObject
        try {
            PrintWriter out = res.getWriter();
            out.println("Welcome to My first Servlet Project");
        } catch (Exception e) {

        }
        // Create a response
    }
}
