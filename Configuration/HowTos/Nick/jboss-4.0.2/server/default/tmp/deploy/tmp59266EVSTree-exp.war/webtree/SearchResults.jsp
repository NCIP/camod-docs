<%@ page import="java.io.*"%>
<%@ page import="java.util.*, java.lang.*"%>
<%@ page import="gov.nih.nci.evs.app.webtree.*"%>

<%
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
%>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="skins/evsMOD/SearchResults.css" />
		<script language="JavaScript1.2" src="skins/evsMOD/JavaScript.js"></script>
	</head>


	<body>
		<table width="100%">
			<%  

    // loop through results vector and display

    if (searchResults != null && synonyms.size()>0 && searchResults.size()> 0)
    {

if (searchResults.size() > 0)
      {
%>
			<%      if (synonyms != null && synonyms.size() > 1)
        {           
%>
			<tr>
			</tr>
			<%      }
%>

			<tr width="100%">
				<td>
					<table width="100%" cellpadding="5">
						<%
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

		%>
						<tr>
							<%        // render concept name 
          		String linkAction = myWebNode.getAction();
          		if (linkAction.length() > 0 )
          		{ %>
							<td class="searchResult">
								<%=myName%>
							</td>
							<%        }
          		else 
          		{ %>
							<td class="searchResult">
								<%=myName%>
							</td>
							<%        }  %>

							<td class="searchResult" width=120>
								<a class="link" target="tree" href="WebTree.jsp?targetId=<%=java.net.URLEncoder.encode(myId)%>&amp;targetName=<%=java.net.URLEncoder.encode(myName)%>&amp;treeAction=highlight#<%=java.net.URLEncoder.encode(myId)%>&amp;skin=evsMOD"> <img
										src="skins/evsMOD/images/TreeHighlightUP.gif" width="110" height="18" border="1" alt="highlight this term in the data tree"> </a>
							</td>
						</tr>
						<%        } //if   no dups
            }//if webnode
          } //while 
  		 userSession.setAttribute("allhash", allhash); 
%>
					</table>
				</td>
			</tr>
			<%}// if search result size
%>

			<%
      // get post search message if any 
      String postSearchMsg = webTree.getPostSearchMsg();
      if (postSearchMsg != null){ %>
			<tr>
				<td>
					<%=postSearchMsg%>
				</td>
			</tr>
			<%}//if postsearch msg ends here


} //search result, synonym size, searchresult size
else  if (searchResults!=null && synonyms.size()<=0)
      {
// results set empty..nothing found
%>
			<tr>
				<td class="noMatches">
					No Matches Found
				</td>
			</tr>
			<%   // get post search message if any 
      String postSearchMsg = webTree.getPostSearchMsg();
      	if (postSearchMsg != null){ %>
			<tr>
				<td>
					<%=postSearchMsg%>
				</td>
			</tr>
			<%}//if postsearch msg ends here 
		} //else if

      else
    {
      // no search performed yet %>
			<script language="JavaScript1.2">
        var now = new Date();
        var glob = now.getHours()+now.getSeconds()+now.getMilliseconds();
        var targetURL = "skins/evsMOD/initSearchPage.html?glob="+glob;
        window.location.href = targetURL;     
      </script>
			<%  }  %>
		</table>
	</body>
</html>
