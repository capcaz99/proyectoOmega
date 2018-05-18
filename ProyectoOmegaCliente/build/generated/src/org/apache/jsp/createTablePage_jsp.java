package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createTablePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Create a new Table!</h1> \r\n");
      out.write("        <br>\r\n");
      out.write("        <label> Tablename </label>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"text\" name=\"table_name\" value=\"\" id=\"table_name\"/>\r\n");
      out.write("        <br>\r\n");
      out.write("        <label> How many fields </label>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"text\" name=\"number_fields\" value=\"\" id=\"number_fields\"/>\r\n");
      out.write("        <br>\r\n");
      out.write("        <label> Field name </label>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"text\" name=\"field_name\" value=\"\" id=\"field_name\"/>\r\n");
      out.write("        <br>\r\n");
      out.write("        <label> type </label>\r\n");
      out.write("        <select name=\"type\" id = \"type\" onclick=\"show_varchar_opt()\">\r\n");
      out.write("            <option>boolean</option>\r\n");
      out.write("            <option>varchar</option>\r\n");
      out.write("            <option>integer</option>\r\n");
      out.write("            <option>double</option>\r\n");
      out.write("            <option>char</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        <br>\r\n");
      out.write("        <label id=\"varchar_length_lbl\"> varchar length </label>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"text\" name=\"varchar_length\" value=\"\" id =\"varchar_length\" />\r\n");
      out.write("        <br>\r\n");
      out.write("        <label> Characteristics </label>\r\n");
      out.write("        <input type=\"checkbox\" name=\"Primary Key\" value=\"\" id =\"primary_key\" />\r\n");
      out.write("        <input type=\"checkbox\" name=\"Unique\" value=\"\" id =\"unique\"/>\r\n");
      out.write("        <input type=\"checkbox\" name=\"Not null\" value=\"\" id =\"not_null\"/>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"submit\" value=\"remove  field\" id=\"remove_value\" />\r\n");
      out.write("        <input type=\"submit\" value=\"add file\" id=\"field_name_btn\" onclick =\"btnAddField_Click()\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("\r\n");
      out.write("            document.getElementById(\"varchar_length\").style.visibility = \"hidden\";\r\n");
      out.write("            document.getElementById(\"varchar_length_lbl\").style.visibility = \"hidden\";\r\n");
      out.write("            \r\n");
      out.write("            function unique_Click(){\r\n");
      out.write("            if (document.getElementById(\"unique\").checked === true){\r\n");
      out.write("            return (\"-u\");\r\n");
      out.write("            }\r\n");
      out.write("            else\r\n");
      out.write("                    return (\"--\");\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            function not_null_Click(){\r\n");
      out.write("            if (document.getElementById(\"not_null\").checked === true){\r\n");
      out.write("            return (unique_Click().toString() + \"n\");\r\n");
      out.write("            }\r\n");
      out.write("            else\r\n");
      out.write("                    return (unique_Click().toString() + \"-\");\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function all_charact(){\r\n");
      out.write("            if (document.getElementById(\"primary_key\").checked === true)\r\n");
      out.write("                    return (\"p--\");\r\n");
      out.write("            else\r\n");
      out.write("                    return not_null_Click().toString();\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            function show_varchar_opt(){\r\n");
      out.write("            if(document.getElementById(\"type\").value === \"varchar\"){\r\n");
      out.write("                document.getElementById(\"varchar_length\").style.visibility = \"visible\";\r\n");
      out.write("                document.getElementById(\"varchar_length_lbl\").style.visibility = \"visible\";\r\n");
      out.write("            }\r\n");
      out.write("            else{\r\n");
      out.write("                document.getElementById(\"varchar_length\").style.visibility = \"hidden\";\r\n");
      out.write("                document.getElementById(\"varchar_length_lbl\").style.visibility = \"hidden\";                \r\n");
      out.write("            }  \r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            function type_varch(){\r\n");
      out.write("            length = Number(document.getElementById(\"varchar_length\").value.toString());\r\n");
      out.write("            if (length !== 0)\r\n");
      out.write("            return all_charact().toString()+length;\r\n");
      out.write("             else\r\n");
      out.write("            return all_charact().toString();\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("          /*  function charact_final(){\r\n");
      out.write("                fin = type_varch().toString();\r\n");
      out.write("                if (if Number(fin.indexOf(fin.length()-1))===0){\r\n");
      out.write("                    return all_charact().toString(); \r\n");
      out.write("                }\r\n");
      out.write("                else\r\n");
      out.write("                    return type_varch().toString();\r\n");
      out.write("            }*/\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            function btnAddField_Click() {\r\n");
      out.write("            document.getElementById('field_name_rdy').innerHTML = document.getElementById('field_name').value;\r\n");
      out.write("            document.getElementById('charact_key_rdy').innerHTML = type_varch().toString();\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("        <br>\r\n");
      out.write("        <label id = \"field_name_rdy\">  </label>\r\n");
      out.write("        <label id = \"type_rdy\">  </label>\r\n");
      out.write("        <label id = \"charact_key_rdy\"> </label>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
