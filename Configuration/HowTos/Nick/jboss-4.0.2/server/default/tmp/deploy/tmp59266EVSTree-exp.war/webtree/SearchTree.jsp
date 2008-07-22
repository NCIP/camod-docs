<html>
<head>
  <link rel="stylesheet" type="text/css" href="skins/evsMOD/SearchTree.css"/>
</head>
<body>
<table>
      <form name="search" action="SearchResults.jsp?skin=evsMOD" method="post" target="searchResults">
        <tr>
          <td>
            <table>
       
              <tr>
                <td>Search:</td>
                <td><input name="searchTerm" size="25"/>&nbsp;
                <a href="javascript:document.forms['search'].submit()"><img border="0" src="skins/evsMOD/images/searchButton.gif"/></a>                
                <!--<INPUT type="submit" name="search" value="Search"/>-->
              </tr>
              <tr>              
                <td>&nbsp;</td> 
                <td>
                  <INPUT type="checkbox" name="matchwholewords" unchecked/>&nbsp;Match Entire Search Terms Only
                </td>                   
              </tr>
            </table>
          </td>
        </tr>
      </form>  
</table>
</body>
</html>
