package org.apache.jsp.webtree;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WebTreeMain_jsp extends org.apache.jasper.runtime.HttpJspBase
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


System.setProperty("log4j.configuration", "../WEB-INF/conf/log4j.properties");

	// skin parameter hard-coded in all jsp to pass security scan
	// Must find another way to toggle skins - keep parameter out of jsp pages
    String treeParams     = (String) request.getParameter("treeParams");
    String windowTitle    = (String) request.getParameter("windowTitle");
    
    if (windowTitle != null && windowTitle.equals("null")) windowTitle = null;
    if (windowTitle == null) windowTitle = "WebTree Navigator v1.2";

    // URL encode parameters

    if (treeParams != null) treeParams = java.net.URLEncoder.encode(treeParams);    


      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<script language=\"JavaScript1.2\" src=\"skins/evsMOD/JavaScript.js\"></script>\r\n");
      out.write("<HEAD> \r\n");
      out.write("<TITLE>");
      out.print(windowTitle);
      out.write("</TITLE>\r\n");
      out.write("<META http-equiv=\"Content-Type\" content=\"text/html;\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("<frameset rows=\"126,*\" framespacing=\"0\" frameborder=\"0\" name=\"master\">\r\n");
      out.write("  <frame src=\"skins/evsMOD/TopHeader.html\" name=\"headerFrame\" frameborder=\"no\" scrolling=\"no\" noresize marginwidth=\"0\" marginheight=\"0\" id=\"headerFrame\">\r\n");
      out.write("  <frameset rows=\"*\" cols=\"400,*\" framespacing=\"0\" frameborder=\"NO\" border=\"0\">\r\n");
      out.write("    <frameset rows=\"52,*\" framespacing=\"0\" frameborder=\"no\" border=\"0\">\r\n");
      out.write("      <frame src=\"skins/evsMOD/SearchHeader.html\" name=\"searchHeader\" scrolling=\"NO\" noresize id=\"searchHeader\" >\r\n");
      out.write("      <frameset rows=\"100,*\" cols=\"*\" framespacing=\"0\" frameborder=\"no\" border=\"0\">\r\n");
      out.write("        <frameset rows=\"3,*\" framespacing=\"0\" frameborder=\"no\" border=\"0\">\r\n");
      out.write("          <frame src=\"DividerFrame.jsp?skin=evsMOD\" name=\"divider1\" scrolling=\"NO\" noresize>\r\n");
      out.write("          <frameset rows=\"*,3\" cols=\"*\" framespacing=\"0\" frameborder=\"NO\" border=\"0\">\r\n");
      out.write("            <frame src=\"SearchTree.jsp?skin=evsMOD\" name=\"searchInput\" frameborder=\"no\" scrolling=\"no\" marginwidth=\"10\" marginheight=\"10\" id=\"searchContent\">\r\n");
      out.write("            <frame src=\"DividerFrame.jsp?skin=evsMOD\" name=\"divider2\" scrolling=\"NO\" noresize>\r\n");
      out.write("          </frameset>\r\n");
      out.write("        </frameset>\r\n");
      out.write("        <frameset rows=\"52,*\" cols=\"*\" framespacing=\"0\" frameborder=\"no\" border=\"0\">\r\n");
      out.write("          <frame src=\"skins/evsMOD/ResultsHeader.html\" name=\"resultsHeader\" frameborder=\"no\" scrolling=\"NO\" noresize marginwidth=\"0\" id=\"resultsHeader\" >\r\n");
      out.write("          <frameset rows=\"3,*\" cols=\"*\" framespacing=\"0\" frameborder=\"NO\" border=\"0\">\r\n");
      out.write("            <frame src=\"DividerFrame.jsp?skin=evsMOD\" name=\"divider3\" scrolling=\"NO\" noresize>\r\n");
      out.write("            <frame src=\"SearchResults.jsp?skin=evsMOD\" name=\"searchResults\" frameborder=\"no\" marginwidth=\"15\" marginheight=\"10\" id=\"resultsContent\">\r\n");
      out.write("          </frameset>\r\n");
      out.write("        </frameset>\r\n");
      out.write("      </frameset>\r\n");
      out.write("    </frameset>\r\n");
      out.write("    <frameset rows=\"*\" cols=\"3,*\" framespacing=\"0\" frameborder=\"no\" border=\"0\">\r\n");
      out.write("      <frame src=\"DividerFrame.jsp?skin=evsMOD\" name=\"divider4\" scrolling=\"NO\" noresize>\r\n");
      out.write("      <frameset rows=\"52,*\" frameborder=\"NO\" border=\"0\" framespacing=\"0\">\r\n");
      out.write("        <frame src=\"skins/evsMOD/TreeBrowserHeader.html\" name=\"treeHeader\" scrolling=\"NO\" noresize id=\"treeHeader\" >\r\n");
      out.write("        <frameset rows=\"3,*\" frameborder=\"NO\" border=\"0\" framespacing=\"0\">\r\n");
      out.write("          <frame src=\"DividerFrame.jsp?skin=evsMOD\" name=\"divider5\" scrolling=\"NO\" noresize>\r\n");
      out.write("          <frame src=\"WebTreeLoader.jsp?treeParams=");
      out.print(treeParams);
      out.write("&skin=evsMOD\" name=\"tree\" frameborder=\"no\" marginwidth=\"20\" marginheight=\"10\" id=\"treeContent\">\r\n");
      out.write("        </frameset>\r\n");
      out.write("      </frameset>\r\n");
      out.write("    </frameset>\r\n");
      out.write("  </frameset>\r\n");
      out.write("</frameset>\r\n");
      out.write("<noframes><body>\r\n");
      out.write("To view this page, your browser must be set to accept FRAMES. Please modify your browser settings.\r\n");
      out.write("</body></noframes>    \r\n");
      out.write("\r\n");
      out.write("</HTML>\r\n");
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
