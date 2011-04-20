'Ensure caMOD home page exists
If  Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Exist = True Then
	Reporter.ReportEvent micPass, "caMOD Home", "caMOD home page exists."
	Else
	Reporter.ReportEvent micFail, "caMOD Home", "caMOD home page does not exist."
	ExitAction("Test execution stopped by user")
End If


'Open a model which has MGI, MTB and PubMed References information on Therapeutic Approach
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS")_;_script infofile_;_ZIP::ssf1.xml_;_
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").WebButton("Clear").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").WebButton("Clear")_;_script infofile_;_ZIP::ssf2.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").WebEdit("modelDescriptor").Set "Myeloid Leukemia in Nf1 Mice " @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").WebEdit("modelDescriptor")_;_script infofile_;_ZIP::ssf2.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").WebButton("Search").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").WebButton("Search")_;_script infofile_;_ZIP::ssf3.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").Link("Myeloid Leukemia in Nf1").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").Link("Myeloid Leukemia in Nf1")_;_script infofile_;_ZIP::ssf4.xml_;_
wait(1)

'Go to Therapeutic Approaches details and click on MGI References
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_4").Link("THERAPEUTIC APPROACHES").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 4").Link("THERAPEUTIC APPROACHES")_;_script infofile_;_ZIP::ssf5.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("MGI").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("MGI")_;_script infofile_;_ZIP::ssf6.xml_;_
URl = Browser("MGI_4.35 - References").Page("MGI_4.35 - References").GetROProperty("url")

'Ensure MGI References page opens
If  Browser("MGI_4.35 - References").Page("MGI_4.35 - References").Exist = True Then
	Reporter.ReportEvent micPass, "MGI References", "MGI References page exists."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(15)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "MGI References", "MGI References page does not exist."
	ExitAction("Test execution stopped by user")
End If
wait(2)

Browser("MGI_4.35 - References").Page("MGI_4.35 - References").Sync @@ hightlight id_;_Browser("MGI_4.35 - References").Page("MGI_4.35 - References")_;_script infofile_;_ZIP::ssf7.xml_;_
Browser("MGI_4.35 - References").CloseAllTabs

'Click on MTB References
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("MTB").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("MTB")_;_script infofile_;_ZIP::ssf8.xml_;_
URL = Browser("MGI_4.35 - References").Page("Reference Detail").GetROProperty("url")

'Ensure  MTB Reference Details page opens
If  Browser("MGI_4.35 - References").Page("Reference Detail").Exist = True Then
	Reporter.ReportEvent micPass, "MTB References", "MTB Reference Details page exists."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(16)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "MTB References", "MTB Reference Details page does not exist."
	ExitAction("Test execution stopped by user")
End If
wait(2)

Browser("MGI_4.35 - References").Page("Reference Detail").Sync @@ hightlight id_;_Browser("MGI_4.35 - References").Page("Reference Detail")_;_script infofile_;_ZIP::ssf9.xml_;_
Browser("MGI_4.35 - References").CloseAllTabs

'Click on PubMed number on Therapy page
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("10498620").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("10498620")_;_script infofile_;_ZIP::ssf10.xml_;_
URL = Browser("MGI_4.35 - References").Page("In vitro and in vivo effects").GetROProperty("url")

'Ensure PubMed page opens
If  Browser("MGI_4.35 - References").Page("In vitro and in vivo effects").Exist = True Then
	Reporter.ReportEvent micPass, "PubMed", "PubMed page exists."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(17)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "PubMed", "PubMed page does not exist."
	ExitAction("Test execution stopped by user")
End If
wait(2)

Browser("MGI_4.35 - References").Page("In vitro and in vivo effects").Sync @@ hightlight id_;_Browser("MGI_4.35 - References").Page("In vitro and in vivo effects")_;_script infofile_;_ZIP::ssf11.xml_;_
Browser("MGI_4.35 - References").CloseAllTabs

Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("HOME").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("HOME")_;_script infofile_;_ZIP::ssf12.xml_;_

