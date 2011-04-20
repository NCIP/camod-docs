'Ensure caMOD home page exists
If  Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Exist = True Then
	Reporter.ReportEvent micPass, "caMOD Home", "caMOD home page exists."
	Else
	Reporter.ReportEvent micFail, "caMOD Home", "caMOD home page does not exist."
	ExitAction("Test execution stopped by user")
End If

'Naviagte to Simple Search and open a model which has link for NSC Number on Therapy page
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS")_;_script infofile_;_ZIP::ssf1.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").WebButton("Clear").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").WebButton("Clear")_;_script infofile_;_ZIP::ssf3.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebEdit("modelDescriptor").Set "PLZF-RARalpha " @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebEdit("modelDescriptor")_;_script infofile_;_ZIP::ssf4.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebButton("Search").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebButton("Search")_;_script infofile_;_ZIP::ssf5.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_4").Link("PLZF-RARalpha x PLZF -/-").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 4").Link("PLZF-RARalpha x PLZF -/-")_;_script infofile_;_ZIP::ssf6.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("THERAPEUTIC APPROACHES").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("THERAPEUTIC APPROACHES")_;_script infofile_;_ZIP::ssf7.xml_;_
wait(1)
'Click on Chemical Structure for NSC Number
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("Chemical Structure").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 6").Link("Chemical Structure")_;_script infofile_;_ZIP::ssf8.xml_;_
URL = Browser("Basic Chemical Data").Page("Basic Chemical Data").GetROProperty("url")

'Ensure Basic Chemical Data page opens
If  Browser("Basic Chemical Data").Page("Basic Chemical Data").Exist = True Then
	Reporter.ReportEvent micPass, "NSC Number", "Basic Chemical Data page opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(26)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "NSC Number", "Basic Chemical Data page did not opened."
	ExitAction("Test execution stopped by user")
End If
Browser("Basic Chemical Data").Page("Basic Chemical Data").Sync @@ hightlight id_;_Browser("Basic Chemical Data").Page("Basic Chemical Data")_;_script infofile_;_ZIP::ssf9.xml_;_
Browser("Basic Chemical Data").CloseAllTabs

Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_7").Link("HOME").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 7").Link("HOME")_;_script infofile_;_ZIP::ssf10.xml_;_

'Naviagte to Simple Search and open a model which has link for CAS Number on Therapy page

Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS")_;_script infofile_;_ZIP::ssf11.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").WebButton("Clear").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").WebButton("Clear")_;_script infofile_;_ZIP::ssf12.xml_;_
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebEdit("modelDescriptor").Set "canine invasive transitional cell carcinoma (TCC) of the urinary bladder" @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebEdit("modelDescriptor")_;_script infofile_;_ZIP::ssf13.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebButton("Search").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebButton("Search")_;_script infofile_;_ZIP::ssf14.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_4").Link("canine invasive transitional").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 4").Link("canine invasive transitional")_;_script infofile_;_ZIP::ssf15.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_8").Link("THERAPEUTIC APPROACHES").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 8").Link("THERAPEUTIC APPROACHES")_;_script infofile_;_ZIP::ssf16.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_9").Link("Chemical Structure").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 9").Link("Chemical Structure")_;_script infofile_;_ZIP::ssf17.xml_;_
wait(2)

URL = Browser("Basic Chemical Data_2").Page("Basic Chemical Data").GetROProperty("url")

'Ensure Basic Chemical Data page opens
If  Browser("Basic Chemical Data").Page("Basic Chemical Data").Exist = True Then
	Reporter.ReportEvent micPass, "NSC Number", "Basic Chemical Data page opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(27)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "NSC Number", "Basic Chemical Data page did not opened."
	ExitAction("Test execution stopped by user")
End If

Browser("Basic Chemical Data_2").Page("Basic Chemical Data").Sync @@ hightlight id_;_Browser("Basic Chemical Data_2").Page("Basic Chemical Data")_;_script infofile_;_ZIP::ssf18.xml_;_
Browser("Basic Chemical Data_2").CloseAllTabs

Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_10").Link("HOME").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 10").Link("HOME")_;_script infofile_;_ZIP::ssf19.xml_;_
Browser("caMOD - Cancer Models").CloseAllTabs

'dataFile = "\\nci6116g.nci.nih.gov\group\NCICB\QA\PhungQH\LS_QTP\caMOD\ExtLinksTestResults.xls"
dataFile2 = "C:\Madhavi Automation\caMOD\Test Data\ExtLinksTestResults.xls"
DataTable.Export dataFile2
