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

public final class Graph_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
           ///  ResultSet rs,rs1,rs2,rs3;
           
         //   Connection con=null;
          // int point2,point3;
            
         //   String tname,point1;
        
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Graph</title>\n");
      out.write("\t\t<script src=\"js/jquery-2.1.4.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/Chart.js\"></script>\n");
      out.write("\t</head>\n");
      out.write("    <style>\n");
      out.write("\tbody{\n");
      out.write("        background-color: lightgray;\n");
      out.write("\t\tpadding-top: 60px;\n");
      out.write("        padding-left: 40px;\n");
      out.write("\t}\n");
      out.write("        #table1{\n");
      out.write("            border: 1px solid black; \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        th{\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\t</style>\n");
      out.write("  ");
  
       String username= (String)session.getAttribute("user");
     
      out.write("</%>\n");
      out.write("    ");
      out.write("</%!>\n");
      out.write("        ");

            
           
         
               Class.forName("com.mysql.jdbc.Driver").newInstance();
 Connection  con = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/ad","root", "ddd10");
            Statement statement = con.createStatement() ;
           ResultSet resultset = statement.executeQuery("select pid from new_provider where user='"+1+"'");
          String userID = "";
 if(resultset.next()){
	  userID = resultset.getString("pid");
 }
           
            int  point2=0;
            String point1="";
       PreparedStatement  ps1=con.prepareStatement("select a_name from m_content where pid='"+userID+"'  ");
          //  ps1.setInt(1,1);
            String aname="";
           resultset=ps1.executeQuery();
           if(resultset.next())
           {
                     aname = resultset.getString("a_name");
                    point1=resultset.getString(1);
                     out.println(point1);
           }
         
           
            PreparedStatement  ps2=con.prepareStatement("select count from m_content,p_content where m_content.a_name=p_content.m_name and m_name='"+aname+"'");
          ResultSet  rs2=ps2.executeQuery();
           
           if(rs2.next())
           {
                                point2=rs2.getInt(1);
                               out.println(point2);
           }
           
        /*   ps3=con.prepareStatement("select avg(point) from teacher,feedbacform,alternatives,subject,class where subject.teacher_id=teacher.teacher_id and teacher.teacher_id=feedbacform.teacher_id and class.class_id=feedbacform.class_id and feedbacform.fdf_id = alternatives.fdf_id and point between 9 and 10 and teacher.teacher_id =? and subject.subject_id=? and class.class_id=?");
            ps3.setString(1, teacher_id);
            ps3.setString(2, sub_id);
            ps3.setString(3, class_id);
            rs3=ps3.executeQuery();
           
           
            if(rs3.next())
           { 
                    point3=rs3.getInt(1);
           }
           */
         //  if((point1 == null)&&(point2 == 0) ) {
           //response.sendRedirect("publish_content.jsp");
            
          // }
               
      
            
         
      out.write("\n");
      out.write("\t<body>\n");
      out.write("        <header>\n");
      out.write("\t\t<div class=\"jumbotron\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\n");
      out.write("            <table>\n");
      out.write("                <tr><td style=\"color: Orchid\"><b>Orchid</b></td><td>:<b>GOOD</b>-:</td><td>Got points between <b>1 to 5</b></td></tr>\n");
      out.write("                <tr><td style=\"color: deeppink\"><b>Pink</b></td><td>:<b>BETTER</b>-:</td><td>Got points between<b>6 to 8</b></td></tr>\n");
      out.write("                <tr><td style=\"color: blue\"><b>blue</b></td><td>:<b>BEST</b>-:</td><td>Got points between <b>9 to 10</b></td></tr>\n");
      out.write("            </table>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div> \n");
      out.write("\t\t</div> \n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("        \n");
      out.write("\t\n");
      out.write("<canvas id=\"mycanvas\" width=\"256\" height=\"256\">\n");
      out.write("</canvas>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-sm-12\">\n");
      out.write("        <div class=\"form-group \">\n");
      out.write("    <center>\n");
      out.write("     <font size=10px><a href=\"publish_content.jsp\" class=\"btn btn-primary\">BACK</a></font>\n");
      out.write("    </center>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t$(document).ready(function(){\n");
      out.write("\t\t\t\tvar ctx = $(\"#mycanvas\").get(0).getContext(\"2d\");\n");
      out.write("\t\t\t\t\n");
      out.write("               \n");
      out.write("                \n");
      out.write("\t\t\t\t//pie chart data\n");
      out.write("\t\t\t\t//sum of values = 360\n");
      out.write("\t\t\t\tvar data = [\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tvalue: manipal,\n");
      out.write("\t\t\t\t\t\tcolor: \"MediumOrchid \",\n");
      out.write("\t\t\t\t\t\thighlight: \"lightskyblue\",\n");
      out.write("\t\t\t\t\t\tlabel: \"GOOD\"\n");
      out.write("\t\t\t\t\t},\n");
      out.write("                                                \n");
      out.write("                                         {\n");
      out.write("\t\t\t\t\t\tvalue: 4,\n");
      out.write("\t\t\t\t\t\tcolor: \"MediumOrchid \",\n");
      out.write("\t\t\t\t\t\thighlight: \"lightskyblue\",\n");
      out.write("\t\t\t\t\t\tlabel: \"GOOD\"\n");
      out.write("\t\t\t\t\t}       \n");
      out.write("\n");
      out.write("    \n");
      out.write("    ];\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t//draw\n");
      out.write("\t\t\t\tvar piechart = new Chart(ctx).Pie(data);\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\t</body>\n");
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
