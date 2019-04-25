package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.*;
import java.util.*;

public final class graph1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"jquery-3.3.1.min.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"Chart.min.js\" ></script>\r\n");
      out.write("\r\n");
      out.write(" <script>\r\n");
      out.write("$( document ).ready(function() {\r\n");
      out.write("    console.log( \"ready!\" ); \r\n");
      out.write("\tvar mNames;\r\n");
      out.write("\tvar counts;\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\t  url: \"graphData.jsp\",\r\n");
      out.write("                  // type: 'POST',\r\n");
      out.write("\t\t  dataType: 'json',\r\n");
      out.write("\t\t  success: function( resp ) {\r\n");
      out.write("\t\t\tmNames = resp.mNames;\r\n");
      out.write("\t\t\tcounts = resp.counts;\r\n");
      out.write("\t\t\tvar ctx = document.getElementById(\"bar-chart\");\r\n");
      out.write("\t\t\tnew Chart(ctx, {\r\n");
      out.write("\t\t\t\ttype: 'bar',\r\n");
      out.write("\t\t\t\tdata: {\r\n");
      out.write("\t\t\t\t  labels: mNames,\r\n");
      out.write("\t\t\t\t  datasets: [\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t  label: \"Count\",\r\n");
      out.write("\t\t\t\t\t  backgroundColor: [\"#3e95cd\", \"#8e5ea2\",\"#3cba9f\",\"#e8c3b9\",\"#c45850\"],\r\n");
      out.write("\t\t\t\t\t  data: counts\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t  ]\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\toptions: {\r\n");
      out.write("\t\t\t\t  legend: { display: false },\r\n");
      out.write("\t\t\t\t  title: {\r\n");
      out.write("\t\t\t\t\tdisplay: true,\r\n");
      out.write("\t\t\t\t\ttext: 'Count of visit'\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t  },\r\n");
      out.write("\t\t  error: function( req, status, err ) {\r\n");
      out.write("\t\t\tconsole.log( 'something went wrong', status, err );\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div style=\"height:450px;width:800px\">\r\n");
      out.write("\t<canvas id=\"bar-chart\" width=\"800\" height=\"450\"></canvas>\r\n");
      out.write("</div>");
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
