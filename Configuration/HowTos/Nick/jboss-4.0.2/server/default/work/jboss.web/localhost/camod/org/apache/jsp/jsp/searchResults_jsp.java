package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import gov.nih.nci.camod.webapp.util.SidebarUtil;
import gov.nih.nci.camod.Constants;
import java.util.List;
import gov.nih.nci.camod.Constants;
import gov.nih.nci.camod.domain.AnimalModel;
import gov.nih.nci.camod.domain.Histopathology;
import gov.nih.nci.camod.domain.SavedQuery;
import gov.nih.nci.camod.Constants;
import gov.nih.nci.camod.util.CriteriaTableUtil;
import gov.nih.nci.camod.webapp.form.SearchForm;
import gov.nih.nci.camod.webapp.form.SaveQueryForm;
import java.util.List;
import java.lang.Float;
import java.util.ArrayList;

public final class searchResults_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_escapeXml_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_focus_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_radio_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_value_styleClass_size_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_table_width_pagesize_name_id_cellspacing_cellpadding_border;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title_sortable_headerClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_camod_highlight;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title_sortable_paramProperty_paramId_href;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title_sortable;

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
    _jspx_tagPool_bean_define_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_escapeXml_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_focus_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_radio_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_value_styleClass_size_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_table_width_pagesize_name_id_cellspacing_cellpadding_border = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title_sortable_headerClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_camod_highlight = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title_sortable_paramProperty_paramId_href = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title_sortable = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_xhtml_nobody.release();
    _jspx_tagPool_html_link_styleClass_action.release();
    _jspx_tagPool_logic_present_name.release();
    _jspx_tagPool_logic_iterate_type_name_id.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_html_link_styleClass_href.release();
    _jspx_tagPool_bean_define_name_id_nobody.release();
    _jspx_tagPool_c_out_value_escapeXml_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_html_form_focus_action.release();
    _jspx_tagPool_html_radio_value_property_nobody.release();
    _jspx_tagPool_html_text_value_styleClass_size_property_nobody.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.release();
    _jspx_tagPool_display_table_width_pagesize_name_id_cellspacing_cellpadding_border.release();
    _jspx_tagPool_display_column_title.release();
    _jspx_tagPool_display_column_title_sortable_headerClass.release();
    _jspx_tagPool_camod_highlight.release();
    _jspx_tagPool_display_column_title_sortable_paramProperty_paramId_href.release();
    _jspx_tagPool_display_column_title_sortable.release();
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



/**
 * 
 * $Id: searchResults_jsp.java,v 1.1 2008-07-22 19:39:47 pandyas Exp $
 * 
 * $Log: not supported by cvs2svn $
 * Revision 1.29  2007/09/11 15:55:30  pandyas
 * Comment out debug
 *
 * Revision 1.28  2007/09/06 19:09:33  pandyas
 * Slight modification to force the newest jsp to build
 *
 * Revision 1.27  2007/09/06 19:05:47  pandyas
 * Slight modification to force the newest jsp to build
 *
 * Revision 1.26  2007/07/31 12:00:10  pandyas
 * VCDE silver level  and caMOD 2.3 changes
 *
 * Revision 1.25  2006/11/17 17:33:22  pandyas
 * #480 - move MTB icon in front of the model descriptor in search results list
 *
 * Revision 1.24  2006/11/13 19:59:44  pandyas
 * #463	images on image search page do not open
 * Modified link to show complete img src location:
 * <IMG SRC="/camod/images/...">
 *
 * Revision 1.23  2006/11/08 20:13:22  pandyas
 * Removed height and width for mtb_logo
 *
 * Revision 1.22  2006/11/08 19:11:17  pandyas
 * added MTB logo onto view screens for Jackson Lab models
 *
 * Revision 1.21  2006/10/18 18:44:07  pandyas
 * took out image and microarray icon code
 *
 * Revision 1.20  2006/10/17 16:08:28  pandyas
 * modified during development of caMOD 2.2 - various
 *
 * Revision 1.19  2006/08/13 17:43:43  pandyas
 * Updated online help - redefined camod tag by substituting mapId for topic (ePublisher changes)
 *
 * Revision 1.18  2006/05/10 18:03:00  schroedn
 * Fixed crash when loading page with no search results.
 *
 * Revision 1.17  2006/05/10 15:37:23  schroedn
 * Fixed Dup_Name bug
 *
 * Revision 1.16  2006/05/10 14:22:10  schroedn
 * New Features - Changes from code review
 *
 * Revision 1.15  2006/04/28 19:39:21  schroedn
 * Defect # 261, 238
 * Many changes, displays any search result column user has setup, options to save/update Query
 *
 *
 */


      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("\t<TITLE>caMOD - Cancer Models Database</TITLE>\r\n");
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
 * $Id: searchResults_jsp.java,v 1.1 2008-07-22 19:39:47 pandyas Exp $
 * 
 * $Log: not supported by cvs2svn $
 * Revision 1.17  2006/12/28 18:27:37  pandyas
 * Renamed folder !SSL!( from robohelp) to caMOD (folder name not used in ePublisher)
 *
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
      out.write("\t\t href=\"javascript:openHelpWindow('WebHelp/caMOD/index.html')\" >HELP</A></TD></TR>\r\n");
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
      out.write('\r');
      out.write('\n');
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
      if (_jspx_meth_html_xhtml_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      
	List results = ( List ) request.getSession().getAttribute( Constants.SEARCH_RESULTS );	
	if ( results == null ) 
	{
	    results = new ArrayList();
	    request.getSession().setAttribute( Constants.SEARCH_RESULTS, results );
	}
	
	int size = results.size();
	
	String pageSize = ( String ) request.getSession().getAttribute( Constants.ITEMSPERPAGE );	
	if ( pageSize == null ) 
	{
		pageSize = "15";
	}
		
	String[] resultColumns = ( String[] ) request.getSession().getAttribute( Constants.SEARCHRESULTCOLUMNS );
   	if ( resultColumns == null ) 
   	{
   		resultColumns = new String[] { "Model Id", "Model Descriptor", "Tumor Sites", "Species" };   //default        
  	}  
  	
	//String noSaveOption = request.getParameter( "noSaveOption" );  	  	 

      out.write("\r\n");
      out.write("\r\n");
      out.write("<DIV id=\"TipLayer\" style=\"visibility:hidden;position:absolute;z-index:1000;top:-100;\"></DIV>\r\n");
      out.write("<TABLE cellpadding=\"10\" cellspacing=\"0\" border=\"0\" class=\"contentBegins\" width=\"100%\" height=\"100%\">\r\n");
      out.write("<tr><td>\r\n");
      out.write("\r\n");
      out.write("\t");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_1 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_present_1.setPageContext(_jspx_page_context);
      _jspx_th_logic_present_1.setParent(null);
      _jspx_th_logic_present_1.setName(Constants.NOSAVEOPTION);
      int _jspx_eval_logic_present_1 = _jspx_th_logic_present_1.doStartTag();
      if (_jspx_eval_logic_present_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_1);
          _jspx_th_bean_define_0.setId("noSaveOption");
          _jspx_th_bean_define_0.setName(Constants.NOSAVEOPTION);
          int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
          if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_0);
          java.lang.Object noSaveOption = null;
          noSaveOption = (java.lang.Object) _jspx_page_context.findAttribute("noSaveOption");
          out.write("\t\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_logic_present_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_present_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_1);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_2 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_present_2.setPageContext(_jspx_page_context);
      _jspx_th_logic_present_2.setParent(null);
      _jspx_th_logic_present_2.setName(Constants.CRITERIATABLE);
      int _jspx_eval_logic_present_2 = _jspx_th_logic_present_2.doStartTag();
      if (_jspx_eval_logic_present_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_1 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_1.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_2);
          _jspx_th_bean_define_1.setId("criteriaTable");
          _jspx_th_bean_define_1.setName(Constants.CRITERIATABLE);
          int _jspx_eval_bean_define_1 = _jspx_th_bean_define_1.doStartTag();
          if (_jspx_th_bean_define_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_1);
          java.lang.Object criteriaTable = null;
          criteriaTable = (java.lang.Object) _jspx_page_context.findAttribute("criteriaTable");
          out.write("\t\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_logic_present_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_present_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_2);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_3 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_present_3.setPageContext(_jspx_page_context);
      _jspx_th_logic_present_3.setParent(null);
      _jspx_th_logic_present_3.setName(Constants.DUP_NAME);
      int _jspx_eval_logic_present_3 = _jspx_th_logic_present_3.doStartTag();
      if (_jspx_eval_logic_present_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_2 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_2.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_3);
          _jspx_th_bean_define_2.setId("dupName");
          _jspx_th_bean_define_2.setName(Constants.DUP_NAME);
          int _jspx_eval_bean_define_2 = _jspx_th_bean_define_2.doStartTag();
          if (_jspx_th_bean_define_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_2);
          java.lang.Object dupName = null;
          dupName = (java.lang.Object) _jspx_page_context.findAttribute("dupName");
          out.write('\r');
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_logic_present_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_present_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_3);
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_4 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_present_4.setPageContext(_jspx_page_context);
      _jspx_th_logic_present_4.setParent(null);
      _jspx_th_logic_present_4.setName(Constants.DUP_NAME_VALUE);
      int _jspx_eval_logic_present_4 = _jspx_th_logic_present_4.doStartTag();
      if (_jspx_eval_logic_present_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_3 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_3.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_4);
          _jspx_th_bean_define_3.setId("dupNameValue");
          _jspx_th_bean_define_3.setName(Constants.DUP_NAME_VALUE);
          int _jspx_eval_bean_define_3 = _jspx_th_bean_define_3.doStartTag();
          if (_jspx_th_bean_define_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_3);
          java.lang.Object dupNameValue = null;
          dupNameValue = (java.lang.Object) _jspx_page_context.findAttribute("dupNameValue");
          out.write('\r');
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_logic_present_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_present_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_4);
      out.write("\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_5 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_present_5.setPageContext(_jspx_page_context);
      _jspx_th_logic_present_5.setParent(null);
      _jspx_th_logic_present_5.setName(Constants.QUERY_NAME);
      int _jspx_eval_logic_present_5 = _jspx_th_logic_present_5.doStartTag();
      if (_jspx_eval_logic_present_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_4 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_4.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_5);
          _jspx_th_bean_define_4.setId("aQueryName");
          _jspx_th_bean_define_4.setName(Constants.QUERY_NAME);
          int _jspx_eval_bean_define_4 = _jspx_th_bean_define_4.doStartTag();
          if (_jspx_th_bean_define_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_4);
          java.lang.Object aQueryName = null;
          aQueryName = (java.lang.Object) _jspx_page_context.findAttribute("aQueryName");
          out.write('\r');
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_logic_present_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_present_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_5);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_6 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_present_6.setPageContext(_jspx_page_context);
      _jspx_th_logic_present_6.setParent(null);
      _jspx_th_logic_present_6.setName(Constants.RERUN_QUERY);
      int _jspx_eval_logic_present_6 = _jspx_th_logic_present_6.doStartTag();
      if (_jspx_eval_logic_present_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_5 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_5.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_6);
          _jspx_th_bean_define_5.setId("reRunQuery");
          _jspx_th_bean_define_5.setName(Constants.RERUN_QUERY);
          int _jspx_eval_bean_define_5 = _jspx_th_bean_define_5.doStartTag();
          if (_jspx_th_bean_define_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_5);
          java.lang.Object reRunQuery = null;
          reRunQuery = (java.lang.Object) _jspx_page_context.findAttribute("reRunQuery");
          out.write("\t\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_logic_present_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_present_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_6);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_7 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_present_7.setPageContext(_jspx_page_context);
      _jspx_th_logic_present_7.setParent(null);
      _jspx_th_logic_present_7.setName(Constants.ASAVEDQUERYID);
      int _jspx_eval_logic_present_7 = _jspx_th_logic_present_7.doStartTag();
      if (_jspx_eval_logic_present_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_6 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_6.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_7);
          _jspx_th_bean_define_6.setId("aSavedQueryId");
          _jspx_th_bean_define_6.setName(Constants.ASAVEDQUERYID);
          int _jspx_eval_bean_define_6 = _jspx_th_bean_define_6.doStartTag();
          if (_jspx_th_bean_define_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_6);
          java.lang.Object aSavedQueryId = null;
          aSavedQueryId = (java.lang.Object) _jspx_page_context.findAttribute("aSavedQueryId");
          out.write("\t\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_logic_present_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_present_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_7);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_8 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_present_8.setPageContext(_jspx_page_context);
      _jspx_th_logic_present_8.setParent(null);
      _jspx_th_logic_present_8.setName(Constants.CURRENTUSER);
      int _jspx_eval_logic_present_8 = _jspx_th_logic_present_8.doStartTag();
      if (_jspx_eval_logic_present_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_7 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_7.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_8);
          _jspx_th_bean_define_7.setId("currentUser");
          _jspx_th_bean_define_7.setName(Constants.CURRENTUSER);
          int _jspx_eval_bean_define_7 = _jspx_th_bean_define_7.doStartTag();
          if (_jspx_th_bean_define_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_7);
          java.lang.Object currentUser = null;
          currentUser = (java.lang.Object) _jspx_page_context.findAttribute("currentUser");
          out.write("\t\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_logic_present_8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_present_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_8);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
							
		request.getSession().setAttribute( Constants.DUP_NAME, "false" );
			
		// Get elapsed time in seconds	
		float elapsedTimeSec = 0;
		if ( (Long) request.getSession().getAttribute( Constants.ELAPSED_TIME ) != null )
		{		
			elapsedTimeSec = ( (Long) request.getSession().getAttribute( Constants.ELAPSED_TIME )).floatValue()/1000;
		} 				
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- searchResults.jsp -->\r\n");
      out.write("<!-- Main Content Begins -->\r\n");
      out.write("\t<TABLE summary=\"\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"contentPage\" width=\"100%\" height=\"100%\">\r\n");
      out.write("\t<tr><td valign=\"top\">\r\n");
      out.write("\t\t<TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"contentBegins\" width=\"100%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<TABLE cellpadding=\"5\" cellspacing=\"0\" border=\"0\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t<TD class=\"formTitle\" height=\"20\">Search Criteria ( <font color=\"red\">");
      out.print( elapsedTimeSec );
      out.write("</font> seconds )</TD>\r\n");
      out.write("\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t<TD class=\"formFieldAll\">");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t</TABLE>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr><td>\r\n");
      out.write("\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"0\" width=\"100%\">\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"formTitle\" height=\"20\" colspan=\"4\">Search Results&nbsp;\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_camod_cshelp_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\r\n");
      out.write("            ");
      //  display:table
      org.displaytag.tags.el.ELTableTag _jspx_th_display_table_0 = (org.displaytag.tags.el.ELTableTag) _jspx_tagPool_display_table_width_pagesize_name_id_cellspacing_cellpadding_border.get(org.displaytag.tags.el.ELTableTag.class);
      _jspx_th_display_table_0.setPageContext(_jspx_page_context);
      _jspx_th_display_table_0.setParent(null);
      _jspx_th_display_table_0.setUid("row");
      _jspx_th_display_table_0.setName("${sessionScope.searchResults}");
      _jspx_th_display_table_0.setPagesize( pageSize );
      _jspx_th_display_table_0.setCellpadding("5");
      _jspx_th_display_table_0.setCellspacing("0");
      _jspx_th_display_table_0.setBorder("1");
      _jspx_th_display_table_0.setWidth("100%");
      int _jspx_eval_display_table_0 = _jspx_th_display_table_0.doStartTag();
      if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_display_table_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_display_table_0.doInitBody();
        }
        do {
          out.write(" \t \r\n");
          out.write(" \t                 \r\n");
          out.write(" \t                 ");
          if (_jspx_meth_display_column_0(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("  \r\n");
          out.write("\t\t\t\t     \r\n");
          out.write("\t\t\t\t\t");

					    for (int i = 0; i < resultColumns.length; i++) {
					    	//System.out.println( "selectedColumnsToDisplay[" + i + "] = " + resultColumns[i] );
					    	
							if( resultColumns[i].equals("Model Id") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_1(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }					    	
					    	
							else if( resultColumns[i].equals("Model Descriptor") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t             ");
          if (_jspx_meth_display_column_2(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }						
							else if( resultColumns[i].equals("Species") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_3(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("  \t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }       							
							else if( resultColumns[i].equals("Tumor Sites") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_4(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 } 
							else if( resultColumns[i].equals("Submitted by") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_5(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }
							else if( resultColumns[i].equals("Submitted Date") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_6(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }
							else if( resultColumns[i].equals("Strain") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_7(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }

							else if( resultColumns[i].equals("Principal Investigator") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_8(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }
							else if( resultColumns[i].equals("Gender") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_9(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }	
							else if( resultColumns[i].equals("Transgene") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_10(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }
							else if( resultColumns[i].equals("Transcriptional 1") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_11(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\t\t\t\t\t\t\t     \r\n");
          out.write("\t\t\t\t\t\t\t");
 }												
							else if( resultColumns[i].equals("Segment Type") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_12(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }	
							else if( resultColumns[i].equals("Designator") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_13(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }
							else if( resultColumns[i].equals("Targeted Gene / Locus") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_14(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }	
							else if( resultColumns[i].equals("Type of Modification") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_15(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }	
							else if( resultColumns[i].equals("Name of inducing agent") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_16(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }	
							else if( resultColumns[i].equals("Gene Name") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_17(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }	
							else if( resultColumns[i].equals("Chemical") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_18(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }																																																																													 							
							else if( resultColumns[i].equals("Environmental Factor") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_19(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }	
							else if( resultColumns[i].equals("Viral Vector") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_20(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }	
							else if( resultColumns[i].equals("Gene") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_21(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }	
							else if( resultColumns[i].equals("Growth Factor") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_22(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }	
							else if( resultColumns[i].equals("Hormone") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_23(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }	
							else if( resultColumns[i].equals("Nutritional Factor") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_24(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }								
							else if( resultColumns[i].equals("Radiation") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_25(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }	
							else if( resultColumns[i].equals("Virus") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_26(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }	
							else if( resultColumns[i].equals("Year of Publication") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_27(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }								
							else if( resultColumns[i].equals("Journal") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_28(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }								
							else if( resultColumns[i].equals("PMID number") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_29(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }
							else if( resultColumns[i].equals("Site of Lesion / Tumor") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_30(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }							
							else if( resultColumns[i].equals("Diagnosis") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_31(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }								
							else if( resultColumns[i].equals("Age of Onset") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_32(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }
							else if( resultColumns[i].equals("Tumor incidence over lifetime") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_33(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }							
							else if( resultColumns[i].equals("Site and Diagnosis of Metastasis") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_34(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }								
							else if( resultColumns[i].equals("Drug / Compound Name") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_35(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }
							else if( resultColumns[i].equals("Name of Cell line") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_36(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }							
							else if( resultColumns[i].equals("Organ / Tissue") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_37(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }							
							else if( resultColumns[i].equals("Image Title") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_38(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }							
							else if( resultColumns[i].equals("Distributor") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_39(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }							
							else if( resultColumns[i].equals("Cell line") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_40(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }							
							else if( resultColumns[i].equals("Donor Species") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_41(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }							
							else if( resultColumns[i].equals("Source Type") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_42(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }	
							else if( resultColumns[i].equals("Carcinogen") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_43(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }
							else if( resultColumns[i].equals("Publications") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_44(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }			
							else if( resultColumns[i].equals("Microarray") ) { 
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t     ");
          if (_jspx_meth_display_column_45(_jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\t \t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
 }																										
							else {}  							
						}
					
          out.write("\r\n");
          out.write("    \t    ");
          int evalDoAfterBody = _jspx_th_display_table_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_display_table_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_display_table_width_pagesize_name_id_cellspacing_cellpadding_border.reuse(_jspx_th_display_table_0);
      out.write("\t\t          \r\n");
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
    _jspx_th_html_link_6.setHref("javascript:openHelpWindow('WebHelp/caMOD/index.html')");
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

  private boolean _jspx_meth_html_xhtml_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:xhtml
    org.apache.struts.taglib.html.XhtmlTag _jspx_th_html_xhtml_1 = (org.apache.struts.taglib.html.XhtmlTag) _jspx_tagPool_html_xhtml_nobody.get(org.apache.struts.taglib.html.XhtmlTag.class);
    _jspx_th_html_xhtml_1.setPageContext(_jspx_page_context);
    _jspx_th_html_xhtml_1.setParent(null);
    int _jspx_eval_html_xhtml_1 = _jspx_th_html_xhtml_1.doStartTag();
    if (_jspx_th_html_xhtml_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_xhtml_nobody.reuse(_jspx_th_html_xhtml_1);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue("${criteriaTable}");
    _jspx_th_c_out_1.setEscapeXml("false");
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest("${ dupName == 'true' }");
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<TABLE border=\"0\" class=\"contentPage\" width=\"100%\">\r\n");
        out.write("\t\t\t\t\t\t<TR>\r\n");
        out.write("\t\t\t\t\t\t\t<TD align=\"left\" colspan=\"2\" width=\"100%\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<font color=\"red\">*The name \"");
        if (_jspx_meth_c_out_2(_jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\" is already being used, please choose a different name.</font><br>\r\n");
        out.write("\t\t\t\t\t\t    </TD>\r\n");
        out.write("\t\t\t\t\t\t</TR>\r\n");
        out.write("\t\t\t\t\t</TABLE>\t\r\n");
        out.write("\t\t\t    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_out_2.setValue("${dupNameValue}");
    _jspx_th_c_out_2.setEscapeXml("false");
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t    \r\n");
        out.write("\t\t\t\t    ");
        if (_jspx_meth_c_when_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t\t    ");
        if (_jspx_meth_c_when_1(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_2(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t\t    ");
        if (_jspx_meth_c_when_3(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t    \r\n");
        out.write("\t\t\t\t    ");
        if (_jspx_meth_c_otherwise_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t    \t\t    \t\t\t    \t\t\t\t\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest("${ noSaveOption == 'true' }");
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<TABLE border=\"0\" class=\"contentPage\" width=\"100%\">\r\n");
        out.write("\t\t\t\t\t\t\t<TR>\r\n");
        out.write("\t\t\t\t\t\t\t\t<TD width=\"40%\">&nbsp;</TD>\r\n");
        out.write("\t\t\t\t\t\t\t\t<TD align=\"right\" width=\"60%\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<font color=\"red\">Query saved as \"");
        if (_jspx_meth_c_out_3(_jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\".</font><br>\r\n");
        out.write("\t\t\t\t\t            </TD>\r\n");
        out.write("\t\t\t\t\t        </TR>\r\n");
        out.write("\t\t\t\t        </TABLE>\t\t\r\n");
        out.write("\t\t\t\t        <BR>\r\n");
        out.write("\t\t\t\t    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_out_3.setValue("${aQueryName}");
    _jspx_th_c_out_3.setEscapeXml("false");
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest("${ !empty reRunQuery }");
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<TABLE border=\"0\" class=\"contentPage\" width=\"100%\">\r\n");
        out.write("\t\t\t\t\t\t\t<TR>\r\n");
        out.write("\t\t\t\t\t\t\t\t<TD width=\"40%\">&nbsp;</TD>\r\n");
        out.write("\t\t\t\t\t\t\t\t<TD align=\"right\" width=\"60%\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<font color=\"red\">Query \"");
        if (_jspx_meth_c_out_4(_jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\" ran successfully.</font><br>\r\n");
        out.write("\t\t\t\t\t            </TD>\r\n");
        out.write("\t\t\t\t\t        </TR>\r\n");
        out.write("\t\t\t\t        </TABLE>\t\t\r\n");
        out.write("\t\t\t\t        <BR>\r\n");
        out.write("\t\t\t\t    ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_out_4.setValue("${aQueryName}");
    _jspx_th_c_out_4.setEscapeXml("false");
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest("${ !empty aSavedQueryId }");
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_form_0(_jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\t\r\n");
        out.write("\t\t\t\t \t");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_html_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_focus_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_html_form_0.setAction("SaveQueryAction.do?method=save");
    _jspx_th_html_form_0.setFocus("queryName");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<TABLE border=\"0\" class=\"contentPage\" width=\"100%\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<TD width=\"20%\">&nbsp;</TD>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<TD align=\"left\" width=\"80%\">\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t \t\t\t\t");
        if (_jspx_meth_html_radio_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("Update saved query \"");
        if (_jspx_meth_c_out_5(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\" with the new criteria. \r\n");
        out.write("\t\t\t\t\t\t\t \t\t\t\t<br>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_radio_1(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("Save this criteria as a new saved query called ");
        if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write(".             \t\t\t\t\t\t           \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
        out.write("\t\t\t\t\t\t                <input type=\"submit\" value=\"Save Query\" src=\"images/savequery.gif\" />\r\n");
        out.write("\t\t\t\t\t\t            </TD>\r\n");
        out.write("\t\t\t\t\t\t        </TR>\r\n");
        out.write("\t\t\t\t\t        </TABLE>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_form_focus_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_html_radio_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_0 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_property_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_0.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_radio_0.setProperty("saveAsNew");
    _jspx_th_html_radio_0.setValue("no");
    int _jspx_eval_html_radio_0 = _jspx_th_html_radio_0.doStartTag();
    if (_jspx_th_html_radio_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_radio_value_property_nobody.reuse(_jspx_th_html_radio_0);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_c_out_5.setValue("${aQueryName}");
    _jspx_th_c_out_5.setEscapeXml("false");
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_html_radio_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_radio_1 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_html_radio_value_property_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_radio_1.setPageContext(_jspx_page_context);
    _jspx_th_html_radio_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_radio_1.setProperty("saveAsNew");
    _jspx_th_html_radio_1.setValue("yes");
    int _jspx_eval_html_radio_1 = _jspx_th_html_radio_1.doStartTag();
    if (_jspx_th_html_radio_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_radio_value_property_nobody.reuse(_jspx_th_html_radio_1);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_value_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setStyleClass("formFieldUnSized");
    _jspx_th_html_text_0.setValue("My Saved Query");
    _jspx_th_html_text_0.setProperty("queryName");
    _jspx_th_html_text_0.setSize("20");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_value_styleClass_size_property_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_3.setTest("${ !empty currentUser }");
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_form_1(_jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t    ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_html_form_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_1 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_focus_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_1.setPageContext(_jspx_page_context);
    _jspx_th_html_form_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_html_form_1.setAction("SaveQueryAction.do?method=save");
    _jspx_th_html_form_1.setFocus("queryName");
    int _jspx_eval_html_form_1 = _jspx_th_html_form_1.doStartTag();
    if (_jspx_eval_html_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<TABLE border=\"0\" class=\"contentPage\" width=\"100%\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<TD width=\"40%\">&nbsp;</TD>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<TD align=\"right\" width=\"60%\">\r\n");
        out.write("\t\t\t\t\t\t\t            ");
        if (_jspx_meth_html_text_1(_jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t            \t\t\t\t<INPUT name=\"saveAsNew\" value=\"yes\" type=\"hidden\"/>\r\n");
        out.write("\t\t\t\t\t\t                <input type=\"submit\" value=\"Save Query\" src=\"images/savequery.gif\" />\r\n");
        out.write("\t\t\t\t\t\t            </TD>\r\n");
        out.write("\t\t\t\t\t\t        </TR>\r\n");
        out.write("\t\t\t\t\t        </TABLE>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_form_focus_action.reuse(_jspx_th_html_form_1);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_value_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_1.setStyleClass("formFieldUnSized");
    _jspx_th_html_text_1.setValue("My Saved Query");
    _jspx_th_html_text_1.setProperty("queryName");
    _jspx_th_html_text_1.setSize("20");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_value_styleClass_size_property_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t   <br>\r\n");
        out.write("\t\t\t\t    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_camod_cshelp_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:cshelp
    gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag _jspx_th_camod_cshelp_0 = (gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag) _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.get(gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag.class);
    _jspx_th_camod_cshelp_0.setPageContext(_jspx_page_context);
    _jspx_th_camod_cshelp_0.setParent(null);
    _jspx_th_camod_cshelp_0.setTopic("search_results_help");
    _jspx_th_camod_cshelp_0.setKey("ignore");
    _jspx_th_camod_cshelp_0.setImage("/camod/images/iconHelp.gif");
    _jspx_th_camod_cshelp_0.setText("");
    int _jspx_eval_camod_cshelp_0 = _jspx_th_camod_cshelp_0.doStartTag();
    if (_jspx_th_camod_cshelp_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.reuse(_jspx_th_camod_cshelp_0);
    return false;
  }

  private boolean _jspx_meth_display_column_0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_0 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_0.setPageContext(_jspx_page_context);
    _jspx_th_display_column_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_0.setTitle("No.");
    int _jspx_eval_display_column_0 = _jspx_th_display_column_0.doStartTag();
    if (_jspx_eval_display_column_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write(" \t                     ");
        if (_jspx_meth_c_out_6(_jspx_th_display_column_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_0);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
    _jspx_th_c_out_6.setValue("${row_rowNum}");
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_display_column_1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_1 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_1.setPageContext(_jspx_page_context);
    _jspx_th_display_column_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_1.setTitle("Model Id");
    _jspx_th_display_column_1.setSortable("true");
    _jspx_th_display_column_1.setHeaderClass("sortable");
    int _jspx_eval_display_column_1 = _jspx_th_display_column_1.doStartTag();
    if (_jspx_eval_display_column_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_0(_jspx_th_display_column_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_1);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_0 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_0.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_1);
    int _jspx_eval_camod_highlight_0 = _jspx_th_camod_highlight_0.doStartTag();
    if (_jspx_eval_camod_highlight_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_0.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_7(_jspx_th_camod_highlight_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_0);
    return false;
  }

  private boolean _jspx_meth_c_out_7(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_0);
    _jspx_th_c_out_7.setEscapeXml("false");
    _jspx_th_c_out_7.setValue("${row.modelId}");
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }

  private boolean _jspx_meth_display_column_2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_2 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_paramProperty_paramId_href.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_2.setPageContext(_jspx_page_context);
    _jspx_th_display_column_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_2.setHref("/camod/ViewModelAction.do?unprotected_method=populateModelCharacteristics&");
    _jspx_th_display_column_2.setParamId("aModelID");
    _jspx_th_display_column_2.setParamProperty("id");
    _jspx_th_display_column_2.setTitle("Model Descriptor");
    _jspx_th_display_column_2.setSortable("true");
    int _jspx_eval_display_column_2 = _jspx_th_display_column_2.doStartTag();
    if (_jspx_eval_display_column_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_if_1(_jspx_th_display_column_2, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t             \r\n");
        out.write("\t\t\t\t\t                 ");
        if (_jspx_meth_c_out_8(_jspx_th_display_column_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_if_2(_jspx_th_display_column_2, _jspx_page_context))
          return true;
        out.write("\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_if_3(_jspx_th_display_column_2, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                 \t\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_paramProperty_paramId_href.reuse(_jspx_th_display_column_2);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_2);
    _jspx_th_c_if_1.setTest("${row.externalSource == 'Jax MTB'}");
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<IMG src=\"/camod/images/mtb_logo.jpg\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_out_8(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_8.setPageContext(_jspx_page_context);
    _jspx_th_c_out_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_2);
    _jspx_th_c_out_8.setEscapeXml("false");
    _jspx_th_c_out_8.setValue("${row.modelDescriptor}");
    int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
    if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_8);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_2);
    _jspx_th_c_if_2.setTest("${not empty row.imageTitle}");
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<IMG src=\"/camod/images/image_icon.jpg\" width=\"20\" height=\"20\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_2);
    _jspx_th_c_if_3.setTest("${not empty row.microarray}");
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<IMG src=\"/camod/images/microarray_icon.jpg\" width=\"20\" height=\"20\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_display_column_3(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_3 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_3.setPageContext(_jspx_page_context);
    _jspx_th_display_column_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_3.setTitle("Species");
    _jspx_th_display_column_3.setSortable("true");
    int _jspx_eval_display_column_3 = _jspx_th_display_column_3.doStartTag();
    if (_jspx_eval_display_column_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_1(_jspx_th_display_column_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable.reuse(_jspx_th_display_column_3);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_1 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_1.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_3);
    int _jspx_eval_camod_highlight_1 = _jspx_th_camod_highlight_1.doStartTag();
    if (_jspx_eval_camod_highlight_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_1.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_9(_jspx_th_camod_highlight_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_1);
    return false;
  }

  private boolean _jspx_meth_c_out_9(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_9 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_9.setPageContext(_jspx_page_context);
    _jspx_th_c_out_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_1);
    _jspx_th_c_out_9.setValue("${row.species}");
    int _jspx_eval_c_out_9 = _jspx_th_c_out_9.doStartTag();
    if (_jspx_th_c_out_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
    return false;
  }

  private boolean _jspx_meth_display_column_4(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_4 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_4.setPageContext(_jspx_page_context);
    _jspx_th_display_column_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_4.setTitle("Tumor Sites");
    _jspx_th_display_column_4.setSortable("true");
    int _jspx_eval_display_column_4 = _jspx_th_display_column_4.doStartTag();
    if (_jspx_eval_display_column_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_2(_jspx_th_display_column_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable.reuse(_jspx_th_display_column_4);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_2 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_2.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_4);
    int _jspx_eval_camod_highlight_2 = _jspx_th_camod_highlight_2.doStartTag();
    if (_jspx_eval_camod_highlight_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_2.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_10(_jspx_th_camod_highlight_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_2);
    return false;
  }

  private boolean _jspx_meth_c_out_10(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_10 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_10.setPageContext(_jspx_page_context);
    _jspx_th_c_out_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_2);
    _jspx_th_c_out_10.setEscapeXml("false");
    _jspx_th_c_out_10.setValue("${row.tumorSites}");
    int _jspx_eval_c_out_10 = _jspx_th_c_out_10.doStartTag();
    if (_jspx_th_c_out_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_10);
    return false;
  }

  private boolean _jspx_meth_display_column_5(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_5 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_5.setPageContext(_jspx_page_context);
    _jspx_th_display_column_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_5.setTitle("Submitted by");
    _jspx_th_display_column_5.setSortable("true");
    int _jspx_eval_display_column_5 = _jspx_th_display_column_5.doStartTag();
    if (_jspx_eval_display_column_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_5.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_3(_jspx_th_display_column_5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable.reuse(_jspx_th_display_column_5);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_3(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_3 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_3.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_5);
    int _jspx_eval_camod_highlight_3 = _jspx_th_camod_highlight_3.doStartTag();
    if (_jspx_eval_camod_highlight_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_3.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_11(_jspx_th_camod_highlight_3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_3);
    return false;
  }

  private boolean _jspx_meth_c_out_11(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_11 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_11.setPageContext(_jspx_page_context);
    _jspx_th_c_out_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_3);
    _jspx_th_c_out_11.setEscapeXml("false");
    _jspx_th_c_out_11.setValue("${row.submitterName}");
    int _jspx_eval_c_out_11 = _jspx_th_c_out_11.doStartTag();
    if (_jspx_th_c_out_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_11);
    return false;
  }

  private boolean _jspx_meth_display_column_6(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_6 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_6.setPageContext(_jspx_page_context);
    _jspx_th_display_column_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_6.setTitle("Submitted Date");
    _jspx_th_display_column_6.setSortable("true");
    int _jspx_eval_display_column_6 = _jspx_th_display_column_6.doStartTag();
    if (_jspx_eval_display_column_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_6.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_4(_jspx_th_display_column_6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable.reuse(_jspx_th_display_column_6);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_4(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_4 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_4.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_6);
    int _jspx_eval_camod_highlight_4 = _jspx_th_camod_highlight_4.doStartTag();
    if (_jspx_eval_camod_highlight_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_4.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_12(_jspx_th_camod_highlight_4, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_4);
    return false;
  }

  private boolean _jspx_meth_c_out_12(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_12 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_12.setPageContext(_jspx_page_context);
    _jspx_th_c_out_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_4);
    _jspx_th_c_out_12.setEscapeXml("false");
    _jspx_th_c_out_12.setValue("${row.submittedDate}");
    int _jspx_eval_c_out_12 = _jspx_th_c_out_12.doStartTag();
    if (_jspx_th_c_out_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_12);
    return false;
  }

  private boolean _jspx_meth_display_column_7(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_7 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_7.setPageContext(_jspx_page_context);
    _jspx_th_display_column_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_7.setTitle("Strain");
    _jspx_th_display_column_7.setSortable("true");
    _jspx_th_display_column_7.setHeaderClass("sortable");
    int _jspx_eval_display_column_7 = _jspx_th_display_column_7.doStartTag();
    if (_jspx_eval_display_column_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_7.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_5(_jspx_th_display_column_7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_7);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_5(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_5 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_5.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_7);
    int _jspx_eval_camod_highlight_5 = _jspx_th_camod_highlight_5.doStartTag();
    if (_jspx_eval_camod_highlight_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_5.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_13(_jspx_th_camod_highlight_5, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_5);
    return false;
  }

  private boolean _jspx_meth_c_out_13(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_13 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_13.setPageContext(_jspx_page_context);
    _jspx_th_c_out_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_5);
    _jspx_th_c_out_13.setEscapeXml("false");
    _jspx_th_c_out_13.setValue("${row.strain}");
    int _jspx_eval_c_out_13 = _jspx_th_c_out_13.doStartTag();
    if (_jspx_th_c_out_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_13);
    return false;
  }

  private boolean _jspx_meth_display_column_8(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_8 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_8.setPageContext(_jspx_page_context);
    _jspx_th_display_column_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_8.setTitle("Principal Investigator");
    _jspx_th_display_column_8.setSortable("true");
    _jspx_th_display_column_8.setHeaderClass("sortable");
    int _jspx_eval_display_column_8 = _jspx_th_display_column_8.doStartTag();
    if (_jspx_eval_display_column_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_8.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_6(_jspx_th_display_column_8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_8);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_6(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_6 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_6.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_8);
    int _jspx_eval_camod_highlight_6 = _jspx_th_camod_highlight_6.doStartTag();
    if (_jspx_eval_camod_highlight_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_6.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_14(_jspx_th_camod_highlight_6, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_6);
    return false;
  }

  private boolean _jspx_meth_c_out_14(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_14 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_14.setPageContext(_jspx_page_context);
    _jspx_th_c_out_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_6);
    _jspx_th_c_out_14.setEscapeXml("false");
    _jspx_th_c_out_14.setValue("${row.principalInvestigatorName}");
    int _jspx_eval_c_out_14 = _jspx_th_c_out_14.doStartTag();
    if (_jspx_th_c_out_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_14);
    return false;
  }

  private boolean _jspx_meth_display_column_9(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_9 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_9.setPageContext(_jspx_page_context);
    _jspx_th_display_column_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_9.setTitle("Gender");
    _jspx_th_display_column_9.setSortable("true");
    _jspx_th_display_column_9.setHeaderClass("sortable");
    int _jspx_eval_display_column_9 = _jspx_th_display_column_9.doStartTag();
    if (_jspx_eval_display_column_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_9.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_7(_jspx_th_display_column_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_9);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_7(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_7 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_7.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_9);
    int _jspx_eval_camod_highlight_7 = _jspx_th_camod_highlight_7.doStartTag();
    if (_jspx_eval_camod_highlight_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_7.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_15(_jspx_th_camod_highlight_7, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_7);
    return false;
  }

  private boolean _jspx_meth_c_out_15(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_15 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_15.setPageContext(_jspx_page_context);
    _jspx_th_c_out_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_7);
    _jspx_th_c_out_15.setEscapeXml("false");
    _jspx_th_c_out_15.setValue("${row.gender}");
    int _jspx_eval_c_out_15 = _jspx_th_c_out_15.doStartTag();
    if (_jspx_th_c_out_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_15);
    return false;
  }

  private boolean _jspx_meth_display_column_10(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_10 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_10.setPageContext(_jspx_page_context);
    _jspx_th_display_column_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_10.setTitle("Transgene");
    _jspx_th_display_column_10.setSortable("true");
    _jspx_th_display_column_10.setHeaderClass("sortable");
    int _jspx_eval_display_column_10 = _jspx_th_display_column_10.doStartTag();
    if (_jspx_eval_display_column_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_10.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_8(_jspx_th_display_column_10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_10);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_8(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_8 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_8.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_10);
    int _jspx_eval_camod_highlight_8 = _jspx_th_camod_highlight_8.doStartTag();
    if (_jspx_eval_camod_highlight_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_8.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_16(_jspx_th_camod_highlight_8, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_8);
    return false;
  }

  private boolean _jspx_meth_c_out_16(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_16 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_16.setPageContext(_jspx_page_context);
    _jspx_th_c_out_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_8);
    _jspx_th_c_out_16.setEscapeXml("false");
    _jspx_th_c_out_16.setValue("${row.transgene}");
    int _jspx_eval_c_out_16 = _jspx_th_c_out_16.doStartTag();
    if (_jspx_th_c_out_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_16);
    return false;
  }

  private boolean _jspx_meth_display_column_11(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_11 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_11.setPageContext(_jspx_page_context);
    _jspx_th_display_column_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_11.setTitle("Transcriptional 1");
    _jspx_th_display_column_11.setSortable("true");
    _jspx_th_display_column_11.setHeaderClass("sortable");
    int _jspx_eval_display_column_11 = _jspx_th_display_column_11.doStartTag();
    if (_jspx_eval_display_column_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_11.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_9(_jspx_th_display_column_11, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_11);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_9(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_9 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_9.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_11);
    int _jspx_eval_camod_highlight_9 = _jspx_th_camod_highlight_9.doStartTag();
    if (_jspx_eval_camod_highlight_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_9.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_17(_jspx_th_camod_highlight_9, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_9);
    return false;
  }

  private boolean _jspx_meth_c_out_17(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_17 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_17.setPageContext(_jspx_page_context);
    _jspx_th_c_out_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_9);
    _jspx_th_c_out_17.setEscapeXml("false");
    _jspx_th_c_out_17.setValue("${row.transcriptional1}");
    int _jspx_eval_c_out_17 = _jspx_th_c_out_17.doStartTag();
    if (_jspx_th_c_out_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_17);
    return false;
  }

  private boolean _jspx_meth_display_column_12(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_12 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_12.setPageContext(_jspx_page_context);
    _jspx_th_display_column_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_12.setTitle("Segment Type");
    _jspx_th_display_column_12.setSortable("true");
    _jspx_th_display_column_12.setHeaderClass("sortable");
    int _jspx_eval_display_column_12 = _jspx_th_display_column_12.doStartTag();
    if (_jspx_eval_display_column_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_12.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_10(_jspx_th_display_column_12, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_12);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_10(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_10 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_10.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_12);
    int _jspx_eval_camod_highlight_10 = _jspx_th_camod_highlight_10.doStartTag();
    if (_jspx_eval_camod_highlight_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_10.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_18(_jspx_th_camod_highlight_10, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_10);
    return false;
  }

  private boolean _jspx_meth_c_out_18(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_18 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_18.setPageContext(_jspx_page_context);
    _jspx_th_c_out_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_10);
    _jspx_th_c_out_18.setEscapeXml("false");
    _jspx_th_c_out_18.setValue("${row.segmentType}");
    int _jspx_eval_c_out_18 = _jspx_th_c_out_18.doStartTag();
    if (_jspx_th_c_out_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_18);
    return false;
  }

  private boolean _jspx_meth_display_column_13(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_13 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_13.setPageContext(_jspx_page_context);
    _jspx_th_display_column_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_13.setTitle("Designator");
    _jspx_th_display_column_13.setSortable("true");
    _jspx_th_display_column_13.setHeaderClass("sortable");
    int _jspx_eval_display_column_13 = _jspx_th_display_column_13.doStartTag();
    if (_jspx_eval_display_column_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_13.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_11(_jspx_th_display_column_13, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_13);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_11(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_11 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_11.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_13);
    int _jspx_eval_camod_highlight_11 = _jspx_th_camod_highlight_11.doStartTag();
    if (_jspx_eval_camod_highlight_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_11.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_19(_jspx_th_camod_highlight_11, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_11);
    return false;
  }

  private boolean _jspx_meth_c_out_19(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_19 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_19.setPageContext(_jspx_page_context);
    _jspx_th_c_out_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_11);
    _jspx_th_c_out_19.setEscapeXml("false");
    _jspx_th_c_out_19.setValue("${row.designator}");
    int _jspx_eval_c_out_19 = _jspx_th_c_out_19.doStartTag();
    if (_jspx_th_c_out_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_19);
    return false;
  }

  private boolean _jspx_meth_display_column_14(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_14 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_14.setPageContext(_jspx_page_context);
    _jspx_th_display_column_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_14.setTitle("Targeted Gene / Locus");
    _jspx_th_display_column_14.setSortable("true");
    _jspx_th_display_column_14.setHeaderClass("sortable");
    int _jspx_eval_display_column_14 = _jspx_th_display_column_14.doStartTag();
    if (_jspx_eval_display_column_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_14.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_12(_jspx_th_display_column_14, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_14);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_12(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_12 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_12.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_14);
    int _jspx_eval_camod_highlight_12 = _jspx_th_camod_highlight_12.doStartTag();
    if (_jspx_eval_camod_highlight_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_12.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_20(_jspx_th_camod_highlight_12, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_12);
    return false;
  }

  private boolean _jspx_meth_c_out_20(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_20 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_20.setPageContext(_jspx_page_context);
    _jspx_th_c_out_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_12);
    _jspx_th_c_out_20.setEscapeXml("false");
    _jspx_th_c_out_20.setValue("${row.targetedGeneLocus}");
    int _jspx_eval_c_out_20 = _jspx_th_c_out_20.doStartTag();
    if (_jspx_th_c_out_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_20);
    return false;
  }

  private boolean _jspx_meth_display_column_15(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_15 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_15.setPageContext(_jspx_page_context);
    _jspx_th_display_column_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_15.setTitle("Type of Modification");
    _jspx_th_display_column_15.setSortable("true");
    _jspx_th_display_column_15.setHeaderClass("sortable");
    int _jspx_eval_display_column_15 = _jspx_th_display_column_15.doStartTag();
    if (_jspx_eval_display_column_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_15.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_13(_jspx_th_display_column_15, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_15);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_13(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_13 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_13.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_15);
    int _jspx_eval_camod_highlight_13 = _jspx_th_camod_highlight_13.doStartTag();
    if (_jspx_eval_camod_highlight_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_13.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_21(_jspx_th_camod_highlight_13, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_13);
    return false;
  }

  private boolean _jspx_meth_c_out_21(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_21 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_21.setPageContext(_jspx_page_context);
    _jspx_th_c_out_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_13);
    _jspx_th_c_out_21.setEscapeXml("false");
    _jspx_th_c_out_21.setValue("${row.typeOfModification}");
    int _jspx_eval_c_out_21 = _jspx_th_c_out_21.doStartTag();
    if (_jspx_th_c_out_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_21);
    return false;
  }

  private boolean _jspx_meth_display_column_16(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_16 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_16.setPageContext(_jspx_page_context);
    _jspx_th_display_column_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_16.setTitle("Name of inducing agent");
    _jspx_th_display_column_16.setSortable("true");
    _jspx_th_display_column_16.setHeaderClass("sortable");
    int _jspx_eval_display_column_16 = _jspx_th_display_column_16.doStartTag();
    if (_jspx_eval_display_column_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_16.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_14(_jspx_th_display_column_16, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_16);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_14(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_14 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_14.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_16);
    int _jspx_eval_camod_highlight_14 = _jspx_th_camod_highlight_14.doStartTag();
    if (_jspx_eval_camod_highlight_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_14.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_22(_jspx_th_camod_highlight_14, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_14);
    return false;
  }

  private boolean _jspx_meth_c_out_22(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_22 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_22.setPageContext(_jspx_page_context);
    _jspx_th_c_out_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_14);
    _jspx_th_c_out_22.setEscapeXml("false");
    _jspx_th_c_out_22.setValue("${row.nameOfInducingAgent}");
    int _jspx_eval_c_out_22 = _jspx_th_c_out_22.doStartTag();
    if (_jspx_th_c_out_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_22);
    return false;
  }

  private boolean _jspx_meth_display_column_17(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_17 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_17.setPageContext(_jspx_page_context);
    _jspx_th_display_column_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_17.setTitle("Gene Name");
    _jspx_th_display_column_17.setSortable("true");
    _jspx_th_display_column_17.setHeaderClass("sortable");
    int _jspx_eval_display_column_17 = _jspx_th_display_column_17.doStartTag();
    if (_jspx_eval_display_column_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_17.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_15(_jspx_th_display_column_17, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_17);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_15(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_15 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_15.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_17);
    int _jspx_eval_camod_highlight_15 = _jspx_th_camod_highlight_15.doStartTag();
    if (_jspx_eval_camod_highlight_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_15.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_23(_jspx_th_camod_highlight_15, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_15);
    return false;
  }

  private boolean _jspx_meth_c_out_23(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_23 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_23.setPageContext(_jspx_page_context);
    _jspx_th_c_out_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_15);
    _jspx_th_c_out_23.setEscapeXml("false");
    _jspx_th_c_out_23.setValue("${row.geneName}");
    int _jspx_eval_c_out_23 = _jspx_th_c_out_23.doStartTag();
    if (_jspx_th_c_out_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_23);
    return false;
  }

  private boolean _jspx_meth_display_column_18(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_18 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_18.setPageContext(_jspx_page_context);
    _jspx_th_display_column_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_18.setTitle("Chemical");
    _jspx_th_display_column_18.setSortable("true");
    _jspx_th_display_column_18.setHeaderClass("sortable");
    int _jspx_eval_display_column_18 = _jspx_th_display_column_18.doStartTag();
    if (_jspx_eval_display_column_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_18.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_16(_jspx_th_display_column_18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_18);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_16(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_16 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_16.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_18);
    int _jspx_eval_camod_highlight_16 = _jspx_th_camod_highlight_16.doStartTag();
    if (_jspx_eval_camod_highlight_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_16.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_24(_jspx_th_camod_highlight_16, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_16);
    return false;
  }

  private boolean _jspx_meth_c_out_24(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_24 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_24.setPageContext(_jspx_page_context);
    _jspx_th_c_out_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_16);
    _jspx_th_c_out_24.setEscapeXml("false");
    _jspx_th_c_out_24.setValue("${row.chemical}");
    int _jspx_eval_c_out_24 = _jspx_th_c_out_24.doStartTag();
    if (_jspx_th_c_out_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_24);
    return false;
  }

  private boolean _jspx_meth_display_column_19(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_19 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_19.setPageContext(_jspx_page_context);
    _jspx_th_display_column_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_19.setTitle("Environmental Factor");
    _jspx_th_display_column_19.setSortable("true");
    _jspx_th_display_column_19.setHeaderClass("sortable");
    int _jspx_eval_display_column_19 = _jspx_th_display_column_19.doStartTag();
    if (_jspx_eval_display_column_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_19.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_17(_jspx_th_display_column_19, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_19);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_17(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_17 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_17.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_19);
    int _jspx_eval_camod_highlight_17 = _jspx_th_camod_highlight_17.doStartTag();
    if (_jspx_eval_camod_highlight_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_17.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_25(_jspx_th_camod_highlight_17, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_17);
    return false;
  }

  private boolean _jspx_meth_c_out_25(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_25 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_25.setPageContext(_jspx_page_context);
    _jspx_th_c_out_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_17);
    _jspx_th_c_out_25.setEscapeXml("false");
    _jspx_th_c_out_25.setValue("${row.environmentalFactor}");
    int _jspx_eval_c_out_25 = _jspx_th_c_out_25.doStartTag();
    if (_jspx_th_c_out_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_25);
    return false;
  }

  private boolean _jspx_meth_display_column_20(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_20 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_20.setPageContext(_jspx_page_context);
    _jspx_th_display_column_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_20.setTitle("Viral Vector");
    _jspx_th_display_column_20.setSortable("true");
    _jspx_th_display_column_20.setHeaderClass("sortable");
    int _jspx_eval_display_column_20 = _jspx_th_display_column_20.doStartTag();
    if (_jspx_eval_display_column_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_20.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_18(_jspx_th_display_column_20, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_20);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_18(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_18 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_18.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_20);
    int _jspx_eval_camod_highlight_18 = _jspx_th_camod_highlight_18.doStartTag();
    if (_jspx_eval_camod_highlight_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_18.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_26(_jspx_th_camod_highlight_18, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_18);
    return false;
  }

  private boolean _jspx_meth_c_out_26(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_26 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_26.setPageContext(_jspx_page_context);
    _jspx_th_c_out_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_18);
    _jspx_th_c_out_26.setEscapeXml("false");
    _jspx_th_c_out_26.setValue("${row.viralVector}");
    int _jspx_eval_c_out_26 = _jspx_th_c_out_26.doStartTag();
    if (_jspx_th_c_out_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_26);
    return false;
  }

  private boolean _jspx_meth_display_column_21(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_21 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_21.setPageContext(_jspx_page_context);
    _jspx_th_display_column_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_21.setTitle("Gene");
    _jspx_th_display_column_21.setSortable("true");
    _jspx_th_display_column_21.setHeaderClass("sortable");
    int _jspx_eval_display_column_21 = _jspx_th_display_column_21.doStartTag();
    if (_jspx_eval_display_column_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_21.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_19(_jspx_th_display_column_21, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_21);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_19(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_19 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_19.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_21);
    int _jspx_eval_camod_highlight_19 = _jspx_th_camod_highlight_19.doStartTag();
    if (_jspx_eval_camod_highlight_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_19.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_27(_jspx_th_camod_highlight_19, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_19);
    return false;
  }

  private boolean _jspx_meth_c_out_27(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_27 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_27.setPageContext(_jspx_page_context);
    _jspx_th_c_out_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_19);
    _jspx_th_c_out_27.setEscapeXml("false");
    _jspx_th_c_out_27.setValue("${row.gene}");
    int _jspx_eval_c_out_27 = _jspx_th_c_out_27.doStartTag();
    if (_jspx_th_c_out_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_27);
    return false;
  }

  private boolean _jspx_meth_display_column_22(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_22 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_22.setPageContext(_jspx_page_context);
    _jspx_th_display_column_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_22.setTitle("Growth Factor");
    _jspx_th_display_column_22.setSortable("true");
    _jspx_th_display_column_22.setHeaderClass("sortable");
    int _jspx_eval_display_column_22 = _jspx_th_display_column_22.doStartTag();
    if (_jspx_eval_display_column_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_22.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_20(_jspx_th_display_column_22, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_22);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_20(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_20 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_20.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_22);
    int _jspx_eval_camod_highlight_20 = _jspx_th_camod_highlight_20.doStartTag();
    if (_jspx_eval_camod_highlight_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_20.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_28(_jspx_th_camod_highlight_20, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_20);
    return false;
  }

  private boolean _jspx_meth_c_out_28(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_28 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_28.setPageContext(_jspx_page_context);
    _jspx_th_c_out_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_20);
    _jspx_th_c_out_28.setEscapeXml("false");
    _jspx_th_c_out_28.setValue("${row.growthFactor}");
    int _jspx_eval_c_out_28 = _jspx_th_c_out_28.doStartTag();
    if (_jspx_th_c_out_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_28);
    return false;
  }

  private boolean _jspx_meth_display_column_23(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_23 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_23.setPageContext(_jspx_page_context);
    _jspx_th_display_column_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_23.setTitle("Hormone");
    _jspx_th_display_column_23.setSortable("true");
    _jspx_th_display_column_23.setHeaderClass("sortable");
    int _jspx_eval_display_column_23 = _jspx_th_display_column_23.doStartTag();
    if (_jspx_eval_display_column_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_23.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_21(_jspx_th_display_column_23, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_23);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_21(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_21 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_21.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_23);
    int _jspx_eval_camod_highlight_21 = _jspx_th_camod_highlight_21.doStartTag();
    if (_jspx_eval_camod_highlight_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_21.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_29(_jspx_th_camod_highlight_21, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_21);
    return false;
  }

  private boolean _jspx_meth_c_out_29(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_29 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_29.setPageContext(_jspx_page_context);
    _jspx_th_c_out_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_21);
    _jspx_th_c_out_29.setEscapeXml("false");
    _jspx_th_c_out_29.setValue("${row.hormone}");
    int _jspx_eval_c_out_29 = _jspx_th_c_out_29.doStartTag();
    if (_jspx_th_c_out_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_29);
    return false;
  }

  private boolean _jspx_meth_display_column_24(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_24 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_24.setPageContext(_jspx_page_context);
    _jspx_th_display_column_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_24.setTitle("Nutritional Factor");
    _jspx_th_display_column_24.setSortable("true");
    _jspx_th_display_column_24.setHeaderClass("sortable");
    int _jspx_eval_display_column_24 = _jspx_th_display_column_24.doStartTag();
    if (_jspx_eval_display_column_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_24.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_22(_jspx_th_display_column_24, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_24);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_22(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_22 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_22.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_24);
    int _jspx_eval_camod_highlight_22 = _jspx_th_camod_highlight_22.doStartTag();
    if (_jspx_eval_camod_highlight_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_22.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_30(_jspx_th_camod_highlight_22, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_22);
    return false;
  }

  private boolean _jspx_meth_c_out_30(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_30 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_30.setPageContext(_jspx_page_context);
    _jspx_th_c_out_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_22);
    _jspx_th_c_out_30.setEscapeXml("false");
    _jspx_th_c_out_30.setValue("${row.nutritionalFactor}");
    int _jspx_eval_c_out_30 = _jspx_th_c_out_30.doStartTag();
    if (_jspx_th_c_out_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_30);
    return false;
  }

  private boolean _jspx_meth_display_column_25(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_25 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_25.setPageContext(_jspx_page_context);
    _jspx_th_display_column_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_25.setTitle("Radiation");
    _jspx_th_display_column_25.setSortable("true");
    _jspx_th_display_column_25.setHeaderClass("sortable");
    int _jspx_eval_display_column_25 = _jspx_th_display_column_25.doStartTag();
    if (_jspx_eval_display_column_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_25.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_23(_jspx_th_display_column_25, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_25);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_23(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_23 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_23.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_25);
    int _jspx_eval_camod_highlight_23 = _jspx_th_camod_highlight_23.doStartTag();
    if (_jspx_eval_camod_highlight_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_23.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_31(_jspx_th_camod_highlight_23, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_23);
    return false;
  }

  private boolean _jspx_meth_c_out_31(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_31 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_31.setPageContext(_jspx_page_context);
    _jspx_th_c_out_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_23);
    _jspx_th_c_out_31.setEscapeXml("false");
    _jspx_th_c_out_31.setValue("${row.radiation}");
    int _jspx_eval_c_out_31 = _jspx_th_c_out_31.doStartTag();
    if (_jspx_th_c_out_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_31);
    return false;
  }

  private boolean _jspx_meth_display_column_26(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_26 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_26.setPageContext(_jspx_page_context);
    _jspx_th_display_column_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_26.setTitle("Virus");
    _jspx_th_display_column_26.setSortable("true");
    _jspx_th_display_column_26.setHeaderClass("sortable");
    int _jspx_eval_display_column_26 = _jspx_th_display_column_26.doStartTag();
    if (_jspx_eval_display_column_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_26.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_26.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_24(_jspx_th_display_column_26, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_26);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_24(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_24 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_24.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_26);
    int _jspx_eval_camod_highlight_24 = _jspx_th_camod_highlight_24.doStartTag();
    if (_jspx_eval_camod_highlight_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_24.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_32(_jspx_th_camod_highlight_24, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_24);
    return false;
  }

  private boolean _jspx_meth_c_out_32(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_32 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_32.setPageContext(_jspx_page_context);
    _jspx_th_c_out_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_24);
    _jspx_th_c_out_32.setEscapeXml("false");
    _jspx_th_c_out_32.setValue("${row.virus}");
    int _jspx_eval_c_out_32 = _jspx_th_c_out_32.doStartTag();
    if (_jspx_th_c_out_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_32);
    return false;
  }

  private boolean _jspx_meth_display_column_27(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_27 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_27.setPageContext(_jspx_page_context);
    _jspx_th_display_column_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_27.setTitle("Year of Publication");
    _jspx_th_display_column_27.setSortable("true");
    _jspx_th_display_column_27.setHeaderClass("sortable");
    int _jspx_eval_display_column_27 = _jspx_th_display_column_27.doStartTag();
    if (_jspx_eval_display_column_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_27.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_27.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_25(_jspx_th_display_column_27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_27);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_25(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_25 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_25.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_27);
    int _jspx_eval_camod_highlight_25 = _jspx_th_camod_highlight_25.doStartTag();
    if (_jspx_eval_camod_highlight_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_25.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_33(_jspx_th_camod_highlight_25, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_25);
    return false;
  }

  private boolean _jspx_meth_c_out_33(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_33 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_33.setPageContext(_jspx_page_context);
    _jspx_th_c_out_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_25);
    _jspx_th_c_out_33.setEscapeXml("false");
    _jspx_th_c_out_33.setValue("${row.yearOfPublication}");
    int _jspx_eval_c_out_33 = _jspx_th_c_out_33.doStartTag();
    if (_jspx_th_c_out_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_33);
    return false;
  }

  private boolean _jspx_meth_display_column_28(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_28 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_28.setPageContext(_jspx_page_context);
    _jspx_th_display_column_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_28.setTitle("Journal");
    _jspx_th_display_column_28.setSortable("true");
    _jspx_th_display_column_28.setHeaderClass("sortable");
    int _jspx_eval_display_column_28 = _jspx_th_display_column_28.doStartTag();
    if (_jspx_eval_display_column_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_28.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_28.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_26(_jspx_th_display_column_28, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_28);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_26(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_26 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_26.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_28);
    int _jspx_eval_camod_highlight_26 = _jspx_th_camod_highlight_26.doStartTag();
    if (_jspx_eval_camod_highlight_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_26.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_26.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_34(_jspx_th_camod_highlight_26, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_26);
    return false;
  }

  private boolean _jspx_meth_c_out_34(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_34 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_34.setPageContext(_jspx_page_context);
    _jspx_th_c_out_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_26);
    _jspx_th_c_out_34.setEscapeXml("false");
    _jspx_th_c_out_34.setValue("${row.journal}");
    int _jspx_eval_c_out_34 = _jspx_th_c_out_34.doStartTag();
    if (_jspx_th_c_out_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_34);
    return false;
  }

  private boolean _jspx_meth_display_column_29(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_29 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_29.setPageContext(_jspx_page_context);
    _jspx_th_display_column_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_29.setTitle("PMID number");
    _jspx_th_display_column_29.setSortable("true");
    _jspx_th_display_column_29.setHeaderClass("sortable");
    int _jspx_eval_display_column_29 = _jspx_th_display_column_29.doStartTag();
    if (_jspx_eval_display_column_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_29.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_29.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_27(_jspx_th_display_column_29, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_29);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_27(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_29, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_27 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_27.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_29);
    int _jspx_eval_camod_highlight_27 = _jspx_th_camod_highlight_27.doStartTag();
    if (_jspx_eval_camod_highlight_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_27.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_27.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_35(_jspx_th_camod_highlight_27, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_27);
    return false;
  }

  private boolean _jspx_meth_c_out_35(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_35 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_35.setPageContext(_jspx_page_context);
    _jspx_th_c_out_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_27);
    _jspx_th_c_out_35.setEscapeXml("false");
    _jspx_th_c_out_35.setValue("${row.PMIDNumber}");
    int _jspx_eval_c_out_35 = _jspx_th_c_out_35.doStartTag();
    if (_jspx_th_c_out_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_35);
    return false;
  }

  private boolean _jspx_meth_display_column_30(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_30 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_30.setPageContext(_jspx_page_context);
    _jspx_th_display_column_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_30.setTitle("Site of Lesion / Tumor");
    _jspx_th_display_column_30.setSortable("true");
    _jspx_th_display_column_30.setHeaderClass("sortable");
    int _jspx_eval_display_column_30 = _jspx_th_display_column_30.doStartTag();
    if (_jspx_eval_display_column_30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_30.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_30.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_28(_jspx_th_display_column_30, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_30.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_30);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_28(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_28 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_28.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_30);
    int _jspx_eval_camod_highlight_28 = _jspx_th_camod_highlight_28.doStartTag();
    if (_jspx_eval_camod_highlight_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_28.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_28.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_36(_jspx_th_camod_highlight_28, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_28);
    return false;
  }

  private boolean _jspx_meth_c_out_36(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_36 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_36.setPageContext(_jspx_page_context);
    _jspx_th_c_out_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_28);
    _jspx_th_c_out_36.setEscapeXml("false");
    _jspx_th_c_out_36.setValue("${row.siteOfLesionTumor}");
    int _jspx_eval_c_out_36 = _jspx_th_c_out_36.doStartTag();
    if (_jspx_th_c_out_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_36);
    return false;
  }

  private boolean _jspx_meth_display_column_31(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_31 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_31.setPageContext(_jspx_page_context);
    _jspx_th_display_column_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_31.setTitle("Diagnosis");
    _jspx_th_display_column_31.setSortable("true");
    _jspx_th_display_column_31.setHeaderClass("sortable");
    int _jspx_eval_display_column_31 = _jspx_th_display_column_31.doStartTag();
    if (_jspx_eval_display_column_31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_31.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_31.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_29(_jspx_th_display_column_31, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_31.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_31);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_29(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_31, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_29 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_29.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_31);
    int _jspx_eval_camod_highlight_29 = _jspx_th_camod_highlight_29.doStartTag();
    if (_jspx_eval_camod_highlight_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_29.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_29.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_37(_jspx_th_camod_highlight_29, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_29);
    return false;
  }

  private boolean _jspx_meth_c_out_37(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_29, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_37 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_37.setPageContext(_jspx_page_context);
    _jspx_th_c_out_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_29);
    _jspx_th_c_out_37.setEscapeXml("false");
    _jspx_th_c_out_37.setValue("${row.diagnosis}");
    int _jspx_eval_c_out_37 = _jspx_th_c_out_37.doStartTag();
    if (_jspx_th_c_out_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_37);
    return false;
  }

  private boolean _jspx_meth_display_column_32(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_32 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_32.setPageContext(_jspx_page_context);
    _jspx_th_display_column_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_32.setTitle("Age of Onset");
    _jspx_th_display_column_32.setSortable("true");
    _jspx_th_display_column_32.setHeaderClass("sortable");
    int _jspx_eval_display_column_32 = _jspx_th_display_column_32.doStartTag();
    if (_jspx_eval_display_column_32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_32.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_32.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_30(_jspx_th_display_column_32, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_32.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_32);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_30(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_32, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_30 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_30.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_32);
    int _jspx_eval_camod_highlight_30 = _jspx_th_camod_highlight_30.doStartTag();
    if (_jspx_eval_camod_highlight_30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_30.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_30.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_38(_jspx_th_camod_highlight_30, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_30.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_30);
    return false;
  }

  private boolean _jspx_meth_c_out_38(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_38 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_38.setPageContext(_jspx_page_context);
    _jspx_th_c_out_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_30);
    _jspx_th_c_out_38.setEscapeXml("false");
    _jspx_th_c_out_38.setValue("${row.ageOfOnset}");
    int _jspx_eval_c_out_38 = _jspx_th_c_out_38.doStartTag();
    if (_jspx_th_c_out_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_38);
    return false;
  }

  private boolean _jspx_meth_display_column_33(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_33 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_33.setPageContext(_jspx_page_context);
    _jspx_th_display_column_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_33.setTitle("Tumor incidence over lifetime");
    _jspx_th_display_column_33.setSortable("true");
    _jspx_th_display_column_33.setHeaderClass("sortable");
    int _jspx_eval_display_column_33 = _jspx_th_display_column_33.doStartTag();
    if (_jspx_eval_display_column_33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_33.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_33.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_31(_jspx_th_display_column_33, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_33.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_33);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_31(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_31 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_31.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_33);
    int _jspx_eval_camod_highlight_31 = _jspx_th_camod_highlight_31.doStartTag();
    if (_jspx_eval_camod_highlight_31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_31.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_31.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_39(_jspx_th_camod_highlight_31, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_31.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_31);
    return false;
  }

  private boolean _jspx_meth_c_out_39(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_31, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_39 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_39.setPageContext(_jspx_page_context);
    _jspx_th_c_out_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_31);
    _jspx_th_c_out_39.setEscapeXml("false");
    _jspx_th_c_out_39.setValue("${row.tumorIncidenceOverLifetime}");
    int _jspx_eval_c_out_39 = _jspx_th_c_out_39.doStartTag();
    if (_jspx_th_c_out_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_39);
    return false;
  }

  private boolean _jspx_meth_display_column_34(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_34 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_34.setPageContext(_jspx_page_context);
    _jspx_th_display_column_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_34.setTitle("Site and Diagnosis of Metastasis");
    _jspx_th_display_column_34.setSortable("true");
    _jspx_th_display_column_34.setHeaderClass("sortable");
    int _jspx_eval_display_column_34 = _jspx_th_display_column_34.doStartTag();
    if (_jspx_eval_display_column_34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_34 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_34.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_34.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_32(_jspx_th_display_column_34, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_34.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_34 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_34);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_32(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_34, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_32 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_32.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_34);
    int _jspx_eval_camod_highlight_32 = _jspx_th_camod_highlight_32.doStartTag();
    if (_jspx_eval_camod_highlight_32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_32.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_32.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_40(_jspx_th_camod_highlight_32, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_32.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_32);
    return false;
  }

  private boolean _jspx_meth_c_out_40(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_32, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_40 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_40.setPageContext(_jspx_page_context);
    _jspx_th_c_out_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_32);
    _jspx_th_c_out_40.setEscapeXml("false");
    _jspx_th_c_out_40.setValue("${row.siteAndDiagnosisOfMetastasis}");
    int _jspx_eval_c_out_40 = _jspx_th_c_out_40.doStartTag();
    if (_jspx_th_c_out_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_40);
    return false;
  }

  private boolean _jspx_meth_display_column_35(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_35 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_35.setPageContext(_jspx_page_context);
    _jspx_th_display_column_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_35.setTitle("Drug / Compound Name");
    _jspx_th_display_column_35.setSortable("true");
    _jspx_th_display_column_35.setHeaderClass("sortable");
    int _jspx_eval_display_column_35 = _jspx_th_display_column_35.doStartTag();
    if (_jspx_eval_display_column_35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_35 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_35.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_35.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_33(_jspx_th_display_column_35, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_35.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_35 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_35);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_33(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_35, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_33 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_33.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_35);
    int _jspx_eval_camod_highlight_33 = _jspx_th_camod_highlight_33.doStartTag();
    if (_jspx_eval_camod_highlight_33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_33.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_33.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_41(_jspx_th_camod_highlight_33, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_33.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_33);
    return false;
  }

  private boolean _jspx_meth_c_out_41(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_41 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_41.setPageContext(_jspx_page_context);
    _jspx_th_c_out_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_33);
    _jspx_th_c_out_41.setEscapeXml("false");
    _jspx_th_c_out_41.setValue("${row.drugCompoundName}");
    int _jspx_eval_c_out_41 = _jspx_th_c_out_41.doStartTag();
    if (_jspx_th_c_out_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_41);
    return false;
  }

  private boolean _jspx_meth_display_column_36(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_36 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_36.setPageContext(_jspx_page_context);
    _jspx_th_display_column_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_36.setTitle("Name of Cell line");
    _jspx_th_display_column_36.setSortable("true");
    _jspx_th_display_column_36.setHeaderClass("sortable");
    int _jspx_eval_display_column_36 = _jspx_th_display_column_36.doStartTag();
    if (_jspx_eval_display_column_36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_36 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_36.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_36.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_34(_jspx_th_display_column_36, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_36.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_36 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_36);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_34(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_36, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_34 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_34.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_36);
    int _jspx_eval_camod_highlight_34 = _jspx_th_camod_highlight_34.doStartTag();
    if (_jspx_eval_camod_highlight_34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_34 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_34.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_34.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_42(_jspx_th_camod_highlight_34, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_34.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_34 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_34);
    return false;
  }

  private boolean _jspx_meth_c_out_42(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_34, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_42 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_42.setPageContext(_jspx_page_context);
    _jspx_th_c_out_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_34);
    _jspx_th_c_out_42.setEscapeXml("false");
    _jspx_th_c_out_42.setValue("${row.nameOfCellLine}");
    int _jspx_eval_c_out_42 = _jspx_th_c_out_42.doStartTag();
    if (_jspx_th_c_out_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_42);
    return false;
  }

  private boolean _jspx_meth_display_column_37(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_37 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_37.setPageContext(_jspx_page_context);
    _jspx_th_display_column_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_37.setTitle("Organ / Tissue");
    _jspx_th_display_column_37.setSortable("true");
    _jspx_th_display_column_37.setHeaderClass("sortable");
    int _jspx_eval_display_column_37 = _jspx_th_display_column_37.doStartTag();
    if (_jspx_eval_display_column_37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_37 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_37.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_37.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_35(_jspx_th_display_column_37, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_37.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_37 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_37);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_35(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_37, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_35 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_35.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_37);
    int _jspx_eval_camod_highlight_35 = _jspx_th_camod_highlight_35.doStartTag();
    if (_jspx_eval_camod_highlight_35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_35 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_35.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_35.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_43(_jspx_th_camod_highlight_35, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_35.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_35 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_35);
    return false;
  }

  private boolean _jspx_meth_c_out_43(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_35, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_43 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_43.setPageContext(_jspx_page_context);
    _jspx_th_c_out_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_35);
    _jspx_th_c_out_43.setEscapeXml("false");
    _jspx_th_c_out_43.setValue("${row.organTissue}");
    int _jspx_eval_c_out_43 = _jspx_th_c_out_43.doStartTag();
    if (_jspx_th_c_out_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_43);
    return false;
  }

  private boolean _jspx_meth_display_column_38(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_38 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_38.setPageContext(_jspx_page_context);
    _jspx_th_display_column_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_38.setTitle("Image Title");
    _jspx_th_display_column_38.setSortable("true");
    _jspx_th_display_column_38.setHeaderClass("sortable");
    int _jspx_eval_display_column_38 = _jspx_th_display_column_38.doStartTag();
    if (_jspx_eval_display_column_38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_38 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_38.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_38.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_36(_jspx_th_display_column_38, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_38.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_38 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_38);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_36(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_38, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_36 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_36.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_38);
    int _jspx_eval_camod_highlight_36 = _jspx_th_camod_highlight_36.doStartTag();
    if (_jspx_eval_camod_highlight_36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_36 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_36.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_36.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_44(_jspx_th_camod_highlight_36, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_36.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_36 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_36);
    return false;
  }

  private boolean _jspx_meth_c_out_44(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_36, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_44 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_44.setPageContext(_jspx_page_context);
    _jspx_th_c_out_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_36);
    _jspx_th_c_out_44.setEscapeXml("false");
    _jspx_th_c_out_44.setValue("${row.imageTitle}");
    int _jspx_eval_c_out_44 = _jspx_th_c_out_44.doStartTag();
    if (_jspx_th_c_out_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_44);
    return false;
  }

  private boolean _jspx_meth_display_column_39(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_39 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_39.setPageContext(_jspx_page_context);
    _jspx_th_display_column_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_39.setTitle("Distributor");
    _jspx_th_display_column_39.setSortable("true");
    _jspx_th_display_column_39.setHeaderClass("sortable");
    int _jspx_eval_display_column_39 = _jspx_th_display_column_39.doStartTag();
    if (_jspx_eval_display_column_39 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_39 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_39.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_39.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_37(_jspx_th_display_column_39, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_39.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_39 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_39);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_37(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_39, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_37 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_37.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_39);
    int _jspx_eval_camod_highlight_37 = _jspx_th_camod_highlight_37.doStartTag();
    if (_jspx_eval_camod_highlight_37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_37 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_37.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_37.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_45(_jspx_th_camod_highlight_37, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_37.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_37 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_37);
    return false;
  }

  private boolean _jspx_meth_c_out_45(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_37, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_45 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_45.setPageContext(_jspx_page_context);
    _jspx_th_c_out_45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_37);
    _jspx_th_c_out_45.setEscapeXml("false");
    _jspx_th_c_out_45.setValue("${row.distributor}");
    int _jspx_eval_c_out_45 = _jspx_th_c_out_45.doStartTag();
    if (_jspx_th_c_out_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_45);
    return false;
  }

  private boolean _jspx_meth_display_column_40(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_40 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_40.setPageContext(_jspx_page_context);
    _jspx_th_display_column_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_40.setTitle("Cell line");
    _jspx_th_display_column_40.setSortable("true");
    _jspx_th_display_column_40.setHeaderClass("sortable");
    int _jspx_eval_display_column_40 = _jspx_th_display_column_40.doStartTag();
    if (_jspx_eval_display_column_40 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_40 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_40.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_40.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_38(_jspx_th_display_column_40, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_40.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_40 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_40);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_38(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_40, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_38 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_38.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_40);
    int _jspx_eval_camod_highlight_38 = _jspx_th_camod_highlight_38.doStartTag();
    if (_jspx_eval_camod_highlight_38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_38 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_38.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_38.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_46(_jspx_th_camod_highlight_38, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_38.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_38 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_38);
    return false;
  }

  private boolean _jspx_meth_c_out_46(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_38, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_46 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_46.setPageContext(_jspx_page_context);
    _jspx_th_c_out_46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_38);
    _jspx_th_c_out_46.setEscapeXml("false");
    _jspx_th_c_out_46.setValue("${row.cellLine}");
    int _jspx_eval_c_out_46 = _jspx_th_c_out_46.doStartTag();
    if (_jspx_th_c_out_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_46);
    return false;
  }

  private boolean _jspx_meth_display_column_41(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_41 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_41.setPageContext(_jspx_page_context);
    _jspx_th_display_column_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_41.setTitle("Donor Species");
    _jspx_th_display_column_41.setSortable("true");
    _jspx_th_display_column_41.setHeaderClass("sortable");
    int _jspx_eval_display_column_41 = _jspx_th_display_column_41.doStartTag();
    if (_jspx_eval_display_column_41 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_41 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_41.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_41.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_39(_jspx_th_display_column_41, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_41.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_41 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_41);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_39(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_41, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_39 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_39.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_41);
    int _jspx_eval_camod_highlight_39 = _jspx_th_camod_highlight_39.doStartTag();
    if (_jspx_eval_camod_highlight_39 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_39 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_39.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_39.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_47(_jspx_th_camod_highlight_39, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_39.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_39 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_39);
    return false;
  }

  private boolean _jspx_meth_c_out_47(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_39, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_47 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_47.setPageContext(_jspx_page_context);
    _jspx_th_c_out_47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_39);
    _jspx_th_c_out_47.setEscapeXml("false");
    _jspx_th_c_out_47.setValue("${row.donorSpecies}");
    int _jspx_eval_c_out_47 = _jspx_th_c_out_47.doStartTag();
    if (_jspx_th_c_out_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_47);
    return false;
  }

  private boolean _jspx_meth_display_column_42(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_42 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_42.setPageContext(_jspx_page_context);
    _jspx_th_display_column_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_42.setTitle("Source Type");
    _jspx_th_display_column_42.setSortable("true");
    _jspx_th_display_column_42.setHeaderClass("sortable");
    int _jspx_eval_display_column_42 = _jspx_th_display_column_42.doStartTag();
    if (_jspx_eval_display_column_42 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_42 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_42.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_42.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_40(_jspx_th_display_column_42, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_42.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_42 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_42);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_40(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_42, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_40 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_40.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_42);
    int _jspx_eval_camod_highlight_40 = _jspx_th_camod_highlight_40.doStartTag();
    if (_jspx_eval_camod_highlight_40 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_40 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_40.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_40.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_48(_jspx_th_camod_highlight_40, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_40.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_40 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_40);
    return false;
  }

  private boolean _jspx_meth_c_out_48(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_40, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_48 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_48.setPageContext(_jspx_page_context);
    _jspx_th_c_out_48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_40);
    _jspx_th_c_out_48.setEscapeXml("false");
    _jspx_th_c_out_48.setValue("${row.sourceType}");
    int _jspx_eval_c_out_48 = _jspx_th_c_out_48.doStartTag();
    if (_jspx_th_c_out_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_48);
    return false;
  }

  private boolean _jspx_meth_display_column_43(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_43 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_43.setPageContext(_jspx_page_context);
    _jspx_th_display_column_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_43.setTitle("Carcinogen");
    _jspx_th_display_column_43.setSortable("true");
    _jspx_th_display_column_43.setHeaderClass("sortable");
    int _jspx_eval_display_column_43 = _jspx_th_display_column_43.doStartTag();
    if (_jspx_eval_display_column_43 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_43 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_43.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_43.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_41(_jspx_th_display_column_43, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_43.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_43 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_43);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_41(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_43, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_41 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_41.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_43);
    int _jspx_eval_camod_highlight_41 = _jspx_th_camod_highlight_41.doStartTag();
    if (_jspx_eval_camod_highlight_41 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_41 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_41.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_41.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_49(_jspx_th_camod_highlight_41, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_41.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_41 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_41);
    return false;
  }

  private boolean _jspx_meth_c_out_49(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_41, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_49 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_49.setPageContext(_jspx_page_context);
    _jspx_th_c_out_49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_41);
    _jspx_th_c_out_49.setEscapeXml("false");
    _jspx_th_c_out_49.setValue("${row.carcinogen}");
    int _jspx_eval_c_out_49 = _jspx_th_c_out_49.doStartTag();
    if (_jspx_th_c_out_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_49);
    return false;
  }

  private boolean _jspx_meth_display_column_44(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_44 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_44.setPageContext(_jspx_page_context);
    _jspx_th_display_column_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_44.setTitle("Publications");
    _jspx_th_display_column_44.setSortable("true");
    _jspx_th_display_column_44.setHeaderClass("sortable");
    int _jspx_eval_display_column_44 = _jspx_th_display_column_44.doStartTag();
    if (_jspx_eval_display_column_44 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_44 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_44.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_44.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_42(_jspx_th_display_column_44, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_44.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_44 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_44);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_42(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_42 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_42.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_44);
    int _jspx_eval_camod_highlight_42 = _jspx_th_camod_highlight_42.doStartTag();
    if (_jspx_eval_camod_highlight_42 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_42 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_42.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_42.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_50(_jspx_th_camod_highlight_42, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_42.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_42 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_42);
    return false;
  }

  private boolean _jspx_meth_c_out_50(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_42, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_50 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_50.setPageContext(_jspx_page_context);
    _jspx_th_c_out_50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_42);
    _jspx_th_c_out_50.setEscapeXml("false");
    _jspx_th_c_out_50.setValue("${row.publications}");
    int _jspx_eval_c_out_50 = _jspx_th_c_out_50.doStartTag();
    if (_jspx_th_c_out_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_50);
    return false;
  }

  private boolean _jspx_meth_display_column_45(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_45 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_sortable_headerClass.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_45.setPageContext(_jspx_page_context);
    _jspx_th_display_column_45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_45.setTitle("Microarray");
    _jspx_th_display_column_45.setSortable("true");
    _jspx_th_display_column_45.setHeaderClass("sortable");
    int _jspx_eval_display_column_45 = _jspx_th_display_column_45.doStartTag();
    if (_jspx_eval_display_column_45 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_45 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_45.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_45.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_camod_highlight_43(_jspx_th_display_column_45, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     ");
        int evalDoAfterBody = _jspx_th_display_column_45.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_45 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_sortable_headerClass.reuse(_jspx_th_display_column_45);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_43(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_45, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_43 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_43.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_45);
    int _jspx_eval_camod_highlight_43 = _jspx_th_camod_highlight_43.doStartTag();
    if (_jspx_eval_camod_highlight_43 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_43 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_43.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_43.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_51(_jspx_th_camod_highlight_43, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_43.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_43 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_highlight_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_43);
    return false;
  }

  private boolean _jspx_meth_c_out_51(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_43, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_51 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_51.setPageContext(_jspx_page_context);
    _jspx_th_c_out_51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_43);
    _jspx_th_c_out_51.setEscapeXml("false");
    _jspx_th_c_out_51.setValue("${row.microarray}");
    int _jspx_eval_c_out_51 = _jspx_th_c_out_51.doStartTag();
    if (_jspx_th_c_out_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_51);
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
