package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import gov.nih.nci.camod.domain.AnimalModel;
import gov.nih.nci.camod.domain.Therapy;
import gov.nih.nci.camod.domain.CellLine;
import gov.nih.nci.camod.domain.CarcinogenExposure;
import gov.nih.nci.camod.domain.TransientInterference;
import gov.nih.nci.camod.domain.CaelmirStudyData;
import gov.nih.nci.camod.Constants;
import java.util.List;
import java.util.ArrayList;

public final class subViewModelMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_escapeXml_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_parameter_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_styleClass_action;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_xhtml_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_escapeXml_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_parameter_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_styleClass_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_xhtml_nobody.release();
    _jspx_tagPool_bean_define_name_id_nobody.release();
    _jspx_tagPool_c_out_value_escapeXml_nobody.release();
    _jspx_tagPool_bean_parameter_name_id_nobody.release();
    _jspx_tagPool_html_link_styleClass_action.release();
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
      out.write("<TR><TD class=subMenuPrimaryTitle height=22>MODEL DETAILS</TD></TR>\r\n");
      out.write("<TR><TD class=subMenuPrimaryGreyTitle height=27>\r\n");
      out.write("\tViewing Model: <b>\r\n");
      out.write("\t");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("&nbsp;( ");
      out.print( request.getSession().getAttribute(Constants.MODELID));
      out.write(" )</b><br>\r\n");
      out.write("</TD></TR>\r\n");
      out.write("<TR><TD class=subMenuPrimaryItems>\r\n");
      out.write("<DIV>\r\n");
      out.write("\t");
      //  bean:parameter
      org.apache.struts.taglib.bean.ParameterTag _jspx_th_bean_parameter_0 = (org.apache.struts.taglib.bean.ParameterTag) _jspx_tagPool_bean_parameter_name_id_nobody.get(org.apache.struts.taglib.bean.ParameterTag.class);
      _jspx_th_bean_parameter_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_parameter_0.setParent(null);
      _jspx_th_bean_parameter_0.setId("mdl");
      _jspx_th_bean_parameter_0.setName("aModelID");
      int _jspx_eval_bean_parameter_0 = _jspx_th_bean_parameter_0.doStartTag();
      mdl = (java.lang.String) _jspx_page_context.findAttribute("mdl");
      if (_jspx_th_bean_parameter_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      mdl = (java.lang.String) _jspx_page_context.findAttribute("mdl");
      _jspx_tagPool_bean_parameter_name_id_nobody.reuse(_jspx_th_bean_parameter_0);
      out.write("\r\n");
      out.write("\t<IMG height=5 alt=\"\" src=\"images/subMenuArrow.gif\" width=5>&nbsp;&nbsp;\r\n");
      out.write("\t\t<a href=\"ViewModelAction.do?unprotected_method=populateModelCharacteristics&aModelID=");
      out.print(mdl);
      out.write("\" styleClass=\"subMenuPrimary\">MODEL CHARACTERISTICS</a>\r\n");
      out.write("\t<BR>\t\r\n");
      out.write("\t<IMG height=5 alt=\"\" src=\"images/subMenuArrow.gif\" width=5>&nbsp;&nbsp;\r\n");
      out.write("\t\t");
 
			AnimalModel am = (AnimalModel)request.getSession().getAttribute(Constants.ANIMALMODEL);
			List l = new ArrayList(am.getEngineeredGeneCollection());
			int cc = (l!=null)?l.size():0;
			boolean found = false;
				if ( cc > 0 ) {
				found = true;
				}
				if (!found) {
					if (am.getSpontaneousMutationCollection() != null && am.getSpontaneousMutationCollection().size() > 0) {
				    	found = true;
					}
				}
			if (found) {
		
      out.write("\r\n");
      out.write("\t\t<a href=\"ViewModelAction.do?unprotected_method=populateEngineeredGene&aModelID=");
      out.print(mdl);
      out.write("\" styleClass=\"subMenuPrimary\">GENETIC DESCRIPTION</a>\t\r\n");
      out.write("\t    ");
} else { 
      out.write("\r\n");
      out.write("\t\tGENETIC DESCRIPTION\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t<BR>\r\n");
      out.write("\t<IMG height=5 alt=\"\" src=\"images/subMenuArrow.gif\" width=5>&nbsp;&nbsp;\r\n");
      out.write("\t\t");
 
			l = new ArrayList(am.getCarcinogenExposureCollection());
			cc = (l!=null)?l.size():0;
			found = false;
			if ( cc > 0 ) {
				for (int i=0; i<cc; i++) {
					CarcinogenExposure ce = (CarcinogenExposure)l.get(i);
						if( ce.getEnvironmentalFactor() !=null) {
							found = true;
							break;
						}					
				}
			}
			if (!found) {
				if (am.getGeneDeliveryCollection() != null && am.getGeneDeliveryCollection().size() > 0) {
				    found = true;
				}
			}
			if (found) {
		
      out.write("\r\n");
      out.write("\t\t<a href=\"ViewModelAction.do?unprotected_method=populateCarcinogenicInterventions&aModelID=");
      out.print(mdl);
      out.write("\" styleClass=\"subMenuPrimary\">CARCINOGENIC INTERVENTIONS</a>\r\n");
      out.write("\t    ");
} else { 
      out.write("\r\n");
      out.write("\t\tCARCINOGENIC INTERVENTIONS\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t<BR>\r\n");
      out.write("\t<IMG height=5 alt=\"\" src=\"images/subMenuArrow.gif\" width=5>&nbsp;&nbsp;\r\n");
      out.write("\t\t");
 
			l = new ArrayList(am.getTransientInterferenceCollection());
			cc = (l!=null)?l.size():0;
			found = false;
			if ( cc > 0 ) {
                found = true;
			}					
			if (found) {
		
      out.write("\r\n");
      out.write("\t\t<a href=\"ViewModelAction.do?unprotected_method=populateTransientInterference&aModelID=");
      out.print(mdl);
      out.write("\" styleClass=\"subMenuPrimary\">TRANSIENT INTERFERENCE</a>\r\n");
      out.write("\t    ");
} else { 
      out.write("\r\n");
      out.write("\t\tTRANSIENT INTERFERENCE\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t<BR>\r\n");
      out.write("\t<IMG height=5 alt=\"\" src=\"images/subMenuArrow.gif\" width=5>&nbsp;&nbsp;\r\n");
      out.write("\t\t");
 
			l = new ArrayList(am.getPublicationCollection());
			cc = (l!=null)?l.size():0;
			found = false;
				if ( cc >0 ) {
					found = true;
				}
			if (!found) {
				l = new ArrayList(am.getCellLineCollection());
				cc = (l!=null)?l.size():0;
					if ( cc > 0 ) {
						for (int i=0; i<cc; i++) {					
						CellLine c = (CellLine)l.get(i);
						if( c.getPublicationCollection() !=null && c.getPublicationCollection().size() > 0) {
							found = true;
							break;
						}
					}
				}
			}
			if (!found) {
				l = new ArrayList(am.getTherapyCollection());
				cc = (l!=null)?l.size():0;
					if ( cc > 0 ) {
						for (int i=0; i<cc; i++) {					
						Therapy t = (Therapy)l.get(i);
						if( t.getPublicationCollection() !=null && t.getPublicationCollection().size() > 0) {
							found = true;
							break;
						}
					}
				}
			}
			if (found) {			
		
      out.write("\r\n");
      out.write("\t\t<a href=\"ViewModelAction.do?unprotected_method=populatePublications&aModelID=");
      out.print(mdl);
      out.write("\" styleClass=\"subMenuPrimary\">PUBLICATIONS</a>\t\r\n");
      out.write("\t    ");
} else { 
      out.write("\r\n");
      out.write("\t\tPUBLICATIONS\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t<BR>\r\n");
      out.write("\t<IMG height=5 alt=\"\" src=\"images/subMenuArrow.gif\" width=5>&nbsp;&nbsp;\r\n");
      out.write("\t\t");
 
			l = new ArrayList(am.getHistopathologyCollection());
			cc = (l!=null)?l.size():0;
			if ( cc > 0 ) { 
		
      out.write("\r\n");
      out.write("\t\t<a href=\"ViewModelAction.do?unprotected_method=populateHistopathology&aModelID=");
      out.print(mdl);
      out.write("\" styleClass=\"subMenuPrimary\">HISTOPATHOLOGY</a>\r\n");
      out.write("\t    ");
} else { 
      out.write("\r\n");
      out.write("\t\tHISTOPATHOLOGY\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t<BR>\r\n");
      out.write("\t<IMG height=5 alt=\"\" src=\"images/subMenuArrow.gif\" width=5>&nbsp;&nbsp;\r\n");
      out.write("\t\t");
 
			l = new ArrayList(am.getTherapyCollection());
			cc = (l!=null)?l.size():0;
			found = false;
			if ( cc > 0 ) {
				for (int i=0; i<cc; i++) {
					Therapy t = (Therapy)l.get(i);
						if( t.getAgent() !=null) {
							found = true;
							break;
						}					
				}
			}
			if (!found) {
				l = new ArrayList(am.getCaelmirStudyDataCollection());
				cc = (l!=null)?l.size():0;
				found = false;
				if ( cc > 0 ) {
					for (int i=0; i<cc; i++) {
						CaelmirStudyData c = (CaelmirStudyData)l.get(i);
							if( c.getStudyName() !=null) {
								found = true;
								break;
							}					
					}
				}
			}			
			if (found) {
		
      out.write("\r\n");
      out.write("\t\t<a href=\"ViewModelAction.do?unprotected_method=populateTherapeuticApproaches&aModelID=");
      out.print(mdl);
      out.write("\" styleClass=\"subMenuPrimary\">THERAPEUTIC APPROACHES</a>\r\n");
      out.write("\t    ");
} else { 
      out.write("\r\n");
      out.write("\t\tTHERAPEUTIC APPROACHES\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t<BR>\r\n");
      out.write("\t<IMG height=5 alt=\"\" src=\"images/subMenuArrow.gif\" width=5>&nbsp;&nbsp;\r\n");
      out.write("\t\t");
 
			l = new ArrayList(am.getCellLineCollection());
			cc = (l!=null)?l.size():0;
			if ( cc > 0 ) { 
		
      out.write("\r\n");
      out.write("\t\t<a href=\"ViewModelAction.do?unprotected_method=populateCellLines&aModelID=");
      out.print(mdl);
      out.write("\" styleClass=\"subMenuPrimary\">CELL LINES</a>\r\n");
      out.write("\t    ");
} else { 
      out.write("\r\n");
      out.write("\t\tCELL LINES\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t<BR>\r\n");
      out.write("\t<IMG height=5 alt=\"\" src=\"images/subMenuArrow.gif\" width=5>&nbsp;&nbsp;\r\n");
      out.write("\t\t");
 
			l = new ArrayList(am.getImageCollection());
			cc = (l!=null)?l.size():0;
			if ( cc > 0 ) { 
		
      out.write("\r\n");
      out.write("\t\t<a href=\"ViewModelAction.do?unprotected_method=populateImages&aModelID=");
      out.print(mdl);
      out.write("\" styleClass=\"subMenuPrimary\">IMAGES</a>\r\n");
      out.write("\t    ");
} else { 
      out.write("\r\n");
      out.write("\t\tIMAGES\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t<BR>\r\n");
      out.write("\t<IMG height=5 alt=\"\" src=\"images/subMenuArrow.gif\" width=5>&nbsp;&nbsp;\r\n");
      out.write("\t\t");
 
			l = new ArrayList(am.getMicroArrayDataCollection());
			cc = (l!=null)?l.size():0;
			if ( cc > 0 ) { 
		
      out.write("\r\n");
      out.write("\t\t<a href=\"ViewModelAction.do?unprotected_method=populateMicroarrays&aModelID=");
      out.print(mdl);
      out.write("\" styleClass=\"subMenuPrimary\">MICROARRAYS</a>\t\r\n");
      out.write("\t    ");
} else { 
      out.write("\r\n");
      out.write("\t\tMICROARRAYS\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t<BR>\r\n");
      out.write("\t<IMG height=5 alt=\"\" src=\"images/subMenuArrow.gif\" width=5>&nbsp;&nbsp;\r\n");
      out.write("\t\t");
 
			l = new ArrayList(am.getTransplantCollection());
			cc = (l!=null)?l.size():0;
			if ( cc > 0 ) {
		
      out.write("\r\n");
      out.write("\t\t<a href=\"ViewModelAction.do?unprotected_method=populateTransplant&aModelID=");
      out.print(mdl);
      out.write("\" styleClass=\"subMenuPrimary\">TRANSPLANT</a>\t\r\n");
      out.write("\t    ");
} else { 
      out.write("\r\n");
      out.write("\t\t\tTRANSPLANT\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t<BR>\r\n");
      out.write("\t<BR>\r\n");
      out.write("\t<!-- Add checks to see if in submission mode, if so add VIEW MY MODELS option -->\r\n");
      out.write("\t\r\n");
      out.write("\t<IMG height=5 alt=\"\" src=\"images/subMenuArrow.gif\" width=5>&nbsp;&nbsp;");
      if (_jspx_meth_html_link_0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("</DIV>\r\n");
      out.write("</TD></TR>");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue("${mdl.modelDescriptor}");
    _jspx_th_c_out_0.setEscapeXml("false");
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_0);
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
    _jspx_th_html_link_0.setStyleClass("subMenuPrimary");
    _jspx_th_html_link_0.setAction("searchResults");
    int _jspx_eval_html_link_0 = _jspx_th_html_link_0.doStartTag();
    if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_0.doInitBody();
      }
      do {
        out.write(" BACK TO SEARCH RESULTS");
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
}
