package org.apache.jsp.webtree;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SearchTree_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"skins/evsMOD/SearchTree.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table>\r\n");
      out.write("      <form name=\"search\" action=\"SearchResults.jsp?skin=evsMOD\" method=\"post\" target=\"searchResults\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>\r\n");
      out.write("            <table>\r\n");
      out.write("       \r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>Search:</td>\r\n");
      out.write("                <td><input name=\"searchTerm\" size=\"25\"/>&nbsp;\r\n");
      out.write("                <a href=\"javascript:document.forms['search'].submit()\"><img border=\"0\" src=\"skins/evsMOD/images/searchButton.gif\"/></a>                \r\n");
      out.write("                <!--<INPUT type=\"submit\" name=\"search\" value=\"Search\"/>-->\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>              \r\n");
      out.write("                <td>&nbsp;</td> \r\n");
      out.write("                <td>\r\n");
      out.write("                  <INPUT type=\"checkbox\" name=\"matchwholewords\" unchecked/>&nbsp;Match Entire Search Terms Only\r\n");
      out.write("                </td>                   \r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </form>  \r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
