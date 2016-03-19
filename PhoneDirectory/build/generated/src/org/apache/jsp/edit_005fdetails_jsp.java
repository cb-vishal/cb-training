package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "border.jsp", out, false);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            input{\n");
      out.write("                //margin-left: 500px;\n");
      out.write("            }\n");
      out.write("            #btn{\n");
      out.write("                width: 100px;\n");
      out.write("                height: 35px;\n");
      out.write("                background-color: red;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"EditServlet\" method=\"post\">\n");
      out.write("            <center>\n");
      out.write("                <h1> Edit Contact</h1>\n");
      out.write("                <div>\n");
      out.write("                    Name<input type=\"text\" name=\"fname\" size='10'/>\n");
      out.write("                    <input type=\"text\" name=\"lname\" size='10'/><br/><br/>\n");
      out.write("\n");
      out.write("                    Address<input type=\"text\" name=\"add_line1\" size='25' value=\"Address Line1\" onclick=\"this.value = ''\"/><br/><br/>\n");
      out.write("                    <input type=\"text\" name=\"add_line2\" size='25' value=\"Address Line2\" onclick=\"this.value = ''\"/><br/><br/>\n");
      out.write("                    <input type=\"text\" name=\"city\" value=\"City\" size='10' onclick=\"this.value = ''\"/><b>\n");
      out.write("                        <select name=\"state\">\n");
      out.write("                            <option value=\"state\">State</option>\n");
      out.write("                            <option value=\"bihar\">Bihar</option>\n");
      out.write("                            <option value=\"tamilnadu\">TamilNadu</option>\n");
      out.write("                            <option value=\"keral\">Keral</option>\n");
      out.write("                        </select> <br/>\n");
      out.write("                        <input type=\"text\" name=\"zip\" value=\"Zip\" size='10' onclick=\"this.value = ''\"/><b>\n");
      out.write("                            <select name=\"country\">\n");
      out.write("                                <option value=\"country\">Country</option>\n");
      out.write("                                <option value=\"india\">India</option>\n");
      out.write("                                <option value=\"pakistan\">pakistan</option>\n");
      out.write("                                <option value=\"dubai\">Dubai</option>\n");
      out.write("                                <option value=\"america\">America</option>\n");
      out.write("                            </select> <br/><br/>\n");
      out.write("                            Phone(Work)<input type=\"text\" name=\"work\" size='25' value=\"123-456-7890\" onclick=\"this.value = ''\"/><br/><br/>\n");
      out.write("                            Phone(Home)<input type=\"text\" name=\"home\" size='25' value=\"123-456-7890\" onclick=\"this.value = ''\"/><br/><br/>\n");
      out.write("                            Phone(Mobile)<input type=\"text\" name=\"mobile\" size='25' value=\"123-456-7890\" onclick=\"this.value = ''\"/><br/><br/>\n");
      out.write("                            <input id='btn' type=\"submit\" name=\"save\" value=\"Save Details\"/><b><b>\n");
      out.write("                                    <a href=\"welcome.jsp\">Discard</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    </center>\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                                    </body>\n");
      out.write("                                    </html>\n");
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
