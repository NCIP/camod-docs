package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import gov.nih.nci.camod.webapp.util.SidebarUtil;
import gov.nih.nci.camod.Constants;
import java.util.List;
import gov.nih.nci.camod.Constants;

public final class infoDisclaimer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(11);
    _jspx_dependants.add("/jsp/header.jsp");
    _jspx_dependants.add("/common/taglibs.jsp");
    _jspx_dependants.add("/WEB-INF/tld/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/c-1_0.tld");
    _jspx_dependants.add("/WEB-INF/fmt-1_0.tld");
    _jspx_dependants.add("/WEB-INF/sql-1_0.tld");
    _jspx_dependants.add("/WEB-INF/camod.tld");
    _jspx_dependants.add("/WEB-INF/ajaxtags.tld");
    _jspx_dependants.add("/jsp/sidebar.jsp");
    _jspx_dependants.add("/jsp/loginMenu.jsp");
    _jspx_dependants.add("/jsp/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_xhtml_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_styleClass_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_present_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_type_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_styleClass_href;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_xhtml_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_styleClass_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_present_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_type_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_styleClass_href = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_xhtml_nobody.release();
    _jspx_tagPool_html_link_styleClass_action.release();
    _jspx_tagPool_logic_present_name.release();
    _jspx_tagPool_logic_iterate_type_name_id.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_html_link_styleClass_href.release();
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

      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("\t<TITLE>caMOD 2.1</TITLE>\r\n");
      out.write("\t<LINK href=\"/camod/styles/styleSheet.css\" type=text/css rel=stylesheet>\r\n");
      out.write("\t<SCRIPT src=\"/camod/scripts/script.js\" type=text/javascript></SCRIPT>\r\n");
      out.write("\t<SCRIPT src=\"/camod/scripts/TipCode.js\" type=text/javascript></SCRIPT>\t\t\r\n");
      out.write("\t<META content=\"MSHTML 6.00.2800.1491\" name=GENERATOR>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_html_xhtml_0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");
      out.write("<BODY>\r\n");
      out.write("\r\n");
      out.write("<TABLE height=\"100%\" cellSpacing=0 cellPadding=0 width=\"100%\" summary=\"\" border=0> <!-- This table is closed at the end of the footer.jsp -->\r\n");
      out.write("<TBODY>\r\n");
      out.write("<TR><TD>\r\n");
      out.write("\r\n");
      out.write("<!-- nci hdr begins -->\r\n");
      out.write("      <TABLE class=hdrBG cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD align=left width=283 height=37><A\r\n");
      out.write("            href=\"http://www.cancer.gov/\"><IMG height=37\r\n");
      out.write("            alt=\"National Cancer Institute\" src=\"/camod/images/logotype.gif\"\r\n");
      out.write("            width=283 border=0></A>\r\n");
      out.write("\t  </TD>\r\n");
      out.write("          <TD>&nbsp;</TD>\r\n");
      out.write("          <TD align=right width=295 height=37>\r\n");
      out.write("\t  \t<A href=\"http://www.cancer.gov/\"><IMG height=37 \r\n");
      out.write("\t\talt=\"U.S. National Institutes of Health | www.cancer.gov\" \r\n");
      out.write("\t\tsrc=\"/camod/images/tagline.gif\" width=295 border=0></A>\r\n");
      out.write("      \t  </TD>\r\n");
      out.write("      </TR>\r\n");
      out.write("    </TABLE>\r\n");
      out.write("<!-- nci hdr ends -->\r\n");
      out.write("\r\n");
      out.write("</TD></TR>  \r\n");
      out.write("\r\n");
      out.write("<TR><TD vAlign=top height=\"100%\">\r\n");
      out.write("\r\n");
      out.write("<TABLE height=\"100%\" cellSpacing=0 cellPadding=0 summary=\"\" border=0> <!-- This table is ended at the end of the Application footer of the footer.jsp -->\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR><TD colSpan=2 height=50>\r\n");
      out.write("\r\n");
      out.write("<!-- application hdr begins -->\r\n");
      out.write("            <TABLE class=subhdrBG cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD align=left height=50>");
      if (_jspx_meth_html_link_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                 </TD></TR>\r\n");
      out.write("              </TBODY>\r\n");
      out.write("            </TABLE>            \r\n");
      out.write("\t </TD></TR>\r\n");
      out.write("<!-- application hdr ends -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</TD></TR>\r\n");
      out.write("<TR><TD> <!-- This cell is closed at the end of the footer.jsp -->\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');


/**
 * 
 * $Id: infoDisclaimer_jsp.java,v 1.1 2008-07-22 19:39:40 pandyas Exp $
 * 
 * $Log: not supported by cvs2svn $
 * Revision 1.16  2006/10/17 16:08:28  pandyas
 * modified during development of caMOD 2.2 - various
 *
 * Revision 1.15  2006/08/13 18:17:54  pandyas
 * Minor change - added file name (eventually to all Jsps)
 *
 * Revision 1.14  2006/07/31 20:08:12  pandyas
 * Modified page link for Help file:
 * Swapped the new online help generated from ePublisher with the current online help generated from RoboHelp.  From Jill Hadfield
 *
 * Revision 1.13  2006/04/28 19:40:44  schroedn
 * Defect #261
 * Added links to Saved Queries and Query History when user is logged in
 *
 *
 */


      out.write("\r\n");
      out.write("\r\n");
      out.write("<TR><TD height=\"100%\" class=subMenu valign=top width=\"210\">\r\n");
      out.write("<script language=\"JavaScript\" src=\"scripts/global.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("<!-- standard submenu begins -->\r\n");
      out.write("<!-- sidebar.jsp -->\t  \r\n");
      out.write("    <TABLE height=\"100%\" cellSpacing=0 cellPadding=0 width=\"210\" summary=\"\" border=0>\r\n");
      out.write("      <TBODY>   \r\n");
      out.write("      \r\n");
      out.write("<!-- Place Code here to determine the sub-Menu Links -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
 
	    //Get number of saved queries for current logged on user
	    String numSavedQueries = (String) request.getSession().getAttribute(Constants.NUMBEROFSAVEDQUERIES);
	    
		//Get the filename of the current jsp page and display the correct submenu
		String jspName = new File(request.getRealPath(request.getServletPath())).getName();
		
		SidebarUtil sidebar = new SidebarUtil();
		String pageName = sidebar.findSubMenu( request, jspName );
		
		if ( ! pageName.equals("redirect") ) { 
			
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, pageName, out, false);

		} else
			response.sendRedirect( "login.jsp" );
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <TR>\r\n");
      out.write("\t<TD class=subMenuPrimaryTitle height=22>QUICK LINKS <!-- anchor to skip sub menu --><A\r\n");
      out.write("\t  \thref=\"login.jsp\"><IMG\r\n");
      out.write("\t  \theight=1 alt=\"Skip Menu\" src=\"submit_files/shim.gif\" width=1\r\n");
      out.write("\t  \tborder=0></A> </TD></TR>\r\n");
      out.write("    <TR>\r\n");
      out.write("\t<TD class=subMenuSecondaryTitle\r\n");
      out.write("\t\tonmouseover=\"changeMenuStyle(this,'subMenuSecondaryTitleOver'),showCursor()\"\r\n");
      out.write("\t\tonclick=\"document.location.href='#'\"\r\n");
      out.write("\t\tonmouseout=\"changeMenuStyle(this,'subMenuSecondaryTitle'),hideCursor()\"\r\n");
      out.write("\t\theight=20><A class=subMenuSecondary\r\n");
      out.write("\t  \thref=\"http://www.cancer.gov\" target=\"_blank\">NCI HOME</A></TD></TR>\r\n");
      out.write("    <TR>\r\n");
      out.write("\t<TD class=subMenuSecondaryTitle\r\n");
      out.write("\t\tonmouseover=\"changeMenuStyle(this,'subMenuSecondaryTitleOver'),showCursor()\"\r\n");
      out.write("\t\tonclick=\"document.location.href='#'\"\r\n");
      out.write("\t\tonmouseout=\"changeMenuStyle(this,'subMenuSecondaryTitle'),hideCursor()\"\r\n");
      out.write("\t\theight=20><A class=subMenuSecondary\r\n");
      out.write("\t  \thref=\"http://ncicb.nci.nih.gov\" target=\"_blank\">NCICB HOME</A></TD></TR>\r\n");
      out.write("  \t<TR>\r\n");
      out.write("\t<TD class=subMenuSecondaryTitle\r\n");
      out.write("\t\tonmouseover=\"changeMenuStyle(this,'subMenuSecondaryTitleOver'),showCursor()\"\r\n");
      out.write("\t\tonclick=\"document.location.href='#'\"\r\n");
      out.write("\t\tonmouseout=\"changeMenuStyle(this,'subMenuSecondaryTitle'),hideCursor()\"\r\n");
      out.write("\t\theight=20><A class=subMenuSecondary\r\n");
      out.write("\t\thref=\"http://emice.nci.nih.gov\" target=\"_blank\">EMICE WEBSITE</A></TD></TR>\r\n");
      out.write("    <TR>\r\n");
      out.write("\t<TD class=subMenuSecondaryTitle\r\n");
      out.write("\t\t  onmouseover=\"changeMenuStyle(this,'subMenuSecondaryTitleOver'),showCursor()\"\r\n");
      out.write("\t\t  onclick=\"document.location.href='#'\"\r\n");
      out.write("\t\t  onmouseout=\"changeMenuStyle(this,'subMenuSecondaryTitle'),hideCursor()\"\r\n");
      out.write("\t\t  height=20><A class=subMenuSecondary\r\n");
      out.write("\t\t  href=\"http://cancerimages.nci.nih.gov/caIMAGE/index.jsp\" target=\"_blank\">CANCER IMAGES DATABASE</A></TD></TR>\t    \r\n");
      out.write("    <TR>\r\n");
      out.write("\t<TD class=subMenuSecondaryTitle\r\n");
      out.write("\t\tonmouseover=\"changeMenuStyle(this,'subMenuSecondaryTitleOver'),showCursor()\"\r\n");
      out.write("\t\tonclick=\"document.location.href='#'\"\r\n");
      out.write("\t\tonmouseout=\"changeMenuStyle(this,'subMenuSecondaryTitle'),hideCursor()\"\r\n");
      out.write("\t\theight=20><A class=subMenuSecondary\r\n");
      out.write("\t\thref=\"http://ncicb.nci.nih.gov/NCICB/support\" target=\"_blank\">NCICB SUPPORT</A></TD></TR>\r\n");
      out.write("      <TR>\r\n");
      out.write("\t<TD class=subMenuSecondaryTitle\r\n");
      out.write("\t\tonmouseover=\"changeMenuStyle(this,'subMenuSecondaryTitleOver'),showCursor()\"\r\n");
      out.write("\t\tonclick=\"document.location.href='#'\"\r\n");
      out.write("\t\tonmouseout=\"changeMenuStyle(this,'subMenuSecondaryTitle'),hideCursor()\"\r\n");
      out.write("\t\theight=20><A class=subMenuSecondary\r\n");
      out.write("\t\t href=\"javascript:openHelpWindow('WebHelp/!SSL!/index.html')\" >HELP</A></TD></TR>\r\n");
      out.write("\t\t \r\n");
      out.write("\r\n");
      out.write("\t");

	if( session.getAttribute("camod.loggedon.username") != null ) {
		
      out.write("\r\n");
      out.write("\t\t<TR><TD class=\"loggedInBox\" width=\"100%\">Currently logged in as:<br>\r\n");
      out.write("\t\t<TABLE><TR><TD class=\"loggedInBoxBorderless\">\r\n");
      out.write("\t\t     <b>");
      out.print( session.getAttribute("camod.loggedon.username") );
      out.write("</b><br>\r\n");
      out.write("\t\t     ");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_0 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_present_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_present_0.setParent(null);
      _jspx_th_logic_present_0.setName( Constants.CURRENTUSERROLES );
      int _jspx_eval_logic_present_0 = _jspx_th_logic_present_0.doStartTag();
      if (_jspx_eval_logic_present_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t    ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_0);
          _jspx_th_logic_iterate_0.setName( Constants.CURRENTUSERROLES );
          _jspx_th_logic_iterate_0.setId("role");
          _jspx_th_logic_iterate_0.setType("String");
          int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
          if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            String role = null;
            if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_0.doInitBody();
            }
            role = (String) _jspx_page_context.findAttribute("role");
            do {
              out.write("\r\n");
              out.write("\t\t\t        &nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#475b82\"> - ");
              if (_jspx_meth_c_out_0(_jspx_th_logic_iterate_0, _jspx_page_context))
                return;
              out.write("<br>\r\n");
              out.write("\t\t\t    ");
              int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
              role = (String) _jspx_page_context.findAttribute("role");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_0);
          out.write("\r\n");
          out.write("\t\t\t ");
          int evalDoAfterBody = _jspx_th_logic_present_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_present_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_0);
      out.write("\r\n");
      out.write("\t\t     <img src=\"/camod/images/subMenuCircleFilled.gif\" border=\"0\">&nbsp;<a href=\"/camod/AdminUserSettingsPopulateAction.do\">User Settings</a><br>\r\n");
      out.write("\t\t     <img src=\"/camod/images/subMenuCircleFilled.gif\" border=\"0\">&nbsp;<a href=\"/camod/CustomizeSearchResultsPopulateAction.do\">Customize Results</a><br>\r\n");
      out.write("\t\t\t <img src=\"/camod/images/subMenuCircleFilled.gif\" border=\"0\">&nbsp;<a href=\"/camod/ReturnUserSavedQueries.do?method=returnSavedUserQueries\">View Saved Queries</a>&nbsp;( <b>");
      out.print(numSavedQueries);
      out.write("</b> saved )<br>\r\n");
      out.write("\t\t     <img src=\"/camod/images/subMenuCircleFilled.gif\" border=\"0\">&nbsp;<a href=\"/camod/ReturnUserQueries.do?method=returnUserQueries\">View Query History</a><br>\r\n");
      out.write("\t\t     <img src=\"/camod/images/subMenuArrow.gif\" border=\"0\">&nbsp;<a href=\"/camod/LogoutAction.do\">Log out</a>\r\n");
      out.write("\t\t     <br>\r\n");
      out.write("\t\t</TD></TR></TABLE>\r\n");
      out.write("\t\t</TD></TR>\r\n");
      out.write("\t");

	} 
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <TR>\r\n");
      out.write("\t<TD class=subMenuFill height=\"100%\">&nbsp;</TD></TR>\r\n");
      out.write("      <TR>\r\n");
      out.write("\t<TD class=subMenuFooter height=23>&nbsp;</TD></TR>\r\n");
      out.write("\t</TBODY>\r\n");
      out.write("   </TABLE>\t\t\t\t\r\n");
      out.write("<!-- standard submenu ends -->\r\n");
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("\r\n");
      out.write("<!-- Following cell is for main content -->\r\n");
      out.write("<TD valign=top width=\"100%\"> \r\n");
      out.write("\r\n");
      out.write("<!-- Following table is ended at the end of the Application footer -->\r\n");
      out.write("<TABLE height=\"100%\" cellSpacing=0 cellPadding=0 width=\"100%\" summary=\"\" border=0>\r\n");
      out.write("\t<TBODY>\t\r\n");
      out.write("\r\n");
      out.write("<!-- Can place code here to determine what Main Menu is needed (this is placed on top of the main content in center of page)-->\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<TR><TD class=mainMenu width=\"100%\" height=20>\r\n");
      out.write("\r\n");
      out.write("<!-- Main menu begins -->\r\n");
      out.write("\t<TABLE height=20 cellSpacing=0 cellPadding=0 summary=\"\"\tborder=0>\r\n");
      out.write("\t<TBODY>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- link 1 begins -->\r\n");
      out.write("\t\t<TD height=\"20\" class=\"footerMenuItem\" onmouseover=\"changeMenuStyle(this,'footerMenuItemOver'),showCursor()\" onmouseout=\"changeMenuStyle(this,'footerMenuItem'),hideCursor()\" onclick=\"document.location.href='#'\">\r\n");
      out.write("\t\t  &nbsp;&nbsp;");
      if (_jspx_meth_html_link_1(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<!-- link 1 ends -->\r\n");
      out.write("\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG height=16 alt=\"\" src=\"/camod/images/mainMenuSeparator.gif\" width=1>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\r\n");
      out.write("\t\t<TD height=\"20\" class=\"footerMenuItem\" onmouseover=\"changeMenuStyle(this,'footerMenuItemOver'),showCursor()\" onmouseout=\"changeMenuStyle(this,'footerMenuItem'),hideCursor()\" onclick=\"document.location.href='#'\">\r\n");
      out.write("\t\t  &nbsp;&nbsp;");
      if (_jspx_meth_html_link_2(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG height=16 alt=\"\" src=\"/camod/images/mainMenuSeparator.gif\" width=1>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<TD height=\"20\" class=\"footerMenuItem\" onmouseover=\"changeMenuStyle(this,'footerMenuItemOver'),showCursor()\" onmouseout=\"changeMenuStyle(this,'footerMenuItem'),hideCursor()\" onclick=\"document.location.href='#'\">\r\n");
      out.write("\t\t  &nbsp;&nbsp;");
      if (_jspx_meth_html_link_3(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG height=16 alt=\"\" src=\"/camod/images/mainMenuSeparator.gif\" width=1>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\r\n");
      out.write("\t\t<TD height=\"20\" class=\"footerMenuItem\" onmouseover=\"changeMenuStyle(this,'footerMenuItemOver'),showCursor()\" onmouseout=\"changeMenuStyle(this,'footerMenuItem'),hideCursor()\" onclick=\"document.location.href='#'\">\r\n");
      out.write("\t\t  &nbsp;&nbsp;");
      if (_jspx_meth_html_link_4(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG height=16 alt=\"\" src=\"/camod/images/mainMenuSeparator.gif\" width=1>\r\n");
      out.write("\t\t</TD>\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
 
	        List theRoles = (List) pageContext.getSession().getAttribute(Constants.CURRENTUSERROLES);
	        if (theRoles != null && theRoles.size() > 0)
	        {
	    
      out.write("  \r\n");
      out.write("\t\t<TD height=\"20\" class=\"footerMenuItem\" onmouseover=\"changeMenuStyle(this,'footerMenuItemOver'),showCursor()\" onmouseout=\"changeMenuStyle(this,'footerMenuItem'),hideCursor()\" onclick=\"document.location.href='#'\">\r\n");
      out.write("\t\t  &nbsp;&nbsp;");
      if (_jspx_meth_html_link_5(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG height=16 alt=\"\" src=\"/camod/images/mainMenuSeparator.gif\" width=1>\r\n");
      out.write("\t\t</TD>\t\t\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<TD height=\"20\" class=\"footerMenuItem\" onmouseover=\"changeMenuStyle(this,'footerMenuItemOver'),showCursor()\" onmouseout=\"changeMenuStyle(this,'footerMenuItem'),hideCursor()\" onclick=\"document.location.href='#'\">\r\n");
      out.write("\t\t  &nbsp;&nbsp;");
      if (_jspx_meth_html_link_6(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG height=16 alt=\"\" src=\"/camod/images/mainMenuSeparator.gif\" width=1>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TBODY>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\r\n");
      out.write("<!-- Main menu ends -->\r\n");
      out.write("\r\n");
      out.write("</TD></TR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<TR><TD valign=top width=\"100%\">\r\n");
      out.write("\r\n");
      out.write("<!-- Main Content Begins -->\r\n");
      out.write("<TABLE class=contentPage cellSpacing=0 cellPadding=0 width=700 summary=\"\" border=0>\r\n");
      out.write("<TBODY>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD valign=\"top\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<TABLE cellpadding=\"10\" cellspacing=\"0\" border=\"0\" class=\"contentBegins\" width=\"100%\" height=\"100%\">\r\n");
      out.write("<tr><td>\r\n");
      out.write("\r\n");
      out.write("\t<TABLE summary=\"\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"contentPage\" width=\"100%\" height=\"100%\">\r\n");
      out.write("\t<tr><td valign=\"top\">\r\n");
      out.write("\t\t<TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"contentBegins\" width=\"100%\" >\r\n");
      out.write("\t\t<tr><td>\r\n");
      out.write("\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"0\" align=\"center\" width=\"100%\">\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"formTitle\" height=\"20\">Disclaimer</td>\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"resultsBoxGreyEnd\"><b>Legal Rules of the Road</b></td>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"resultsBoxWhiteEnd\">\r\n");
      out.write("\t\t\t\t<P>\r\n");
      out.write("\t\t\t\tThis Cancer Models Database is provided as a public service by the National Cancer Institute (NCI) to \r\n");
      out.write("\t\t\t\tfoster the rapid dissemination of information to the scientific community and the public. You may post \r\n");
      out.write("\t\t\t\tdata and results on this database. This data may already be published or otherwise in the public \r\n");
      out.write("\t\t\t\tdomain. In addition, confidential information may be posted which has not yet been published or is the \r\n");
      out.write("\t\t\t\tsubject of a patent application to be filed. All data may be subject to copyright provisions \r\n");
      out.write("\t\t\t\t(see \"Copyright Status\" below.) By submitting data to the NCI Cancer Models Database, you are certifying \r\n");
      out.write("\t\t\t\tthat you are the author of this data, and are authorized to release the data. You also certify that \r\n");
      out.write("\t\t\t\tyou will post only data generated and/or produced by you or your laboratory, and that you will consult \r\n");
      out.write("\t\t\t\twith your institutions technology development office before posting or disclosing confidential information \r\n");
      out.write("\t\t\t\twhich may be patentable. You may browse, download, and use the data for non-commercial, scientific and \r\n");
      out.write("\t\t\t\teducational purposes. However, you may encounter documents or portions of documents contributed by \r\n");
      out.write("\t\t\t\tprivate institutions or organizations. Other parties may retain all rights to publish or produce these \r\n");
      out.write("\t\t\t\tdocuments. Commercial use of the documents on this site may be protected under United States and foreign \r\n");
      out.write("\t\t\t\tcopyright laws. In addition, some of the data may be the subject of patent applications or issued patents, \r\n");
      out.write("\t\t\t\tand you may need to seek a license for its commercial use. You are encouraged to review important \r\n");
      out.write("\t\t\t\tUse Guidelines by clicking on the buttons below\r\n");
      out.write("\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t<a href=\"infoPrivacyNotice.do\"><b>PRIVACY NOTICE:</b></a> Posting of Data and Results/Downloading of Materials/Copyright Status/Privacy \r\n");
      out.write("\t\t\t\tNotice/Monitoring of Website/External Links/Disclaimer of Liability/Disclaimer of Endorsement \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</P>\r\n");
      out.write("\t\t\t\t</td> \r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</TABLE>\r\n");
      out.write("\t\t</td></tr></TABLE>\r\n");
      out.write("\t</td></tr></TABLE>\r\n");
      out.write("</td></tr></TABLE>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</TD></TR>\r\n");
      out.write("</TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<!-- Main Content Ends -->\r\n");
      out.write("\r\n");
      out.write("</TD></TR>  <!-- end row & column started in sidebar used for main content -->\r\n");
      out.write("<TR><TD class=footerMenu width=\"100%\" height=20>\r\n");
      out.write("\r\n");
      out.write("<!-- Application Footer begins -->\r\n");
      out.write("<TABLE width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" summary=\"\" border=\"0\">\r\n");
      out.write("\t<TR><TD height=\"20\" width=\"100%\" class=\"footerMenu\">\r\n");
      out.write("\t\t    <TABLE summary=\"\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("\t\t     \r\n");
      out.write("\t\t     <tr>\r\n");
      out.write("\t\t     \r\n");
      out.write("\t\t\t<td align=\"center\" height=\"20\" class=\"footerMenuItem\" onmouseover=\"changeMenuStyle(this,'footerMenuItemOver'),showCursor()\" onmouseout=\"changeMenuStyle(this,'footerMenuItem'),hideCursor()\" onclick=\"document.location.href='#'\">\r\n");
      out.write("\t\t\t  &nbsp;&nbsp;");
      if (_jspx_meth_html_link_7(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<TD><IMG height=16 alt=\"\" src=\"/camod/images/mainMenuSeparator.gif\" width=1></TD>\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td align=\"center\" height=\"20\" class=\"footerMenuItem\" onmouseover=\"changeMenuStyle(this,'footerMenuItemOver'),showCursor()\" onmouseout=\"changeMenuStyle(this,'footerMenuItem'),hideCursor()\" onclick=\"document.location.href='#'\">\r\n");
      out.write("\t\t\t  &nbsp;&nbsp;<A href=\"http://www.hhs.gov/Privacy.html\">Privacy Notice</A>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<TD><IMG height=16 alt=\"\" src=\"/camod/images/mainMenuSeparator.gif\" width=1></TD>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t<td align=\"center\" height=\"20\" class=\"footerMenuItem\" onmouseover=\"changeMenuStyle(this,'footerMenuItemOver'),showCursor()\" onmouseout=\"changeMenuStyle(this,'footerMenuItem'),hideCursor()\" onclick=\"document.location.href='#'\">\r\n");
      out.write("\t\t\t  &nbsp;&nbsp;");
      if (_jspx_meth_html_link_8(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<TD><IMG height=16 alt=\"\" src=\"/camod/images/mainMenuSeparator.gif\" width=1></TD>\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td align=\"center\" height=\"20\" class=\"footerMenuItem\" onmouseover=\"changeMenuStyle(this,'footerMenuItemOver'),showCursor()\" onmouseout=\"changeMenuStyle(this,'footerMenuItem'),hideCursor()\" onclick=\"document.location.href='#'\">\r\n");
      out.write("\t\t\t  &nbsp;&nbsp;");
      if (_jspx_meth_html_link_9(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<TD><IMG height=16 alt=\"\" src=\"/camod/images/mainMenuSeparator.gif\" width=1></TD>\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td align=\"center\" height=\"20\" class=\"footerMenuItem\" onmouseover=\"changeMenuStyle(this,'footerMenuItemOver'),showCursor()\" onmouseout=\"changeMenuStyle(this,'footerMenuItem'),hideCursor()\" onclick=\"document.location.href='#'\">\r\n");
      out.write("\t\t\t  &nbsp;&nbsp;");
      if (_jspx_meth_html_link_10(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<TD><IMG height=16 alt=\"\" src=\"/camod/images/mainMenuSeparator.gif\" width=1></TD>\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t      </tr>\r\n");
      out.write("\r\n");
      out.write("\t\t    </TABLE>\r\n");
      out.write("       </TD></TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<!-- Application Footer  ends -->\r\n");
      out.write("\r\n");
      out.write("</TD></TR></TBODY></TABLE><!-- End of table started in beginning of Main content -->\r\n");
      out.write("</TD></TR></TBODY></TABLE><!-- End of table started in beginning of Application header -->\r\n");
      out.write("\r\n");
      out.write("</TD</TR>\r\n");
      out.write("<TR><TD>\r\n");
      out.write("\r\n");
      out.write("<!-- Footer begins -->\r\n");
      out.write("<TABLE class=ftrTable cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD vAlign=top>\r\n");
      out.write("            <DIV align=center><A href=\"http://www.cancer.gov/\"><IMG height=31\r\n");
      out.write("            alt=\"National Cancer Institute\" src=\"/camod/images/footer_nci.gif\"\r\n");
      out.write("            width=63 border=0></A> <A href=\"http://www.dhhs.gov/\"><IMG height=31\r\n");
      out.write("            alt=\"Department of Health and Human Services\"\r\n");
      out.write("            src=\"/camod/images/footer_hhs.gif\" width=39 border=0></A> <A\r\n");
      out.write("            href=\"http://www.nih.gov/\"><IMG height=31\r\n");
      out.write("            alt=\"National Institutes of Health\"\r\n");
      out.write("            src=\"/camod/images/footer_nih.gif\" width=46 border=0></A> <A\r\n");
      out.write("            href=\"http://www.firstgov.gov/\"><IMG height=31 alt=FirstGov.gov\r\n");
      out.write("            src=\"/camod/images/footer_firstgov.gif\" width=91 border=0></A>\r\n");
      out.write("          </DIV>\r\n");
      out.write("\t  </TD>\r\n");
      out.write("\t  </TR>\r\n");
      out.write("\t</TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<!-- Footer ends -->\r\n");
      out.write("\r\n");
      out.write("</TBODY></TD></TR></TABLE>  <!-- end table that was started at the beginning of the header.jsp -->\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
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

  private boolean _jspx_meth_html_xhtml_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:xhtml
    org.apache.struts.taglib.html.XhtmlTag _jspx_th_html_xhtml_0 = (org.apache.struts.taglib.html.XhtmlTag) _jspx_tagPool_html_xhtml_nobody.get(org.apache.struts.taglib.html.XhtmlTag.class);
    _jspx_th_html_xhtml_0.setPageContext(_jspx_page_context);
    _jspx_th_html_xhtml_0.setParent(null);
    int _jspx_eval_html_xhtml_0 = _jspx_th_html_xhtml_0.doStartTag();
    if (_jspx_th_html_xhtml_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_xhtml_nobody.reuse(_jspx_th_html_xhtml_0);
    return false;
  }

  private boolean _jspx_meth_html_link_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_0.setPageContext(_jspx_page_context);
    _jspx_th_html_link_0.setParent(null);
    _jspx_th_html_link_0.setStyleClass("footerMenuLink");
    _jspx_th_html_link_0.setAction("login");
    int _jspx_eval_html_link_0 = _jspx_th_html_link_0.doStartTag();
    if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_0.doInitBody();
      }
      do {
        out.write("<IMG\r\n");
        out.write("                  height=46 alt=\"Application Logo\" hspace=10 src=\"/camod/images/mmhcclogo.gif\" border=0>");
        int evalDoAfterBody = _jspx_th_html_link_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_0);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_c_out_0.setValue("${role}");
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_html_link_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_1 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_1.setPageContext(_jspx_page_context);
    _jspx_th_html_link_1.setParent(null);
    _jspx_th_html_link_1.setStyleClass("footerMenuLink");
    _jspx_th_html_link_1.setAction("login");
    int _jspx_eval_html_link_1 = _jspx_th_html_link_1.doStartTag();
    if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_1.doInitBody();
      }
      do {
        out.write("HOME");
        int evalDoAfterBody = _jspx_th_html_link_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_1);
    return false;
  }

  private boolean _jspx_meth_html_link_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_2 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_2.setPageContext(_jspx_page_context);
    _jspx_th_html_link_2.setParent(null);
    _jspx_th_html_link_2.setStyleClass("footerMenuLink");
    _jspx_th_html_link_2.setAction("RegisterUserPopulateAction");
    int _jspx_eval_html_link_2 = _jspx_th_html_link_2.doStartTag();
    if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_2.doInitBody();
      }
      do {
        out.write("REGISTER");
        int evalDoAfterBody = _jspx_th_html_link_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_2);
    return false;
  }

  private boolean _jspx_meth_html_link_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_3 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_3.setPageContext(_jspx_page_context);
    _jspx_th_html_link_3.setParent(null);
    _jspx_th_html_link_3.setStyleClass("footerMenuLink");
    _jspx_th_html_link_3.setAction("SimpleSearchPopulateAction?unprotected_method=populate");
    int _jspx_eval_html_link_3 = _jspx_th_html_link_3.doStartTag();
    if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_3.doInitBody();
      }
      do {
        out.write("SEARCH MODELS");
        int evalDoAfterBody = _jspx_th_html_link_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_3);
    return false;
  }

  private boolean _jspx_meth_html_link_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_4 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_4.setPageContext(_jspx_page_context);
    _jspx_th_html_link_4.setParent(null);
    _jspx_th_html_link_4.setStyleClass("footerMenuLink");
    _jspx_th_html_link_4.setAction("/ReturnUserModels.do?method=returnUserModels");
    int _jspx_eval_html_link_4 = _jspx_th_html_link_4.doStartTag();
    if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_4.doInitBody();
      }
      do {
        out.write("SUBMIT MODELS");
        int evalDoAfterBody = _jspx_th_html_link_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_4);
    return false;
  }

  private boolean _jspx_meth_html_link_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_5 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_5.setPageContext(_jspx_page_context);
    _jspx_th_html_link_5.setParent(null);
    _jspx_th_html_link_5.setStyleClass("footerMenuLink");
    _jspx_th_html_link_5.setAction("/AdminRolesPopulateAction");
    int _jspx_eval_html_link_5 = _jspx_th_html_link_5.doStartTag();
    if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_5.doInitBody();
      }
      do {
        out.write("ADMIN");
        int evalDoAfterBody = _jspx_th_html_link_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_5);
    return false;
  }

  private boolean _jspx_meth_html_link_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_6 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_href.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_6.setPageContext(_jspx_page_context);
    _jspx_th_html_link_6.setParent(null);
    _jspx_th_html_link_6.setStyleClass("footerMenuLink");
    _jspx_th_html_link_6.setHref("javascript:openHelpWindow('WebHelp/!SSL!/index.html')");
    int _jspx_eval_html_link_6 = _jspx_th_html_link_6.doStartTag();
    if (_jspx_eval_html_link_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_6.doInitBody();
      }
      do {
        out.write("HELP");
        int evalDoAfterBody = _jspx_th_html_link_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_href.reuse(_jspx_th_html_link_6);
    return false;
  }

  private boolean _jspx_meth_html_link_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_7 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_7.setPageContext(_jspx_page_context);
    _jspx_th_html_link_7.setParent(null);
    _jspx_th_html_link_7.setStyleClass("footerMenuLink");
    _jspx_th_html_link_7.setAction("infoContactUs");
    int _jspx_eval_html_link_7 = _jspx_th_html_link_7.doStartTag();
    if (_jspx_eval_html_link_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_7.doInitBody();
      }
      do {
        out.write("CONTACT US");
        int evalDoAfterBody = _jspx_th_html_link_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_7);
    return false;
  }

  private boolean _jspx_meth_html_link_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_8 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_8.setPageContext(_jspx_page_context);
    _jspx_th_html_link_8.setParent(null);
    _jspx_th_html_link_8.setStyleClass("footerMenuLink");
    _jspx_th_html_link_8.setAction("infoDisclaimer");
    int _jspx_eval_html_link_8 = _jspx_th_html_link_8.doStartTag();
    if (_jspx_eval_html_link_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_8.doInitBody();
      }
      do {
        out.write("DISCLAIMER");
        int evalDoAfterBody = _jspx_th_html_link_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_8);
    return false;
  }

  private boolean _jspx_meth_html_link_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_9 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_9.setPageContext(_jspx_page_context);
    _jspx_th_html_link_9.setParent(null);
    _jspx_th_html_link_9.setStyleClass("footerMenuLink");
    _jspx_th_html_link_9.setAction("infoAccessibility");
    int _jspx_eval_html_link_9 = _jspx_th_html_link_9.doStartTag();
    if (_jspx_eval_html_link_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_9.doInitBody();
      }
      do {
        out.write("ACCESSIBILITY");
        int evalDoAfterBody = _jspx_th_html_link_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_9);
    return false;
  }

  private boolean _jspx_meth_html_link_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_10 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_10.setPageContext(_jspx_page_context);
    _jspx_th_html_link_10.setParent(null);
    _jspx_th_html_link_10.setStyleClass("footerMenuLink");
    _jspx_th_html_link_10.setAction("infoApplicationSupport");
    int _jspx_eval_html_link_10 = _jspx_th_html_link_10.doStartTag();
    if (_jspx_eval_html_link_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_10.doInitBody();
      }
      do {
        out.write("APPLICATION SUPPORT");
        int evalDoAfterBody = _jspx_th_html_link_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_10);
    return false;
  }
}
