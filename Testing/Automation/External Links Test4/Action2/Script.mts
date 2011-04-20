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
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebEdit("modelDescriptor").Set "Min mice" @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebEdit("modelDescriptor")_;_script infofile_;_ZIP::ssf5.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebButton("Search").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebButton("Search")_;_script infofile_;_ZIP::ssf6.xml_;_
wait(3)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("Min mice").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("Min mice")_;_script infofile_;_ZIP::ssf7.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("MICROARRAYS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 6").Link("MICROARRAYS")_;_script infofile_;_ZIP::ssf8.xml_;_
wait(2)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_7").Link("Identification of large-scale").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 7").Link("Identification of large-scale")_;_script infofile_;_ZIP::ssf9.xml_;_
URL = Browser("caArray - Experiment Details").Page("caArray - Experiment Details").GetROProperty("url")

'Ensure caArray page opens
If  Browser("caArray - Experiment Details").Page("caArray - Experiment Details").Exist = True Then
	Reporter.ReportEvent micPass, "caArray", "caArray page opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(22)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "caArray", "caArray page did not opened."
	ExitAction("Test execution stopped by user")
End If
 @@ hightlight id_;_Browser("caArray - Experiment Details").Page("caArray - Experiment Details")_;_script infofile_;_ZIP::ssf10.xml_;_
Browser("caArray - Experiment Details").Page("caArray - Experiment Details").Sync
Browser("caArray - Experiment Details").CloseAllTabs
 @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 7").Link("HOME")_;_script infofile_;_ZIP::ssf11.xml_;_
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_7").Link("HOME").Click