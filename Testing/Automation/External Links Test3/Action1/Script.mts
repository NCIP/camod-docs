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

'Naviagte to Simple Search -> Publications and click on References to MGI  link
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS")_;_script infofile_;_ZIP::ssf1.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").Link("SIMPLE SEARCH").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").Link("SIMPLE SEARCH")_;_script infofile_;_ZIP::ssf2.xml_;_
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebList("species").Select "Mouse (Mus musculus)" @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebList("species")_;_script infofile_;_ZIP::ssf3.xml_;_
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_4").WebButton("Search").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 4").WebButton("Search")_;_script infofile_;_ZIP::ssf4.xml_;_
wait(3)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("MMTV-erbB2 x MMTV-p16").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("MMTV-erbB2 x MMTV-p16")_;_script infofile_;_ZIP::ssf5.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("PUBLICATIONS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 6").Link("PUBLICATIONS")_;_script infofile_;_ZIP::ssf6.xml_;_
wait(1)
ref = Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_7").WebElement("MGI").GetROProperty("innertext") @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 7").WebElement("MGI")_;_script infofile_;_ZIP::ssf7.xml_;_
refNumber = left(ref, 8)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_7").Link("MGI").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 7").Link("MGI")_;_script infofile_;_ZIP::ssf7.xml_;_
URL = Browser("MGI_4.35 - References").Page("MGI_4.35 - References").GetROProperty("url")
wait(2)

'Ensure MGI References page opens
If  Browser("MGI_4.35 - References").Page("MGI_4.35 - References").Exist = True Then
	Reporter.ReportEvent micPass, "MGI References", "MGI References page exists."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(12)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "MGI References", "MGI References page does not exist."
	ExitAction("Test execution stopped by user")
End If


Browser("MGI_4.35 - References").Page("MGI_4.35 - References").Sync @@ hightlight id_;_Browser("MGI_4.35 - References").Page("MGI_4.35 - References")_;_script infofile_;_ZIP::ssf8.xml_;_
Browser("MGI_4.35 - References").CloseAllTabs

'Click on MTB link on Publications page
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_7").Link("MTB").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 7").Link("MTB")_;_script infofile_;_ZIP::ssf9.xml_;_
URL = Browser("MGI_4.35 - References").Page("Reference Detail").GetROProperty("url")

'Ensure  MTB Reference Details page opens
If  Browser("MGI_4.35 - References").Page("Reference Detail").Exist = True Then
	Reporter.ReportEvent micPass, "MTB References", "MTB Reference Details page exists."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(13)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "MTB References", "MTB Reference Details page does not exist."
	ExitAction("Test execution stopped by user")
End If

Browser("MGI_4.35 - References").Page("Reference Detail").Sync @@ hightlight id_;_Browser("MGI_4.35 - References").Page("Reference Detail")_;_script infofile_;_ZIP::ssf10.xml_;_
Browser("MGI_4.35 - References").CloseAllTabs

'Click on PubMed number on Publications page
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_7").Link("14982856").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 7").Link("14982856")_;_script infofile_;_ZIP::ssf11.xml_;_
URL = Browser("MGI_4.35 - References").Page("The role of the cyclin").GetROProperty("url")

'Ensure PubMed page opens
If  Browser("MGI_4.35 - References").Page("The role of the cyclin").Exist = True Then
	Reporter.ReportEvent micPass, "PubMed", "PubMed page exists."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(14)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "PubMed", "PubMed page does not exist."
	ExitAction("Test execution stopped by user")
End If

Browser("MGI_4.35 - References").Page("The role of the cyclin").Sync @@ hightlight id_;_Browser("MGI_4.35 - References").Page("The role of the cyclin")_;_script infofile_;_ZIP::ssf12.xml_;_
Browser("MGI_4.35 - References").CloseAllTabs

Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_7").Link("HOME").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 7").Link("HOME")_;_script infofile_;_ZIP::ssf13.xml_;_

