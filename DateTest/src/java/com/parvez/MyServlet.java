package com.parvez;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet extends GenericServlet {

    @Override
    public void init(ServletConfig config) throws ServletException{
         super.init(config);
        log("myyyyyy initalized:" + new Date());
    
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse response) throws ServletException, IOException {
         response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>BasicServelet</title></head>");
        out.println("<body><h2>" + getServletName() + "</h2>");
        out.println("this is basic servlet.<br>");
        out.println("<hr></body></html>");
        out.close();

    }

    @Override
    public void destroy(){
     log("MyServlet waas destoyed at:" + new Date());
    }
}
