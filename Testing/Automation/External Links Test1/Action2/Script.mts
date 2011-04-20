'This test verifies the external links on the fleft side navigation bar of caMOD home page.

'Ensure caMOD home page exists
If Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Exist = True Then
	Reporter.ReportEvent micPass, "caMOD Home Page", "caMOD home page exists."
	Else
	Reporter.ReportEvent micFail, "caMOD Home Page", "caMOD home page does not exist."
	ExitAction ("Test action stopped") 
End If
wait(2)

'Click on NCI Home link on left side menu bar
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_4").Link("NCI HOME").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 4").Link("NCI HOME")_;_script infofile_;_ZIP::ssf12.xml_;_
URL = Browser("National Cancer Institute").Page("National Cancer Institute").GetROProperty("url")
'Ensure NCI web page displays
If Browser("National Cancer Institute").Page("National Cancer Institute").Exist = True Then
	Reporter.ReportEvent micPass, "NCI Home", "NCI Home hyperlink opened with " & URL & "."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(5)
	DataTable (6, dtGlobalSheet) = "Pass"
	DataTable (7, dtGlobalSheet) = URL
	Else
	Reporter.ReportEvent micFail, "NCI Home", "NCI Home page did not displayed."
End If
wait (2)

Browser("National Cancer Institute").CloseAllTabs
wait(2)

'Click on NCICB Home link on the left side menu bar
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").Link("NCICB HOME").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").Link("NCICB HOME")_;_script infofile_;_ZIP::ssf3.xml_;_
URL = Browser("National Cancer Institute").Page("NCICB: Home").GetROProperty("url")
'Ensure NCICB Home page displays
If Browser("National Cancer Institute").Page("NCICB: Home").Exist = True Then
	Reporter.ReportEvent micPass, "NCICB Home", "NCICB Home hyperlink opened with " & URL & "."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(6)
	DataTable (6, dtGlobalSheet) = "Pass"
	DataTable (7, dtGlobalSheet) = URL
	Else
	Reporter.ReportEvent micFail, "NCICB Home", "NCICB Home page did not displayed."
End If
wait(2)

Browser("National Cancer Institute").CloseAllTabs
wait(2)

'Click on EMICE Website
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").Link("EMICE WEBSITE").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").Link("EMICE WEBSITE")_;_script infofile_;_ZIP::ssf5.xml_;_
URL = Browser("National Cancer Institute").Page("Emice").GetROProperty("url")
'Ensure EMICEweb page displays
If Browser("National Cancer Institute").Page("Emice").Exist = True Then
	Reporter.ReportEvent micPass, "EMICE Home", "EMICE Home page opened with " & URL & "."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(7)
	DataTable (6, dtGlobalSheet) = "Pass"
	DataTable (7, dtGlobalSheet) = URL
	Else
	Reporter.ReportEvent micFail, "EMICE Home", "EMICE Home page did not displayed."
End If
wait (2) @@ hightlight id_;_Browser("National Cancer Institute").Page("Emice")_;_script infofile_;_ZIP::ssf6.xml_;_

Browser("National Cancer Institute").CloseAllTabs
wait(2)

'Click on Cancer Image Database
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").Link("CANCER IMAGES DATABASE").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").Link("CANCER IMAGES DATABASE")_;_script infofile_;_ZIP::ssf7.xml_;_
URL = Browser("National Cancer Institute").Page("caIMAGE Server").GetROProperty("url")
'Ensure caIMAGE DBpage displays
If Browser("National Cancer Institute").Page("caIMAGE Server").Exist = True Then
	Reporter.ReportEvent micPass, "caIMAGE Home", "caIMAGE Home page opened with " & URL & "."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(8)
	DataTable (6, dtGlobalSheet) = "Pass"
	DataTable (7, dtGlobalSheet) = URL
	Else
	Reporter.ReportEvent micFail, "caIMAGE Home", "caIMAGE Home page did not displayed."
End If
wait (2) @@ hightlight id_;_Browser("National Cancer Institute").Page("caIMAGE Server")_;_script infofile_;_ZIP::ssf8.xml_;_

Browser("National Cancer Institute").CloseAllTabs
wait (2)

'Click on NCICBSupport link on the left side menu
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").Link("NCICB SUPPORT").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").Link("NCICB SUPPORT")_;_script infofile_;_ZIP::ssf9.xml_;_
URL = Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").GetROProperty("url")
'Ensure NCICB Support page displays
If Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").Exist = True Then
	Reporter.ReportEvent micPass, "NCICB Support", "NCICB Support page opened with " & URL & "."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(9)
	DataTable (6, dtGlobalSheet) = "Pass"
	DataTable (7, dtGlobalSheet) = URL
	Else
	Reporter.ReportEvent micFail, "NCICB Support", "NCICB Support page did not displayed."
End If
wait (2) @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").Link("ncicb@pop.nci.nih.gov")_;_script infofile_;_ZIP::ssf10.xml_;_

'Navigate to home page
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").Link("HOME").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").Link("HOME")_;_script infofile_;_ZIP::ssf11.xml_;_
Browser("caMOD - Cancer Models").CloseAllTabs
wait(2)

'dataFile = "\\nci6116g.nci.nih.gov\group\NCICB\QA\PhungQH\LS_QTP\caMOD\ExtLinksTestResults.xls"
dataFile2 = "C:\Madhavi Automation\caMOD\Test Data\ExtLinksTestResults.xls"

DataTable.Export dataFile2





