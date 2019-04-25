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

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <title>Provider data</title>\n");
      out.write("\n");
      out.write("   <link rel=\"stylesheet\" href=\"add.css\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"materialize.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js\"></script>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("<style>\n");
      out.write("h {background-color: powderblue;}\n");
      out.write("\n");
      out.write("p    {color: red;}\n");
      out.write("body {\n");
      out.write("   background-image: url(\"images/wb.png\");\n");
      out.write("   html,\n");
      out.write("body {\n");
      out.write("    height: 100%;\n");
      out.write("}\n");
      out.write("html {\n");
      out.write("    display: table;\n");
      out.write("    margin: auto;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("    background-color:white;\n");
      out.write("  //   background-image: url(\"images/wb.png\");\n");
      out.write("    display: table-cell;\n");
      out.write("    vertical-align: middle;\n");
      out.write("}\n");
      out.write(".margin {\n");
      out.write("  margin: 0 !important;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write(" </head> \n");
      out.write("      \n");
      out.write("<body onload=\"validate()\" background=\"images/wb.png\" >\n");
      out.write("\n");
      out.write("     \n");
      out.write("      \t\n");
      out.write(" <div id=\"login-page\" class=\"row\">\n");
      out.write("     \n");
      out.write("    <div class=\"col s12 z-depth-6 card-panel\">\n");
      out.write("      <form class=\"login-form\" method=\"post\" action=\"p_data.jsp\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"input-field col s12 center\">\n");
      out.write("              <h5> \n");
      out.write("\n");
      out.write(" <a href=\"publish_content.jsp\"><font color=\"white\" style=\"arial\">Back </font></a>&nbsp&nbsp\n");
      out.write(" <a href=\"Provider_data.jsp\"><font color=\"white\" style=\"arial\">Import Data </font></a>&nbsp&nbsp\n");
      out.write("            <a href=\"contactus.jsp\"><font color=\"white\" style=\"arial\">Contact Us </font></a>&nbsp&nbsp\n");
      out.write("            <a href=\"about.jsp\"><font color=\"white\" style=\"arial\">About Us </font></a>&nbsp&nbsp\n");
      out.write("            <a href=\"logout.jsp\"><font color=\"white\" style=\"arial\">Logout </font></a>\n");
      out.write("          \n");
      out.write("                </h5>\n");
      out.write("            <img src=\"images/alogo.jpg\" alt=\"\" class=\"responsive-img valign profile-image-login\" width=\"700\">\n");
      out.write("          <h5>  <p class=\"center login-form-text\"><i><b>Import Provider Data</b></i></p></h5>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"row margin\">\n");
      out.write("     \n");

       String select= request.getParameter("chk");
       session.setAttribute("chk", select);
       
              Class.forName("com.mysql.jdbc.Driver").newInstance();
 Connection  con = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/ad","root", "ddd10");
            Statement statement = con.createStatement(); 
            ResultSet resultset;
          //   ResultSet resultset = statement.executeQuery("select a_name,mid from m_content where mid="+mid+" ");
       //   String a_name = "";
 //if(resultset.next()){
	//  a_name = resultset.getString("a_name");
// }
           // resultset =  statement.executeQuery("select m_name,Ad_request,Bilable_impression,count,fill_rate from m_content,p_content where m_content.a_name=p_content.m_name and pid='"+userID+"'");
        //  for (int i = 0; i < select.length; i++)
       //   {
           
       //     PreparedStatement st = con.prepareStatement("insert into payment(Ads_name,mpid) VALUES ('" + name + "',"+mid1+")");
    
         // ResultSet resultset1;
           //  int j=st.executeUpdate();
       //     fr=(complete/Adr)*100;
             PreparedStatement   st;
 //if(j>0)
 //{
          //  resultset = statement.executeQuery("select a_name,date,a_size,time_sec1,time_sec2,time_sec3,cmp,mid from m_content where mid="+select+" ");
                 resultset = statement.executeQuery("select a_name,date,a_size,time_sec1,time_sec2,time_sec3,cmp,mid from m_content where mid="+select+" ");
             String name="";
             String mid1="";
             int t1=0,t2=0,t3=0;
                 
             int cmp=0;
              int ttime;
               int pay;
                int tpay;
            if(resultset.next())
            {
                     name = resultset.getString("a_name");
                     mid1=resultset.getString("mid");
                      t1=resultset.getInt("time_sec1");
               t2=resultset.getInt("time_sec2");
                t3=resultset.getInt("time_sec3");
                cmp=resultset.getInt("cmp");
                      name = resultset.getString("a_name");
            }
             ttime=t1+t2+t3;
                pay= (ttime * 60);
                tpay=pay-cmp;
               // out.println(pay);
        resultset = statement.executeQuery("select py_id,Ads_name,total_time,pay,total_pay,mpid from payment where mpid='"+select+"'");
      // String ad_name="";
        if(resultset.next())
        {
               int py_id=resultset.getInt("py_id");
            // ad_name=resultset.getString("Ads_name");
            tpay=resultset.getInt("total_pay");
            pay=resultset.getInt("pay");
            ttime=resultset.getInt("total_time");
             st = con.prepareStatement("update payment set total_pay=? and pay=? and total_time=? and Ads_name=? where py_id=?");
             st.setInt(1,tpay);
             st.setInt(2, pay);
              st.setInt(3, ttime);
             st.setString(4,name);
              st.setInt(5,py_id);
               
             st.executeUpdate();
        }
        else
        {
            st=con.prepareStatement("insert into  payment(Ads_name,total_time,pay,total_pay,mpid) values(?,?,?,?,?)");
            st.setString(1,name);
            st.setInt(2,ttime);
            st.setInt(3, pay);
            st.setInt(4, tpay);
            st.setString(5,mid1);
            
          
            st.executeUpdate();
        }
           
    /* double Adr=resultset.getDouble("Ad_request");

    double complete=resultset.getDouble("Bilable_impression");
   String name = resultset.getString("m_name");
      double fr=(complete/Adr)*100;
           PreparedStatement st = con.prepareStatement("update p_content set fill_rate=? where m_name=?");
               st.setDouble(1,fr);
               st.setString(2,name);
              st.executeUpdate();*/
              resultset = statement.executeQuery("select a_name,date,a_size,time_sec1,time_sec2,time_sec3,pay,cmp,total_pay from m_content,payment where m_content.mid=payment.mpid and mpid='"+select+"' ");

     //out.println("value inserted.....");
             // response.sendRedirect("pays.jsp");
 //   }
// else
 //{
    // out.println("value Can't insert.....");
 //}
         
         // resultset = statement.executeQuery("select a_name,date,a_size,time_sec1,time_sec2,time_sec3,total_pay,cmp,pay from m_content,payment where m_content.mid=payment.mpid and mpid="+mid1+" ");
             
                // resultset =  statement.executeQuery("select pc_id,date,domain,a_file,a_size,s_time1,time_sec1,s_time2,time_sec2,s_time3,time_sec3,Ad_request,Bilable_impression,count,cmp,fill_Rate from p_content,m_content") ; 
        
      out.write("\n");
      out.write("  <br>\n");
      out.write("\t\t\t<center><h2>Publish Content</h2></center><br>\n");
      out.write("                        <form action=\"payment.jsp\" method=\"post\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                                ");
 while(resultset.next()){ 
      out.write("\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t\t\t <th> Advertise name:- ");
      out.print( resultset.getString(1) );
      out.write("<br>\n");
      out.write("                                                           <th>Date:-");
      out.print( resultset.getString(2) );
      out.write("<br>\n");
      out.write("                                                          <th>Size:-");
      out.print( resultset.getString(3) );
      out.write("<br>\n");
      out.write("                                                         <th>First Time:- ");
      out.print( resultset.getString(4) );
      out.write("<br>\n");
      out.write("                                                        <th>Second Time:- ");
      out.print( resultset.getString(5) );
      out.write("<br>\n");
      out.write("                                                          <th>Third Time:- ");
      out.print( resultset.getString(6) );
      out.write("<br>\n");
      out.write("                                                        <th>Total Payment:- ");
      out.print( resultset.getString(7) );
      out.write("<br>\n");
      out.write("                                                         <th>Advanced Payment:- ");
      out.print( resultset.getString(8) );
      out.write("<br>\n");
      out.write("                                                       <th>Required Payment:- ");
      out.print( resultset.getString(9) );
      out.write("<br>\n");
      out.write("                                                    \n");
      out.write("                                                    ");
 } 
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t</form>\n");
      out.write("\n");
      out.write(" </div>\n");
      out.write("  </div>\n");
      out.write("  <center>\n");
      out.write("    <script async src=\"//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\"></script>\n");
      out.write("<!-- Post Page - Responsive -->\n");
      out.write("<ins class=\"adsbygoogle\"\n");
      out.write("     style=\"display:inline-block;width:300px;height:250px\"\n");
      out.write("     data-ad-client=\"ca-pub-5104998679826243\"\n");
      out.write("     data-ad-slot=\"3470684978\"></ins>\n");
      out.write("<script>\n");
      out.write("(adsbygoogle = window.adsbygoogle || []).push({});\n");
      out.write("</script>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write(" \n");
      out.write(" <script type=\"text/javascript\" src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("  <!--materialize js-->\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/js/materialize.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n");
      out.write("  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n");
      out.write("  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n");
      out.write("  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n");
      out.write("\n");
      out.write("  ga('create', 'UA-27820211-3', 'auto');\n");
      out.write("  ga('send', 'pageview');\n");
      out.write("\n");
      out.write("</script><script src=\"//load.sumome.com/\" data-sumo-site-id=\"1cf2c3d548b156a57050bff06ee37284c67d0884b086bebd8e957ca1c34e99a1\" async=\"async\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("   <footer class=\"page-footer\">\n");
      out.write("          <div class=\"footer-copyright\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("            © 2018 Open Ads Network\n");
      out.write("         \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
