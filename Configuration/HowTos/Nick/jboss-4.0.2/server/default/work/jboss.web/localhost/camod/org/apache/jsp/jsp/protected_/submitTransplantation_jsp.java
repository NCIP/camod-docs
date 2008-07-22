package org.apache.jsp.jsp.protected_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import gov.nih.nci.camod.webapp.util.SidebarUtil;
import gov.nih.nci.camod.Constants;
import java.util.List;
import gov.nih.nci.camod.Constants;
import gov.nih.nci.camod.domain.AnimalModel;
import gov.nih.nci.camod.domain.Strain;
import gov.nih.nci.camod.webapp.form.TransplantationForm;
import gov.nih.nci.camod.Constants.*;
import java.util.List;
import gov.nih.nci.camod.Constants.Dropdowns;

public final class submitTransplantation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_focus_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_size_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleClass_size_property_onchange;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_optionsCollection_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_options_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleClass_size_property_onclick;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_textarea_styleClass_rows_property_onkeypress_cols_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_textarea_styleClass_rows_property_disabled_cols_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_textarea_styleClass_rows_property_cols_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_reset_styleClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass_property_onclick;

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
    _jspx_tagPool_html_form_focus_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_errors_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_size_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleClass_size_property_onchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_optionsCollection_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_options_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleClass_size_property_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_textarea_styleClass_rows_property_onkeypress_cols_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_textarea_styleClass_rows_property_disabled_cols_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_textarea_styleClass_rows_property_cols_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_reset_styleClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass_property_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_xhtml_nobody.release();
    _jspx_tagPool_html_link_styleClass_action.release();
    _jspx_tagPool_logic_present_name.release();
    _jspx_tagPool_logic_iterate_type_name_id.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_html_link_styleClass_href.release();
    _jspx_tagPool_html_form_focus_action.release();
    _jspx_tagPool_html_errors_nobody.release();
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.release();
    _jspx_tagPool_html_text_styleClass_size_property_nobody.release();
    _jspx_tagPool_html_select_styleClass_size_property_onchange.release();
    _jspx_tagPool_html_optionsCollection_name_nobody.release();
    _jspx_tagPool_html_options_name_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_html_hidden_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_html_select_styleClass_size_property_onclick.release();
    _jspx_tagPool_html_textarea_styleClass_rows_property_onkeypress_cols_nobody.release();
    _jspx_tagPool_html_textarea_styleClass_rows_property_disabled_cols_nobody.release();
    _jspx_tagPool_html_textarea_styleClass_rows_property_cols_nobody.release();
    _jspx_tagPool_html_submit_styleClass.release();
    _jspx_tagPool_bean_message_key_nobody.release();
    _jspx_tagPool_html_reset_styleClass.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_html_submit_styleClass_property_onclick.release();
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
 * $Id: submitTransplantation_jsp.java,v 1.1 2008-07-22 19:39:02 pandyas Exp $
 * 
 * $Log: not supported by cvs2svn $
 * Revision 1.1  2007/10/31 19:25:33  pandyas
 * Fixed #8290 	Rename graft object into transplantation object
 *
 * Revision 1.2  2007/08/22 13:59:50  pandyas
 * bug #8363: Problems with "other" filed on updated graft page on dev - filed writable when user selects a value for various dropdowns
 *
 * Revision 1.1  2007/08/07 19:36:47  pandyas
 * Removed reference to Transplant as per VCDE comments and after modification to object definition for CDE
 *
 * Revision 1.1  2007/07/31 12:00:10  pandyas
 * VCDE silver level  and caMOD 2.3 changes
 *
 * Revision 1.55  2007/06/18 16:12:14  pandyas
 * Fixedmethod name for Zebrafish tree and made text entry enable
 *
 * Revision 1.54  2007/05/18 15:35:31  pandyas
 * Modified species and organ tree to default to no organ button and to work when user goes from species to empty selection
 *
 * Revision 1.53  2007/05/17 19:10:45  pandyas
 * Modified for organ tree code - needs to populate select button correctly still
 *
 * Revision 1.52  2007/05/17 17:58:50  pandyas
 * Consolidated all the clear field scripts to reuse generically on all vocab tree screens where tree value in not a required field
 *
 * Revision 1.51  2007/05/17 12:24:17  pandyas
 * Modified screen to display EVSTree vacabulary
 *
 * Revision 1.50  2007/05/10 02:19:32  pandyas
 * Implemented species specific vocabulary trees from EVSTree
 *
 * Revision 1.49  2007/04/25 15:05:51  pandyas
 * Agreed on one help icon for all title bars and one icon for light grey tool tip - removed all others
 *
 * Revision 1.48  2007/04/04 13:25:19  pandyas
 * Modified name for conditioning regimen and target site
 *
 * Revision 1.47  2007/03/26 12:08:01  pandyas
 * caMOd 2.3 enhancements for Zebrafish support
 *
 * Revision 1.46  2006/11/10 22:01:34  pandyas
 * TestTrack #465 - delete tooltops, keep tooltips for vocabulary trees and link them to vocab tree help pages
 *
 * Revision 1.45  2006/10/27 13:01:26  pandyas
 * topic="skip" allows us to remove the onclick for ToolTips while preserving it for the title of each page
 *
 * Revision 1.44  2006/08/13 18:29:32  pandyas
 * updated on-line help from Robohelp to ePublisher - modified links
 *
 * Revision 1.43  2006/05/24 16:37:50  georgeda
 * Slight cleanup of clear button
 *
 * Revision 1.42  2006/05/19 18:50:28  pandyas
 * defect #225 - Add clearOrgan functionality to Xenograft screen
 *
 * Revision 1.41  2006/05/19 16:45:00  pandyas
 * Defect #249 - add other to species on the Xenograft screen, needed to add javascript code and field
 *
 * Revision 1.40  2006/05/03 19:05:50  georgeda
 * Move to new EVSTree
 *
 * Revision 1.39  2006/04/20 19:46:23  pandyas
 * Modified host species/  host strain / otherHostStrain text on Xenograft screen
 *
 * Revision 1.38  2006/04/17 19:17:03  pandyas
 * caMod 2.1 OM changes
 *
 * Revision 1.37  2006/03/31 13:47:17  georgeda
 * Changed the EVSTree call to work w/ new servers
 *
 * Revision 1.36  2006/01/17 19:12:57  pandyas
 * Defect# 378: ToolTip to Organ/Tissue links to histopathology_help instead of xenograft_transplant_help
 *
 * Revision 1.35  2005/12/21 18:00:02  pandyas
 * Modified jsp to add test for other fields - and cleaned up the javascript
 *
 * Revision 1.34  2005/12/12 17:33:37  georgeda
 * Defect #265, store host/origin species in correct places
 *
 * Revision 1.33  2005/12/05 21:29:32  pandyas
 * Follow up for defect#191:  moved text above drop down boxes on page to be consistent.
 *
 * Revision 1.32  2005/12/01 20:04:07  schroedn
 * Defect #243
 *
 * Changed the way the method of observation and observation fields interact. when observation is blank 'method of observation' is greyed out and when the user types in obsevation, the other is editable
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
 * $Id: submitTransplantation_jsp.java,v 1.1 2008-07-22 19:39:02 pandyas Exp $
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
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language=\"JavaScript\" src=\"scripts/EVSTreeScript.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- needed for tooltips -->\r\n");
      out.write("<DIV id=\"TipLayer\" style=\"visibility:hidden;position:absolute;z-index:1000;top:-100;\"></DIV>\r\n");
      out.write("<script language=\"JavaScript\" src=\"scripts/global.js\"></script>\r\n");
      out.write("\r\n");

	String aTransplantID = request.getParameter( "aTransplantID" );
    String isDeleted = (String) request.getAttribute(Constants.Parameters.DELETED);
    
	//if aTransplantID is passed in, then we are dealing with a previously entered model and are editing it
	//otherwise, create a new one
	
	String actionName = "TransplantationAction.do?method=save";
	
	if ( aTransplantID != null && aTransplantID.length() > 0 && isDeleted == null) {
		actionName = "TransplantationAction.do?method=edit";
	}
	else {
	    aTransplantID = "";
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<SCRIPT LANGUAGE=\"JavaScript\">\r\n");
      out.write("\tfunction getResults(control) {\r\n");
      out.write("\t\tgetOptions( control );\r\n");
      out.write("\t\tchkOtherSpecies();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction getOptions( control ) {\r\n");
      out.write("\t\tform = control.form;\r\n");
      out.write("\t\tform.action  = \"TransplantationPopulateAction.do?method=setStrainOrganValues\";\r\n");
      out.write("\t\tform.submit();\t\t\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\t\r\n");
      out.write("\tfunction chkOtherSpecies() {\t\r\n");
      out.write("\t\tchkOther(document.forms[0].donorScientificName, document.forms[0].otherDonorScientificName);\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction chkOtherStrain() {\r\n");
      out.write("\t\tchkOther(document.forms[0].donorEthinicityStrain, document.forms[0].otherDonorEthinicityStrain);\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction chkObservation() {\r\n");
      out.write("\t\r\n");
      out.write("\t    geneticManipulation = document.forms[0].geneticManipulation;\r\n");
      out.write("\t\r\n");
      out.write("\t\tif( geneticManipulation.value != null && geneticManipulation.value != \"\" ) {\r\n");
      out.write("\t\t\tenableField(document.forms[0].modificationDescription);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse {\r\n");
      out.write("\t\t\tdisableField(document.forms[0].modificationDescription);\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_focus_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction( actionName );
      _jspx_th_html_form_0.setFocus("name");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("<!-- submitTransplantation.jsp -->\r\n");
          out.write("<!-- Main Content Begins -->\r\n");
          out.write("<TABLE cellpadding=\"10\" cellspacing=\"0\" border=\"0\" class=\"contentBegins\" width=\"100%\" height=\"100%\">\r\n");
          out.write("<tr><td>\r\n");
          out.write("\t<TABLE summary=\"\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"contentPage\" width=\"100%\" height=\"100%\">\r\n");
          out.write("\t<tr><td valign=\"top\">\r\n");
          out.write("\r\n");
          out.write("\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"0\" align=\"left\">\r\n");
          out.write("\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t");
          if (_jspx_meth_html_errors_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t<td class=\"formMessage\" colspan=\"3\">* indicates a required field</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formTitle\" height=\"20\" colspan=\"3\">Transplantation\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_camod_cshelp_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">*</td>\r\n");
          out.write("\t\t<td class=\"formRequiredLabel\"><label for=\"field1\">Name of Transplantation:</label>\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">*</td>\r\n");
          out.write("\t\t<td class=\"formRequiredLabel\"><label for=\"field3\">Donor Species:</label></td>\r\n");
          out.write("\t\t<td class=\"formField\">\r\n");
          out.write("\t\t<br>\r\n");
          out.write("\t\t<label for=\"field3\">- if species is not listed, <br>then please select \"Other\" and then specify it below:</label>\r\n");
          out.write("\t\t<br>\r\n");
          out.write("\t\t<br>\t\t\r\n");
          out.write("\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property_onchange.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_0.setPageContext(_jspx_page_context);
          _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_0.setStyleClass("formFieldSized");
          _jspx_th_html_select_0.setSize("1");
          _jspx_th_html_select_0.setProperty("donorScientificName");
          _jspx_th_html_select_0.setOnchange("getResults(this);");
          int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
          if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_0.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  html:optionsCollection
              org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_0 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_name_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
              _jspx_th_html_optionsCollection_0.setPageContext(_jspx_page_context);
              _jspx_th_html_optionsCollection_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
              _jspx_th_html_optionsCollection_0.setName( Dropdowns.SPECIESQUERYDROP );
              int _jspx_eval_html_optionsCollection_0 = _jspx_th_html_optionsCollection_0.doStartTag();
              if (_jspx_th_html_optionsCollection_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_optionsCollection_name_nobody.reuse(_jspx_th_html_optionsCollection_0);
              out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_styleClass_size_property_onchange.reuse(_jspx_th_html_select_0);
          out.write("\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\"><label for=\"field1\">if other Species:</label></td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_html_text_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\t\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\t\r\n");
          out.write("\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">*</td>\r\n");
          out.write("\t\t<td class=\"formRequiredLabel\"><label for=\"field3\">Donor Strain:</label></td>\r\n");
          out.write("\t\t<td class=\"formField\">\r\n");
          out.write("\t\t<br>\r\n");
          out.write("\t\t<label for=\"field3\">- if strain is not listed, <br>then please select \"Other\" and then specify it below:</label>\r\n");
          out.write("\t\t<br>\r\n");
          out.write("\t\t<br>\r\n");
          out.write("\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property_onchange.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_1.setPageContext(_jspx_page_context);
          _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_1.setStyleClass("formFieldSized");
          _jspx_th_html_select_1.setSize("1");
          _jspx_th_html_select_1.setProperty("donorEthinicityStrain");
          _jspx_th_html_select_1.setOnchange("chkOtherStrain()");
          int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
          if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_1.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_0 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_0.setPageContext(_jspx_page_context);
              _jspx_th_html_options_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
              _jspx_th_html_options_0.setName( Dropdowns.STRAINDROP );
              int _jspx_eval_html_options_0 = _jspx_th_html_options_0.doStartTag();
              if (_jspx_th_html_options_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_0);
              out.write("\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_styleClass_size_property_onchange.reuse(_jspx_th_html_select_1);
          out.write("\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t<td class=\"formLabel\"><label for=\"field1\">if other Strain:</label></td>\r\n");
          out.write("\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_text_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write(" \t\t\t<!-- Display anatomy tree based on animal model species or allow for text entry if no specific tree exists -->\r\n");
          out.write(" \t\t\t");
          if (_jspx_meth_c_choose_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t</tr>\t\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">*</td>\r\n");
          out.write("\t\t<td class=\"formRequiredLabel\"><label for=\"field3\">Source Type:</label></td>\r\n");
          out.write("\t\t<td class=\"formField\">\r\n");
          out.write("\t\t<br>\t\t\t\t\r\n");
          out.write("\t\t<label for=\"field3\">- if transplantation type is not listed, <br>then please select \"Other\" and then specify it below:</label>\r\n");
          out.write("\t\t<br>\r\n");
          out.write("\t\t<br>\t\t\r\n");
          out.write("\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_2 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property_onclick.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_2.setPageContext(_jspx_page_context);
          _jspx_th_html_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_2.setStyleClass("formFieldSized");
          _jspx_th_html_select_2.setSize("1");
          _jspx_th_html_select_2.setProperty("sourceType");
          _jspx_th_html_select_2.setOnclick("chkOtherSourceType(this);");
          int _jspx_eval_html_select_2 = _jspx_th_html_select_2.doStartTag();
          if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_2.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_1 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_1.setPageContext(_jspx_page_context);
              _jspx_th_html_options_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_2);
              _jspx_th_html_options_1.setName( Dropdowns.SOURCETYPEDROP );
              int _jspx_eval_html_options_1 = _jspx_th_html_options_1.doStartTag();
              if (_jspx_th_html_options_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_1);
              out.write("\t\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_styleClass_size_property_onclick.reuse(_jspx_th_html_select_2);
          out.write("\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\t\r\n");
          out.write("\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t<td class=\"formLabel\"><label for=\"field1\">If other Source Type:</label></td>\r\n");
          out.write("\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_text_8(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\t\r\n");
          out.write("\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t<td class=\"formLabel\"><label for=\"field1\">Parental Cell line:</label>\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_text_9(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\t\t\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"3\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\"><label for=\"field1\">ATTC number (if available):</label>\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\t\t\r\n");
          out.write("\t\t\t\t<input type=button value=\"Find ATTC#\" onClick=\"myRef = window.open('http://www.atcc.org/','mywin',\r\n");
          out.write("\t\t\t\t'left=20,top=20,width=700,height=700,status=1,scrollbars=1,toolbar=1,resizable=0');myRef.focus()\"></input>\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_html_text_10(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t</tr>\t\r\n");
          out.write("\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t<td class=\"formLabel\"><label for=\"field1\">Conditioning Regimen:</label></td>\r\n");
          out.write("\t\t<td class=\"formField\">\r\n");
          out.write("\t\t<br>\r\n");
          out.write("\t\t<label for=\"field1\">- if conditioning regime is not listed, <br>then please select \"Other\" and then specify it below:</label>\r\n");
          out.write("\t\t<br>\r\n");
          out.write("\t\t<br>\r\n");
          out.write("\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_3 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property_onchange.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_3.setPageContext(_jspx_page_context);
          _jspx_th_html_select_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_3.setStyleClass("formFieldSized");
          _jspx_th_html_select_3.setSize("1");
          _jspx_th_html_select_3.setProperty("conditioningRegimen");
          _jspx_th_html_select_3.setOnchange("chkOtherCondRegimen()");
          int _jspx_eval_html_select_3 = _jspx_th_html_select_3.doStartTag();
          if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_3.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_2 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_2.setPageContext(_jspx_page_context);
              _jspx_th_html_options_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_3);
              _jspx_th_html_options_2.setName( Dropdowns.CONDITIONINGREGIMEN );
              int _jspx_eval_html_options_2 = _jspx_th_html_options_2.doStartTag();
              if (_jspx_th_html_options_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_2);
              out.write("\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_styleClass_size_property_onchange.reuse(_jspx_th_html_select_3);
          out.write("\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t<td class=\"formLabel\"><label for=\"field1\">if other Conditioning Regimen:</label></td>\r\n");
          out.write("\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_text_11(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\t\t\r\n");
          out.write("\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t<td class=\"formLabel\"><label for=\"field1\">Genetic Alteration:</label>\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_textarea_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\t\r\n");
          out.write("\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t<td class=\"formLabel\"><label for=\"field1\">Method of Modification:</label>\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_textarea_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("    <tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t<td class=\"formLabel\"><label for=\"field1\">Amount of Cells:</label>\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t\t<td class=\"formField\">\t\t\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_text_12(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t\r\n");
          out.write("    <tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t<td class=\"formLabel\"><label for=\"field1\">Growth Period:</label>\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t\t<td class=\"formField\">\t\t\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_text_13(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t<td class=\"formLabel\"><label for=\"field1\">Site of Administration:</label>\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t\t<td class=\"formField\">\r\n");
          out.write("\t\t<br>\r\n");
          out.write("\t\t<label for=\"field3\">- if administration site is not listed, <br>then please select \"Other\" and then specify it below:</label>\r\n");
          out.write("\t\t<br>\r\n");
          out.write("\t\t<br>\r\n");
          out.write("\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_4 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property_onclick.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_4.setPageContext(_jspx_page_context);
          _jspx_th_html_select_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_4.setStyleClass("formFieldSized");
          _jspx_th_html_select_4.setSize("1");
          _jspx_th_html_select_4.setProperty("administrativeSite");
          _jspx_th_html_select_4.setOnclick("chkOtherAdminSite();");
          int _jspx_eval_html_select_4 = _jspx_th_html_select_4.doStartTag();
          if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_4.doInitBody();
            }
            do {
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_3 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_3.setPageContext(_jspx_page_context);
              _jspx_th_html_options_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_4);
              _jspx_th_html_options_3.setName( Dropdowns.TRANSPLANTADMINSITESDROP );
              int _jspx_eval_html_options_3 = _jspx_th_html_options_3.doStartTag();
              if (_jspx_th_html_options_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_3);
              out.write("\t\t\t\t\t\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_styleClass_size_property_onclick.reuse(_jspx_th_html_select_4);
          out.write("\t\t\t\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t<td class=\"formLabel\"><label for=\"field1\">Other Site of Administration:</label></td>\r\n");
          out.write("\t\t<td class=\"formField\">\t\t\t\t\t\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_text_14(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\t\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\t\r\n");
          out.write("\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t<td class=\"formLabel\"><label for=\"field1\">Comment:</label>\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_html_textarea_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\t\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t</tr>\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t<td class=\"formLabel\"><label for=\"field3\">Host Species / Strain:</label></td>\r\n");
          out.write("\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_choose_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\t\t\r\n");
          out.write("\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td align=\"right\" colspan=\"3\">\r\n");
          out.write("\t\t\t<TABLE cellpadding=\"4\" cellspacing=\"0\" border=\"0\">\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\t  ");
          if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t  \r\n");
          out.write("\t\t\t\t  ");
          if (_jspx_meth_html_reset_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t      ");
          //  c:if
          org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
          _jspx_th_c_if_0.setPageContext(_jspx_page_context);
          _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_c_if_0.setTest("${not empty aTransplantID}");
          int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
          if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t  \t\t\t\t  ");
              //  html:submit
              org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_1 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_styleClass_property_onclick.get(org.apache.struts.taglib.html.SubmitTag.class);
              _jspx_th_html_submit_1.setPageContext(_jspx_page_context);
              _jspx_th_html_submit_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
              _jspx_th_html_submit_1.setProperty(Constants.Parameters.ACTION);
              _jspx_th_html_submit_1.setStyleClass("actionButton");
              _jspx_th_html_submit_1.setOnclick("return confirm('Are you sure you want to delete?');");
              int _jspx_eval_html_submit_1 = _jspx_th_html_submit_1.doStartTag();
              if (_jspx_eval_html_submit_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_submit_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_submit_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_submit_1.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t  ");
                  if (_jspx_meth_bean_message_2(_jspx_th_html_submit_1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t  ");
                  int evalDoAfterBody = _jspx_th_html_submit_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_submit_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_html_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_submit_styleClass_property_onclick.reuse(_jspx_th_html_submit_1);
              out.write("\r\n");
              out.write("\t\t\t\t  ");
              int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
          out.write("\r\n");
          out.write("\t\t\t\t  \t\t\t\t\r\n");
          out.write("\t\t\t\t  <!--  Done this way since html:hidden doesn't seem to work correctly -->\r\n");
          out.write("\t\t\t\t  <input type=\"hidden\" name=\"aTransplantID\" value=\"");
          out.print( aTransplantID );
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t</TABLE>\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t</TABLE>\r\n");
          out.write("\t\r\n");
          out.write("\t</td></tr></TABLE>\r\n");
          out.write("</tr></td></TABLE>\r\n");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_form_focus_action.reuse(_jspx_th_html_form_0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<SCRIPT LANGUAGE=\"JavaScript\">\r\n");
      out.write("\tchkOtherSourceType();\r\n");
      out.write("\tchkOtherStrain();\r\n");
      out.write("\tchkOtherAdminSite();\r\n");
      out.write("\tchkObservation();\r\n");
      out.write("\tchkOtherSpecies();\r\n");
      out.write("\tchkOtherCondRegimen();\r\n");
      out.write("\tgetOptions();\r\n");
      out.write("</SCRIPT>\r\n");
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
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_html_errors_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_errors_nobody.reuse(_jspx_th_html_errors_0);
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
    _jspx_th_camod_cshelp_0.setTopic("xenograft_transplant_help");
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
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setStyleClass("formFieldSized");
    _jspx_th_html_text_0.setProperty("name");
    _jspx_th_html_text_0.setSize("30");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_1.setStyleClass("formFieldSized");
    _jspx_th_html_text_1.setProperty("otherDonorScientificName");
    _jspx_th_html_text_1.setSize("30");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_2.setStyleClass("formFieldSized");
    _jspx_th_html_text_2.setProperty("otherDonorEthinicityStrain");
    _jspx_th_html_text_2.setSize("30");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_when_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_when_1(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\t\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_when_2(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_when_3(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_otherwise_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\r\n");
        out.write("    \t\t");
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
    _jspx_th_c_when_0.setTest("${donorspeciescommonname == 'Mouse'}");
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<td class=\"formLabel\"><label for=\"field1\">Organ/Tissue:</label>&nbsp;\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_cshelp_1(_jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t<a href=\"javascript:showMouseTissueTree('transplantationForm', 'organTissueCode', 'organTissueName', 'organ', true)\">\r\n");
        out.write("\t\t\t\t\t\t<IMG src=\"images\\selectUP.gif\" align=middle border=0></a>\r\n");
        out.write("\t\t\t\t</td>\t\t\t\t\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_hidden_0(_jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t<input type=\"hidden\" name=\"organTissueName\" />\r\n");
        out.write("\t\t\t\t\t<td class=\"formField\">\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_text_3(_jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<a href=\"javascript: clearField(document.forms[0].organ, document.forms[0].organTissueCode);\"><img border=\"0\" align=middle src=\"/camod/images/clear.gif\"></a>\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_camod_cshelp_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:cshelp
    gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag _jspx_th_camod_cshelp_1 = (gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag) _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.get(gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag.class);
    _jspx_th_camod_cshelp_1.setPageContext(_jspx_page_context);
    _jspx_th_camod_cshelp_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_camod_cshelp_1.setTopic("data_tree_help");
    _jspx_th_camod_cshelp_1.setKey("ORGAN.CONCEPT_CODE");
    _jspx_th_camod_cshelp_1.setImage("images/helpTooltip.gif");
    _jspx_th_camod_cshelp_1.setText("Tool Tip Test 1");
    int _jspx_eval_camod_cshelp_1 = _jspx_th_camod_cshelp_1.doStartTag();
    if (_jspx_th_camod_cshelp_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.reuse(_jspx_th_camod_cshelp_1);
    return false;
  }

  private boolean _jspx_meth_html_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_0 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_html_hidden_0.setProperty("organTissueCode");
    int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
    if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_0);
    return false;
  }

  private boolean _jspx_meth_html_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(_jspx_page_context);
    _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_html_text_3.setStyleClass("formFieldSized");
    _jspx_th_html_text_3.setDisabled(true);
    _jspx_th_html_text_3.setProperty("organ");
    _jspx_th_html_text_3.setSize("20");
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.reuse(_jspx_th_html_text_3);
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
    _jspx_th_c_when_1.setTest("${donorspeciescommonname == 'Rat'}");
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\t\r\n");
        out.write("\t\t\t\t<td class=\"formLabel\"><label for=\"field1\">Organ/Tissue:</label>&nbsp;\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_cshelp_2(_jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t\t<a href=\"javascript:showRatTissueTree('transplantationForm', 'organTissueCode', 'organTissueName', 'organ', true)\">\r\n");
        out.write("\t\t\t\t\t\t<IMG src=\"images\\selectUP.gif\" align=middle border=0></a>\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_hidden_1(_jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t<input type=\"hidden\" name=\"organTissueName\" />\r\n");
        out.write("\t\t\t\t\t<td class=\"formField\">\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_text_4(_jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<a href=\"javascript: clearField(document.forms[0].organ, document.forms[0].organTissueCode);\"><img border=\"0\" align=middle src=\"/camod/images/clear.gif\"></a>\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_camod_cshelp_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:cshelp
    gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag _jspx_th_camod_cshelp_2 = (gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag) _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.get(gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag.class);
    _jspx_th_camod_cshelp_2.setPageContext(_jspx_page_context);
    _jspx_th_camod_cshelp_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_camod_cshelp_2.setTopic("data_tree_help");
    _jspx_th_camod_cshelp_2.setKey("ORGAN.CONCEPT_CODE");
    _jspx_th_camod_cshelp_2.setImage("images/helpTooltip.gif");
    _jspx_th_camod_cshelp_2.setText("Tool Tip Test 1");
    int _jspx_eval_camod_cshelp_2 = _jspx_th_camod_cshelp_2.doStartTag();
    if (_jspx_th_camod_cshelp_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.reuse(_jspx_th_camod_cshelp_2);
    return false;
  }

  private boolean _jspx_meth_html_hidden_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_1 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_1.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_html_hidden_1.setProperty("organTissueCode");
    int _jspx_eval_html_hidden_1 = _jspx_th_html_hidden_1.doStartTag();
    if (_jspx_th_html_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_1);
    return false;
  }

  private boolean _jspx_meth_html_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_4 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_4.setPageContext(_jspx_page_context);
    _jspx_th_html_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_html_text_4.setStyleClass("formFieldSized");
    _jspx_th_html_text_4.setDisabled(true);
    _jspx_th_html_text_4.setProperty("organ");
    _jspx_th_html_text_4.setSize("20");
    int _jspx_eval_html_text_4 = _jspx_th_html_text_4.doStartTag();
    if (_jspx_th_html_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.reuse(_jspx_th_html_text_4);
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
    _jspx_th_c_when_2.setTest("${donorspeciescommonname == 'Zebrafish'}");
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<td class=\"formLabel\"><label for=\"field1\">Organ/Tissue:</label>&nbsp;\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_cshelp_3(_jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t\t<a href=\"javascript:showZebrafishTissueTree('transplantationForm', 'organTissueCode', 'organTissueName', 'organ', true)\">\r\n");
        out.write("\t\t\t\t\t\t<IMG src=\"images\\selectUP.gif\" align=middle border=0></a>\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_hidden_2(_jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t<input type=\"hidden\" name=\"organTissueName\" />\r\n");
        out.write("\t\t\t\t\t<td class=\"formField\">\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_text_5(_jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<a href=\"javascript: clearField(document.forms[0].organ, document.forms[0].organTissueCode);\"><img border=\"0\" align=middle src=\"/camod/images/clear.gif\"></a>\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_camod_cshelp_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:cshelp
    gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag _jspx_th_camod_cshelp_3 = (gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag) _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.get(gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag.class);
    _jspx_th_camod_cshelp_3.setPageContext(_jspx_page_context);
    _jspx_th_camod_cshelp_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_camod_cshelp_3.setTopic("data_tree_help");
    _jspx_th_camod_cshelp_3.setKey("ORGAN.CONCEPT_CODE");
    _jspx_th_camod_cshelp_3.setImage("images/helpTooltip.gif");
    _jspx_th_camod_cshelp_3.setText("Tool Tip Test 1");
    int _jspx_eval_camod_cshelp_3 = _jspx_th_camod_cshelp_3.doStartTag();
    if (_jspx_th_camod_cshelp_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.reuse(_jspx_th_camod_cshelp_3);
    return false;
  }

  private boolean _jspx_meth_html_hidden_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_2 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_2.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_html_hidden_2.setProperty("organTissueCode");
    int _jspx_eval_html_hidden_2 = _jspx_th_html_hidden_2.doStartTag();
    if (_jspx_th_html_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_2);
    return false;
  }

  private boolean _jspx_meth_html_text_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_5 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_5.setPageContext(_jspx_page_context);
    _jspx_th_html_text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_html_text_5.setStyleClass("formFieldSized");
    _jspx_th_html_text_5.setDisabled(true);
    _jspx_th_html_text_5.setProperty("organ");
    _jspx_th_html_text_5.setSize("20");
    int _jspx_eval_html_text_5 = _jspx_th_html_text_5.doStartTag();
    if (_jspx_th_html_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.reuse(_jspx_th_html_text_5);
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
    _jspx_th_c_when_3.setTest("${donorspeciescommonname == 'Human'}");
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<td class=\"formLabel\"><label for=\"field1\">Organ/Tissue:</label>&nbsp;\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_cshelp_4(_jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t\t<a href=\"javascript:showHumanTissueTree('transplantationForm', 'organTissueCode', 'organTissueName', 'organ', true)\">\r\n");
        out.write("\t\t\t\t\t\t<IMG src=\"images\\selectUP.gif\" align=middle border=0></a>\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_hidden_3(_jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t<input type=\"hidden\" name=\"organTissueName\" />\r\n");
        out.write("\t\t\t\t\t<td class=\"formField\">\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_text_6(_jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<a href=\"javascript: clearField(document.forms[0].organ, document.forms[0].organTissueCode);\"><img border=\"0\" align=middle src=\"/camod/images/clear.gif\"></a>\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_camod_cshelp_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:cshelp
    gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag _jspx_th_camod_cshelp_4 = (gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag) _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.get(gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag.class);
    _jspx_th_camod_cshelp_4.setPageContext(_jspx_page_context);
    _jspx_th_camod_cshelp_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_camod_cshelp_4.setTopic("data_tree_help");
    _jspx_th_camod_cshelp_4.setKey("ORGAN.CONCEPT_CODE");
    _jspx_th_camod_cshelp_4.setImage("images/helpTooltip.gif");
    _jspx_th_camod_cshelp_4.setText("Tool Tip Test 1");
    int _jspx_eval_camod_cshelp_4 = _jspx_th_camod_cshelp_4.doStartTag();
    if (_jspx_th_camod_cshelp_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.reuse(_jspx_th_camod_cshelp_4);
    return false;
  }

  private boolean _jspx_meth_html_hidden_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_3 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_3.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_html_hidden_3.setProperty("organTissueCode");
    int _jspx_eval_html_hidden_3 = _jspx_th_html_hidden_3.doStartTag();
    if (_jspx_th_html_hidden_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_3);
    return false;
  }

  private boolean _jspx_meth_html_text_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_6 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_6.setPageContext(_jspx_page_context);
    _jspx_th_html_text_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_html_text_6.setStyleClass("formFieldSized");
    _jspx_th_html_text_6.setDisabled(true);
    _jspx_th_html_text_6.setProperty("organ");
    _jspx_th_html_text_6.setSize("20");
    int _jspx_eval_html_text_6 = _jspx_th_html_text_6.doStartTag();
    if (_jspx_th_html_text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.reuse(_jspx_th_html_text_6);
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
        out.write("\t\t\t\t<td class=\"formLabel\"><label for=\"field1\">Organ/Tissue:</label>&nbsp;\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_hidden_4(_jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t<input type=\"hidden\" name=\"organTissueName\" />\r\n");
        out.write("\t\t\t\t\t<td class=\"formField\">\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_text_7(_jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t</td>\t\t\t\t\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_html_hidden_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_4 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_4.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_html_hidden_4.setProperty("organTissueCode");
    int _jspx_eval_html_hidden_4 = _jspx_th_html_hidden_4.doStartTag();
    if (_jspx_th_html_hidden_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_4);
    return false;
  }

  private boolean _jspx_meth_html_text_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_7 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_7.setPageContext(_jspx_page_context);
    _jspx_th_html_text_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_html_text_7.setStyleClass("formFieldSized");
    _jspx_th_html_text_7.setDisabled(false);
    _jspx_th_html_text_7.setProperty("organ");
    _jspx_th_html_text_7.setSize("20");
    int _jspx_eval_html_text_7 = _jspx_th_html_text_7.doStartTag();
    if (_jspx_th_html_text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.reuse(_jspx_th_html_text_7);
    return false;
  }

  private boolean _jspx_meth_html_text_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_8 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_8.setPageContext(_jspx_page_context);
    _jspx_th_html_text_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_8.setStyleClass("formFieldSized");
    _jspx_th_html_text_8.setProperty("otherSourceType");
    _jspx_th_html_text_8.setSize("30");
    int _jspx_eval_html_text_8 = _jspx_th_html_text_8.doStartTag();
    if (_jspx_th_html_text_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_nobody.reuse(_jspx_th_html_text_8);
    return false;
  }

  private boolean _jspx_meth_html_text_9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_9 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_9.setPageContext(_jspx_page_context);
    _jspx_th_html_text_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_9.setStyleClass("formFieldSized");
    _jspx_th_html_text_9.setProperty("parentalCellLineName");
    _jspx_th_html_text_9.setSize("30");
    int _jspx_eval_html_text_9 = _jspx_th_html_text_9.doStartTag();
    if (_jspx_th_html_text_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_nobody.reuse(_jspx_th_html_text_9);
    return false;
  }

  private boolean _jspx_meth_html_text_10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_10 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_10.setPageContext(_jspx_page_context);
    _jspx_th_html_text_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_10.setStyleClass("formFieldUnSized");
    _jspx_th_html_text_10.setSize("15");
    _jspx_th_html_text_10.setProperty("atccNumber");
    int _jspx_eval_html_text_10 = _jspx_th_html_text_10.doStartTag();
    if (_jspx_th_html_text_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_nobody.reuse(_jspx_th_html_text_10);
    return false;
  }

  private boolean _jspx_meth_html_text_11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_11 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_11.setPageContext(_jspx_page_context);
    _jspx_th_html_text_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_11.setStyleClass("formFieldSized");
    _jspx_th_html_text_11.setProperty("otherConditioningRegimen");
    _jspx_th_html_text_11.setSize("30");
    int _jspx_eval_html_text_11 = _jspx_th_html_text_11.doStartTag();
    if (_jspx_th_html_text_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_nobody.reuse(_jspx_th_html_text_11);
    return false;
  }

  private boolean _jspx_meth_html_textarea_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textarea
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_textarea_0 = (org.apache.struts.taglib.html.TextareaTag) _jspx_tagPool_html_textarea_styleClass_rows_property_onkeypress_cols_nobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_textarea_0.setPageContext(_jspx_page_context);
    _jspx_th_html_textarea_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_textarea_0.setStyleClass("formFieldSized");
    _jspx_th_html_textarea_0.setProperty("geneticManipulation");
    _jspx_th_html_textarea_0.setCols("32");
    _jspx_th_html_textarea_0.setRows("4");
    _jspx_th_html_textarea_0.setOnkeypress("chkObservation();");
    int _jspx_eval_html_textarea_0 = _jspx_th_html_textarea_0.doStartTag();
    if (_jspx_th_html_textarea_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_textarea_styleClass_rows_property_onkeypress_cols_nobody.reuse(_jspx_th_html_textarea_0);
    return false;
  }

  private boolean _jspx_meth_html_textarea_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textarea
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_textarea_1 = (org.apache.struts.taglib.html.TextareaTag) _jspx_tagPool_html_textarea_styleClass_rows_property_disabled_cols_nobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_textarea_1.setPageContext(_jspx_page_context);
    _jspx_th_html_textarea_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_textarea_1.setStyleClass("formFieldSized");
    _jspx_th_html_textarea_1.setProperty("modificationDescription");
    _jspx_th_html_textarea_1.setCols("32");
    _jspx_th_html_textarea_1.setRows("4");
    _jspx_th_html_textarea_1.setDisabled(true);
    int _jspx_eval_html_textarea_1 = _jspx_th_html_textarea_1.doStartTag();
    if (_jspx_th_html_textarea_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_textarea_styleClass_rows_property_disabled_cols_nobody.reuse(_jspx_th_html_textarea_1);
    return false;
  }

  private boolean _jspx_meth_html_text_12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_12 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_12.setPageContext(_jspx_page_context);
    _jspx_th_html_text_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_12.setStyleClass("formFieldUnSized");
    _jspx_th_html_text_12.setProperty("cellAmount");
    _jspx_th_html_text_12.setSize("15");
    int _jspx_eval_html_text_12 = _jspx_th_html_text_12.doStartTag();
    if (_jspx_th_html_text_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_nobody.reuse(_jspx_th_html_text_12);
    return false;
  }

  private boolean _jspx_meth_html_text_13(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_13 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_13.setPageContext(_jspx_page_context);
    _jspx_th_html_text_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_13.setStyleClass("formFieldUnSized");
    _jspx_th_html_text_13.setProperty("growthPeriod");
    _jspx_th_html_text_13.setSize("15");
    int _jspx_eval_html_text_13 = _jspx_th_html_text_13.doStartTag();
    if (_jspx_th_html_text_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_nobody.reuse(_jspx_th_html_text_13);
    return false;
  }

  private boolean _jspx_meth_html_text_14(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_14 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_14.setPageContext(_jspx_page_context);
    _jspx_th_html_text_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_14.setStyleClass("formFieldSized");
    _jspx_th_html_text_14.setSize("30");
    _jspx_th_html_text_14.setProperty("otherAdministrativeSite");
    int _jspx_eval_html_text_14 = _jspx_th_html_text_14.doStartTag();
    if (_jspx_th_html_text_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_nobody.reuse(_jspx_th_html_text_14);
    return false;
  }

  private boolean _jspx_meth_html_textarea_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textarea
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_textarea_2 = (org.apache.struts.taglib.html.TextareaTag) _jspx_tagPool_html_textarea_styleClass_rows_property_cols_nobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_textarea_2.setPageContext(_jspx_page_context);
    _jspx_th_html_textarea_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_textarea_2.setStyleClass("formFieldSized");
    _jspx_th_html_textarea_2.setProperty("comments");
    _jspx_th_html_textarea_2.setCols("32");
    _jspx_th_html_textarea_2.setRows("4");
    int _jspx_eval_html_textarea_2 = _jspx_th_html_textarea_2.doStartTag();
    if (_jspx_th_html_textarea_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_textarea_styleClass_rows_property_cols_nobody.reuse(_jspx_th_html_textarea_2);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_when_4(_jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_otherwise_1(_jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_4.setTest("${empty modelstrain}");
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_out_1(_jspx_th_c_when_4, _jspx_page_context))
          return true;
        out.write(' ');
        out.write('/');
        out.write(' ');
        if (_jspx_meth_c_out_2(_jspx_th_c_when_4, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_c_out_1.setValue("${modelspecies}");
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_c_out_2.setValue("${othermodelstrain}");
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_out_3(_jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write(' ');
        out.write('/');
        out.write(' ');
        if (_jspx_meth_c_out_4(_jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_c_out_3.setValue("${modelspecies}");
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_c_out_4.setValue("${modelstrain}");
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_styleClass.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setStyleClass("actionButton");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_submit_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t  ");
        if (_jspx_meth_bean_message_0(_jspx_th_html_submit_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t  ");
        int evalDoAfterBody = _jspx_th_html_submit_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_submit_styleClass.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_submit_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_submit_0);
    _jspx_th_bean_message_0.setKey("button.submit");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }

  private boolean _jspx_meth_html_reset_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:reset
    org.apache.struts.taglib.html.ResetTag _jspx_th_html_reset_0 = (org.apache.struts.taglib.html.ResetTag) _jspx_tagPool_html_reset_styleClass.get(org.apache.struts.taglib.html.ResetTag.class);
    _jspx_th_html_reset_0.setPageContext(_jspx_page_context);
    _jspx_th_html_reset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_reset_0.setStyleClass("actionButton");
    int _jspx_eval_html_reset_0 = _jspx_th_html_reset_0.doStartTag();
    if (_jspx_eval_html_reset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_reset_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_reset_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_reset_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t  \t  ");
        if (_jspx_meth_bean_message_1(_jspx_th_html_reset_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("  \t\t\t\t  ");
        int evalDoAfterBody = _jspx_th_html_reset_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_reset_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_reset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_reset_styleClass.reuse(_jspx_th_html_reset_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_reset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_reset_0);
    _jspx_th_bean_message_1.setKey("button.reset");
    int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
    if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_submit_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_submit_1);
    _jspx_th_bean_message_2.setKey("button.delete");
    int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
    if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_2);
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
