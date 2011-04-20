'Ensure caMOD home page exists
If  Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Exist = True Then
	Reporter.ReportEvent micPass, "caMOD Home", "caMOD home page exists."
	Else
	Reporter.ReportEvent micFail, "caMOD Home", "caMOD home page does not exist."
	ExitAction("Test execution stopped by user")
End If


'Open a model which has MGI, MTB and PubMed References information on Cell Lines
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS")_;_script infofile_;_ZIP::ssf1.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").WebButton("Clear").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").WebButton("Clear")_;_script infofile_;_ZIP::ssf2.xml_;_
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebEdit("modelDescriptor").Set "NeuYD;VEGF-25" @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebEdit("modelDescriptor")_;_script infofile_;_ZIP::ssf3.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebButton("Search").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebButton("Search")_;_script infofile_;_ZIP::ssf4.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_4").Link("NeuYD;VEGF-25").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 4").Link("NeuYD;VEGF-25")_;_script infofile_;_ZIP::ssf5.xml_;_
wait(1)

'Go to Cell Lines details and click on MGI References
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("CELL LINES").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("CELL LINES")_;_script infofile_;_ZIP::ssf6.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("MGI").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 6").Link("MGI")_;_script infofile_;_ZIP::ssf7.xml_;_
URL = Browser("MGI_4.35 - References").Page("MGI_4.35 - References").GetROProperty("url")

'Ensure MGI References page opens
If  Browser("MGI_4.35 - References").Page("MGI_4.35 - References").Exist = True Then
	Reporter.ReportEvent micPass, "MGI References", "MGI References page exists."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(18)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "MGI References", "MGI References page does not exist."
	ExitAction("Test execution stopped by user")
End If
wait(2)

Browser("MGI_4.35 - References").Page("MGI_4.35 - References").Sync @@ hightlight id_;_Browser("MGI_4.35 - References").Page("MGI_4.35 - References")_;_script infofile_;_ZIP::ssf8.xml_;_
Browser("MGI_4.35 - References").CloseAllTabs

'Click on MTB References
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("MTB").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 6").Link("MTB")_;_script infofile_;_ZIP::ssf9.xml_;_
URL = Browser("MGI_4.35 - References").Page("Reference Detail").GetROProperty("url")

'Ensure  MTB Reference Details page opens
If  Browser("MGI_4.35 - References").Page("Reference Detail").Exist = True Then
	Reporter.ReportEvent micPass, "MTB References", "MTB Reference Details page exists."

    DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(19)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL
	Else
	Reporter.ReportEvent micFail, "MTB References", "MTB Reference Details page does not exist."
	ExitAction("Test execution stopped by user")
End If
wait(2)

Browser("MGI_4.35 - References").Page("Reference Detail").Sync @@ hightlight id_;_Browser("MGI_4.35 - References").Page("Reference Detail")_;_script infofile_;_ZIP::ssf10.xml_;_
Browser("MGI_4.35 - References").CloseAllTabs

'Click on PubMed number on Therapy page
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("15958580").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 6").Link("15958580")_;_script infofile_;_ZIP::ssf11.xml_;_
URL = Browser("MGI_4.35 - References").Page("Antitumor activity of").GetROProperty("url")

'Ensure PubMed page opens
If  Browser("MGI_4.35 - References").Page("Antitumor activity of").Exist = True Then
	Reporter.ReportEvent micPass, "PubMed", "PubMed details opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(20)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "PubMed", "PubMed details did not opened."
	ExitAction("Test execution stopped by user")
End If
wait(2)

Browser("MGI_4.35 - References").Page("Antitumor activity of").Sync @@ hightlight id_;_Browser("MGI_4.35 - References").Page("Antitumor activity of")_;_script infofile_;_ZIP::ssf12.xml_;_
Browser("MGI_4.35 - References").CloseAllTabs


Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("HOME").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 6").Link("HOME")_;_script infofile_;_ZIP::ssf13.xml_;_
Browser("caMOD - Cancer Models").Close

'dataFile = "\\nci6116g.nci.nih.gov\group\NCICB\QA\PhungQH\LS_QTP\caMOD\ExtLinksTestResults.xls"
dataFile2 = "C:\Madhavi Automation\caMOD\Test Data\ExtLinksTestResults.xls"
DataTable.Export dataFile2
