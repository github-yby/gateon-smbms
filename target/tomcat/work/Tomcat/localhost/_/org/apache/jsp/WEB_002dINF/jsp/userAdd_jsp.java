/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-18 12:27:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head lang=\"en\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>超市账单管理系统</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/public.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/style.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--头部-->\r\n");
      out.write("<header class=\"publicHeader\">\r\n");
      out.write("    <h1>超市账单管理系统</h1>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"publicHeaderR\">\r\n");
      out.write("        <p><span>下午好！</span><span style=\"color: #fff21b\"> Admin</span> , 欢迎你！</p>\r\n");
      out.write("        <a href=\"login.html\">退出</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("<!--时间-->\r\n");
      out.write("<section class=\"publicTime\">\r\n");
      out.write("    <span id=\"time\">2015年1月1日 11:11  星期一</span>\r\n");
      out.write("    <a href=\"#\">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>\r\n");
      out.write("</section>\r\n");
      out.write("<!--主体内容-->\r\n");
      out.write("<section class=\"publicMian \">\r\n");
      out.write("    <div class=\"left\">\r\n");
      out.write("        <h2 class=\"leftH2\"><span class=\"span1\"></span>功能列表 <span></span></h2>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul class=\"list\">\r\n");
      out.write("                <li><a href=\"/bill/list\">账单管理</a></li>\r\n");
      out.write("                <li ><a href=\"/provider/list\">供应商管理</a></li>\r\n");
      out.write("                <li id=\"active\"><a href=\"/user/list\">用户管理</a></li>\r\n");
      out.write("                <li><a href=\"password.html\">密码修改</a></li>\r\n");
      out.write("                <li><a href=\"/user/login\">退出系统</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"right\">\r\n");
      out.write("        <div class=\"location\">\r\n");
      out.write("            <strong>你现在所在的位置是:</strong>\r\n");
      out.write("            <span>用户管理页面 >> 用户添加页面</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"providerAdd\">\r\n");
      out.write("            <form id=\"userForm\">\r\n");
      out.write("                <!--div的class 为error是验证错误，ok是验证成功-->\r\n");
      out.write("                <div class=\"\">\r\n");
      out.write("                    <label for=\"userId\">用户编码：</label>\r\n");
      out.write("                    <input type=\"text\" name=\"userCode\" id=\"userId\"/>\r\n");
      out.write("                    <span>*请输入用户编码，且不能重复</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label for=\"userName\">用户名称：</label>\r\n");
      out.write("                    <input type=\"text\" name=\"userName\" id=\"userName\"/>\r\n");
      out.write("                    <span >*请输入用户名称</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label for=\"userpassword\">用户密码：</label>\r\n");
      out.write("                    <input type=\"text\" name=\"userPassword\" id=\"userpassword\"/>\r\n");
      out.write("                    <span>*密码长度必须大于6位小于20位</span>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label for=\"userRemi\">确认密码：</label>\r\n");
      out.write("                    <input type=\"text\" name=\"userPassword1\" id=\"userRemi\"/>\r\n");
      out.write("                    <span>*请输入确认密码</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label >用户性别：</label>\r\n");
      out.write("\r\n");
      out.write("                    <select name=\"gender\">\r\n");
      out.write("                        <option value=\"1\">男</option>\r\n");
      out.write("                        <option value=\"2\">女</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <span></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label for=\"data\">出生日期：</label>\r\n");
      out.write("                    <input type=\"date\" name=\"birthday\" id=\"data\"/>\r\n");
      out.write("                    <span >*</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label for=\"userphone\">用户电话：</label>\r\n");
      out.write("                    <input type=\"text\" name=\"phone\" id=\"userphone\"/>\r\n");
      out.write("                    <span >*</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label for=\"userAddress\">用户地址：</label>\r\n");
      out.write("                    <input type=\"text\" name=\"address\" id=\"userAddress\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label >用户类别：</label>\r\n");
      out.write("                    <input type=\"radio\" value=\"1\" name=\"userRole\"/>管理员\r\n");
      out.write("                    <input type=\"radio\" value=\"2\" name=\"userRole\"/>经理\r\n");
      out.write("                    <input type=\"radio\" value=\"3\" name=\"userRole\"/>普通用户\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"providerAddBtn\">\r\n");
      out.write("                    <!--<a href=\"#\">保存</a>-->\r\n");
      out.write("                    <!--<a href=\"userList.html\">返回</a>-->\r\n");
      out.write("                    <input type=\"button\" class=\"userbtn\" value=\"保存\" />\r\n");
      out.write("                    <input type=\"button\" value=\"返回\" onclick=\"history.back(-1)\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("<footer class=\"footer\">\r\n");
      out.write("    版权归0916\r\n");
      out.write("</footer>\r\n");
      out.write("<script src=\"/js/time.js\"></script>\r\n");
      out.write("<script src=\"/js/jquery.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\".userbtn\").click(function () {\r\n");
      out.write("                var data = $(\"#userForm\").serialize();\r\n");
      out.write("                console.log(data)\r\n");
      out.write("                $.post(\"/user/save\",data,function (result) {\r\n");
      out.write("                    if(result == \"true\"){\r\n");
      out.write("                        location.href=\"/user/list\";\r\n");
      out.write("                    }else{\r\n");
      out.write("                        alert(\"添加失败\");\r\n");
      out.write("                    }\r\n");
      out.write("                },\"text\");\r\n");
      out.write("            })\r\n");
      out.write("        })\r\n");
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
