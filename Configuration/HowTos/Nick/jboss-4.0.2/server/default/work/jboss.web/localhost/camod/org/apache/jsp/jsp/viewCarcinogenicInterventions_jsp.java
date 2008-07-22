package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import gov.nih.nci.camod.webapp.util.SidebarUtil;
import gov.nih.nci.camod.Constants;
import java.util.List;
import gov.nih.nci.camod.Constants;
import java.util.List;
import gov.nih.nci.camod.domain.AnimalModel;
import gov.nih.nci.camod.Constants.*;
import gov.nih.nci.camod.Constants;
import gov.nih.nci.camod.domain.Comments;

public final class viewCarcinogenicInterventions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(12);
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
    _jspx_dependants.add("/jsp/includeComments.jsp");
    _jspx_dependants.add("/jsp/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_xhtml_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_styleClass_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_present_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_type_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_styleClass_href;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_camod_highlight;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_escapeXml_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

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
    _jspx_tagPool_camod_highlight = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_escapeXml_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_xhtml_nobody.release();
    _jspx_tagPool_html_link_styleClass_action.release();
    _jspx_tagPool_logic_present_name.release();
    _jspx_tagPool_logic_iterate_type_name_id.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_html_link_styleClass_href.release();
    _jspx_tagPool_bean_define_name_id_nobody.release();
    _jspx_tagPool_camod_highlight.release();
    _jspx_tagPool_c_out_value_escapeXml_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_forEach_var_items.release();
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
      			null, true, 65536, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;



/**
 * 
 * $Id: viewCarcinogenicInterventions_jsp.java,v 1.1 2008-07-22 19:39:45 pandyas Exp $
 * 
 * $Log: not supported by cvs2svn $
 * Revision 1.35  2007/10/31 19:33:58  pandyas
 * Fixed #8188 	Rename UnctrlVocab items to text entries
 *
 * Revision 1.34  2007/08/27 15:34:57  pandyas
 * Reverted back to EVSPreferredDescription since this was fixed
 *
 * Revision 1.33  2007/06/19 20:41:06  pandyas
 * The EVSPreferredDescription does not return results for Zebrafish vocabulary so the code was changed (This impacts organ.EVSPreferredDescription,  disease.EVSPreferredDescription, and developmentalStage) for all screens with trees
 *
 * Revision 1.32  2007/05/16 16:42:18  pandyas
 * Removed two <br> after Radiation and after Gene Delivery to look better
 *
 * Revision 1.31  2007/03/28 18:04:32  pandyas
 * Modified for the following Test Track items:
 * #462 - Customized search for carcinogens for Jackson Lab data
 * #494 - Advanced search for Carcinogens for Jackson Lab data
 *
 * Revision 1.30  2006/11/13 20:19:50  pandyas
 * Modified IMG SRC location to include complete location (added /camod/...)
 *
 * Revision 1.29  2006/11/01 19:50:08  pandyas
 * Changed the values for the TREATMENT_TYPES inserted in the environmental factor table as follows:
 *
 * Instead of inserting Growth Factor insert Growth Factor Type
 * Instead of inserting Hormone insert Hormone Type
 * Instead of inserting Other insert Other Type
 * Instead of inserting Radiation insert Radiation Type
 *
 * Revision 1.28  2006/11/01 19:25:21  pandyas
 * modified to view CI for Jackson Lab data - Environmental_Factor.Type for JAX data needs to be unique from caMOD types already used.
 *
 * Revision 1.27  2006/10/31 19:36:21  pandyas
 * added more code to allow for html markup in fields
 *
 * Revision 1.26  2006/10/27 18:39:24  pandyas
 * Fixed fields in display page to allow for html markup
 *
 * Revision 1.25  2006/10/04 14:48:26  pandyas
 * added dosage unit and age of treatment unit to view - missed
 *
 * Revision 1.24  2006/05/24 16:58:40  georgeda
 * Fixed gene delivery display prob.
 *
 * Revision 1.23  2006/04/28 19:48:14  schroedn
 * Defect #55
 * Added HighlightTextTag
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
 * $Id: viewCarcinogenicInterventions_jsp.java,v 1.1 2008-07-22 19:39:45 pandyas Exp $
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
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_define_0.setParent(null);
      _jspx_th_bean_define_0.setId("mdl");
      _jspx_th_bean_define_0.setName("animalmodel");
      int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
      if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_0);
      java.lang.Object mdl = null;
      mdl = (java.lang.Object) _jspx_page_context.findAttribute("mdl");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<TABLE cellpadding=\"10\" cellspacing=\"0\" border=\"0\" class=\"contentBegins\" width=\"100%\" height=\"100%\">\r\n");
      out.write("<tr><td>\r\n");
      out.write("\r\n");
      out.write("\t<TABLE summary=\"\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"contentPage\" width=\"100%\" height=\"100%\">\r\n");
      out.write("\t<tr><td valign=\"top\">\r\n");
      out.write("\t\t<TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"contentBegins\" width=\"100%\">\r\n");
      out.write("\t\t<tr><td>\r\n");
      out.write("\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"1\" align=\"center\" width=\"100%\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"formTitle\" height=\"20\" colspan=\"7\">\r\n");
      out.write("\t\t\t\t\tCarcinogenic Agents - Model:\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_camod_highlight_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</td>\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\t\t\t\r\n");
      out.write("\t\t\t</TABLE>\t\t\t\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t<!--   Start Chemical / Drug Section (caMOD and Jackson Lab data) ------------------------------------------------>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!--   Start Growth Factor Section (caMOD and Jackson Lab data) ------------------------------------------------>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--   Start Hormone Section  (caMOD and Jackson Lab data) ------------------------------------------------>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_12(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_13(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!--   Start Radiation Section (caMOD and Jackson Lab data) ------------------------------------------------>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_18(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_19(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_12(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!--   Start Surgery / Other Section ------------------------------------------------>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_24(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_25(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_15(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("     \t\t<!--   Start Viral Treatment Section (caMOD and Jackson Lab data) ------------------------------------------------>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_30(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_31(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_18(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--   Start Environmental Factor Section (caMOD data) ------------------------------------------------>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_36(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_37(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_21(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--   Start Gene Delivery Section (caMOD data) ------------------------------------------------>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_40(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_41(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_22(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--   Start Nutritional Factor Section  (caMOD data) ------------------------------------------------>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_44(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_45(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_23(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("     \t\t<!--   Start Antibody Section (Jackson Lab data) ------------------------------------------------>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_48(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_49(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_24(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("     \t\t<!--   Start Bacteria Section (Jackson Lab data) ------------------------------------------------>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_52(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_53(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_25(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     \t\t<!--   Start Plasmid Section (Jackson Lab data) ------------------------------------------------>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_56(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_57(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_26(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("     \t\t<!--   Start Transposon Section (Jackson Lab data) ------------------------------------------------>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_60(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_set_61(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_27(_jspx_page_context))
        return;
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</td></tr></TABLE>\r\n");
      out.write("\t</td></tr></TABLE>\r\n");
      out.write("</tr></td></TABLE>\r\n");
      out.write("\r\n");
      out.write("<TABLE cellpadding=\"10\" cellspacing=\"0\" border=\"0\" class=\"contentBegins\" width=\"100%\" height=\"100%\">\r\n");
      out.write("\t<tr><td>\r\n");
      out.write("\t<TABLE summary=\"\" cellpadding=\"7\" cellspacing=\"0\" border=\"0\" align=\"left\" width=\"100%\">\r\n");
      out.write("    ");
 pageContext.setAttribute(Parameters.MODELSECTIONVALUE, Pages.CARCINOGENIC_INTERVENTION); 
      out.write("\r\n");
      out.write("    ");

 /*
  *   $Id: viewCarcinogenicInterventions_jsp.java,v 1.1 2008-07-22 19:39:45 pandyas Exp $
  *   
  *   $Log: not supported by cvs2svn $
  *   Revision 1.5  2005/11/16 17:03:06  georgeda
  *   Defect #53. Added text to tell user to login to place a comment
  *
  *   Revision 1.4  2005/11/16 15:31:35  georgeda
  *   Defect #41. Clean up of email functionality
  *
  */

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- display comments -->\r\n");
      out.write("\t\t\r\n");
      out.write("<!--  set some attributes to build the URL -->\r\n");
 pageContext.setAttribute("modelIdTag", Parameters.MODELID); 
      out.write('\r');
      out.write('\n');
 pageContext.setAttribute("modelSectionTag", Parameters.MODELSECTIONNAME); 
      out.write("\r\n");
      out.write("\t\t\r\n");
 if (pageContext.getSession().getAttribute(Constants.CURRENTUSER) != null) { 
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_64(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("    <td class=\"WhiteBoxFull\" width=\"100%\" colspan=\"2\"><a href='");
      if (_jspx_meth_c_out_197(_jspx_page_context))
        return;
      out.write("'><IMG src=\"images/comment.gif\" border=0 align=middle> <b>Place your comment here</b></a></td>\r\n");
      out.write("</tr>\r\n");
      out.write("    \r\n");
 } else { 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("    <td class=\"WhiteBoxFull\" width=\"100%\" colspan=\"2\"><IMG src=\"images/comment.gif\" border=0 align=middle> <b>Comments (Please login to submit new comments)</b></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("    ");
      if (_jspx_meth_c_forEach_19(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</tr>");
      out.write("\r\n");
      out.write("    </TABLE>\r\n");
      out.write("</TABLE>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_camod_highlight_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_0 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_0.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_0.setParent(null);
    int _jspx_eval_camod_highlight_0 = _jspx_th_camod_highlight_0.doStartTag();
    if (_jspx_eval_camod_highlight_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_highlight_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_out_1(_jspx_th_camod_highlight_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_if_0(_jspx_th_camod_highlight_0, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_0);
    _jspx_th_c_out_1.setValue("${mdl.modelDescriptor}");
    _jspx_th_c_out_1.setEscapeXml("false");
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_0);
    _jspx_th_c_if_0.setTest("${mdl.externalSource == 'Jax MTB'}");
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<IMG src=\"/camod/images/mtb_logo.jpg\">\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("environmentalFactorType");
    _jspx_th_c_set_0.setValue("Chemical / Drug");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("cdList");
    _jspx_th_c_set_1.setValue("${carcinogenicInterventionColl[environmentalFactorType]}");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest("${not empty cdList}");
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"1\" align=\"center\" width=\"100%\">\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td class=\"formTitleBlue\" height=\"20\" colspan=\"7\">Chemical / Drug</td>\t\t\t\t\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<!--   Start of if externalSource is Jax MTB -->\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_if_2(_jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\t\t\r\n");
        out.write("\t\t\t\t<!--   End of if externalSource is Jax MTB -->\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<!--   Start of if externalSource is empty (caMOD data) -->\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_if_3(_jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</TABLE>\r\n");
        out.write("\t\t\t\t<br>\t\t\t\t\r\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_2.setTest("${mdl.externalSource == 'Jax MTB'}");
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Type</td>\r\n");
        out.write("\t\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Name</td>\t\t\t\t\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_forEach_0(_jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\t\t\t\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_forEach_0.setVar("cd");
    _jspx_th_c_forEach_0.setItems("${cdList}");
    _jspx_th_c_forEach_0.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_choose_0(_jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_2(_jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_1(_jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\r\n");
          out.write("\t\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_4(_jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_2(_jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_when_0(_jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_0(_jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_set_2(_jspx_th_c_when_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_set_2.setVar("tdClass");
    _jspx_th_c_set_2.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
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
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_set_3(_jspx_th_c_otherwise_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_set_3.setVar("tdClass");
    _jspx_th_c_set_3.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue("${tdClass}");
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_1 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_1.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_camod_highlight_1 = _jspx_th_camod_highlight_1.doStartTag();
    if (_jspx_eval_camod_highlight_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_0[0]++;
        _jspx_th_camod_highlight_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_1.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_3(_jspx_th_camod_highlight_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_0[0]--;
    }
    if (_jspx_th_camod_highlight_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_1);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_1);
    _jspx_th_c_out_3.setValue("${cd.environmentalFactor.typeAlternEntry}");
    _jspx_th_c_out_3.setEscapeXml("false");
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue("${tdClass}");
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_2 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_2.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_camod_highlight_2 = _jspx_th_camod_highlight_2.doStartTag();
    if (_jspx_eval_camod_highlight_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_0[0]++;
        _jspx_th_camod_highlight_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_2.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_5(_jspx_th_camod_highlight_2, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_0[0]--;
    }
    if (_jspx_th_camod_highlight_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_2);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_2);
    _jspx_th_c_out_5.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_5.setEscapeXml("false");
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_3.setTest("${empty mdl.externalSource}");
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Chemical / Drug</td>\r\n");
        out.write("\t\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Dose</td>\r\n");
        out.write("\t\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Treatment Regimen</td>\r\n");
        out.write("\t\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Administrative Route</td>\r\n");
        out.write("\t\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Age at Treatment</td>\r\n");
        out.write("\t\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Gender</td>\r\n");
        out.write("\t\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Comment</td>\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_forEach_1(_jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t<!--   End of if externalSource is empty (caMOD data) -->\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_forEach_1.setVar("cd");
    _jspx_th_c_forEach_1.setItems("${cdList}");
    _jspx_th_c_forEach_1.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_choose_1(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_6(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_choose_2(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_if_4(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_if_5(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_13(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_5(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_16(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_6(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_18(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_choose_3(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("&nbsp;\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_21(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_9(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_24(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_10(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_26(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("End\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_11(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_when_1(_jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_1(_jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_set_4(_jspx_th_c_when_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_set_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_set_4.setVar("tdClass");
    _jspx_th_c_set_4.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
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
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_set_5(_jspx_th_c_otherwise_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_set_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_5 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_5.setPageContext(_jspx_page_context);
    _jspx_th_c_set_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_c_set_5.setVar("tdClass");
    _jspx_th_c_set_5.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_5 = _jspx_th_c_set_5.doStartTag();
    if (_jspx_th_c_set_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_6.setValue("${tdClass}");
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_choose_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_when_2(_jspx_th_c_choose_2, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_2(_jspx_th_c_choose_2, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_2.setTest("${empty cd.environmentalFactor.name}");
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_3(_jspx_th_c_when_2, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_camod_highlight_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_3 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_3.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    int _jspx_eval_camod_highlight_3 = _jspx_th_camod_highlight_3.doStartTag();
    if (_jspx_eval_camod_highlight_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_1[0]++;
        _jspx_th_camod_highlight_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_3.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_7(_jspx_th_camod_highlight_3, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_1[0]--;
    }
    if (_jspx_th_camod_highlight_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_3);
    return false;
  }

  private boolean _jspx_meth_c_out_7(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_3);
    _jspx_th_c_out_7.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_7.setEscapeXml("false");
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_2.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    int _jspx_eval_c_otherwise_2 = _jspx_th_c_otherwise_2.doStartTag();
    if (_jspx_eval_c_otherwise_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_4(_jspx_th_c_otherwise_2, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_4 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_4.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_2);
    int _jspx_eval_camod_highlight_4 = _jspx_th_camod_highlight_4.doStartTag();
    if (_jspx_eval_camod_highlight_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_1[0]++;
        _jspx_th_camod_highlight_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_4.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_8(_jspx_th_camod_highlight_4, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_1[0]--;
    }
    if (_jspx_th_camod_highlight_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_4);
    return false;
  }

  private boolean _jspx_meth_c_out_8(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_8.setPageContext(_jspx_page_context);
    _jspx_th_c_out_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_4);
    _jspx_th_c_out_8.setValue("${cd.environmentalFactor.name}");
    _jspx_th_c_out_8.setEscapeXml("false");
    int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
    if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_8);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_4.setTest("${not empty cd.environmentalFactor.nscNumber}");
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<br>NSC: \r\n");
        out.write("\t\t\t\t\t\t\t<a target=\"_blank\" href=\"http://dtp.nci.nih.gov/dtpstandard/servlet/ChemData?queryHOLD=&searchtype=NSC&chemnameboolean=and&outputformat=html&Submit=Submit&searchlist=");
        if (_jspx_meth_c_out_9(_jspx_th_c_if_4, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\">\r\n");
        out.write("\t\t\t\t\t\t\t    ");
        if (_jspx_meth_c_out_10(_jspx_th_c_if_4, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t</a>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_out_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_9 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_9.setPageContext(_jspx_page_context);
    _jspx_th_c_out_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_out_9.setValue("${cd.environmentalFactor.nscNumber}");
    int _jspx_eval_c_out_9 = _jspx_th_c_out_9.doStartTag();
    if (_jspx_th_c_out_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
    return false;
  }

  private boolean _jspx_meth_c_out_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_10 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_10.setPageContext(_jspx_page_context);
    _jspx_th_c_out_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_out_10.setValue("${cd.environmentalFactor.nscNumber}");
    int _jspx_eval_c_out_10 = _jspx_th_c_out_10.doStartTag();
    if (_jspx_th_c_out_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_5.setTest("${not empty cd.environmentalFactor.casNumber}");
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<br>CAS: \r\n");
        out.write("\t\t\t\t\t\t\t<a target=\"_blank\" href=\"http://dtp.nci.nih.gov/dtpstandard/servlet/ChemData?queryHOLD=&searchtype=CAS&chemnameboolean=and&outputformat=html&Submit=Submit&searchlist=");
        if (_jspx_meth_c_out_11(_jspx_th_c_if_5, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\">\r\n");
        out.write("\t\t\t\t\t\t\t    ");
        if (_jspx_meth_c_out_12(_jspx_th_c_if_5, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t</a>    \r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_out_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_11 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_11.setPageContext(_jspx_page_context);
    _jspx_th_c_out_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_c_out_11.setValue("${cd.environmentalFactor.casNumber}");
    int _jspx_eval_c_out_11 = _jspx_th_c_out_11.doStartTag();
    if (_jspx_th_c_out_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
    return false;
  }

  private boolean _jspx_meth_c_out_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_12 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_12.setPageContext(_jspx_page_context);
    _jspx_th_c_out_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_c_out_12.setValue("${cd.environmentalFactor.casNumber}");
    int _jspx_eval_c_out_12 = _jspx_th_c_out_12.doStartTag();
    if (_jspx_th_c_out_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
    return false;
  }

  private boolean _jspx_meth_c_out_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_13 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_13.setPageContext(_jspx_page_context);
    _jspx_th_c_out_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_13.setValue("${tdClass}");
    int _jspx_eval_c_out_13 = _jspx_th_c_out_13.doStartTag();
    if (_jspx_th_c_out_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_5 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_5.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_camod_highlight_5 = _jspx_th_camod_highlight_5.doStartTag();
    if (_jspx_eval_camod_highlight_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_1[0]++;
        _jspx_th_camod_highlight_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_5.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_14(_jspx_th_camod_highlight_5, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_15(_jspx_th_camod_highlight_5, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_1[0]--;
    }
    if (_jspx_th_camod_highlight_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_5);
    return false;
  }

  private boolean _jspx_meth_c_out_14(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_14 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_14.setPageContext(_jspx_page_context);
    _jspx_th_c_out_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_5);
    _jspx_th_c_out_14.setValue("${cd.treatment.dosage}");
    _jspx_th_c_out_14.setEscapeXml("false");
    int _jspx_eval_c_out_14 = _jspx_th_c_out_14.doStartTag();
    if (_jspx_th_c_out_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_14);
    return false;
  }

  private boolean _jspx_meth_c_out_15(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_15 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_15.setPageContext(_jspx_page_context);
    _jspx_th_c_out_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_5);
    _jspx_th_c_out_15.setValue("${cd.treatment.dosageUnit}");
    _jspx_th_c_out_15.setEscapeXml("false");
    int _jspx_eval_c_out_15 = _jspx_th_c_out_15.doStartTag();
    if (_jspx_th_c_out_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_15);
    return false;
  }

  private boolean _jspx_meth_c_out_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_16 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_16.setPageContext(_jspx_page_context);
    _jspx_th_c_out_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_16.setValue("${tdClass}");
    int _jspx_eval_c_out_16 = _jspx_th_c_out_16.doStartTag();
    if (_jspx_th_c_out_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_16);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_6 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_6.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_camod_highlight_6 = _jspx_th_camod_highlight_6.doStartTag();
    if (_jspx_eval_camod_highlight_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_1[0]++;
        _jspx_th_camod_highlight_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_6.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_17(_jspx_th_camod_highlight_6, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_1[0]--;
    }
    if (_jspx_th_camod_highlight_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_6);
    return false;
  }

  private boolean _jspx_meth_c_out_17(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_17 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_17.setPageContext(_jspx_page_context);
    _jspx_th_c_out_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_6);
    _jspx_th_c_out_17.setValue("${cd.treatment.regimen}");
    _jspx_th_c_out_17.setEscapeXml("false");
    int _jspx_eval_c_out_17 = _jspx_th_c_out_17.doStartTag();
    if (_jspx_th_c_out_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_17);
    return false;
  }

  private boolean _jspx_meth_c_out_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_18 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_18.setPageContext(_jspx_page_context);
    _jspx_th_c_out_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_18.setValue("${tdClass}");
    int _jspx_eval_c_out_18 = _jspx_th_c_out_18.doStartTag();
    if (_jspx_th_c_out_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_18);
    return false;
  }

  private boolean _jspx_meth_c_choose_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_3.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_c_choose_3 = _jspx_th_c_choose_3.doStartTag();
    if (_jspx_eval_c_choose_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_when_3(_jspx_th_c_choose_3, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_3(_jspx_th_c_choose_3, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    _jspx_th_c_when_3.setTest("${empty cd.treatment.administrativeRoute}");
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_7(_jspx_th_c_when_3, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_camod_highlight_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_7 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_7.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    int _jspx_eval_camod_highlight_7 = _jspx_th_camod_highlight_7.doStartTag();
    if (_jspx_eval_camod_highlight_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_1[0]++;
        _jspx_th_camod_highlight_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_7.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_19(_jspx_th_camod_highlight_7, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_1[0]--;
    }
    if (_jspx_th_camod_highlight_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_7);
    return false;
  }

  private boolean _jspx_meth_c_out_19(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_19 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_19.setPageContext(_jspx_page_context);
    _jspx_th_c_out_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_7);
    _jspx_th_c_out_19.setValue("${cd.treatment.adminRouteAlternEntry}");
    _jspx_th_c_out_19.setEscapeXml("false");
    int _jspx_eval_c_out_19 = _jspx_th_c_out_19.doStartTag();
    if (_jspx_th_c_out_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_19);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_3 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_3.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    int _jspx_eval_c_otherwise_3 = _jspx_th_c_otherwise_3.doStartTag();
    if (_jspx_eval_c_otherwise_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_8(_jspx_th_c_otherwise_3, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_8 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_8.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_3);
    int _jspx_eval_camod_highlight_8 = _jspx_th_camod_highlight_8.doStartTag();
    if (_jspx_eval_camod_highlight_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_1[0]++;
        _jspx_th_camod_highlight_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_8.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_20(_jspx_th_camod_highlight_8, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_1[0]--;
    }
    if (_jspx_th_camod_highlight_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_8);
    return false;
  }

  private boolean _jspx_meth_c_out_20(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_20 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_20.setPageContext(_jspx_page_context);
    _jspx_th_c_out_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_8);
    _jspx_th_c_out_20.setValue("${cd.treatment.administrativeRoute}");
    _jspx_th_c_out_20.setEscapeXml("false");
    int _jspx_eval_c_out_20 = _jspx_th_c_out_20.doStartTag();
    if (_jspx_th_c_out_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_20);
    return false;
  }

  private boolean _jspx_meth_c_out_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_21 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_21.setPageContext(_jspx_page_context);
    _jspx_th_c_out_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_21.setValue("${tdClass}");
    int _jspx_eval_c_out_21 = _jspx_th_c_out_21.doStartTag();
    if (_jspx_th_c_out_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_21);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_9 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_9.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_camod_highlight_9 = _jspx_th_camod_highlight_9.doStartTag();
    if (_jspx_eval_camod_highlight_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_1[0]++;
        _jspx_th_camod_highlight_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_9.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_22(_jspx_th_camod_highlight_9, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_23(_jspx_th_camod_highlight_9, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_1[0]--;
    }
    if (_jspx_th_camod_highlight_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_9);
    return false;
  }

  private boolean _jspx_meth_c_out_22(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_22 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_22.setPageContext(_jspx_page_context);
    _jspx_th_c_out_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_9);
    _jspx_th_c_out_22.setValue("${cd.treatment.ageAtTreatment}");
    _jspx_th_c_out_22.setEscapeXml("false");
    int _jspx_eval_c_out_22 = _jspx_th_c_out_22.doStartTag();
    if (_jspx_th_c_out_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_22);
    return false;
  }

  private boolean _jspx_meth_c_out_23(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_23 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_23.setPageContext(_jspx_page_context);
    _jspx_th_c_out_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_9);
    _jspx_th_c_out_23.setValue("${cd.treatment.ageAtTreatmentUnit}");
    int _jspx_eval_c_out_23 = _jspx_th_c_out_23.doStartTag();
    if (_jspx_th_c_out_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_23);
    return false;
  }

  private boolean _jspx_meth_c_out_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_24 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_24.setPageContext(_jspx_page_context);
    _jspx_th_c_out_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_24.setValue("${tdClass}");
    int _jspx_eval_c_out_24 = _jspx_th_c_out_24.doStartTag();
    if (_jspx_th_c_out_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_24);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_10 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_10.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_camod_highlight_10 = _jspx_th_camod_highlight_10.doStartTag();
    if (_jspx_eval_camod_highlight_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_1[0]++;
        _jspx_th_camod_highlight_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_10.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_25(_jspx_th_camod_highlight_10, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_1[0]--;
    }
    if (_jspx_th_camod_highlight_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_10);
    return false;
  }

  private boolean _jspx_meth_c_out_25(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_25 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_25.setPageContext(_jspx_page_context);
    _jspx_th_c_out_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_10);
    _jspx_th_c_out_25.setValue("${cd.treatment.sexDistribution.type}");
    _jspx_th_c_out_25.setEscapeXml("false");
    int _jspx_eval_c_out_25 = _jspx_th_c_out_25.doStartTag();
    if (_jspx_th_c_out_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_25);
    return false;
  }

  private boolean _jspx_meth_c_out_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_26 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_26.setPageContext(_jspx_page_context);
    _jspx_th_c_out_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_26.setValue("${tdClass}");
    int _jspx_eval_c_out_26 = _jspx_th_c_out_26.doStartTag();
    if (_jspx_th_c_out_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_26);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_11 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_11.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_camod_highlight_11 = _jspx_th_camod_highlight_11.doStartTag();
    if (_jspx_eval_camod_highlight_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_1[0]++;
        _jspx_th_camod_highlight_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_11.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_27(_jspx_th_camod_highlight_11, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_1[0]--;
    }
    if (_jspx_th_camod_highlight_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_11);
    return false;
  }

  private boolean _jspx_meth_c_out_27(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_27 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_27.setPageContext(_jspx_page_context);
    _jspx_th_c_out_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_11);
    _jspx_th_c_out_27.setValue("${cd.environmentalFactor.comments}");
    _jspx_th_c_out_27.setEscapeXml("false");
    int _jspx_eval_c_out_27 = _jspx_th_c_out_27.doStartTag();
    if (_jspx_th_c_out_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_27);
    return false;
  }

  private boolean _jspx_meth_c_set_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_6 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_6.setPageContext(_jspx_page_context);
    _jspx_th_c_set_6.setParent(null);
    _jspx_th_c_set_6.setVar("environmentalFactorType");
    _jspx_th_c_set_6.setValue("Growth Factor");
    int _jspx_eval_c_set_6 = _jspx_th_c_set_6.doStartTag();
    if (_jspx_th_c_set_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
    return false;
  }

  private boolean _jspx_meth_c_set_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_7 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_7.setPageContext(_jspx_page_context);
    _jspx_th_c_set_7.setParent(null);
    _jspx_th_c_set_7.setVar("cdList");
    _jspx_th_c_set_7.setValue("${carcinogenicInterventionColl[environmentalFactorType]}");
    int _jspx_eval_c_set_7 = _jspx_th_c_set_7.doStartTag();
    if (_jspx_th_c_set_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest("${not empty cdList}");
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"1\" align=\"center\" width=\"100%\">\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"formTitleBlue\" height=\"20\" colspan=\"7\">Growth Factor</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<!--   Start of if externalSource is Jax MTB -->\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_if_7(_jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\t\t\r\n");
        out.write("\t\t\t<!--   End of if externalSource is Jax MTB -->\r\n");
        out.write("\r\n");
        out.write("\t\t\t<!--   Start of if externalSource is empty (caMOD data) -->\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_if_8(_jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\t\t\t\r\n");
        out.write("\t\t\t</TABLE>\t\t\r\n");
        out.write("\t\t\t<br>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_c_if_7.setTest("${mdl.externalSource == 'Jax MTB'}");
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Type</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Name</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_2(_jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_c_forEach_2.setVar("cd");
    _jspx_th_c_forEach_2.setItems("${cdList}");
    _jspx_th_c_forEach_2.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_4(_jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_28(_jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_12(_jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_30(_jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_13(_jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_4 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_4.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    int _jspx_eval_c_choose_4 = _jspx_th_c_choose_4.doStartTag();
    if (_jspx_eval_c_choose_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_4(_jspx_th_c_choose_4, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_4(_jspx_th_c_choose_4, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_4);
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_4);
    _jspx_th_c_when_4.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_8(_jspx_th_c_when_4, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_set_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_8 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_8.setPageContext(_jspx_page_context);
    _jspx_th_c_set_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_c_set_8.setVar("tdClass");
    _jspx_th_c_set_8.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_8 = _jspx_th_c_set_8.doStartTag();
    if (_jspx_th_c_set_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_8);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_4 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_4.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_4);
    int _jspx_eval_c_otherwise_4 = _jspx_th_c_otherwise_4.doStartTag();
    if (_jspx_eval_c_otherwise_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_9(_jspx_th_c_otherwise_4, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_4);
    return false;
  }

  private boolean _jspx_meth_c_set_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_9 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_9.setPageContext(_jspx_page_context);
    _jspx_th_c_set_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_4);
    _jspx_th_c_set_9.setVar("tdClass");
    _jspx_th_c_set_9.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_9 = _jspx_th_c_set_9.doStartTag();
    if (_jspx_th_c_set_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_9);
    return false;
  }

  private boolean _jspx_meth_c_out_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_28 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_28.setPageContext(_jspx_page_context);
    _jspx_th_c_out_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_out_28.setValue("${tdClass}");
    int _jspx_eval_c_out_28 = _jspx_th_c_out_28.doStartTag();
    if (_jspx_th_c_out_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_28);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_12 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_12.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    int _jspx_eval_camod_highlight_12 = _jspx_th_camod_highlight_12.doStartTag();
    if (_jspx_eval_camod_highlight_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_2[0]++;
        _jspx_th_camod_highlight_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_12.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_29(_jspx_th_camod_highlight_12, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_2[0]--;
    }
    if (_jspx_th_camod_highlight_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_12);
    return false;
  }

  private boolean _jspx_meth_c_out_29(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_29 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_29.setPageContext(_jspx_page_context);
    _jspx_th_c_out_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_12);
    _jspx_th_c_out_29.setValue("${cd.environmentalFactor.typeAlternEntry}");
    _jspx_th_c_out_29.setEscapeXml("false");
    int _jspx_eval_c_out_29 = _jspx_th_c_out_29.doStartTag();
    if (_jspx_th_c_out_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_29);
    return false;
  }

  private boolean _jspx_meth_c_out_30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_30 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_30.setPageContext(_jspx_page_context);
    _jspx_th_c_out_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_out_30.setValue("${tdClass}");
    int _jspx_eval_c_out_30 = _jspx_th_c_out_30.doStartTag();
    if (_jspx_th_c_out_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_30);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_13 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_13.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    int _jspx_eval_camod_highlight_13 = _jspx_th_camod_highlight_13.doStartTag();
    if (_jspx_eval_camod_highlight_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_2[0]++;
        _jspx_th_camod_highlight_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_13.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_31(_jspx_th_camod_highlight_13, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_2[0]--;
    }
    if (_jspx_th_camod_highlight_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_13);
    return false;
  }

  private boolean _jspx_meth_c_out_31(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_31 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_31.setPageContext(_jspx_page_context);
    _jspx_th_c_out_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_13);
    _jspx_th_c_out_31.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_31.setEscapeXml("false");
    int _jspx_eval_c_out_31 = _jspx_th_c_out_31.doStartTag();
    if (_jspx_th_c_out_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_31);
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_c_if_8.setTest("${empty mdl.externalSource}");
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Growth Factor</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Dose</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Treatment Regimen</td>\t\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Administrative Route</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Age at Treatment</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Gender</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Comment</td>\t\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_3(_jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t<!--   End of if externalSource is empty (caMOD data) -->\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_c_forEach_3.setVar("cd");
    _jspx_th_c_forEach_3.setItems("${cdList}");
    _jspx_th_c_forEach_3.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_5(_jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_32(_jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_choose_6(_jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_35(_jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_16(_jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_38(_jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_17(_jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_40(_jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_choose_7(_jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("&nbsp;\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_43(_jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_20(_jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_46(_jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_21(_jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_48(_jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("End\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_22(_jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\t\t\t\t\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_5 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_5.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    int _jspx_eval_c_choose_5 = _jspx_th_c_choose_5.doStartTag();
    if (_jspx_eval_c_choose_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_5(_jspx_th_c_choose_5, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_5(_jspx_th_c_choose_5, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_5);
    return false;
  }

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_5);
    _jspx_th_c_when_5.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_10(_jspx_th_c_when_5, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
    return false;
  }

  private boolean _jspx_meth_c_set_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_10 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_10.setPageContext(_jspx_page_context);
    _jspx_th_c_set_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_5);
    _jspx_th_c_set_10.setVar("tdClass");
    _jspx_th_c_set_10.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_10 = _jspx_th_c_set_10.doStartTag();
    if (_jspx_th_c_set_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_10);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_5 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_5.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_5);
    int _jspx_eval_c_otherwise_5 = _jspx_th_c_otherwise_5.doStartTag();
    if (_jspx_eval_c_otherwise_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_11(_jspx_th_c_otherwise_5, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_5);
    return false;
  }

  private boolean _jspx_meth_c_set_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_11 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_11.setPageContext(_jspx_page_context);
    _jspx_th_c_set_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_5);
    _jspx_th_c_set_11.setVar("tdClass");
    _jspx_th_c_set_11.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_11 = _jspx_th_c_set_11.doStartTag();
    if (_jspx_th_c_set_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_11);
    return false;
  }

  private boolean _jspx_meth_c_out_32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_32 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_32.setPageContext(_jspx_page_context);
    _jspx_th_c_out_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_32.setValue("${tdClass}");
    int _jspx_eval_c_out_32 = _jspx_th_c_out_32.doStartTag();
    if (_jspx_th_c_out_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_32);
    return false;
  }

  private boolean _jspx_meth_c_choose_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_6 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_6.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    int _jspx_eval_c_choose_6 = _jspx_th_c_choose_6.doStartTag();
    if (_jspx_eval_c_choose_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_when_6(_jspx_th_c_choose_6, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_6(_jspx_th_c_choose_6, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_6);
    return false;
  }

  private boolean _jspx_meth_c_when_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_6.setPageContext(_jspx_page_context);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_6);
    _jspx_th_c_when_6.setTest("${empty cd.environmentalFactor.name}");
    int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
    if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_14(_jspx_th_c_when_6, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_14 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_14.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_6);
    int _jspx_eval_camod_highlight_14 = _jspx_th_camod_highlight_14.doStartTag();
    if (_jspx_eval_camod_highlight_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_3[0]++;
        _jspx_th_camod_highlight_14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_14.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_33(_jspx_th_camod_highlight_14, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_3[0]--;
    }
    if (_jspx_th_camod_highlight_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_14);
    return false;
  }

  private boolean _jspx_meth_c_out_33(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_33 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_33.setPageContext(_jspx_page_context);
    _jspx_th_c_out_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_14);
    _jspx_th_c_out_33.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_33.setEscapeXml("false");
    int _jspx_eval_c_out_33 = _jspx_th_c_out_33.doStartTag();
    if (_jspx_th_c_out_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_33);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_6 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_6.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_6);
    int _jspx_eval_c_otherwise_6 = _jspx_th_c_otherwise_6.doStartTag();
    if (_jspx_eval_c_otherwise_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_15(_jspx_th_c_otherwise_6, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_6);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_15 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_15.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_6);
    int _jspx_eval_camod_highlight_15 = _jspx_th_camod_highlight_15.doStartTag();
    if (_jspx_eval_camod_highlight_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_3[0]++;
        _jspx_th_camod_highlight_15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_15.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_34(_jspx_th_camod_highlight_15, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_3[0]--;
    }
    if (_jspx_th_camod_highlight_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_15);
    return false;
  }

  private boolean _jspx_meth_c_out_34(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_34 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_34.setPageContext(_jspx_page_context);
    _jspx_th_c_out_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_15);
    _jspx_th_c_out_34.setValue("${cd.environmentalFactor.name}");
    _jspx_th_c_out_34.setEscapeXml("false");
    int _jspx_eval_c_out_34 = _jspx_th_c_out_34.doStartTag();
    if (_jspx_th_c_out_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_34);
    return false;
  }

  private boolean _jspx_meth_c_out_35(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_35 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_35.setPageContext(_jspx_page_context);
    _jspx_th_c_out_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_35.setValue("${tdClass}");
    int _jspx_eval_c_out_35 = _jspx_th_c_out_35.doStartTag();
    if (_jspx_th_c_out_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_35);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_16 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_16.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    int _jspx_eval_camod_highlight_16 = _jspx_th_camod_highlight_16.doStartTag();
    if (_jspx_eval_camod_highlight_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_3[0]++;
        _jspx_th_camod_highlight_16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_16.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_36(_jspx_th_camod_highlight_16, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_37(_jspx_th_camod_highlight_16, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_3[0]--;
    }
    if (_jspx_th_camod_highlight_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_16);
    return false;
  }

  private boolean _jspx_meth_c_out_36(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_36 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_36.setPageContext(_jspx_page_context);
    _jspx_th_c_out_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_16);
    _jspx_th_c_out_36.setValue("${cd.treatment.dosage}");
    _jspx_th_c_out_36.setEscapeXml("false");
    int _jspx_eval_c_out_36 = _jspx_th_c_out_36.doStartTag();
    if (_jspx_th_c_out_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_36);
    return false;
  }

  private boolean _jspx_meth_c_out_37(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_37 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_37.setPageContext(_jspx_page_context);
    _jspx_th_c_out_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_16);
    _jspx_th_c_out_37.setValue("${cd.treatment.dosageUnit}");
    _jspx_th_c_out_37.setEscapeXml("false");
    int _jspx_eval_c_out_37 = _jspx_th_c_out_37.doStartTag();
    if (_jspx_th_c_out_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_37);
    return false;
  }

  private boolean _jspx_meth_c_out_38(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_38 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_38.setPageContext(_jspx_page_context);
    _jspx_th_c_out_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_38.setValue("${tdClass}");
    int _jspx_eval_c_out_38 = _jspx_th_c_out_38.doStartTag();
    if (_jspx_th_c_out_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_38);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_17 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_17.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    int _jspx_eval_camod_highlight_17 = _jspx_th_camod_highlight_17.doStartTag();
    if (_jspx_eval_camod_highlight_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_3[0]++;
        _jspx_th_camod_highlight_17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_17.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_39(_jspx_th_camod_highlight_17, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_3[0]--;
    }
    if (_jspx_th_camod_highlight_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_17);
    return false;
  }

  private boolean _jspx_meth_c_out_39(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_39 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_39.setPageContext(_jspx_page_context);
    _jspx_th_c_out_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_17);
    _jspx_th_c_out_39.setValue("${cd.treatment.regimen}");
    _jspx_th_c_out_39.setEscapeXml("false");
    int _jspx_eval_c_out_39 = _jspx_th_c_out_39.doStartTag();
    if (_jspx_th_c_out_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_39);
    return false;
  }

  private boolean _jspx_meth_c_out_40(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_40 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_40.setPageContext(_jspx_page_context);
    _jspx_th_c_out_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_40.setValue("${tdClass}");
    int _jspx_eval_c_out_40 = _jspx_th_c_out_40.doStartTag();
    if (_jspx_th_c_out_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_40);
    return false;
  }

  private boolean _jspx_meth_c_choose_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_7 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_7.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    int _jspx_eval_c_choose_7 = _jspx_th_c_choose_7.doStartTag();
    if (_jspx_eval_c_choose_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_when_7(_jspx_th_c_choose_7, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_7(_jspx_th_c_choose_7, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_7);
    return false;
  }

  private boolean _jspx_meth_c_when_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_7 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_7.setPageContext(_jspx_page_context);
    _jspx_th_c_when_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_7);
    _jspx_th_c_when_7.setTest("${empty cd.treatment.administrativeRoute}");
    int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
    if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_18(_jspx_th_c_when_7, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_18 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_18.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_7);
    int _jspx_eval_camod_highlight_18 = _jspx_th_camod_highlight_18.doStartTag();
    if (_jspx_eval_camod_highlight_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_3[0]++;
        _jspx_th_camod_highlight_18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_18.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_41(_jspx_th_camod_highlight_18, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_3[0]--;
    }
    if (_jspx_th_camod_highlight_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_18);
    return false;
  }

  private boolean _jspx_meth_c_out_41(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_18, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_41 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_41.setPageContext(_jspx_page_context);
    _jspx_th_c_out_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_18);
    _jspx_th_c_out_41.setValue("${cd.treatment.adminRouteAlternEntry}");
    _jspx_th_c_out_41.setEscapeXml("false");
    int _jspx_eval_c_out_41 = _jspx_th_c_out_41.doStartTag();
    if (_jspx_th_c_out_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_41);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_7 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_7.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_7);
    int _jspx_eval_c_otherwise_7 = _jspx_th_c_otherwise_7.doStartTag();
    if (_jspx_eval_c_otherwise_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_19(_jspx_th_c_otherwise_7, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_7);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_19 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_19.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_7);
    int _jspx_eval_camod_highlight_19 = _jspx_th_camod_highlight_19.doStartTag();
    if (_jspx_eval_camod_highlight_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_3[0]++;
        _jspx_th_camod_highlight_19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_19.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_42(_jspx_th_camod_highlight_19, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_3[0]--;
    }
    if (_jspx_th_camod_highlight_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_19);
    return false;
  }

  private boolean _jspx_meth_c_out_42(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_19, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_42 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_42.setPageContext(_jspx_page_context);
    _jspx_th_c_out_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_19);
    _jspx_th_c_out_42.setValue("${cd.treatment.administrativeRoute}");
    _jspx_th_c_out_42.setEscapeXml("false");
    int _jspx_eval_c_out_42 = _jspx_th_c_out_42.doStartTag();
    if (_jspx_th_c_out_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_42);
    return false;
  }

  private boolean _jspx_meth_c_out_43(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_43 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_43.setPageContext(_jspx_page_context);
    _jspx_th_c_out_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_43.setValue("${tdClass}");
    int _jspx_eval_c_out_43 = _jspx_th_c_out_43.doStartTag();
    if (_jspx_th_c_out_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_43);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_20 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_20.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    int _jspx_eval_camod_highlight_20 = _jspx_th_camod_highlight_20.doStartTag();
    if (_jspx_eval_camod_highlight_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_3[0]++;
        _jspx_th_camod_highlight_20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_20.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_44(_jspx_th_camod_highlight_20, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_45(_jspx_th_camod_highlight_20, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_3[0]--;
    }
    if (_jspx_th_camod_highlight_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_20);
    return false;
  }

  private boolean _jspx_meth_c_out_44(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_44 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_44.setPageContext(_jspx_page_context);
    _jspx_th_c_out_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_20);
    _jspx_th_c_out_44.setValue("${cd.treatment.ageAtTreatment}");
    _jspx_th_c_out_44.setEscapeXml("false");
    int _jspx_eval_c_out_44 = _jspx_th_c_out_44.doStartTag();
    if (_jspx_th_c_out_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_44);
    return false;
  }

  private boolean _jspx_meth_c_out_45(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_45 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_45.setPageContext(_jspx_page_context);
    _jspx_th_c_out_45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_20);
    _jspx_th_c_out_45.setValue("${cd.treatment.ageAtTreatmentUnit}");
    _jspx_th_c_out_45.setEscapeXml("false");
    int _jspx_eval_c_out_45 = _jspx_th_c_out_45.doStartTag();
    if (_jspx_th_c_out_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_45);
    return false;
  }

  private boolean _jspx_meth_c_out_46(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_46 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_46.setPageContext(_jspx_page_context);
    _jspx_th_c_out_46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_46.setValue("${tdClass}");
    int _jspx_eval_c_out_46 = _jspx_th_c_out_46.doStartTag();
    if (_jspx_th_c_out_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_46);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_21 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_21.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    int _jspx_eval_camod_highlight_21 = _jspx_th_camod_highlight_21.doStartTag();
    if (_jspx_eval_camod_highlight_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_3[0]++;
        _jspx_th_camod_highlight_21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_21.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_47(_jspx_th_camod_highlight_21, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_3[0]--;
    }
    if (_jspx_th_camod_highlight_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_21);
    return false;
  }

  private boolean _jspx_meth_c_out_47(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_21, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_47 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_47.setPageContext(_jspx_page_context);
    _jspx_th_c_out_47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_21);
    _jspx_th_c_out_47.setValue("${cd.treatment.sexDistribution.type}");
    int _jspx_eval_c_out_47 = _jspx_th_c_out_47.doStartTag();
    if (_jspx_th_c_out_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_47);
    return false;
  }

  private boolean _jspx_meth_c_out_48(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_48 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_48.setPageContext(_jspx_page_context);
    _jspx_th_c_out_48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_48.setValue("${tdClass}");
    int _jspx_eval_c_out_48 = _jspx_th_c_out_48.doStartTag();
    if (_jspx_th_c_out_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_48);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_22 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_22.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    int _jspx_eval_camod_highlight_22 = _jspx_th_camod_highlight_22.doStartTag();
    if (_jspx_eval_camod_highlight_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_3[0]++;
        _jspx_th_camod_highlight_22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_22.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_49(_jspx_th_camod_highlight_22, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_3[0]--;
    }
    if (_jspx_th_camod_highlight_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_22);
    return false;
  }

  private boolean _jspx_meth_c_out_49(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_22, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_49 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_49.setPageContext(_jspx_page_context);
    _jspx_th_c_out_49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_22);
    _jspx_th_c_out_49.setValue("${cd.environmentalFactor.comments}");
    _jspx_th_c_out_49.setEscapeXml("false");
    int _jspx_eval_c_out_49 = _jspx_th_c_out_49.doStartTag();
    if (_jspx_th_c_out_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_49);
    return false;
  }

  private boolean _jspx_meth_c_set_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_12 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_12.setPageContext(_jspx_page_context);
    _jspx_th_c_set_12.setParent(null);
    _jspx_th_c_set_12.setVar("environmentalFactorType");
    _jspx_th_c_set_12.setValue("Hormone");
    int _jspx_eval_c_set_12 = _jspx_th_c_set_12.doStartTag();
    if (_jspx_th_c_set_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_12);
    return false;
  }

  private boolean _jspx_meth_c_set_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_13 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_13.setPageContext(_jspx_page_context);
    _jspx_th_c_set_13.setParent(null);
    _jspx_th_c_set_13.setVar("cdList");
    _jspx_th_c_set_13.setValue("${carcinogenicInterventionColl[environmentalFactorType]}");
    int _jspx_eval_c_set_13 = _jspx_th_c_set_13.doStartTag();
    if (_jspx_th_c_set_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_13);
    return false;
  }

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest("${not empty cdList}");
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"1\" align=\"center\" width=\"100%\">\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"formTitleBlue\" height=\"20\" colspan=\"7\">Hormone</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<!--   Start of if externalSource is Jax MTB -->\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_if_10(_jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\t\t\r\n");
        out.write("\t\t\t<!--   End of if externalSource is Jax MTB -->\r\n");
        out.write("\r\n");
        out.write("\t\t\t<!--   Start of if externalSource is empty (caMOD data) -->\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_if_11(_jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\t\t\t\r\n");
        out.write("\t\t\t</TABLE>\r\n");
        out.write("\t\t\t<br>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_if_10.setTest("${mdl.externalSource == 'Jax MTB'}");
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Type</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Name</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_4(_jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_forEach_4.setVar("cd");
    _jspx_th_c_forEach_4.setItems("${cdList}");
    _jspx_th_c_forEach_4.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_8(_jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_50(_jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_23(_jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_52(_jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_24(_jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_8 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_8.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    int _jspx_eval_c_choose_8 = _jspx_th_c_choose_8.doStartTag();
    if (_jspx_eval_c_choose_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_8(_jspx_th_c_choose_8, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_8(_jspx_th_c_choose_8, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_8);
    return false;
  }

  private boolean _jspx_meth_c_when_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_8 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_8.setPageContext(_jspx_page_context);
    _jspx_th_c_when_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_8);
    _jspx_th_c_when_8.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_8 = _jspx_th_c_when_8.doStartTag();
    if (_jspx_eval_c_when_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_14(_jspx_th_c_when_8, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
    return false;
  }

  private boolean _jspx_meth_c_set_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_14 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_14.setPageContext(_jspx_page_context);
    _jspx_th_c_set_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_8);
    _jspx_th_c_set_14.setVar("tdClass");
    _jspx_th_c_set_14.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_14 = _jspx_th_c_set_14.doStartTag();
    if (_jspx_th_c_set_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_14);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_8 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_8.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_8);
    int _jspx_eval_c_otherwise_8 = _jspx_th_c_otherwise_8.doStartTag();
    if (_jspx_eval_c_otherwise_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_15(_jspx_th_c_otherwise_8, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_8);
    return false;
  }

  private boolean _jspx_meth_c_set_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_15 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_15.setPageContext(_jspx_page_context);
    _jspx_th_c_set_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_8);
    _jspx_th_c_set_15.setVar("tdClass");
    _jspx_th_c_set_15.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_15 = _jspx_th_c_set_15.doStartTag();
    if (_jspx_th_c_set_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_15);
    return false;
  }

  private boolean _jspx_meth_c_out_50(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_50 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_50.setPageContext(_jspx_page_context);
    _jspx_th_c_out_50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_out_50.setValue("${tdClass}");
    int _jspx_eval_c_out_50 = _jspx_th_c_out_50.doStartTag();
    if (_jspx_th_c_out_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_50);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_23 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_23.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    int _jspx_eval_camod_highlight_23 = _jspx_th_camod_highlight_23.doStartTag();
    if (_jspx_eval_camod_highlight_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_4[0]++;
        _jspx_th_camod_highlight_23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_23.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_51(_jspx_th_camod_highlight_23, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_4[0]--;
    }
    if (_jspx_th_camod_highlight_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_23);
    return false;
  }

  private boolean _jspx_meth_c_out_51(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_23, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_51 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_51.setPageContext(_jspx_page_context);
    _jspx_th_c_out_51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_23);
    _jspx_th_c_out_51.setValue("${cd.environmentalFactor.typeAlternEntry}");
    _jspx_th_c_out_51.setEscapeXml("false");
    int _jspx_eval_c_out_51 = _jspx_th_c_out_51.doStartTag();
    if (_jspx_th_c_out_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_51);
    return false;
  }

  private boolean _jspx_meth_c_out_52(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_52 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_52.setPageContext(_jspx_page_context);
    _jspx_th_c_out_52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_out_52.setValue("${tdClass}");
    int _jspx_eval_c_out_52 = _jspx_th_c_out_52.doStartTag();
    if (_jspx_th_c_out_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_52);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_24 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_24.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    int _jspx_eval_camod_highlight_24 = _jspx_th_camod_highlight_24.doStartTag();
    if (_jspx_eval_camod_highlight_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_4[0]++;
        _jspx_th_camod_highlight_24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_24.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_53(_jspx_th_camod_highlight_24, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_4[0]--;
    }
    if (_jspx_th_camod_highlight_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_24);
    return false;
  }

  private boolean _jspx_meth_c_out_53(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_24, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_53 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_53.setPageContext(_jspx_page_context);
    _jspx_th_c_out_53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_24);
    _jspx_th_c_out_53.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_53.setEscapeXml("false");
    int _jspx_eval_c_out_53 = _jspx_th_c_out_53.doStartTag();
    if (_jspx_th_c_out_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_53);
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_if_11.setTest("${empty mdl.externalSource}");
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Hormone</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Dose</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Treatment Regimen</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Administrative Route</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Age at Treatment</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Gender</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Comment</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_5(_jspx_th_c_if_11, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t<!--   End of if externalSource is empty (caMOD data) -->\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_11);
    _jspx_th_c_forEach_5.setVar("cd");
    _jspx_th_c_forEach_5.setItems("${cdList}");
    _jspx_th_c_forEach_5.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_9(_jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_54(_jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_choose_10(_jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_57(_jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_27(_jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_60(_jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_28(_jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_62(_jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_choose_11(_jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("&nbsp;\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_65(_jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_31(_jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_68(_jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_32(_jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_70(_jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("End\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_33(_jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\t\t\t\t\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_9 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_9.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    int _jspx_eval_c_choose_9 = _jspx_th_c_choose_9.doStartTag();
    if (_jspx_eval_c_choose_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_9(_jspx_th_c_choose_9, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_9(_jspx_th_c_choose_9, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_9);
    return false;
  }

  private boolean _jspx_meth_c_when_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_9 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_9.setPageContext(_jspx_page_context);
    _jspx_th_c_when_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_9);
    _jspx_th_c_when_9.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_9 = _jspx_th_c_when_9.doStartTag();
    if (_jspx_eval_c_when_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_16(_jspx_th_c_when_9, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
    return false;
  }

  private boolean _jspx_meth_c_set_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_16 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_16.setPageContext(_jspx_page_context);
    _jspx_th_c_set_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_9);
    _jspx_th_c_set_16.setVar("tdClass");
    _jspx_th_c_set_16.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_16 = _jspx_th_c_set_16.doStartTag();
    if (_jspx_th_c_set_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_16);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_9 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_9.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_9);
    int _jspx_eval_c_otherwise_9 = _jspx_th_c_otherwise_9.doStartTag();
    if (_jspx_eval_c_otherwise_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_17(_jspx_th_c_otherwise_9, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_9);
    return false;
  }

  private boolean _jspx_meth_c_set_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_17 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_17.setPageContext(_jspx_page_context);
    _jspx_th_c_set_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_9);
    _jspx_th_c_set_17.setVar("tdClass");
    _jspx_th_c_set_17.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_17 = _jspx_th_c_set_17.doStartTag();
    if (_jspx_th_c_set_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_17);
    return false;
  }

  private boolean _jspx_meth_c_out_54(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_54 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_54.setPageContext(_jspx_page_context);
    _jspx_th_c_out_54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_out_54.setValue("${tdClass}");
    int _jspx_eval_c_out_54 = _jspx_th_c_out_54.doStartTag();
    if (_jspx_th_c_out_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_54);
    return false;
  }

  private boolean _jspx_meth_c_choose_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_10 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_10.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    int _jspx_eval_c_choose_10 = _jspx_th_c_choose_10.doStartTag();
    if (_jspx_eval_c_choose_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_when_10(_jspx_th_c_choose_10, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_10(_jspx_th_c_choose_10, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_10);
    return false;
  }

  private boolean _jspx_meth_c_when_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_10 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_10.setPageContext(_jspx_page_context);
    _jspx_th_c_when_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_10);
    _jspx_th_c_when_10.setTest("${empty cd.environmentalFactor.name}");
    int _jspx_eval_c_when_10 = _jspx_th_c_when_10.doStartTag();
    if (_jspx_eval_c_when_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_25(_jspx_th_c_when_10, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_25 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_25.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_10);
    int _jspx_eval_camod_highlight_25 = _jspx_th_camod_highlight_25.doStartTag();
    if (_jspx_eval_camod_highlight_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_5[0]++;
        _jspx_th_camod_highlight_25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_25.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_55(_jspx_th_camod_highlight_25, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_5[0]--;
    }
    if (_jspx_th_camod_highlight_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_25);
    return false;
  }

  private boolean _jspx_meth_c_out_55(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_25, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_55 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_55.setPageContext(_jspx_page_context);
    _jspx_th_c_out_55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_25);
    _jspx_th_c_out_55.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_55.setEscapeXml("false");
    int _jspx_eval_c_out_55 = _jspx_th_c_out_55.doStartTag();
    if (_jspx_th_c_out_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_55);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_10 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_10.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_10);
    int _jspx_eval_c_otherwise_10 = _jspx_th_c_otherwise_10.doStartTag();
    if (_jspx_eval_c_otherwise_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_26(_jspx_th_c_otherwise_10, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_10);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_26 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_26.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_10);
    int _jspx_eval_camod_highlight_26 = _jspx_th_camod_highlight_26.doStartTag();
    if (_jspx_eval_camod_highlight_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_5[0]++;
        _jspx_th_camod_highlight_26.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_26.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_56(_jspx_th_camod_highlight_26, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_5[0]--;
    }
    if (_jspx_th_camod_highlight_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_26);
    return false;
  }

  private boolean _jspx_meth_c_out_56(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_26, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_56 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_56.setPageContext(_jspx_page_context);
    _jspx_th_c_out_56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_26);
    _jspx_th_c_out_56.setValue("${cd.environmentalFactor.name}");
    _jspx_th_c_out_56.setEscapeXml("false");
    int _jspx_eval_c_out_56 = _jspx_th_c_out_56.doStartTag();
    if (_jspx_th_c_out_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_56);
    return false;
  }

  private boolean _jspx_meth_c_out_57(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_57 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_57.setPageContext(_jspx_page_context);
    _jspx_th_c_out_57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_out_57.setValue("${tdClass}");
    int _jspx_eval_c_out_57 = _jspx_th_c_out_57.doStartTag();
    if (_jspx_th_c_out_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_57);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_27 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_27.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    int _jspx_eval_camod_highlight_27 = _jspx_th_camod_highlight_27.doStartTag();
    if (_jspx_eval_camod_highlight_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_5[0]++;
        _jspx_th_camod_highlight_27.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_27.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_58(_jspx_th_camod_highlight_27, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_59(_jspx_th_camod_highlight_27, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_5[0]--;
    }
    if (_jspx_th_camod_highlight_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_27);
    return false;
  }

  private boolean _jspx_meth_c_out_58(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_27, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_58 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_58.setPageContext(_jspx_page_context);
    _jspx_th_c_out_58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_27);
    _jspx_th_c_out_58.setValue("${cd.treatment.dosage}");
    _jspx_th_c_out_58.setEscapeXml("false");
    int _jspx_eval_c_out_58 = _jspx_th_c_out_58.doStartTag();
    if (_jspx_th_c_out_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_58);
    return false;
  }

  private boolean _jspx_meth_c_out_59(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_27, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_59 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_59.setPageContext(_jspx_page_context);
    _jspx_th_c_out_59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_27);
    _jspx_th_c_out_59.setValue("${cd.treatment.dosageUnit}");
    _jspx_th_c_out_59.setEscapeXml("false");
    int _jspx_eval_c_out_59 = _jspx_th_c_out_59.doStartTag();
    if (_jspx_th_c_out_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_59);
    return false;
  }

  private boolean _jspx_meth_c_out_60(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_60 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_60.setPageContext(_jspx_page_context);
    _jspx_th_c_out_60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_out_60.setValue("${tdClass}");
    int _jspx_eval_c_out_60 = _jspx_th_c_out_60.doStartTag();
    if (_jspx_th_c_out_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_60);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_28 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_28.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    int _jspx_eval_camod_highlight_28 = _jspx_th_camod_highlight_28.doStartTag();
    if (_jspx_eval_camod_highlight_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_5[0]++;
        _jspx_th_camod_highlight_28.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_28.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_61(_jspx_th_camod_highlight_28, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_5[0]--;
    }
    if (_jspx_th_camod_highlight_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_28);
    return false;
  }

  private boolean _jspx_meth_c_out_61(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_28, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_61 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_61.setPageContext(_jspx_page_context);
    _jspx_th_c_out_61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_28);
    _jspx_th_c_out_61.setValue("${cd.treatment.regimen}");
    _jspx_th_c_out_61.setEscapeXml("false");
    int _jspx_eval_c_out_61 = _jspx_th_c_out_61.doStartTag();
    if (_jspx_th_c_out_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_61);
    return false;
  }

  private boolean _jspx_meth_c_out_62(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_62 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_62.setPageContext(_jspx_page_context);
    _jspx_th_c_out_62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_out_62.setValue("${tdClass}");
    int _jspx_eval_c_out_62 = _jspx_th_c_out_62.doStartTag();
    if (_jspx_th_c_out_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_62);
    return false;
  }

  private boolean _jspx_meth_c_choose_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_11 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_11.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    int _jspx_eval_c_choose_11 = _jspx_th_c_choose_11.doStartTag();
    if (_jspx_eval_c_choose_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_when_11(_jspx_th_c_choose_11, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_11(_jspx_th_c_choose_11, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_11);
    return false;
  }

  private boolean _jspx_meth_c_when_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_11 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_11.setPageContext(_jspx_page_context);
    _jspx_th_c_when_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_11);
    _jspx_th_c_when_11.setTest("${empty cd.treatment.administrativeRoute}");
    int _jspx_eval_c_when_11 = _jspx_th_c_when_11.doStartTag();
    if (_jspx_eval_c_when_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_29(_jspx_th_c_when_11, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_29 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_29.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_11);
    int _jspx_eval_camod_highlight_29 = _jspx_th_camod_highlight_29.doStartTag();
    if (_jspx_eval_camod_highlight_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_5[0]++;
        _jspx_th_camod_highlight_29.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_29.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_63(_jspx_th_camod_highlight_29, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_5[0]--;
    }
    if (_jspx_th_camod_highlight_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_29);
    return false;
  }

  private boolean _jspx_meth_c_out_63(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_29, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_63 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_63.setPageContext(_jspx_page_context);
    _jspx_th_c_out_63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_29);
    _jspx_th_c_out_63.setValue("${cd.treatment.adminRouteAlternEntry}");
    _jspx_th_c_out_63.setEscapeXml("false");
    int _jspx_eval_c_out_63 = _jspx_th_c_out_63.doStartTag();
    if (_jspx_th_c_out_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_63);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_11 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_11.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_11);
    int _jspx_eval_c_otherwise_11 = _jspx_th_c_otherwise_11.doStartTag();
    if (_jspx_eval_c_otherwise_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_30(_jspx_th_c_otherwise_11, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_11);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_30 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_30.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_11);
    int _jspx_eval_camod_highlight_30 = _jspx_th_camod_highlight_30.doStartTag();
    if (_jspx_eval_camod_highlight_30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_5[0]++;
        _jspx_th_camod_highlight_30.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_30.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_64(_jspx_th_camod_highlight_30, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_30.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_5[0]--;
    }
    if (_jspx_th_camod_highlight_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_30);
    return false;
  }

  private boolean _jspx_meth_c_out_64(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_30, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_64 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_64.setPageContext(_jspx_page_context);
    _jspx_th_c_out_64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_30);
    _jspx_th_c_out_64.setValue("${cd.treatment.administrativeRoute}");
    _jspx_th_c_out_64.setEscapeXml("false");
    int _jspx_eval_c_out_64 = _jspx_th_c_out_64.doStartTag();
    if (_jspx_th_c_out_64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_64);
    return false;
  }

  private boolean _jspx_meth_c_out_65(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_65 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_65.setPageContext(_jspx_page_context);
    _jspx_th_c_out_65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_out_65.setValue("${tdClass}");
    int _jspx_eval_c_out_65 = _jspx_th_c_out_65.doStartTag();
    if (_jspx_th_c_out_65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_65);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_31 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_31.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    int _jspx_eval_camod_highlight_31 = _jspx_th_camod_highlight_31.doStartTag();
    if (_jspx_eval_camod_highlight_31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_5[0]++;
        _jspx_th_camod_highlight_31.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_31.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_66(_jspx_th_camod_highlight_31, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_67(_jspx_th_camod_highlight_31, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_31.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_5[0]--;
    }
    if (_jspx_th_camod_highlight_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_31);
    return false;
  }

  private boolean _jspx_meth_c_out_66(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_31, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_66 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_66.setPageContext(_jspx_page_context);
    _jspx_th_c_out_66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_31);
    _jspx_th_c_out_66.setValue("${cd.treatment.ageAtTreatment}");
    _jspx_th_c_out_66.setEscapeXml("false");
    int _jspx_eval_c_out_66 = _jspx_th_c_out_66.doStartTag();
    if (_jspx_th_c_out_66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_66);
    return false;
  }

  private boolean _jspx_meth_c_out_67(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_31, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_67 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_67.setPageContext(_jspx_page_context);
    _jspx_th_c_out_67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_31);
    _jspx_th_c_out_67.setValue("${cd.treatment.ageAtTreatmentUnit}");
    _jspx_th_c_out_67.setEscapeXml("false");
    int _jspx_eval_c_out_67 = _jspx_th_c_out_67.doStartTag();
    if (_jspx_th_c_out_67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_67);
    return false;
  }

  private boolean _jspx_meth_c_out_68(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_68 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_68.setPageContext(_jspx_page_context);
    _jspx_th_c_out_68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_out_68.setValue("${tdClass}");
    int _jspx_eval_c_out_68 = _jspx_th_c_out_68.doStartTag();
    if (_jspx_th_c_out_68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_68);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_32 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_32.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    int _jspx_eval_camod_highlight_32 = _jspx_th_camod_highlight_32.doStartTag();
    if (_jspx_eval_camod_highlight_32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_5[0]++;
        _jspx_th_camod_highlight_32.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_32.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_69(_jspx_th_camod_highlight_32, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_32.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_5[0]--;
    }
    if (_jspx_th_camod_highlight_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_32);
    return false;
  }

  private boolean _jspx_meth_c_out_69(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_32, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_69 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_69.setPageContext(_jspx_page_context);
    _jspx_th_c_out_69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_32);
    _jspx_th_c_out_69.setValue("${cd.treatment.sexDistribution.type}");
    _jspx_th_c_out_69.setEscapeXml("false");
    int _jspx_eval_c_out_69 = _jspx_th_c_out_69.doStartTag();
    if (_jspx_th_c_out_69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_69);
    return false;
  }

  private boolean _jspx_meth_c_out_70(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_70 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_70.setPageContext(_jspx_page_context);
    _jspx_th_c_out_70.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_out_70.setValue("${tdClass}");
    int _jspx_eval_c_out_70 = _jspx_th_c_out_70.doStartTag();
    if (_jspx_th_c_out_70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_70);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_33 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_33.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    int _jspx_eval_camod_highlight_33 = _jspx_th_camod_highlight_33.doStartTag();
    if (_jspx_eval_camod_highlight_33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_5[0]++;
        _jspx_th_camod_highlight_33.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_33.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_71(_jspx_th_camod_highlight_33, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_33.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_5[0]--;
    }
    if (_jspx_th_camod_highlight_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_33);
    return false;
  }

  private boolean _jspx_meth_c_out_71(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_33, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_71 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_71.setPageContext(_jspx_page_context);
    _jspx_th_c_out_71.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_33);
    _jspx_th_c_out_71.setValue("${cd.environmentalFactor.comments}");
    _jspx_th_c_out_71.setEscapeXml("false");
    int _jspx_eval_c_out_71 = _jspx_th_c_out_71.doStartTag();
    if (_jspx_th_c_out_71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_71);
    return false;
  }

  private boolean _jspx_meth_c_set_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_18 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_18.setPageContext(_jspx_page_context);
    _jspx_th_c_set_18.setParent(null);
    _jspx_th_c_set_18.setVar("environmentalFactorType");
    _jspx_th_c_set_18.setValue("Radiation");
    int _jspx_eval_c_set_18 = _jspx_th_c_set_18.doStartTag();
    if (_jspx_th_c_set_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_18);
    return false;
  }

  private boolean _jspx_meth_c_set_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_19 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_19.setPageContext(_jspx_page_context);
    _jspx_th_c_set_19.setParent(null);
    _jspx_th_c_set_19.setVar("cdList");
    _jspx_th_c_set_19.setValue("${carcinogenicInterventionColl[environmentalFactorType]}");
    int _jspx_eval_c_set_19 = _jspx_th_c_set_19.doStartTag();
    if (_jspx_th_c_set_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_19);
    return false;
  }

  private boolean _jspx_meth_c_if_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent(null);
    _jspx_th_c_if_12.setTest("${not empty cdList}");
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"1\" align=\"center\" width=\"100%\">\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"formTitleBlue\" height=\"20\" colspan=\"7\">Radiation</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<!--   Start of if externalSource is Jax MTB -->\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_if_13(_jspx_th_c_if_12, _jspx_page_context))
          return true;
        out.write("\t\t\r\n");
        out.write("\t\t\t<!--   End of if externalSource is Jax MTB -->\r\n");
        out.write("\r\n");
        out.write("\t\t\t<!--   Start of if externalSource is empty (caMOD data) -->\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_if_14(_jspx_th_c_if_12, _jspx_page_context))
          return true;
        out.write("\t\t\t\r\n");
        out.write("\t\t\t</TABLE>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }

  private boolean _jspx_meth_c_if_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_12);
    _jspx_th_c_if_13.setTest("${mdl.externalSource == 'Jax MTB'}");
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Type</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Name</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_6(_jspx_th_c_if_13, _jspx_page_context))
          return true;
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_13);
    _jspx_th_c_forEach_6.setVar("cd");
    _jspx_th_c_forEach_6.setItems("${cdList}");
    _jspx_th_c_forEach_6.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_12(_jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_72(_jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_34(_jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_74(_jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_35(_jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_12 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_12.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
    int _jspx_eval_c_choose_12 = _jspx_th_c_choose_12.doStartTag();
    if (_jspx_eval_c_choose_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_12(_jspx_th_c_choose_12, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_12(_jspx_th_c_choose_12, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_12);
    return false;
  }

  private boolean _jspx_meth_c_when_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_12 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_12.setPageContext(_jspx_page_context);
    _jspx_th_c_when_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_12);
    _jspx_th_c_when_12.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_12 = _jspx_th_c_when_12.doStartTag();
    if (_jspx_eval_c_when_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_20(_jspx_th_c_when_12, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_12);
    return false;
  }

  private boolean _jspx_meth_c_set_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_20 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_20.setPageContext(_jspx_page_context);
    _jspx_th_c_set_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_12);
    _jspx_th_c_set_20.setVar("tdClass");
    _jspx_th_c_set_20.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_20 = _jspx_th_c_set_20.doStartTag();
    if (_jspx_th_c_set_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_20);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_12 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_12.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_12);
    int _jspx_eval_c_otherwise_12 = _jspx_th_c_otherwise_12.doStartTag();
    if (_jspx_eval_c_otherwise_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_21(_jspx_th_c_otherwise_12, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_12);
    return false;
  }

  private boolean _jspx_meth_c_set_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_21 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_21.setPageContext(_jspx_page_context);
    _jspx_th_c_set_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_12);
    _jspx_th_c_set_21.setVar("tdClass");
    _jspx_th_c_set_21.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_21 = _jspx_th_c_set_21.doStartTag();
    if (_jspx_th_c_set_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_21);
    return false;
  }

  private boolean _jspx_meth_c_out_72(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_72 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_72.setPageContext(_jspx_page_context);
    _jspx_th_c_out_72.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
    _jspx_th_c_out_72.setValue("${tdClass}");
    int _jspx_eval_c_out_72 = _jspx_th_c_out_72.doStartTag();
    if (_jspx_th_c_out_72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_72);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_34(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_34 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_34.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
    int _jspx_eval_camod_highlight_34 = _jspx_th_camod_highlight_34.doStartTag();
    if (_jspx_eval_camod_highlight_34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_34 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_6[0]++;
        _jspx_th_camod_highlight_34.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_34.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_73(_jspx_th_camod_highlight_34, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_34.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_34 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_6[0]--;
    }
    if (_jspx_th_camod_highlight_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_34);
    return false;
  }

  private boolean _jspx_meth_c_out_73(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_34, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_73 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_73.setPageContext(_jspx_page_context);
    _jspx_th_c_out_73.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_34);
    _jspx_th_c_out_73.setValue("${cd.environmentalFactor.typeAlternEntry}");
    _jspx_th_c_out_73.setEscapeXml("false");
    int _jspx_eval_c_out_73 = _jspx_th_c_out_73.doStartTag();
    if (_jspx_th_c_out_73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_73);
    return false;
  }

  private boolean _jspx_meth_c_out_74(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_74 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_74.setPageContext(_jspx_page_context);
    _jspx_th_c_out_74.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
    _jspx_th_c_out_74.setValue("${tdClass}");
    int _jspx_eval_c_out_74 = _jspx_th_c_out_74.doStartTag();
    if (_jspx_th_c_out_74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_74);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_35(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_35 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_35.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
    int _jspx_eval_camod_highlight_35 = _jspx_th_camod_highlight_35.doStartTag();
    if (_jspx_eval_camod_highlight_35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_35 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_6[0]++;
        _jspx_th_camod_highlight_35.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_35.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_75(_jspx_th_camod_highlight_35, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_35.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_35 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_6[0]--;
    }
    if (_jspx_th_camod_highlight_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_35);
    return false;
  }

  private boolean _jspx_meth_c_out_75(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_35, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_75 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_75.setPageContext(_jspx_page_context);
    _jspx_th_c_out_75.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_35);
    _jspx_th_c_out_75.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_75.setEscapeXml("false");
    int _jspx_eval_c_out_75 = _jspx_th_c_out_75.doStartTag();
    if (_jspx_th_c_out_75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_75);
    return false;
  }

  private boolean _jspx_meth_c_if_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
    _jspx_th_c_if_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_12);
    _jspx_th_c_if_14.setTest("${empty mdl.externalSource}");
    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Radiation</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Dose</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Treatment Regimen</td>\t\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Administrative Route</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Age at Treatment</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Gender</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Comment</td>\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_7(_jspx_th_c_if_14, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t<!--   End of if externalSource is empty (caMOD data) -->\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
    return false;
  }

  private boolean _jspx_meth_c_forEach_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_7 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_7.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_14);
    _jspx_th_c_forEach_7.setVar("cd");
    _jspx_th_c_forEach_7.setItems("${cdList}");
    _jspx_th_c_forEach_7.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_7 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
      if (_jspx_eval_c_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_13(_jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_76(_jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_choose_14(_jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_79(_jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_38(_jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_82(_jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_39(_jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_84(_jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_choose_15(_jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("&nbsp;\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_87(_jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_42(_jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_90(_jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_43(_jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_92(_jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("End\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_44(_jspx_th_c_forEach_7, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\t\t\t\t\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_7.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_7);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_13 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_13.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    int _jspx_eval_c_choose_13 = _jspx_th_c_choose_13.doStartTag();
    if (_jspx_eval_c_choose_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_13(_jspx_th_c_choose_13, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_13(_jspx_th_c_choose_13, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_13);
    return false;
  }

  private boolean _jspx_meth_c_when_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_13 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_13.setPageContext(_jspx_page_context);
    _jspx_th_c_when_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_13);
    _jspx_th_c_when_13.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_13 = _jspx_th_c_when_13.doStartTag();
    if (_jspx_eval_c_when_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_22(_jspx_th_c_when_13, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_13);
    return false;
  }

  private boolean _jspx_meth_c_set_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_22 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_22.setPageContext(_jspx_page_context);
    _jspx_th_c_set_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_13);
    _jspx_th_c_set_22.setVar("tdClass");
    _jspx_th_c_set_22.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_22 = _jspx_th_c_set_22.doStartTag();
    if (_jspx_th_c_set_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_22);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_13 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_13.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_13);
    int _jspx_eval_c_otherwise_13 = _jspx_th_c_otherwise_13.doStartTag();
    if (_jspx_eval_c_otherwise_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_23(_jspx_th_c_otherwise_13, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_13);
    return false;
  }

  private boolean _jspx_meth_c_set_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_23 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_23.setPageContext(_jspx_page_context);
    _jspx_th_c_set_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_13);
    _jspx_th_c_set_23.setVar("tdClass");
    _jspx_th_c_set_23.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_23 = _jspx_th_c_set_23.doStartTag();
    if (_jspx_th_c_set_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_23);
    return false;
  }

  private boolean _jspx_meth_c_out_76(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_76 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_76.setPageContext(_jspx_page_context);
    _jspx_th_c_out_76.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    _jspx_th_c_out_76.setValue("${tdClass}");
    int _jspx_eval_c_out_76 = _jspx_th_c_out_76.doStartTag();
    if (_jspx_th_c_out_76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_76);
    return false;
  }

  private boolean _jspx_meth_c_choose_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_14 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_14.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    int _jspx_eval_c_choose_14 = _jspx_th_c_choose_14.doStartTag();
    if (_jspx_eval_c_choose_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_when_14(_jspx_th_c_choose_14, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_14(_jspx_th_c_choose_14, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_14);
    return false;
  }

  private boolean _jspx_meth_c_when_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_14 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_14.setPageContext(_jspx_page_context);
    _jspx_th_c_when_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_14);
    _jspx_th_c_when_14.setTest("${empty cd.environmentalFactor.name}");
    int _jspx_eval_c_when_14 = _jspx_th_c_when_14.doStartTag();
    if (_jspx_eval_c_when_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_36(_jspx_th_c_when_14, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_14);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_36(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_36 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_36.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_14);
    int _jspx_eval_camod_highlight_36 = _jspx_th_camod_highlight_36.doStartTag();
    if (_jspx_eval_camod_highlight_36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_36 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_7[0]++;
        _jspx_th_camod_highlight_36.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_36.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_77(_jspx_th_camod_highlight_36, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_36.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_36 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_7[0]--;
    }
    if (_jspx_th_camod_highlight_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_36);
    return false;
  }

  private boolean _jspx_meth_c_out_77(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_36, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_77 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_77.setPageContext(_jspx_page_context);
    _jspx_th_c_out_77.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_36);
    _jspx_th_c_out_77.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_77.setEscapeXml("false");
    int _jspx_eval_c_out_77 = _jspx_th_c_out_77.doStartTag();
    if (_jspx_th_c_out_77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_77);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_14 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_14.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_14);
    int _jspx_eval_c_otherwise_14 = _jspx_th_c_otherwise_14.doStartTag();
    if (_jspx_eval_c_otherwise_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_37(_jspx_th_c_otherwise_14, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_14);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_37(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_37 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_37.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_14);
    int _jspx_eval_camod_highlight_37 = _jspx_th_camod_highlight_37.doStartTag();
    if (_jspx_eval_camod_highlight_37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_37 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_7[0]++;
        _jspx_th_camod_highlight_37.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_37.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_78(_jspx_th_camod_highlight_37, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_37.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_37 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_7[0]--;
    }
    if (_jspx_th_camod_highlight_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_37);
    return false;
  }

  private boolean _jspx_meth_c_out_78(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_37, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_78 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_78.setPageContext(_jspx_page_context);
    _jspx_th_c_out_78.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_37);
    _jspx_th_c_out_78.setValue("${cd.environmentalFactor.name}");
    _jspx_th_c_out_78.setEscapeXml("false");
    int _jspx_eval_c_out_78 = _jspx_th_c_out_78.doStartTag();
    if (_jspx_th_c_out_78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_78);
    return false;
  }

  private boolean _jspx_meth_c_out_79(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_79 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_79.setPageContext(_jspx_page_context);
    _jspx_th_c_out_79.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    _jspx_th_c_out_79.setValue("${tdClass}");
    int _jspx_eval_c_out_79 = _jspx_th_c_out_79.doStartTag();
    if (_jspx_th_c_out_79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_79);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_38(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_38 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_38.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    int _jspx_eval_camod_highlight_38 = _jspx_th_camod_highlight_38.doStartTag();
    if (_jspx_eval_camod_highlight_38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_38 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_7[0]++;
        _jspx_th_camod_highlight_38.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_38.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_80(_jspx_th_camod_highlight_38, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_81(_jspx_th_camod_highlight_38, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_38.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_38 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_7[0]--;
    }
    if (_jspx_th_camod_highlight_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_38);
    return false;
  }

  private boolean _jspx_meth_c_out_80(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_38, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_80 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_80.setPageContext(_jspx_page_context);
    _jspx_th_c_out_80.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_38);
    _jspx_th_c_out_80.setValue("${cd.treatment.dosage}");
    _jspx_th_c_out_80.setEscapeXml("false");
    int _jspx_eval_c_out_80 = _jspx_th_c_out_80.doStartTag();
    if (_jspx_th_c_out_80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_80);
    return false;
  }

  private boolean _jspx_meth_c_out_81(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_38, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_81 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_81.setPageContext(_jspx_page_context);
    _jspx_th_c_out_81.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_38);
    _jspx_th_c_out_81.setValue("${cd.treatment.dosageUnit}");
    _jspx_th_c_out_81.setEscapeXml("false");
    int _jspx_eval_c_out_81 = _jspx_th_c_out_81.doStartTag();
    if (_jspx_th_c_out_81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_81);
    return false;
  }

  private boolean _jspx_meth_c_out_82(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_82 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_82.setPageContext(_jspx_page_context);
    _jspx_th_c_out_82.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    _jspx_th_c_out_82.setValue("${tdClass}");
    int _jspx_eval_c_out_82 = _jspx_th_c_out_82.doStartTag();
    if (_jspx_th_c_out_82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_82);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_39(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_39 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_39.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    int _jspx_eval_camod_highlight_39 = _jspx_th_camod_highlight_39.doStartTag();
    if (_jspx_eval_camod_highlight_39 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_39 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_7[0]++;
        _jspx_th_camod_highlight_39.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_39.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_83(_jspx_th_camod_highlight_39, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_39.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_39 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_7[0]--;
    }
    if (_jspx_th_camod_highlight_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_39);
    return false;
  }

  private boolean _jspx_meth_c_out_83(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_39, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_83 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_83.setPageContext(_jspx_page_context);
    _jspx_th_c_out_83.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_39);
    _jspx_th_c_out_83.setValue("${cd.treatment.regimen}");
    _jspx_th_c_out_83.setEscapeXml("false");
    int _jspx_eval_c_out_83 = _jspx_th_c_out_83.doStartTag();
    if (_jspx_th_c_out_83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_83);
    return false;
  }

  private boolean _jspx_meth_c_out_84(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_84 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_84.setPageContext(_jspx_page_context);
    _jspx_th_c_out_84.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    _jspx_th_c_out_84.setValue("${tdClass}");
    int _jspx_eval_c_out_84 = _jspx_th_c_out_84.doStartTag();
    if (_jspx_th_c_out_84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_84);
    return false;
  }

  private boolean _jspx_meth_c_choose_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_15 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_15.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    int _jspx_eval_c_choose_15 = _jspx_th_c_choose_15.doStartTag();
    if (_jspx_eval_c_choose_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_when_15(_jspx_th_c_choose_15, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_15(_jspx_th_c_choose_15, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_15);
    return false;
  }

  private boolean _jspx_meth_c_when_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_15 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_15.setPageContext(_jspx_page_context);
    _jspx_th_c_when_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_15);
    _jspx_th_c_when_15.setTest("${empty cd.treatment.administrativeRoute}");
    int _jspx_eval_c_when_15 = _jspx_th_c_when_15.doStartTag();
    if (_jspx_eval_c_when_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_40(_jspx_th_c_when_15, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_15);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_40(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_40 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_40.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_15);
    int _jspx_eval_camod_highlight_40 = _jspx_th_camod_highlight_40.doStartTag();
    if (_jspx_eval_camod_highlight_40 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_40 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_7[0]++;
        _jspx_th_camod_highlight_40.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_40.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_85(_jspx_th_camod_highlight_40, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_40.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_40 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_7[0]--;
    }
    if (_jspx_th_camod_highlight_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_40);
    return false;
  }

  private boolean _jspx_meth_c_out_85(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_40, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_85 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_85.setPageContext(_jspx_page_context);
    _jspx_th_c_out_85.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_40);
    _jspx_th_c_out_85.setValue("${cd.treatment.adminRouteAlternEntry}");
    _jspx_th_c_out_85.setEscapeXml("false");
    int _jspx_eval_c_out_85 = _jspx_th_c_out_85.doStartTag();
    if (_jspx_th_c_out_85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_85);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_15 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_15.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_15);
    int _jspx_eval_c_otherwise_15 = _jspx_th_c_otherwise_15.doStartTag();
    if (_jspx_eval_c_otherwise_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_41(_jspx_th_c_otherwise_15, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_15);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_41(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_41 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_41.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_15);
    int _jspx_eval_camod_highlight_41 = _jspx_th_camod_highlight_41.doStartTag();
    if (_jspx_eval_camod_highlight_41 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_41 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_7[0]++;
        _jspx_th_camod_highlight_41.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_41.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_86(_jspx_th_camod_highlight_41, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_41.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_41 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_7[0]--;
    }
    if (_jspx_th_camod_highlight_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_41);
    return false;
  }

  private boolean _jspx_meth_c_out_86(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_41, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_86 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_86.setPageContext(_jspx_page_context);
    _jspx_th_c_out_86.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_41);
    _jspx_th_c_out_86.setValue("${cd.treatment.administrativeRoute}");
    _jspx_th_c_out_86.setEscapeXml("false");
    int _jspx_eval_c_out_86 = _jspx_th_c_out_86.doStartTag();
    if (_jspx_th_c_out_86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_86);
    return false;
  }

  private boolean _jspx_meth_c_out_87(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_87 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_87.setPageContext(_jspx_page_context);
    _jspx_th_c_out_87.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    _jspx_th_c_out_87.setValue("${tdClass}");
    int _jspx_eval_c_out_87 = _jspx_th_c_out_87.doStartTag();
    if (_jspx_th_c_out_87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_87);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_42(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_42 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_42.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    int _jspx_eval_camod_highlight_42 = _jspx_th_camod_highlight_42.doStartTag();
    if (_jspx_eval_camod_highlight_42 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_42 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_7[0]++;
        _jspx_th_camod_highlight_42.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_42.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_88(_jspx_th_camod_highlight_42, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_89(_jspx_th_camod_highlight_42, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_42.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_42 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_7[0]--;
    }
    if (_jspx_th_camod_highlight_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_42);
    return false;
  }

  private boolean _jspx_meth_c_out_88(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_42, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_88 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_88.setPageContext(_jspx_page_context);
    _jspx_th_c_out_88.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_42);
    _jspx_th_c_out_88.setValue("${cd.treatment.ageAtTreatment}");
    _jspx_th_c_out_88.setEscapeXml("false");
    int _jspx_eval_c_out_88 = _jspx_th_c_out_88.doStartTag();
    if (_jspx_th_c_out_88.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_88);
    return false;
  }

  private boolean _jspx_meth_c_out_89(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_42, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_89 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_89.setPageContext(_jspx_page_context);
    _jspx_th_c_out_89.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_42);
    _jspx_th_c_out_89.setValue("${cd.treatment.ageAtTreatmentUnit}");
    _jspx_th_c_out_89.setEscapeXml("false");
    int _jspx_eval_c_out_89 = _jspx_th_c_out_89.doStartTag();
    if (_jspx_th_c_out_89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_89);
    return false;
  }

  private boolean _jspx_meth_c_out_90(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_90 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_90.setPageContext(_jspx_page_context);
    _jspx_th_c_out_90.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    _jspx_th_c_out_90.setValue("${tdClass}");
    int _jspx_eval_c_out_90 = _jspx_th_c_out_90.doStartTag();
    if (_jspx_th_c_out_90.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_90);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_43(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_43 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_43.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    int _jspx_eval_camod_highlight_43 = _jspx_th_camod_highlight_43.doStartTag();
    if (_jspx_eval_camod_highlight_43 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_43 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_7[0]++;
        _jspx_th_camod_highlight_43.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_43.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_91(_jspx_th_camod_highlight_43, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_43.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_43 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_7[0]--;
    }
    if (_jspx_th_camod_highlight_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_43);
    return false;
  }

  private boolean _jspx_meth_c_out_91(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_43, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_91 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_91.setPageContext(_jspx_page_context);
    _jspx_th_c_out_91.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_43);
    _jspx_th_c_out_91.setValue("${cd.treatment.sexDistribution.type}");
    _jspx_th_c_out_91.setEscapeXml("false");
    int _jspx_eval_c_out_91 = _jspx_th_c_out_91.doStartTag();
    if (_jspx_th_c_out_91.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_91);
    return false;
  }

  private boolean _jspx_meth_c_out_92(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_92 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_92.setPageContext(_jspx_page_context);
    _jspx_th_c_out_92.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    _jspx_th_c_out_92.setValue("${tdClass}");
    int _jspx_eval_c_out_92 = _jspx_th_c_out_92.doStartTag();
    if (_jspx_th_c_out_92.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_92);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_44(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_44 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_44.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
    int _jspx_eval_camod_highlight_44 = _jspx_th_camod_highlight_44.doStartTag();
    if (_jspx_eval_camod_highlight_44 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_44 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_7[0]++;
        _jspx_th_camod_highlight_44.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_44.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_93(_jspx_th_camod_highlight_44, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_44.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_44 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_7[0]--;
    }
    if (_jspx_th_camod_highlight_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_44);
    return false;
  }

  private boolean _jspx_meth_c_out_93(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_44, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_93 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_93.setPageContext(_jspx_page_context);
    _jspx_th_c_out_93.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_44);
    _jspx_th_c_out_93.setValue("${cd.environmentalFactor.comments}");
    _jspx_th_c_out_93.setEscapeXml("false");
    int _jspx_eval_c_out_93 = _jspx_th_c_out_93.doStartTag();
    if (_jspx_th_c_out_93.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_93);
    return false;
  }

  private boolean _jspx_meth_c_set_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_24 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_24.setPageContext(_jspx_page_context);
    _jspx_th_c_set_24.setParent(null);
    _jspx_th_c_set_24.setVar("environmentalFactorType");
    _jspx_th_c_set_24.setValue("Other");
    int _jspx_eval_c_set_24 = _jspx_th_c_set_24.doStartTag();
    if (_jspx_th_c_set_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_24);
    return false;
  }

  private boolean _jspx_meth_c_set_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_25 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_25.setPageContext(_jspx_page_context);
    _jspx_th_c_set_25.setParent(null);
    _jspx_th_c_set_25.setVar("cdList");
    _jspx_th_c_set_25.setValue("${carcinogenicInterventionColl[environmentalFactorType]}");
    int _jspx_eval_c_set_25 = _jspx_th_c_set_25.doStartTag();
    if (_jspx_th_c_set_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_25);
    return false;
  }

  private boolean _jspx_meth_c_if_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_15 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_15.setPageContext(_jspx_page_context);
    _jspx_th_c_if_15.setParent(null);
    _jspx_th_c_if_15.setTest("${not empty cdList}");
    int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
    if (_jspx_eval_c_if_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"1\" align=\"center\" width=\"100%\">\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<!--   Start of if externalSource is Jax MTB -->\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_if_16(_jspx_th_c_if_15, _jspx_page_context))
          return true;
        out.write("\t\t\r\n");
        out.write("\t\t\t<!--   End of if externalSource is Jax MTB -->\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t<!--   Start of if externalSource is empty (caMOD data) -->\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_if_17(_jspx_th_c_if_15, _jspx_page_context))
          return true;
        out.write("\t\t\t\r\n");
        out.write("\t\t\t</TABLE>\r\n");
        out.write("\t\t\t<br>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
    return false;
  }

  private boolean _jspx_meth_c_if_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_16 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_16.setPageContext(_jspx_page_context);
    _jspx_th_c_if_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_15);
    _jspx_th_c_if_16.setTest("${mdl.externalSource == 'Jax MTB'}");
    int _jspx_eval_c_if_16 = _jspx_th_c_if_16.doStartTag();
    if (_jspx_eval_c_if_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<!-- Moved Header inside each loop - Different for Jax and caMOD  -->\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"formTitleBlue\" height=\"20\" colspan=\"4\">Other Agents</td>\r\n");
        out.write("\t\t\t</tr>\t\t\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Type</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Name</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_8(_jspx_th_c_if_16, _jspx_page_context))
          return true;
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
    return false;
  }

  private boolean _jspx_meth_c_forEach_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_8 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_8.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_16);
    _jspx_th_c_forEach_8.setVar("cd");
    _jspx_th_c_forEach_8.setItems("${cdList}");
    _jspx_th_c_forEach_8.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_8 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_8 = _jspx_th_c_forEach_8.doStartTag();
      if (_jspx_eval_c_forEach_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_16(_jspx_th_c_forEach_8, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_94(_jspx_th_c_forEach_8, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_45(_jspx_th_c_forEach_8, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_96(_jspx_th_c_forEach_8, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_46(_jspx_th_c_forEach_8, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_8.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_8);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_16 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_16.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_8);
    int _jspx_eval_c_choose_16 = _jspx_th_c_choose_16.doStartTag();
    if (_jspx_eval_c_choose_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_16(_jspx_th_c_choose_16, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_16(_jspx_th_c_choose_16, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_16);
    return false;
  }

  private boolean _jspx_meth_c_when_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_16 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_16.setPageContext(_jspx_page_context);
    _jspx_th_c_when_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_16);
    _jspx_th_c_when_16.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_16 = _jspx_th_c_when_16.doStartTag();
    if (_jspx_eval_c_when_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_26(_jspx_th_c_when_16, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_16);
    return false;
  }

  private boolean _jspx_meth_c_set_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_26 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_26.setPageContext(_jspx_page_context);
    _jspx_th_c_set_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_16);
    _jspx_th_c_set_26.setVar("tdClass");
    _jspx_th_c_set_26.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_26 = _jspx_th_c_set_26.doStartTag();
    if (_jspx_th_c_set_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_26);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_16 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_16.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_16);
    int _jspx_eval_c_otherwise_16 = _jspx_th_c_otherwise_16.doStartTag();
    if (_jspx_eval_c_otherwise_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_27(_jspx_th_c_otherwise_16, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_16);
    return false;
  }

  private boolean _jspx_meth_c_set_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_27 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_27.setPageContext(_jspx_page_context);
    _jspx_th_c_set_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_16);
    _jspx_th_c_set_27.setVar("tdClass");
    _jspx_th_c_set_27.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_27 = _jspx_th_c_set_27.doStartTag();
    if (_jspx_th_c_set_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_27);
    return false;
  }

  private boolean _jspx_meth_c_out_94(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_94 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_94.setPageContext(_jspx_page_context);
    _jspx_th_c_out_94.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_8);
    _jspx_th_c_out_94.setValue("${tdClass}");
    int _jspx_eval_c_out_94 = _jspx_th_c_out_94.doStartTag();
    if (_jspx_th_c_out_94.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_94);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_45(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_45 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_45.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_8);
    int _jspx_eval_camod_highlight_45 = _jspx_th_camod_highlight_45.doStartTag();
    if (_jspx_eval_camod_highlight_45 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_45 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_8[0]++;
        _jspx_th_camod_highlight_45.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_45.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_95(_jspx_th_camod_highlight_45, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_45.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_45 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_8[0]--;
    }
    if (_jspx_th_camod_highlight_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_45);
    return false;
  }

  private boolean _jspx_meth_c_out_95(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_45, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_95 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_95.setPageContext(_jspx_page_context);
    _jspx_th_c_out_95.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_45);
    _jspx_th_c_out_95.setValue("${cd.environmentalFactor.typeAlternEntry}");
    _jspx_th_c_out_95.setEscapeXml("false");
    int _jspx_eval_c_out_95 = _jspx_th_c_out_95.doStartTag();
    if (_jspx_th_c_out_95.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_95);
    return false;
  }

  private boolean _jspx_meth_c_out_96(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_96 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_96.setPageContext(_jspx_page_context);
    _jspx_th_c_out_96.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_8);
    _jspx_th_c_out_96.setValue("${tdClass}");
    int _jspx_eval_c_out_96 = _jspx_th_c_out_96.doStartTag();
    if (_jspx_th_c_out_96.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_96);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_46(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_46 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_46.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_8);
    int _jspx_eval_camod_highlight_46 = _jspx_th_camod_highlight_46.doStartTag();
    if (_jspx_eval_camod_highlight_46 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_46 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_8[0]++;
        _jspx_th_camod_highlight_46.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_46.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_97(_jspx_th_camod_highlight_46, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_46.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_46 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_8[0]--;
    }
    if (_jspx_th_camod_highlight_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_46);
    return false;
  }

  private boolean _jspx_meth_c_out_97(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_46, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_97 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_97.setPageContext(_jspx_page_context);
    _jspx_th_c_out_97.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_46);
    _jspx_th_c_out_97.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_97.setEscapeXml("false");
    int _jspx_eval_c_out_97 = _jspx_th_c_out_97.doStartTag();
    if (_jspx_th_c_out_97.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_97);
    return false;
  }

  private boolean _jspx_meth_c_if_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_17 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_17.setPageContext(_jspx_page_context);
    _jspx_th_c_if_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_15);
    _jspx_th_c_if_17.setTest("${empty mdl.externalSource}");
    int _jspx_eval_c_if_17 = _jspx_th_c_if_17.doStartTag();
    if (_jspx_eval_c_if_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"formTitleBlue\" height=\"20\" colspan=\"5\">Surgery</td>\r\n");
        out.write("\t\t\t</tr>\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"30%\">Surgery</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"30%\">Treatment Regimen</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"20%\">Age at Treatment</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"20%\">Gender</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Comment</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_9(_jspx_th_c_if_17, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t<!--   End of if externalSource is empty (caMOD data) -->\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
    return false;
  }

  private boolean _jspx_meth_c_forEach_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_9 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_9.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_17);
    _jspx_th_c_forEach_9.setVar("cd");
    _jspx_th_c_forEach_9.setItems("${cdList}");
    _jspx_th_c_forEach_9.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_9 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_9 = _jspx_th_c_forEach_9.doStartTag();
      if (_jspx_eval_c_forEach_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_17(_jspx_th_c_forEach_9, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
            return true;
          out.write("&nbsp;\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_98(_jspx_th_c_forEach_9, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
            return true;
          out.write("\" width=\"30%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_choose_18(_jspx_th_c_forEach_9, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
            return true;
          out.write("&nbsp;\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_101(_jspx_th_c_forEach_9, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
            return true;
          out.write("\" width=\"30%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_49(_jspx_th_c_forEach_9, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_103(_jspx_th_c_forEach_9, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_50(_jspx_th_c_forEach_9, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_106(_jspx_th_c_forEach_9, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_51(_jspx_th_c_forEach_9, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_108(_jspx_th_c_forEach_9, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
            return true;
          out.write("End\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_52(_jspx_th_c_forEach_9, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\t\t\t\t\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_9.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_9);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_17 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_17.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_9);
    int _jspx_eval_c_choose_17 = _jspx_th_c_choose_17.doStartTag();
    if (_jspx_eval_c_choose_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_17(_jspx_th_c_choose_17, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_17(_jspx_th_c_choose_17, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_17);
    return false;
  }

  private boolean _jspx_meth_c_when_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_17 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_17.setPageContext(_jspx_page_context);
    _jspx_th_c_when_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_17);
    _jspx_th_c_when_17.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_17 = _jspx_th_c_when_17.doStartTag();
    if (_jspx_eval_c_when_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_28(_jspx_th_c_when_17, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_17);
    return false;
  }

  private boolean _jspx_meth_c_set_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_28 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_28.setPageContext(_jspx_page_context);
    _jspx_th_c_set_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_17);
    _jspx_th_c_set_28.setVar("tdClass");
    _jspx_th_c_set_28.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_28 = _jspx_th_c_set_28.doStartTag();
    if (_jspx_th_c_set_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_28);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_17 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_17.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_17);
    int _jspx_eval_c_otherwise_17 = _jspx_th_c_otherwise_17.doStartTag();
    if (_jspx_eval_c_otherwise_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_29(_jspx_th_c_otherwise_17, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_17);
    return false;
  }

  private boolean _jspx_meth_c_set_29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_29 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_29.setPageContext(_jspx_page_context);
    _jspx_th_c_set_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_17);
    _jspx_th_c_set_29.setVar("tdClass");
    _jspx_th_c_set_29.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_29 = _jspx_th_c_set_29.doStartTag();
    if (_jspx_th_c_set_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_29);
    return false;
  }

  private boolean _jspx_meth_c_out_98(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_98 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_98.setPageContext(_jspx_page_context);
    _jspx_th_c_out_98.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_9);
    _jspx_th_c_out_98.setValue("${tdClass}");
    int _jspx_eval_c_out_98 = _jspx_th_c_out_98.doStartTag();
    if (_jspx_th_c_out_98.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_98);
    return false;
  }

  private boolean _jspx_meth_c_choose_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_18 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_18.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_9);
    int _jspx_eval_c_choose_18 = _jspx_th_c_choose_18.doStartTag();
    if (_jspx_eval_c_choose_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_when_18(_jspx_th_c_choose_18, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_18(_jspx_th_c_choose_18, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_18);
    return false;
  }

  private boolean _jspx_meth_c_when_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_18, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_18 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_18.setPageContext(_jspx_page_context);
    _jspx_th_c_when_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_18);
    _jspx_th_c_when_18.setTest("${empty cd.environmentalFactor.name}");
    int _jspx_eval_c_when_18 = _jspx_th_c_when_18.doStartTag();
    if (_jspx_eval_c_when_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_47(_jspx_th_c_when_18, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_18);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_47(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_18, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_47 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_47.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_18);
    int _jspx_eval_camod_highlight_47 = _jspx_th_camod_highlight_47.doStartTag();
    if (_jspx_eval_camod_highlight_47 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_47 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_9[0]++;
        _jspx_th_camod_highlight_47.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_47.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_99(_jspx_th_camod_highlight_47, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_47.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_47 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_9[0]--;
    }
    if (_jspx_th_camod_highlight_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_47);
    return false;
  }

  private boolean _jspx_meth_c_out_99(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_47, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_99 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_99.setPageContext(_jspx_page_context);
    _jspx_th_c_out_99.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_47);
    _jspx_th_c_out_99.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_99.setEscapeXml("false");
    int _jspx_eval_c_out_99 = _jspx_th_c_out_99.doStartTag();
    if (_jspx_th_c_out_99.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_99);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_18, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_18 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_18.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_18);
    int _jspx_eval_c_otherwise_18 = _jspx_th_c_otherwise_18.doStartTag();
    if (_jspx_eval_c_otherwise_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_48(_jspx_th_c_otherwise_18, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_18);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_48(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_18, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_48 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_48.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_18);
    int _jspx_eval_camod_highlight_48 = _jspx_th_camod_highlight_48.doStartTag();
    if (_jspx_eval_camod_highlight_48 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_48 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_9[0]++;
        _jspx_th_camod_highlight_48.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_48.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_100(_jspx_th_camod_highlight_48, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_48.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_48 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_9[0]--;
    }
    if (_jspx_th_camod_highlight_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_48);
    return false;
  }

  private boolean _jspx_meth_c_out_100(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_48, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_100 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_100.setPageContext(_jspx_page_context);
    _jspx_th_c_out_100.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_48);
    _jspx_th_c_out_100.setValue("${cd.environmentalFactor.name}");
    _jspx_th_c_out_100.setEscapeXml("false");
    int _jspx_eval_c_out_100 = _jspx_th_c_out_100.doStartTag();
    if (_jspx_th_c_out_100.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_100);
    return false;
  }

  private boolean _jspx_meth_c_out_101(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_101 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_101.setPageContext(_jspx_page_context);
    _jspx_th_c_out_101.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_9);
    _jspx_th_c_out_101.setValue("${tdClass}");
    int _jspx_eval_c_out_101 = _jspx_th_c_out_101.doStartTag();
    if (_jspx_th_c_out_101.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_101);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_49(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_49 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_49.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_9);
    int _jspx_eval_camod_highlight_49 = _jspx_th_camod_highlight_49.doStartTag();
    if (_jspx_eval_camod_highlight_49 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_49 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_9[0]++;
        _jspx_th_camod_highlight_49.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_49.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_102(_jspx_th_camod_highlight_49, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_49.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_49 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_9[0]--;
    }
    if (_jspx_th_camod_highlight_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_49);
    return false;
  }

  private boolean _jspx_meth_c_out_102(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_49, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_102 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_102.setPageContext(_jspx_page_context);
    _jspx_th_c_out_102.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_49);
    _jspx_th_c_out_102.setValue("${cd.treatment.regimen}");
    _jspx_th_c_out_102.setEscapeXml("false");
    int _jspx_eval_c_out_102 = _jspx_th_c_out_102.doStartTag();
    if (_jspx_th_c_out_102.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_102);
    return false;
  }

  private boolean _jspx_meth_c_out_103(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_103 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_103.setPageContext(_jspx_page_context);
    _jspx_th_c_out_103.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_9);
    _jspx_th_c_out_103.setValue("${tdClass}");
    int _jspx_eval_c_out_103 = _jspx_th_c_out_103.doStartTag();
    if (_jspx_th_c_out_103.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_103);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_50(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_50 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_50.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_9);
    int _jspx_eval_camod_highlight_50 = _jspx_th_camod_highlight_50.doStartTag();
    if (_jspx_eval_camod_highlight_50 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_50 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_9[0]++;
        _jspx_th_camod_highlight_50.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_50.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_104(_jspx_th_camod_highlight_50, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_105(_jspx_th_camod_highlight_50, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_50.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_50 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_9[0]--;
    }
    if (_jspx_th_camod_highlight_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_50);
    return false;
  }

  private boolean _jspx_meth_c_out_104(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_50, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_104 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_104.setPageContext(_jspx_page_context);
    _jspx_th_c_out_104.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_50);
    _jspx_th_c_out_104.setValue("${cd.treatment.ageAtTreatment}");
    _jspx_th_c_out_104.setEscapeXml("false");
    int _jspx_eval_c_out_104 = _jspx_th_c_out_104.doStartTag();
    if (_jspx_th_c_out_104.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_104);
    return false;
  }

  private boolean _jspx_meth_c_out_105(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_50, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_105 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_105.setPageContext(_jspx_page_context);
    _jspx_th_c_out_105.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_50);
    _jspx_th_c_out_105.setValue("${cd.treatment.ageAtTreatmentUnit}");
    _jspx_th_c_out_105.setEscapeXml("false");
    int _jspx_eval_c_out_105 = _jspx_th_c_out_105.doStartTag();
    if (_jspx_th_c_out_105.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_105);
    return false;
  }

  private boolean _jspx_meth_c_out_106(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_106 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_106.setPageContext(_jspx_page_context);
    _jspx_th_c_out_106.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_9);
    _jspx_th_c_out_106.setValue("${tdClass}");
    int _jspx_eval_c_out_106 = _jspx_th_c_out_106.doStartTag();
    if (_jspx_th_c_out_106.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_106);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_51(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_51 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_51.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_9);
    int _jspx_eval_camod_highlight_51 = _jspx_th_camod_highlight_51.doStartTag();
    if (_jspx_eval_camod_highlight_51 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_51 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_9[0]++;
        _jspx_th_camod_highlight_51.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_51.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_107(_jspx_th_camod_highlight_51, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_51.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_51 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_9[0]--;
    }
    if (_jspx_th_camod_highlight_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_51);
    return false;
  }

  private boolean _jspx_meth_c_out_107(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_51, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_107 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_107.setPageContext(_jspx_page_context);
    _jspx_th_c_out_107.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_51);
    _jspx_th_c_out_107.setValue("${cd.treatment.sexDistribution.type}");
    _jspx_th_c_out_107.setEscapeXml("false");
    int _jspx_eval_c_out_107 = _jspx_th_c_out_107.doStartTag();
    if (_jspx_th_c_out_107.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_107);
    return false;
  }

  private boolean _jspx_meth_c_out_108(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_108 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_108.setPageContext(_jspx_page_context);
    _jspx_th_c_out_108.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_9);
    _jspx_th_c_out_108.setValue("${tdClass}");
    int _jspx_eval_c_out_108 = _jspx_th_c_out_108.doStartTag();
    if (_jspx_th_c_out_108.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_108);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_52(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_52 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_52.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_9);
    int _jspx_eval_camod_highlight_52 = _jspx_th_camod_highlight_52.doStartTag();
    if (_jspx_eval_camod_highlight_52 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_52 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_9[0]++;
        _jspx_th_camod_highlight_52.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_52.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_109(_jspx_th_camod_highlight_52, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_52.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_52 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_9[0]--;
    }
    if (_jspx_th_camod_highlight_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_52);
    return false;
  }

  private boolean _jspx_meth_c_out_109(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_52, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_109 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_109.setPageContext(_jspx_page_context);
    _jspx_th_c_out_109.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_52);
    _jspx_th_c_out_109.setValue("${cd.environmentalFactor.comments}");
    _jspx_th_c_out_109.setEscapeXml("false");
    int _jspx_eval_c_out_109 = _jspx_th_c_out_109.doStartTag();
    if (_jspx_th_c_out_109.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_109);
    return false;
  }

  private boolean _jspx_meth_c_set_30(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_30 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_30.setPageContext(_jspx_page_context);
    _jspx_th_c_set_30.setParent(null);
    _jspx_th_c_set_30.setVar("environmentalFactorType");
    _jspx_th_c_set_30.setValue("Viral");
    int _jspx_eval_c_set_30 = _jspx_th_c_set_30.doStartTag();
    if (_jspx_th_c_set_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_30);
    return false;
  }

  private boolean _jspx_meth_c_set_31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_31 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_31.setPageContext(_jspx_page_context);
    _jspx_th_c_set_31.setParent(null);
    _jspx_th_c_set_31.setVar("cdList");
    _jspx_th_c_set_31.setValue("${carcinogenicInterventionColl[environmentalFactorType]}");
    int _jspx_eval_c_set_31 = _jspx_th_c_set_31.doStartTag();
    if (_jspx_th_c_set_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_31);
    return false;
  }

  private boolean _jspx_meth_c_if_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_18 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_18.setPageContext(_jspx_page_context);
    _jspx_th_c_if_18.setParent(null);
    _jspx_th_c_if_18.setTest("${not empty cdList}");
    int _jspx_eval_c_if_18 = _jspx_th_c_if_18.doStartTag();
    if (_jspx_eval_c_if_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"1\" align=\"center\" width=\"100%\">\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"formTitleBlue\" height=\"20\" colspan=\"7\">Viral Treatment</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<!--   Start of if externalSource is Jax MTB -->\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_if_19(_jspx_th_c_if_18, _jspx_page_context))
          return true;
        out.write("\t\t\r\n");
        out.write("\t\t\t<!--   End of if externalSource is Jax MTB -->\r\n");
        out.write("\r\n");
        out.write("\t\t\t<!--   Start of if externalSource is empty (caMOD data) -->\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_if_20(_jspx_th_c_if_18, _jspx_page_context))
          return true;
        out.write("\t\t\t\r\n");
        out.write("\t\t\t</TABLE>\r\n");
        out.write("\t\t\t<br>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
    return false;
  }

  private boolean _jspx_meth_c_if_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_19 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_19.setPageContext(_jspx_page_context);
    _jspx_th_c_if_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_18);
    _jspx_th_c_if_19.setTest("${mdl.externalSource == 'Jax MTB'}");
    int _jspx_eval_c_if_19 = _jspx_th_c_if_19.doStartTag();
    if (_jspx_eval_c_if_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Type</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Name</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_10(_jspx_th_c_if_19, _jspx_page_context))
          return true;
        out.write("\t\t\t\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
    return false;
  }

  private boolean _jspx_meth_c_forEach_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_10 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_10.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_19);
    _jspx_th_c_forEach_10.setVar("cd");
    _jspx_th_c_forEach_10.setItems("${cdList}");
    _jspx_th_c_forEach_10.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_10 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_10 = _jspx_th_c_forEach_10.doStartTag();
      if (_jspx_eval_c_forEach_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_19(_jspx_th_c_forEach_10, _jspx_page_context, _jspx_push_body_count_c_forEach_10))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_110(_jspx_th_c_forEach_10, _jspx_page_context, _jspx_push_body_count_c_forEach_10))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_53(_jspx_th_c_forEach_10, _jspx_page_context, _jspx_push_body_count_c_forEach_10))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_112(_jspx_th_c_forEach_10, _jspx_page_context, _jspx_push_body_count_c_forEach_10))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_54(_jspx_th_c_forEach_10, _jspx_page_context, _jspx_push_body_count_c_forEach_10))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_10.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_10);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_19 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_19.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_10);
    int _jspx_eval_c_choose_19 = _jspx_th_c_choose_19.doStartTag();
    if (_jspx_eval_c_choose_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_19(_jspx_th_c_choose_19, _jspx_page_context, _jspx_push_body_count_c_forEach_10))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_19(_jspx_th_c_choose_19, _jspx_page_context, _jspx_push_body_count_c_forEach_10))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_19);
    return false;
  }

  private boolean _jspx_meth_c_when_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_19, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_19 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_19.setPageContext(_jspx_page_context);
    _jspx_th_c_when_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_19);
    _jspx_th_c_when_19.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_19 = _jspx_th_c_when_19.doStartTag();
    if (_jspx_eval_c_when_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_32(_jspx_th_c_when_19, _jspx_page_context, _jspx_push_body_count_c_forEach_10))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_19);
    return false;
  }

  private boolean _jspx_meth_c_set_32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_19, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_32 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_32.setPageContext(_jspx_page_context);
    _jspx_th_c_set_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_19);
    _jspx_th_c_set_32.setVar("tdClass");
    _jspx_th_c_set_32.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_32 = _jspx_th_c_set_32.doStartTag();
    if (_jspx_th_c_set_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_32);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_19, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_19 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_19.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_19);
    int _jspx_eval_c_otherwise_19 = _jspx_th_c_otherwise_19.doStartTag();
    if (_jspx_eval_c_otherwise_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_33(_jspx_th_c_otherwise_19, _jspx_page_context, _jspx_push_body_count_c_forEach_10))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_19);
    return false;
  }

  private boolean _jspx_meth_c_set_33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_19, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_33 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_33.setPageContext(_jspx_page_context);
    _jspx_th_c_set_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_19);
    _jspx_th_c_set_33.setVar("tdClass");
    _jspx_th_c_set_33.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_33 = _jspx_th_c_set_33.doStartTag();
    if (_jspx_th_c_set_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_33);
    return false;
  }

  private boolean _jspx_meth_c_out_110(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_110 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_110.setPageContext(_jspx_page_context);
    _jspx_th_c_out_110.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_10);
    _jspx_th_c_out_110.setValue("${tdClass}");
    int _jspx_eval_c_out_110 = _jspx_th_c_out_110.doStartTag();
    if (_jspx_th_c_out_110.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_110);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_53(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_53 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_53.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_10);
    int _jspx_eval_camod_highlight_53 = _jspx_th_camod_highlight_53.doStartTag();
    if (_jspx_eval_camod_highlight_53 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_53 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_10[0]++;
        _jspx_th_camod_highlight_53.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_53.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_111(_jspx_th_camod_highlight_53, _jspx_page_context, _jspx_push_body_count_c_forEach_10))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_53.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_53 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_10[0]--;
    }
    if (_jspx_th_camod_highlight_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_53);
    return false;
  }

  private boolean _jspx_meth_c_out_111(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_53, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_111 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_111.setPageContext(_jspx_page_context);
    _jspx_th_c_out_111.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_53);
    _jspx_th_c_out_111.setValue("${cd.environmentalFactor.typeAlternEntry}");
    _jspx_th_c_out_111.setEscapeXml("false");
    int _jspx_eval_c_out_111 = _jspx_th_c_out_111.doStartTag();
    if (_jspx_th_c_out_111.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_111);
    return false;
  }

  private boolean _jspx_meth_c_out_112(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_112 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_112.setPageContext(_jspx_page_context);
    _jspx_th_c_out_112.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_10);
    _jspx_th_c_out_112.setValue("${tdClass}");
    int _jspx_eval_c_out_112 = _jspx_th_c_out_112.doStartTag();
    if (_jspx_th_c_out_112.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_112);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_54(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_54 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_54.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_10);
    int _jspx_eval_camod_highlight_54 = _jspx_th_camod_highlight_54.doStartTag();
    if (_jspx_eval_camod_highlight_54 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_54 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_10[0]++;
        _jspx_th_camod_highlight_54.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_54.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_113(_jspx_th_camod_highlight_54, _jspx_page_context, _jspx_push_body_count_c_forEach_10))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_54.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_54 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_10[0]--;
    }
    if (_jspx_th_camod_highlight_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_54);
    return false;
  }

  private boolean _jspx_meth_c_out_113(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_54, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_113 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_113.setPageContext(_jspx_page_context);
    _jspx_th_c_out_113.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_54);
    _jspx_th_c_out_113.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_113.setEscapeXml("false");
    int _jspx_eval_c_out_113 = _jspx_th_c_out_113.doStartTag();
    if (_jspx_th_c_out_113.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_113);
    return false;
  }

  private boolean _jspx_meth_c_if_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_20 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_20.setPageContext(_jspx_page_context);
    _jspx_th_c_if_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_18);
    _jspx_th_c_if_20.setTest("${empty mdl.externalSource}");
    int _jspx_eval_c_if_20 = _jspx_th_c_if_20.doStartTag();
    if (_jspx_eval_c_if_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Virus</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Dose</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Treatment Regimen</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Administrative Route</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Age at Treatment</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Gender</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Comment</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_11(_jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t<!--   End of if externalSource is empty (caMOD data) -->\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
    return false;
  }

  private boolean _jspx_meth_c_forEach_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_11 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_11.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_forEach_11.setVar("cd");
    _jspx_th_c_forEach_11.setItems("${cdList}");
    _jspx_th_c_forEach_11.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_11 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_11 = _jspx_th_c_forEach_11.doStartTag();
      if (_jspx_eval_c_forEach_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_20(_jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_114(_jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_choose_21(_jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_117(_jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_57(_jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_120(_jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_58(_jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_122(_jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_choose_22(_jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("&nbsp;\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_125(_jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_61(_jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_128(_jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_62(_jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_130(_jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("End\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_63(_jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\t\t\t\t\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_11.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_11);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_20 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_20.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    int _jspx_eval_c_choose_20 = _jspx_th_c_choose_20.doStartTag();
    if (_jspx_eval_c_choose_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_20(_jspx_th_c_choose_20, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_20(_jspx_th_c_choose_20, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_20);
    return false;
  }

  private boolean _jspx_meth_c_when_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_20 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_20.setPageContext(_jspx_page_context);
    _jspx_th_c_when_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_20);
    _jspx_th_c_when_20.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_20 = _jspx_th_c_when_20.doStartTag();
    if (_jspx_eval_c_when_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_34(_jspx_th_c_when_20, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_20);
    return false;
  }

  private boolean _jspx_meth_c_set_34(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_34 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_34.setPageContext(_jspx_page_context);
    _jspx_th_c_set_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_20);
    _jspx_th_c_set_34.setVar("tdClass");
    _jspx_th_c_set_34.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_34 = _jspx_th_c_set_34.doStartTag();
    if (_jspx_th_c_set_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_34);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_20 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_20.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_20);
    int _jspx_eval_c_otherwise_20 = _jspx_th_c_otherwise_20.doStartTag();
    if (_jspx_eval_c_otherwise_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_35(_jspx_th_c_otherwise_20, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_20);
    return false;
  }

  private boolean _jspx_meth_c_set_35(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_35 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_35.setPageContext(_jspx_page_context);
    _jspx_th_c_set_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_20);
    _jspx_th_c_set_35.setVar("tdClass");
    _jspx_th_c_set_35.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_35 = _jspx_th_c_set_35.doStartTag();
    if (_jspx_th_c_set_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_35);
    return false;
  }

  private boolean _jspx_meth_c_out_114(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_114 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_114.setPageContext(_jspx_page_context);
    _jspx_th_c_out_114.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    _jspx_th_c_out_114.setValue("${tdClass}");
    int _jspx_eval_c_out_114 = _jspx_th_c_out_114.doStartTag();
    if (_jspx_th_c_out_114.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_114);
    return false;
  }

  private boolean _jspx_meth_c_choose_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_21 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_21.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    int _jspx_eval_c_choose_21 = _jspx_th_c_choose_21.doStartTag();
    if (_jspx_eval_c_choose_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_when_21(_jspx_th_c_choose_21, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_21(_jspx_th_c_choose_21, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_21);
    return false;
  }

  private boolean _jspx_meth_c_when_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_21, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_21 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_21.setPageContext(_jspx_page_context);
    _jspx_th_c_when_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_21);
    _jspx_th_c_when_21.setTest("${empty cd.environmentalFactor.name}");
    int _jspx_eval_c_when_21 = _jspx_th_c_when_21.doStartTag();
    if (_jspx_eval_c_when_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_55(_jspx_th_c_when_21, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_21);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_55(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_21, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_55 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_55.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_21);
    int _jspx_eval_camod_highlight_55 = _jspx_th_camod_highlight_55.doStartTag();
    if (_jspx_eval_camod_highlight_55 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_55 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_11[0]++;
        _jspx_th_camod_highlight_55.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_55.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_115(_jspx_th_camod_highlight_55, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_55.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_55 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_11[0]--;
    }
    if (_jspx_th_camod_highlight_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_55);
    return false;
  }

  private boolean _jspx_meth_c_out_115(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_55, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_115 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_115.setPageContext(_jspx_page_context);
    _jspx_th_c_out_115.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_55);
    _jspx_th_c_out_115.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_115.setEscapeXml("false");
    int _jspx_eval_c_out_115 = _jspx_th_c_out_115.doStartTag();
    if (_jspx_th_c_out_115.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_115);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_21, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_21 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_21.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_21);
    int _jspx_eval_c_otherwise_21 = _jspx_th_c_otherwise_21.doStartTag();
    if (_jspx_eval_c_otherwise_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_56(_jspx_th_c_otherwise_21, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_21);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_56(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_21, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_56 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_56.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_21);
    int _jspx_eval_camod_highlight_56 = _jspx_th_camod_highlight_56.doStartTag();
    if (_jspx_eval_camod_highlight_56 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_56 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_11[0]++;
        _jspx_th_camod_highlight_56.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_56.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_116(_jspx_th_camod_highlight_56, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_56.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_56 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_11[0]--;
    }
    if (_jspx_th_camod_highlight_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_56);
    return false;
  }

  private boolean _jspx_meth_c_out_116(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_56, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_116 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_116.setPageContext(_jspx_page_context);
    _jspx_th_c_out_116.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_56);
    _jspx_th_c_out_116.setValue("${cd.environmentalFactor.name}");
    _jspx_th_c_out_116.setEscapeXml("false");
    int _jspx_eval_c_out_116 = _jspx_th_c_out_116.doStartTag();
    if (_jspx_th_c_out_116.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_116);
    return false;
  }

  private boolean _jspx_meth_c_out_117(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_117 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_117.setPageContext(_jspx_page_context);
    _jspx_th_c_out_117.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    _jspx_th_c_out_117.setValue("${tdClass}");
    int _jspx_eval_c_out_117 = _jspx_th_c_out_117.doStartTag();
    if (_jspx_th_c_out_117.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_117);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_57(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_57 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_57.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    int _jspx_eval_camod_highlight_57 = _jspx_th_camod_highlight_57.doStartTag();
    if (_jspx_eval_camod_highlight_57 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_57 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_11[0]++;
        _jspx_th_camod_highlight_57.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_57.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_118(_jspx_th_camod_highlight_57, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_119(_jspx_th_camod_highlight_57, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_57.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_57 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_11[0]--;
    }
    if (_jspx_th_camod_highlight_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_57);
    return false;
  }

  private boolean _jspx_meth_c_out_118(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_57, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_118 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_118.setPageContext(_jspx_page_context);
    _jspx_th_c_out_118.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_57);
    _jspx_th_c_out_118.setValue("${cd.treatment.dosage}");
    _jspx_th_c_out_118.setEscapeXml("false");
    int _jspx_eval_c_out_118 = _jspx_th_c_out_118.doStartTag();
    if (_jspx_th_c_out_118.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_118);
    return false;
  }

  private boolean _jspx_meth_c_out_119(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_57, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_119 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_119.setPageContext(_jspx_page_context);
    _jspx_th_c_out_119.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_57);
    _jspx_th_c_out_119.setValue("${cd.treatment.dosageUnit}");
    _jspx_th_c_out_119.setEscapeXml("false");
    int _jspx_eval_c_out_119 = _jspx_th_c_out_119.doStartTag();
    if (_jspx_th_c_out_119.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_119);
    return false;
  }

  private boolean _jspx_meth_c_out_120(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_120 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_120.setPageContext(_jspx_page_context);
    _jspx_th_c_out_120.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    _jspx_th_c_out_120.setValue("${tdClass}");
    int _jspx_eval_c_out_120 = _jspx_th_c_out_120.doStartTag();
    if (_jspx_th_c_out_120.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_120);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_58(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_58 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_58.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    int _jspx_eval_camod_highlight_58 = _jspx_th_camod_highlight_58.doStartTag();
    if (_jspx_eval_camod_highlight_58 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_58 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_11[0]++;
        _jspx_th_camod_highlight_58.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_58.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_121(_jspx_th_camod_highlight_58, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_58.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_58 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_11[0]--;
    }
    if (_jspx_th_camod_highlight_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_58);
    return false;
  }

  private boolean _jspx_meth_c_out_121(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_58, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_121 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_121.setPageContext(_jspx_page_context);
    _jspx_th_c_out_121.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_58);
    _jspx_th_c_out_121.setValue("${cd.treatment.regimen}");
    _jspx_th_c_out_121.setEscapeXml("false");
    int _jspx_eval_c_out_121 = _jspx_th_c_out_121.doStartTag();
    if (_jspx_th_c_out_121.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_121);
    return false;
  }

  private boolean _jspx_meth_c_out_122(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_122 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_122.setPageContext(_jspx_page_context);
    _jspx_th_c_out_122.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    _jspx_th_c_out_122.setValue("${tdClass}");
    int _jspx_eval_c_out_122 = _jspx_th_c_out_122.doStartTag();
    if (_jspx_th_c_out_122.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_122);
    return false;
  }

  private boolean _jspx_meth_c_choose_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_22 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_22.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    int _jspx_eval_c_choose_22 = _jspx_th_c_choose_22.doStartTag();
    if (_jspx_eval_c_choose_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_when_22(_jspx_th_c_choose_22, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_22(_jspx_th_c_choose_22, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_22);
    return false;
  }

  private boolean _jspx_meth_c_when_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_22, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_22 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_22.setPageContext(_jspx_page_context);
    _jspx_th_c_when_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_22);
    _jspx_th_c_when_22.setTest("${empty cd.treatment.administrativeRoute}");
    int _jspx_eval_c_when_22 = _jspx_th_c_when_22.doStartTag();
    if (_jspx_eval_c_when_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_59(_jspx_th_c_when_22, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_22);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_59(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_22, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_59 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_59.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_22);
    int _jspx_eval_camod_highlight_59 = _jspx_th_camod_highlight_59.doStartTag();
    if (_jspx_eval_camod_highlight_59 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_59 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_11[0]++;
        _jspx_th_camod_highlight_59.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_59.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_123(_jspx_th_camod_highlight_59, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_59.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_59 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_11[0]--;
    }
    if (_jspx_th_camod_highlight_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_59);
    return false;
  }

  private boolean _jspx_meth_c_out_123(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_59, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_123 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_123.setPageContext(_jspx_page_context);
    _jspx_th_c_out_123.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_59);
    _jspx_th_c_out_123.setValue("${cd.treatment.adminRouteAlternEntry}");
    _jspx_th_c_out_123.setEscapeXml("false");
    int _jspx_eval_c_out_123 = _jspx_th_c_out_123.doStartTag();
    if (_jspx_th_c_out_123.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_123);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_22, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_22 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_22.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_22);
    int _jspx_eval_c_otherwise_22 = _jspx_th_c_otherwise_22.doStartTag();
    if (_jspx_eval_c_otherwise_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_60(_jspx_th_c_otherwise_22, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_22);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_60(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_22, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_60 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_60.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_22);
    int _jspx_eval_camod_highlight_60 = _jspx_th_camod_highlight_60.doStartTag();
    if (_jspx_eval_camod_highlight_60 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_60 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_11[0]++;
        _jspx_th_camod_highlight_60.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_60.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_124(_jspx_th_camod_highlight_60, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_60.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_60 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_11[0]--;
    }
    if (_jspx_th_camod_highlight_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_60);
    return false;
  }

  private boolean _jspx_meth_c_out_124(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_60, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_124 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_124.setPageContext(_jspx_page_context);
    _jspx_th_c_out_124.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_60);
    _jspx_th_c_out_124.setValue("${cd.treatment.administrativeRoute}");
    _jspx_th_c_out_124.setEscapeXml("false");
    int _jspx_eval_c_out_124 = _jspx_th_c_out_124.doStartTag();
    if (_jspx_th_c_out_124.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_124);
    return false;
  }

  private boolean _jspx_meth_c_out_125(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_125 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_125.setPageContext(_jspx_page_context);
    _jspx_th_c_out_125.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    _jspx_th_c_out_125.setValue("${tdClass}");
    int _jspx_eval_c_out_125 = _jspx_th_c_out_125.doStartTag();
    if (_jspx_th_c_out_125.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_125);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_61(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_61 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_61.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    int _jspx_eval_camod_highlight_61 = _jspx_th_camod_highlight_61.doStartTag();
    if (_jspx_eval_camod_highlight_61 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_61 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_11[0]++;
        _jspx_th_camod_highlight_61.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_61.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_126(_jspx_th_camod_highlight_61, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_127(_jspx_th_camod_highlight_61, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_61.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_61 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_11[0]--;
    }
    if (_jspx_th_camod_highlight_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_61);
    return false;
  }

  private boolean _jspx_meth_c_out_126(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_61, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_126 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_126.setPageContext(_jspx_page_context);
    _jspx_th_c_out_126.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_61);
    _jspx_th_c_out_126.setValue("${cd.treatment.ageAtTreatment}");
    _jspx_th_c_out_126.setEscapeXml("false");
    int _jspx_eval_c_out_126 = _jspx_th_c_out_126.doStartTag();
    if (_jspx_th_c_out_126.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_126);
    return false;
  }

  private boolean _jspx_meth_c_out_127(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_61, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_127 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_127.setPageContext(_jspx_page_context);
    _jspx_th_c_out_127.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_61);
    _jspx_th_c_out_127.setValue("${cd.treatment.ageAtTreatmentUnit}");
    _jspx_th_c_out_127.setEscapeXml("false");
    int _jspx_eval_c_out_127 = _jspx_th_c_out_127.doStartTag();
    if (_jspx_th_c_out_127.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_127);
    return false;
  }

  private boolean _jspx_meth_c_out_128(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_128 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_128.setPageContext(_jspx_page_context);
    _jspx_th_c_out_128.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    _jspx_th_c_out_128.setValue("${tdClass}");
    int _jspx_eval_c_out_128 = _jspx_th_c_out_128.doStartTag();
    if (_jspx_th_c_out_128.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_128);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_62(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_62 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_62.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    int _jspx_eval_camod_highlight_62 = _jspx_th_camod_highlight_62.doStartTag();
    if (_jspx_eval_camod_highlight_62 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_62 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_11[0]++;
        _jspx_th_camod_highlight_62.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_62.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_129(_jspx_th_camod_highlight_62, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_62.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_62 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_11[0]--;
    }
    if (_jspx_th_camod_highlight_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_62);
    return false;
  }

  private boolean _jspx_meth_c_out_129(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_62, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_129 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_129.setPageContext(_jspx_page_context);
    _jspx_th_c_out_129.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_62);
    _jspx_th_c_out_129.setValue("${cd.treatment.sexDistribution.type}");
    _jspx_th_c_out_129.setEscapeXml("false");
    int _jspx_eval_c_out_129 = _jspx_th_c_out_129.doStartTag();
    if (_jspx_th_c_out_129.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_129);
    return false;
  }

  private boolean _jspx_meth_c_out_130(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_130 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_130.setPageContext(_jspx_page_context);
    _jspx_th_c_out_130.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    _jspx_th_c_out_130.setValue("${tdClass}");
    int _jspx_eval_c_out_130 = _jspx_th_c_out_130.doStartTag();
    if (_jspx_th_c_out_130.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_130);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_63(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_63 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_63.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    int _jspx_eval_camod_highlight_63 = _jspx_th_camod_highlight_63.doStartTag();
    if (_jspx_eval_camod_highlight_63 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_63 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_11[0]++;
        _jspx_th_camod_highlight_63.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_63.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_131(_jspx_th_camod_highlight_63, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_63.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_63 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_11[0]--;
    }
    if (_jspx_th_camod_highlight_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_63);
    return false;
  }

  private boolean _jspx_meth_c_out_131(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_63, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_131 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_131.setPageContext(_jspx_page_context);
    _jspx_th_c_out_131.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_63);
    _jspx_th_c_out_131.setValue("${cd.environmentalFactor.comments}");
    _jspx_th_c_out_131.setEscapeXml("false");
    int _jspx_eval_c_out_131 = _jspx_th_c_out_131.doStartTag();
    if (_jspx_th_c_out_131.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_131);
    return false;
  }

  private boolean _jspx_meth_c_set_36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_36 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_36.setPageContext(_jspx_page_context);
    _jspx_th_c_set_36.setParent(null);
    _jspx_th_c_set_36.setVar("environmentalFactorType");
    _jspx_th_c_set_36.setValue("Environment");
    int _jspx_eval_c_set_36 = _jspx_th_c_set_36.doStartTag();
    if (_jspx_th_c_set_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_36);
    return false;
  }

  private boolean _jspx_meth_c_set_37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_37 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_37.setPageContext(_jspx_page_context);
    _jspx_th_c_set_37.setParent(null);
    _jspx_th_c_set_37.setVar("cdList");
    _jspx_th_c_set_37.setValue("${carcinogenicInterventionColl[environmentalFactorType]}");
    int _jspx_eval_c_set_37 = _jspx_th_c_set_37.doStartTag();
    if (_jspx_th_c_set_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_37);
    return false;
  }

  private boolean _jspx_meth_c_if_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_21 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_21.setPageContext(_jspx_page_context);
    _jspx_th_c_if_21.setParent(null);
    _jspx_th_c_if_21.setTest("${not empty cdList}");
    int _jspx_eval_c_if_21 = _jspx_th_c_if_21.doStartTag();
    if (_jspx_eval_c_if_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"1\" align=\"center\" width=\"100%\">\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"formTitleBlue\" height=\"20\" colspan=\"7\">Environment</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Environmental Factor</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Dose</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Treatment Regimen</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Administrative Route</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Age at Treatment</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Gender</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Comment</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_12(_jspx_th_c_if_21, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</TABLE>\t\t\r\n");
        out.write("\t        <br>\r\n");
        out.write("\t        ");
        int evalDoAfterBody = _jspx_th_c_if_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_21);
    return false;
  }

  private boolean _jspx_meth_c_forEach_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_12 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_12.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_21);
    _jspx_th_c_forEach_12.setVar("cd");
    _jspx_th_c_forEach_12.setItems("${cdList}");
    _jspx_th_c_forEach_12.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_12 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_12 = _jspx_th_c_forEach_12.doStartTag();
      if (_jspx_eval_c_forEach_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_23(_jspx_th_c_forEach_12, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_132(_jspx_th_c_forEach_12, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_choose_24(_jspx_th_c_forEach_12, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_135(_jspx_th_c_forEach_12, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_66(_jspx_th_c_forEach_12, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_138(_jspx_th_c_forEach_12, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_67(_jspx_th_c_forEach_12, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_140(_jspx_th_c_forEach_12, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_choose_25(_jspx_th_c_forEach_12, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
            return true;
          out.write("&nbsp;\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_143(_jspx_th_c_forEach_12, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_70(_jspx_th_c_forEach_12, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_146(_jspx_th_c_forEach_12, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_71(_jspx_th_c_forEach_12, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_148(_jspx_th_c_forEach_12, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
            return true;
          out.write("End\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_72(_jspx_th_c_forEach_12, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\t\t\t\t\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_12.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_12[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_12.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_12.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_12);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_23 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_23.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_12);
    int _jspx_eval_c_choose_23 = _jspx_th_c_choose_23.doStartTag();
    if (_jspx_eval_c_choose_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_23(_jspx_th_c_choose_23, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_23(_jspx_th_c_choose_23, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_23);
    return false;
  }

  private boolean _jspx_meth_c_when_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_23, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_23 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_23.setPageContext(_jspx_page_context);
    _jspx_th_c_when_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_23);
    _jspx_th_c_when_23.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_23 = _jspx_th_c_when_23.doStartTag();
    if (_jspx_eval_c_when_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_38(_jspx_th_c_when_23, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_23);
    return false;
  }

  private boolean _jspx_meth_c_set_38(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_23, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_38 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_38.setPageContext(_jspx_page_context);
    _jspx_th_c_set_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_23);
    _jspx_th_c_set_38.setVar("tdClass");
    _jspx_th_c_set_38.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_38 = _jspx_th_c_set_38.doStartTag();
    if (_jspx_th_c_set_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_38);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_23, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_23 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_23.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_23);
    int _jspx_eval_c_otherwise_23 = _jspx_th_c_otherwise_23.doStartTag();
    if (_jspx_eval_c_otherwise_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_39(_jspx_th_c_otherwise_23, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_23);
    return false;
  }

  private boolean _jspx_meth_c_set_39(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_23, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_39 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_39.setPageContext(_jspx_page_context);
    _jspx_th_c_set_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_23);
    _jspx_th_c_set_39.setVar("tdClass");
    _jspx_th_c_set_39.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_39 = _jspx_th_c_set_39.doStartTag();
    if (_jspx_th_c_set_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_39);
    return false;
  }

  private boolean _jspx_meth_c_out_132(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_132 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_132.setPageContext(_jspx_page_context);
    _jspx_th_c_out_132.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_12);
    _jspx_th_c_out_132.setValue("${tdClass}");
    int _jspx_eval_c_out_132 = _jspx_th_c_out_132.doStartTag();
    if (_jspx_th_c_out_132.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_132);
    return false;
  }

  private boolean _jspx_meth_c_choose_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_24 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_24.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_12);
    int _jspx_eval_c_choose_24 = _jspx_th_c_choose_24.doStartTag();
    if (_jspx_eval_c_choose_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_when_24(_jspx_th_c_choose_24, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_24(_jspx_th_c_choose_24, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_24);
    return false;
  }

  private boolean _jspx_meth_c_when_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_24, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_24 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_24.setPageContext(_jspx_page_context);
    _jspx_th_c_when_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_24);
    _jspx_th_c_when_24.setTest("${empty cd.environmentalFactor.name}");
    int _jspx_eval_c_when_24 = _jspx_th_c_when_24.doStartTag();
    if (_jspx_eval_c_when_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_64(_jspx_th_c_when_24, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_24);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_64(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_24, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_64 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_64.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_24);
    int _jspx_eval_camod_highlight_64 = _jspx_th_camod_highlight_64.doStartTag();
    if (_jspx_eval_camod_highlight_64 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_64 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_12[0]++;
        _jspx_th_camod_highlight_64.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_64.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_133(_jspx_th_camod_highlight_64, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_64.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_64 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_12[0]--;
    }
    if (_jspx_th_camod_highlight_64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_64);
    return false;
  }

  private boolean _jspx_meth_c_out_133(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_64, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_133 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_133.setPageContext(_jspx_page_context);
    _jspx_th_c_out_133.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_64);
    _jspx_th_c_out_133.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_133.setEscapeXml("false");
    int _jspx_eval_c_out_133 = _jspx_th_c_out_133.doStartTag();
    if (_jspx_th_c_out_133.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_133);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_24, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_24 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_24.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_24);
    int _jspx_eval_c_otherwise_24 = _jspx_th_c_otherwise_24.doStartTag();
    if (_jspx_eval_c_otherwise_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_65(_jspx_th_c_otherwise_24, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_24);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_65(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_24, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_65 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_65.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_24);
    int _jspx_eval_camod_highlight_65 = _jspx_th_camod_highlight_65.doStartTag();
    if (_jspx_eval_camod_highlight_65 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_65 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_12[0]++;
        _jspx_th_camod_highlight_65.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_65.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_134(_jspx_th_camod_highlight_65, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_65.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_65 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_12[0]--;
    }
    if (_jspx_th_camod_highlight_65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_65);
    return false;
  }

  private boolean _jspx_meth_c_out_134(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_65, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_134 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_134.setPageContext(_jspx_page_context);
    _jspx_th_c_out_134.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_65);
    _jspx_th_c_out_134.setValue("${cd.environmentalFactor.name}");
    _jspx_th_c_out_134.setEscapeXml("false");
    int _jspx_eval_c_out_134 = _jspx_th_c_out_134.doStartTag();
    if (_jspx_th_c_out_134.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_134);
    return false;
  }

  private boolean _jspx_meth_c_out_135(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_135 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_135.setPageContext(_jspx_page_context);
    _jspx_th_c_out_135.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_12);
    _jspx_th_c_out_135.setValue("${tdClass}");
    int _jspx_eval_c_out_135 = _jspx_th_c_out_135.doStartTag();
    if (_jspx_th_c_out_135.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_135);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_66(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_66 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_66.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_12);
    int _jspx_eval_camod_highlight_66 = _jspx_th_camod_highlight_66.doStartTag();
    if (_jspx_eval_camod_highlight_66 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_66 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_12[0]++;
        _jspx_th_camod_highlight_66.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_66.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_136(_jspx_th_camod_highlight_66, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_137(_jspx_th_camod_highlight_66, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_66.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_66 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_12[0]--;
    }
    if (_jspx_th_camod_highlight_66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_66);
    return false;
  }

  private boolean _jspx_meth_c_out_136(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_66, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_136 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_136.setPageContext(_jspx_page_context);
    _jspx_th_c_out_136.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_66);
    _jspx_th_c_out_136.setValue("${cd.treatment.dosage}");
    _jspx_th_c_out_136.setEscapeXml("false");
    int _jspx_eval_c_out_136 = _jspx_th_c_out_136.doStartTag();
    if (_jspx_th_c_out_136.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_136);
    return false;
  }

  private boolean _jspx_meth_c_out_137(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_66, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_137 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_137.setPageContext(_jspx_page_context);
    _jspx_th_c_out_137.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_66);
    _jspx_th_c_out_137.setValue("${cd.treatment.dosageUnit}");
    _jspx_th_c_out_137.setEscapeXml("false");
    int _jspx_eval_c_out_137 = _jspx_th_c_out_137.doStartTag();
    if (_jspx_th_c_out_137.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_137);
    return false;
  }

  private boolean _jspx_meth_c_out_138(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_138 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_138.setPageContext(_jspx_page_context);
    _jspx_th_c_out_138.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_12);
    _jspx_th_c_out_138.setValue("${tdClass}");
    int _jspx_eval_c_out_138 = _jspx_th_c_out_138.doStartTag();
    if (_jspx_th_c_out_138.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_138);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_67(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_67 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_67.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_12);
    int _jspx_eval_camod_highlight_67 = _jspx_th_camod_highlight_67.doStartTag();
    if (_jspx_eval_camod_highlight_67 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_67 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_12[0]++;
        _jspx_th_camod_highlight_67.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_67.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_139(_jspx_th_camod_highlight_67, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_67.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_67 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_12[0]--;
    }
    if (_jspx_th_camod_highlight_67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_67);
    return false;
  }

  private boolean _jspx_meth_c_out_139(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_67, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_139 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_139.setPageContext(_jspx_page_context);
    _jspx_th_c_out_139.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_67);
    _jspx_th_c_out_139.setValue("${cd.treatment.regimen}");
    _jspx_th_c_out_139.setEscapeXml("false");
    int _jspx_eval_c_out_139 = _jspx_th_c_out_139.doStartTag();
    if (_jspx_th_c_out_139.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_139);
    return false;
  }

  private boolean _jspx_meth_c_out_140(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_140 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_140.setPageContext(_jspx_page_context);
    _jspx_th_c_out_140.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_12);
    _jspx_th_c_out_140.setValue("${tdClass}");
    int _jspx_eval_c_out_140 = _jspx_th_c_out_140.doStartTag();
    if (_jspx_th_c_out_140.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_140);
    return false;
  }

  private boolean _jspx_meth_c_choose_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_25 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_25.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_12);
    int _jspx_eval_c_choose_25 = _jspx_th_c_choose_25.doStartTag();
    if (_jspx_eval_c_choose_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_when_25(_jspx_th_c_choose_25, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_25(_jspx_th_c_choose_25, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_25);
    return false;
  }

  private boolean _jspx_meth_c_when_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_25, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_25 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_25.setPageContext(_jspx_page_context);
    _jspx_th_c_when_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_25);
    _jspx_th_c_when_25.setTest("${empty cd.treatment.administrativeRoute}");
    int _jspx_eval_c_when_25 = _jspx_th_c_when_25.doStartTag();
    if (_jspx_eval_c_when_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_68(_jspx_th_c_when_25, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_25);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_68(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_25, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_68 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_68.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_25);
    int _jspx_eval_camod_highlight_68 = _jspx_th_camod_highlight_68.doStartTag();
    if (_jspx_eval_camod_highlight_68 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_68 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_12[0]++;
        _jspx_th_camod_highlight_68.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_68.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_141(_jspx_th_camod_highlight_68, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_68.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_68 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_12[0]--;
    }
    if (_jspx_th_camod_highlight_68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_68);
    return false;
  }

  private boolean _jspx_meth_c_out_141(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_68, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_141 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_141.setPageContext(_jspx_page_context);
    _jspx_th_c_out_141.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_68);
    _jspx_th_c_out_141.setValue("${cd.treatment.adminRouteAlternEntry}");
    _jspx_th_c_out_141.setEscapeXml("false");
    int _jspx_eval_c_out_141 = _jspx_th_c_out_141.doStartTag();
    if (_jspx_th_c_out_141.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_141);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_25, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_25 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_25.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_25);
    int _jspx_eval_c_otherwise_25 = _jspx_th_c_otherwise_25.doStartTag();
    if (_jspx_eval_c_otherwise_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_69(_jspx_th_c_otherwise_25, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_25);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_69(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_25, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_69 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_69.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_25);
    int _jspx_eval_camod_highlight_69 = _jspx_th_camod_highlight_69.doStartTag();
    if (_jspx_eval_camod_highlight_69 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_69 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_12[0]++;
        _jspx_th_camod_highlight_69.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_69.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_142(_jspx_th_camod_highlight_69, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_69.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_69 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_12[0]--;
    }
    if (_jspx_th_camod_highlight_69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_69);
    return false;
  }

  private boolean _jspx_meth_c_out_142(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_69, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_142 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_142.setPageContext(_jspx_page_context);
    _jspx_th_c_out_142.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_69);
    _jspx_th_c_out_142.setValue("${cd.treatment.administrativeRoute}");
    _jspx_th_c_out_142.setEscapeXml("false");
    int _jspx_eval_c_out_142 = _jspx_th_c_out_142.doStartTag();
    if (_jspx_th_c_out_142.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_142);
    return false;
  }

  private boolean _jspx_meth_c_out_143(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_143 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_143.setPageContext(_jspx_page_context);
    _jspx_th_c_out_143.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_12);
    _jspx_th_c_out_143.setValue("${tdClass}");
    int _jspx_eval_c_out_143 = _jspx_th_c_out_143.doStartTag();
    if (_jspx_th_c_out_143.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_143);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_70(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_70 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_70.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_70.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_12);
    int _jspx_eval_camod_highlight_70 = _jspx_th_camod_highlight_70.doStartTag();
    if (_jspx_eval_camod_highlight_70 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_70 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_12[0]++;
        _jspx_th_camod_highlight_70.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_70.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_144(_jspx_th_camod_highlight_70, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_145(_jspx_th_camod_highlight_70, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_70.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_70 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_12[0]--;
    }
    if (_jspx_th_camod_highlight_70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_70);
    return false;
  }

  private boolean _jspx_meth_c_out_144(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_70, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_144 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_144.setPageContext(_jspx_page_context);
    _jspx_th_c_out_144.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_70);
    _jspx_th_c_out_144.setValue("${cd.treatment.ageAtTreatment}");
    _jspx_th_c_out_144.setEscapeXml("false");
    int _jspx_eval_c_out_144 = _jspx_th_c_out_144.doStartTag();
    if (_jspx_th_c_out_144.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_144);
    return false;
  }

  private boolean _jspx_meth_c_out_145(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_70, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_145 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_145.setPageContext(_jspx_page_context);
    _jspx_th_c_out_145.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_70);
    _jspx_th_c_out_145.setValue("${cd.treatment.ageAtTreatmentUnit}");
    _jspx_th_c_out_145.setEscapeXml("false");
    int _jspx_eval_c_out_145 = _jspx_th_c_out_145.doStartTag();
    if (_jspx_th_c_out_145.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_145);
    return false;
  }

  private boolean _jspx_meth_c_out_146(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_146 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_146.setPageContext(_jspx_page_context);
    _jspx_th_c_out_146.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_12);
    _jspx_th_c_out_146.setValue("${tdClass}");
    int _jspx_eval_c_out_146 = _jspx_th_c_out_146.doStartTag();
    if (_jspx_th_c_out_146.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_146);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_71(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_71 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_71.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_71.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_12);
    int _jspx_eval_camod_highlight_71 = _jspx_th_camod_highlight_71.doStartTag();
    if (_jspx_eval_camod_highlight_71 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_71 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_12[0]++;
        _jspx_th_camod_highlight_71.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_71.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_147(_jspx_th_camod_highlight_71, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_71.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_71 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_12[0]--;
    }
    if (_jspx_th_camod_highlight_71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_71);
    return false;
  }

  private boolean _jspx_meth_c_out_147(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_71, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_147 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_147.setPageContext(_jspx_page_context);
    _jspx_th_c_out_147.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_71);
    _jspx_th_c_out_147.setValue("${cd.treatment.sexDistribution.type}");
    _jspx_th_c_out_147.setEscapeXml("false");
    int _jspx_eval_c_out_147 = _jspx_th_c_out_147.doStartTag();
    if (_jspx_th_c_out_147.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_147);
    return false;
  }

  private boolean _jspx_meth_c_out_148(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_148 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_148.setPageContext(_jspx_page_context);
    _jspx_th_c_out_148.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_12);
    _jspx_th_c_out_148.setValue("${tdClass}");
    int _jspx_eval_c_out_148 = _jspx_th_c_out_148.doStartTag();
    if (_jspx_th_c_out_148.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_148);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_72(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_72 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_72.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_72.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_12);
    int _jspx_eval_camod_highlight_72 = _jspx_th_camod_highlight_72.doStartTag();
    if (_jspx_eval_camod_highlight_72 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_72 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_12[0]++;
        _jspx_th_camod_highlight_72.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_72.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_149(_jspx_th_camod_highlight_72, _jspx_page_context, _jspx_push_body_count_c_forEach_12))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_72.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_72 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_12[0]--;
    }
    if (_jspx_th_camod_highlight_72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_72);
    return false;
  }

  private boolean _jspx_meth_c_out_149(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_72, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_149 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_149.setPageContext(_jspx_page_context);
    _jspx_th_c_out_149.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_72);
    _jspx_th_c_out_149.setValue("${cd.environmentalFactor.comments}");
    _jspx_th_c_out_149.setEscapeXml("false");
    int _jspx_eval_c_out_149 = _jspx_th_c_out_149.doStartTag();
    if (_jspx_th_c_out_149.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_149);
    return false;
  }

  private boolean _jspx_meth_c_set_40(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_40 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_40.setPageContext(_jspx_page_context);
    _jspx_th_c_set_40.setParent(null);
    _jspx_th_c_set_40.setVar("environmentalFactorType");
    _jspx_th_c_set_40.setValue("GeneDelivery");
    int _jspx_eval_c_set_40 = _jspx_th_c_set_40.doStartTag();
    if (_jspx_th_c_set_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_40);
    return false;
  }

  private boolean _jspx_meth_c_set_41(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_41 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_41.setPageContext(_jspx_page_context);
    _jspx_th_c_set_41.setParent(null);
    _jspx_th_c_set_41.setVar("cdList");
    _jspx_th_c_set_41.setValue("${carcinogenicInterventionColl[environmentalFactorType]}");
    int _jspx_eval_c_set_41 = _jspx_th_c_set_41.doStartTag();
    if (_jspx_th_c_set_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_41);
    return false;
  }

  private boolean _jspx_meth_c_if_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_22 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_22.setPageContext(_jspx_page_context);
    _jspx_th_c_if_22.setParent(null);
    _jspx_th_c_if_22.setTest("${not empty cdList}");
    int _jspx_eval_c_if_22 = _jspx_th_c_if_22.doStartTag();
    if (_jspx_eval_c_if_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"1\" align=\"center\" width=\"100%\">\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"formTitleBlue\" height=\"20\" colspan=\"7\">Gene Delivery</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Viral Vector</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Gene</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Organ</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Treatment Regimen</td>\t\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Age at Treatment</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Gender</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Comment</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_13(_jspx_th_c_if_22, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</TABLE>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_22);
    return false;
  }

  private boolean _jspx_meth_c_forEach_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_13 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_13.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_22);
    _jspx_th_c_forEach_13.setVar("cd");
    _jspx_th_c_forEach_13.setItems("${cdList}");
    _jspx_th_c_forEach_13.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_13 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_13 = _jspx_th_c_forEach_13.doStartTag();
      if (_jspx_eval_c_forEach_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_26(_jspx_th_c_forEach_13, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_150(_jspx_th_c_forEach_13, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
            return true;
          out.write("\" width=\"30%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_choose_27(_jspx_th_c_forEach_13, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_153(_jspx_th_c_forEach_13, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_75(_jspx_th_c_forEach_13, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_155(_jspx_th_c_forEach_13, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
            return true;
          out.write("\" width=\"30%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_76(_jspx_th_c_forEach_13, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_157(_jspx_th_c_forEach_13, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_77(_jspx_th_c_forEach_13, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_159(_jspx_th_c_forEach_13, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_78(_jspx_th_c_forEach_13, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_162(_jspx_th_c_forEach_13, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_79(_jspx_th_c_forEach_13, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_164(_jspx_th_c_forEach_13, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
            return true;
          out.write("End\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_80(_jspx_th_c_forEach_13, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\t\t\t\t\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_13.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_13[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_13.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_13.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_13);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_26 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_26.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_13);
    int _jspx_eval_c_choose_26 = _jspx_th_c_choose_26.doStartTag();
    if (_jspx_eval_c_choose_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_26(_jspx_th_c_choose_26, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_26(_jspx_th_c_choose_26, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_26);
    return false;
  }

  private boolean _jspx_meth_c_when_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_26, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_26 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_26.setPageContext(_jspx_page_context);
    _jspx_th_c_when_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_26);
    _jspx_th_c_when_26.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_26 = _jspx_th_c_when_26.doStartTag();
    if (_jspx_eval_c_when_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_42(_jspx_th_c_when_26, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_26);
    return false;
  }

  private boolean _jspx_meth_c_set_42(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_26, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_42 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_42.setPageContext(_jspx_page_context);
    _jspx_th_c_set_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_26);
    _jspx_th_c_set_42.setVar("tdClass");
    _jspx_th_c_set_42.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_42 = _jspx_th_c_set_42.doStartTag();
    if (_jspx_th_c_set_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_42);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_26, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_26 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_26.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_26);
    int _jspx_eval_c_otherwise_26 = _jspx_th_c_otherwise_26.doStartTag();
    if (_jspx_eval_c_otherwise_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_43(_jspx_th_c_otherwise_26, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_26);
    return false;
  }

  private boolean _jspx_meth_c_set_43(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_26, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_43 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_43.setPageContext(_jspx_page_context);
    _jspx_th_c_set_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_26);
    _jspx_th_c_set_43.setVar("tdClass");
    _jspx_th_c_set_43.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_43 = _jspx_th_c_set_43.doStartTag();
    if (_jspx_th_c_set_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_43);
    return false;
  }

  private boolean _jspx_meth_c_out_150(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_150 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_150.setPageContext(_jspx_page_context);
    _jspx_th_c_out_150.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_13);
    _jspx_th_c_out_150.setValue("${tdClass}");
    int _jspx_eval_c_out_150 = _jspx_th_c_out_150.doStartTag();
    if (_jspx_th_c_out_150.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_150);
    return false;
  }

  private boolean _jspx_meth_c_choose_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_27 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_27.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_13);
    int _jspx_eval_c_choose_27 = _jspx_th_c_choose_27.doStartTag();
    if (_jspx_eval_c_choose_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_when_27(_jspx_th_c_choose_27, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_27(_jspx_th_c_choose_27, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_27);
    return false;
  }

  private boolean _jspx_meth_c_when_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_27, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_27 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_27.setPageContext(_jspx_page_context);
    _jspx_th_c_when_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_27);
    _jspx_th_c_when_27.setTest("${empty cd.viralVector}");
    int _jspx_eval_c_when_27 = _jspx_th_c_when_27.doStartTag();
    if (_jspx_eval_c_when_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_73(_jspx_th_c_when_27, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_27);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_73(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_27, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_73 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_73.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_73.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_27);
    int _jspx_eval_camod_highlight_73 = _jspx_th_camod_highlight_73.doStartTag();
    if (_jspx_eval_camod_highlight_73 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_73 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_13[0]++;
        _jspx_th_camod_highlight_73.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_73.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_151(_jspx_th_camod_highlight_73, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_73.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_73 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_13[0]--;
    }
    if (_jspx_th_camod_highlight_73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_73);
    return false;
  }

  private boolean _jspx_meth_c_out_151(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_73, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_151 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_151.setPageContext(_jspx_page_context);
    _jspx_th_c_out_151.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_73);
    _jspx_th_c_out_151.setValue("${cd.viralVectorAlternEntry}");
    _jspx_th_c_out_151.setEscapeXml("false");
    int _jspx_eval_c_out_151 = _jspx_th_c_out_151.doStartTag();
    if (_jspx_th_c_out_151.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_151);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_27, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_27 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_27.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_27);
    int _jspx_eval_c_otherwise_27 = _jspx_th_c_otherwise_27.doStartTag();
    if (_jspx_eval_c_otherwise_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_74(_jspx_th_c_otherwise_27, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_27);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_74(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_27, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_74 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_74.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_74.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_27);
    int _jspx_eval_camod_highlight_74 = _jspx_th_camod_highlight_74.doStartTag();
    if (_jspx_eval_camod_highlight_74 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_74 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_13[0]++;
        _jspx_th_camod_highlight_74.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_74.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_152(_jspx_th_camod_highlight_74, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_74.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_74 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_13[0]--;
    }
    if (_jspx_th_camod_highlight_74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_74);
    return false;
  }

  private boolean _jspx_meth_c_out_152(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_74, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_152 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_152.setPageContext(_jspx_page_context);
    _jspx_th_c_out_152.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_74);
    _jspx_th_c_out_152.setValue("${cd.viralVector}");
    _jspx_th_c_out_152.setEscapeXml("false");
    int _jspx_eval_c_out_152 = _jspx_th_c_out_152.doStartTag();
    if (_jspx_th_c_out_152.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_152);
    return false;
  }

  private boolean _jspx_meth_c_out_153(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_153 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_153.setPageContext(_jspx_page_context);
    _jspx_th_c_out_153.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_13);
    _jspx_th_c_out_153.setValue("${tdClass}");
    int _jspx_eval_c_out_153 = _jspx_th_c_out_153.doStartTag();
    if (_jspx_th_c_out_153.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_153);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_75(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_75 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_75.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_75.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_13);
    int _jspx_eval_camod_highlight_75 = _jspx_th_camod_highlight_75.doStartTag();
    if (_jspx_eval_camod_highlight_75 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_75 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_13[0]++;
        _jspx_th_camod_highlight_75.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_75.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_154(_jspx_th_camod_highlight_75, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_75.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_75 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_13[0]--;
    }
    if (_jspx_th_camod_highlight_75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_75);
    return false;
  }

  private boolean _jspx_meth_c_out_154(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_75, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_154 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_154.setPageContext(_jspx_page_context);
    _jspx_th_c_out_154.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_75);
    _jspx_th_c_out_154.setValue("${cd.geneInVirus}");
    _jspx_th_c_out_154.setEscapeXml("false");
    int _jspx_eval_c_out_154 = _jspx_th_c_out_154.doStartTag();
    if (_jspx_th_c_out_154.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_154);
    return false;
  }

  private boolean _jspx_meth_c_out_155(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_155 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_155.setPageContext(_jspx_page_context);
    _jspx_th_c_out_155.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_13);
    _jspx_th_c_out_155.setValue("${tdClass}");
    int _jspx_eval_c_out_155 = _jspx_th_c_out_155.doStartTag();
    if (_jspx_th_c_out_155.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_155);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_76(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_76 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_76.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_76.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_13);
    int _jspx_eval_camod_highlight_76 = _jspx_th_camod_highlight_76.doStartTag();
    if (_jspx_eval_camod_highlight_76 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_76 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_13[0]++;
        _jspx_th_camod_highlight_76.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_76.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_156(_jspx_th_camod_highlight_76, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_76.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_76 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_13[0]--;
    }
    if (_jspx_th_camod_highlight_76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_76);
    return false;
  }

  private boolean _jspx_meth_c_out_156(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_76, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_156 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_156.setPageContext(_jspx_page_context);
    _jspx_th_c_out_156.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_76);
    _jspx_th_c_out_156.setValue("${cd.organ.EVSPreferredDescription}");
    _jspx_th_c_out_156.setEscapeXml("false");
    int _jspx_eval_c_out_156 = _jspx_th_c_out_156.doStartTag();
    if (_jspx_th_c_out_156.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_156);
    return false;
  }

  private boolean _jspx_meth_c_out_157(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_157 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_157.setPageContext(_jspx_page_context);
    _jspx_th_c_out_157.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_13);
    _jspx_th_c_out_157.setValue("${tdClass}");
    int _jspx_eval_c_out_157 = _jspx_th_c_out_157.doStartTag();
    if (_jspx_th_c_out_157.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_157);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_77(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_77 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_77.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_77.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_13);
    int _jspx_eval_camod_highlight_77 = _jspx_th_camod_highlight_77.doStartTag();
    if (_jspx_eval_camod_highlight_77 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_77 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_13[0]++;
        _jspx_th_camod_highlight_77.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_77.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_158(_jspx_th_camod_highlight_77, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_77.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_77 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_13[0]--;
    }
    if (_jspx_th_camod_highlight_77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_77);
    return false;
  }

  private boolean _jspx_meth_c_out_158(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_77, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_158 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_158.setPageContext(_jspx_page_context);
    _jspx_th_c_out_158.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_77);
    _jspx_th_c_out_158.setValue("${cd.treatment.regimen}");
    _jspx_th_c_out_158.setEscapeXml("false");
    int _jspx_eval_c_out_158 = _jspx_th_c_out_158.doStartTag();
    if (_jspx_th_c_out_158.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_158);
    return false;
  }

  private boolean _jspx_meth_c_out_159(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_159 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_159.setPageContext(_jspx_page_context);
    _jspx_th_c_out_159.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_13);
    _jspx_th_c_out_159.setValue("${tdClass}");
    int _jspx_eval_c_out_159 = _jspx_th_c_out_159.doStartTag();
    if (_jspx_th_c_out_159.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_159);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_78(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_78 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_78.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_78.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_13);
    int _jspx_eval_camod_highlight_78 = _jspx_th_camod_highlight_78.doStartTag();
    if (_jspx_eval_camod_highlight_78 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_78 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_13[0]++;
        _jspx_th_camod_highlight_78.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_78.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_160(_jspx_th_camod_highlight_78, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_161(_jspx_th_camod_highlight_78, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_78.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_78 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_13[0]--;
    }
    if (_jspx_th_camod_highlight_78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_78);
    return false;
  }

  private boolean _jspx_meth_c_out_160(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_78, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_160 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_160.setPageContext(_jspx_page_context);
    _jspx_th_c_out_160.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_78);
    _jspx_th_c_out_160.setValue("${cd.treatment.ageAtTreatment}");
    _jspx_th_c_out_160.setEscapeXml("false");
    int _jspx_eval_c_out_160 = _jspx_th_c_out_160.doStartTag();
    if (_jspx_th_c_out_160.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_160);
    return false;
  }

  private boolean _jspx_meth_c_out_161(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_78, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_161 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_161.setPageContext(_jspx_page_context);
    _jspx_th_c_out_161.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_78);
    _jspx_th_c_out_161.setValue("${cd.treatment.ageAtTreatmentUnit}");
    _jspx_th_c_out_161.setEscapeXml("false");
    int _jspx_eval_c_out_161 = _jspx_th_c_out_161.doStartTag();
    if (_jspx_th_c_out_161.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_161);
    return false;
  }

  private boolean _jspx_meth_c_out_162(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_162 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_162.setPageContext(_jspx_page_context);
    _jspx_th_c_out_162.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_13);
    _jspx_th_c_out_162.setValue("${tdClass}");
    int _jspx_eval_c_out_162 = _jspx_th_c_out_162.doStartTag();
    if (_jspx_th_c_out_162.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_162);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_79(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_79 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_79.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_79.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_13);
    int _jspx_eval_camod_highlight_79 = _jspx_th_camod_highlight_79.doStartTag();
    if (_jspx_eval_camod_highlight_79 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_79 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_13[0]++;
        _jspx_th_camod_highlight_79.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_79.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_163(_jspx_th_camod_highlight_79, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_79.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_79 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_13[0]--;
    }
    if (_jspx_th_camod_highlight_79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_79);
    return false;
  }

  private boolean _jspx_meth_c_out_163(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_79, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_163 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_163.setPageContext(_jspx_page_context);
    _jspx_th_c_out_163.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_79);
    _jspx_th_c_out_163.setValue("${cd.treatment.sexDistribution.type}");
    _jspx_th_c_out_163.setEscapeXml("false");
    int _jspx_eval_c_out_163 = _jspx_th_c_out_163.doStartTag();
    if (_jspx_th_c_out_163.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_163);
    return false;
  }

  private boolean _jspx_meth_c_out_164(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_164 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_164.setPageContext(_jspx_page_context);
    _jspx_th_c_out_164.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_13);
    _jspx_th_c_out_164.setValue("${tdClass}");
    int _jspx_eval_c_out_164 = _jspx_th_c_out_164.doStartTag();
    if (_jspx_th_c_out_164.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_164);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_80(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_80 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_80.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_80.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_13);
    int _jspx_eval_camod_highlight_80 = _jspx_th_camod_highlight_80.doStartTag();
    if (_jspx_eval_camod_highlight_80 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_80 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_13[0]++;
        _jspx_th_camod_highlight_80.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_80.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_165(_jspx_th_camod_highlight_80, _jspx_page_context, _jspx_push_body_count_c_forEach_13))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_80.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_80 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_13[0]--;
    }
    if (_jspx_th_camod_highlight_80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_80);
    return false;
  }

  private boolean _jspx_meth_c_out_165(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_80, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_165 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_165.setPageContext(_jspx_page_context);
    _jspx_th_c_out_165.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_80);
    _jspx_th_c_out_165.setValue("${cd.comments}");
    _jspx_th_c_out_165.setEscapeXml("false");
    int _jspx_eval_c_out_165 = _jspx_th_c_out_165.doStartTag();
    if (_jspx_th_c_out_165.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_165);
    return false;
  }

  private boolean _jspx_meth_c_set_44(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_44 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_44.setPageContext(_jspx_page_context);
    _jspx_th_c_set_44.setParent(null);
    _jspx_th_c_set_44.setVar("environmentalFactorType");
    _jspx_th_c_set_44.setValue("Nutrition");
    int _jspx_eval_c_set_44 = _jspx_th_c_set_44.doStartTag();
    if (_jspx_th_c_set_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_44);
    return false;
  }

  private boolean _jspx_meth_c_set_45(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_45 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_45.setPageContext(_jspx_page_context);
    _jspx_th_c_set_45.setParent(null);
    _jspx_th_c_set_45.setVar("cdList");
    _jspx_th_c_set_45.setValue("${carcinogenicInterventionColl[environmentalFactorType]}");
    int _jspx_eval_c_set_45 = _jspx_th_c_set_45.doStartTag();
    if (_jspx_th_c_set_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_45);
    return false;
  }

  private boolean _jspx_meth_c_if_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_23 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_23.setPageContext(_jspx_page_context);
    _jspx_th_c_if_23.setParent(null);
    _jspx_th_c_if_23.setTest("${not empty cdList}");
    int _jspx_eval_c_if_23 = _jspx_th_c_if_23.doStartTag();
    if (_jspx_eval_c_if_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"1\" align=\"center\" width=\"100%\">\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"formTitleBlue\" height=\"20\" colspan=\"6\">Nutrition</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"20%\">Nutritional Component / Diet</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"20%\">Dose</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"20%\">Treatment Regimen</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"20%\">Age at Treatment</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"20%\">Gender</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitle\" width=\"17%\">Comment</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_14(_jspx_th_c_if_23, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</TABLE>\r\n");
        out.write("\t\t\t<br>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_23);
    return false;
  }

  private boolean _jspx_meth_c_forEach_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_14 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_14.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_23);
    _jspx_th_c_forEach_14.setVar("cd");
    _jspx_th_c_forEach_14.setItems("${cdList}");
    _jspx_th_c_forEach_14.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_14 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_14 = _jspx_th_c_forEach_14.doStartTag();
      if (_jspx_eval_c_forEach_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_28(_jspx_th_c_forEach_14, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
            return true;
          out.write("&nbsp;\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_166(_jspx_th_c_forEach_14, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_choose_29(_jspx_th_c_forEach_14, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
            return true;
          out.write("&nbsp;\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_169(_jspx_th_c_forEach_14, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_83(_jspx_th_c_forEach_14, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_172(_jspx_th_c_forEach_14, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_84(_jspx_th_c_forEach_14, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_174(_jspx_th_c_forEach_14, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_85(_jspx_th_c_forEach_14, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_177(_jspx_th_c_forEach_14, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_86(_jspx_th_c_forEach_14, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_179(_jspx_th_c_forEach_14, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
            return true;
          out.write("End\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_87(_jspx_th_c_forEach_14, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\t\t\t\t\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_14.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_14[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_14.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_14.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_14);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_28 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_28.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_14);
    int _jspx_eval_c_choose_28 = _jspx_th_c_choose_28.doStartTag();
    if (_jspx_eval_c_choose_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_28(_jspx_th_c_choose_28, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_28(_jspx_th_c_choose_28, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_28);
    return false;
  }

  private boolean _jspx_meth_c_when_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_28, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_28 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_28.setPageContext(_jspx_page_context);
    _jspx_th_c_when_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_28);
    _jspx_th_c_when_28.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_28 = _jspx_th_c_when_28.doStartTag();
    if (_jspx_eval_c_when_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_46(_jspx_th_c_when_28, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_28);
    return false;
  }

  private boolean _jspx_meth_c_set_46(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_28, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_46 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_46.setPageContext(_jspx_page_context);
    _jspx_th_c_set_46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_28);
    _jspx_th_c_set_46.setVar("tdClass");
    _jspx_th_c_set_46.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_46 = _jspx_th_c_set_46.doStartTag();
    if (_jspx_th_c_set_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_46);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_28, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_28 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_28.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_28);
    int _jspx_eval_c_otherwise_28 = _jspx_th_c_otherwise_28.doStartTag();
    if (_jspx_eval_c_otherwise_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_47(_jspx_th_c_otherwise_28, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_28);
    return false;
  }

  private boolean _jspx_meth_c_set_47(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_28, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_47 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_47.setPageContext(_jspx_page_context);
    _jspx_th_c_set_47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_28);
    _jspx_th_c_set_47.setVar("tdClass");
    _jspx_th_c_set_47.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_47 = _jspx_th_c_set_47.doStartTag();
    if (_jspx_th_c_set_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_47);
    return false;
  }

  private boolean _jspx_meth_c_out_166(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_166 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_166.setPageContext(_jspx_page_context);
    _jspx_th_c_out_166.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_14);
    _jspx_th_c_out_166.setValue("${tdClass}");
    int _jspx_eval_c_out_166 = _jspx_th_c_out_166.doStartTag();
    if (_jspx_th_c_out_166.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_166);
    return false;
  }

  private boolean _jspx_meth_c_choose_29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_29 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_29.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_14);
    int _jspx_eval_c_choose_29 = _jspx_th_c_choose_29.doStartTag();
    if (_jspx_eval_c_choose_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_when_29(_jspx_th_c_choose_29, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_29(_jspx_th_c_choose_29, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_29);
    return false;
  }

  private boolean _jspx_meth_c_when_29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_29, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_29 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_29.setPageContext(_jspx_page_context);
    _jspx_th_c_when_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_29);
    _jspx_th_c_when_29.setTest("${empty cd.environmentalFactor.name}");
    int _jspx_eval_c_when_29 = _jspx_th_c_when_29.doStartTag();
    if (_jspx_eval_c_when_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_81(_jspx_th_c_when_29, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_29);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_81(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_29, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_81 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_81.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_81.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_29);
    int _jspx_eval_camod_highlight_81 = _jspx_th_camod_highlight_81.doStartTag();
    if (_jspx_eval_camod_highlight_81 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_81 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_14[0]++;
        _jspx_th_camod_highlight_81.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_81.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_167(_jspx_th_camod_highlight_81, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_81.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_81 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_14[0]--;
    }
    if (_jspx_th_camod_highlight_81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_81);
    return false;
  }

  private boolean _jspx_meth_c_out_167(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_81, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_167 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_167.setPageContext(_jspx_page_context);
    _jspx_th_c_out_167.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_81);
    _jspx_th_c_out_167.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_167.setEscapeXml("false");
    int _jspx_eval_c_out_167 = _jspx_th_c_out_167.doStartTag();
    if (_jspx_th_c_out_167.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_167);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_29, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_29 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_29.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_29);
    int _jspx_eval_c_otherwise_29 = _jspx_th_c_otherwise_29.doStartTag();
    if (_jspx_eval_c_otherwise_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_camod_highlight_82(_jspx_th_c_otherwise_29, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_29);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_82(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_29, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_82 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_82.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_82.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_29);
    int _jspx_eval_camod_highlight_82 = _jspx_th_camod_highlight_82.doStartTag();
    if (_jspx_eval_camod_highlight_82 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_82 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_14[0]++;
        _jspx_th_camod_highlight_82.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_82.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_168(_jspx_th_camod_highlight_82, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_82.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_82 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_14[0]--;
    }
    if (_jspx_th_camod_highlight_82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_82);
    return false;
  }

  private boolean _jspx_meth_c_out_168(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_82, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_168 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_168.setPageContext(_jspx_page_context);
    _jspx_th_c_out_168.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_82);
    _jspx_th_c_out_168.setValue("${cd.environmentalFactor.name}");
    _jspx_th_c_out_168.setEscapeXml("false");
    int _jspx_eval_c_out_168 = _jspx_th_c_out_168.doStartTag();
    if (_jspx_th_c_out_168.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_168);
    return false;
  }

  private boolean _jspx_meth_c_out_169(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_169 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_169.setPageContext(_jspx_page_context);
    _jspx_th_c_out_169.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_14);
    _jspx_th_c_out_169.setValue("${tdClass}");
    int _jspx_eval_c_out_169 = _jspx_th_c_out_169.doStartTag();
    if (_jspx_th_c_out_169.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_169);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_83(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_83 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_83.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_83.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_14);
    int _jspx_eval_camod_highlight_83 = _jspx_th_camod_highlight_83.doStartTag();
    if (_jspx_eval_camod_highlight_83 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_83 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_14[0]++;
        _jspx_th_camod_highlight_83.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_83.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_170(_jspx_th_camod_highlight_83, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_171(_jspx_th_camod_highlight_83, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_83.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_83 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_14[0]--;
    }
    if (_jspx_th_camod_highlight_83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_83);
    return false;
  }

  private boolean _jspx_meth_c_out_170(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_83, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_170 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_170.setPageContext(_jspx_page_context);
    _jspx_th_c_out_170.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_83);
    _jspx_th_c_out_170.setValue("${cd.treatment.dosage}");
    _jspx_th_c_out_170.setEscapeXml("false");
    int _jspx_eval_c_out_170 = _jspx_th_c_out_170.doStartTag();
    if (_jspx_th_c_out_170.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_170);
    return false;
  }

  private boolean _jspx_meth_c_out_171(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_83, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_171 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_171.setPageContext(_jspx_page_context);
    _jspx_th_c_out_171.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_83);
    _jspx_th_c_out_171.setValue("${cd.treatment.dosageUnit}");
    _jspx_th_c_out_171.setEscapeXml("false");
    int _jspx_eval_c_out_171 = _jspx_th_c_out_171.doStartTag();
    if (_jspx_th_c_out_171.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_171);
    return false;
  }

  private boolean _jspx_meth_c_out_172(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_172 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_172.setPageContext(_jspx_page_context);
    _jspx_th_c_out_172.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_14);
    _jspx_th_c_out_172.setValue("${tdClass}");
    int _jspx_eval_c_out_172 = _jspx_th_c_out_172.doStartTag();
    if (_jspx_th_c_out_172.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_172);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_84(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_84 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_84.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_84.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_14);
    int _jspx_eval_camod_highlight_84 = _jspx_th_camod_highlight_84.doStartTag();
    if (_jspx_eval_camod_highlight_84 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_84 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_14[0]++;
        _jspx_th_camod_highlight_84.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_84.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_173(_jspx_th_camod_highlight_84, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_84.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_84 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_14[0]--;
    }
    if (_jspx_th_camod_highlight_84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_84);
    return false;
  }

  private boolean _jspx_meth_c_out_173(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_84, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_173 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_173.setPageContext(_jspx_page_context);
    _jspx_th_c_out_173.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_84);
    _jspx_th_c_out_173.setValue("${cd.treatment.regimen}");
    _jspx_th_c_out_173.setEscapeXml("false");
    int _jspx_eval_c_out_173 = _jspx_th_c_out_173.doStartTag();
    if (_jspx_th_c_out_173.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_173);
    return false;
  }

  private boolean _jspx_meth_c_out_174(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_174 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_174.setPageContext(_jspx_page_context);
    _jspx_th_c_out_174.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_14);
    _jspx_th_c_out_174.setValue("${tdClass}");
    int _jspx_eval_c_out_174 = _jspx_th_c_out_174.doStartTag();
    if (_jspx_th_c_out_174.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_174);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_85(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_85 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_85.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_85.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_14);
    int _jspx_eval_camod_highlight_85 = _jspx_th_camod_highlight_85.doStartTag();
    if (_jspx_eval_camod_highlight_85 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_85 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_14[0]++;
        _jspx_th_camod_highlight_85.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_85.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_175(_jspx_th_camod_highlight_85, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_out_176(_jspx_th_camod_highlight_85, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_85.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_85 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_14[0]--;
    }
    if (_jspx_th_camod_highlight_85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_85);
    return false;
  }

  private boolean _jspx_meth_c_out_175(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_85, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_175 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_175.setPageContext(_jspx_page_context);
    _jspx_th_c_out_175.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_85);
    _jspx_th_c_out_175.setValue("${cd.treatment.ageAtTreatment}");
    _jspx_th_c_out_175.setEscapeXml("false");
    int _jspx_eval_c_out_175 = _jspx_th_c_out_175.doStartTag();
    if (_jspx_th_c_out_175.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_175);
    return false;
  }

  private boolean _jspx_meth_c_out_176(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_85, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_176 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_176.setPageContext(_jspx_page_context);
    _jspx_th_c_out_176.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_85);
    _jspx_th_c_out_176.setValue("${cd.treatment.ageAtTreatmentUnit}");
    _jspx_th_c_out_176.setEscapeXml("false");
    int _jspx_eval_c_out_176 = _jspx_th_c_out_176.doStartTag();
    if (_jspx_th_c_out_176.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_176);
    return false;
  }

  private boolean _jspx_meth_c_out_177(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_177 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_177.setPageContext(_jspx_page_context);
    _jspx_th_c_out_177.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_14);
    _jspx_th_c_out_177.setValue("${tdClass}");
    int _jspx_eval_c_out_177 = _jspx_th_c_out_177.doStartTag();
    if (_jspx_th_c_out_177.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_177);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_86(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_86 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_86.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_86.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_14);
    int _jspx_eval_camod_highlight_86 = _jspx_th_camod_highlight_86.doStartTag();
    if (_jspx_eval_camod_highlight_86 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_86 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_14[0]++;
        _jspx_th_camod_highlight_86.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_86.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_178(_jspx_th_camod_highlight_86, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_86.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_86 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_14[0]--;
    }
    if (_jspx_th_camod_highlight_86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_86);
    return false;
  }

  private boolean _jspx_meth_c_out_178(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_86, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_178 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_178.setPageContext(_jspx_page_context);
    _jspx_th_c_out_178.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_86);
    _jspx_th_c_out_178.setValue("${cd.treatment.sexDistribution.type}");
    _jspx_th_c_out_178.setEscapeXml("false");
    int _jspx_eval_c_out_178 = _jspx_th_c_out_178.doStartTag();
    if (_jspx_th_c_out_178.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_178);
    return false;
  }

  private boolean _jspx_meth_c_out_179(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_179 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_179.setPageContext(_jspx_page_context);
    _jspx_th_c_out_179.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_14);
    _jspx_th_c_out_179.setValue("${tdClass}");
    int _jspx_eval_c_out_179 = _jspx_th_c_out_179.doStartTag();
    if (_jspx_th_c_out_179.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_179);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_87(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_87 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_87.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_87.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_14);
    int _jspx_eval_camod_highlight_87 = _jspx_th_camod_highlight_87.doStartTag();
    if (_jspx_eval_camod_highlight_87 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_87 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_14[0]++;
        _jspx_th_camod_highlight_87.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_87.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_180(_jspx_th_camod_highlight_87, _jspx_page_context, _jspx_push_body_count_c_forEach_14))
          return true;
        out.write("&nbsp;");
        int evalDoAfterBody = _jspx_th_camod_highlight_87.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_87 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_14[0]--;
    }
    if (_jspx_th_camod_highlight_87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_87);
    return false;
  }

  private boolean _jspx_meth_c_out_180(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_87, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_180 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_180.setPageContext(_jspx_page_context);
    _jspx_th_c_out_180.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_87);
    _jspx_th_c_out_180.setValue("${cd.environmentalFactor.comments}");
    _jspx_th_c_out_180.setEscapeXml("false");
    int _jspx_eval_c_out_180 = _jspx_th_c_out_180.doStartTag();
    if (_jspx_th_c_out_180.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_180);
    return false;
  }

  private boolean _jspx_meth_c_set_48(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_48 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_48.setPageContext(_jspx_page_context);
    _jspx_th_c_set_48.setParent(null);
    _jspx_th_c_set_48.setVar("environmentalFactorType");
    _jspx_th_c_set_48.setValue("Antibody");
    int _jspx_eval_c_set_48 = _jspx_th_c_set_48.doStartTag();
    if (_jspx_th_c_set_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_48);
    return false;
  }

  private boolean _jspx_meth_c_set_49(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_49 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_49.setPageContext(_jspx_page_context);
    _jspx_th_c_set_49.setParent(null);
    _jspx_th_c_set_49.setVar("cdList");
    _jspx_th_c_set_49.setValue("${carcinogenicInterventionColl[environmentalFactorType]}");
    int _jspx_eval_c_set_49 = _jspx_th_c_set_49.doStartTag();
    if (_jspx_th_c_set_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_49);
    return false;
  }

  private boolean _jspx_meth_c_if_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_24 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_24.setPageContext(_jspx_page_context);
    _jspx_th_c_if_24.setParent(null);
    _jspx_th_c_if_24.setTest("${not empty cdList}");
    int _jspx_eval_c_if_24 = _jspx_th_c_if_24.doStartTag();
    if (_jspx_eval_c_if_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"1\" align=\"center\" width=\"100%\">\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"formTitleBlue\" height=\"20\" colspan=\"7\">Antibody</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Type</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Name</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_15(_jspx_th_c_if_24, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</TABLE>\r\n");
        out.write("\t\t\t<br>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_24);
    return false;
  }

  private boolean _jspx_meth_c_forEach_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_15 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_15.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_24);
    _jspx_th_c_forEach_15.setVar("cd");
    _jspx_th_c_forEach_15.setItems("${cdList}");
    _jspx_th_c_forEach_15.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_15 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_15 = _jspx_th_c_forEach_15.doStartTag();
      if (_jspx_eval_c_forEach_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_30(_jspx_th_c_forEach_15, _jspx_page_context, _jspx_push_body_count_c_forEach_15))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_181(_jspx_th_c_forEach_15, _jspx_page_context, _jspx_push_body_count_c_forEach_15))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_88(_jspx_th_c_forEach_15, _jspx_page_context, _jspx_push_body_count_c_forEach_15))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_183(_jspx_th_c_forEach_15, _jspx_page_context, _jspx_push_body_count_c_forEach_15))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_89(_jspx_th_c_forEach_15, _jspx_page_context, _jspx_push_body_count_c_forEach_15))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_15.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_15[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_15.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_15.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_15);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_30 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_30.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_15);
    int _jspx_eval_c_choose_30 = _jspx_th_c_choose_30.doStartTag();
    if (_jspx_eval_c_choose_30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_30(_jspx_th_c_choose_30, _jspx_page_context, _jspx_push_body_count_c_forEach_15))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_30(_jspx_th_c_choose_30, _jspx_page_context, _jspx_push_body_count_c_forEach_15))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_30.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_30);
    return false;
  }

  private boolean _jspx_meth_c_when_30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_30, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_30 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_30.setPageContext(_jspx_page_context);
    _jspx_th_c_when_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_30);
    _jspx_th_c_when_30.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_30 = _jspx_th_c_when_30.doStartTag();
    if (_jspx_eval_c_when_30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_50(_jspx_th_c_when_30, _jspx_page_context, _jspx_push_body_count_c_forEach_15))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_30.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_30);
    return false;
  }

  private boolean _jspx_meth_c_set_50(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_30, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_50 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_50.setPageContext(_jspx_page_context);
    _jspx_th_c_set_50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_30);
    _jspx_th_c_set_50.setVar("tdClass");
    _jspx_th_c_set_50.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_50 = _jspx_th_c_set_50.doStartTag();
    if (_jspx_th_c_set_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_50);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_30, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_30 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_30.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_30);
    int _jspx_eval_c_otherwise_30 = _jspx_th_c_otherwise_30.doStartTag();
    if (_jspx_eval_c_otherwise_30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_51(_jspx_th_c_otherwise_30, _jspx_page_context, _jspx_push_body_count_c_forEach_15))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_30.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_30);
    return false;
  }

  private boolean _jspx_meth_c_set_51(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_30, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_51 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_51.setPageContext(_jspx_page_context);
    _jspx_th_c_set_51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_30);
    _jspx_th_c_set_51.setVar("tdClass");
    _jspx_th_c_set_51.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_51 = _jspx_th_c_set_51.doStartTag();
    if (_jspx_th_c_set_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_51);
    return false;
  }

  private boolean _jspx_meth_c_out_181(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_181 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_181.setPageContext(_jspx_page_context);
    _jspx_th_c_out_181.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_15);
    _jspx_th_c_out_181.setValue("${tdClass}");
    int _jspx_eval_c_out_181 = _jspx_th_c_out_181.doStartTag();
    if (_jspx_th_c_out_181.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_181);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_88(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_88 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_88.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_88.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_15);
    int _jspx_eval_camod_highlight_88 = _jspx_th_camod_highlight_88.doStartTag();
    if (_jspx_eval_camod_highlight_88 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_88 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_15[0]++;
        _jspx_th_camod_highlight_88.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_88.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_182(_jspx_th_camod_highlight_88, _jspx_page_context, _jspx_push_body_count_c_forEach_15))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_88.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_88 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_15[0]--;
    }
    if (_jspx_th_camod_highlight_88.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_88);
    return false;
  }

  private boolean _jspx_meth_c_out_182(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_88, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_182 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_182.setPageContext(_jspx_page_context);
    _jspx_th_c_out_182.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_88);
    _jspx_th_c_out_182.setValue("${cd.environmentalFactor.typeAlternEntry}");
    _jspx_th_c_out_182.setEscapeXml("false");
    int _jspx_eval_c_out_182 = _jspx_th_c_out_182.doStartTag();
    if (_jspx_th_c_out_182.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_182);
    return false;
  }

  private boolean _jspx_meth_c_out_183(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_183 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_183.setPageContext(_jspx_page_context);
    _jspx_th_c_out_183.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_15);
    _jspx_th_c_out_183.setValue("${tdClass}");
    int _jspx_eval_c_out_183 = _jspx_th_c_out_183.doStartTag();
    if (_jspx_th_c_out_183.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_183);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_89(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_89 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_89.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_89.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_15);
    int _jspx_eval_camod_highlight_89 = _jspx_th_camod_highlight_89.doStartTag();
    if (_jspx_eval_camod_highlight_89 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_89 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_15[0]++;
        _jspx_th_camod_highlight_89.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_89.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_184(_jspx_th_camod_highlight_89, _jspx_page_context, _jspx_push_body_count_c_forEach_15))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_89.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_89 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_15[0]--;
    }
    if (_jspx_th_camod_highlight_89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_89);
    return false;
  }

  private boolean _jspx_meth_c_out_184(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_89, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_184 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_184.setPageContext(_jspx_page_context);
    _jspx_th_c_out_184.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_89);
    _jspx_th_c_out_184.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_184.setEscapeXml("false");
    int _jspx_eval_c_out_184 = _jspx_th_c_out_184.doStartTag();
    if (_jspx_th_c_out_184.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_184);
    return false;
  }

  private boolean _jspx_meth_c_set_52(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_52 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_52.setPageContext(_jspx_page_context);
    _jspx_th_c_set_52.setParent(null);
    _jspx_th_c_set_52.setVar("environmentalFactorType");
    _jspx_th_c_set_52.setValue("Bacteria");
    int _jspx_eval_c_set_52 = _jspx_th_c_set_52.doStartTag();
    if (_jspx_th_c_set_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_52);
    return false;
  }

  private boolean _jspx_meth_c_set_53(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_53 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_53.setPageContext(_jspx_page_context);
    _jspx_th_c_set_53.setParent(null);
    _jspx_th_c_set_53.setVar("cdList");
    _jspx_th_c_set_53.setValue("${carcinogenicInterventionColl[environmentalFactorType]}");
    int _jspx_eval_c_set_53 = _jspx_th_c_set_53.doStartTag();
    if (_jspx_th_c_set_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_53);
    return false;
  }

  private boolean _jspx_meth_c_if_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_25 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_25.setPageContext(_jspx_page_context);
    _jspx_th_c_if_25.setParent(null);
    _jspx_th_c_if_25.setTest("${not empty cdList}");
    int _jspx_eval_c_if_25 = _jspx_th_c_if_25.doStartTag();
    if (_jspx_eval_c_if_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"1\" align=\"center\" width=\"100%\">\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"formTitleBlue\" height=\"20\" colspan=\"7\">Bacteria</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Type</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Name</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_16(_jspx_th_c_if_25, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</TABLE>\r\n");
        out.write("\t\t\t<br>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_25);
    return false;
  }

  private boolean _jspx_meth_c_forEach_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_16 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_16.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_25);
    _jspx_th_c_forEach_16.setVar("cd");
    _jspx_th_c_forEach_16.setItems("${cdList}");
    _jspx_th_c_forEach_16.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_16 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_16 = _jspx_th_c_forEach_16.doStartTag();
      if (_jspx_eval_c_forEach_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_31(_jspx_th_c_forEach_16, _jspx_page_context, _jspx_push_body_count_c_forEach_16))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_185(_jspx_th_c_forEach_16, _jspx_page_context, _jspx_push_body_count_c_forEach_16))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_90(_jspx_th_c_forEach_16, _jspx_page_context, _jspx_push_body_count_c_forEach_16))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_187(_jspx_th_c_forEach_16, _jspx_page_context, _jspx_push_body_count_c_forEach_16))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_91(_jspx_th_c_forEach_16, _jspx_page_context, _jspx_push_body_count_c_forEach_16))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_16.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_16[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_16.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_16.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_16);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_31 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_31.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_16);
    int _jspx_eval_c_choose_31 = _jspx_th_c_choose_31.doStartTag();
    if (_jspx_eval_c_choose_31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_31(_jspx_th_c_choose_31, _jspx_page_context, _jspx_push_body_count_c_forEach_16))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_31(_jspx_th_c_choose_31, _jspx_page_context, _jspx_push_body_count_c_forEach_16))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_31.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_31);
    return false;
  }

  private boolean _jspx_meth_c_when_31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_31, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_31 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_31.setPageContext(_jspx_page_context);
    _jspx_th_c_when_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_31);
    _jspx_th_c_when_31.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_31 = _jspx_th_c_when_31.doStartTag();
    if (_jspx_eval_c_when_31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_54(_jspx_th_c_when_31, _jspx_page_context, _jspx_push_body_count_c_forEach_16))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_31.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_31);
    return false;
  }

  private boolean _jspx_meth_c_set_54(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_31, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_54 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_54.setPageContext(_jspx_page_context);
    _jspx_th_c_set_54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_31);
    _jspx_th_c_set_54.setVar("tdClass");
    _jspx_th_c_set_54.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_54 = _jspx_th_c_set_54.doStartTag();
    if (_jspx_th_c_set_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_54);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_31, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_31 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_31.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_31);
    int _jspx_eval_c_otherwise_31 = _jspx_th_c_otherwise_31.doStartTag();
    if (_jspx_eval_c_otherwise_31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_55(_jspx_th_c_otherwise_31, _jspx_page_context, _jspx_push_body_count_c_forEach_16))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_31.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_31);
    return false;
  }

  private boolean _jspx_meth_c_set_55(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_31, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_55 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_55.setPageContext(_jspx_page_context);
    _jspx_th_c_set_55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_31);
    _jspx_th_c_set_55.setVar("tdClass");
    _jspx_th_c_set_55.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_55 = _jspx_th_c_set_55.doStartTag();
    if (_jspx_th_c_set_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_55);
    return false;
  }

  private boolean _jspx_meth_c_out_185(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_185 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_185.setPageContext(_jspx_page_context);
    _jspx_th_c_out_185.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_16);
    _jspx_th_c_out_185.setValue("${tdClass}");
    int _jspx_eval_c_out_185 = _jspx_th_c_out_185.doStartTag();
    if (_jspx_th_c_out_185.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_185);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_90(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_90 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_90.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_90.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_16);
    int _jspx_eval_camod_highlight_90 = _jspx_th_camod_highlight_90.doStartTag();
    if (_jspx_eval_camod_highlight_90 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_90 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_16[0]++;
        _jspx_th_camod_highlight_90.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_90.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_186(_jspx_th_camod_highlight_90, _jspx_page_context, _jspx_push_body_count_c_forEach_16))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_90.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_90 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_16[0]--;
    }
    if (_jspx_th_camod_highlight_90.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_90);
    return false;
  }

  private boolean _jspx_meth_c_out_186(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_90, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_186 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_186.setPageContext(_jspx_page_context);
    _jspx_th_c_out_186.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_90);
    _jspx_th_c_out_186.setValue("${cd.environmentalFactor.typeAlternEntry}");
    _jspx_th_c_out_186.setEscapeXml("false");
    int _jspx_eval_c_out_186 = _jspx_th_c_out_186.doStartTag();
    if (_jspx_th_c_out_186.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_186);
    return false;
  }

  private boolean _jspx_meth_c_out_187(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_187 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_187.setPageContext(_jspx_page_context);
    _jspx_th_c_out_187.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_16);
    _jspx_th_c_out_187.setValue("${tdClass}");
    int _jspx_eval_c_out_187 = _jspx_th_c_out_187.doStartTag();
    if (_jspx_th_c_out_187.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_187);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_91(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_91 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_91.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_91.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_16);
    int _jspx_eval_camod_highlight_91 = _jspx_th_camod_highlight_91.doStartTag();
    if (_jspx_eval_camod_highlight_91 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_91 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_16[0]++;
        _jspx_th_camod_highlight_91.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_91.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_188(_jspx_th_camod_highlight_91, _jspx_page_context, _jspx_push_body_count_c_forEach_16))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_91.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_91 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_16[0]--;
    }
    if (_jspx_th_camod_highlight_91.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_91);
    return false;
  }

  private boolean _jspx_meth_c_out_188(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_91, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_188 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_188.setPageContext(_jspx_page_context);
    _jspx_th_c_out_188.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_91);
    _jspx_th_c_out_188.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_188.setEscapeXml("false");
    int _jspx_eval_c_out_188 = _jspx_th_c_out_188.doStartTag();
    if (_jspx_th_c_out_188.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_188);
    return false;
  }

  private boolean _jspx_meth_c_set_56(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_56 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_56.setPageContext(_jspx_page_context);
    _jspx_th_c_set_56.setParent(null);
    _jspx_th_c_set_56.setVar("environmentalFactorType");
    _jspx_th_c_set_56.setValue("Plasmid");
    int _jspx_eval_c_set_56 = _jspx_th_c_set_56.doStartTag();
    if (_jspx_th_c_set_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_56);
    return false;
  }

  private boolean _jspx_meth_c_set_57(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_57 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_57.setPageContext(_jspx_page_context);
    _jspx_th_c_set_57.setParent(null);
    _jspx_th_c_set_57.setVar("cdList");
    _jspx_th_c_set_57.setValue("${carcinogenicInterventionColl[environmentalFactorType]}");
    int _jspx_eval_c_set_57 = _jspx_th_c_set_57.doStartTag();
    if (_jspx_th_c_set_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_57);
    return false;
  }

  private boolean _jspx_meth_c_if_26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_26 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_26.setPageContext(_jspx_page_context);
    _jspx_th_c_if_26.setParent(null);
    _jspx_th_c_if_26.setTest("${not empty cdList}");
    int _jspx_eval_c_if_26 = _jspx_th_c_if_26.doStartTag();
    if (_jspx_eval_c_if_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"1\" align=\"center\" width=\"100%\">\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"formTitleBlue\" height=\"20\" colspan=\"7\">Plasmid</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Type</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Name</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_17(_jspx_th_c_if_26, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</TABLE>\r\n");
        out.write("\t\t\t<br>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_26);
    return false;
  }

  private boolean _jspx_meth_c_forEach_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_17 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_17.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_26);
    _jspx_th_c_forEach_17.setVar("cd");
    _jspx_th_c_forEach_17.setItems("${cdList}");
    _jspx_th_c_forEach_17.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_17 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_17 = _jspx_th_c_forEach_17.doStartTag();
      if (_jspx_eval_c_forEach_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_32(_jspx_th_c_forEach_17, _jspx_page_context, _jspx_push_body_count_c_forEach_17))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_189(_jspx_th_c_forEach_17, _jspx_page_context, _jspx_push_body_count_c_forEach_17))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_92(_jspx_th_c_forEach_17, _jspx_page_context, _jspx_push_body_count_c_forEach_17))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_191(_jspx_th_c_forEach_17, _jspx_page_context, _jspx_push_body_count_c_forEach_17))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_93(_jspx_th_c_forEach_17, _jspx_page_context, _jspx_push_body_count_c_forEach_17))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_17.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_17[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_17.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_17.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_17);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_32 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_32.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_17);
    int _jspx_eval_c_choose_32 = _jspx_th_c_choose_32.doStartTag();
    if (_jspx_eval_c_choose_32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_32(_jspx_th_c_choose_32, _jspx_page_context, _jspx_push_body_count_c_forEach_17))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_32(_jspx_th_c_choose_32, _jspx_page_context, _jspx_push_body_count_c_forEach_17))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_32.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_32);
    return false;
  }

  private boolean _jspx_meth_c_when_32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_32, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_32 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_32.setPageContext(_jspx_page_context);
    _jspx_th_c_when_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_32);
    _jspx_th_c_when_32.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_32 = _jspx_th_c_when_32.doStartTag();
    if (_jspx_eval_c_when_32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_58(_jspx_th_c_when_32, _jspx_page_context, _jspx_push_body_count_c_forEach_17))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_32.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_32);
    return false;
  }

  private boolean _jspx_meth_c_set_58(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_32, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_58 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_58.setPageContext(_jspx_page_context);
    _jspx_th_c_set_58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_32);
    _jspx_th_c_set_58.setVar("tdClass");
    _jspx_th_c_set_58.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_58 = _jspx_th_c_set_58.doStartTag();
    if (_jspx_th_c_set_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_58);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_32, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_32 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_32.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_32);
    int _jspx_eval_c_otherwise_32 = _jspx_th_c_otherwise_32.doStartTag();
    if (_jspx_eval_c_otherwise_32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_59(_jspx_th_c_otherwise_32, _jspx_page_context, _jspx_push_body_count_c_forEach_17))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_32.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_32);
    return false;
  }

  private boolean _jspx_meth_c_set_59(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_32, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_59 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_59.setPageContext(_jspx_page_context);
    _jspx_th_c_set_59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_32);
    _jspx_th_c_set_59.setVar("tdClass");
    _jspx_th_c_set_59.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_59 = _jspx_th_c_set_59.doStartTag();
    if (_jspx_th_c_set_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_59);
    return false;
  }

  private boolean _jspx_meth_c_out_189(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_189 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_189.setPageContext(_jspx_page_context);
    _jspx_th_c_out_189.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_17);
    _jspx_th_c_out_189.setValue("${tdClass}");
    int _jspx_eval_c_out_189 = _jspx_th_c_out_189.doStartTag();
    if (_jspx_th_c_out_189.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_189);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_92(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_92 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_92.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_92.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_17);
    int _jspx_eval_camod_highlight_92 = _jspx_th_camod_highlight_92.doStartTag();
    if (_jspx_eval_camod_highlight_92 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_92 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_17[0]++;
        _jspx_th_camod_highlight_92.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_92.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_190(_jspx_th_camod_highlight_92, _jspx_page_context, _jspx_push_body_count_c_forEach_17))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_92.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_92 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_17[0]--;
    }
    if (_jspx_th_camod_highlight_92.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_92);
    return false;
  }

  private boolean _jspx_meth_c_out_190(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_92, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_190 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_190.setPageContext(_jspx_page_context);
    _jspx_th_c_out_190.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_92);
    _jspx_th_c_out_190.setValue("${cd.environmentalFactor.typeAlternEntry}");
    _jspx_th_c_out_190.setEscapeXml("false");
    int _jspx_eval_c_out_190 = _jspx_th_c_out_190.doStartTag();
    if (_jspx_th_c_out_190.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_190);
    return false;
  }

  private boolean _jspx_meth_c_out_191(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_191 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_191.setPageContext(_jspx_page_context);
    _jspx_th_c_out_191.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_17);
    _jspx_th_c_out_191.setValue("${tdClass}");
    int _jspx_eval_c_out_191 = _jspx_th_c_out_191.doStartTag();
    if (_jspx_th_c_out_191.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_191);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_93(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_93 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_93.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_93.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_17);
    int _jspx_eval_camod_highlight_93 = _jspx_th_camod_highlight_93.doStartTag();
    if (_jspx_eval_camod_highlight_93 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_93 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_17[0]++;
        _jspx_th_camod_highlight_93.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_93.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_192(_jspx_th_camod_highlight_93, _jspx_page_context, _jspx_push_body_count_c_forEach_17))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_93.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_93 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_17[0]--;
    }
    if (_jspx_th_camod_highlight_93.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_93);
    return false;
  }

  private boolean _jspx_meth_c_out_192(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_93, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_192 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_192.setPageContext(_jspx_page_context);
    _jspx_th_c_out_192.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_93);
    _jspx_th_c_out_192.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_192.setEscapeXml("false");
    int _jspx_eval_c_out_192 = _jspx_th_c_out_192.doStartTag();
    if (_jspx_th_c_out_192.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_192);
    return false;
  }

  private boolean _jspx_meth_c_set_60(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_60 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_60.setPageContext(_jspx_page_context);
    _jspx_th_c_set_60.setParent(null);
    _jspx_th_c_set_60.setVar("environmentalFactorType");
    _jspx_th_c_set_60.setValue("Transposon");
    int _jspx_eval_c_set_60 = _jspx_th_c_set_60.doStartTag();
    if (_jspx_th_c_set_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_60);
    return false;
  }

  private boolean _jspx_meth_c_set_61(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_61 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_61.setPageContext(_jspx_page_context);
    _jspx_th_c_set_61.setParent(null);
    _jspx_th_c_set_61.setVar("cdList");
    _jspx_th_c_set_61.setValue("${carcinogenicInterventionColl[environmentalFactorType]}");
    int _jspx_eval_c_set_61 = _jspx_th_c_set_61.doStartTag();
    if (_jspx_th_c_set_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_61);
    return false;
  }

  private boolean _jspx_meth_c_if_27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_27 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_27.setPageContext(_jspx_page_context);
    _jspx_th_c_if_27.setParent(null);
    _jspx_th_c_if_27.setTest("${not empty cdList}");
    int _jspx_eval_c_if_27 = _jspx_th_c_if_27.doStartTag();
    if (_jspx_eval_c_if_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<TABLE summary=\"\" cellpadding=\"3\" cellspacing=\"0\" border=\"1\" align=\"center\" width=\"100%\">\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"formTitleBlue\" height=\"20\" colspan=\"7\">Transposon</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Type</td>\r\n");
        out.write("\t\t\t\t<td class=\"greySubTitleLeft\" width=\"17%\">Agent Name</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_18(_jspx_th_c_if_27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</TABLE>\r\n");
        out.write("\t\t\t<br>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_27);
    return false;
  }

  private boolean _jspx_meth_c_forEach_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_18 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_18.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_27);
    _jspx_th_c_forEach_18.setVar("cd");
    _jspx_th_c_forEach_18.setItems("${cdList}");
    _jspx_th_c_forEach_18.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_18 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_18 = _jspx_th_c_forEach_18.doStartTag();
      if (_jspx_eval_c_forEach_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_choose_33(_jspx_th_c_forEach_18, _jspx_page_context, _jspx_push_body_count_c_forEach_18))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_193(_jspx_th_c_forEach_18, _jspx_page_context, _jspx_push_body_count_c_forEach_18))
            return true;
          out.write("\" width=\"17%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_94(_jspx_th_c_forEach_18, _jspx_page_context, _jspx_push_body_count_c_forEach_18))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<td class=\"");
          if (_jspx_meth_c_out_195(_jspx_th_c_forEach_18, _jspx_page_context, _jspx_push_body_count_c_forEach_18))
            return true;
          out.write("\" width=\"20%\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_camod_highlight_95(_jspx_th_c_forEach_18, _jspx_page_context, _jspx_push_body_count_c_forEach_18))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_18.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_18[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_18.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_18.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_18);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_18, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_18)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_33 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_33.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_18);
    int _jspx_eval_c_choose_33 = _jspx_th_c_choose_33.doStartTag();
    if (_jspx_eval_c_choose_33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_33(_jspx_th_c_choose_33, _jspx_page_context, _jspx_push_body_count_c_forEach_18))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_33(_jspx_th_c_choose_33, _jspx_page_context, _jspx_push_body_count_c_forEach_18))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_33.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_33);
    return false;
  }

  private boolean _jspx_meth_c_when_33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_33, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_18)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.el.core.WhenTag _jspx_th_c_when_33 = (org.apache.taglibs.standard.tag.el.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.el.core.WhenTag.class);
    _jspx_th_c_when_33.setPageContext(_jspx_page_context);
    _jspx_th_c_when_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_33);
    _jspx_th_c_when_33.setTest("${stat.count % 2 == 0}");
    int _jspx_eval_c_when_33 = _jspx_th_c_when_33.doStartTag();
    if (_jspx_eval_c_when_33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_62(_jspx_th_c_when_33, _jspx_page_context, _jspx_push_body_count_c_forEach_18))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_33.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_33);
    return false;
  }

  private boolean _jspx_meth_c_set_62(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_33, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_18)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_62 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_62.setPageContext(_jspx_page_context);
    _jspx_th_c_set_62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_33);
    _jspx_th_c_set_62.setVar("tdClass");
    _jspx_th_c_set_62.setValue("resultsBoxWhite");
    int _jspx_eval_c_set_62 = _jspx_th_c_set_62.doStartTag();
    if (_jspx_th_c_set_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_62);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_33, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_18)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_33 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_33.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_33);
    int _jspx_eval_c_otherwise_33 = _jspx_th_c_otherwise_33.doStartTag();
    if (_jspx_eval_c_otherwise_33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_63(_jspx_th_c_otherwise_33, _jspx_page_context, _jspx_push_body_count_c_forEach_18))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_33.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_33);
    return false;
  }

  private boolean _jspx_meth_c_set_63(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_33, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_18)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_63 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_63.setPageContext(_jspx_page_context);
    _jspx_th_c_set_63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_33);
    _jspx_th_c_set_63.setVar("tdClass");
    _jspx_th_c_set_63.setValue("resultsBoxGrey");
    int _jspx_eval_c_set_63 = _jspx_th_c_set_63.doStartTag();
    if (_jspx_th_c_set_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_63);
    return false;
  }

  private boolean _jspx_meth_c_out_193(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_18, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_18)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_193 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_193.setPageContext(_jspx_page_context);
    _jspx_th_c_out_193.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_18);
    _jspx_th_c_out_193.setValue("${tdClass}");
    int _jspx_eval_c_out_193 = _jspx_th_c_out_193.doStartTag();
    if (_jspx_th_c_out_193.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_193);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_94(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_18, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_18)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_94 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_94.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_94.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_18);
    int _jspx_eval_camod_highlight_94 = _jspx_th_camod_highlight_94.doStartTag();
    if (_jspx_eval_camod_highlight_94 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_94 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_18[0]++;
        _jspx_th_camod_highlight_94.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_94.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_194(_jspx_th_camod_highlight_94, _jspx_page_context, _jspx_push_body_count_c_forEach_18))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_94.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_94 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_18[0]--;
    }
    if (_jspx_th_camod_highlight_94.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_94);
    return false;
  }

  private boolean _jspx_meth_c_out_194(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_94, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_18)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_194 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_194.setPageContext(_jspx_page_context);
    _jspx_th_c_out_194.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_94);
    _jspx_th_c_out_194.setValue("${cd.environmentalFactor.typeAlternEntry}");
    _jspx_th_c_out_194.setEscapeXml("false");
    int _jspx_eval_c_out_194 = _jspx_th_c_out_194.doStartTag();
    if (_jspx_th_c_out_194.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_194);
    return false;
  }

  private boolean _jspx_meth_c_out_195(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_18, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_18)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_195 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_195.setPageContext(_jspx_page_context);
    _jspx_th_c_out_195.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_18);
    _jspx_th_c_out_195.setValue("${tdClass}");
    int _jspx_eval_c_out_195 = _jspx_th_c_out_195.doStartTag();
    if (_jspx_th_c_out_195.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_195);
    return false;
  }

  private boolean _jspx_meth_camod_highlight_95(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_18, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_18)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:highlight
    gov.nih.nci.camod.webapp.taglib.HighlightTextTag _jspx_th_camod_highlight_95 = (gov.nih.nci.camod.webapp.taglib.HighlightTextTag) _jspx_tagPool_camod_highlight.get(gov.nih.nci.camod.webapp.taglib.HighlightTextTag.class);
    _jspx_th_camod_highlight_95.setPageContext(_jspx_page_context);
    _jspx_th_camod_highlight_95.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_18);
    int _jspx_eval_camod_highlight_95 = _jspx_th_camod_highlight_95.doStartTag();
    if (_jspx_eval_camod_highlight_95 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_highlight_95 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_18[0]++;
        _jspx_th_camod_highlight_95.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_highlight_95.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_196(_jspx_th_camod_highlight_95, _jspx_page_context, _jspx_push_body_count_c_forEach_18))
          return true;
        int evalDoAfterBody = _jspx_th_camod_highlight_95.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_highlight_95 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_18[0]--;
    }
    if (_jspx_th_camod_highlight_95.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_highlight.reuse(_jspx_th_camod_highlight_95);
    return false;
  }

  private boolean _jspx_meth_c_out_196(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_highlight_95, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_18)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_196 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_196.setPageContext(_jspx_page_context);
    _jspx_th_c_out_196.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_highlight_95);
    _jspx_th_c_out_196.setValue("${cd.environmentalFactor.nameAlternEntry}");
    _jspx_th_c_out_196.setEscapeXml("false");
    int _jspx_eval_c_out_196 = _jspx_th_c_out_196.doStartTag();
    if (_jspx_th_c_out_196.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_196);
    return false;
  }

  private boolean _jspx_meth_c_set_64(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_set_64 = (org.apache.taglibs.standard.tag.el.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_set_64.setPageContext(_jspx_page_context);
    _jspx_th_c_set_64.setParent(null);
    _jspx_th_c_set_64.setVar("uri");
    _jspx_th_c_set_64.setValue("javascript: rs('commentWin','AddCommentsPopulateAction.do?${modelIdTag}=${mdl.id}&${modelSectionTag}=${modelSectionValue}',360,305);");
    int _jspx_eval_c_set_64 = _jspx_th_c_set_64.doStartTag();
    if (_jspx_th_c_set_64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_64);
    return false;
  }

  private boolean _jspx_meth_c_out_197(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_197 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_197.setPageContext(_jspx_page_context);
    _jspx_th_c_out_197.setParent(null);
    _jspx_th_c_out_197.setValue("${uri}");
    int _jspx_eval_c_out_197 = _jspx_th_c_out_197.doStartTag();
    if (_jspx_th_c_out_197.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_197);
    return false;
  }

  private boolean _jspx_meth_c_forEach_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_19 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_c_forEach_19.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_19.setParent(null);
    _jspx_th_c_forEach_19.setVar("comments");
    _jspx_th_c_forEach_19.setItems("${aCommentsList}");
    int[] _jspx_push_body_count_c_forEach_19 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_19 = _jspx_th_c_forEach_19.doStartTag();
      if (_jspx_eval_c_forEach_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        <tr>\r\n");
          out.write("            <td class=\"WhiteBoxNoEnd\" width=\"30%\" colspan=\"1\">\r\n");
          out.write("                ");
          if (_jspx_meth_c_if_28(_jspx_th_c_forEach_19, _jspx_page_context, _jspx_push_body_count_c_forEach_19))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_out_199(_jspx_th_c_forEach_19, _jspx_page_context, _jspx_push_body_count_c_forEach_19))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_if_29(_jspx_th_c_forEach_19, _jspx_page_context, _jspx_push_body_count_c_forEach_19))
            return true;
          out.write("\r\n");
          out.write("            </td>\r\n");
          out.write("            <td class=\"WhiteBox\" width=\"70%\" colspan=\"1\">");
          if (_jspx_meth_c_out_200(_jspx_th_c_forEach_19, _jspx_page_context, _jspx_push_body_count_c_forEach_19))
            return true;
          out.write("</td>\r\n");
          out.write("        </tr>\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_forEach_19.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_19[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_19.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_19.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_19);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_19, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_19)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_28 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_28.setPageContext(_jspx_page_context);
    _jspx_th_c_if_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_19);
    _jspx_th_c_if_28.setTest("${not empty comments.submitter.emailAddress}");
    int _jspx_eval_c_if_28 = _jspx_th_c_if_28.doStartTag();
    if (_jspx_eval_c_if_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t    <a href=\"mailto:");
        if (_jspx_meth_c_out_198(_jspx_th_c_if_28, _jspx_page_context, _jspx_push_body_count_c_forEach_19))
          return true;
        out.write("\">\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_28);
    return false;
  }

  private boolean _jspx_meth_c_out_198(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_28, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_19)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_198 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_198.setPageContext(_jspx_page_context);
    _jspx_th_c_out_198.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_28);
    _jspx_th_c_out_198.setValue("${comments.submitter.emailAddress}");
    int _jspx_eval_c_out_198 = _jspx_th_c_out_198.doStartTag();
    if (_jspx_th_c_out_198.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_198);
    return false;
  }

  private boolean _jspx_meth_c_out_199(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_19, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_19)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_199 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_199.setPageContext(_jspx_page_context);
    _jspx_th_c_out_199.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_19);
    _jspx_th_c_out_199.setValue("${comments.submitter.displayName}");
    int _jspx_eval_c_out_199 = _jspx_th_c_out_199.doStartTag();
    if (_jspx_th_c_out_199.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_199);
    return false;
  }

  private boolean _jspx_meth_c_if_29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_19, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_19)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_if_29 = (org.apache.taglibs.standard.tag.el.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_if_29.setPageContext(_jspx_page_context);
    _jspx_th_c_if_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_19);
    _jspx_th_c_if_29.setTest("${not empty comments.submitter.emailAddress}");
    int _jspx_eval_c_if_29 = _jspx_th_c_if_29.doStartTag();
    if (_jspx_eval_c_if_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t    </a>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_29);
    return false;
  }

  private boolean _jspx_meth_c_out_200(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_19, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_19)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_200 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_200.setPageContext(_jspx_page_context);
    _jspx_th_c_out_200.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_19);
    _jspx_th_c_out_200.setValue("${comments.remark}");
    int _jspx_eval_c_out_200 = _jspx_th_c_out_200.doStartTag();
    if (_jspx_th_c_out_200.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_200);
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
