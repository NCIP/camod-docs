package org.apache.jsp.webtree;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import gov.nih.nci.evs.app.webtree.*;

public final class SearchResults_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    HttpSession userSession = request.getSession();
        
    String searchTerm      = (String) request.getParameter("searchTerm");
    String matchWholeWords = (String) request.getParameter("matchwholewords");
   
    // get evs tree object from session
    WebTreeService webTree = null;
    webTree = (WebTreeService) userSession.getAttribute("webTree");
    userSession.setAttribute("skin", "evsMOD"); 

    
    // search concept tree for search term
    Vector searchResults  = null;
    Vector synonyms = null;
    
    boolean matchWholeWordsFlag = false;
            
    if (webTree != null)
    {
      if (searchTerm != null)
      {      	
        searchTerm = searchTerm.trim();
        boolean includeSynonyms = true; 
        if (matchWholeWords != null && matchWholeWords.equals("on"))
        {
	          matchWholeWordsFlag = true;
        }
        
        searchResults = webTree.searchTree(searchTerm, includeSynonyms, matchWholeWordsFlag);
        synonyms = webTree.getSynonyms();         
      }    
     }     

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"skins/evsMOD/SearchResults.css\" />\r\n");
      out.write("\t\t<script language=\"JavaScript1.2\" src=\"skins/evsMOD/JavaScript.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<table width=\"100%\">\r\n");
      out.write("\t\t\t");
  

    // loop through results vector and display

    if (searchResults != null && synonyms.size()>0 && searchResults.size()> 0)
    {

if (searchResults.size() > 0)
      {

      out.write("\r\n");
      out.write("\t\t\t");
      if (synonyms != null && synonyms.size() > 1)
        {           

      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
      }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr width=\"100%\">\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<table width=\"100%\" cellpadding=\"5\">\r\n");
      out.write("\t\t\t\t\t\t");

        // results found, display them
		Vector nodups = new Vector();
		Hashtable allhash = new  Hashtable();

        Enumeration resultsEnum = searchResults.elements();
        while (resultsEnum.hasMoreElements())
        {
          WebNode myWebNode = (WebNode) resultsEnum.nextElement();

          if (myWebNode != null)
          {
            String myId = myWebNode.getId();
            String myName = myWebNode.getName(); 
		allhash.put(myId,myName);
	
		 if (!nodups.contains(myName)) {
	            nodups.add(myName);

		
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t");
        // render concept name 
          		String linkAction = myWebNode.getAction();
          		if (linkAction.length() > 0 )
          		{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"searchResult\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(myName);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
        }
          		else 
          		{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"searchResult\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(myName);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
        }  
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"searchResult\" width=120>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"link\" target=\"tree\" href=\"WebTree.jsp?targetId=");
      out.print(java.net.URLEncoder.encode(myId));
      out.write("&amp;targetName=");
      out.print(java.net.URLEncoder.encode(myName));
      out.write("&amp;treeAction=highlight#");
      out.print(java.net.URLEncoder.encode(myId));
      out.write("&amp;skin=evsMOD\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"skins/evsMOD/images/TreeHighlightUP.gif\" width=\"110\" height=\"18\" border=\"1\" alt=\"highlight this term in the data tree\"> </a>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");
        } //if   no dups
            }//if webnode
          } //while 
  		 userSession.setAttribute("allhash", allhash); 

      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
}// if search result size

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

      // get post search message if any 
      String postSearchMsg = webTree.getPostSearchMsg();
      if (postSearchMsg != null){ 
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t");
      out.print(postSearchMsg);
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
}//if postsearch msg ends here


} //search result, synonym size, searchresult size
else  if (searchResults!=null && synonyms.size()<=0)
      {
// results set empty..nothing found

      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"noMatches\">\r\n");
      out.write("\t\t\t\t\tNo Matches Found\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
   // get post search message if any 
      String postSearchMsg = webTree.getPostSearchMsg();
      	if (postSearchMsg != null){ 
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t");
      out.print(postSearchMsg);
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
}//if postsearch msg ends here 
		} //else if

      else
    {
      // no search performed yet 
      out.write("\r\n");
      out.write("\t\t\t<script language=\"JavaScript1.2\">\r\n");
      out.write("        var now = new Date();\r\n");
      out.write("        var glob = now.getHours()+now.getSeconds()+now.getMilliseconds();\r\n");
      out.write("        var targetURL = \"skins/evsMOD/initSearchPage.html?glob=\"+glob;\r\n");
      out.write("        window.location.href = targetURL;     \r\n");
      out.write("      </script>\r\n");
      out.write("\t\t\t");
  }  
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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
