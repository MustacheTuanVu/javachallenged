/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-07 09:14:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/template/script.jsp", Long.valueOf(1538824810855L));
    _jspx_dependants.put("/lab1/page/page-home.jsp", Long.valueOf(1538903663198L));
    _jspx_dependants.put("/template/navigation.jsp", Long.valueOf(1538902713056L));
    _jspx_dependants.put("/template/head.jsp", Long.valueOf(1538902716593L));
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
      out.write("<title>JAVACHALLENGE v1.0.1</title>\r\n");
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
      out.write("\t<div id=\"wrapper\">\r\n");
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
      out.write("\t\t<a class=\"navbar-brand\" href=\"/javachallenged/home?account=guest\">JAVACHALLENGE\r\n");
      out.write("\t\t\tv1.0.1</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"navbar-default sidebar\" role=\"navigation\">\r\n");
      out.write("\t\t<div class=\"sidebar-nav navbar-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("\t\t\t\t<li><a href=\"/javachallenged/home?account=guest\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-dashboard fa-fw\"></i> TỔNG QUAN</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/javachallenged/lab1/list/uploadheroku.jsp\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-upload fa-fw\"></i> Upload java web lên heroku</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-graduation-cap  fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\tBeginner Servlet/JSP<span class=\"fa arrow\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-second-level\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/javachallenged/hello\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-console\"></i> HelloServlet</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/javachallenged/initParam\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-console\"></i> InitParamServlet</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/javachallenged/annExample\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-console\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\tAnnotationExampleServlet1</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/javachallenged/annotationExample\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-console\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\tAnnotationExampleServlet2</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/javachallenged/any/*\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-console\"></i> AsteriskServlet</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/javachallenged/forwardDemo\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-console\"></i> ForwardDemoServlet</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/javachallenged/redirectDemo\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-console\"></i> RedirectDemoServlet</a></li>\r\n");
      out.write("\t\t\t\t\t</ul> <!-- /.nav-second-level --></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/javachallenged/lab1/list/idea.jsp\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-coffee fa-fw\"></i> Ý tưởng/Feature</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/javachallenged/lab1/list/release.jsp\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-coffee fa-fw\"></i> Relase</a></li>\r\n");
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
      out.write("\t\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t<h1 class=\"page-header\">Dashboard</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.col-lg-12 -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.row -->\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\t<div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("\t\t<div class=\"panel panel-primary\">\r\n");
      out.write("\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-3\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-book fa-5x\"></i>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-9 text-right\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"huge\">8</div>\r\n");
      out.write("\t\t\t\t\t\t<div>Bài học mới</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("\t\t<div class=\"panel panel-green\">\r\n");
      out.write("\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-3\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-pencil fa-5x\"></i>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-9 text-right\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"huge\">0</div>\r\n");
      out.write("\t\t\t\t\t\t<div>Bài tập mới</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("\t\t<div class=\"panel panel-yellow\">\r\n");
      out.write("\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-3\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-coffee fa-5x\"></i>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-9 text-right\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"huge\">4</div>\r\n");
      out.write("\t\t\t\t\t\t<div>Ý tưởng mới</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.row -->\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\t<div class=\"col-lg-8\">\r\n");
      out.write("\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-clock-o fa-fw\"></i> Nhật ký vọc vạch\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.panel-heading -->\r\n");
      out.write("\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t<ul class=\"timeline\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"timeline-badge\" style=\"background-color: green;\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-check\"></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"timeline-panel\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"timeline-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"timeline-title\">UP JSP ĐƠN GIẢN LÊN HEROKU</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<small class=\"text-muted\"><i class=\"fa fa-clock-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tngày 04 tháng 09 năm 2018</small>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"timeline-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Đây là ngày đầu tiên chuyên mục java của tuanvumustache.com ra đời.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Cũng ngày đầu tiên sử dụng kho github của bản thân một cách nghiêm túc.</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"timeline-inverted\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"timeline-badge\" style=\"background-color: green;\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-check\"></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"timeline-panel\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"timeline-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"timeline-title\">Update giao diện</h4>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<small class=\"text-muted\"><i class=\"fa fa-clock-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tngày 06 tháng 09 năm 2018</small>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"timeline-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Tiến hành update từ template sb admin v2.</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"timeline-badge\" style=\"background-color: green;\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-check\"></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"timeline-panel\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"timeline-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"timeline-title\">Thực hành với servlet căn bản</h4>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<small class=\"text-muted\"><i class=\"fa fa-clock-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tngày 07 tháng 09 năm 2018</small>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"timeline-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Các phần đã thực hành tốt bao gồm: Hello Servlet, Init Param Servlet, Annotation Servlet, Url Pattern Servlet, FORWARD Servlet, REDIRECT Servlet.</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.panel-body -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.panel -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.col-lg-8 -->\r\n");
      out.write("\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-gears fa-fw\"></i> Thông tin hệ thống\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.panel-heading -->\r\n");
      out.write("\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t<div class=\"list-group\">\r\n");
      out.write("\t\t\t\t\t");
 String requestURL = (String) request.getAttribute("requestURL"); 
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                        <i class=\"fa fa-gear fa-fw\"></i> requestURL: <br>");
      out.print(requestURL);
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t\t");
 String requestURI = (String) request.getAttribute("requestURI"); 
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                        <i class=\"fa fa-gear fa-fw\"></i> requestURI: <br>");
      out.print(requestURI);
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 String contextPath = (String) request.getAttribute("contextPath"); 
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                        <i class=\"fa fa-gear fa-fw\"></i> contextPath: <br>");
      out.print(contextPath);
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 String servletPath = (String) request.getAttribute("servletPath"); 
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                        <i class=\"fa fa-gear fa-fw\"></i> servletPath: <br>");
      out.print(servletPath);
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 String queryString = (String) request.getAttribute("queryString"); 
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                        <i class=\"fa fa-gear fa-fw\"></i> queryString: <br>");
      out.print(queryString);
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 String param1 = (String) request.getAttribute("param1"); 
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                        <i class=\"fa fa-gear fa-fw\"></i> User: <br>");
      out.print(param1);
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 String serverName = (String) request.getAttribute("serverName"); 
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                        <i class=\"fa fa-gear fa-fw\"></i> serverName: <br>");
      out.print(serverName);
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 String serverPort = (String) request.getAttribute("serverPort"); 
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                        <i class=\"fa fa-gear fa-fw\"></i> serverPort: <br>");
      out.print(serverPort);
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 String remoteAddr = (String) request.getAttribute("remoteAddr"); 
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                        <i class=\"fa fa-gear fa-fw\"></i> remoteAddr: <br>");
      out.print(remoteAddr);
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 String remoteHost = (String) request.getAttribute("remoteHost"); 
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                        <i class=\"fa fa-gear fa-fw\"></i> remoteHost: <br>");
      out.print(remoteHost);
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 String remotePort = (String) request.getAttribute("remotePort"); 
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                        <i class=\"fa fa-gear fa-fw\"></i> remotePort: <br>");
      out.print(remotePort);
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 String remoteUser = (String) request.getAttribute("remoteUser"); 
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                        <i class=\"fa fa-gear fa-fw\"></i> remoteUser: <br>");
      out.print(remoteUser);
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
  Enumeration<String> headers =  (Enumeration) request.getAttribute("headers"); 
      out.write("\r\n");
      out.write("                    ");
  
                    while (headers.hasMoreElements()) {
                        String header = headers.nextElement();
      out.write("\r\n");
      out.write("                    \t<a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                        \t<i class=\"fa fa-gear fa-fw\"></i> ");
      out.print(header);
      out.write(": <br>");
      out.print(request.getHeader(header));
      out.write("\r\n");
      out.write("                    \t</a>    \r\n");
      out.write("                    ");
 }
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                     ");
 String realPath = (String) request.getAttribute("realPath"); 
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                        <i class=\"fa fa-gear fa-fw\"></i> realPath: <br>");
      out.print(realPath);
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.panel-body -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.panel -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.col-lg-4 -->\r\n");
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
