package org.mortbay.jetty.appengine.flexible.helloworld;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( name = "helloworld", value = "/" )
public class HelloServlet
    extends HttpServlet
{

    @Override
    public void doGet( HttpServletRequest req, HttpServletResponse resp )
        throws IOException
    {
        PrintWriter out = resp.getWriter();
        out.println( "Hello, world - Flex Servlet" );
    }
}

