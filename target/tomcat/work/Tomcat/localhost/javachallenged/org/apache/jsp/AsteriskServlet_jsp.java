/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-07 07:56:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AsteriskServlet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/template/script.jsp", Long.valueOf(1538824810855L));
    _jspx_dependants.put("/template/navigation.jsp", Long.valueOf(1538898640555L));
    _jspx_dependants.put("/template/page-asteriskservlet.jsp", Long.valueOf(1538898991394L));
    _jspx_dependants.put("/template/head.jsp", Long.valueOf(1538824766698L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<title>SB Admin 2 - Bootstrap Admin Theme</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap Core CSS -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"/javachallenged/resources/vendor/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- MetisMenu CSS -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"/javachallenged/resources/vendor/metisMenu/metisMenu.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<link href=\"/javachallenged/resources/dist/css/sb-admin-2.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Morris Charts CSS -->\r\n");
      out.write("<link href=\"/javachallenged/resources/vendor/morrisjs/morris.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom Fonts -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"/javachallenged/resources/vendor/font-awesome/css/font-awesome.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Navigation -->\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\"\r\n");
      out.write("\tstyle=\"margin-bottom: 0\">\r\n");
      out.write("\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\".navbar-collapse\">\r\n");
      out.write("\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"/javachallenged/home?account=guest\">JAVACHALLENGE v2.0.0</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"navbar-default sidebar\" role=\"navigation\">\r\n");
      out.write("\t\t<div class=\"sidebar-nav navbar-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("\t\t\t\t<li><a href=\"/javachallenged/home?account=guest\"><i class=\"fa fa-dashboard fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\tTỔNG QUAN</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"uploadheroku.jsp\"><i class=\"fa fa-upload fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\tUpload java web lên heroku</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-graduation-cap  fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\tBeginner Servlet/JSP<span class=\"fa arrow\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-second-level\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/javachallenged/hello\"><i class=\"glyphicon glyphicon-console\"></i> HelloServlet</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/javachallenged/initParam\"><i class=\"glyphicon glyphicon-console\"></i> InitParamServlet</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/javachallenged/annExample\"><i class=\"glyphicon glyphicon-console\"></i> AnnotationExampleServlet1</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/javachallenged/annotationExample\"><i class=\"glyphicon glyphicon-console\"></i> AnnotationExampleServlet2</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/javachallenged/any/*\"><i class=\"glyphicon glyphicon-console\"></i> AsteriskServlet</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/javachallenged/forwardDemo\"><i class=\"glyphicon glyphicon-console\"></i> ForwardDemoServlet</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/javachallenged/redirectDemo\"><i class=\"glyphicon glyphicon-console\"></i> RedirectDemoServlet</a></li>\r\n");
      out.write("\t\t\t\t\t</ul> <!-- /.nav-second-level --></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.sidebar-collapse -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.navbar-static-side -->\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"page-wrapper\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t<h1 class=\"page-header\">Url Pattern</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.col-lg-12 -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.row -->\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t<div class=\"panel-heading\">Asterisk</div>\r\n");
      out.write("\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t<p>Hi, your URL match /any/*</p>\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.row (nested) -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.panel-body -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.panel -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.col-lg-12 -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.row -->");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /#page-wrapper -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /#wrapper -->\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("\t<script src=\"/javachallenged/resources/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"/javachallenged/resources/vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Metis Menu Plugin JavaScript -->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"/javachallenged/resources/vendor/metisMenu/metisMenu.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Morris Charts JavaScript -->\r\n");
      out.write("\t<script src=\"/javachallenged/resources/vendor/raphael/raphael.min.js\"></script>\r\n");
      out.write("\t<script src=\"/javachallenged/resources/vendor/morrisjs/morris.min.js\"></script>\r\n");
      out.write("\t<script src=\"/javachallenged/resources/data/morris-data.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Custom Theme JavaScript -->\r\n");
      out.write("\t<script src=\"/javachallenged/resources/dist/js/sb-admin-2.js\"></script>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
