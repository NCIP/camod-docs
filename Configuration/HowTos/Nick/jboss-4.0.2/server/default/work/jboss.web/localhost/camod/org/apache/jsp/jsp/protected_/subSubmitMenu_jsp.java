package org.apache.jsp.jsp.protected_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import gov.nih.nci.camod.domain.AnimalModel;
import gov.nih.nci.camod.domain.Publication;
import gov.nih.nci.camod.domain.GeneDelivery;
import gov.nih.nci.camod.domain.Therapy;
import gov.nih.nci.camod.domain.CellLine;
import gov.nih.nci.camod.domain.Transplant;
import gov.nih.nci.camod.domain.InducedMutation;
import gov.nih.nci.camod.domain.EngineeredGene;
import gov.nih.nci.camod.domain.ExpressionFeature;
import gov.nih.nci.camod.domain.Image;
import gov.nih.nci.camod.domain.Transgene;
import gov.nih.nci.camod.domain.GenomicSegment;
import gov.nih.nci.camod.domain.EnvironmentalFactor;
import gov.nih.nci.camod.domain.SpontaneousMutation;
import gov.nih.nci.camod.domain.TargetedModification;
import gov.nih.nci.camod.domain.AnimalAvailability;
import gov.nih.nci.camod.domain.Histopathology;
import gov.nih.nci.camod.domain.ClinicalMarker;
import gov.nih.nci.camod.domain.CarcinogenExposure;
import gov.nih.nci.camod.domain.TransientInterference;
import gov.nih.nci.camod.Constants;

public final class subSubmitMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(7);
    _jspx_dependants.add("/common/taglibs.jsp");
    _jspx_dependants.add("/WEB-INF/tld/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/c-1_0.tld");
    _jspx_dependants.add("/WEB-INF/fmt-1_0.tld");
    _jspx_dependants.add("/WEB-INF/sql-1_0.tld");
    _jspx_dependants.add("/WEB-INF/camod.tld");
    _jspx_dependants.add("/WEB-INF/ajaxtags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_xhtml_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_styleClass_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_camod_shorten;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_type_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_filter_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_property_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_camod_shorten_length;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_xhtml_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_styleClass_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_camod_shorten = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_type_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_filter_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_property_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_camod_shorten_length = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_xhtml_nobody.release();
    _jspx_tagPool_html_link_styleClass_action.release();
    _jspx_tagPool_camod_shorten.release();
    _jspx_tagPool_logic_iterate_type_name_id.release();
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.release();
    _jspx_tagPool_bean_write_property_name_filter_nobody.release();
    _jspx_tagPool_bean_define_property_name_id_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_camod_shorten_length.release();
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

    ExpressionFeature _jspx_aExpressionFeature_1 = null;
    Histopathology _jspx_aAssociatedMetastasis_1 = null;
    ClinicalMarker _jspx_aClinicalMarker_1 = null;
    Publication _jspx_aPublication_1 = null;

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


		/*
		 * $Id: subSubmitMenu_jsp.java,v 1.1 2008-07-22 19:39:09 pandyas Exp $
		 *
		 * $Log: not supported by cvs2svn $
		 * Revision 1.63  2008/01/16 18:34:35  pandyas
		 * Renamed value to Transplant for #8290
		 *
		 * Revision 1.62  2007/11/01 14:27:14  pandyas
		 * Fixed #8290     Rename graft object into transplant object
		 *
		 * Revision 1.61  2007/08/07 19:30:16  pandyas
		 * Removed label containing Transplant
		 *
		 * Revision 1.60  2007/08/07 18:24:18  pandyas
		 * Renamed to GRAFT as per VCDE comments
		 *
		 * Revision 1.59  2007/07/31 12:00:10  pandyas
		 * VCDE silver level  and caMOD 2.3 changes
		 *
		 * Revision 1.58  2007/05/08 17:13:27  pandyas
		 * Cleaned up file format
		 *
		 * Revision 1.57  2007/03/26 12:07:22  pandyas
		 * caMOd 2.3 enhancements for Zebrafish support
		 *
		 * Revision 1.56  2006/11/17 17:46:20  pandyas
		 * Minor format change - siRNA (lower case s)
		 *
		 * Revision 1.55  2006/10/17 16:08:12  pandyas
		 * modified during development of caMOD 2.2 - various
		 *
		 * Revision 1.54  2006/05/08 14:19:48  georgeda
		 * Fixed errors introduced w/ adding Zebrafish changes and reformatting.
		 *
		 * Revision 1.53  2006/05/03 20:07:44  pandyas
		 * Modified/Added to support Morpholino object data in the application
		 *
		 * Revision 1.52  2006/04/27 15:09:10  pandyas
		 * Modified while testing caMod 2.1
		 *
		 * Revision 1.51  2006/04/19 15:12:47  georgeda
		 * Fixed issue w/ display of induced mutation
		 *
		 * Revision 1.50  2006/04/17 19:07:33  pandyas
		 * caMod 2.1 OM changes
		 *
		 * Revision 1.49  2005/12/29 19:42:01  georgeda
		 * Defect #297, fixed therapeutic approaches shorten
		 *
		 * Revision 1.48  2005/12/21 16:12:30  pandyas
		 * Modified name of publication link for cell line and therapy so test script can find links
		 *
		 * Revision 1.47  2005/12/06 18:49:58  georgeda
		 * Defect #247 - real fix this time for the problem
		 *
		 * Revision 1.46  2005/12/02 14:18:21  georgeda
		 * Defect #241, handle truncated HTML tags
		 *
		 * Revision 1.45  2005/11/29 16:28:19  georgeda
		 * Defect #193, missed xenograft
		 *
		 * Revision 1.44  2005/11/28 20:00:07  georgeda
		 * Defect #214 - user the gene name instead of the viral vector
		 *
		 *
		 */

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
      if (_jspx_meth_html_xhtml_0(_jspx_page_context))
        return;
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<TR>\r\n");
      out.write("\t<TD class=subMenuPrimaryTitle height=22>SUBMIT & EDIT MODELS</TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("\t<TD class=subMenuPrimaryGreyTitle height=27>Editing Model:<b>");
      out.print( request.getSession().getAttribute(Constants.MODELDESCRIPTOR));
      out.write("\r\n");
      out.write("\t( ");
      out.print( request.getSession().getAttribute(Constants.MODELID));
      out.write(" )<br>\r\n");
      out.write("\t");
      //  html:link
      org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
      _jspx_th_html_link_0.setPageContext(_jspx_page_context);
      _jspx_th_html_link_0.setParent(null);
      _jspx_th_html_link_0.setStyleClass("subMenuRed");
      _jspx_th_html_link_0.setAction("SubmitOverviewPopulateAction");
      int _jspx_eval_html_link_0 = _jspx_th_html_link_0.doStartTag();
      if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_link_0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("\t\t<b>View Model Status ( ");
          out.print( request.getSession().getAttribute(Constants.MODELSTATUS));
          out.write("\r\n");
          out.write("\t\t)</b>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_html_link_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_html_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_0);
      out.write("</TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("\t<TD class=subMenuPrimaryItems>\r\n");
      out.write("\r\n");
      out.write("\t<DIV id=\"masterdiv\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"menu1\" class=\"masterTitle\" onclick=\"SwitchMenu('sub1')\"\r\n");
      out.write("\t\tonmouseover=\"ChangeClass('menu1','masterTitleOver')\"\r\n");
      out.write("\t\tonmouseout=\"ChangeClass('menu1','masterTitle')\"><IMG height=5 alt=\"\"\r\n");
      out.write("\t\tsrc=\"images/subMenuArrow.gif\" width=5> MODEL CHARACTERISTICS</div>\r\n");
      out.write("\t<span class=\"submasterdiv\" id=\"sub1\"> &nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t<img src=\"images/aquadot.jpg\" border=\"0\"> \r\n");
      out.write("\t\t");
      //  html:link
      org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_1 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
      _jspx_th_html_link_1.setPageContext(_jspx_page_context);
      _jspx_th_html_link_1.setParent(null);
      _jspx_th_html_link_1.setStyleClass("subMenuBlue");
      _jspx_th_html_link_1.setAction("AnimalModelPopulateAction.do?method=populate");
      int _jspx_eval_html_link_1 = _jspx_th_html_link_1.doStartTag();
      if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_link_1.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("\t\t");
          //  camod:shorten
          gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_0 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
          _jspx_th_camod_shorten_0.setPageContext(_jspx_page_context);
          _jspx_th_camod_shorten_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_1);
          int _jspx_eval_camod_shorten_0 = _jspx_th_camod_shorten_0.doStartTag();
          if (_jspx_eval_camod_shorten_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_camod_shorten_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_camod_shorten_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_camod_shorten_0.doInitBody();
            }
            do {
              out.print( request.getSession().getAttribute(Constants.MODELDESCRIPTOR));
              int evalDoAfterBody = _jspx_th_camod_shorten_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_camod_shorten_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_camod_shorten_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_0);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_html_link_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_html_link_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_1);
      out.write(" <br><br>\r\n");
      out.write("\t</span>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"menu2\" class=\"masterTitle\" onclick=\"SwitchMenu('sub2')\"\r\n");
      out.write("\t\tonmouseover=\"ChangeClass('menu2','masterTitleOver')\"\r\n");
      out.write("\t\tonmouseout=\"ChangeClass('menu2','masterTitle')\"><IMG height=5 alt=\"\"\r\n");
      out.write("\t\tsrc=\"images/subMenuArrow.gif\" width=5> GENETIC DESCRIPTION</div>\r\n");
      out.write("\t<span class=\"submasterdiv\" id=\"sub2\"> \r\n");
      out.write("\t\t<img src=\"images/right_arrow.gif\" border=\"0\"> \t\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_2(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_0.setParent(null);
      _jspx_th_logic_iterate_0.setId("aEngineeredTransgene");
      _jspx_th_logic_iterate_0.setName("engineeredtransgene_list");
      _jspx_th_logic_iterate_0.setType("Transgene");
      int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
      if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        Transgene aEngineeredTransgene = null;
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_0.doInitBody();
        }
        aEngineeredTransgene = (Transgene) _jspx_page_context.findAttribute("aEngineeredTransgene");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_3(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write("<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\t\t\t      \r\n");
          out.write("\t\t\t      \r\n");
          out.write("\t\t\t<img src=\"images/right_arrow.gif\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_4(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write("<br>\r\n");
          out.write("\t\r\n");
          out.write("\t\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_bean_define_0.setId("expressionFeatureList");
          _jspx_th_bean_define_0.setName("aEngineeredTransgene");
          _jspx_th_bean_define_0.setProperty("expressionFeatureCollection");
          int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
          if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
          java.lang.Object expressionFeatureList = null;
          expressionFeatureList = (java.lang.Object) _jspx_page_context.findAttribute("expressionFeatureList");
          out.write("\r\n");
          out.write("\t\t\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_1 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_logic_iterate_1.setId("aExpressionFeature");
          _jspx_th_logic_iterate_1.setName("expressionFeatureList");
          _jspx_th_logic_iterate_1.setType("ExpressionFeature");
          int _jspx_eval_logic_iterate_1 = _jspx_th_logic_iterate_1.doStartTag();
          if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            ExpressionFeature aExpressionFeature = null;
            if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_1.doInitBody();
            }
            aExpressionFeature = (ExpressionFeature) _jspx_page_context.findAttribute("aExpressionFeature");
            do {
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_1 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_1.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
              _jspx_th_bean_define_1.setId("aAssociatedExpressionID");
              _jspx_th_bean_define_1.setName("aExpressionFeature");
              _jspx_th_bean_define_1.setProperty("id");
              int _jspx_eval_bean_define_1 = _jspx_th_bean_define_1.doStartTag();
              if (_jspx_th_bean_define_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
              java.lang.Object aAssociatedExpressionID = null;
              aAssociatedExpressionID = (java.lang.Object) _jspx_page_context.findAttribute("aAssociatedExpressionID");
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_2 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_2.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
              _jspx_th_bean_define_2.setId("aEngineeredTransgeneID");
              _jspx_th_bean_define_2.setName("aEngineeredTransgene");
              _jspx_th_bean_define_2.setProperty("id");
              int _jspx_eval_bean_define_2 = _jspx_th_bean_define_2.doStartTag();
              if (_jspx_th_bean_define_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_2);
              java.lang.Object aEngineeredTransgeneID = null;
              aEngineeredTransgeneID = (java.lang.Object) _jspx_page_context.findAttribute("aEngineeredTransgeneID");
              out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
              out.write("\t\t\t\t\t\r\n");
              out.write("\t\t\t\t<img src=\"images/aquadot_red.jpg\" border=\"0\">\r\n");
              out.write("\t\t\t\t<a class=\"subMenuMedRed\"\r\n");
              out.write("\t\t\t\t\thref=\"AssociatedExpressionPopulateAction.do?method=populate&aAssociatedExpressionID=");
              if (_jspx_meth_c_out_0(_jspx_th_logic_iterate_1, _jspx_page_context))
                return;
              out.write("&aEngineeredTransgeneID=");
              if (_jspx_meth_c_out_1(_jspx_th_logic_iterate_1, _jspx_page_context))
                return;
              out.write("\">\r\n");
              out.write("\t\t\t\t");
              if (_jspx_meth_camod_shorten_2(_jspx_th_logic_iterate_1, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("\t\t\t\t</a>\r\n");
              out.write("\t\t\t\t<br>\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_iterate_1.doAfterBody();
              aExpressionFeature = (ExpressionFeature) _jspx_page_context.findAttribute("aExpressionFeature");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_logic_iterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_1);
          out.write("\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
          aEngineeredTransgene = (Transgene) _jspx_page_context.findAttribute("aEngineeredTransgene");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_0);
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t\t<img src=\"images/right_arrow.gif\" border=\"0\"> \t\r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_5(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_2 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_2.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_2.setParent(null);
      _jspx_th_logic_iterate_2.setId("aGenomicSegment");
      _jspx_th_logic_iterate_2.setName("genomicsegment_list");
      _jspx_th_logic_iterate_2.setType("GenomicSegment");
      int _jspx_eval_logic_iterate_2 = _jspx_th_logic_iterate_2.doStartTag();
      if (_jspx_eval_logic_iterate_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        GenomicSegment aGenomicSegment = null;
        if (_jspx_eval_logic_iterate_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_2.doInitBody();
        }
        aGenomicSegment = (GenomicSegment) _jspx_page_context.findAttribute("aGenomicSegment");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\t\t\r\n");
          out.write("\t\t\t\t  \r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_6(_jspx_th_logic_iterate_2, _jspx_page_context))
            return;
          out.write("<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\t<img src=\"images/right_arrow.gif\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_7(_jspx_th_logic_iterate_2, _jspx_page_context))
            return;
          out.write("<br>\r\n");
          out.write("\t\r\n");
          out.write("\t\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_3 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_3.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_2);
          _jspx_th_bean_define_3.setId("expressionFeatureList");
          _jspx_th_bean_define_3.setName("aGenomicSegment");
          _jspx_th_bean_define_3.setProperty("expressionFeatureCollection");
          int _jspx_eval_bean_define_3 = _jspx_th_bean_define_3.doStartTag();
          if (_jspx_th_bean_define_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_3);
          java.lang.Object expressionFeatureList = null;
          expressionFeatureList = (java.lang.Object) _jspx_page_context.findAttribute("expressionFeatureList");
          out.write("\r\n");
          out.write("\t\t\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_3 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_3.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_2);
          _jspx_th_logic_iterate_3.setId("aExpressionFeature");
          _jspx_th_logic_iterate_3.setName("expressionFeatureList");
          _jspx_th_logic_iterate_3.setType("ExpressionFeature");
          int _jspx_eval_logic_iterate_3 = _jspx_th_logic_iterate_3.doStartTag();
          if (_jspx_eval_logic_iterate_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            ExpressionFeature aExpressionFeature = null;
            if (_jspx_eval_logic_iterate_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_3.doInitBody();
            }
            aExpressionFeature = (ExpressionFeature) _jspx_page_context.findAttribute("aExpressionFeature");
            do {
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_4 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_4.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_3);
              _jspx_th_bean_define_4.setId("aAssociatedExpressionID");
              _jspx_th_bean_define_4.setName("aExpressionFeature");
              _jspx_th_bean_define_4.setProperty("id");
              int _jspx_eval_bean_define_4 = _jspx_th_bean_define_4.doStartTag();
              if (_jspx_th_bean_define_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_4);
              java.lang.Object aAssociatedExpressionID = null;
              aAssociatedExpressionID = (java.lang.Object) _jspx_page_context.findAttribute("aAssociatedExpressionID");
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_5 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_5.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_3);
              _jspx_th_bean_define_5.setId("aGenomicSegmentID");
              _jspx_th_bean_define_5.setName("aGenomicSegment");
              _jspx_th_bean_define_5.setProperty("id");
              int _jspx_eval_bean_define_5 = _jspx_th_bean_define_5.doStartTag();
              if (_jspx_th_bean_define_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_5);
              java.lang.Object aGenomicSegmentID = null;
              aGenomicSegmentID = (java.lang.Object) _jspx_page_context.findAttribute("aGenomicSegmentID");
              out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t<img src=\"images/aquadot_red.jpg\" border=\"0\">\r\n");
              out.write("\t\t\t\t<a class=\"subMenuMedRed\"\r\n");
              out.write("\t\t\t\t\thref=\"AssociatedExpressionPopulateAction.do?method=populate&aAssociatedExpressionID=");
              if (_jspx_meth_c_out_2(_jspx_th_logic_iterate_3, _jspx_page_context))
                return;
              out.write("&aGenomicSegmentID=");
              if (_jspx_meth_c_out_3(_jspx_th_logic_iterate_3, _jspx_page_context))
                return;
              out.write("\">\r\n");
              out.write("\t\t\t\t    ");
              if (_jspx_meth_camod_shorten_4(_jspx_th_logic_iterate_3, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("\t\t\t\t</a>\r\n");
              out.write("\t\t\t\t<br>\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_iterate_3.doAfterBody();
              aExpressionFeature = (ExpressionFeature) _jspx_page_context.findAttribute("aExpressionFeature");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_logic_iterate_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_3);
          out.write("\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_2.doAfterBody();
          aGenomicSegment = (GenomicSegment) _jspx_page_context.findAttribute("aGenomicSegment");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_2);
      out.write(" <img src=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_8(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_4 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_4.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_4.setParent(null);
      _jspx_th_logic_iterate_4.setId("aTargetedModification");
      _jspx_th_logic_iterate_4.setName("targetedmodification_list");
      _jspx_th_logic_iterate_4.setType("TargetedModification");
      int _jspx_eval_logic_iterate_4 = _jspx_th_logic_iterate_4.doStartTag();
      if (_jspx_eval_logic_iterate_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        TargetedModification aTargetedModification = null;
        if (_jspx_eval_logic_iterate_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_4.doInitBody();
        }
        aTargetedModification = (TargetedModification) _jspx_page_context.findAttribute("aTargetedModification");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\t\t\t  \r\n");
          out.write("\t\t\t\t  \r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_9(_jspx_th_logic_iterate_4, _jspx_page_context))
            return;
          out.write("<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t      \r\n");
          out.write("\t\t\t      \r\n");
          out.write("\t\t\t<img src=\"images/right_arrow.gif\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_10(_jspx_th_logic_iterate_4, _jspx_page_context))
            return;
          out.write("<br>\r\n");
          out.write("\t\r\n");
          out.write("\t\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_6 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_6.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_4);
          _jspx_th_bean_define_6.setId("expressionFeatureList");
          _jspx_th_bean_define_6.setName("aTargetedModification");
          _jspx_th_bean_define_6.setProperty("expressionFeatureCollection");
          int _jspx_eval_bean_define_6 = _jspx_th_bean_define_6.doStartTag();
          if (_jspx_th_bean_define_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_6);
          java.lang.Object expressionFeatureList = null;
          expressionFeatureList = (java.lang.Object) _jspx_page_context.findAttribute("expressionFeatureList");
          out.write("\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_5 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_5.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_4);
          _jspx_th_logic_iterate_5.setId("aExpressionFeature");
          _jspx_th_logic_iterate_5.setName("expressionFeatureList");
          _jspx_th_logic_iterate_5.setType("ExpressionFeature");
          int _jspx_eval_logic_iterate_5 = _jspx_th_logic_iterate_5.doStartTag();
          if (_jspx_eval_logic_iterate_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            ExpressionFeature aExpressionFeature = null;
            if (_jspx_eval_logic_iterate_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_5.doInitBody();
            }
            aExpressionFeature = (ExpressionFeature) _jspx_page_context.findAttribute("aExpressionFeature");
            do {
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_7 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_7.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_5);
              _jspx_th_bean_define_7.setId("aAssociatedExpressionID");
              _jspx_th_bean_define_7.setName("aExpressionFeature");
              _jspx_th_bean_define_7.setProperty("id");
              int _jspx_eval_bean_define_7 = _jspx_th_bean_define_7.doStartTag();
              if (_jspx_th_bean_define_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_7);
              java.lang.Object aAssociatedExpressionID = null;
              aAssociatedExpressionID = (java.lang.Object) _jspx_page_context.findAttribute("aAssociatedExpressionID");
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_8 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_8.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_5);
              _jspx_th_bean_define_8.setId("aTargetedModificationID");
              _jspx_th_bean_define_8.setName("aTargetedModification");
              _jspx_th_bean_define_8.setProperty("id");
              int _jspx_eval_bean_define_8 = _jspx_th_bean_define_8.doStartTag();
              if (_jspx_th_bean_define_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_8);
              java.lang.Object aTargetedModificationID = null;
              aTargetedModificationID = (java.lang.Object) _jspx_page_context.findAttribute("aTargetedModificationID");
              out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t<img src=\"images/aquadot_red.jpg\" border=\"0\">\r\n");
              out.write("\t\t\t\t<a class=\"subMenuMedRed\"\r\n");
              out.write("\t\t\t\t\thref=\"AssociatedExpressionPopulateAction.do?method=populate&aAssociatedExpressionID=");
              if (_jspx_meth_c_out_4(_jspx_th_logic_iterate_5, _jspx_page_context))
                return;
              out.write("&aTargetedModificationID=");
              if (_jspx_meth_c_out_5(_jspx_th_logic_iterate_5, _jspx_page_context))
                return;
              out.write("\">\r\n");
              out.write("\t\t\t\t    ");
              if (_jspx_meth_camod_shorten_6(_jspx_th_logic_iterate_5, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("\t\t\t\t</a>\r\n");
              out.write("\t\t\t\t<br>\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_iterate_5.doAfterBody();
              aExpressionFeature = (ExpressionFeature) _jspx_page_context.findAttribute("aExpressionFeature");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_logic_iterate_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_5);
          out.write("\t\t\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_4.doAfterBody();
          aTargetedModification = (TargetedModification) _jspx_page_context.findAttribute("aTargetedModification");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_4);
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t\t<img src=\"images/right_arrow.gif\" border=\"0\"> \t\r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_11(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_6 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_6.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_6.setParent(null);
      _jspx_th_logic_iterate_6.setId("aInducedMutation");
      _jspx_th_logic_iterate_6.setName("inducedmutation_list");
      _jspx_th_logic_iterate_6.setType("InducedMutation");
      int _jspx_eval_logic_iterate_6 = _jspx_th_logic_iterate_6.doStartTag();
      if (_jspx_eval_logic_iterate_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        InducedMutation aInducedMutation = null;
        if (_jspx_eval_logic_iterate_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_6.doInitBody();
        }
        aInducedMutation = (InducedMutation) _jspx_page_context.findAttribute("aInducedMutation");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\t  \r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_12(_jspx_th_logic_iterate_6, _jspx_page_context))
            return;
          out.write("<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_6.doAfterBody();
          aInducedMutation = (InducedMutation) _jspx_page_context.findAttribute("aInducedMutation");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_6);
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t\t<img src=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_13(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_7 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_7.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_7.setParent(null);
      _jspx_th_logic_iterate_7.setId("aSpontaneousMutation");
      _jspx_th_logic_iterate_7.setName("spontaneousmutation_list");
      _jspx_th_logic_iterate_7.setType("SpontaneousMutation");
      int _jspx_eval_logic_iterate_7 = _jspx_th_logic_iterate_7.doStartTag();
      if (_jspx_eval_logic_iterate_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        SpontaneousMutation aSpontaneousMutation = null;
        if (_jspx_eval_logic_iterate_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_7.doInitBody();
        }
        aSpontaneousMutation = (SpontaneousMutation) _jspx_page_context.findAttribute("aSpontaneousMutation");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\t  \r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_14(_jspx_th_logic_iterate_7, _jspx_page_context))
            return;
          out.write("<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_7.doAfterBody();
          aSpontaneousMutation = (SpontaneousMutation) _jspx_page_context.findAttribute("aSpontaneousMutation");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_7);
      out.write(" <br>\r\n");
      out.write("\t</span>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"menu3\" class=\"masterTitle\" onclick=\"SwitchMenu('sub3')\"\r\n");
      out.write("\t\tonmouseover=\"ChangeClass('menu3','masterTitleOver')\"\r\n");
      out.write("\t\tonmouseout=\"ChangeClass('menu3','masterTitle')\"><IMG height=5 alt=\"\"\r\n");
      out.write("\t\tsrc=\"images/subMenuArrow.gif\" width=5> CARCINOGENIC INTERVENTIONS</div>\r\n");
      out.write("\t<span class=\"submasterdiv\" class=\"submenu\" id=\"sub3\"> <img\r\n");
      out.write("\t\tsrc=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_15(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_8 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_8.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_8.setParent(null);
      _jspx_th_logic_iterate_8.setId("aCarcinogenExposure");
      _jspx_th_logic_iterate_8.setName("chemicaldrug_list");
      _jspx_th_logic_iterate_8.setType("CarcinogenExposure");
      int _jspx_eval_logic_iterate_8 = _jspx_th_logic_iterate_8.doStartTag();
      if (_jspx_eval_logic_iterate_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        CarcinogenExposure aCarcinogenExposure = null;
        if (_jspx_eval_logic_iterate_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_8.doInitBody();
        }
        aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_16(_jspx_th_logic_iterate_8, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_8.doAfterBody();
          aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_8);
      out.write(" <img src=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_17(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_9 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_9.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_9.setParent(null);
      _jspx_th_logic_iterate_9.setId("aCarcinogenExposure");
      _jspx_th_logic_iterate_9.setName("environmentalfactor_list");
      _jspx_th_logic_iterate_9.setType("CarcinogenExposure");
      int _jspx_eval_logic_iterate_9 = _jspx_th_logic_iterate_9.doStartTag();
      if (_jspx_eval_logic_iterate_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        CarcinogenExposure aCarcinogenExposure = null;
        if (_jspx_eval_logic_iterate_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_9.doInitBody();
        }
        aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_18(_jspx_th_logic_iterate_9, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_9.doAfterBody();
          aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_9);
      out.write(" <img src=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_19(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_10 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_10.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_10.setParent(null);
      _jspx_th_logic_iterate_10.setId("aCarcinogenExposure");
      _jspx_th_logic_iterate_10.setName("genedelivery_list");
      _jspx_th_logic_iterate_10.setType("GeneDelivery");
      int _jspx_eval_logic_iterate_10 = _jspx_th_logic_iterate_10.doStartTag();
      if (_jspx_eval_logic_iterate_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        GeneDelivery aCarcinogenExposure = null;
        if (_jspx_eval_logic_iterate_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_10.doInitBody();
        }
        aCarcinogenExposure = (GeneDelivery) _jspx_page_context.findAttribute("aCarcinogenExposure");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_20(_jspx_th_logic_iterate_10, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_10.doAfterBody();
          aCarcinogenExposure = (GeneDelivery) _jspx_page_context.findAttribute("aCarcinogenExposure");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_10);
      out.write(" <img src=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_21(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_11 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_11.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_11.setParent(null);
      _jspx_th_logic_iterate_11.setId("aCarcinogenExposure");
      _jspx_th_logic_iterate_11.setName("growthfactors_list");
      _jspx_th_logic_iterate_11.setType("CarcinogenExposure");
      int _jspx_eval_logic_iterate_11 = _jspx_th_logic_iterate_11.doStartTag();
      if (_jspx_eval_logic_iterate_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        CarcinogenExposure aCarcinogenExposure = null;
        if (_jspx_eval_logic_iterate_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_11.doInitBody();
        }
        aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_22(_jspx_th_logic_iterate_11, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_11.doAfterBody();
          aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_11);
      out.write(" <img src=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_23(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_12 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_12.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_12.setParent(null);
      _jspx_th_logic_iterate_12.setId("aCarcinogenExposure");
      _jspx_th_logic_iterate_12.setName("hormone_list");
      _jspx_th_logic_iterate_12.setType("CarcinogenExposure");
      int _jspx_eval_logic_iterate_12 = _jspx_th_logic_iterate_12.doStartTag();
      if (_jspx_eval_logic_iterate_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        CarcinogenExposure aCarcinogenExposure = null;
        if (_jspx_eval_logic_iterate_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_12.doInitBody();
        }
        aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_24(_jspx_th_logic_iterate_12, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_12.doAfterBody();
          aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_12);
      out.write(" <img src=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_25(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_13 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_13.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_13.setParent(null);
      _jspx_th_logic_iterate_13.setId("aCarcinogenExposure");
      _jspx_th_logic_iterate_13.setName("nutritionalfactors_list");
      _jspx_th_logic_iterate_13.setType("CarcinogenExposure");
      int _jspx_eval_logic_iterate_13 = _jspx_th_logic_iterate_13.doStartTag();
      if (_jspx_eval_logic_iterate_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        CarcinogenExposure aCarcinogenExposure = null;
        if (_jspx_eval_logic_iterate_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_13.doInitBody();
        }
        aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_26(_jspx_th_logic_iterate_13, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_13.doAfterBody();
          aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_13);
      out.write(" <img src=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_27(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_14 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_14.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_14.setParent(null);
      _jspx_th_logic_iterate_14.setId("aCarcinogenExposure");
      _jspx_th_logic_iterate_14.setName("radiation_list");
      _jspx_th_logic_iterate_14.setType("CarcinogenExposure");
      int _jspx_eval_logic_iterate_14 = _jspx_th_logic_iterate_14.doStartTag();
      if (_jspx_eval_logic_iterate_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        CarcinogenExposure aCarcinogenExposure = null;
        if (_jspx_eval_logic_iterate_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_14.doInitBody();
        }
        aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_28(_jspx_th_logic_iterate_14, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_14.doAfterBody();
          aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_14);
      out.write(" <img src=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_29(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_15 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_15.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_15.setParent(null);
      _jspx_th_logic_iterate_15.setId("aCarcinogenExposure");
      _jspx_th_logic_iterate_15.setName("surgeryother_list");
      _jspx_th_logic_iterate_15.setType("CarcinogenExposure");
      int _jspx_eval_logic_iterate_15 = _jspx_th_logic_iterate_15.doStartTag();
      if (_jspx_eval_logic_iterate_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        CarcinogenExposure aCarcinogenExposure = null;
        if (_jspx_eval_logic_iterate_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_15.doInitBody();
        }
        aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_30(_jspx_th_logic_iterate_15, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_15.doAfterBody();
          aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_15);
      out.write(" <img src=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_31(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_16 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_16.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_16.setParent(null);
      _jspx_th_logic_iterate_16.setId("aCarcinogenExposure");
      _jspx_th_logic_iterate_16.setName("viraltreatment_list");
      _jspx_th_logic_iterate_16.setType("CarcinogenExposure");
      int _jspx_eval_logic_iterate_16 = _jspx_th_logic_iterate_16.doStartTag();
      if (_jspx_eval_logic_iterate_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        CarcinogenExposure aCarcinogenExposure = null;
        if (_jspx_eval_logic_iterate_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_16.doInitBody();
        }
        aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_32(_jspx_th_logic_iterate_16, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_16.doAfterBody();
          aCarcinogenExposure = (CarcinogenExposure) _jspx_page_context.findAttribute("aCarcinogenExposure");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_16);
      out.write(" <br>\r\n");
      out.write("\t</span>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"menu4\" class=\"masterTitle\" onclick=\"SwitchMenu('sub4')\"\r\n");
      out.write("\t\tonmouseover=\"ChangeClass('menu4','masterTitleOver')\"\r\n");
      out.write("\t\tonmouseout=\"ChangeClass('menu4','masterTitle')\">\r\n");
      out.write("\t\t<IMG height=5 alt=\"\" src=\"images/subMenuArrow.gif\" width=5>TRANSIENT INTERFERENCE</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<span class=\"submasterdiv\" id=\"sub4\">\t\r\n");
      out.write("\t\t<img src=\"images/right_arrow.gif\" border=\"0\">\t \r\n");
      out.write("\t\t\t");
      if (_jspx_meth_html_link_33(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_17 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_17.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_17.setParent(null);
      _jspx_th_logic_iterate_17.setId("aTransInt");
      _jspx_th_logic_iterate_17.setName("morpholino_list");
      _jspx_th_logic_iterate_17.setType("TransientInterference");
      int _jspx_eval_logic_iterate_17 = _jspx_th_logic_iterate_17.doStartTag();
      if (_jspx_eval_logic_iterate_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        TransientInterference aTransInt = null;
        if (_jspx_eval_logic_iterate_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_17.doInitBody();
        }
        aTransInt = (TransientInterference) _jspx_page_context.findAttribute("aTransInt");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_34(_jspx_th_logic_iterate_17, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_17.doAfterBody();
          aTransInt = (TransientInterference) _jspx_page_context.findAttribute("aTransInt");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_17);
      out.write("\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t<img src=\"images/right_arrow.gif\" border=\"0\">\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_html_link_35(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_18 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_18.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_18.setParent(null);
      _jspx_th_logic_iterate_18.setId("aTransInt");
      _jspx_th_logic_iterate_18.setName("sirna_list");
      _jspx_th_logic_iterate_18.setType("TransientInterference");
      int _jspx_eval_logic_iterate_18 = _jspx_th_logic_iterate_18.doStartTag();
      if (_jspx_eval_logic_iterate_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        TransientInterference aTransInt = null;
        if (_jspx_eval_logic_iterate_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_18.doInitBody();
        }
        aTransInt = (TransientInterference) _jspx_page_context.findAttribute("aTransInt");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_36(_jspx_th_logic_iterate_18, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_18.doAfterBody();
          aTransInt = (TransientInterference) _jspx_page_context.findAttribute("aTransInt");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_18);
      out.write(" <br>\t\r\n");
      out.write("\t</span>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"menu5\" class=\"masterTitle\" onclick=\"SwitchMenu('sub5')\"\r\n");
      out.write("\t\tonmouseover=\"ChangeClass('menu5','masterTitleOver')\"\r\n");
      out.write("\t\tonmouseout=\"ChangeClass('menu5','masterTitle')\"><IMG height=5 alt=\"\"\r\n");
      out.write("\t\tsrc=\"images/subMenuArrow.gif\" width=5> PUBLICATIONS</div>\r\n");
      out.write("\t<span class=\"submasterdiv\" id=\"sub5\"> <img src=\"images/right_arrow.gif\"\r\n");
      out.write("\t\tborder=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_37(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_19 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_19.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_19.setParent(null);
      _jspx_th_logic_iterate_19.setId("aPub");
      _jspx_th_logic_iterate_19.setName("publication_list");
      _jspx_th_logic_iterate_19.setType("Publication");
      int _jspx_eval_logic_iterate_19 = _jspx_th_logic_iterate_19.doStartTag();
      if (_jspx_eval_logic_iterate_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        Publication aPub = null;
        if (_jspx_eval_logic_iterate_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_19.doInitBody();
        }
        aPub = (Publication) _jspx_page_context.findAttribute("aPub");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_38(_jspx_th_logic_iterate_19, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_19.doAfterBody();
          aPub = (Publication) _jspx_page_context.findAttribute("aPub");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_19);
      out.write(" <br>\r\n");
      out.write("\t</span>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"menu6\" class=\"masterTitle\" onclick=\"SwitchMenu('sub6')\"\r\n");
      out.write("\t\tonmouseover=\"ChangeClass('menu6','masterTitleOver')\"\r\n");
      out.write("\t\tonmouseout=\"ChangeClass('menu6','masterTitle')\"><IMG height=5 alt=\"\"\r\n");
      out.write("\t\tsrc=\"images/subMenuArrow.gif\" width=5> HISTOPATHOLOGY</div>\r\n");
      out.write("\t<span class=\"submasterdiv\" id=\"sub6\"> <img src=\"images/right_arrow.gif\"\r\n");
      out.write("\t\tborder=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_39(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_20 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_20.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_20.setParent(null);
      _jspx_th_logic_iterate_20.setId("aHistopathology");
      _jspx_th_logic_iterate_20.setName("histopathology_list");
      _jspx_th_logic_iterate_20.setType("Histopathology");
      int _jspx_eval_logic_iterate_20 = _jspx_th_logic_iterate_20.doStartTag();
      if (_jspx_eval_logic_iterate_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        Histopathology aHistopathology = null;
        if (_jspx_eval_logic_iterate_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_20.doInitBody();
        }
        aHistopathology = (Histopathology) _jspx_page_context.findAttribute("aHistopathology");
        do {
          out.write("&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_40(_jspx_th_logic_iterate_20, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\r\n");
          out.write("\t\t<!-- Begin Associated Metastasis Loop -->\t\t\t      \r\n");
          out.write("\t\t\t      \r\n");
          out.write("\t\t<img src=\"images/right_arrow.gif\" border=\"0\">\r\n");
          out.write("\t\t");
          if (_jspx_meth_html_link_41(_jspx_th_logic_iterate_20, _jspx_page_context))
            return;
          out.write("<br>\r\n");
          out.write("\r\n");
          out.write("\t\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_9 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_9.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_20);
          _jspx_th_bean_define_9.setId("associatedMetastasisList");
          _jspx_th_bean_define_9.setName("aHistopathology");
          _jspx_th_bean_define_9.setProperty("metastasisCollection");
          int _jspx_eval_bean_define_9 = _jspx_th_bean_define_9.doStartTag();
          if (_jspx_th_bean_define_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_9);
          java.lang.Object associatedMetastasisList = null;
          associatedMetastasisList = (java.lang.Object) _jspx_page_context.findAttribute("associatedMetastasisList");
          out.write("\r\n");
          out.write("\t\t\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_21 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_21.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_20);
          _jspx_th_logic_iterate_21.setId("aAssociatedMetastasis");
          _jspx_th_logic_iterate_21.setName("associatedMetastasisList");
          _jspx_th_logic_iterate_21.setType("Histopathology");
          int _jspx_eval_logic_iterate_21 = _jspx_th_logic_iterate_21.doStartTag();
          if (_jspx_eval_logic_iterate_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            Histopathology aAssociatedMetastasis = null;
            if (_jspx_eval_logic_iterate_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_21.doInitBody();
            }
            aAssociatedMetastasis = (Histopathology) _jspx_page_context.findAttribute("aAssociatedMetastasis");
            do {
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_10 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_10.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_21);
              _jspx_th_bean_define_10.setId("aAssociatedMetastasisID");
              _jspx_th_bean_define_10.setName("aAssociatedMetastasis");
              _jspx_th_bean_define_10.setProperty("id");
              int _jspx_eval_bean_define_10 = _jspx_th_bean_define_10.doStartTag();
              if (_jspx_th_bean_define_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_10);
              java.lang.Object aAssociatedMetastasisID = null;
              aAssociatedMetastasisID = (java.lang.Object) _jspx_page_context.findAttribute("aAssociatedMetastasisID");
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_11 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_11.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_21);
              _jspx_th_bean_define_11.setId("aHistopathologyID");
              _jspx_th_bean_define_11.setName("aHistopathology");
              _jspx_th_bean_define_11.setProperty("id");
              int _jspx_eval_bean_define_11 = _jspx_th_bean_define_11.doStartTag();
              if (_jspx_th_bean_define_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_11);
              java.lang.Object aHistopathologyID = null;
              aHistopathologyID = (java.lang.Object) _jspx_page_context.findAttribute("aHistopathologyID");
              out.write(" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
              out.write("\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t \r\n");
              out.write("\t\t\t\t<img src=\"images/aquadot_red.jpg\" border=\"0\">\r\n");
              out.write("\t\t\t\t<a class=\"subMenuMedRed\"\r\n");
              out.write("\t\t\t\t\thref=\"AssociatedMetastasisPopulateAction.do?method=populate&aAssociatedMetastasisID=");
              if (_jspx_meth_c_out_6(_jspx_th_logic_iterate_21, _jspx_page_context))
                return;
              out.write("&aHistopathologyID=");
              if (_jspx_meth_c_out_7(_jspx_th_logic_iterate_21, _jspx_page_context))
                return;
              out.write(" \">\r\n");
              out.write("\t\t\t\t    ");
              if (_jspx_meth_camod_shorten_22(_jspx_th_logic_iterate_21, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("\t\t\t\t</a>\r\n");
              out.write("\t\t\t\t<br>\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_iterate_21.doAfterBody();
              aAssociatedMetastasis = (Histopathology) _jspx_page_context.findAttribute("aAssociatedMetastasis");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_logic_iterate_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_21);
          out.write("\r\n");
          out.write("\t\t\t<!-- End Associated Metastasis Loop -->\r\n");
          out.write("\t\r\n");
          out.write("\t\t\t<!-- Begin Clinical Marker Loop -->\r\n");
          out.write("\t\t\t\t    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t<img src=\"images/right_arrow.gif\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_42(_jspx_th_logic_iterate_20, _jspx_page_context))
            return;
          out.write("<br>\r\n");
          out.write("\r\n");
          out.write("\t\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_12 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_12.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_20);
          _jspx_th_bean_define_12.setId("clinicalMarkerList");
          _jspx_th_bean_define_12.setName("aHistopathology");
          _jspx_th_bean_define_12.setProperty("clinicalMarkerCollection");
          int _jspx_eval_bean_define_12 = _jspx_th_bean_define_12.doStartTag();
          if (_jspx_th_bean_define_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_12);
          java.lang.Object clinicalMarkerList = null;
          clinicalMarkerList = (java.lang.Object) _jspx_page_context.findAttribute("clinicalMarkerList");
          out.write("\r\n");
          out.write("\t\t\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_22 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_22.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_20);
          _jspx_th_logic_iterate_22.setId("aClinicalMarker");
          _jspx_th_logic_iterate_22.setName("clinicalMarkerList");
          _jspx_th_logic_iterate_22.setType("ClinicalMarker");
          int _jspx_eval_logic_iterate_22 = _jspx_th_logic_iterate_22.doStartTag();
          if (_jspx_eval_logic_iterate_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            ClinicalMarker aClinicalMarker = null;
            if (_jspx_eval_logic_iterate_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_22.doInitBody();
            }
            aClinicalMarker = (ClinicalMarker) _jspx_page_context.findAttribute("aClinicalMarker");
            do {
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_13 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_13.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_22);
              _jspx_th_bean_define_13.setId("aClinicalMarkerID");
              _jspx_th_bean_define_13.setName("aClinicalMarker");
              _jspx_th_bean_define_13.setProperty("id");
              int _jspx_eval_bean_define_13 = _jspx_th_bean_define_13.doStartTag();
              if (_jspx_th_bean_define_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_13);
              java.lang.Object aClinicalMarkerID = null;
              aClinicalMarkerID = (java.lang.Object) _jspx_page_context.findAttribute("aClinicalMarkerID");
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_14 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_14.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_22);
              _jspx_th_bean_define_14.setId("aHistopathologyID");
              _jspx_th_bean_define_14.setName("aHistopathology");
              _jspx_th_bean_define_14.setProperty("id");
              int _jspx_eval_bean_define_14 = _jspx_th_bean_define_14.doStartTag();
              if (_jspx_th_bean_define_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_14);
              java.lang.Object aHistopathologyID = null;
              aHistopathologyID = (java.lang.Object) _jspx_page_context.findAttribute("aHistopathologyID");
              out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
              out.write("\t\t\t\t\t\r\n");
              out.write("\t\t\t\t<img src=\"images/aquadot_red.jpg\" border=\"0\">\t\r\n");
              out.write("\t\t\t\t<a class=\"subMenuMedRed\"\r\n");
              out.write("\t\t\t\t\thref=\"ClinicalMarkerPopulateAction.do?method=populate&aClinicalMarkerID=");
              if (_jspx_meth_c_out_8(_jspx_th_logic_iterate_22, _jspx_page_context))
                return;
              out.write("&aHistopathologyID=");
              if (_jspx_meth_c_out_9(_jspx_th_logic_iterate_22, _jspx_page_context))
                return;
              out.write(" \">\r\n");
              out.write("\t\t\t\t    ");
              if (_jspx_meth_camod_shorten_23(_jspx_th_logic_iterate_22, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("\t\t\t\t</a>\r\n");
              out.write("\t\t\t\t<br>\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_iterate_22.doAfterBody();
              aClinicalMarker = (ClinicalMarker) _jspx_page_context.findAttribute("aClinicalMarker");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_logic_iterate_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_22);
          out.write("\r\n");
          out.write("\t\t\t<!-- End Clinical Marker Loop -->\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_20.doAfterBody();
          aHistopathology = (Histopathology) _jspx_page_context.findAttribute("aHistopathology");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_20);
      out.write(" <br>\r\n");
      out.write("\t</span>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"menu7\" class=\"masterTitle\" onclick=\"SwitchMenu('sub7')\"\r\n");
      out.write("\t\tonmouseover=\"ChangeClass('menu7','masterTitleOver')\"\r\n");
      out.write("\t\tonmouseout=\"ChangeClass('menu7','masterTitle')\"><IMG height=5 alt=\"\"\r\n");
      out.write("\t\tsrc=\"images/subMenuArrow.gif\" width=5> THERAPEUTIC APPROACHES</div>\r\n");
      out.write("\t<span class=\"submasterdiv\" id=\"sub7\"> <img src=\"images/right_arrow.gif\"\r\n");
      out.write("\t\tborder=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_43(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_23 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_23.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_23.setParent(null);
      _jspx_th_logic_iterate_23.setId("aTherapy");
      _jspx_th_logic_iterate_23.setName("therapy_list");
      _jspx_th_logic_iterate_23.setType("Therapy");
      int _jspx_eval_logic_iterate_23 = _jspx_th_logic_iterate_23.doStartTag();
      if (_jspx_eval_logic_iterate_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        Therapy aTherapy = null;
        if (_jspx_eval_logic_iterate_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_23.doInitBody();
        }
        aTherapy = (Therapy) _jspx_page_context.findAttribute("aTherapy");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_44(_jspx_th_logic_iterate_23, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\t\t\t \r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/right_arrow.gif\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_45(_jspx_th_logic_iterate_23, _jspx_page_context))
            return;
          out.write("<br>\r\n");
          out.write("\r\n");
          out.write("\t\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_15 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_15.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_23);
          _jspx_th_bean_define_15.setId("publicationList");
          _jspx_th_bean_define_15.setName("aTherapy");
          _jspx_th_bean_define_15.setProperty("publicationCollection");
          int _jspx_eval_bean_define_15 = _jspx_th_bean_define_15.doStartTag();
          if (_jspx_th_bean_define_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_15);
          java.lang.Object publicationList = null;
          publicationList = (java.lang.Object) _jspx_page_context.findAttribute("publicationList");
          out.write("\r\n");
          out.write("\t\t\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_24 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_24.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_23);
          _jspx_th_logic_iterate_24.setId("aPublication");
          _jspx_th_logic_iterate_24.setName("publicationList");
          _jspx_th_logic_iterate_24.setType("Publication");
          int _jspx_eval_logic_iterate_24 = _jspx_th_logic_iterate_24.doStartTag();
          if (_jspx_eval_logic_iterate_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            Publication aPublication = null;
            if (_jspx_eval_logic_iterate_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_24.doInitBody();
            }
            aPublication = (Publication) _jspx_page_context.findAttribute("aPublication");
            do {
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_16 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_16.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_24);
              _jspx_th_bean_define_16.setId("aPublicationID");
              _jspx_th_bean_define_16.setName("aPublication");
              _jspx_th_bean_define_16.setProperty("id");
              int _jspx_eval_bean_define_16 = _jspx_th_bean_define_16.doStartTag();
              if (_jspx_th_bean_define_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_16);
              java.lang.Object aPublicationID = null;
              aPublicationID = (java.lang.Object) _jspx_page_context.findAttribute("aPublicationID");
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_17 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_17.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_24);
              _jspx_th_bean_define_17.setId("aTherapyID");
              _jspx_th_bean_define_17.setName("aTherapy");
              _jspx_th_bean_define_17.setProperty("id");
              int _jspx_eval_bean_define_17 = _jspx_th_bean_define_17.doStartTag();
              if (_jspx_th_bean_define_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_17);
              java.lang.Object aTherapyID = null;
              aTherapyID = (java.lang.Object) _jspx_page_context.findAttribute("aTherapyID");
              out.write("\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
              out.write("\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t<img src=\"images/aquadot_red.jpg\" border=\"0\">\r\n");
              out.write("\t\t\t\t<a class=\"subMenuMedRed\"\r\n");
              out.write("\t\t\t\t\thref=\"PublicationPopulateAction.do?method=populate&aPubID=");
              if (_jspx_meth_c_out_10(_jspx_th_logic_iterate_24, _jspx_page_context))
                return;
              out.write("&aTherapyID=");
              if (_jspx_meth_c_out_11(_jspx_th_logic_iterate_24, _jspx_page_context))
                return;
              out.write("\">\r\n");
              out.write("\t\t\t\t\t");
              if (_jspx_meth_camod_shorten_25(_jspx_th_logic_iterate_24, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t</a>\r\n");
              out.write("\t\t\t\t<br>\r\n");
              out.write("\t\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_iterate_24.doAfterBody();
              aPublication = (Publication) _jspx_page_context.findAttribute("aPublication");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_logic_iterate_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_24);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_23.doAfterBody();
          aTherapy = (Therapy) _jspx_page_context.findAttribute("aTherapy");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_23);
      out.write(" <br>\r\n");
      out.write("\t</span>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"menu8\" class=\"masterTitle\" onclick=\"SwitchMenu('sub8')\"\r\n");
      out.write("\t\tonmouseover=\"ChangeClass('menu8','masterTitleOver')\"\r\n");
      out.write("\t\tonmouseout=\"ChangeClass('menu8','masterTitle')\"><IMG height=5 alt=\"\"\r\n");
      out.write("\t\tsrc=\"images/subMenuArrow.gif\" width=5> CELL LINES</div>\r\n");
      out.write("\t<span class=\"submasterdiv\" id=\"sub8\"> <img src=\"images/right_arrow.gif\"\r\n");
      out.write("\t\tborder=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_46(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_25 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_25.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_25.setParent(null);
      _jspx_th_logic_iterate_25.setId("aCell");
      _jspx_th_logic_iterate_25.setName("cellline_list");
      _jspx_th_logic_iterate_25.setType("CellLine");
      int _jspx_eval_logic_iterate_25 = _jspx_th_logic_iterate_25.doStartTag();
      if (_jspx_eval_logic_iterate_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        CellLine aCell = null;
        if (_jspx_eval_logic_iterate_25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_25.doInitBody();
        }
        aCell = (CellLine) _jspx_page_context.findAttribute("aCell");
        do {
          out.write("\t&nbsp;&nbsp;&nbsp;&nbsp;\t\t \r\n");
          out.write("\t\t\t\t\t \r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_47(_jspx_th_logic_iterate_25, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\t\r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/right_arrow.gif\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_48(_jspx_th_logic_iterate_25, _jspx_page_context))
            return;
          out.write("<br>\r\n");
          out.write("\t\r\n");
          out.write("\t\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_18 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_18.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_25);
          _jspx_th_bean_define_18.setId("publicationList");
          _jspx_th_bean_define_18.setName("aCell");
          _jspx_th_bean_define_18.setProperty("publicationCollection");
          int _jspx_eval_bean_define_18 = _jspx_th_bean_define_18.doStartTag();
          if (_jspx_th_bean_define_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_18);
          java.lang.Object publicationList = null;
          publicationList = (java.lang.Object) _jspx_page_context.findAttribute("publicationList");
          out.write("\r\n");
          out.write("\t\t\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_26 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_26.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_25);
          _jspx_th_logic_iterate_26.setId("aPublication");
          _jspx_th_logic_iterate_26.setName("publicationList");
          _jspx_th_logic_iterate_26.setType("Publication");
          int _jspx_eval_logic_iterate_26 = _jspx_th_logic_iterate_26.doStartTag();
          if (_jspx_eval_logic_iterate_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            Publication aPublication = null;
            if (_jspx_eval_logic_iterate_26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_26.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_26.doInitBody();
            }
            aPublication = (Publication) _jspx_page_context.findAttribute("aPublication");
            do {
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_19 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_19.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_26);
              _jspx_th_bean_define_19.setId("aPublicationID");
              _jspx_th_bean_define_19.setName("aPublication");
              _jspx_th_bean_define_19.setProperty("id");
              int _jspx_eval_bean_define_19 = _jspx_th_bean_define_19.doStartTag();
              if (_jspx_th_bean_define_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_19);
              java.lang.Object aPublicationID = null;
              aPublicationID = (java.lang.Object) _jspx_page_context.findAttribute("aPublicationID");
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_20 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_20.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_26);
              _jspx_th_bean_define_20.setId("aCellID");
              _jspx_th_bean_define_20.setName("aCell");
              _jspx_th_bean_define_20.setProperty("id");
              int _jspx_eval_bean_define_20 = _jspx_th_bean_define_20.doStartTag();
              if (_jspx_th_bean_define_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_20);
              java.lang.Object aCellID = null;
              aCellID = (java.lang.Object) _jspx_page_context.findAttribute("aCellID");
              out.write("\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
              out.write("\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t<img src=\"images/aquadot_red.jpg\" border=\"0\">\r\n");
              out.write("\t\t\t\t<a class=\"subMenuMedRed\"\r\n");
              out.write("\t\t\t\t\thref=\"PublicationPopulateAction.do?method=populate&aPubID=");
              if (_jspx_meth_c_out_13(_jspx_th_logic_iterate_26, _jspx_page_context))
                return;
              out.write("&aCellID=");
              if (_jspx_meth_c_out_14(_jspx_th_logic_iterate_26, _jspx_page_context))
                return;
              out.write("\">\r\n");
              out.write("\t\t\t\t\t");
              if (_jspx_meth_camod_shorten_27(_jspx_th_logic_iterate_26, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t</a>\r\n");
              out.write("\t\t\t\t<br>\t\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_iterate_26.doAfterBody();
              aPublication = (Publication) _jspx_page_context.findAttribute("aPublication");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_logic_iterate_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_26);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_25.doAfterBody();
          aCell = (CellLine) _jspx_page_context.findAttribute("aCell");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_25);
      out.write(" <br>\r\n");
      out.write("\t</span>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"menu9\" class=\"masterTitle\" onclick=\"SwitchMenu('sub9')\"\r\n");
      out.write("\t\tonmouseover=\"ChangeClass('menu9','masterTitleOver')\"\r\n");
      out.write("\t\tonmouseout=\"ChangeClass('menu9','masterTitle')\"><IMG height=5 alt=\"\"\r\n");
      out.write("\t\tsrc=\"images/subMenuArrow.gif\" width=5> IMAGES</div>\r\n");
      out.write("\t<span class=\"submasterdiv\" id=\"sub9\"> <img src=\"images/right_arrow.gif\"\r\n");
      out.write("\t\tborder=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_49(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_27 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_27.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_27.setParent(null);
      _jspx_th_logic_iterate_27.setId("aImage");
      _jspx_th_logic_iterate_27.setName("image_list");
      _jspx_th_logic_iterate_27.setType("Image");
      int _jspx_eval_logic_iterate_27 = _jspx_th_logic_iterate_27.doStartTag();
      if (_jspx_eval_logic_iterate_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        Image aImage = null;
        if (_jspx_eval_logic_iterate_27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_27.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_27.doInitBody();
        }
        aImage = (Image) _jspx_page_context.findAttribute("aImage");
        do {
          out.write(" &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_50(_jspx_th_logic_iterate_27, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_27.doAfterBody();
          aImage = (Image) _jspx_page_context.findAttribute("aImage");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_27);
      out.write(" <br>\r\n");
      out.write("\t</span>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"menu10\" class=\"masterTitle\" onclick=\"SwitchMenu('sub10')\"\r\n");
      out.write("\t\tonmouseover=\"ChangeClass('menu10','masterTitleOver')\"\r\n");
      out.write("\t\tonmouseout=\"ChangeClass('menu10','masterTitle')\"><IMG height=5 alt=\"\"\r\n");
      out.write("\t\tsrc=\"images/subMenuArrow.gif\" width=5> MICROARRAYS</div>\r\n");
      out.write("\t<span class=\"submasterdiv\" id=\"sub10\"> <img src=\"images/right_arrow.gif\"\r\n");
      out.write("\t\tborder=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_51(_jspx_page_context))
        return;
      out.write("<br><br>\r\n");
      out.write("\t</span>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"menu11\" class=\"masterTitle\" onclick=\"SwitchMenu('sub11')\"\r\n");
      out.write("\t\t\tonmouseover=\"ChangeClass('menu11','masterTitleOver')\"\r\n");
      out.write("\t\t\tonmouseout=\"ChangeClass('menu11','masterTitle')\"><IMG height=5 alt=\"\"\r\n");
      out.write("\t\t\tsrc=\"images/subMenuArrow.gif\" width=5> MODEL AVAILABILITY</div>\r\n");
      out.write("\t<span class=\"submasterdiv\" id=\"sub11\"> \r\n");
      out.write("\t\r\n");
      out.write("\t\t<img src=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_52(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_28 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_28.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_28.setParent(null);
      _jspx_th_logic_iterate_28.setId("aAvailability");
      _jspx_th_logic_iterate_28.setName("jacksonlab_list");
      _jspx_th_logic_iterate_28.setType("AnimalAvailability");
      int _jspx_eval_logic_iterate_28 = _jspx_th_logic_iterate_28.doStartTag();
      if (_jspx_eval_logic_iterate_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        AnimalAvailability aAvailability = null;
        if (_jspx_eval_logic_iterate_28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_28.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_28.doInitBody();
        }
        aAvailability = (AnimalAvailability) _jspx_page_context.findAttribute("aAvailability");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\t \r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_53(_jspx_th_logic_iterate_28, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_28.doAfterBody();
          aAvailability = (AnimalAvailability) _jspx_page_context.findAttribute("aAvailability");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_28);
      out.write(" \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<img src=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_54(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_29 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_29.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_29.setParent(null);
      _jspx_th_logic_iterate_29.setId("aAvailability");
      _jspx_th_logic_iterate_29.setName("mmhcc_list");
      _jspx_th_logic_iterate_29.setType("AnimalAvailability");
      int _jspx_eval_logic_iterate_29 = _jspx_th_logic_iterate_29.doStartTag();
      if (_jspx_eval_logic_iterate_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        AnimalAvailability aAvailability = null;
        if (_jspx_eval_logic_iterate_29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_29.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_29.doInitBody();
        }
        aAvailability = (AnimalAvailability) _jspx_page_context.findAttribute("aAvailability");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_55(_jspx_th_logic_iterate_29, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_29.doAfterBody();
          aAvailability = (AnimalAvailability) _jspx_page_context.findAttribute("aAvailability");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_29);
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t\t<img src=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_56(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_30 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_30.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_30.setParent(null);
      _jspx_th_logic_iterate_30.setId("aAvailability");
      _jspx_th_logic_iterate_30.setName("investigator_list");
      _jspx_th_logic_iterate_30.setType("AnimalAvailability");
      int _jspx_eval_logic_iterate_30 = _jspx_th_logic_iterate_30.doStartTag();
      if (_jspx_eval_logic_iterate_30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        AnimalAvailability aAvailability = null;
        if (_jspx_eval_logic_iterate_30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_30.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_30.doInitBody();
        }
        aAvailability = (AnimalAvailability) _jspx_page_context.findAttribute("aAvailability");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_57(_jspx_th_logic_iterate_30, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_30.doAfterBody();
          aAvailability = (AnimalAvailability) _jspx_page_context.findAttribute("aAvailability");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_30);
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t\t<img src=\"images/right_arrow.gif\" border=\"0\"> \t\r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_58(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_31 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_31.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_31.setParent(null);
      _jspx_th_logic_iterate_31.setId("aAvailability");
      _jspx_th_logic_iterate_31.setName("imsr_list");
      _jspx_th_logic_iterate_31.setType("AnimalAvailability");
      int _jspx_eval_logic_iterate_31 = _jspx_th_logic_iterate_31.doStartTag();
      if (_jspx_eval_logic_iterate_31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        AnimalAvailability aAvailability = null;
        if (_jspx_eval_logic_iterate_31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_31.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_31.doInitBody();
        }
        aAvailability = (AnimalAvailability) _jspx_page_context.findAttribute("aAvailability");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_59(_jspx_th_logic_iterate_31, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_31.doAfterBody();
          aAvailability = (AnimalAvailability) _jspx_page_context.findAttribute("aAvailability");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_31);
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t\t<img src=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_60(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_32 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_32.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_32.setParent(null);
      _jspx_th_logic_iterate_32.setId("aAvailability");
      _jspx_th_logic_iterate_32.setName("zfin_list");
      _jspx_th_logic_iterate_32.setType("AnimalAvailability");
      int _jspx_eval_logic_iterate_32 = _jspx_th_logic_iterate_32.doStartTag();
      if (_jspx_eval_logic_iterate_32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        AnimalAvailability aAvailability = null;
        if (_jspx_eval_logic_iterate_32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_32.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_32.doInitBody();
        }
        aAvailability = (AnimalAvailability) _jspx_page_context.findAttribute("aAvailability");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_61(_jspx_th_logic_iterate_32, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_32.doAfterBody();
          aAvailability = (AnimalAvailability) _jspx_page_context.findAttribute("aAvailability");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_32);
      out.write("<br>\r\n");
      out.write("\t</span>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"menu12\" class=\"masterTitle\" onclick=\"SwitchMenu('sub12')\"\r\n");
      out.write("\t\tonmouseover=\"ChangeClass('menu12','masterTitleOver')\"\r\n");
      out.write("\t\tonmouseout=\"ChangeClass('menu12','masterTitle')\"><IMG height=5 alt=\"\"\r\n");
      out.write("\t\tsrc=\"images/subMenuArrow.gif\" width=5> TRANSPLANT</div>\r\n");
      out.write("\t<span class=\"submasterdiv\" id=\"sub12\"> <img\r\n");
      out.write("\t\tsrc=\"images/right_arrow.gif\" border=\"0\"> \r\n");
      out.write("\t\t");
      if (_jspx_meth_html_link_62(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_33 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_33.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_33.setParent(null);
      _jspx_th_logic_iterate_33.setId("aTransplant");
      _jspx_th_logic_iterate_33.setName("transplant_list");
      _jspx_th_logic_iterate_33.setType("Transplant");
      int _jspx_eval_logic_iterate_33 = _jspx_th_logic_iterate_33.doStartTag();
      if (_jspx_eval_logic_iterate_33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        Transplant aTransplant = null;
        if (_jspx_eval_logic_iterate_33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_33.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_33.doInitBody();
        }
        aTransplant = (Transplant) _jspx_page_context.findAttribute("aTransplant");
        do {
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<img src=\"images/aquadot.jpg\" border=\"0\">\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_html_link_63(_jspx_th_logic_iterate_33, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_33.doAfterBody();
          aTransplant = (Transplant) _jspx_page_context.findAttribute("aTransplant");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_33);
      out.write(" <br>\r\n");
      out.write("\t</span></DIV>\r\n");
      out.write("\r\n");
      out.write("\t</TD>\r\n");
      out.write("</TR>\r\n");
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

  private boolean _jspx_meth_html_link_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_2 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_2.setPageContext(_jspx_page_context);
    _jspx_th_html_link_2.setParent(null);
    _jspx_th_html_link_2.setStyleClass("subMenuRed");
    _jspx_th_html_link_2.setAction("EngineeredTransgenePopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_2 = _jspx_th_html_link_2.doStartTag();
    if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\tEnter Transgene\r\n");
        out.write("\t\t");
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

  private boolean _jspx_meth_html_link_3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_3 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_3.setPageContext(_jspx_page_context);
    _jspx_th_html_link_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_html_link_3.setStyleClass("subMenuBlue");
    _jspx_th_html_link_3.setAction("EngineeredTransgenePopulateAction.do?method=populate");
    _jspx_th_html_link_3.setParamId("aEngineeredTransgeneID");
    _jspx_th_html_link_3.setParamName("aEngineeredTransgene");
    _jspx_th_html_link_3.setParamProperty("id");
    int _jspx_eval_html_link_3 = _jspx_th_html_link_3.doStartTag();
    if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_1(_jspx_th_html_link_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_3);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_1 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_1.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_3);
    int _jspx_eval_camod_shorten_1 = _jspx_th_camod_shorten_1.doStartTag();
    if (_jspx_eval_camod_shorten_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_1.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_0(_jspx_th_camod_shorten_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_1);
    return false;
  }

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_1);
    _jspx_th_bean_write_0.setName("aEngineeredTransgene");
    _jspx_th_bean_write_0.setProperty("name");
    _jspx_th_bean_write_0.setFilter(false);
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_0);
    return false;
  }

  private boolean _jspx_meth_html_link_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_4 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_4.setPageContext(_jspx_page_context);
    _jspx_th_html_link_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_html_link_4.setStyleClass("subMenuDarkRed");
    _jspx_th_html_link_4.setAction("AssociatedExpressionPopulateAction.do?method=dropdown");
    _jspx_th_html_link_4.setParamId("aEngineeredTransgeneID");
    _jspx_th_html_link_4.setParamName("aEngineeredTransgene");
    _jspx_th_html_link_4.setParamProperty("id");
    int _jspx_eval_html_link_4 = _jspx_th_html_link_4.doStartTag();
    if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_4.doInitBody();
      }
      do {
        out.write("Enter Assoc Expression\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_4);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_c_out_0.setValue("${ aAssociatedExpressionID }");
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_c_out_1.setValue("${ aEngineeredTransgeneID }");
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_2 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten_length.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_2.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_camod_shorten_2.setLength("21");
    int _jspx_eval_camod_shorten_2 = _jspx_th_camod_shorten_2.doStartTag();
    if (_jspx_eval_camod_shorten_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_2.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_1(_jspx_th_camod_shorten_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten_length.reuse(_jspx_th_camod_shorten_2);
    return false;
  }

  private boolean _jspx_meth_bean_write_1(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_2);
    _jspx_th_bean_write_1.setName("aExpressionFeature");
    _jspx_th_bean_write_1.setProperty("organ.name");
    _jspx_th_bean_write_1.setFilter(false);
    int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
    if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_1);
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
    _jspx_th_html_link_5.setStyleClass("subMenuRed");
    _jspx_th_html_link_5.setAction("GenomicSegmentPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_5 = _jspx_th_html_link_5.doStartTag();
    if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_5.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\tEnter Genomic Segment\r\n");
        out.write("\t\t");
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

  private boolean _jspx_meth_html_link_6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_6 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_6.setPageContext(_jspx_page_context);
    _jspx_th_html_link_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_2);
    _jspx_th_html_link_6.setStyleClass("subMenuBlue");
    _jspx_th_html_link_6.setAction("GenomicSegmentPopulateAction.do?method=populate");
    _jspx_th_html_link_6.setParamId("aGenomicSegmentID");
    _jspx_th_html_link_6.setParamName("aGenomicSegment");
    _jspx_th_html_link_6.setParamProperty("id");
    int _jspx_eval_html_link_6 = _jspx_th_html_link_6.doStartTag();
    if (_jspx_eval_html_link_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_6.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_3(_jspx_th_html_link_6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_6);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_3 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_3.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_6);
    int _jspx_eval_camod_shorten_3 = _jspx_th_camod_shorten_3.doStartTag();
    if (_jspx_eval_camod_shorten_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_3.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_2(_jspx_th_camod_shorten_3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_3);
    return false;
  }

  private boolean _jspx_meth_bean_write_2(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_2 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_3);
    _jspx_th_bean_write_2.setName("aGenomicSegment");
    _jspx_th_bean_write_2.setProperty("cloneDesignator");
    _jspx_th_bean_write_2.setFilter(false);
    int _jspx_eval_bean_write_2 = _jspx_th_bean_write_2.doStartTag();
    if (_jspx_th_bean_write_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_2);
    return false;
  }

  private boolean _jspx_meth_html_link_7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_7 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_7.setPageContext(_jspx_page_context);
    _jspx_th_html_link_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_2);
    _jspx_th_html_link_7.setStyleClass("subMenuDarkRed");
    _jspx_th_html_link_7.setAction("AssociatedExpressionPopulateAction.do?method=dropdown");
    _jspx_th_html_link_7.setParamId("aGenomicSegmentID");
    _jspx_th_html_link_7.setParamName("aGenomicSegment");
    _jspx_th_html_link_7.setParamProperty("id");
    int _jspx_eval_html_link_7 = _jspx_th_html_link_7.doStartTag();
    if (_jspx_eval_html_link_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_7.doInitBody();
      }
      do {
        out.write("Enter Assoc Expression\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_7);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_3);
    _jspx_th_c_out_2.setValue("${ aAssociatedExpressionID }");
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_3);
    _jspx_th_c_out_3.setValue("${ aGenomicSegmentID }");
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_4 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten_length.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_4.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_3);
    _jspx_th_camod_shorten_4.setLength("21");
    int _jspx_eval_camod_shorten_4 = _jspx_th_camod_shorten_4.doStartTag();
    if (_jspx_eval_camod_shorten_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_4.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_3(_jspx_th_camod_shorten_4, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten_length.reuse(_jspx_th_camod_shorten_4);
    return false;
  }

  private boolean _jspx_meth_bean_write_3(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_3 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_3.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_4);
    _jspx_th_bean_write_3.setName("aExpressionFeature");
    _jspx_th_bean_write_3.setProperty("organ.name");
    _jspx_th_bean_write_3.setFilter(false);
    int _jspx_eval_bean_write_3 = _jspx_th_bean_write_3.doStartTag();
    if (_jspx_th_bean_write_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_3);
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
    _jspx_th_html_link_8.setStyleClass("subMenuRed");
    _jspx_th_html_link_8.setAction("TargetedModificationPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_8 = _jspx_th_html_link_8.doStartTag();
    if (_jspx_eval_html_link_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_8.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\tEnter Targeted Modification\r\n");
        out.write("\t\t");
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

  private boolean _jspx_meth_html_link_9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_9 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_9.setPageContext(_jspx_page_context);
    _jspx_th_html_link_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_4);
    _jspx_th_html_link_9.setStyleClass("subMenuBlue");
    _jspx_th_html_link_9.setAction("TargetedModificationPopulateAction.do?method=populate");
    _jspx_th_html_link_9.setParamId("aTargetedModificationID");
    _jspx_th_html_link_9.setParamName("aTargetedModification");
    _jspx_th_html_link_9.setParamProperty("id");
    int _jspx_eval_html_link_9 = _jspx_th_html_link_9.doStartTag();
    if (_jspx_eval_html_link_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_9.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_5(_jspx_th_html_link_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_9);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_5 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_5.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_9);
    int _jspx_eval_camod_shorten_5 = _jspx_th_camod_shorten_5.doStartTag();
    if (_jspx_eval_camod_shorten_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_5.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_4(_jspx_th_camod_shorten_5, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_5);
    return false;
  }

  private boolean _jspx_meth_bean_write_4(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_4 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_4.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_5);
    _jspx_th_bean_write_4.setName("aTargetedModification");
    _jspx_th_bean_write_4.setProperty("name");
    _jspx_th_bean_write_4.setFilter(false);
    int _jspx_eval_bean_write_4 = _jspx_th_bean_write_4.doStartTag();
    if (_jspx_th_bean_write_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_4);
    return false;
  }

  private boolean _jspx_meth_html_link_10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_10 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_10.setPageContext(_jspx_page_context);
    _jspx_th_html_link_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_4);
    _jspx_th_html_link_10.setStyleClass("subMenuDarkRed");
    _jspx_th_html_link_10.setAction("AssociatedExpressionPopulateAction.do?method=dropdown");
    _jspx_th_html_link_10.setParamId("aTargetedModificationID");
    _jspx_th_html_link_10.setParamName("aTargetedModification");
    _jspx_th_html_link_10.setParamProperty("id");
    int _jspx_eval_html_link_10 = _jspx_th_html_link_10.doStartTag();
    if (_jspx_eval_html_link_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_10.doInitBody();
      }
      do {
        out.write("Enter Assoc Expression\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_10);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_5);
    _jspx_th_c_out_4.setValue("${ aAssociatedExpressionID }");
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_5);
    _jspx_th_c_out_5.setValue("${ aTargetedModificationID }");
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_6 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten_length.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_6.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_5);
    _jspx_th_camod_shorten_6.setLength("21");
    int _jspx_eval_camod_shorten_6 = _jspx_th_camod_shorten_6.doStartTag();
    if (_jspx_eval_camod_shorten_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_6.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_5(_jspx_th_camod_shorten_6, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten_length.reuse(_jspx_th_camod_shorten_6);
    return false;
  }

  private boolean _jspx_meth_bean_write_5(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_5 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_5.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_6);
    _jspx_th_bean_write_5.setName("aExpressionFeature");
    _jspx_th_bean_write_5.setProperty("organ.name");
    _jspx_th_bean_write_5.setFilter(false);
    int _jspx_eval_bean_write_5 = _jspx_th_bean_write_5.doStartTag();
    if (_jspx_th_bean_write_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_5);
    return false;
  }

  private boolean _jspx_meth_html_link_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_11 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_11.setPageContext(_jspx_page_context);
    _jspx_th_html_link_11.setParent(null);
    _jspx_th_html_link_11.setStyleClass("subMenuRed");
    _jspx_th_html_link_11.setAction("InducedMutationPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_11 = _jspx_th_html_link_11.doStartTag();
    if (_jspx_eval_html_link_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_11.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\tEnter Induced Mutation\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_11);
    return false;
  }

  private boolean _jspx_meth_html_link_12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_12 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_12.setPageContext(_jspx_page_context);
    _jspx_th_html_link_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_6);
    _jspx_th_html_link_12.setStyleClass("subMenuBlue");
    _jspx_th_html_link_12.setAction("InducedMutationPopulateAction.do?method=populate");
    _jspx_th_html_link_12.setParamId("aInducedMutationID");
    _jspx_th_html_link_12.setParamName("aInducedMutation");
    _jspx_th_html_link_12.setParamProperty("id");
    int _jspx_eval_html_link_12 = _jspx_th_html_link_12.doStartTag();
    if (_jspx_eval_html_link_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_12.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_7(_jspx_th_html_link_12, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_12);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_7 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_7.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_12);
    int _jspx_eval_camod_shorten_7 = _jspx_th_camod_shorten_7.doStartTag();
    if (_jspx_eval_camod_shorten_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_7.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_6(_jspx_th_camod_shorten_7, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_7);
    return false;
  }

  private boolean _jspx_meth_bean_write_6(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_6 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_6.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_7);
    _jspx_th_bean_write_6.setName("aInducedMutation");
    _jspx_th_bean_write_6.setProperty("environmentalFactor.displayNameIM");
    _jspx_th_bean_write_6.setFilter(false);
    int _jspx_eval_bean_write_6 = _jspx_th_bean_write_6.doStartTag();
    if (_jspx_th_bean_write_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_6);
    return false;
  }

  private boolean _jspx_meth_html_link_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_13 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_13.setPageContext(_jspx_page_context);
    _jspx_th_html_link_13.setParent(null);
    _jspx_th_html_link_13.setStyleClass("subMenuRed");
    _jspx_th_html_link_13.setAction("SpontaneousMutationPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_13 = _jspx_th_html_link_13.doStartTag();
    if (_jspx_eval_html_link_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_13.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Spontaneous Mutation\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_13);
    return false;
  }

  private boolean _jspx_meth_html_link_14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_14 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_14.setPageContext(_jspx_page_context);
    _jspx_th_html_link_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_7);
    _jspx_th_html_link_14.setStyleClass("subMenuBlue");
    _jspx_th_html_link_14.setAction("SpontaneousMutationPopulateAction.do?method=populate");
    _jspx_th_html_link_14.setParamId("aSpontaneousMutationID");
    _jspx_th_html_link_14.setParamName("aSpontaneousMutation");
    _jspx_th_html_link_14.setParamProperty("id");
    int _jspx_eval_html_link_14 = _jspx_th_html_link_14.doStartTag();
    if (_jspx_eval_html_link_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_14.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_8(_jspx_th_html_link_14, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_14);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_8 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_8.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_14);
    int _jspx_eval_camod_shorten_8 = _jspx_th_camod_shorten_8.doStartTag();
    if (_jspx_eval_camod_shorten_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_8.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_7(_jspx_th_camod_shorten_8, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_8);
    return false;
  }

  private boolean _jspx_meth_bean_write_7(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_7 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_7.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_8);
    _jspx_th_bean_write_7.setName("aSpontaneousMutation");
    _jspx_th_bean_write_7.setProperty("name");
    _jspx_th_bean_write_7.setFilter(false);
    int _jspx_eval_bean_write_7 = _jspx_th_bean_write_7.doStartTag();
    if (_jspx_th_bean_write_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_7);
    return false;
  }

  private boolean _jspx_meth_html_link_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_15 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_15.setPageContext(_jspx_page_context);
    _jspx_th_html_link_15.setParent(null);
    _jspx_th_html_link_15.setStyleClass("subMenuRed");
    _jspx_th_html_link_15.setAction("ChemicalDrugPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_15 = _jspx_th_html_link_15.doStartTag();
    if (_jspx_eval_html_link_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_15.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Chemical/Drug\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_15);
    return false;
  }

  private boolean _jspx_meth_html_link_16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_16 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_16.setPageContext(_jspx_page_context);
    _jspx_th_html_link_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_8);
    _jspx_th_html_link_16.setStyleClass("subMenuBlue");
    _jspx_th_html_link_16.setAction("ChemicalDrugPopulateAction.do?method=populate");
    _jspx_th_html_link_16.setParamId("aCarcinogenExposureID");
    _jspx_th_html_link_16.setParamName("aCarcinogenExposure");
    _jspx_th_html_link_16.setParamProperty("id");
    int _jspx_eval_html_link_16 = _jspx_th_html_link_16.doStartTag();
    if (_jspx_eval_html_link_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_16.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_9(_jspx_th_html_link_16, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_16);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_9 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_9.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_16);
    int _jspx_eval_camod_shorten_9 = _jspx_th_camod_shorten_9.doStartTag();
    if (_jspx_eval_camod_shorten_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_9.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_8(_jspx_th_camod_shorten_9, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_9);
    return false;
  }

  private boolean _jspx_meth_bean_write_8(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_8 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_8.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_9);
    _jspx_th_bean_write_8.setName("aCarcinogenExposure");
    _jspx_th_bean_write_8.setProperty("environmentalFactor.displayName");
    _jspx_th_bean_write_8.setFilter(false);
    int _jspx_eval_bean_write_8 = _jspx_th_bean_write_8.doStartTag();
    if (_jspx_th_bean_write_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_8);
    return false;
  }

  private boolean _jspx_meth_html_link_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_17 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_17.setPageContext(_jspx_page_context);
    _jspx_th_html_link_17.setParent(null);
    _jspx_th_html_link_17.setStyleClass("subMenuRed");
    _jspx_th_html_link_17.setAction("EnvironmentalFactorPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_17 = _jspx_th_html_link_17.doStartTag();
    if (_jspx_eval_html_link_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_17.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Environmental Factor\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_17);
    return false;
  }

  private boolean _jspx_meth_html_link_18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_18 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_18.setPageContext(_jspx_page_context);
    _jspx_th_html_link_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_9);
    _jspx_th_html_link_18.setStyleClass("subMenuBlue");
    _jspx_th_html_link_18.setAction("EnvironmentalFactorPopulateAction.do?method=populate");
    _jspx_th_html_link_18.setParamId("aCarcinogenExposureID");
    _jspx_th_html_link_18.setParamName("aCarcinogenExposure");
    _jspx_th_html_link_18.setParamProperty("id");
    int _jspx_eval_html_link_18 = _jspx_th_html_link_18.doStartTag();
    if (_jspx_eval_html_link_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_18.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_10(_jspx_th_html_link_18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_18);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_10 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_10.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_18);
    int _jspx_eval_camod_shorten_10 = _jspx_th_camod_shorten_10.doStartTag();
    if (_jspx_eval_camod_shorten_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_10.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_9(_jspx_th_camod_shorten_10, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_10);
    return false;
  }

  private boolean _jspx_meth_bean_write_9(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_9 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_9.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_10);
    _jspx_th_bean_write_9.setName("aCarcinogenExposure");
    _jspx_th_bean_write_9.setProperty("environmentalFactor.displayName");
    _jspx_th_bean_write_9.setFilter(false);
    int _jspx_eval_bean_write_9 = _jspx_th_bean_write_9.doStartTag();
    if (_jspx_th_bean_write_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_9);
    return false;
  }

  private boolean _jspx_meth_html_link_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_19 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_19.setPageContext(_jspx_page_context);
    _jspx_th_html_link_19.setParent(null);
    _jspx_th_html_link_19.setStyleClass("subMenuRed");
    _jspx_th_html_link_19.setAction("GeneDeliveryPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_19 = _jspx_th_html_link_19.doStartTag();
    if (_jspx_eval_html_link_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_19.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Gene Delivery\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_19);
    return false;
  }

  private boolean _jspx_meth_html_link_20(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_20 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_20.setPageContext(_jspx_page_context);
    _jspx_th_html_link_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_10);
    _jspx_th_html_link_20.setStyleClass("subMenuBlue");
    _jspx_th_html_link_20.setAction("GeneDeliveryPopulateAction.do?method=populate");
    _jspx_th_html_link_20.setParamId("aCarcinogenExposureID");
    _jspx_th_html_link_20.setParamName("aCarcinogenExposure");
    _jspx_th_html_link_20.setParamProperty("id");
    int _jspx_eval_html_link_20 = _jspx_th_html_link_20.doStartTag();
    if (_jspx_eval_html_link_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_20.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_11(_jspx_th_html_link_20, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_20);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_11 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_11.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_20);
    int _jspx_eval_camod_shorten_11 = _jspx_th_camod_shorten_11.doStartTag();
    if (_jspx_eval_camod_shorten_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_11.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_10(_jspx_th_camod_shorten_11, _jspx_page_context))
          return true;
        out.write(' ');
        int evalDoAfterBody = _jspx_th_camod_shorten_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_11);
    return false;
  }

  private boolean _jspx_meth_bean_write_10(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_10 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_10.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_11);
    _jspx_th_bean_write_10.setName("aCarcinogenExposure");
    _jspx_th_bean_write_10.setProperty("geneInVirus");
    _jspx_th_bean_write_10.setFilter(false);
    int _jspx_eval_bean_write_10 = _jspx_th_bean_write_10.doStartTag();
    if (_jspx_th_bean_write_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_10);
    return false;
  }

  private boolean _jspx_meth_html_link_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_21 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_21.setPageContext(_jspx_page_context);
    _jspx_th_html_link_21.setParent(null);
    _jspx_th_html_link_21.setStyleClass("subMenuRed");
    _jspx_th_html_link_21.setAction("GrowthFactorPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_21 = _jspx_th_html_link_21.doStartTag();
    if (_jspx_eval_html_link_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_21.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Growth Factor\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_21);
    return false;
  }

  private boolean _jspx_meth_html_link_22(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_22 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_22.setPageContext(_jspx_page_context);
    _jspx_th_html_link_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_11);
    _jspx_th_html_link_22.setStyleClass("subMenuBlue");
    _jspx_th_html_link_22.setAction("GrowthFactorPopulateAction.do?method=populate");
    _jspx_th_html_link_22.setParamId("aCarcinogenExposureID");
    _jspx_th_html_link_22.setParamName("aCarcinogenExposure");
    _jspx_th_html_link_22.setParamProperty("id");
    int _jspx_eval_html_link_22 = _jspx_th_html_link_22.doStartTag();
    if (_jspx_eval_html_link_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_22.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_12(_jspx_th_html_link_22, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_22);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_12 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_12.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_22);
    int _jspx_eval_camod_shorten_12 = _jspx_th_camod_shorten_12.doStartTag();
    if (_jspx_eval_camod_shorten_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_12.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_11(_jspx_th_camod_shorten_12, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_12);
    return false;
  }

  private boolean _jspx_meth_bean_write_11(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_11 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_11.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_12);
    _jspx_th_bean_write_11.setName("aCarcinogenExposure");
    _jspx_th_bean_write_11.setProperty("environmentalFactor.displayName");
    _jspx_th_bean_write_11.setFilter(false);
    int _jspx_eval_bean_write_11 = _jspx_th_bean_write_11.doStartTag();
    if (_jspx_th_bean_write_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_11);
    return false;
  }

  private boolean _jspx_meth_html_link_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_23 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_23.setPageContext(_jspx_page_context);
    _jspx_th_html_link_23.setParent(null);
    _jspx_th_html_link_23.setStyleClass("subMenuRed");
    _jspx_th_html_link_23.setAction("HormonePopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_23 = _jspx_th_html_link_23.doStartTag();
    if (_jspx_eval_html_link_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_23.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Hormone\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_23);
    return false;
  }

  private boolean _jspx_meth_html_link_24(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_24 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_24.setPageContext(_jspx_page_context);
    _jspx_th_html_link_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_12);
    _jspx_th_html_link_24.setStyleClass("subMenuBlue");
    _jspx_th_html_link_24.setAction("HormonePopulateAction.do?method=populate");
    _jspx_th_html_link_24.setParamId("aCarcinogenExposureID");
    _jspx_th_html_link_24.setParamName("aCarcinogenExposure");
    _jspx_th_html_link_24.setParamProperty("id");
    int _jspx_eval_html_link_24 = _jspx_th_html_link_24.doStartTag();
    if (_jspx_eval_html_link_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_24.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_13(_jspx_th_html_link_24, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_24);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_13(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_13 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_13.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_24);
    int _jspx_eval_camod_shorten_13 = _jspx_th_camod_shorten_13.doStartTag();
    if (_jspx_eval_camod_shorten_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_13.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_12(_jspx_th_camod_shorten_13, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_13);
    return false;
  }

  private boolean _jspx_meth_bean_write_12(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_12 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_12.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_13);
    _jspx_th_bean_write_12.setName("aCarcinogenExposure");
    _jspx_th_bean_write_12.setProperty("environmentalFactor.displayName");
    _jspx_th_bean_write_12.setFilter(false);
    int _jspx_eval_bean_write_12 = _jspx_th_bean_write_12.doStartTag();
    if (_jspx_th_bean_write_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_12);
    return false;
  }

  private boolean _jspx_meth_html_link_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_25 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_25.setPageContext(_jspx_page_context);
    _jspx_th_html_link_25.setParent(null);
    _jspx_th_html_link_25.setStyleClass("subMenuRed");
    _jspx_th_html_link_25.setAction("NutritionalFactorPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_25 = _jspx_th_html_link_25.doStartTag();
    if (_jspx_eval_html_link_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_25.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Nutritional Factor\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_25);
    return false;
  }

  private boolean _jspx_meth_html_link_26(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_26 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_26.setPageContext(_jspx_page_context);
    _jspx_th_html_link_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_13);
    _jspx_th_html_link_26.setStyleClass("subMenuBlue");
    _jspx_th_html_link_26.setAction("NutritionalFactorPopulateAction.do?method=populate");
    _jspx_th_html_link_26.setParamId("aCarcinogenExposureID");
    _jspx_th_html_link_26.setParamName("aCarcinogenExposure");
    _jspx_th_html_link_26.setParamProperty("id");
    int _jspx_eval_html_link_26 = _jspx_th_html_link_26.doStartTag();
    if (_jspx_eval_html_link_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_26.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_26.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_14(_jspx_th_html_link_26, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_26);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_14(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_14 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_14.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_26);
    int _jspx_eval_camod_shorten_14 = _jspx_th_camod_shorten_14.doStartTag();
    if (_jspx_eval_camod_shorten_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_14.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_13(_jspx_th_camod_shorten_14, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_14);
    return false;
  }

  private boolean _jspx_meth_bean_write_13(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_13 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_13.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_14);
    _jspx_th_bean_write_13.setName("aCarcinogenExposure");
    _jspx_th_bean_write_13.setProperty("environmentalFactor.displayName");
    _jspx_th_bean_write_13.setFilter(false);
    int _jspx_eval_bean_write_13 = _jspx_th_bean_write_13.doStartTag();
    if (_jspx_th_bean_write_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_13);
    return false;
  }

  private boolean _jspx_meth_html_link_27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_27 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_27.setPageContext(_jspx_page_context);
    _jspx_th_html_link_27.setParent(null);
    _jspx_th_html_link_27.setStyleClass("subMenuRed");
    _jspx_th_html_link_27.setAction("RadiationPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_27 = _jspx_th_html_link_27.doStartTag();
    if (_jspx_eval_html_link_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_27.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_27.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Radiation\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_27);
    return false;
  }

  private boolean _jspx_meth_html_link_28(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_28 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_28.setPageContext(_jspx_page_context);
    _jspx_th_html_link_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_14);
    _jspx_th_html_link_28.setStyleClass("subMenuBlue");
    _jspx_th_html_link_28.setAction("RadiationPopulateAction.do?method=populate");
    _jspx_th_html_link_28.setParamId("aCarcinogenExposureID");
    _jspx_th_html_link_28.setParamName("aCarcinogenExposure");
    _jspx_th_html_link_28.setParamProperty("id");
    int _jspx_eval_html_link_28 = _jspx_th_html_link_28.doStartTag();
    if (_jspx_eval_html_link_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_28.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_28.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_15(_jspx_th_html_link_28, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_28);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_15(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_15 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_15.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_28);
    int _jspx_eval_camod_shorten_15 = _jspx_th_camod_shorten_15.doStartTag();
    if (_jspx_eval_camod_shorten_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_15.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_14(_jspx_th_camod_shorten_15, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_15);
    return false;
  }

  private boolean _jspx_meth_bean_write_14(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_14 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_14.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_15);
    _jspx_th_bean_write_14.setName("aCarcinogenExposure");
    _jspx_th_bean_write_14.setProperty("environmentalFactor.displayName");
    _jspx_th_bean_write_14.setFilter(false);
    int _jspx_eval_bean_write_14 = _jspx_th_bean_write_14.doStartTag();
    if (_jspx_th_bean_write_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_14);
    return false;
  }

  private boolean _jspx_meth_html_link_29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_29 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_29.setPageContext(_jspx_page_context);
    _jspx_th_html_link_29.setParent(null);
    _jspx_th_html_link_29.setStyleClass("subMenuRed");
    _jspx_th_html_link_29.setAction("SurgeryPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_29 = _jspx_th_html_link_29.doStartTag();
    if (_jspx_eval_html_link_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_29.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_29.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Surgery/Other\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_29);
    return false;
  }

  private boolean _jspx_meth_html_link_30(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_30 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_30.setPageContext(_jspx_page_context);
    _jspx_th_html_link_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_15);
    _jspx_th_html_link_30.setStyleClass("subMenuBlue");
    _jspx_th_html_link_30.setAction("SurgeryPopulateAction.do?method=populate");
    _jspx_th_html_link_30.setParamId("aCarcinogenExposureID");
    _jspx_th_html_link_30.setParamName("aCarcinogenExposure");
    _jspx_th_html_link_30.setParamProperty("id");
    int _jspx_eval_html_link_30 = _jspx_th_html_link_30.doStartTag();
    if (_jspx_eval_html_link_30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_30.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_30.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_16(_jspx_th_html_link_30, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_30.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_30);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_16(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_16 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_16.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_30);
    int _jspx_eval_camod_shorten_16 = _jspx_th_camod_shorten_16.doStartTag();
    if (_jspx_eval_camod_shorten_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_16.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_15(_jspx_th_camod_shorten_16, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_16);
    return false;
  }

  private boolean _jspx_meth_bean_write_15(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_15 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_15.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_16);
    _jspx_th_bean_write_15.setName("aCarcinogenExposure");
    _jspx_th_bean_write_15.setProperty("environmentalFactor.displayName");
    _jspx_th_bean_write_15.setFilter(false);
    int _jspx_eval_bean_write_15 = _jspx_th_bean_write_15.doStartTag();
    if (_jspx_th_bean_write_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_15);
    return false;
  }

  private boolean _jspx_meth_html_link_31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_31 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_31.setPageContext(_jspx_page_context);
    _jspx_th_html_link_31.setParent(null);
    _jspx_th_html_link_31.setStyleClass("subMenuRed");
    _jspx_th_html_link_31.setAction("ViralTreatmentPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_31 = _jspx_th_html_link_31.doStartTag();
    if (_jspx_eval_html_link_31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_31.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_31.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Viral Treatment\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_31.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_31);
    return false;
  }

  private boolean _jspx_meth_html_link_32(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_32 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_32.setPageContext(_jspx_page_context);
    _jspx_th_html_link_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_16);
    _jspx_th_html_link_32.setStyleClass("subMenuBlue");
    _jspx_th_html_link_32.setAction("ViralTreatmentPopulateAction.do?method=populate");
    _jspx_th_html_link_32.setParamId("aCarcinogenExposureID");
    _jspx_th_html_link_32.setParamName("aCarcinogenExposure");
    _jspx_th_html_link_32.setParamProperty("id");
    int _jspx_eval_html_link_32 = _jspx_th_html_link_32.doStartTag();
    if (_jspx_eval_html_link_32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_32.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_32.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_17(_jspx_th_html_link_32, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_32.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_32);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_17(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_32, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_17 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_17.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_32);
    int _jspx_eval_camod_shorten_17 = _jspx_th_camod_shorten_17.doStartTag();
    if (_jspx_eval_camod_shorten_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_17.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_16(_jspx_th_camod_shorten_17, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_17);
    return false;
  }

  private boolean _jspx_meth_bean_write_16(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_16 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_16.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_17);
    _jspx_th_bean_write_16.setName("aCarcinogenExposure");
    _jspx_th_bean_write_16.setProperty("environmentalFactor.displayName");
    _jspx_th_bean_write_16.setFilter(false);
    int _jspx_eval_bean_write_16 = _jspx_th_bean_write_16.doStartTag();
    if (_jspx_th_bean_write_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_16);
    return false;
  }

  private boolean _jspx_meth_html_link_33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_33 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_33.setPageContext(_jspx_page_context);
    _jspx_th_html_link_33.setParent(null);
    _jspx_th_html_link_33.setStyleClass("subMenuRed");
    _jspx_th_html_link_33.setAction("MorpholinoPopulateAction.do?method=dropdown&aConceptCode=C60700");
    int _jspx_eval_html_link_33 = _jspx_th_html_link_33.doStartTag();
    if (_jspx_eval_html_link_33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_33.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_33.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\tEnter Morpholino\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_33.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_33);
    return false;
  }

  private boolean _jspx_meth_html_link_34(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_34 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_34.setPageContext(_jspx_page_context);
    _jspx_th_html_link_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_17);
    _jspx_th_html_link_34.setStyleClass("subMenuBlue");
    _jspx_th_html_link_34.setAction("MorpholinoPopulateAction.do?method=populate");
    _jspx_th_html_link_34.setParamId("aTransIntID");
    _jspx_th_html_link_34.setParamName("aTransInt");
    _jspx_th_html_link_34.setParamProperty("id");
    int _jspx_eval_html_link_34 = _jspx_th_html_link_34.doStartTag();
    if (_jspx_eval_html_link_34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_34 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_34.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_34.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_18(_jspx_th_html_link_34, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_34.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_34 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_34);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_18(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_34, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_18 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_18.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_34);
    int _jspx_eval_camod_shorten_18 = _jspx_th_camod_shorten_18.doStartTag();
    if (_jspx_eval_camod_shorten_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_18.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_17(_jspx_th_camod_shorten_18, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_18);
    return false;
  }

  private boolean _jspx_meth_bean_write_17(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_17 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_17.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_18);
    _jspx_th_bean_write_17.setName("aTransInt");
    _jspx_th_bean_write_17.setProperty("targetedRegion");
    _jspx_th_bean_write_17.setFilter(false);
    int _jspx_eval_bean_write_17 = _jspx_th_bean_write_17.doStartTag();
    if (_jspx_th_bean_write_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_17);
    return false;
  }

  private boolean _jspx_meth_html_link_35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_35 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_35.setPageContext(_jspx_page_context);
    _jspx_th_html_link_35.setParent(null);
    _jspx_th_html_link_35.setStyleClass("subMenuRed");
    _jspx_th_html_link_35.setAction("SirnaPopulateAction.do?method=dropdown&aConceptCode=C2191");
    int _jspx_eval_html_link_35 = _jspx_th_html_link_35.doStartTag();
    if (_jspx_eval_html_link_35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_35 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_35.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_35.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\tEnter siRNA\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_35.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_35 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_35);
    return false;
  }

  private boolean _jspx_meth_html_link_36(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_36 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_36.setPageContext(_jspx_page_context);
    _jspx_th_html_link_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_18);
    _jspx_th_html_link_36.setStyleClass("subMenuBlue");
    _jspx_th_html_link_36.setAction("SirnaPopulateAction.do?method=populate");
    _jspx_th_html_link_36.setParamId("aTransIntID");
    _jspx_th_html_link_36.setParamName("aTransInt");
    _jspx_th_html_link_36.setParamProperty("id");
    int _jspx_eval_html_link_36 = _jspx_th_html_link_36.doStartTag();
    if (_jspx_eval_html_link_36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_36 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_36.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_36.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_19(_jspx_th_html_link_36, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_36.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_36 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_36);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_19(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_36, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_19 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_19.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_36);
    int _jspx_eval_camod_shorten_19 = _jspx_th_camod_shorten_19.doStartTag();
    if (_jspx_eval_camod_shorten_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_19.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_18(_jspx_th_camod_shorten_19, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_19);
    return false;
  }

  private boolean _jspx_meth_bean_write_18(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_18 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_18.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_19);
    _jspx_th_bean_write_18.setName("aTransInt");
    _jspx_th_bean_write_18.setProperty("targetedRegion");
    _jspx_th_bean_write_18.setFilter(false);
    int _jspx_eval_bean_write_18 = _jspx_th_bean_write_18.doStartTag();
    if (_jspx_th_bean_write_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_18);
    return false;
  }

  private boolean _jspx_meth_html_link_37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_37 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_37.setPageContext(_jspx_page_context);
    _jspx_th_html_link_37.setParent(null);
    _jspx_th_html_link_37.setStyleClass("subMenuRed");
    _jspx_th_html_link_37.setAction("PublicationPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_37 = _jspx_th_html_link_37.doStartTag();
    if (_jspx_eval_html_link_37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_37 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_37.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_37.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Publications\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_37.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_37 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_37);
    return false;
  }

  private boolean _jspx_meth_html_link_38(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_38 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_38.setPageContext(_jspx_page_context);
    _jspx_th_html_link_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_19);
    _jspx_th_html_link_38.setStyleClass("subMenuBlue");
    _jspx_th_html_link_38.setAction("PublicationPopulateAction.do?method=populate");
    _jspx_th_html_link_38.setParamId("aPubID");
    _jspx_th_html_link_38.setParamName("aPub");
    _jspx_th_html_link_38.setParamProperty("id");
    int _jspx_eval_html_link_38 = _jspx_th_html_link_38.doStartTag();
    if (_jspx_eval_html_link_38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_38 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_38.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_38.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_20(_jspx_th_html_link_38, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_38.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_38 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_38);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_20(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_38, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_20 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_20.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_38);
    int _jspx_eval_camod_shorten_20 = _jspx_th_camod_shorten_20.doStartTag();
    if (_jspx_eval_camod_shorten_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_20.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_19(_jspx_th_camod_shorten_20, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_20);
    return false;
  }

  private boolean _jspx_meth_bean_write_19(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_19 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_19.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_20);
    _jspx_th_bean_write_19.setName("aPub");
    _jspx_th_bean_write_19.setProperty("authors");
    _jspx_th_bean_write_19.setFilter(false);
    int _jspx_eval_bean_write_19 = _jspx_th_bean_write_19.doStartTag();
    if (_jspx_th_bean_write_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_19);
    return false;
  }

  private boolean _jspx_meth_html_link_39(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_39 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_39.setPageContext(_jspx_page_context);
    _jspx_th_html_link_39.setParent(null);
    _jspx_th_html_link_39.setStyleClass("subMenuRed");
    _jspx_th_html_link_39.setAction("HistopathologyPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_39 = _jspx_th_html_link_39.doStartTag();
    if (_jspx_eval_html_link_39 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_39 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_39.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_39.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Histopathology\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_39.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_39 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_39);
    return false;
  }

  private boolean _jspx_meth_html_link_40(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_40 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_40.setPageContext(_jspx_page_context);
    _jspx_th_html_link_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_20);
    _jspx_th_html_link_40.setStyleClass("subMenuBlue");
    _jspx_th_html_link_40.setAction("HistopathologyPopulateAction.do?method=populate");
    _jspx_th_html_link_40.setParamId("aHistopathologyID");
    _jspx_th_html_link_40.setParamName("aHistopathology");
    _jspx_th_html_link_40.setParamProperty("id");
    int _jspx_eval_html_link_40 = _jspx_th_html_link_40.doStartTag();
    if (_jspx_eval_html_link_40 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_40 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_40.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_40.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_21(_jspx_th_html_link_40, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_40.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_40 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_40);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_21(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_40, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_21 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_21.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_40);
    int _jspx_eval_camod_shorten_21 = _jspx_th_camod_shorten_21.doStartTag();
    if (_jspx_eval_camod_shorten_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_21.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_20(_jspx_th_camod_shorten_21, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_21);
    return false;
  }

  private boolean _jspx_meth_bean_write_20(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_20 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_20.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_21);
    _jspx_th_bean_write_20.setName("aHistopathology");
    _jspx_th_bean_write_20.setProperty("organ.name");
    _jspx_th_bean_write_20.setFilter(false);
    int _jspx_eval_bean_write_20 = _jspx_th_bean_write_20.doStartTag();
    if (_jspx_th_bean_write_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_20);
    return false;
  }

  private boolean _jspx_meth_html_link_41(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_41 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_41.setPageContext(_jspx_page_context);
    _jspx_th_html_link_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_20);
    _jspx_th_html_link_41.setStyleClass("subMenuDarkRed");
    _jspx_th_html_link_41.setAction("AssociatedMetastasisPopulateAction.do?method=dropdown");
    _jspx_th_html_link_41.setParamId("aHistopathologyID");
    _jspx_th_html_link_41.setParamName("aHistopathology");
    _jspx_th_html_link_41.setParamProperty("id");
    int _jspx_eval_html_link_41 = _jspx_th_html_link_41.doStartTag();
    if (_jspx_eval_html_link_41 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_41 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_41.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_41.doInitBody();
      }
      do {
        out.write("Enter Assoc Metastasis\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_41.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_41 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_41);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_21);
    _jspx_th_c_out_6.setValue("${ aAssociatedMetastasisID }");
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_out_7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_21);
    _jspx_th_c_out_7.setValue("${ aHistopathologyID }");
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_22(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_22 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten_length.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_22.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_21);
    _jspx_th_camod_shorten_22.setLength("21");
    int _jspx_eval_camod_shorten_22 = _jspx_th_camod_shorten_22.doStartTag();
    if (_jspx_eval_camod_shorten_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_22.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_21(_jspx_th_camod_shorten_22, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten_length.reuse(_jspx_th_camod_shorten_22);
    return false;
  }

  private boolean _jspx_meth_bean_write_21(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_21 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_21.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_22);
    _jspx_th_bean_write_21.setName("aAssociatedMetastasis");
    _jspx_th_bean_write_21.setProperty("organ.name");
    _jspx_th_bean_write_21.setFilter(false);
    int _jspx_eval_bean_write_21 = _jspx_th_bean_write_21.doStartTag();
    if (_jspx_th_bean_write_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_21);
    return false;
  }

  private boolean _jspx_meth_html_link_42(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_42 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_42.setPageContext(_jspx_page_context);
    _jspx_th_html_link_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_20);
    _jspx_th_html_link_42.setStyleClass("subMenuDarkRed");
    _jspx_th_html_link_42.setAction("ClinicalMarkerPopulateAction.do?method=dropdown");
    _jspx_th_html_link_42.setParamId("aHistopathologyID");
    _jspx_th_html_link_42.setParamName("aHistopathology");
    _jspx_th_html_link_42.setParamProperty("id");
    int _jspx_eval_html_link_42 = _jspx_th_html_link_42.doStartTag();
    if (_jspx_eval_html_link_42 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_42 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_42.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_42.doInitBody();
      }
      do {
        out.write("Enter Clinical Marker\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_42.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_42 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_42);
    return false;
  }

  private boolean _jspx_meth_c_out_8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_8.setPageContext(_jspx_page_context);
    _jspx_th_c_out_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_22);
    _jspx_th_c_out_8.setValue("${ aClinicalMarkerID }");
    int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
    if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
    return false;
  }

  private boolean _jspx_meth_c_out_9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_9 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_9.setPageContext(_jspx_page_context);
    _jspx_th_c_out_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_22);
    _jspx_th_c_out_9.setValue("${ aHistopathologyID }");
    int _jspx_eval_c_out_9 = _jspx_th_c_out_9.doStartTag();
    if (_jspx_th_c_out_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_23(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_23 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten_length.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_23.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_22);
    _jspx_th_camod_shorten_23.setLength("21");
    int _jspx_eval_camod_shorten_23 = _jspx_th_camod_shorten_23.doStartTag();
    if (_jspx_eval_camod_shorten_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_23.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_22(_jspx_th_camod_shorten_23, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten_length.reuse(_jspx_th_camod_shorten_23);
    return false;
  }

  private boolean _jspx_meth_bean_write_22(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_22 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_22.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_23);
    _jspx_th_bean_write_22.setName("aClinicalMarker");
    _jspx_th_bean_write_22.setProperty("displayName");
    _jspx_th_bean_write_22.setFilter(false);
    int _jspx_eval_bean_write_22 = _jspx_th_bean_write_22.doStartTag();
    if (_jspx_th_bean_write_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_22);
    return false;
  }

  private boolean _jspx_meth_html_link_43(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_43 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_43.setPageContext(_jspx_page_context);
    _jspx_th_html_link_43.setParent(null);
    _jspx_th_html_link_43.setStyleClass("subMenuRed");
    _jspx_th_html_link_43.setAction("TherapyPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_43 = _jspx_th_html_link_43.doStartTag();
    if (_jspx_eval_html_link_43 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_43 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_43.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_43.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Therapy\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_43.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_43 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_43);
    return false;
  }

  private boolean _jspx_meth_html_link_44(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_44 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_44.setPageContext(_jspx_page_context);
    _jspx_th_html_link_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_23);
    _jspx_th_html_link_44.setStyleClass("subMenuBlue");
    _jspx_th_html_link_44.setAction("TherapyPopulateAction.do?method=populate");
    _jspx_th_html_link_44.setParamId("aTherapyID");
    _jspx_th_html_link_44.setParamName("aTherapy");
    _jspx_th_html_link_44.setParamProperty("id");
    int _jspx_eval_html_link_44 = _jspx_th_html_link_44.doStartTag();
    if (_jspx_eval_html_link_44 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_44 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_44.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_44.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_24(_jspx_th_html_link_44, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_44.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_44 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_44);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_24(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_24 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_24.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_44);
    int _jspx_eval_camod_shorten_24 = _jspx_th_camod_shorten_24.doStartTag();
    if (_jspx_eval_camod_shorten_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_24.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_23(_jspx_th_camod_shorten_24, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_24);
    return false;
  }

  private boolean _jspx_meth_bean_write_23(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_23 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_23.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_24);
    _jspx_th_bean_write_23.setName("aTherapy");
    _jspx_th_bean_write_23.setProperty("agent.name");
    _jspx_th_bean_write_23.setFilter(false);
    int _jspx_eval_bean_write_23 = _jspx_th_bean_write_23.doStartTag();
    if (_jspx_th_bean_write_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_23);
    return false;
  }

  private boolean _jspx_meth_html_link_45(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_45 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_45.setPageContext(_jspx_page_context);
    _jspx_th_html_link_45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_23);
    _jspx_th_html_link_45.setStyleClass("subMenuDarkRed");
    _jspx_th_html_link_45.setAction("PublicationPopulateAction.do?method=dropdown");
    _jspx_th_html_link_45.setParamId("aTherapyID");
    _jspx_th_html_link_45.setParamName("aTherapy");
    _jspx_th_html_link_45.setParamProperty("id");
    int _jspx_eval_html_link_45 = _jspx_th_html_link_45.doStartTag();
    if (_jspx_eval_html_link_45 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_45 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_45.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_45.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\tEnter Publication for Therapy\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_45.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_45 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_45);
    return false;
  }

  private boolean _jspx_meth_c_out_10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_10 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_10.setPageContext(_jspx_page_context);
    _jspx_th_c_out_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_24);
    _jspx_th_c_out_10.setValue("${ aPublicationID }");
    int _jspx_eval_c_out_10 = _jspx_th_c_out_10.doStartTag();
    if (_jspx_th_c_out_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
    return false;
  }

  private boolean _jspx_meth_c_out_11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_11 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_11.setPageContext(_jspx_page_context);
    _jspx_th_c_out_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_24);
    _jspx_th_c_out_11.setValue("${aTherapyID}");
    int _jspx_eval_c_out_11 = _jspx_th_c_out_11.doStartTag();
    if (_jspx_th_c_out_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_25(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_25 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten_length.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_25.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_24);
    _jspx_th_camod_shorten_25.setLength("21");
    int _jspx_eval_camod_shorten_25 = _jspx_th_camod_shorten_25.doStartTag();
    if (_jspx_eval_camod_shorten_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_25.doInitBody();
      }
      do {
        if (_jspx_meth_c_out_12(_jspx_th_camod_shorten_25, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten_length.reuse(_jspx_th_camod_shorten_25);
    return false;
  }

  private boolean _jspx_meth_c_out_12(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_12 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_12.setPageContext(_jspx_page_context);
    _jspx_th_c_out_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_25);
    _jspx_th_c_out_12.setValue("${aPublication.authors}");
    int _jspx_eval_c_out_12 = _jspx_th_c_out_12.doStartTag();
    if (_jspx_th_c_out_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
    return false;
  }

  private boolean _jspx_meth_html_link_46(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_46 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_46.setPageContext(_jspx_page_context);
    _jspx_th_html_link_46.setParent(null);
    _jspx_th_html_link_46.setStyleClass("subMenuRed");
    _jspx_th_html_link_46.setAction("CellLinePopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_46 = _jspx_th_html_link_46.doStartTag();
    if (_jspx_eval_html_link_46 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_46 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_46.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_46.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Cell Lines\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_46.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_46 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_46);
    return false;
  }

  private boolean _jspx_meth_html_link_47(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_47 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_47.setPageContext(_jspx_page_context);
    _jspx_th_html_link_47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_25);
    _jspx_th_html_link_47.setStyleClass("subMenuBlue");
    _jspx_th_html_link_47.setAction("CellLinePopulateAction.do?method=populate");
    _jspx_th_html_link_47.setParamId("aCellID");
    _jspx_th_html_link_47.setParamName("aCell");
    _jspx_th_html_link_47.setParamProperty("id");
    int _jspx_eval_html_link_47 = _jspx_th_html_link_47.doStartTag();
    if (_jspx_eval_html_link_47 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_47 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_47.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_47.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_26(_jspx_th_html_link_47, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_47.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_47 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_47);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_26(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_47, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_26 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_26.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_47);
    int _jspx_eval_camod_shorten_26 = _jspx_th_camod_shorten_26.doStartTag();
    if (_jspx_eval_camod_shorten_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_26.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_26.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_24(_jspx_th_camod_shorten_26, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_26);
    return false;
  }

  private boolean _jspx_meth_bean_write_24(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_24 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_24.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_26);
    _jspx_th_bean_write_24.setName("aCell");
    _jspx_th_bean_write_24.setProperty("name");
    _jspx_th_bean_write_24.setFilter(false);
    int _jspx_eval_bean_write_24 = _jspx_th_bean_write_24.doStartTag();
    if (_jspx_th_bean_write_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_24);
    return false;
  }

  private boolean _jspx_meth_html_link_48(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_48 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_48.setPageContext(_jspx_page_context);
    _jspx_th_html_link_48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_25);
    _jspx_th_html_link_48.setStyleClass("subMenuDarkRed");
    _jspx_th_html_link_48.setAction("PublicationPopulateAction.do?method=dropdown");
    _jspx_th_html_link_48.setParamId("aCellID");
    _jspx_th_html_link_48.setParamName("aCell");
    _jspx_th_html_link_48.setParamProperty("id");
    int _jspx_eval_html_link_48 = _jspx_th_html_link_48.doStartTag();
    if (_jspx_eval_html_link_48 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_48 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_48.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_48.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\tEnter Publication for Cell Line\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_48.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_48 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_48);
    return false;
  }

  private boolean _jspx_meth_c_out_13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_13 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_13.setPageContext(_jspx_page_context);
    _jspx_th_c_out_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_26);
    _jspx_th_c_out_13.setValue("${ aPublicationID }");
    int _jspx_eval_c_out_13 = _jspx_th_c_out_13.doStartTag();
    if (_jspx_th_c_out_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
    return false;
  }

  private boolean _jspx_meth_c_out_14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_14 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_14.setPageContext(_jspx_page_context);
    _jspx_th_c_out_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_26);
    _jspx_th_c_out_14.setValue("${aCellID }");
    int _jspx_eval_c_out_14 = _jspx_th_c_out_14.doStartTag();
    if (_jspx_th_c_out_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_14);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_27(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_27 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten_length.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_27.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_26);
    _jspx_th_camod_shorten_27.setLength("21");
    int _jspx_eval_camod_shorten_27 = _jspx_th_camod_shorten_27.doStartTag();
    if (_jspx_eval_camod_shorten_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_27.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_27.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_25(_jspx_th_camod_shorten_27, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten_length.reuse(_jspx_th_camod_shorten_27);
    return false;
  }

  private boolean _jspx_meth_bean_write_25(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_25 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_25.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_27);
    _jspx_th_bean_write_25.setName("aPublication");
    _jspx_th_bean_write_25.setProperty("authors");
    _jspx_th_bean_write_25.setFilter(false);
    int _jspx_eval_bean_write_25 = _jspx_th_bean_write_25.doStartTag();
    if (_jspx_th_bean_write_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_25);
    return false;
  }

  private boolean _jspx_meth_html_link_49(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_49 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_49.setPageContext(_jspx_page_context);
    _jspx_th_html_link_49.setParent(null);
    _jspx_th_html_link_49.setStyleClass("subMenuRed");
    _jspx_th_html_link_49.setAction("ImagePopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_49 = _jspx_th_html_link_49.doStartTag();
    if (_jspx_eval_html_link_49 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_49 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_49.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_49.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Images\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_49.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_49 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_49);
    return false;
  }

  private boolean _jspx_meth_html_link_50(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_50 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_50.setPageContext(_jspx_page_context);
    _jspx_th_html_link_50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_27);
    _jspx_th_html_link_50.setStyleClass("subMenuBlue");
    _jspx_th_html_link_50.setAction("ImagePopulateAction.do?method=populate");
    _jspx_th_html_link_50.setParamId("aImageID");
    _jspx_th_html_link_50.setParamName("aImage");
    _jspx_th_html_link_50.setParamProperty("id");
    int _jspx_eval_html_link_50 = _jspx_th_html_link_50.doStartTag();
    if (_jspx_eval_html_link_50 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_50 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_50.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_50.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_28(_jspx_th_html_link_50, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_50.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_50 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_50);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_28(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_50, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_28 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_28.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_50);
    int _jspx_eval_camod_shorten_28 = _jspx_th_camod_shorten_28.doStartTag();
    if (_jspx_eval_camod_shorten_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_28.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_28.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_26(_jspx_th_camod_shorten_28, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_28);
    return false;
  }

  private boolean _jspx_meth_bean_write_26(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_26 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_26.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_28);
    _jspx_th_bean_write_26.setName("aImage");
    _jspx_th_bean_write_26.setProperty("title");
    _jspx_th_bean_write_26.setFilter(false);
    int _jspx_eval_bean_write_26 = _jspx_th_bean_write_26.doStartTag();
    if (_jspx_th_bean_write_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_26);
    return false;
  }

  private boolean _jspx_meth_html_link_51(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_51 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_51.setPageContext(_jspx_page_context);
    _jspx_th_html_link_51.setParent(null);
    _jspx_th_html_link_51.setStyleClass("subMenuRed");
    _jspx_th_html_link_51.setAction("submitMicroarrayData");
    int _jspx_eval_html_link_51 = _jspx_th_html_link_51.doStartTag();
    if (_jspx_eval_html_link_51 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_51 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_51.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_51.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Microarray Data\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_51.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_51 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_51);
    return false;
  }

  private boolean _jspx_meth_html_link_52(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_52 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_52.setPageContext(_jspx_page_context);
    _jspx_th_html_link_52.setParent(null);
    _jspx_th_html_link_52.setStyleClass("subMenuRed");
    _jspx_th_html_link_52.setAction("JacksonLabPopulateAction.do?method=dropdown&lab=Jackson Laboratory");
    int _jspx_eval_html_link_52 = _jspx_th_html_link_52.doStartTag();
    if (_jspx_eval_html_link_52 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_52 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_52.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_52.doInitBody();
      }
      do {
        out.write("Available from Jackson Lab.");
        int evalDoAfterBody = _jspx_th_html_link_52.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_52 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_52);
    return false;
  }

  private boolean _jspx_meth_html_link_53(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_53 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_53.setPageContext(_jspx_page_context);
    _jspx_th_html_link_53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_28);
    _jspx_th_html_link_53.setStyleClass("subMenuBlue");
    _jspx_th_html_link_53.setAction("JacksonLabPopulateAction.do?method=populate");
    _jspx_th_html_link_53.setParamId("aAvailabilityID");
    _jspx_th_html_link_53.setParamName("aAvailability");
    _jspx_th_html_link_53.setParamProperty("id");
    int _jspx_eval_html_link_53 = _jspx_th_html_link_53.doStartTag();
    if (_jspx_eval_html_link_53 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_53 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_53.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_53.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_29(_jspx_th_html_link_53, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_53.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_53 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_53);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_29(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_53, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_29 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_29.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_53);
    int _jspx_eval_camod_shorten_29 = _jspx_th_camod_shorten_29.doStartTag();
    if (_jspx_eval_camod_shorten_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_29.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_29.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_27(_jspx_th_camod_shorten_29, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_29);
    return false;
  }

  private boolean _jspx_meth_bean_write_27(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_29, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_27 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_27.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_29);
    _jspx_th_bean_write_27.setName("aAvailability");
    _jspx_th_bean_write_27.setProperty("displayName");
    _jspx_th_bean_write_27.setFilter(false);
    int _jspx_eval_bean_write_27 = _jspx_th_bean_write_27.doStartTag();
    if (_jspx_th_bean_write_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_27);
    return false;
  }

  private boolean _jspx_meth_html_link_54(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_54 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_54.setPageContext(_jspx_page_context);
    _jspx_th_html_link_54.setParent(null);
    _jspx_th_html_link_54.setStyleClass("subMenuRed");
    _jspx_th_html_link_54.setAction("MMHCCRepoPopulateAction.do?method=dropdown&lab=MMHCC Repository");
    int _jspx_eval_html_link_54 = _jspx_th_html_link_54.doStartTag();
    if (_jspx_eval_html_link_54 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_54 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_54.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_54.doInitBody();
      }
      do {
        out.write("Available from MMHCC Repo.");
        int evalDoAfterBody = _jspx_th_html_link_54.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_54 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_54);
    return false;
  }

  private boolean _jspx_meth_html_link_55(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_29, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_55 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_55.setPageContext(_jspx_page_context);
    _jspx_th_html_link_55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_29);
    _jspx_th_html_link_55.setStyleClass("subMenuBlue");
    _jspx_th_html_link_55.setAction("MMHCCRepoPopulateAction.do?method=populate");
    _jspx_th_html_link_55.setParamId("aAvailabilityID");
    _jspx_th_html_link_55.setParamName("aAvailability");
    _jspx_th_html_link_55.setParamProperty("id");
    int _jspx_eval_html_link_55 = _jspx_th_html_link_55.doStartTag();
    if (_jspx_eval_html_link_55 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_55 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_55.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_55.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_30(_jspx_th_html_link_55, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_55.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_55 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_55);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_30(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_55, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_30 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_30.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_55);
    int _jspx_eval_camod_shorten_30 = _jspx_th_camod_shorten_30.doStartTag();
    if (_jspx_eval_camod_shorten_30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_30.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_30.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_28(_jspx_th_camod_shorten_30, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_30.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_30);
    return false;
  }

  private boolean _jspx_meth_bean_write_28(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_28 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_28.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_30);
    _jspx_th_bean_write_28.setName("aAvailability");
    _jspx_th_bean_write_28.setProperty("displayName");
    _jspx_th_bean_write_28.setFilter(false);
    int _jspx_eval_bean_write_28 = _jspx_th_bean_write_28.doStartTag();
    if (_jspx_th_bean_write_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_28);
    return false;
  }

  private boolean _jspx_meth_html_link_56(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_56 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_56.setPageContext(_jspx_page_context);
    _jspx_th_html_link_56.setParent(null);
    _jspx_th_html_link_56.setStyleClass("subMenuRed");
    _jspx_th_html_link_56.setAction("InvestigatorPopulateAction.do?method=dropdown&lab=Investigator");
    int _jspx_eval_html_link_56 = _jspx_th_html_link_56.doStartTag();
    if (_jspx_eval_html_link_56 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_56 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_56.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_56.doInitBody();
      }
      do {
        out.write("Available from Investigator");
        int evalDoAfterBody = _jspx_th_html_link_56.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_56 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_56);
    return false;
  }

  private boolean _jspx_meth_html_link_57(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_57 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_57.setPageContext(_jspx_page_context);
    _jspx_th_html_link_57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_30);
    _jspx_th_html_link_57.setStyleClass("subMenuBlue");
    _jspx_th_html_link_57.setAction("InvestigatorPopulateAction.do?method=populate");
    _jspx_th_html_link_57.setParamId("aAvailabilityID");
    _jspx_th_html_link_57.setParamName("aAvailability");
    _jspx_th_html_link_57.setParamProperty("id");
    int _jspx_eval_html_link_57 = _jspx_th_html_link_57.doStartTag();
    if (_jspx_eval_html_link_57 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_57 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_57.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_57.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_31(_jspx_th_html_link_57, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_57.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_57 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_57);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_31(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_57, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_31 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_31.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_57);
    int _jspx_eval_camod_shorten_31 = _jspx_th_camod_shorten_31.doStartTag();
    if (_jspx_eval_camod_shorten_31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_31.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_31.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_29(_jspx_th_camod_shorten_31, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_31.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_31);
    return false;
  }

  private boolean _jspx_meth_bean_write_29(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_31, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_29 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_29.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_31);
    _jspx_th_bean_write_29.setName("aAvailability");
    _jspx_th_bean_write_29.setProperty("displayName");
    _jspx_th_bean_write_29.setFilter(false);
    int _jspx_eval_bean_write_29 = _jspx_th_bean_write_29.doStartTag();
    if (_jspx_th_bean_write_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_29);
    return false;
  }

  private boolean _jspx_meth_html_link_58(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_58 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_58.setPageContext(_jspx_page_context);
    _jspx_th_html_link_58.setParent(null);
    _jspx_th_html_link_58.setStyleClass("subMenuRed");
    _jspx_th_html_link_58.setAction("IMSRPopulateAction.do?method=dropdown&lab=IMSR");
    int _jspx_eval_html_link_58 = _jspx_th_html_link_58.doStartTag();
    if (_jspx_eval_html_link_58 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_58 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_58.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_58.doInitBody();
      }
      do {
        out.write("Available from IMSR");
        int evalDoAfterBody = _jspx_th_html_link_58.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_58 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_58);
    return false;
  }

  private boolean _jspx_meth_html_link_59(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_31, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_59 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_59.setPageContext(_jspx_page_context);
    _jspx_th_html_link_59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_31);
    _jspx_th_html_link_59.setStyleClass("subMenuBlue");
    _jspx_th_html_link_59.setAction("IMSRPopulateAction.do?method=populate");
    _jspx_th_html_link_59.setParamId("aAvailabilityID");
    _jspx_th_html_link_59.setParamName("aAvailability");
    _jspx_th_html_link_59.setParamProperty("id");
    int _jspx_eval_html_link_59 = _jspx_th_html_link_59.doStartTag();
    if (_jspx_eval_html_link_59 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_59 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_59.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_59.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_32(_jspx_th_html_link_59, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_59.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_59 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_59);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_32(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_59, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_32 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_32.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_59);
    int _jspx_eval_camod_shorten_32 = _jspx_th_camod_shorten_32.doStartTag();
    if (_jspx_eval_camod_shorten_32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_32.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_32.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_30(_jspx_th_camod_shorten_32, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_32.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_32);
    return false;
  }

  private boolean _jspx_meth_bean_write_30(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_32, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_30 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_30.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_32);
    _jspx_th_bean_write_30.setName("aAvailability");
    _jspx_th_bean_write_30.setProperty("displayName");
    _jspx_th_bean_write_30.setFilter(false);
    int _jspx_eval_bean_write_30 = _jspx_th_bean_write_30.doStartTag();
    if (_jspx_th_bean_write_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_30);
    return false;
  }

  private boolean _jspx_meth_html_link_60(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_60 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_60.setPageContext(_jspx_page_context);
    _jspx_th_html_link_60.setParent(null);
    _jspx_th_html_link_60.setStyleClass("subMenuRed");
    _jspx_th_html_link_60.setAction("ZFINPopulateAction.do?method=dropdown&lab=ZFIN");
    int _jspx_eval_html_link_60 = _jspx_th_html_link_60.doStartTag();
    if (_jspx_eval_html_link_60 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_60 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_60.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_60.doInitBody();
      }
      do {
        out.write("Available from ZFIN");
        int evalDoAfterBody = _jspx_th_html_link_60.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_60 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_60);
    return false;
  }

  private boolean _jspx_meth_html_link_61(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_32, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_61 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_61.setPageContext(_jspx_page_context);
    _jspx_th_html_link_61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_32);
    _jspx_th_html_link_61.setStyleClass("subMenuBlue");
    _jspx_th_html_link_61.setAction("ZFINPopulateAction.do?method=populate");
    _jspx_th_html_link_61.setParamId("aAvailabilityID");
    _jspx_th_html_link_61.setParamName("aAvailability");
    _jspx_th_html_link_61.setParamProperty("id");
    int _jspx_eval_html_link_61 = _jspx_th_html_link_61.doStartTag();
    if (_jspx_eval_html_link_61 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_61 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_61.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_61.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_33(_jspx_th_html_link_61, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_61.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_61 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_61);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_33(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_61, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_33 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_33.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_61);
    int _jspx_eval_camod_shorten_33 = _jspx_th_camod_shorten_33.doStartTag();
    if (_jspx_eval_camod_shorten_33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_33.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_33.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_31(_jspx_th_camod_shorten_33, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_33.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_33);
    return false;
  }

  private boolean _jspx_meth_bean_write_31(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_31 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_31.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_33);
    _jspx_th_bean_write_31.setName("aAvailability");
    _jspx_th_bean_write_31.setProperty("displayName");
    _jspx_th_bean_write_31.setFilter(false);
    int _jspx_eval_bean_write_31 = _jspx_th_bean_write_31.doStartTag();
    if (_jspx_th_bean_write_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_31);
    return false;
  }

  private boolean _jspx_meth_html_link_62(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_62 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_62.setPageContext(_jspx_page_context);
    _jspx_th_html_link_62.setParent(null);
    _jspx_th_html_link_62.setStyleClass("subMenuRed");
    _jspx_th_html_link_62.setAction("TransplantPopulateAction.do?method=dropdown");
    int _jspx_eval_html_link_62 = _jspx_th_html_link_62.doStartTag();
    if (_jspx_eval_html_link_62 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_62 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_62.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_62.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\tEnter Transplant\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_link_62.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_62 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_action.reuse(_jspx_th_html_link_62);
    return false;
  }

  private boolean _jspx_meth_html_link_63(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_33, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_63 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_63.setPageContext(_jspx_page_context);
    _jspx_th_html_link_63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_33);
    _jspx_th_html_link_63.setStyleClass("subMenuBlue");
    _jspx_th_html_link_63.setAction("TransplantPopulateAction.do?method=populate");
    _jspx_th_html_link_63.setParamId("aTransplantID");
    _jspx_th_html_link_63.setParamName("aTransplant");
    _jspx_th_html_link_63.setParamProperty("id");
    int _jspx_eval_html_link_63 = _jspx_th_html_link_63.doStartTag();
    if (_jspx_eval_html_link_63 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_63 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_63.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_63.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_camod_shorten_34(_jspx_th_html_link_63, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_link_63.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_63 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_styleClass_paramProperty_paramName_paramId_action.reuse(_jspx_th_html_link_63);
    return false;
  }

  private boolean _jspx_meth_camod_shorten_34(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_63, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  camod:shorten
    gov.nih.nci.camod.webapp.taglib.ShortenTextTag _jspx_th_camod_shorten_34 = (gov.nih.nci.camod.webapp.taglib.ShortenTextTag) _jspx_tagPool_camod_shorten.get(gov.nih.nci.camod.webapp.taglib.ShortenTextTag.class);
    _jspx_th_camod_shorten_34.setPageContext(_jspx_page_context);
    _jspx_th_camod_shorten_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_63);
    int _jspx_eval_camod_shorten_34 = _jspx_th_camod_shorten_34.doStartTag();
    if (_jspx_eval_camod_shorten_34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_camod_shorten_34 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_camod_shorten_34.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_camod_shorten_34.doInitBody();
      }
      do {
        if (_jspx_meth_bean_write_32(_jspx_th_camod_shorten_34, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_camod_shorten_34.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_camod_shorten_34 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_camod_shorten_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_camod_shorten.reuse(_jspx_th_camod_shorten_34);
    return false;
  }

  private boolean _jspx_meth_bean_write_32(javax.servlet.jsp.tagext.JspTag _jspx_th_camod_shorten_34, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_32 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_32.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_camod_shorten_34);
    _jspx_th_bean_write_32.setName("aTransplant");
    _jspx_th_bean_write_32.setProperty("name");
    _jspx_th_bean_write_32.setFilter(false);
    int _jspx_eval_bean_write_32 = _jspx_th_bean_write_32.doStartTag();
    if (_jspx_th_bean_write_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_32);
    return false;
  }
}
