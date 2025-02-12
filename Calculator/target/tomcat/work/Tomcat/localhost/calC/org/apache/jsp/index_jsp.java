/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2025-01-23 11:31:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Simple Calculator</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background: linear-gradient(to right, #ff7e5f, #feb47b);\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            margin: 0;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        input, select, button {\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 5px 0; /* Adjusted margin for vertical spacing */\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            width: 100%; /* Set width to 100% for full width */\n");
      out.write("        }\n");
      out.write("        input[type=\"number\"] {\n");
      out.write("            /* Removed specific width to allow full width */\n");
      out.write("        }\n");
      out.write("        select {\n");
      out.write("            /* Removed specific width to allow full width */\n");
      out.write("        }\n");
      out.write("        button {\n");
      out.write("            background-color: #ff6f61;\n");
      out.write("            color: white;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: background-color 0.3s, transform 0.2s;\n");
      out.write("        }\n");
      out.write("        button:hover {\n");
      out.write("            background-color: #ff4c3b;\n");
      out.write("            transform: scale(1.05);\n");
      out.write("        }\n");
      out.write("        #result {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            font-size: 20px;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            background-color: rgba(255, 255, 255, 0.2);\n");
      out.write("            color: #fff;\n");
      out.write("            border: 1px solid #fff;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .highlight {\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 24px;\n");
      out.write("            color: #ffeb3b; /* Highlight color for the answer */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        function calculate() {\n");
      out.write("            var num1 = parseFloat(document.getElementById(\"num1\").value);\n");
      out.write("            var num2 = parseFloat(document.getElementById(\"num2\").value);\n");
      out.write("            var operator = document.getElementById(\"operator\").value;\n");
      out.write("            var result;\n");
      out.write("\n");
      out.write("            switch (operator) {\n");
      out.write("                case '+':\n");
      out.write("                    result = num1 + num2;\n");
      out.write("                    break;\n");
      out.write("                case '-':\n");
      out.write("                    result = num1 - num2;\n");
      out.write("                    break;\n");
      out.write("                case '*':\n");
      out.write("                    result = num1 * num2;\n");
      out.write("                    break;\n");
      out.write("                case '/':\n");
      out.write("                    result = num1 / num2;\n");
      out.write("                    break;\n");
      out.write("                default:\n");
      out.write("                    result = \"Invalid operator\";\n");
      out.write("            }\n");
      out.write("            document.getElementById(\"result\").innerHTML = \"Result: <span class='highlight'>\" + result + \"</span>\";\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div style=\"width: 300px;\"> <!-- Set a fixed width for the calculator -->\n");
      out.write("        <h2>Simple Calculator</h2>\n");
      out.write("        <input type=\"number\" id=\"num1\" placeholder=\"First Number\">\n");
      out.write("        <input type=\"number\" id=\"num2\" placeholder=\"Second Number\">\n");
      out.write("        <select id=\"operator\">\n");
      out.write("            <option value=\"+\">+</option>\n");
      out.write("            <option value=\"-\">-</option>\n");
      out.write("            <option value=\"*\">*</option>\n");
      out.write("            <option value=\"/\">/</option>\n");
      out.write("        </select>\n");
      out.write("        <button onclick=\"calculate()\">Calculate</button>\n");
      out.write("        <p id=\"result\"></p>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
