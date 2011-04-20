'dataFile = "\\nci6116g.nci.nih.gov\group\NCICB\QA\PhungQH\LS_QTP\caMOD\ExtLinksTestResults.xls"
DataFile1 = "C:\Madhavi Automation\caMOD\Test Data\ExtLinksTestResults.xls"
dataTable.Import dataFile1


'Ensure caMOD home page exists
If  Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Exist = True Then
	Reporter.ReportEvent micPass, "caMOD Home", "caMOD home page exists."
	Else
	Reporter.ReportEvent micFail, "caMOD Home", "caMOD home page does not exist."
	ExitAction("Test execution stopped by user")
End If

'Naviagte to Simple Search and open a model which has alternate URL for image

Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS")_;_script infofile_;_ZIP::ssf1.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").WebButton("Clear").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").WebButton("Clear")_;_script infofile_;_ZIP::ssf2.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebEdit("modelDescriptor").Set "A/HeJ" @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebEdit("modelDescriptor")_;_script infofile_;_ZIP::ssf3.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebButton("Search").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebButton("Search")_;_script infofile_;_ZIP::ssf4.xml_;_
wait(2)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_4").Link("A/HeJ").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 4").Link("A/HeJ")_;_script infofile_;_ZIP::ssf5.xml_;_
wait(10)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("IMAGES").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("IMAGES")_;_script infofile_;_ZIP::ssf6.xml_;_
wait(20)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("http://tumor.informatics.jax.o").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 6").Link("http://tumor.informatics.jax.o")_;_script infofile_;_ZIP::ssf7.xml_;_
wait(10)
URL = Browser("Tumor Pathology Report/Images").Page("Tumor Pathology Report/Images").GetROProperty("url")

'Ensure Tumor Pathology Report/Images page opens
If  Browser("Tumor Pathology Report/Images").Page("Tumor Pathology Report/Images").Exist = True Then
	Reporter.ReportEvent micPass, "Image", "Tumor Pathology Report/Images page opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(21)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "Image", "Tumor Pathology Report/Images page did not opened."
	ExitAction("Test execution stopped by user")
End If

Browser("Tumor Pathology Report/Images").Page("Tumor Pathology Report/Images").Sync @@ hightlight id_;_Browser("Tumor Pathology Report/Images").Page("Tumor Pathology Report/Images")_;_script infofile_;_ZIP::ssf8.xml_;_
Browser("Tumor Pathology Report/Images").CloseAllTabs

Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("HOME").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 6").Link("HOME")_;_script infofile_;_ZIP::ssf9.xml_;_
