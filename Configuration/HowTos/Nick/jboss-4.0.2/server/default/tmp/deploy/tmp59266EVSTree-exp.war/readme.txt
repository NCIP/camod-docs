		README
		------

EvSTree application is a configurable web application that helps to navigate the 
EVS (Enterprise Vocabulary Service )



Download source from CVS
•	Download to ROOT\EVSTree)

Changes:

•	Modify <context-param> in "EVSTree/WEB-INF/web.xml" to point to your local directory where to store infoLog.txt file.

•	Modify "<diskStore path="..."> element in "EVSTree/src/gov/nih/nci/evs/app/webtree/evsTrees_ehcache.xml" cache config 
	file topoint to directory where tree cache files should be stored.

•	Optionally make changes to tree config settings in "EVSTree\src\gov\nih\nci\EVS\app\util\evsconfig.properties" file.
	Add new tree configurations as needed, be sure to update "TotalTrees" count. 

•	Run "ant build" script in "EVSTree" (generates EVSTree.war in EVSTree\output folder)

•	Copy  EVSTree.war file to webapps folder of your Tomcat container.


How do you test
•	Start the tomcat container.
•	Open your Internet explorer(IE browser)
•	Type in url: http://localhost:8080/EVSTree in the address bar.
•	Click on the select button of Site of Leison/Tumor
•	Select a node from the generated tree.
•	Confirm the selection by clicking OK. 
•	The selected node appears in the text box.
•	Click on the select button of Diagnosis.
•	Select a node from the generated tree.
•	Confirm the selection by clicking OK.
•	The selected node appears in the text box of diagnosis.


Tree Caching
• 	Trees are cached if the "cache" flag for a tree configuration is set to true.
•	Once cached, trees will NOT be updated from EVS and remain static until manually removed.
•	Cache files for trees are built by either of the following ways:
	(1) Upon webapp startup trees with "cache" flags set in the "evsconfig.properties" file will be cached.
	(2) CMD-line method thru running "ant run-load-cache".
	(3) Trees not configured in the properties files, but rather built dynamically via URL parameters passed at run-time
	will be cached if "cache" flag is set and unique "treeNameKey" is set and passed along as URL tree parameter.
•	Cached trees are stored in diskstore files named after their "treeNameKey".  A diskstore is made up of 2 files, a data file, 
	and index file. (eg. "Tissue.data", "Tissue.index").
•	In order to re-build a tree from EVS and re-cache it, the diskstore files for that tree MUST be removed, and the tree will
	be rebuild from EVS and re-cached following one of the 3 methods previously mentioned.
•	The "WebTreesCache" diskstore caches web display trees to improve performance. However, whenever a tree is re-built from
	EVS, the "WebTreesCache" will be cleared of any trees associated to the updated EVS tree.
•	For developers who wish to block queries to EVS, setting the "cacheOnly" flag in the "evsconfig.properties" file will
	disable ALL EVS Queries. Only trees from the Cache will be loaded. If a tree not is not found in the cache, it will NOT be
	displayed.


 