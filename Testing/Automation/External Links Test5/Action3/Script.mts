'Ensure caMOD home page exists
If  Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Exist = True Then
	Reporter.ReportEvent micPass, "caMOD Home", "caMOD home page exists."
	Else
	Reporter.ReportEvent micFail, "caMOD Home", "caMOD home page does not exist."
	ExitAction("Test execution stopped by user")
End If

'Naviagte to Simple Search and open a model which has ZFIN References on Publications page
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS")_;_script infofile_;_ZIP::ssf1.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").WebButton("Clear").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").WebButton("Clear")_;_script infofile_;_ZIP::ssf2.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebEdit("modelDescriptor").Set "XEF1-TEL-AML1 " @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebEdit("modelDescriptor")_;_script infofile_;_ZIP::ssf3.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebButton("Search").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebButton("Search")_;_script infofile_;_ZIP::ssf4.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_4").Link("XEF1-TEL-AML1").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 4").Link("XEF1-TEL-AML1")_;_script infofile_;_ZIP::ssf5.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("PUBLICATIONS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("PUBLICATIONS")_;_script infofile_;_ZIP::ssf6.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("ZFIN").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 6").Link("ZFIN")_;_script infofile_;_ZIP::ssf7.xml_;_
URL = Browser("ZFIN: Publication: Sabaawy").Page("ZFIN: Publication: Sabaawy").GetROProperty("url")

'Ensure ZFIN Reference page opens
If  Browser("ZFIN: Publication: Sabaawy").Page("ZFIN: Publication: Sabaawy").Exist = True Then
	Reporter.ReportEvent micPass, "ZFIN", "ZFIN Reference page opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(32)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "ZFIN", "ZFIN Reference page did not opened."
	ExitAction("Test execution stopped by user")
End If

Browser("ZFIN: Publication: Sabaawy").Page("ZFIN: Publication: Sabaawy").Sync @@ hightlight id_;_Browser("ZFIN: Publication: Sabaawy").Page("ZFIN: Publication: Sabaawy")_;_script infofile_;_ZIP::ssf8.xml_;_
Browser("ZFIN: Publication: Sabaawy").CloseAllTabs

Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("HOME").Click
Browser("caMOD - Cancer Models").CloseAllTabs

'dataFile = "\\nci6116g.nci.nih.gov\group\NCICB\QA\PhungQH\LS_QTP\caMOD\ExtLinksTestResults.xls"
dataFile1 = "C:\Madhavi Automation\caMOD\Test Data\ExtLinksTestResults.xls"
DataTable.Export dataFile1

