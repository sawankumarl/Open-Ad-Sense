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

public final class graphData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
       
       String username= "sawan123";//(String)session.getAttribute("user");
       String name= (String)session.getAttribute("aname");
              Class.forName("com.mysql.jdbc.Driver").newInstance();
 Connection  con = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/ad","root", "ddd10");
            Statement statement = con.createStatement() ;
             ResultSet resultset = statement.executeQuery("select pid from new_provider where user='"+username+"'");
          String userID = "";
 if(resultset.next()){
	  userID = resultset.getString("pid");
      
 }
           // resultset =  statement.executeQuery("select m_name,Ad_request,Bilable_impression,count,fill_rate from m_content,p_content where m_content.a_name=p_content.m_name and pid='"+userID+"'");
            resultset = statement.executeQuery("select mid,a_name,date,domain,a_file,a_size,total_time,cmp,status1,count from m_content,payment,p_content   where  m_content.mid=payment.mpid and m_content.a_name=p_content.m_name and pid='"+userID +"' ");
			
			resultset = statement.executeQuery("select m_name,count from p_content ");
			
			List<String> mNamesList = new ArrayList<String>();
			List<String> mNameCountsList = new ArrayList<String>();
			
			while(resultset.next()){
				String cname = resultset.getString("m_name");
				mNamesList.add("\""+cname+"\"");
				mNameCountsList.add(Integer.toString(resultset.getInt("count")));
			}
			String mNames = String.join(",", mNamesList);
			String mNameCounts = String.join(",", mNameCountsList);
			
			StringBuffer data = new StringBuffer();
			data.append(" { \"mNames\" : [ "+mNames+" ], \"counts\" : ["+mNameCounts+"] }");
			
			
			out.print(data);
       
        
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
