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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Create a new Table!</h1> \n");
      out.write("        <br>\n");
      out.write("        <label> Tablename </label>\n");
      out.write("        <br>\n");
      out.write("        <input type=\"text\" name=\"table_name\" value=\"\" id=\"table_name\"/>\n");
      out.write("        <br>\n");
      out.write("        <label> How many fields </label>\n");
      out.write("        <br>\n");
      out.write("        <input type=\"text\" name=\"number_fields\" value=\"\" id=\"number_fields\"/>\n");
      out.write("        <label> Field name </label>\n");
      out.write("        <br>\n");
      out.write("        <input type=\"text\" name=\"field_name\" value=\"\" id=\"field_name\"/>\n");
      out.write("        <label> type </label>\n");
      out.write("        <select name=\"type\" id = \"type\">\n");
      out.write("            <option>boolean</option>\n");
      out.write("            <option>varchar</option>\n");
      out.write("            <option>integer</option>\n");
      out.write("            <option>double</option>\n");
      out.write("            <option>char</option>\n");
      out.write("        </select>\n");
      out.write("        <br>\n");
      out.write("        <label> Characteristics </label>\n");
      out.write("        <input type=\"checkbox\" name=\"Primary Key\" value=\"\" id =\"primary_key\" />\n");
      out.write("        <input type=\"checkbox\" name=\"Unique\" value=\"\" id =\"unique\"/>\n");
      out.write("        <input type=\"checkbox\" name=\"Not null\" value=\"\" id =\"not_null\"/>\n");
      out.write("        <br>\n");
      out.write("        <input type=\"submit\" value=\"add file\" id=\"field_name\" />\n");
      out.write("        <input type=\"submit\" value=\"remove  field\" id=\"remove_value\" />\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            var tablaElementos = document.getElementById('table');\n");
      out.write("            var txtField_name = document.getElementById('field_name');\n");
      out.write("            var number_fields = document.getElementById('number_fields');\n");
      out.write("            var ddlType = document.getElementById('type');\n");
      out.write("            var btnAdd = document.getElementById('add_value');\n");
      out.write("            var btnRm = document.getElementById('remove_value');\n");
      out.write("            var primary_key = document.getElementById('primary_key');\n");
      out.write("            var unique = document.getElementById('unique');\n");
      out.write("            var not_null = document.getElementById('not_null');\n");
      out.write("            var datos = [];\n");
      out.write("          \n");
      out.write("    \n");
      out.write("             function btnAdd_Click(event) {\n");
      out.write("                 \n");
      out.write(" /*               var field_name= txtField_name.value || '';\n");
      out.write("                var type = ddlType.value || '';\n");
      out.write("                 \n");
      out.write("                 if (!field_name || !field_name.trim().length) {\n");
      out.write("                alert('El campo debe tener un nombre');\n");
      out.write("                return;\n");
      out.write("                \n");
      out.write("                 txtField_name.value = '';\n");
      out.write("                 txtField_name.focus();\n");
      out.write("                 \n");
      out.write("                var item = {\n");
      out.write("                field_name: field_name.trim(),\n");
      out.write("                type: type,\n");
      out.write("                primary_key: primary_key.\n");
      out.write("                 };\n");
      out.write("\n");
      out.write("            datos.push(item);*/\n");
      out.write("                \n");
      out.write("    }\n");
      out.write("\n");
      out.write("}  \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
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
