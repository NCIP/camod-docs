dataFile = "\\nci6116g.nci.nih.gov\group\NCICB\QA\PhungQH\LS_QTP\caMOD\ExtLinksTestResults.xls"
dataFile1 = "C:\Madhavi Automation\caMOD\Test Data\ExtLinksTestResults.xls"

dataTable.Import dataFile1

'Ensure caMOD home page exist
If  Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Exist = True Then
	Reporter.ReportEvent micPass, "caMOD Home", "caMOD home page exists."
	Else
	Reporter.ReportEvent micFail, "caMOD Home", "caMOD home page does not exist."
	ExitAction ("Test execution stopped by user")
End If

'Navigate to Advanced Search and click on Find PMID 
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS")_;_script infofile_;_ZIP::ssf1.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").Link("ADVANCED SEARCH").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").Link("ADVANCED SEARCH")_;_script infofile_;_ZIP::ssf2.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebButton("Find PMID").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebButton("Find PMID")_;_script infofile_;_ZIP::ssf3.xml_;_
wait(3)
url = Browser("PubMed home").Page("PubMed home").GetROProperty("url")

'Ensure PubMed home page opens
If Browser("PubMed home").Page("PubMed home").Exist = True Then
	Reporter.ReportEvent micPass, "PubMed Home", "PubMed home page opened with " & url & "."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(10)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else 
	Reporter.ReportEvent micFail, "PubMed Home", "PubMed home page did not opened."
	ExitAction ("Test execution stopped by user")
End If

Browser("PubMed home").CloseAllTabs

Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").Link("HOME").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").Link("HOME")_;_script infofile_;_ZIP::ssf5.xml_;_
