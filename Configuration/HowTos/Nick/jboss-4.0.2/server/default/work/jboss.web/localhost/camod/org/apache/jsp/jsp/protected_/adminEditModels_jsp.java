package org.apache.jsp.jsp.protected_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import gov.nih.nci.camod.webapp.util.SidebarUtil;
import gov.nih.nci.camod.Constants;
import java.util.List;
import gov.nih.nci.camod.Constants;
import gov.nih.nci.camod.Constants.*;

public final class adminEditModels_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_onsubmit_focus_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_messagesPresent;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_messages_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleClass_size_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_options_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_optionsCollection_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass_onclick;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_table_width_pagesize_name_id_cellspacing_cellpadding_border;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title_paramProperty_paramId_href;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_escapeXml_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

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
    _jspx_tagPool_html_form_onsubmit_focus_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_messagesPresent = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_messages_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleClass_size_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_options_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_optionsCollection_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_table_width_pagesize_name_id_cellspacing_cellpadding_border = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title_paramProperty_paramId_href = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_escapeXml_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_xhtml_nobody.release();
    _jspx_tagPool_html_link_styleClass_action.release();
    _jspx_tagPool_logic_present_name.release();
    _jspx_tagPool_logic_iterate_type_name_id.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_html_link_styleClass_href.release();
    _jspx_tagPool_html_form_onsubmit_focus_action.release();
    _jspx_tagPool_logic_messagesPresent.release();
    _jspx_tagPool_html_messages_id.release();
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.release();
    _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody.release();
    _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.release();
    _jspx_tagPool_html_select_styleClass_size_property.release();
    _jspx_tagPool_html_options_name_nobody.release();
    _jspx_tagPool_html_select_property.release();
    _jspx_tagPool_html_optionsCollection_name_nobody.release();
    _jspx_tagPool_html_submit_styleClass_onclick.release();
    _jspx_tagPool_html_submit_styleClass_property.release();
    _jspx_tagPool_bean_message_key_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_display_table_width_pagesize_name_id_cellspacing_cellpadding_border.release();
    _jspx_tagPool_display_column_title.release();
    _jspx_tagPool_display_column_title_paramProperty_paramId_href.release();
    _jspx_tagPool_c_out_value_escapeXml_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      			null, true, 32768, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


/*
 * $Id: adminEditModels_jsp.java,v 1.1 2008-07-22 19:38:59 pandyas Exp $
 *
 * $Log: not supported by cvs2svn $
 * Revision 1.10  2007/09/07 16:44:08  pandyas
 * Removed duplicate on adminEditModels as per Ulli request
 *
 * Revision 1.9  2007/09/07 16:10:55  pandyas
 * Modified button label for model id search in admin edit models filter
 *
 * Revision 1.8  2007/08/07 15:40:05  pandyas
 * Fixed clear button on adminEditModels.jsp
 *
 * Revision 1.7  2007/07/31 12:00:10  pandyas
 * VCDE silver level  and caMOD 2.3 changes
 *
 * Revision 1.6  2006/11/16 13:04:47  pandyas
 * Modified IMG SRC location to include complete location (added /camod/...)
 *
 * Revision 1.5  2006/11/10 22:02:27  pandyas
 * Format change - addded &nbsp; before help icon
 *
 * Revision 1.4  2006/10/23 14:15:25  pandyas
 * removed variables not used in final version of jsp
 *
 * Revision 1.3  2006/10/17 16:08:12  pandyas
 * modified during development of caMOD 2.2 - various
 *
 * Revision 1.2  2006/08/17 15:38:09  pandyas
 * updated on-line help from Robohelp to ePublisher - added link
 *
 * Revision 1.1  2005/11/18 21:07:44  georgeda
 * Defect #130, added superuser
 *
 *
 */

      out.write('\r');
      out.write('\n');
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
 * $Id: adminEditModels_jsp.java,v 1.1 2008-07-22 19:38:59 pandyas Exp $
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/prototype-1.4.0.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/scriptaculous.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/ajaxtags-1.2-beta2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT LANGUAGE=\"JavaScript\">\t\r\n");
      out.write("\tfunction blankModelId() {\r\n");
      out.write("        document.curationAssignmentForm.modelId.value = '';\r\n");
      out.write("    }\t\t\t\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_onsubmit_focus_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("SearchAdminAction.do");
      _jspx_th_html_form_0.setFocus("modelId");
      _jspx_th_html_form_0.setOnsubmit("transferFields()");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("<!-- adminEditModels.jsp -->\r\n");
          out.write("<!-- Main Content Begins -->\r\n");
          out.write("<TABLE cellpadding=\"10\" cellspacing=\"0\" border=\"0\" class=\"contentBegins\" width=\"100%\" height=\"100%\">\r\n");
          out.write("\t<tr><td>\t\r\n");
          out.write("\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"0\" width=\"100%\">\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formMessage\" colspan=\"3\">\r\n");
          out.write("\t\t\t\t");
          //  logic:messagesPresent
          org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
          _jspx_th_logic_messagesPresent_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_messagesPresent_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
          if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t  <ul>\r\n");
              out.write("\t\t\t\t    <font color=\"red\">\r\n");
              out.write("\t\t\t\t      ");
              //  html:messages
              org.apache.struts.taglib.html.MessagesTag _jspx_th_html_messages_0 = (org.apache.struts.taglib.html.MessagesTag) _jspx_tagPool_html_messages_id.get(org.apache.struts.taglib.html.MessagesTag.class);
              _jspx_th_html_messages_0.setPageContext(_jspx_page_context);
              _jspx_th_html_messages_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_0);
              _jspx_th_html_messages_0.setId("error");
              int _jspx_eval_html_messages_0 = _jspx_th_html_messages_0.doStartTag();
              if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.String error = null;
                if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_messages_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_messages_0.doInitBody();
                }
                error = (java.lang.String) _jspx_page_context.findAttribute("error");
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t        <li>");
                  out.print(error );
                  out.write("</li>\r\n");
                  out.write("\t\t\t\t      ");
                  int evalDoAfterBody = _jspx_th_html_messages_0.doAfterBody();
                  error = (java.lang.String) _jspx_page_context.findAttribute("error");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_html_messages_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_messages_id.reuse(_jspx_th_html_messages_0);
              out.write("\r\n");
              out.write("\t\t\t\t    </font>\r\n");
              out.write("\t\t\t\t  </ul>\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_messagesPresent_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_messagesPresent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_messagesPresent.reuse(_jspx_th_logic_messagesPresent_0);
          out.write("\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t    <td class=\"formTitle\" height=\"20\" colspan=\"8\">Edit Models (SuperUser)&nbsp;\r\n");
          out.write("\t\t    \t");
          if (_jspx_meth_camod_cshelp_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("</td>\t\t\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t    <td class=\"formRequiredNotice\" >&nbsp;</td>\r\n");
          out.write("\t\t\t\t<td class=\"formLabel\"><label for=\"field1\">Model Id:</label>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"formField\" colspan=\"4\">\t\t\t\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t &nbsp;&nbsp;\r\n");
          out.write("                \t<input class=\"actionButton\" type=\"submit\" value=\"Search by Model Id\" />\t\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t    <td class=\"formRequiredNotice\" >&nbsp;</td>\r\n");
          out.write("\t\t\t\t<td class=\"formLabel\"><label for=\"field1\">Model Name / Model Descriptor: </label>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"formField\" >\t\t\t\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_html_text_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_ajax_autocomplete_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\r\n");
          out.write("\t\t\t\t</td>&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t<td class=\"formRequiredNotice\" width=\"15\">&nbsp;</td>\r\n");
          out.write("\t\t\t\t<td class=\"formLabel\"><label for=\"field3\">State:</label></td>\r\n");
          out.write("\t\t\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t        ");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_0.setPageContext(_jspx_page_context);
          _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_0.setStyleClass("formFieldSized");
          _jspx_th_html_select_0.setSize("1");
          _jspx_th_html_select_0.setProperty("currentState");
          int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
          if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_0.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t            ");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_0 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_0.setPageContext(_jspx_page_context);
              _jspx_th_html_options_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
              _jspx_th_html_options_0.setName(Dropdowns.CURATIONSTATESWITHBLANKDROP);
              int _jspx_eval_html_options_0 = _jspx_th_html_options_0.doStartTag();
              if (_jspx_th_html_options_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_0);
              out.write("\r\n");
              out.write("\t\t            ");
              int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_styleClass_size_property.reuse(_jspx_th_html_select_0);
          out.write("\r\n");
          out.write("\t\t\t\t</td>\t\t\t\t\r\n");
          out.write("\t\t\t</tr>\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t    <td class=\"formRequiredNotice\" >&nbsp;</td>\r\n");
          out.write("\t\t\t    <td class=\"formLabel\"><label for=\"field1\">Screener:</label></td>\r\n");
          out.write("\t\t\t    <td class=\"formField\">\t\t\t\r\n");
          out.write("\t\t            ");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_1.setPageContext(_jspx_page_context);
          _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_1.setProperty("screener");
          int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
          if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_1.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t            ");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_1 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_1.setPageContext(_jspx_page_context);
              _jspx_th_html_options_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
              _jspx_th_html_options_1.setName(Dropdowns.USERSFORSCREENERROLEDROP);
              int _jspx_eval_html_options_1 = _jspx_th_html_options_1.doStartTag();
              if (_jspx_th_html_options_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_1);
              out.write("\r\n");
              out.write("\t\t            ");
              int evalDoAfterBody = _jspx_th_html_select_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_1);
          out.write("\r\n");
          out.write("\t\t\t    </td>&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t    <td class=\"formRequiredNotice\" >&nbsp;</td>\r\n");
          out.write("\t\t\t    <td class=\"formLabel\"><label for=\"field1\">Editor:</label></td>\r\n");
          out.write("\t\t\t    <td class=\"formField\">\t\t\t\r\n");
          out.write("\t\t            ");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_2 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_2.setPageContext(_jspx_page_context);
          _jspx_th_html_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_2.setProperty("editor");
          int _jspx_eval_html_select_2 = _jspx_th_html_select_2.doStartTag();
          if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_2.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t            ");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_2 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_2.setPageContext(_jspx_page_context);
              _jspx_th_html_options_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_2);
              _jspx_th_html_options_2.setName(Dropdowns.USERSFOREDITORROLEDROP);
              int _jspx_eval_html_options_2 = _jspx_th_html_options_2.doStartTag();
              if (_jspx_th_html_options_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_2);
              out.write("\r\n");
              out.write("\t\t            ");
              int evalDoAfterBody = _jspx_th_html_select_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_2);
          out.write("\r\n");
          out.write("\t\t\t    </td>\t\t\t\t\r\n");
          out.write("\t\t\t</tr>\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t    <td class=\"formRequiredNotice\" >&nbsp;</td>\r\n");
          out.write("\t\t\t\t<td class=\"formLabel\"><label for=\"field3\">External Data Source:</label></td>\r\n");
          out.write("\t\t\t\t<td class=\"formField\">\t\t\t\t\r\n");
          out.write("\t\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_3 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_3.setPageContext(_jspx_page_context);
          _jspx_th_html_select_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_3.setStyleClass("formFieldSized");
          _jspx_th_html_select_3.setSize("1");
          _jspx_th_html_select_3.setProperty("externalSource");
          int _jspx_eval_html_select_3 = _jspx_th_html_select_3.doStartTag();
          if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_3.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_3 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_3.setPageContext(_jspx_page_context);
              _jspx_th_html_options_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_3);
              _jspx_th_html_options_3.setName(Dropdowns.EXTERNALSOURCEQUERYDROP );
              int _jspx_eval_html_options_3 = _jspx_th_html_options_3.doStartTag();
              if (_jspx_th_html_options_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_3);
              out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_styleClass_size_property.reuse(_jspx_th_html_select_3);
          out.write("\r\n");
          out.write("\t\t\t    </td>&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t    <td class=\"formRequiredNotice\" >&nbsp;</td>\r\n");
          out.write("\t\t\t\t<td class=\"formLabel\"><label for=\"field2\">PI's Name:</label></td>\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t<td class=\"formField\">\t\t\t\t\r\n");
          out.write("\t\t\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_4 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_4.setPageContext(_jspx_page_context);
          _jspx_th_html_select_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_4.setStyleClass("formFieldSized");
          _jspx_th_html_select_4.setSize("1");
          _jspx_th_html_select_4.setProperty("principalInvestigator");
          int _jspx_eval_html_select_4 = _jspx_th_html_select_4.doStartTag();
          if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_4.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_4 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_4.setPageContext(_jspx_page_context);
              _jspx_th_html_options_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_4);
              _jspx_th_html_options_4.setName(Dropdowns.PRINCIPALINVESTIGATORQUERYDROP );
              int _jspx_eval_html_options_4 = _jspx_th_html_options_4.doStartTag();
              if (_jspx_th_html_options_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_4);
              out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_styleClass_size_property.reuse(_jspx_th_html_select_4);
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\t</td>\t\t\t\t\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t    <td class=\"formRequiredNotice\" >&nbsp;</td>\r\n");
          out.write("\t\t\t\t<td class=\"formLabel\"><label for=\"field3\">Species:</label></td>\r\n");
          out.write("\t\t\t\t<td class=\"formField\">\t\t\t\t\r\n");
          out.write("\t\t\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_5 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_5.setPageContext(_jspx_page_context);
          _jspx_th_html_select_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_5.setProperty("species");
          int _jspx_eval_html_select_5 = _jspx_th_html_select_5.doStartTag();
          if (_jspx_eval_html_select_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_5.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t");
              //  html:optionsCollection
              org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_0 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_name_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
              _jspx_th_html_optionsCollection_0.setPageContext(_jspx_page_context);
              _jspx_th_html_optionsCollection_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_5);
              _jspx_th_html_optionsCollection_0.setName( Dropdowns.NONHUMANSPECIESDROP );
              int _jspx_eval_html_optionsCollection_0 = _jspx_th_html_optionsCollection_0.doStartTag();
              if (_jspx_th_html_optionsCollection_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_optionsCollection_name_nobody.reuse(_jspx_th_html_optionsCollection_0);
              out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_5);
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\t</td>&nbsp;&nbsp;\t\t\t\t\r\n");
          out.write("\t\t\t</tr>\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td colspan=\"8\" align=\"right\">\t\r\n");
          out.write("\t\t\t\t<TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t<td align=\"right\">\r\n");
          out.write("\t\t\t\t\t\t  ");
          if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t  \r\n");
          out.write("\t\t\t\t\t\t  ");
          //  html:submit
          org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_1 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_styleClass_property.get(org.apache.struts.taglib.html.SubmitTag.class);
          _jspx_th_html_submit_1.setPageContext(_jspx_page_context);
          _jspx_th_html_submit_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_submit_1.setProperty(Constants.Parameters.ACTION);
          _jspx_th_html_submit_1.setStyleClass("actionButton");
          int _jspx_eval_html_submit_1 = _jspx_th_html_submit_1.doStartTag();
          if (_jspx_eval_html_submit_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_submit_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_submit_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_submit_1.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t  \t  ");
              if (_jspx_meth_bean_message_0(_jspx_th_html_submit_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t\t\t  ");
              int evalDoAfterBody = _jspx_th_html_submit_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_submit_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_submit_styleClass_property.reuse(_jspx_th_html_submit_1);
          out.write("\t\t\t\t\t\t  \r\n");
          out.write("\t\t\t\t\t\t  \r\n");
          out.write("\t\t\t\t  \t\t");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_form_onsubmit_focus_action.reuse(_jspx_th_html_form_0);
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t  \t\t</td>\r\n");
      out.write("\t\t\t  \t\t</tr>\r\n");
      out.write("\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t </TABLE>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </td></tr>\r\n");
      out.write("   \r\n");
      out.write("</TABLE>\t\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_camod_cshelp_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:cshelp
    gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag _jspx_th_camod_cshelp_0 = (gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag) _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.get(gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag.class);
    _jspx_th_camod_cshelp_0.setPageContext(_jspx_page_context);
    _jspx_th_camod_cshelp_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_camod_cshelp_0.setTopic("screening_model_help");
    _jspx_th_camod_cshelp_0.setKey("ignore");
    _jspx_th_camod_cshelp_0.setImage("/camod/images/iconHelp.gif");
    _jspx_th_camod_cshelp_0.setText("");
    int _jspx_eval_camod_cshelp_0 = _jspx_th_camod_cshelp_0.doStartTag();
    if (_jspx_th_camod_cshelp_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.reuse(_jspx_th_camod_cshelp_0);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setStyleClass("formFieldSized");
    _jspx_th_html_text_0.setStyleId("modelId");
    _jspx_th_html_text_0.setProperty("modelId");
    _jspx_th_html_text_0.setSize("20");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_1.setStyleClass("formFieldSized");
    _jspx_th_html_text_1.setStyleId("modelDescriptor");
    _jspx_th_html_text_1.setProperty("modelDescriptor");
    _jspx_th_html_text_1.setSize("20");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_ajax_autocomplete_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ajax:autocomplete
    org.ajaxtags.tags.AjaxAutocompleteTag _jspx_th_ajax_autocomplete_0 = (org.ajaxtags.tags.AjaxAutocompleteTag) _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.get(org.ajaxtags.tags.AjaxAutocompleteTag.class);
    _jspx_th_ajax_autocomplete_0.setPageContext(_jspx_page_context);
    _jspx_th_ajax_autocomplete_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_ajax_autocomplete_0.setBaseUrl("/camod/autocomplete.view");
    _jspx_th_ajax_autocomplete_0.setSource("modelDescriptor");
    _jspx_th_ajax_autocomplete_0.setTarget("modelDescriptor");
    _jspx_th_ajax_autocomplete_0.setParameters("modelDescriptor={modelDescriptor}");
    _jspx_th_ajax_autocomplete_0.setClassName("autocomplete");
    _jspx_th_ajax_autocomplete_0.setMinimumCharacters("1");
    int _jspx_eval_ajax_autocomplete_0 = _jspx_th_ajax_autocomplete_0.doStartTag();
    if (_jspx_th_ajax_autocomplete_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.reuse(_jspx_th_ajax_autocomplete_0);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_styleClass_onclick.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setStyleClass("actionButton");
    _jspx_th_html_submit_0.setOnclick("blankModelId()");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_submit_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t  Search\r\n");
        out.write("\t\t\t\t\t\t  ");
        int evalDoAfterBody = _jspx_th_html_submit_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_submit_styleClass_onclick.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_submit_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_submit_1);
    _jspx_th_bean_message_0.setKey("button.clear");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
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
    _jspx_th_c_if_0.setTest("${not empty adminModelSearchResults}");
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_display_table_0(_jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
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

  private boolean _jspx_meth_display_table_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:table
    org.displaytag.tags.el.ELTableTag _jspx_th_display_table_0 = (org.displaytag.tags.el.ELTableTag) _jspx_tagPool_display_table_width_pagesize_name_id_cellspacing_cellpadding_border.get(org.displaytag.tags.el.ELTableTag.class);
    _jspx_th_display_table_0.setPageContext(_jspx_page_context);
    _jspx_th_display_table_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_display_table_0.setUid("row");
    _jspx_th_display_table_0.setName("${sessionScope.adminModelSearchResults}");
    _jspx_th_display_table_0.setPagesize("15");
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
        out.write("\r\n");
        out.write(" \t    ");
        if (_jspx_meth_display_column_0(_jspx_th_display_table_0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t");
        if (_jspx_meth_display_column_1(_jspx_th_display_table_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_display_column_2(_jspx_th_display_table_0, _jspx_page_context))
          return true;
        out.write("     \r\n");
        out.write("\t\t");
        if (_jspx_meth_display_column_3(_jspx_th_display_table_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_choose_0(_jspx_th_display_table_0, _jspx_page_context))
          return true;
        out.write("            \r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_display_table_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_table_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_table_width_pagesize_name_id_cellspacing_cellpadding_border.reuse(_jspx_th_display_table_0);
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
        out.write(" \t        ");
        if (_jspx_meth_c_out_1(_jspx_th_display_column_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write(" \t    ");
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

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
    _jspx_th_c_out_1.setValue("${row_rowNum}");
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_display_column_1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_1 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title_paramProperty_paramId_href.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_1.setPageContext(_jspx_page_context);
    _jspx_th_display_column_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_1.setHref("/camod/SubmitAction.do?method=setModelConstants&");
    _jspx_th_display_column_1.setParamId("aModelID");
    _jspx_th_display_column_1.setParamProperty("id");
    _jspx_th_display_column_1.setTitle("Model Descriptor");
    int _jspx_eval_display_column_1 = _jspx_th_display_column_1.doStartTag();
    if (_jspx_eval_display_column_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_out_2(_jspx_th_display_column_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_display_column_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title_paramProperty_paramId_href.reuse(_jspx_th_display_column_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_1);
    _jspx_th_c_out_2.setEscapeXml("false");
    _jspx_th_c_out_2.setValue("${row.modelDescriptor}");
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_display_column_2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_2 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_2.setPageContext(_jspx_page_context);
    _jspx_th_display_column_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_2.setTitle("Submitter's Name");
    int _jspx_eval_display_column_2 = _jspx_th_display_column_2.doStartTag();
    if (_jspx_eval_display_column_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_out_3(_jspx_th_display_column_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_display_column_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_2);
    _jspx_th_c_out_3.setEscapeXml("false");
    _jspx_th_c_out_3.setValue("${row.submitterName}");
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_display_column_3(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_3 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_3.setPageContext(_jspx_page_context);
    _jspx_th_display_column_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_3.setTitle("Entered on");
    int _jspx_eval_display_column_3 = _jspx_th_display_column_3.doStartTag();
    if (_jspx_eval_display_column_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_out_4(_jspx_th_display_column_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_display_column_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_3);
    _jspx_th_c_out_4.setValue("${row.submittedDate}");
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_when_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_otherwise_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
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
    _jspx_th_c_when_0.setTest("${row.state == 'Inactive'}");
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
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
        out.write("\t\t\t");
        if (_jspx_meth_display_column_4(_jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_display_column_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.el.ELColumnTag _jspx_th_display_column_4 = (org.displaytag.tags.el.ELColumnTag) _jspx_tagPool_display_column_title.get(org.displaytag.tags.el.ELColumnTag.class);
    _jspx_th_display_column_4.setPageContext(_jspx_page_context);
    _jspx_th_display_column_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_display_column_4.setTitle("Inactivate");
    int _jspx_eval_display_column_4 = _jspx_th_display_column_4.doStartTag();
    if (_jspx_eval_display_column_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t         \t<center>\r\n");
        out.write("\t             \t");
        if (_jspx_meth_c_set_0(_jspx_th_display_column_4, _jspx_page_context))
          return true;
        out.write("\t         \t\r\n");
        out.write("\t\t\t\t    ");
        if (_jspx_meth_c_set_1(_jspx_th_display_column_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t         <a href='");
        if (_jspx_meth_c_out_5(_jspx_th_display_column_4, _jspx_page_context))
          return true;
        out.write("' onclick='");
        if (_jspx_meth_c_out_6(_jspx_th_display_column_4, _jspx_page_context))
          return true;
        out.write("' ><IMG src=\"/camod/images/remove.gif\" border=0></a>\r\n");
        out.write("\t\t\t\t </center>\r\n");
        out.write("\t       \t \t");
        int evalDoAfterBody = _jspx_th_display_column_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_4);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_4);
    _jspx_th_c_set_0.setVar("inactiveLink");
    _jspx_th_c_set_0.setValue("return confirm('Are you sure you want to inactivate this record (${row.modelDescriptor})?');");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_4);
    _jspx_th_c_set_1.setVar("uri");
    _jspx_th_c_set_1.setValue("ChangeAnimalModelToInactiveAction.do?&aEvent=inactivate&aModelID=${row.modelId}");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_4);
    _jspx_th_c_out_5.setValue("${uri}");
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_4);
    _jspx_th_c_out_6.setValue("${inactiveLink}");
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
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
