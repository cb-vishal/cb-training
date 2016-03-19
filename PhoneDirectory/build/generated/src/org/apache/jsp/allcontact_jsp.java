package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class allcontact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            tr:nth-child(even) {background: #CCC}\n");
      out.write("tr:nth-child(odd) {background: #FFF}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\t   <h3 class=\"text-info\">Under Graduate Programs</h3>\n");
      out.write("           <table class=\"table table-striped\">\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t  <tr>\n");
      out.write("\t\t\t\t<th>&nbsp;Branch<br></th>\n");
      out.write("\t\t\t\t<th>2010 - 2011<br></th>\n");
      out.write("\t\t\t\t<th>2011 - 2012<br></th>\n");
      out.write("\t\t\t\t<th>2012 - 2013<br></th>\n");
      out.write("\t\t\t\t<th>2013 - 2014<br></th>\n");
      out.write("\t\t\t\t<th>2014 - 2015<br></th>\n");
      out.write("\t\t\t  </tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\t\t\t  <tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.E (Automobile Engineering)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">100%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">97.56%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">76.92%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">76.09%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">80.39%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t  <tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.E (Biomedical Engineering)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">95.74%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">91.67%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">88.89%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">58.70%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">89.74%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.E (Civil Engineering)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">84.85%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">91.30%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">87.18%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">61.29%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">77.78%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.E (Computer science and Engineering)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">97.30%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">100.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">93.64%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">94.34%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">92.86%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.E (Electrical amd Electronics Engineering)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">100.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">90.48%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">100.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">87.50%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">87.32%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.E (Electrical amd Electronics Engineering)(Sandwich)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">100.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">100.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">84.91%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">84.31%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">76.47%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.E (Electronics and Communication Engineering)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">95.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">100.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">96.46%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">88.24%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">93.68%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.E (Instrumentation and Control Engineering)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">96.30%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">100.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">94.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">77.55%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">72.73%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.E (Mechanical Engineering)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">98.20%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">90.74%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">91.84%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">88.50%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">93.46%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.E (Mechanical Engineering)(Sandwich)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">96.23%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">90.91%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">97.87%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">97.67%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">92.16%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.E (Metallurgical Engineering)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">87.10%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">100.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">87.27%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">95.83%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">79.17%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.E (Production Engineering)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">96.88%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">94.23%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">85.11%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">68.75%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">81.63%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.E (Production Engineering)(Sandwich)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">100.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">100.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">95.83%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">84.78%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">82.05%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.E (Robotics and Automation Engineering)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">NA</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">NA</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">NA</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">NA</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">73.07%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.Tech (Bio Technology)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">94.74%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">100.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">81.82%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">83.33%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">72.22%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.Tech (Fashion Technology)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">80.56%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">87.10%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">100.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">81.82</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">90.70%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.Tech (Information Technology)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">99.04%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">93.48%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">96.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">80.73%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">81.31%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"left\">B.Tech (Textile Technology)</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">93.10%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">100.00%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">97.83</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">80.56%</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">81.82%</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t  </table>\n");
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
