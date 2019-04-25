package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Example 2</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style1.css\" media=\"all\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("     \n");
      out.write("\n");
      out.write("    <header class=\"clearfix\">\n");
      out.write("      <div id=\"logo\">\n");
      out.write("        <img src=\"images/alogo.jpg\">\n");
      out.write("      </div>\n");
      out.write("      <div id=\"company\">\n");
      out.write("        <h2 class=\"name\">Company Name</h2>\n");
      out.write("        <div>455 Foggy Heights, AZ 85004, US</div>\n");
      out.write("        <div>(602) 519-0450</div>\n");
      out.write("        <div><a href=\"mailto:company@example.com\">company@example.com</a></div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("      <div id=\"details\" class=\"clearfix\">\n");
      out.write("        <div id=\"client\">\n");
      out.write("          <div class=\"to\">INVOICE TO:</div>\n");
      out.write("          <h2 class=\"name\">John Doe</h2>\n");
      out.write("          <div class=\"address\">796 Silver Harbour, TX 79273, US</div>\n");
      out.write("          <div class=\"email\"><a href=\"mailto:john@example.com\">john@example.com</a></div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"invoice\">\n");
      out.write("          <h1>INVOICE 3-2-1</h1>\n");
      out.write("          <div class=\"date\">Date of Invoice: 01/06/2014</div>\n");
      out.write("          <div class=\"date\">Due Date: 30/06/2014</div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("        <thead>\n");
      out.write("          <tr>\n");
      out.write("            <th class=\"no\">#</th>\n");
      out.write("            <th class=\"desc\">DESCRIPTION</th>\n");
      out.write("            <th class=\"unit\">UNIT PRICE</th>\n");
      out.write("            <th class=\"qty\">QUANTITY</th>\n");
      out.write("            <th class=\"total\">TOTAL</th>\n");
      out.write("          </tr>\n");
      out.write("        </thead>\n");
      out.write("  <tbody>\n");
      out.write("          <tr>\n");
      out.write("            <td class=\"no\">01</td>\n");
      out.write("            <td class=\"desc\"><h3>UNIT PRICE</h3>Creating a recognizable design solution based on the company's existing visual identity</td>\n");
      out.write("            <td class=\"unit\">$40.00</td>\n");
      out.write("            <td class=\"qty\">30</td>\n");
      out.write("            <td class=\"total\">$1,200.00</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td class=\"no\">02</td>\n");
      out.write("            <td class=\"desc\"><h3>QUANTITY</h3>Developing a Content Management System-based Website</td>\n");
      out.write("            <td class=\"unit\">$40.00</td>\n");
      out.write("            <td class=\"qty\">80</td>\n");
      out.write("            <td class=\"total\">$3,200.00</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td class=\"no\">03</td>\n");
      out.write("            <td class=\"desc\"><h3>TOTAL</h3>Optimize the site for search engines (SEO)</td>\n");
      out.write("            <td class=\"unit\">$40.00</td>\n");
      out.write("            <td class=\"qty\">20</td>\n");
      out.write("            <td class=\"total\">$800.00</td>\n");
      out.write("          </tr>\n");
      out.write("        </tbody>\n");
      out.write("        <tfoot>\n");
      out.write("          <tr>\n");
      out.write("            <td colspan=\"2\"></td>\n");
      out.write("            <td colspan=\"2\">SUBTOTAL</td>\n");
      out.write("            <td>$5,200.00</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td colspan=\"2\"></td>\n");
      out.write("            <td colspan=\"2\">TAX 25%</td>\n");
      out.write("            <td>$1,300.00</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td colspan=\"2\"></td>\n");
      out.write("            <td colspan=\"2\">GRAND TOTAL</td>\n");
      out.write("            <td>$6,500.00</td>\n");
      out.write("          </tr>\n");
      out.write("        </tfoot>\n");
      out.write("      </table>\n");
      out.write("      <div id=\"thanks\">Thank you!</div>\n");
      out.write("      <div id=\"notices\">\n");
      out.write("        <div>NOTICE:</div>\n");
      out.write("        <div class=\"notice\">A finance charge of 1.5% will be made on unpaid balances after 30 days.</div>\n");
      out.write("      </div>\n");
      out.write("    </main>\n");
      out.write("    <footer>\n");
      out.write("      Invoice was created on a computer and is valid without the signature and seal.\n");
      out.write("    </footer>\n");
      out.write("     \n");
      out.write("  </body>\n");
      out.write("  \n");
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
