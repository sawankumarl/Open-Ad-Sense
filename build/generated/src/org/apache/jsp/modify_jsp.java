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

public final class modify_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" ");
 
     String id = request.getParameter("id");
              Class.forName("com.mysql.jdbc.Driver").newInstance();
 Connection  con = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/ad","root", "ddd10");
 Connection connection = null;
Statement statement = null;
ResultSet resultset = null;
         statement = con.createStatement() ;
            statement=connection.createStatement();
            resultset = statement.executeQuery("select mid,a_name,date,domain,a_file,a_size,s_time1,time_sec1,s_time2,time_sec2,s_time3,time_sec3,cmp,status1 from m_content where pid='"+id+"' ");

       while(resultset.next()){

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("<h1>modify user data here </h1>\n");
      out.write("<form method=\"post\" action=\"update-process.jsp\">\n");
      out.write("<input type=\"hidden\" name=\"id\" value=\"");
      out.print(resultset.getString(1) );
      out.write("\">\n");
      out.write("<input type=\"text\" name=\"id\" value=\"");
      out.print(resultset.getString(1) );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Advertise name:<br>\n");
      out.write("<input type=\"text\" name=\"aname\" value=\"");
      out.print(resultset.getString(2) );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Date:<br>\n");
      out.write("<input type=\"text\" name=\"date\" value=\"");
      out.print(resultset.getString(3) );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Domain:<br>\n");
      out.write("<input type=\"text\" name=\"dom\" value=\"");
      out.print(resultset.getString(4) );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Ads File:<br>\n");
      out.write("<input type=\"email\" name=\"afile\" value=\"");
      out.print(resultset.getString(5) );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Ads Size:<br>\n");
      out.write("<input type=\"email\" name=\"asize\" value=\"");
      out.print(resultset.getString(6) );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Start Time(1):<br>\n");
      out.write("<input type=\"email\" name=\"st1\" value=\"");
      out.print(resultset.getString(7) );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Time1(sec):<br>\n");
      out.write("<input type=\"email\" name=\"t1\" value=\"");
      out.print(resultset.getString(8) );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Start Time(2):<br>\n");
      out.write("<input type=\"email\" name=\"st2\" value=\"");
      out.print(resultset.getString(9) );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Time2(sec):<br>\n");
      out.write("<input type=\"email\" name=\"t2\" value=\"");
      out.print(resultset.getString(10) );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Start Time(3):<br>\n");
      out.write("<input type=\"email\" name=\"st3\" value=\"");
      out.print(resultset.getString(11) );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Time3(sec):<br>\n");
      out.write("<input type=\"email\" name=\"t3\" value=\"");
      out.print(resultset.getString(12) );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Ads CMP:<br>\n");
      out.write("<input type=\"email\" name=\"cmp\" value=\"");
      out.print(resultset.getString(13) );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<input type=\"submit\" value=\"submit\">\n");
      out.write("</form>\n");

}
       
      out.write("\n");
      out.write(" </body>\n");
      out.write("</html>");
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
