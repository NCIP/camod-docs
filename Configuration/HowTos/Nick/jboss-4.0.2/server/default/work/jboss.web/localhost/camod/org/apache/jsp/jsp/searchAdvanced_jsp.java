package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import gov.nih.nci.camod.webapp.util.SidebarUtil;
import gov.nih.nci.camod.Constants;
import java.util.List;
import gov.nih.nci.camod.Constants;
import gov.nih.nci.camod.Constants.*;
import gov.nih.nci.camod.service.SavedQueryManager;
import gov.nih.nci.camod.domain.SavedQuery;
import gov.nih.nci.camod.domain.SavedQueryAttribute;

public final class searchAdvanced_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_size_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleClass_size_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_options_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleClass_size_property_onchange;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_optionsCollection_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_size_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_checkbox_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_checkbox_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass_onclick;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_nobody;

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
    _jspx_tagPool_html_errors_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_size_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleClass_size_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_options_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleClass_size_property_onchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_optionsCollection_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_size_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_checkbox_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_checkbox_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_xhtml_nobody.release();
    _jspx_tagPool_html_link_styleClass_action.release();
    _jspx_tagPool_logic_present_name.release();
    _jspx_tagPool_logic_iterate_type_name_id.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_html_link_styleClass_href.release();
    _jspx_tagPool_html_form_onsubmit_focus_action.release();
    _jspx_tagPool_html_errors_nobody.release();
    _jspx_tagPool_html_text_size_property_nobody.release();
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.release();
    _jspx_tagPool_html_text_styleId_styleClass_size_property_nobody.release();
    _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.release();
    _jspx_tagPool_html_select_styleClass_size_property.release();
    _jspx_tagPool_html_options_name_nobody.release();
    _jspx_tagPool_html_select_styleClass_size_property_onchange.release();
    _jspx_tagPool_html_optionsCollection_name_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_html_hidden_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_html_text_styleClass_size_property_nobody.release();
    _jspx_tagPool_html_checkbox_property_onclick_nobody.release();
    _jspx_tagPool_html_checkbox_property_nobody.release();
    _jspx_tagPool_html_submit_styleClass_onclick.release();
    _jspx_tagPool_html_submit_styleClass_property.release();
    _jspx_tagPool_bean_message_key_nobody.release();
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
 * $Id: searchAdvanced_jsp.java,v 1.1 2008-07-22 19:39:47 pandyas Exp $
 * 
 * $Log: not supported by cvs2svn $
 * Revision 1.73  2008/07/17 17:24:09  pandyas
 * Reverted code back to version for security scan fixes
 *
 * Revision 1.71  2008/05/21 19:09:17  pandyas
 * Modified advanced search to prevent SQL injection
 * Converted text entry to dropdown lists for easier validation
 * Re: Apps Scan run 05/15/2008
 *
 * Revision 1.70  2008/05/12 15:29:21  pandyas
 * minor format change to be consistent
 *
 * Revision 1.69  2007/10/17 18:24:17  pandyas
 * Added error message tag for cross--site scripting attacks messages
 *
 * Revision 1.68  2007/09/20 15:24:45  pandyas
 * Bug # 7751: Modified text next to tool strain on advanced search
 *
 * Revision 1.67  2007/08/07 19:55:27  pandyas
 * Removed robohelp reference
 *
 * Revision 1.66  2007/07/31 12:00:09  pandyas
 * VCDE silver level  and caMOD 2.3 changes
 *
 * Revision 1.65  2007/06/21 20:07:06  pandyas
 * Fix display of Zebrfish diagnosis drop down on adv search
 *
 * Revision 1.64  2007/06/21 18:48:19  pandyas
 * Removed bold for diagnosis on adv search jsp
 *
 * Revision 1.63  2007/06/20 19:29:45  pandyas
 * Fixed populate for diagnosis - depends on species set in the session constant
 *
 * Revision 1.62  2007/06/19 13:55:38  pandyas
 * Enable disease when species is other than mouse, rat, zebrafish (i.e. hamster, ect) to allow for entry by user
 *
 * Revision 1.61  2007/06/05 19:26:34  pandyas
 * Added final method name for Zebrafish tissue tree
 *
 * Revision 1.60  2007/05/21 17:36:13  pandyas
 * Modified simple and adv search species drop down to pull from DB (approved model species only)
 *
 * Revision 1.59  2007/05/18 15:35:59  pandyas
 * Modifed label for Agent Type and Agent Name as per Ulli
 *
 * Revision 1.58  2007/05/18 14:41:13  pandyas
 * Modified species and organ tree to default to no organ button and to work when user goes from species to empty selection
 *
 * Revision 1.57  2007/05/16 12:30:36  pandyas
 * Modified adv and simple search vocab tree section to populate depending on species selected
 *
 * Revision 1.56  2007/04/25 15:04:02  pandyas
 * Agreed on one help icon for all title bars and one icon for light grey tool tip - removed all others
 *
 * Revision 1.55  2007/04/09 12:35:16  pandyas
 * modified after caMOD 2.3 unit testing
 *
 * Revision 1.54  2007/03/28 18:11:35  pandyas
 * Modified for the following Test Track items:
 * #462 - Customized search for carcinogens for Jackson Lab data
 * #494 - Advanced search for Carcinogens for Jackson Lab data
 *
 * Revision 1.53  2006/12/28 16:05:26  pandyas
 * Reverted to previous version - changed CE on adv search page
 *
 * Revision 1.50  2006/11/21 18:24:49  pandyas
 * changed External Source Data From Jackson Labs (blue bar) to Data from External Sources
 *
 * Revision 1.49  2006/11/14 21:47:32  pandyas
 * #465	delete tooltops, keep tooltips for vocabulary trees and link them to vocab tree help pages
 *
 * Revision 1.48  2006/11/10 22:01:45  pandyas
 * TestTrack #465 - delete tooltops, keep tooltips for vocabulary trees and link them to vocab tree help pages
 *
 * Revision 1.47  2006/11/10 20:18:11  pandyas
 * Took out redundant ToolTip
 *
 * Revision 1.46  2006/11/06 16:15:34  pandyas
 * removed onclick from model description
 *
 * Revision 1.45  2006/10/17 16:08:28  pandyas
 * modified during development of caMOD 2.2 - various
 *
 * Revision 1.44  2006/08/16 13:55:45  pandyas
 * updated on-line help from Robohelp to ePublisher - added new link for advanced search title
 *
 * Revision 1.43  2006/08/15 15:30:29  pandyas
 * updated on-line help from Robohelp to ePublisher - modified link - new data tree link added
 *
 * Revision 1.42  2006/08/13 17:45:53  pandyas
 * Updated online help - redefined camod tag by substituting mapId for topic (ePublisher changes)
 *
 * Revision 1.41  2006/05/25 12:02:51  georgeda
 * Slight tweaks
 *
 * Revision 1.40  2006/05/19 17:12:11  guptaa
 * added advance search
 *
 * Revision 1.39  2006/05/18 14:26:40  guptaa
 * fix style id
 *
 * Revision 1.38  2006/05/18 13:05:48  guptaa
 * added disease
 *
 * Revision 1.37  2006/05/17 21:24:49  guptaa
 * organ work with the autocomplete
 *
 * Revision 1.36  2006/05/15 19:52:23  georgeda
 * Fixed bugs introduced putting in Ajax
 *
 * Revision 1.35  2006/05/12 20:42:41  guptaa
 * deleted css
 *
 * Revision 1.34  2006/05/12 20:30:28  guptaa
 * indicator out
 *
 * Revision 1.33  2006/05/12 19:41:42  guptaa
 * uses tag
 *
 * Revision 1.32  2006/05/12 17:11:38  guptaa
 * ajax additions
 *
 * Revision 1.31  2006/05/10 14:21:51  schroedn
 * New Features - Changes from code review
 *
 * Revision 1.30  2006/05/10 12:02:47  georgeda
 * Changes for searching on transient interfaces
 *
 * Revision 1.29  2006/05/03 19:05:29  georgeda
 * Move to new EVSTree
 *
 * Revision 1.28  2006/04/28 19:38:15  schroedn
 * Defect # 261
 * Made changes so the organ and diagnosis save differently and can be retained for SaveQuery
 *
 * Revision 1.27  2006/03/31 13:47:36  georgeda
 * Changed the EVSTree call to work w/ new servers
 *
 * Revision 1.26  2005/12/19 14:05:33  georgeda
 * Defect #271 - Search issues
 *
 * Revision 1.25  2005/12/02 14:17:30  georgeda
 * Defect #241, handle truncated HTML tags
 *
 * Revision 1.24  2005/11/16 21:33:24  georgeda
 * Defect #40.  Changed reset button to clear.
 *
 * Revision 1.23  2005/11/16 19:43:30  georgeda
 * Added clear to search forms
 *
 * Revision 1.22  2005/11/16 16:32:43  georgeda
 * Defect #46.  Made disabling/enabling fields consistent between IE/Firefox
 *
 * Revision 1.21  2005/11/16 14:57:39  schroedn
 * Defect #50
 *
 * Changed the text on Submit button to 'Search'
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
 * $Id: searchAdvanced_jsp.java,v 1.1 2008-07-22 19:39:47 pandyas Exp $
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<!-- needed for tooltips -->\r\n");
      out.write("<DIV id=\"TipLayer\" style=\"visibility:hidden;position:absolute;z-index:1000;top:-100;\"></DIV>\r\n");
      out.write("<script language=\"JavaScript\" src=\"scripts/global.js\"></script>\r\n");
      out.write("<script language=\"JavaScript\" src=\"scripts/EVSTreeScript.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/prototype-1.4.0.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/scriptaculous.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/ajaxtags-1.2-beta2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<SCRIPT LANGUAGE=\"JavaScript\">\r\n");
      out.write("\t\r\n");
      out.write("\tfunction blankKeyword() {\r\n");
      out.write("        document.searchForm.keyword.value = '';\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("\tfunction checkFields() {\r\n");
      out.write("\t\ttoggleField(document.searchForm.searchEngineeredTransgene[0], document.searchForm.transgeneName);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ttoggleField(document.searchForm.searchTargetedModification[0], document.searchForm.geneName);\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ttoggleField(document.searchForm.searchTherapeuticApproaches[0], document.searchForm.therapeuticApproach);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction enableFields() {\r\n");
      out.write("\t\tdocument.searchForm.organ.disabled = false;\r\n");
      out.write("\t\tdocument.searchForm.tumorClassification.disabled = false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getOptions( control ) {\r\n");
      out.write("\t\tform = control.form;\r\n");
      out.write("\t\tform.action = \"AdvancedSearchPopulateAction.do?unprotected_method=setAgentNameDropdown\";\r\n");
      out.write("\t\tform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction setAgentName() {\r\n");
      out.write("\t\tdocument.forms[0].agentName.value = document.searchForm.agentName;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getOrganDiseaseTree( control ) {\r\n");
      out.write("\t\tform = control.form;\r\n");
      out.write("\t\tform.action = \"AdvancedSearchPopulateAction.do?unprotected_method=setSpeciesForTrees\";\r\n");
      out.write("\t\tform.submit();\r\n");
      out.write("\t}\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");

	//Display search criteria of executed search
	String aSavedQueryId = (String) request.getSession().getAttribute( Constants.ASAVEDQUERYID );
	String aQueryName = (String) request.getSession().getAttribute( Constants.QUERY_NAME );		

      out.write("\r\n");
      out.write("\r\n");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_onsubmit_focus_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("SearchAdvancedAction.do");
      _jspx_th_html_form_0.setFocus("keyword");
      _jspx_th_html_form_0.setOnsubmit("enableFields()");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("<!-- searchAdvanced.jsp -->\r\n");
          out.write("<!-- Main Content Begins -->\r\n");
          out.write("<TABLE cellpadding=\"10\" cellspacing=\"0\" border=\"0\" class=\"contentBegins\" width=\"100%\" height=\"100%\">\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_errors_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<td class=\"formMessage\" colspan=\"3\"></td>\r\n");
          out.write("\t\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t<tr><td>\r\n");
          out.write("\t\r\n");
          out.write("\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"0\">\r\n");
          out.write("\t    <tr>\r\n");
          out.write("\t        <td class=\"formTitleBlue\" height=\"20\" colspan=\"3\">Keyword Search:&nbsp;&nbsp;");
          if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("&nbsp;&nbsp;<input class=\"actionButton\" type=\"submit\" value=\"Search\" /></td>\r\n");
          out.write("\t    </tr>\r\n");
          out.write("        \r\n");
          out.write("        <tr>\r\n");
          out.write("        \t<td colspan=\"3\">        \r\n");
          out.write("\t\t        ");
 if( aSavedQueryId != null ) { 
          out.write("\r\n");
          out.write("\t\t\t        <br>\r\n");
          out.write("\t\t\t\t\t<TABLE border=\"0\" class=\"contentPage\" width=\"100%\">\r\n");
          out.write("\t\t\t\t\t\t<TR>\r\n");
          out.write("\t\t\t\t\t\t\t<TD width=\"100%\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<font color=\"red\">* Saved query <b>\"");
          out.print( aQueryName );
          out.write("\"</b> is being edited. You will be prompted to save the changes after pressing Search.</font>\r\n");
          out.write("\t\t\t\t            </TD>\r\n");
          out.write("\t\t\t\t        </TR>\r\n");
          out.write("\t\t\t        </TABLE>\t\t\t\t\r\n");
          out.write("\t\t        ");
}
          out.write("\r\n");
          out.write("        \t</td>\r\n");
          out.write("        </tr>\r\n");
          out.write("        \r\n");
          out.write("        <tr>\r\n");
          out.write("\t\t\t<td class=\"formTitleBlue\" height=\"20\" colspan=\"3\">Advanced Search\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_camod_cshelp_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("</td>\t\t\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t    <td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\"><label for=\"field1\">Model Name / Model Descriptor:</label> </td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_html_text_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_ajax_autocomplete_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"0\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\"><label for=\"field2\">PI's Name:</label></td>\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<td class=\"formField\">\t\t\t\t\r\n");
          out.write("\t\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_0.setPageContext(_jspx_page_context);
          _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_0.setStyleClass("formFieldSized");
          _jspx_th_html_select_0.setSize("1");
          _jspx_th_html_select_0.setProperty("piName");
          int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
          if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_0.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_0 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_0.setPageContext(_jspx_page_context);
              _jspx_th_html_options_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
              _jspx_th_html_options_0.setName( Dropdowns.PRINCIPALINVESTIGATORQUERYDROP );
              int _jspx_eval_html_options_0 = _jspx_th_html_options_0.doStartTag();
              if (_jspx_th_html_options_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_0);
              out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t");
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
          out.write("\t\t\t\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\"><label for=\"field3\">Species:</label></td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\t\t\t\t\r\n");
          out.write("\t\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property_onchange.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_1.setPageContext(_jspx_page_context);
          _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_1.setStyleClass("formFieldSized");
          _jspx_th_html_select_1.setSize("1");
          _jspx_th_html_select_1.setProperty("species");
          _jspx_th_html_select_1.setOnchange("getOrganDiseaseTree(this);");
          int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
          if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_1.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  html:optionsCollection
              org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_0 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_name_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
              _jspx_th_html_optionsCollection_0.setPageContext(_jspx_page_context);
              _jspx_th_html_optionsCollection_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
              _jspx_th_html_optionsCollection_0.setName( Dropdowns.APPROVEDSPECIESDROP );
              int _jspx_eval_html_optionsCollection_0 = _jspx_th_html_optionsCollection_0.doStartTag();
              if (_jspx_th_html_optionsCollection_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_optionsCollection_name_nobody.reuse(_jspx_th_html_optionsCollection_0);
              out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t");
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
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"0\">&nbsp;</td>\r\n");
          out.write(" \t\t\t<!-- Display anatomy tree based on species selected or default to mouse tree if no species selected (new screen) -->\t\t\t\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_choose_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\t\t\t\t\t\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"0\">&nbsp;</td>\r\n");
          out.write(" \t\t\t<!-- Display anatomy tree based on species selected or default to mouse tree if no species selected (new screen) --> \t\t\t\r\n");
          out.write("\t \t\t");
          //  c:choose
          org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
          _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
          _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
          if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\t\t\t\r\n");
              out.write("\t\t\t\t");
              if (_jspx_meth_c_when_3(_jspx_th_c_choose_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t");
              if (_jspx_meth_c_when_4(_jspx_th_c_choose_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  c:when
              org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
              _jspx_th_c_when_5.setPageContext(_jspx_page_context);
              _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
              _jspx_th_c_when_5.setTest("${searchspeciescommonname == 'Zebrafish'}");
              int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
              if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t<td class=\"formLabel\"><label for=\"field2\">Diagnosis:</label>&nbsp;\t\t\t\t\r\n");
                  out.write("\t\t\t\t\t</td>\t\r\n");
                  out.write("\t\t\t\t\t\t<td class=\"formField\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_html_hidden_8(_jspx_th_c_when_5, _jspx_page_context))
                    return;
                  out.write("\t\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_html_hidden_9(_jspx_th_c_when_5, _jspx_page_context))
                    return;
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_2 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property_onchange.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_select_2.setPageContext(_jspx_page_context);
                  _jspx_th_html_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_5);
                  _jspx_th_html_select_2.setStyleClass("formFieldSized");
                  _jspx_th_html_select_2.setSize("1");
                  _jspx_th_html_select_2.setProperty("tumorClassification");
                  _jspx_th_html_select_2.setOnchange("chkOtherDiagnosis();");
                  int _jspx_eval_html_select_2 = _jspx_th_html_select_2.doStartTag();
                  if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_select_2.doInitBody();
                    }
                    do {
                      out.write("\r\n");
                      out.write("\t\t\t\t\t\t\t\t");
                      //  html:optionsCollection
                      org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_1 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_name_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
                      _jspx_th_html_optionsCollection_1.setPageContext(_jspx_page_context);
                      _jspx_th_html_optionsCollection_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_2);
                      _jspx_th_html_optionsCollection_1.setName( Constants.Dropdowns.ZEBRAFISHDIAGNOSISDROP );
                      int _jspx_eval_html_optionsCollection_1 = _jspx_th_html_optionsCollection_1.doStartTag();
                      if (_jspx_th_html_optionsCollection_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      _jspx_tagPool_html_optionsCollection_name_nobody.reuse(_jspx_th_html_optionsCollection_1);
                      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
                      out.write("\t\t\t\t\t\t\t");
                      int evalDoAfterBody = _jspx_th_html_select_2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                      out = _jspx_page_context.popBody();
                  }
                  if (_jspx_th_html_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_html_select_styleClass_size_property_onchange.reuse(_jspx_th_html_select_2);
                  out.write("\t\t\t\t\t\r\n");
                  out.write("\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
              out.write("\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t");
              if (_jspx_meth_c_otherwise_1(_jspx_th_c_choose_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t    \t");
              int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
          out.write("\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t\r\n");
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formTitleBlue\" height=\"10\" colspan=\"3\">Phenotype:</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t    <td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\"><label for=\"field3\">Phenotype:</label></td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\t\t\t\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_html_text_9(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formTitleBlue\" height=\"10\" colspan=\"3\">Genetic Description:</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\">Models with Transgene</td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t    ");
          if (_jspx_meth_html_checkbox_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t    <!-- NOTE: Needed to work around struts bug -->\r\n");
          out.write("\t\t\t    <input type=\"hidden\" name=\"searchEngineeredTransgene\" value=\"false\">\t\r\n");
          out.write("\t\t\t\t<label for=\"box1\">Check here to search for models with <br>trangene data</label>\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t    <td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\"><label for=\"field3\">Transgene Name:</label></td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\t\t\t\r\n");
          out.write("\t\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_3 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_3.setPageContext(_jspx_page_context);
          _jspx_th_html_select_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_3.setStyleClass("formFieldSized");
          _jspx_th_html_select_3.setSize("1");
          _jspx_th_html_select_3.setProperty("transgeneName");
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
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_1 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_1.setPageContext(_jspx_page_context);
              _jspx_th_html_options_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_3);
              _jspx_th_html_options_1.setName( Dropdowns.TRANSGENENAMEQUERYDROP );
              int _jspx_eval_html_options_1 = _jspx_th_html_options_1.doStartTag();
              if (_jspx_th_html_options_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_1);
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
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
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\">Models with Targeted Modification</td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t    ");
          if (_jspx_meth_html_checkbox_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t    <!-- NOTE: Needed to work around struts bug -->\r\n");
          out.write("\t\t\t    <input type=\"hidden\" name=\"searchTargetedModification\" value=\"false\">\t\r\n");
          out.write("\t\t\t\t<label for=\"box1\">Check here to search for models with <br>targeted modification data</label>\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t    <td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\"><label for=\"field3\">Targeted Modification Gene Name:</label></td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\t\t\t\r\n");
          out.write("\t\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_4 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_4.setPageContext(_jspx_page_context);
          _jspx_th_html_select_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_4.setStyleClass("formFieldSized");
          _jspx_th_html_select_4.setSize("1");
          _jspx_th_html_select_4.setProperty("geneName");
          int _jspx_eval_html_select_4 = _jspx_th_html_select_4.doStartTag();
          if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_4.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_2 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_2.setPageContext(_jspx_page_context);
              _jspx_th_html_options_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_4);
              _jspx_th_html_options_2.setName( Dropdowns.TARGETEDMODNAMEQUERYDROP );
              int _jspx_eval_html_options_2 = _jspx_th_html_options_2.doStartTag();
              if (_jspx_th_html_options_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_2);
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t");
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
          out.write("\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\t\t\r\n");
          out.write("\t\r\n");
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\">\r\n");
          out.write("\t\t\t\t<label for=\"field1\">Genomic Segment Designator:</label>\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\t\t\t\r\n");
          out.write("\t\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_5 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_5.setPageContext(_jspx_page_context);
          _jspx_th_html_select_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_5.setStyleClass("formFieldSized");
          _jspx_th_html_select_5.setSize("1");
          _jspx_th_html_select_5.setProperty("genomicSegDesignator");
          int _jspx_eval_html_select_5 = _jspx_th_html_select_5.doStartTag();
          if (_jspx_eval_html_select_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_5.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_3 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_3.setPageContext(_jspx_page_context);
              _jspx_th_html_options_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_5);
              _jspx_th_html_options_3.setName( Dropdowns.CLONEDESIGNATORQUERYDROP );
              int _jspx_eval_html_options_3 = _jspx_th_html_options_3.doStartTag();
              if (_jspx_th_html_options_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_3);
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_styleClass_size_property.reuse(_jspx_th_html_select_5);
          out.write("\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\">\r\n");
          out.write("\t\t\t\t<label for=\"field3\">Select Inducing Agent for Induced Mutation</label>\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\t\t\t\t\r\n");
          out.write("\t\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_6 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_6.setPageContext(_jspx_page_context);
          _jspx_th_html_select_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_6.setStyleClass("formFieldSized");
          _jspx_th_html_select_6.setSize("1");
          _jspx_th_html_select_6.setProperty("inducedMutationAgent");
          int _jspx_eval_html_select_6 = _jspx_th_html_select_6.doStartTag();
          if (_jspx_eval_html_select_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_6.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_4 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_4.setPageContext(_jspx_page_context);
              _jspx_th_html_options_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_6);
              _jspx_th_html_options_4.setName( Dropdowns.INDUCEDMUTATIONAGENTQUERYDROP );
              int _jspx_eval_html_options_4 = _jspx_th_html_options_4.doStartTag();
              if (_jspx_th_html_options_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_4);
              out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_styleClass_size_property.reuse(_jspx_th_html_select_6);
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formTitleBlue\" height=\"10\" colspan=\"3\">Carcinogenic Interventions:</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\t\t\r\n");
          out.write("\t\t\t<td class=\"formLabel\"><label for=\"field3\">Select Carcinogenic Agent Type:</label></td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_7 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property_onchange.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_7.setPageContext(_jspx_page_context);
          _jspx_th_html_select_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_7.setStyleClass("formFieldSized");
          _jspx_th_html_select_7.setSize("1");
          _jspx_th_html_select_7.setProperty("carcinogenicIntervention");
          _jspx_th_html_select_7.setOnchange("getOptions(this);");
          int _jspx_eval_html_select_7 = _jspx_th_html_select_7.doStartTag();
          if (_jspx_eval_html_select_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_7.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_5 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_5.setPageContext(_jspx_page_context);
              _jspx_th_html_options_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_7);
              _jspx_th_html_options_5.setName( Dropdowns.CARCINOGENICAGENTSQUERYDROP );
              int _jspx_eval_html_options_5 = _jspx_th_html_options_5.doStartTag();
              if (_jspx_th_html_options_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_5);
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_7.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_styleClass_size_property_onchange.reuse(_jspx_th_html_select_7);
          out.write("\t\t\t\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\"><label for=\"field3\">Select Carcinogenic Agent Name:</label></td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_8 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_8.setPageContext(_jspx_page_context);
          _jspx_th_html_select_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_8.setStyleClass("formFieldSized");
          _jspx_th_html_select_8.setSize("1");
          _jspx_th_html_select_8.setProperty("agentName");
          int _jspx_eval_html_select_8 = _jspx_th_html_select_8.doStartTag();
          if (_jspx_eval_html_select_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_8.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_6 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_6.setPageContext(_jspx_page_context);
              _jspx_th_html_options_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_8);
              _jspx_th_html_options_6.setName( Dropdowns.ENVIRONMENTALFACTORNAMESDROP );
              int _jspx_eval_html_options_6 = _jspx_th_html_options_6.doStartTag();
              if (_jspx_th_html_options_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_6);
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_8.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_styleClass_size_property.reuse(_jspx_th_html_select_8);
          out.write("\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formTitleBlue\" height=\"10\" colspan=\"3\">Cell Lines</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t    <td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\"><label for=\"field3\">Cell Line:</label></td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\t\t\t\r\n");
          out.write("\t\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_9 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_9.setPageContext(_jspx_page_context);
          _jspx_th_html_select_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_9.setStyleClass("formFieldSized");
          _jspx_th_html_select_9.setSize("1");
          _jspx_th_html_select_9.setProperty("cellLine");
          int _jspx_eval_html_select_9 = _jspx_th_html_select_9.doStartTag();
          if (_jspx_eval_html_select_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_9.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_7 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_7.setPageContext(_jspx_page_context);
              _jspx_th_html_options_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_9);
              _jspx_th_html_options_7.setName( Dropdowns.CELLLINENAMEQUERYDROP );
              int _jspx_eval_html_options_7 = _jspx_th_html_options_7.doStartTag();
              if (_jspx_th_html_options_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_7);
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_9.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_styleClass_size_property.reuse(_jspx_th_html_select_9);
          out.write("\t\t\t\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formTitleBlue\" height=\"10\" colspan=\"3\">Therapeutic Approaches</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\">Models with Therapeutic Approaches</td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t    ");
          if (_jspx_meth_html_checkbox_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t    <!-- NOTE: Needed to work around struts bug -->\r\n");
          out.write("\t\t\t    <input type=\"hidden\" name=\"searchTherapeuticApproaches\" value=\"false\">\t\r\n");
          out.write("\t\t\t\t<label for=\"box1\">Check here to search for models with <br>therapeutic approaches data</label>\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t    <td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\"><label for=\"field3\">Compound/Drug:</label></td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\t\t\t\r\n");
          out.write("\t\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_10 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_10.setPageContext(_jspx_page_context);
          _jspx_th_html_select_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_10.setStyleClass("formFieldSized");
          _jspx_th_html_select_10.setSize("1");
          _jspx_th_html_select_10.setProperty("therapeuticApproach");
          int _jspx_eval_html_select_10 = _jspx_th_html_select_10.doStartTag();
          if (_jspx_eval_html_select_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_10.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_8 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_8.setPageContext(_jspx_page_context);
              _jspx_th_html_options_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_10);
              _jspx_th_html_options_8.setName( Dropdowns.THERAPEUTICAPPROACHDRUGQUERYDROP );
              int _jspx_eval_html_options_8 = _jspx_th_html_options_8.doStartTag();
              if (_jspx_th_html_options_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_8);
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_10.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_styleClass_size_property.reuse(_jspx_th_html_select_10);
          out.write("\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formTitleBlue\" height=\"10\" colspan=\"3\">Histopathology</td>\r\n");
          out.write("\t\t</tr>\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\">Models with Metastasis</td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t    ");
          if (_jspx_meth_html_checkbox_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t    <!-- NOTE: Needed to work around struts bug -->\r\n");
          out.write("\t\t\t    <input type=\"hidden\" name=\"searchHistoMetastasis\" value=\"false\">\r\n");
          out.write("\t\t\t\t<label for=\"box1\">Check here to search for models with Metastasis</label>\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formTitleBlue\" height=\"10\" colspan=\"3\">Transient Interference</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\">Transient Interference</td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t    ");
          if (_jspx_meth_html_checkbox_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t    <!-- NOTE: Needed to work around struts bug -->\r\n");
          out.write("\t\t\t    <input type=\"hidden\" name=\"searchTransientInterference\" value=\"false\">\r\n");
          out.write("\t\t\t\t<label for=\"box1\">Check here to search for models with transient interference data</label>\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formTitleBlue\" height=\"10\" colspan=\"3\">Microarray Data</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\">Microarray Data</td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t    ");
          if (_jspx_meth_html_checkbox_5(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t    <!-- NOTE: Needed to work around struts bug -->\r\n");
          out.write("\t\t\t    <input type=\"hidden\" name=\"searchMicroArrayData\" value=\"false\">\r\n");
          out.write("\t\t\t\t<label for=\"box1\">Check here to search for models with microarray data</label>\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formTitleBlue\" height=\"10\" colspan=\"3\">Image Data</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\">Image Data</td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t    ");
          if (_jspx_meth_html_checkbox_6(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t    <!-- NOTE: Needed to work around struts bug -->\r\n");
          out.write("\t\t\t    <input type=\"hidden\" name=\"searchImageData\" value=\"false\">\r\n");
          out.write("\t\t\t\t<label for=\"box1\">Check here to search for models with images</label>\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formTitleBlue\" height=\"10\" colspan=\"3\">Tool Strain</td>\r\n");
          out.write("\t\t</tr>\t\t\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\">Tool Strain</td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\r\n");
          out.write("\t\t\t    ");
          if (_jspx_meth_html_checkbox_7(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t    <!-- NOTE: Needed to work around struts bug -->\r\n");
          out.write("\t\t\t    <input type=\"hidden\" name=\"searchToolStrain\" value=\"false\">\r\n");
          out.write("\t\t\t\t<label for=\"box1\">Check here to search for tool strains <BR><BR>(A tool strain is a strain that does not develop cancer, \r\n");
          out.write("\t\t\t\t<BR>but can be used to create cancer-bearing models. Example: strain carrying a floxed gene)</label>\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formTitleBlue\" height=\"10\" colspan=\"3\">Data from External Sources</td>\r\n");
          out.write("\t\t</tr>\t\t\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td class=\"formRequiredNotice\" width=\"5\">&nbsp;</td>\r\n");
          out.write("\t\t\t<td class=\"formLabel\"><label for=\"field3\">External Data Source:</label></td>\r\n");
          out.write("\t\t\t<td class=\"formField\">\t\t\t\t\r\n");
          out.write("\t\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_11 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_size_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_11.setPageContext(_jspx_page_context);
          _jspx_th_html_select_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_11.setStyleClass("formFieldSized");
          _jspx_th_html_select_11.setSize("1");
          _jspx_th_html_select_11.setProperty("externalSource");
          int _jspx_eval_html_select_11 = _jspx_th_html_select_11.doStartTag();
          if (_jspx_eval_html_select_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_11.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  html:options
              org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_9 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
              _jspx_th_html_options_9.setPageContext(_jspx_page_context);
              _jspx_th_html_options_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_11);
              _jspx_th_html_options_9.setName( Dropdowns.EXTERNALSOURCEQUERYDROP );
              int _jspx_eval_html_options_9 = _jspx_th_html_options_9.doStartTag();
              if (_jspx_th_html_options_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_options_name_nobody.reuse(_jspx_th_html_options_9);
              out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_11.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_styleClass_size_property.reuse(_jspx_th_html_select_11);
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t<tr>\t\t\t\r\n");
          out.write("\t\t\t<td align=\"right\" colspan=\"3\">\r\n");
          out.write("\t\t\t\t<!-- action buttons begins -->\r\n");
          out.write("\t\t\t\t<TABLE cellpadding=\"4\" cellspacing=\"0\" border=\"0\">\r\n");
          out.write("\t\t\t\t\t  \r\n");
          out.write("\t\t\t\t\t  ");
          if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t  \t\t\t\t  \r\n");
          out.write("\t  \t\t\t\t  ");
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
              out.write("\t\t\t\t\t  \t  ");
              if (_jspx_meth_bean_message_0(_jspx_th_html_submit_1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t  \t\t\t\t  ");
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
          out.write("\r\n");
          out.write("\t  \t\t\t\t  \r\n");
          out.write("\t\t\t\t  ");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_form_onsubmit_focus_action.reuse(_jspx_th_html_form_0);
      out.write("\t\t\r\n");
      out.write("\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<!-- action buttons end -->\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("</td></tr></TABLE>\t\r\n");
      out.write("\r\n");
      out.write("<SCRIPT LANGUAGE=\"JavaScript\">\r\n");
      out.write("    checkFields();\r\n");
      out.write("\tsetAgentName(); \r\n");
      out.write("\tgetOrganDiseaseTree();   \r\n");
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

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setProperty("keyword");
    _jspx_th_html_text_0.setSize("55");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_size_property_nobody.reuse(_jspx_th_html_text_0);
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
    _jspx_th_camod_cshelp_0.setTopic("advanced_search_help");
    _jspx_th_camod_cshelp_0.setKey("ignore");
    _jspx_th_camod_cshelp_0.setImage("/camod/images/iconHelp.gif");
    _jspx_th_camod_cshelp_0.setText("");
    int _jspx_eval_camod_cshelp_0 = _jspx_th_camod_cshelp_0.doStartTag();
    if (_jspx_th_camod_cshelp_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.reuse(_jspx_th_camod_cshelp_0);
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
    _jspx_th_html_text_1.setSize("30");
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
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_when_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_when_1(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_when_2(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\t\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_otherwise_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\r\n");
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
    _jspx_th_c_when_0.setTest("${searchspeciescommonname == 'Mouse'}");
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<td class=\"formLabel\"><label for=\"field1\">Site of Lesion/Tumor:</label>&nbsp;\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_camod_cshelp_1(_jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t<a href=\"javascript:showMouseTissueTree('searchForm', 'organTissueCode', 'organTissueName', 'organ', false)\">\r\n");
        out.write("\t\t\t\t\t\t<IMG src=\"images\\selectUP.gif\" align=middle border=0></a>\r\n");
        out.write("\t\t\t\t\t</td>\t\t\t\t\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_hidden_0(_jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t<input type=\"hidden\" name=\"organTissueName\" />\r\n");
        out.write("\t\t\t\t\t<td class=\"formField\">\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_text_2(_jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_ajax_autocomplete_1(_jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\t\t\t\t\r\n");
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

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_html_text_2.setStyleClass("formFieldSized");
    _jspx_th_html_text_2.setDisabled(true);
    _jspx_th_html_text_2.setProperty("organ");
    _jspx_th_html_text_2.setSize("30");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_ajax_autocomplete_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ajax:autocomplete
    org.ajaxtags.tags.AjaxAutocompleteTag _jspx_th_ajax_autocomplete_1 = (org.ajaxtags.tags.AjaxAutocompleteTag) _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.get(org.ajaxtags.tags.AjaxAutocompleteTag.class);
    _jspx_th_ajax_autocomplete_1.setPageContext(_jspx_page_context);
    _jspx_th_ajax_autocomplete_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_ajax_autocomplete_1.setBaseUrl("/camod/autocomplete.view");
    _jspx_th_ajax_autocomplete_1.setSource("organ");
    _jspx_th_ajax_autocomplete_1.setTarget("organTissueCode");
    _jspx_th_ajax_autocomplete_1.setParameters("organTissueCode={organTissueCode}");
    _jspx_th_ajax_autocomplete_1.setClassName("autocomplete");
    _jspx_th_ajax_autocomplete_1.setMinimumCharacters("1");
    int _jspx_eval_ajax_autocomplete_1 = _jspx_th_ajax_autocomplete_1.doStartTag();
    if (_jspx_th_ajax_autocomplete_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.reuse(_jspx_th_ajax_autocomplete_1);
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
    _jspx_th_c_when_1.setTest("${searchspeciescommonname == 'Rat'}");
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\t\r\n");
        out.write("\t\t\t\t\t<td class=\"formLabel\"><label for=\"field1\">Site of Lesion/Tumor:</label>&nbsp;\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_camod_cshelp_2(_jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t\t<a href=\"javascript:showRatTissueTree('searchForm', 'organTissueCode', 'organTissueName', 'organ', false)\">\r\n");
        out.write("\t\t\t\t\t\t<IMG src=\"images\\selectUP.gif\" align=middle border=0></a>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_hidden_1(_jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t<input type=\"hidden\" name=\"organTissueName\" />\r\n");
        out.write("\t\t\t\t\t<td class=\"formField\">\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_text_3(_jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_ajax_autocomplete_2(_jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\r\n");
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

  private boolean _jspx_meth_html_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(_jspx_page_context);
    _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_html_text_3.setStyleClass("formFieldSized");
    _jspx_th_html_text_3.setDisabled(true);
    _jspx_th_html_text_3.setProperty("organ");
    _jspx_th_html_text_3.setSize("30");
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.reuse(_jspx_th_html_text_3);
    return false;
  }

  private boolean _jspx_meth_ajax_autocomplete_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ajax:autocomplete
    org.ajaxtags.tags.AjaxAutocompleteTag _jspx_th_ajax_autocomplete_2 = (org.ajaxtags.tags.AjaxAutocompleteTag) _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.get(org.ajaxtags.tags.AjaxAutocompleteTag.class);
    _jspx_th_ajax_autocomplete_2.setPageContext(_jspx_page_context);
    _jspx_th_ajax_autocomplete_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_ajax_autocomplete_2.setBaseUrl("/camod/autocomplete.view");
    _jspx_th_ajax_autocomplete_2.setSource("organ");
    _jspx_th_ajax_autocomplete_2.setTarget("organTissueCode");
    _jspx_th_ajax_autocomplete_2.setParameters("organTissueCode={organTissueCode}");
    _jspx_th_ajax_autocomplete_2.setClassName("autocomplete");
    _jspx_th_ajax_autocomplete_2.setMinimumCharacters("1");
    int _jspx_eval_ajax_autocomplete_2 = _jspx_th_ajax_autocomplete_2.doStartTag();
    if (_jspx_th_ajax_autocomplete_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.reuse(_jspx_th_ajax_autocomplete_2);
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
    _jspx_th_c_when_2.setTest("${searchspeciescommonname == 'Zebrafish'}");
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<td class=\"formLabel\"><label for=\"field1\">Site of Lesion/Tumor:</label>&nbsp;\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_camod_cshelp_3(_jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t\t<a href=\"javascript:showZebrafishTissueTree('searchForm', 'organTissueCode', 'organTissueName', 'organ', false)\">\r\n");
        out.write("\t\t\t\t\t\t<IMG src=\"images\\selectUP.gif\" align=middle border=0></a>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_hidden_2(_jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t<input type=\"hidden\" name=\"organTissueName\" />\r\n");
        out.write("\t\t\t\t\t<td class=\"formField\">\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_text_4(_jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_ajax_autocomplete_3(_jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\r\n");
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

  private boolean _jspx_meth_html_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_4 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_4.setPageContext(_jspx_page_context);
    _jspx_th_html_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_html_text_4.setStyleClass("formFieldSized");
    _jspx_th_html_text_4.setDisabled(true);
    _jspx_th_html_text_4.setProperty("organ");
    _jspx_th_html_text_4.setSize("30");
    int _jspx_eval_html_text_4 = _jspx_th_html_text_4.doStartTag();
    if (_jspx_th_html_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.reuse(_jspx_th_html_text_4);
    return false;
  }

  private boolean _jspx_meth_ajax_autocomplete_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ajax:autocomplete
    org.ajaxtags.tags.AjaxAutocompleteTag _jspx_th_ajax_autocomplete_3 = (org.ajaxtags.tags.AjaxAutocompleteTag) _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.get(org.ajaxtags.tags.AjaxAutocompleteTag.class);
    _jspx_th_ajax_autocomplete_3.setPageContext(_jspx_page_context);
    _jspx_th_ajax_autocomplete_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_ajax_autocomplete_3.setBaseUrl("/camod/autocomplete.view");
    _jspx_th_ajax_autocomplete_3.setSource("organ");
    _jspx_th_ajax_autocomplete_3.setTarget("organTissueCode");
    _jspx_th_ajax_autocomplete_3.setParameters("organTissueCode={organTissueCode}");
    _jspx_th_ajax_autocomplete_3.setClassName("autocomplete");
    _jspx_th_ajax_autocomplete_3.setMinimumCharacters("1");
    int _jspx_eval_ajax_autocomplete_3 = _jspx_th_ajax_autocomplete_3.doStartTag();
    if (_jspx_th_ajax_autocomplete_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.reuse(_jspx_th_ajax_autocomplete_3);
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
        out.write("\t\t\t\t\t<td class=\"formLabel\"><label for=\"field1\">Site of Lesion/Tumor:</label>&nbsp;\r\n");
        out.write("\t\t\t\t\t</td>\t\t\t\t\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_hidden_3(_jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t<input type=\"hidden\" name=\"organTissueName\" />\r\n");
        out.write("\t\t\t\t\t<td class=\"formField\">\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_text_5(_jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_ajax_autocomplete_4(_jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\r\n");
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

  private boolean _jspx_meth_html_hidden_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_3 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_3.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_html_hidden_3.setProperty("organTissueCode");
    int _jspx_eval_html_hidden_3 = _jspx_th_html_hidden_3.doStartTag();
    if (_jspx_th_html_hidden_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_3);
    return false;
  }

  private boolean _jspx_meth_html_text_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_5 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_5.setPageContext(_jspx_page_context);
    _jspx_th_html_text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_html_text_5.setStyleClass("formFieldSized");
    _jspx_th_html_text_5.setDisabled(false);
    _jspx_th_html_text_5.setProperty("organ");
    _jspx_th_html_text_5.setSize("30");
    int _jspx_eval_html_text_5 = _jspx_th_html_text_5.doStartTag();
    if (_jspx_th_html_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.reuse(_jspx_th_html_text_5);
    return false;
  }

  private boolean _jspx_meth_ajax_autocomplete_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ajax:autocomplete
    org.ajaxtags.tags.AjaxAutocompleteTag _jspx_th_ajax_autocomplete_4 = (org.ajaxtags.tags.AjaxAutocompleteTag) _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.get(org.ajaxtags.tags.AjaxAutocompleteTag.class);
    _jspx_th_ajax_autocomplete_4.setPageContext(_jspx_page_context);
    _jspx_th_ajax_autocomplete_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_ajax_autocomplete_4.setBaseUrl("/camod/autocomplete.view");
    _jspx_th_ajax_autocomplete_4.setSource("organ");
    _jspx_th_ajax_autocomplete_4.setTarget("organTissueCode");
    _jspx_th_ajax_autocomplete_4.setParameters("organTissueCode={organTissueCode}");
    _jspx_th_ajax_autocomplete_4.setClassName("autocomplete");
    _jspx_th_ajax_autocomplete_4.setMinimumCharacters("1");
    int _jspx_eval_ajax_autocomplete_4 = _jspx_th_ajax_autocomplete_4.doStartTag();
    if (_jspx_th_ajax_autocomplete_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.reuse(_jspx_th_ajax_autocomplete_4);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_3.setTest("${searchspeciescommonname == 'Mouse'}");
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<td class=\"formLabel\"><label for=\"field2\">Diagnosis:</label>&nbsp;\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_cshelp_4(_jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t<a href=\"javascript:showMouseDiagnosisTree('searchForm', 'diagnosisCode', 'diagnosisName', 'tumorClassification', false)\">\r\n");
        out.write("\t\t\t\t\t\t<IMG src=\"images\\selectUP.gif\" align=middle border=0></a>\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_hidden_4(_jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_hidden_5(_jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<td class=\"formField\">\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_html_text_6(_jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_ajax_autocomplete_5(_jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\r\n");
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
    _jspx_th_camod_cshelp_4.setKey("DIAGNOSIS.CONCEPT_CODE");
    _jspx_th_camod_cshelp_4.setImage("images/helpTooltip.gif");
    _jspx_th_camod_cshelp_4.setText("Tool Tip Test 1");
    int _jspx_eval_camod_cshelp_4 = _jspx_th_camod_cshelp_4.doStartTag();
    if (_jspx_th_camod_cshelp_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.reuse(_jspx_th_camod_cshelp_4);
    return false;
  }

  private boolean _jspx_meth_html_hidden_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_4 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_4.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_html_hidden_4.setProperty("diagnosisCode");
    int _jspx_eval_html_hidden_4 = _jspx_th_html_hidden_4.doStartTag();
    if (_jspx_th_html_hidden_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_4);
    return false;
  }

  private boolean _jspx_meth_html_hidden_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_5 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_5.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_html_hidden_5.setProperty("diagnosisName");
    int _jspx_eval_html_hidden_5 = _jspx_th_html_hidden_5.doStartTag();
    if (_jspx_th_html_hidden_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_5);
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
    _jspx_th_html_text_6.setProperty("tumorClassification");
    _jspx_th_html_text_6.setSize("30");
    int _jspx_eval_html_text_6 = _jspx_th_html_text_6.doStartTag();
    if (_jspx_th_html_text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.reuse(_jspx_th_html_text_6);
    return false;
  }

  private boolean _jspx_meth_ajax_autocomplete_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ajax:autocomplete
    org.ajaxtags.tags.AjaxAutocompleteTag _jspx_th_ajax_autocomplete_5 = (org.ajaxtags.tags.AjaxAutocompleteTag) _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.get(org.ajaxtags.tags.AjaxAutocompleteTag.class);
    _jspx_th_ajax_autocomplete_5.setPageContext(_jspx_page_context);
    _jspx_th_ajax_autocomplete_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_ajax_autocomplete_5.setBaseUrl("/camod/autocomplete.view");
    _jspx_th_ajax_autocomplete_5.setSource("tumorClassification");
    _jspx_th_ajax_autocomplete_5.setTarget("diagnosisCode");
    _jspx_th_ajax_autocomplete_5.setParameters("diagnosisCode={diagnosisCode}");
    _jspx_th_ajax_autocomplete_5.setClassName("autocomplete");
    _jspx_th_ajax_autocomplete_5.setMinimumCharacters("1");
    int _jspx_eval_ajax_autocomplete_5 = _jspx_th_ajax_autocomplete_5.doStartTag();
    if (_jspx_th_ajax_autocomplete_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.reuse(_jspx_th_ajax_autocomplete_5);
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
    _jspx_th_c_when_4.setTest("${searchspeciescommonname == 'Rat'}");
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<td class=\"formLabel\"><label for=\"field2\">Diagnosis:</label>&nbsp;\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_camod_cshelp_5(_jspx_th_c_when_4, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t<a href=\"javascript:showRatDiagnosisTree('searchForm', 'diagnosisCode', 'diagnosisName', 'tumorClassification', false)\">\r\n");
        out.write("\t\t\t\t\t\t<IMG src=\"images\\selectUP.gif\" align=middle border=0></a>\t\r\n");
        out.write("\t\t\t\t\t</td>\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_hidden_6(_jspx_th_c_when_4, _jspx_page_context))
          return true;
        out.write("\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_hidden_7(_jspx_th_c_when_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<td class=\"formField\">\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_html_text_7(_jspx_th_c_when_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
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

  private boolean _jspx_meth_camod_cshelp_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:cshelp
    gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag _jspx_th_camod_cshelp_5 = (gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag) _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.get(gov.nih.nci.camod.webapp.taglib.ContextSensitiveHelpTag.class);
    _jspx_th_camod_cshelp_5.setPageContext(_jspx_page_context);
    _jspx_th_camod_cshelp_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_camod_cshelp_5.setTopic("data_tree_help");
    _jspx_th_camod_cshelp_5.setKey("DIAGNOSIS.CONCEPT_CODE");
    _jspx_th_camod_cshelp_5.setImage("images/helpTooltip.gif");
    _jspx_th_camod_cshelp_5.setText("Tool Tip Test 1");
    int _jspx_eval_camod_cshelp_5 = _jspx_th_camod_cshelp_5.doStartTag();
    if (_jspx_th_camod_cshelp_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_cshelp_topic_text_key_image_nobody.reuse(_jspx_th_camod_cshelp_5);
    return false;
  }

  private boolean _jspx_meth_html_hidden_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_6 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_6.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_html_hidden_6.setProperty("diagnosisCode");
    int _jspx_eval_html_hidden_6 = _jspx_th_html_hidden_6.doStartTag();
    if (_jspx_th_html_hidden_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_6);
    return false;
  }

  private boolean _jspx_meth_html_hidden_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_7 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_7.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_html_hidden_7.setProperty("diagnosisName");
    int _jspx_eval_html_hidden_7 = _jspx_th_html_hidden_7.doStartTag();
    if (_jspx_th_html_hidden_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_7);
    return false;
  }

  private boolean _jspx_meth_html_text_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_7 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_7.setPageContext(_jspx_page_context);
    _jspx_th_html_text_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_html_text_7.setStyleClass("formFieldSized");
    _jspx_th_html_text_7.setDisabled(true);
    _jspx_th_html_text_7.setProperty("tumorClassification");
    _jspx_th_html_text_7.setSize("30");
    int _jspx_eval_html_text_7 = _jspx_th_html_text_7.doStartTag();
    if (_jspx_th_html_text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.reuse(_jspx_th_html_text_7);
    return false;
  }

  private boolean _jspx_meth_html_hidden_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_8 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_8.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_5);
    _jspx_th_html_hidden_8.setProperty("diagnosisCode");
    int _jspx_eval_html_hidden_8 = _jspx_th_html_hidden_8.doStartTag();
    if (_jspx_th_html_hidden_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_8);
    return false;
  }

  private boolean _jspx_meth_html_hidden_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_9 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_9.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_5);
    _jspx_th_html_hidden_9.setProperty("diagnosisName");
    int _jspx_eval_html_hidden_9 = _jspx_th_html_hidden_9.doStartTag();
    if (_jspx_th_html_hidden_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_9);
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
        out.write("\t\t\t\t\t<td class=\"formLabel\"><label for=\"field2\">Diagnosis:</label>&nbsp;\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_hidden_10(_jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_hidden_11(_jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<td class=\"formField\">\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_html_text_8(_jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_ajax_autocomplete_6(_jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t</td>\t\t\t\t\r\n");
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

  private boolean _jspx_meth_html_hidden_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_10 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_10.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_html_hidden_10.setProperty("diagnosisCode");
    int _jspx_eval_html_hidden_10 = _jspx_th_html_hidden_10.doStartTag();
    if (_jspx_th_html_hidden_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_10);
    return false;
  }

  private boolean _jspx_meth_html_hidden_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_11 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_11.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_html_hidden_11.setProperty("diagnosisName");
    int _jspx_eval_html_hidden_11 = _jspx_th_html_hidden_11.doStartTag();
    if (_jspx_th_html_hidden_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_11);
    return false;
  }

  private boolean _jspx_meth_html_text_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_8 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_8.setPageContext(_jspx_page_context);
    _jspx_th_html_text_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_html_text_8.setStyleClass("formFieldSized");
    _jspx_th_html_text_8.setDisabled(false);
    _jspx_th_html_text_8.setProperty("tumorClassification");
    _jspx_th_html_text_8.setSize("25");
    int _jspx_eval_html_text_8 = _jspx_th_html_text_8.doStartTag();
    if (_jspx_th_html_text_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_disabled_nobody.reuse(_jspx_th_html_text_8);
    return false;
  }

  private boolean _jspx_meth_ajax_autocomplete_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ajax:autocomplete
    org.ajaxtags.tags.AjaxAutocompleteTag _jspx_th_ajax_autocomplete_6 = (org.ajaxtags.tags.AjaxAutocompleteTag) _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.get(org.ajaxtags.tags.AjaxAutocompleteTag.class);
    _jspx_th_ajax_autocomplete_6.setPageContext(_jspx_page_context);
    _jspx_th_ajax_autocomplete_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_ajax_autocomplete_6.setBaseUrl("/camod/autocomplete.view");
    _jspx_th_ajax_autocomplete_6.setSource("tumorClassification");
    _jspx_th_ajax_autocomplete_6.setTarget("diagnosisCode");
    _jspx_th_ajax_autocomplete_6.setParameters("diagnosisCode={diagnosisCode}");
    _jspx_th_ajax_autocomplete_6.setClassName("autocomplete");
    _jspx_th_ajax_autocomplete_6.setMinimumCharacters("1");
    int _jspx_eval_ajax_autocomplete_6 = _jspx_th_ajax_autocomplete_6.doStartTag();
    if (_jspx_th_ajax_autocomplete_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ajax_autocomplete_target_source_parameters_minimumCharacters_className_baseUrl_nobody.reuse(_jspx_th_ajax_autocomplete_6);
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
    _jspx_th_html_text_9.setProperty("phenotype");
    _jspx_th_html_text_9.setSize("30");
    int _jspx_eval_html_text_9 = _jspx_th_html_text_9.doStartTag();
    if (_jspx_th_html_text_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_size_property_nobody.reuse(_jspx_th_html_text_9);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_0 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_property_onclick_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_0.setProperty("searchEngineeredTransgene");
    _jspx_th_html_checkbox_0.setOnclick("checkFields()");
    int _jspx_eval_html_checkbox_0 = _jspx_th_html_checkbox_0.doStartTag();
    if (_jspx_th_html_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_property_onclick_nobody.reuse(_jspx_th_html_checkbox_0);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_1 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_property_onclick_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_1.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_1.setProperty("searchTargetedModification");
    _jspx_th_html_checkbox_1.setOnclick("checkFields()");
    int _jspx_eval_html_checkbox_1 = _jspx_th_html_checkbox_1.doStartTag();
    if (_jspx_th_html_checkbox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_property_onclick_nobody.reuse(_jspx_th_html_checkbox_1);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_2 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_property_onclick_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_2.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_2.setProperty("searchTherapeuticApproaches");
    _jspx_th_html_checkbox_2.setOnclick("checkFields()");
    int _jspx_eval_html_checkbox_2 = _jspx_th_html_checkbox_2.doStartTag();
    if (_jspx_th_html_checkbox_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_property_onclick_nobody.reuse(_jspx_th_html_checkbox_2);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_3 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_3.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_3.setProperty("searchHistoMetastasis");
    int _jspx_eval_html_checkbox_3 = _jspx_th_html_checkbox_3.doStartTag();
    if (_jspx_th_html_checkbox_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_property_nobody.reuse(_jspx_th_html_checkbox_3);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_4 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_4.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_4.setProperty("searchTransientInterference");
    int _jspx_eval_html_checkbox_4 = _jspx_th_html_checkbox_4.doStartTag();
    if (_jspx_th_html_checkbox_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_property_nobody.reuse(_jspx_th_html_checkbox_4);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_5 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_5.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_5.setProperty("searchMicroArrayData");
    int _jspx_eval_html_checkbox_5 = _jspx_th_html_checkbox_5.doStartTag();
    if (_jspx_th_html_checkbox_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_property_nobody.reuse(_jspx_th_html_checkbox_5);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_6 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_6.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_6.setProperty("searchImageData");
    int _jspx_eval_html_checkbox_6 = _jspx_th_html_checkbox_6.doStartTag();
    if (_jspx_th_html_checkbox_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_property_nobody.reuse(_jspx_th_html_checkbox_6);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_7 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_7.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_7.setProperty("searchToolStrain");
    int _jspx_eval_html_checkbox_7 = _jspx_th_html_checkbox_7.doStartTag();
    if (_jspx_th_html_checkbox_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_property_nobody.reuse(_jspx_th_html_checkbox_7);
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
    _jspx_th_html_submit_0.setOnclick("blankKeyword()");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_submit_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t  Search\r\n");
        out.write("\t\t\t\t\t  ");
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
