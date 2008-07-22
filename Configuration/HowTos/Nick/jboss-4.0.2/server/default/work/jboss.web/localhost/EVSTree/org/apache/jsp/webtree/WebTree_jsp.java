package org.apache.jsp.webtree;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.tree.*;
import java.util.*;
import gov.nih.nci.evs.app.webtree.*;
import java.io.*;

public final class WebTree_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

  // get parameters
  String treeParams     = (String) request.getParameter("treeParams");
  String targetId       = (String) request.getParameter("targetId");
  String targetName      = (String) request.getParameter("targetName");
  String treeAction     = (String) request.getParameter("treeAction");
  String skin           = (String) request.getParameter("skin");
  Vector highlightId = new Vector();
 
  if (skin == null){
    HttpSession userSession = request.getSession();
    skin =  (String)userSession.getAttribute("skin");
    Hashtable allhash =  (Hashtable)userSession.getAttribute("allhash");

    for ( Enumeration e = allhash.keys() ; e.hasMoreElements() ; )
    {
        // retrieve the object_key
        String object_key = (String) e.nextElement();
        // retrieve the object associated with the key
        String string_object = (String) allhash.get ( object_key );
        if(string_object.equals(targetName)){
          highlightId.add(object_key);
        }
    }	
  }
	
  // cross browser parameter null checks
  if (treeAction != null && treeAction.equals("null")) treeAction = null;
      
  try 
  {   
    WebTreeService webTree = null;    
    HttpSession userSession = request.getSession(false);     
  
    // get current web tree from session 
    if (userSession != null)
    {
    	
        webTree = (WebTreeService) userSession.getAttribute("webTree");
    }
    
    // if no treeAction specified, build a new tree
    if (treeAction == null)
    {
      
      // request/create new session
      userSession = request.getSession(true);
      // construct new web tree
      webTree = new WebTreeService(treeParams, skin);
      }

    if (webTree != null)
    {
     DefaultMutableTreeNode displayTreeRoot = null;
        // ** build/update display tree **
	if(highlightId.size()>1){
		for (int i = 0; i < highlightId.size(); i++) {
		targetId = (String)highlightId.elementAt(i);
		displayTreeRoot = webTree.getDisplayTree(treeAction, targetId, userSession);
     		}
	} else
		{
	displayTreeRoot = webTree.getDisplayTree(treeAction, targetId, userSession);

	}
      // set updated tree in session   
      userSession.setAttribute("webTree", webTree);      
      
  

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"skins/");
      out.print(skin);
      out.write("/TreeBrowser.css\" />\r\n");
      out.write("\t\t<script language=\"JavaScript1.2\" src=\"skins/");
      out.print(skin);
      out.write("/JavaScript.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<table border=\"0\">\r\n");
      out.write("\t\t\t");
    // render display tree
      Enumeration displayTree = displayTreeRoot.preorderEnumeration();

      while (displayTree.hasMoreElements())  
      {
        DefaultMutableTreeNode displayNode = (DefaultMutableTreeNode) displayTree.nextElement();
        WebNode displayWebNode = (WebNode) displayNode.getUserObject();
      
        if (displayWebNode != null)
        {
          String myName = displayWebNode.getName();
          String myId   = displayWebNode.getId();
        
          // get info used for mouse-over hover pop-up info
          String webNodeInfo = displayWebNode.getInfo();

          // check for highligh match to show background color highlight
         // if (treeAction != null && treeAction.equals("highlight") && myId.equals(targetId))		
	
		 if (treeAction != null && treeAction.equals("highlight")  && highlightId.contains(myId) )

          { 
      out.write("\r\n");
      out.write("\t\t\t<tr class=\"highlightNode\">\r\n");
      out.write("\t\t\t\t");
        }
          		else
          			{     
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t");
        }     
      out.write("\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<table border=0>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t");
        // check for highlight match to show marker chevrons
            //if (treeAction != null && treeAction.equals("highlight") && myId.equals(targetId) && displayNode.getLevel() > 0  )
          	if (treeAction != null && treeAction.equals("highlight") && displayNode.getLevel() >= 0 && highlightId.contains(myId) )
          { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"");
      out.print(30*displayNode.getLevel());
      out.write("-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t>>>\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/transparent.gif\" border=0 width=\"");
      out.print(30*displayNode.getLevel());
      out.write("-3\" height=\"1\" />\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
        } 
          else
          { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"");
      out.print(30*displayNode.getLevel());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/transparent.gif\" border=0 width=\"");
      out.print(30*displayNode.getLevel());
      out.write("\" height=\"1\" />\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
        } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");

          // render node icon and associated url
          if (displayWebNode.getIconAction().length() > 0)
          {


            // this web node has an override icon graphic and action, use that instead of the automated folder and leaf icons 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"40\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a onClick=\"");
      out.print(displayWebNode.getIconAction());
      out.write("\"><img src=\"skins/");
      out.print(skin);
      out.write("/images/");
      out.print(displayWebNode.getIconGraphic());
      out.write("\" vspace=\"0\" hspace=\"0\" border=\"0\" height=\"20\" width=\"30\" alt=\"");
      out.print(webNodeInfo);
      out.write("\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
        }              
          else if (displayWebNode.hasChildren() && !displayNode.isLeaf())
          {

 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"40\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"WebTree.jsp?targetId=");
      out.print(java.net.URLEncoder.encode(myId));
      out.write("&treeAction=collapse&amp;skin=");
      out.print(skin);
      out.write("\"><img src=\"skins/");
      out.print(skin);
      out.write("/images/folderOpen.gif\" vspace=\"0\" hspace=\"0\" border=\"0\" height=\"20\" width=\"30\" alt=\"");
      out.print(webNodeInfo);
      out.write("\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
        }
          else if (displayWebNode.hasChildren())           
          { 

            // no children currently displayed, but has children 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"40\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"WebTree.jsp?targetId=");
      out.print(java.net.URLEncoder.encode(myId));
      out.write("&amp;treeAction=expand&amp;skin=");
      out.print(skin);
      out.write("\"><img src=\"skins/");
      out.print(skin);
      out.write("/images/folderClosed.gif\" vspace=\"0\" hspace=\"0\" border=\"0\" height=\"20\" width=\"30\" alt=\"");
      out.print(webNodeInfo);
      out.write("\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
        }   
          else
          {

            // no children display, and has not children at all, this is a leaf 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"40\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"skins/");
      out.print(skin);
      out.write("/images/leaf.gif\" vspace=\"0\" hspace=\"0\" border=\"0\" height=\"20\" width=\"30\" alt=\"");
      out.print(webNodeInfo);
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
        }   
 
          // render name with action (if defined)
          String linkAction = displayWebNode.getAction();
          if (linkAction.length() > 0)
          {
 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a target=\"_top\" name=\"");
      out.print(myId);
      out.write("\" href=\"javascript:\" onClick=\"");
      out.print(linkAction);
      out.write('"');
      out.write('>');
      out.print(myName);
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
        }  
          else
          { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a name=\"");
      out.print(myId);
      out.write("\" onFocus=\"blur();\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(myName);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
        } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
      } // end webNode is null check
      } // end while loop

      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t");

    } 
    else
    { 
      // null webTree object 

      out.write("\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<b>Your Tree Session has Expired!</b>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\tClick the link below to close this window.\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<a target=\"_top\" href=\"javascript:top.window.close()\">Close Window</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t");
  }
  } // end try
  catch (Exception e)
  {
 
      out.write("\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<b>Server Error!</b>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\tClick the link below to close this window.\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<a target=\"_top\" href=\"javascript:top.window.close()\">Close Window</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr valign=\"bottom\">\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t");
      out.print(e.getMessage());
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t");

  } // end catch
 
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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
}
