'This test verifies the external links on the footer of caMOD home page.

'Ensure caMOD home page exists
If Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Exist = True Then
	Reporter.ReportEvent micPass, "caMOD Home Page", "caMOD home page exists."
	Else
	Reporter.ReportEvent micFail, "caMOD Home Page", "caMOD home page does not exist."
	ExitAction ("Test action stopped") 
End If
wait (2)

'Click on NCI Image in the footer @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Image("National Cancer Institute")_;_script infofile_;_ZIP::ssf1.xml_;_
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Image("National Cancer Institute").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("National Cancer Institute")_;_script infofile_;_ZIP::ssf2.xml_;_
URL = Browser("caMOD - Cancer Models").Page("National Cancer Institute").GetROProperty("url")

'Ensure NCI web page displays
If Browser("caMOD - Cancer Models").Page("National Cancer Institute").Image("National Cancer Institute").Exist Then
	Reporter.ReportEvent micPass, "NCI Web Page", "NCI Web page " & URL & " opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(1)
		DataTable (6, dtGlobalSheet) = "Pass"
		DataTable (7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "NCI Web Page", "NCI Web page does not exist."
	Browser("caMOD - Cancer Models").Navigate "http://cancermodels-stage.nci.nih.gov/camod/" @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("Page")_;_script infofile_;_ZIP::ssf3.xml_;_
End If
wait(2)

'Navigate to caMOD home page
Browser("caMOD - Cancer Models").Navigate "http://cancermodels-stage.nci.nih.gov/camod/" @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("Page")_;_script infofile_;_ZIP::ssf3.xml_;_
wait(2)

'Click on DHHS Image in the footer @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Image("National Cancer Institute")_;_script infofile_;_ZIP::ssf1.xml_;_
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").Image("Department of Health and").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").Image("Department of Health and")_;_script infofile_;_ZIP::ssf4.xml_;_
URL = Browser("caMOD - Cancer Models").Page("United States Department").GetROProperty("url")

'Ensure DHHS web page displays
If Browser("caMOD - Cancer Models").Page("United States Department").Image("www.hhs.gov").Exist Then
	Reporter.ReportEvent micPass, "DHHS Web Page", "DHHS Web page " & URL & " opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(2)
	DataTable (6, dtGlobalSheet) = "Pass"
	DataTable (7, dtGlobalSheet) = URL
	Else
	Reporter.ReportEvent micFail, "DHHS Web Page", "DHHS Web page does not exist."
	Browser("caMOD - Cancer Models").Navigate "http://cancermodels-stage.nci.nih.gov/camod/"
End If
wait(2)

'Navigate to caMOD home page
Browser("caMOD - Cancer Models").Navigate "http://cancermodels-stage.nci.nih.gov/camod/" @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("Page")_;_script infofile_;_ZIP::ssf3.xml_;_
wait(2)

'Click on NIH image in the footer
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").Image("National Institutes of").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").Image("National Institutes of")_;_script infofile_;_ZIP::ssf6.xml_;_
URL = Browser("caMOD - Cancer Models").Page("National Institutes of Health").GetROProperty("url")

'Ensure NIH web page displays
If Browser("caMOD - Cancer Models").Page("National Institutes of Health").Image("National Institutes of").Exist Then
	Reporter.ReportEvent micPass, "NIH Web Page", "NIH Web page " & URL & " opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(3)
	DataTable (6, dtGlobalSheet) = "Pass"
	DataTable (7, dtGlobalSheet) = URL
	Else
	Reporter.ReportEvent micFail, "NIH Web Page", "NIH Web page does not exist."
	Browser("caMOD - Cancer Models").Navigate "http://cancermodels-stage.nci.nih.gov/camod/"
End If
wait(2)

'Navigate to caMOD home page
Browser("caMOD - Cancer Models").Navigate "http://cancermodels-stage.nci.nih.gov/camod/" @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("Page")_;_script infofile_;_ZIP::ssf3.xml_;_
wait(2)

'Click on FirstGov image in the footer
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").Image("FirstGov.gov").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").Image("FirstGov.gov")_;_script infofile_;_ZIP::ssf9.xml_;_
URL = Browser("caMOD - Cancer Models").Page("USA.gov: The U.S. Government's").GetROProperty("url")

'Ensure USA Governments page displays
If Browser("caMOD - Cancer Models").Page("USA.gov: The U.S. Government's").Image("USA.gov: Government Made").Exist Then
	Reporter.ReportEvent micPass, "US Gov Page", "US Gov page " & URL & " opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(4)
	DataTable (6, dtGlobalSheet) = "Pass"
	DataTable (7, dtGlobalSheet) = URL
	Else
	Reporter.ReportEvent micFail, "US Gov Page", "US Gov page does not exist."
	Browser("caMOD - Cancer Models").Navigate "http://cancermodels-stage.nci.nih.gov/camod/"
End If
wait(2) @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("USA.gov: The U.S. Government's").Image("Search")_;_script infofile_;_ZIP::ssf10.xml_;_

'Navigate to caMOD home page
Browser("caMOD - Cancer Models").Navigate "http://cancermodels-stage.nci.nih.gov/camod/" @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("Page")_;_script infofile_;_ZIP::ssf3.xml_;_
wait(2)

 @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("National Institutes of").Image("Health A-Z")_;_script infofile_;_ZIP::ssf7.xml_;_






















