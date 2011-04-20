'dataFile = "\\nci6116g.nci.nih.gov\group\NCICB\QA\PhungQH\LS_QTP\caMOD\ExtLinksTestResults.xls"
dataFile1 = "C:\Madhavi Automation\caMOD\Test Data\ExtLinksTestResults.xls"
dataTable.Import dataFile1

'Ensure caMOD home page exists
If  Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Exist = True Then
	Reporter.ReportEvent micPass, "caMOD Home", "caMOD home page exists."
	Else
	Reporter.ReportEvent micFail, "caMOD Home", "caMOD home page does not exist."
	ExitAction("Test execution stopped by user")
End If

'Naviagte to Simple Search and open a model which has ATCC number of Cell Line on Transplantation page
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS")_;_script infofile_;_ZIP::ssf1.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").WebButton("Clear").Click
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").WebEdit("modelDescriptor").Set "SAHA treated D283 induced medulloblastoma mice " @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").WebEdit("modelDescriptor")_;_script infofile_;_ZIP::ssf2.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").WebButton("Search").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").WebButton("Search")_;_script infofile_;_ZIP::ssf3.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").Link("SAHA treated D283 induced").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").Link("SAHA treated D283 induced")_;_script infofile_;_ZIP::ssf4.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_4").Link("TRANSPLANTATION").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 4").Link("TRANSPLANTATION")_;_script infofile_;_ZIP::ssf5.xml_;_
wait(1)
'Click on ATCC number of Cell Line link
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("HTB-185").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("HTB-185")_;_script infofile_;_ZIP::ssf6.xml_;_
wait(1)
URL = Browser("ATCC: Catalog Search").Page("ATCC: Catalog Search").GetROProperty("url")

'Ensure ATCC: Catalog Search page opens
If  Browser("ATCC: Catalog Search").Page("ATCC: Catalog Search").Exist = True Then
	Reporter.ReportEvent micPass, "ATCC Number", "ATCC: Catalog Search page opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(28)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "ATCC Number", "ATCC: Catalog Search page did not opened."
	ExitAction("Test execution stopped by user")
End If

Browser("ATCC: Catalog Search").Page("ATCC: Catalog Search").Sync @@ hightlight id_;_Browser("ATCC: Catalog Search").Page("ATCC: Catalog Search")_;_script infofile_;_ZIP::ssf7.xml_;_
Browser("ATCC: Catalog Search").CloseAllTabs

Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("HOME").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("HOME")_;_script infofile_;_ZIP::ssf8.xml_;_
