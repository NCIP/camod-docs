package org.apache.jsp.webtree;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WebTreeLoader_jsp extends org.apache.jasper.runtime.HttpJspBase
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


  	// get parameters
    String treeParams     = (String) request.getParameter("treeParams");

    // URL encode parameters
    if (treeParams != null) treeParams = java.net.URLEncoder.encode(treeParams);    
    

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language=\"JavaScript1.2\">\r\n");
      out.write("  var now = new Date();\r\n");
      out.write("  var glob = now.getHours()+now.getSeconds()+now.getMilliseconds();\r\n");
      out.write("  window.document.write(\"<br>Building tree, please wait...<br> <br>\");  \r\n");
      out.write("  var targetURL = \"WebTree.jsp?&treeParams=");
      out.print(treeParams);
      out.write("&skin=evsMOD&glob=\"+glob;\r\n");
      out.write("  window.location.href = targetURL;     \r\n");
      out.write("</script>\r\n");
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
