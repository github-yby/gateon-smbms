/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-17 11:40:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("<head lang=\"en\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>系统登录 - 超市账单管理系统</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"login_bg\">\r\n");
      out.write("    <section class=\"loginBox\">\r\n");
      out.write("        <header class=\"loginHeader\">\r\n");
      out.write("            <h1>超市账单管理系统</h1>\r\n");
      out.write("        </header>\r\n");
      out.write("        <section class=\"loginCont\">\r\n");
      out.write("            <form class=\"loginForm\" >\r\n");
      out.write("                <div class=\"inputbox\">\r\n");
      out.write("                    <label for=\"user\">用户名：</label>\r\n");
      out.write("                    <input id=\"user\" type=\"text\" name=\"userCode\" placeholder=\"请输入用户名\" required/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"inputbox\">\r\n");
      out.write("                    <label for=\"mima\">密码：</label>\r\n");
      out.write("                    <input id=\"mima\" type=\"password\" name=\"userPassword\" placeholder=\"请输入密码\" required/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"subBtn\">\r\n");
      out.write("                    <input type=\"button\" id=\"btnLogin\" value=\"登录\" />\r\n");
      out.write("                    <input type=\"reset\" value=\"重置\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </section>\r\n");
      out.write("    </section>\r\n");
      out.write("    <script src=\"/js/jquery.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\"#btnLogin\").click(function () {\r\n");
      out.write("                var data = $(\".loginForm\").serialize();\r\n");
      out.write("                $.post(\"/user/login\",data,function (result) {\r\n");
      out.write("                    if(result == \"true\"){\r\n");
      out.write("                        location.href=\"/welcome\";\r\n");
      out.write("                    }else{\r\n");
      out.write("                        alert(\"用户名或密码有误，请重新输入\");\r\n");
      out.write("                    }\r\n");
      out.write("                },\"text\");\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
