package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <script type=\"text/javascript\" src=\"validate.js\"></script> \n");
      out.write("        <style>\n");
      out.write("            div{\n");
      out.write("                float: top;\n");
      out.write("                margin-top:100px;\n");
      out.write("                margin-left:450px;\n");
      out.write("                width: 400px;\n");
      out.write("                height: 500px;\n");
      out.write("                background: burlywood;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                height: 35px;\n");
      out.write("                width: 120px\n");
      out.write("            }\n");
      out.write("            #reg{\n");
      out.write("                float: bottom;\n");
      out.write("                width: 300px;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: blue;\n");
      out.write("                color: white;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #bt{\n");
      out.write("                background-color: crimson;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <form name=\"myform\" action=\"LoginServlet\" method=\"post\" onsubmit=\"return validateform()\">  \n");
      out.write("\n");
      out.write("                <center>\n");
      out.write("                    <h1>Phone Directory</h1>\n");
      out.write("                    <h3>Login</h3><br/>\n");
      out.write("                    <p>\n");
      out.write("                        ");

                            String msg = (String) request.getAttribute("msg");
                            if (msg != null) {
                                out.print(msg);
                            }
      out.write("</p>\n");
      out.write("                    Email:<input type=\"text\"  name=\"email\"/><br/><br/>  \n");
      out.write("                    Password:<input type=\"password\"   name=\"pass\"/><br/><br/>  \n");
      out.write("                    <input id='bt' type=\"submit\" name=\"login\" value=\"Login\"/><b><br/>\n");
      out.write("                        <a href=\"\">Don't remember your password?</a>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                </center>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
