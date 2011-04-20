'Ensure caMOD home page exist
If  Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Exist = True Then
	Reporter.ReportEvent micPass, "caMOD Home", "caMOD home page exists."
	Else
	Reporter.ReportEvent micFail, "caMOD Home", "caMOD home page does not exist."
	ExitAction ("Test execution stopped by user")
End If

'Navigate to Simple Search -> Genetic Description and click on MGI ID
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS")_;_script infofile_;_ZIP::ssf1.xml_;_
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").WebList("species").Select "Mouse (Mus musculus)" @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").WebList("species")_;_script infofile_;_ZIP::ssf2.xml_;_
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebButton("Search").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebButton("Search")_;_script infofile_;_ZIP::ssf3.xml_;_
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_4").Link("MMTV-erbB2 x MMTV-p16").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 4").Link("MMTV-erbB2 x MMTV-p16")_;_script infofile_;_ZIP::ssf4.xml_;_
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("GENETIC DESCRIPTION").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("GENETIC DESCRIPTION")_;_script infofile_;_ZIP::ssf5.xml_;_
expmgiId = Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("MGI:1857942").GetROProperty("text")

Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("MGI:1857942").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 6").Link("MGI:1857942")_;_script infofile_;_ZIP::ssf6.xml_;_
URL = Browser("MGI Quick Search Results").Page("MGI Quick Search Results").GetROProperty("url")

'Ensure MGI Quick Search Results page opens
If  Browser("MGI Quick Search Results").Page("MGI Quick Search Results").Exist = True Then
	Reporter.ReportEvent micPass, "MGI Search", "MGI Quick Search Results page opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(11)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "MGI Search", "MGI Quick Search Results page did not opened."
	ExitAction("User stopped test execution")
End If
wait(2)

'Retrive search results and ensure they are correct results @@ hightlight id_;_Browser("MGI Quick Search Results").Page("MGI Quick Search Results")_;_script infofile_;_ZIP::ssf7.xml_;_
actMgiId = Browser("MGI Quick Search Results").Page("MGI Quick Search Results").WebEdit("query").GetROProperty("value") @@ hightlight id_;_Browser("MGI Quick Search Results").Page("MGI Quick Search Results").WebEdit("query")_;_script infofile_;_ZIP::ssf7.xml_;_

If trim(expMgiId) =  Ucase(actMgiId) Then
	Reporter.ReportEvent micPass, "MGI Search", "MGIQuick Search Results page opened correctly for MGI ID '" & actMgiId & "'."
	Else
	Reporter.ReportEvent micFail, "MGI Search", "Wrong MGIQuick Search Results page opened."
End If
Browser("MGI Quick Search Results").CloseAllTabs

Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("HOME").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 6").Link("HOME")_;_script infofile_;_ZIP::ssf8.xml_;_
wait(1)

Browser("caMOD - Cancer Models").CloseAllTabs

'dataFile = "\\nci6116g.nci.nih.gov\group\NCICB\QA\PhungQH\LS_QTP\caMOD\ExtLinksTestResults.xls"
dataFile2 = "C:\Madhavi Automation\caMOD\Test Data\ExtLinksTestResults.xls"
DataTable.Export dataFile2






