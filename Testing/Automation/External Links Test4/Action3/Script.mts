'Ensure caMOD home page exists
If  Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Exist = True Then
	Reporter.ReportEvent micPass, "caMOD Home", "caMOD home page exists."
	Else
	Reporter.ReportEvent micFail, "caMOD Home", "caMOD home page does not exist."
	ExitAction("Test execution stopped by user")
End If

'Naviagte to Simple Search and open a model which has link for Website for add. info on Model Characteristics page
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS")_;_script infofile_;_ZIP::ssf1.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").WebButton("Clear").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").WebButton("Clear")_;_script infofile_;_ZIP::ssf2.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebEdit("modelDescriptor").Set "SWXJ5/BmJ" @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebEdit("modelDescriptor")_;_script infofile_;_ZIP::ssf3.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebButton("Search").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebButton("Search")_;_script infofile_;_ZIP::ssf4.xml_;_
wait(3)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_4").Link("SWXJ5/BmJ").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 4").Link("SWXJ5/BmJ")_;_script infofile_;_ZIP::ssf5.xml_;_
wait(2)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("http://tumor.informatics.jax.o").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("http://tumor.informatics.jax.o")_;_script infofile_;_ZIP::ssf6.xml_;_
URL = Browser("Mouse Tumor Biology System").Page("Mouse Tumor Biology System").GetROProperty("url")

'Ensure MTB Database page opens
If  Browser("Mouse Tumor Biology System").Page("Mouse Tumor Biology System").Exist = True Then
	Reporter.ReportEvent micPass, "MTB", "MTB Database page opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(23)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "MTB", "MTB Database page did not opened."
	ExitAction("Test execution stopped by user")
End If

Browser("Mouse Tumor Biology System").Page("Mouse Tumor Biology System").Sync @@ hightlight id_;_Browser("Mouse Tumor Biology System").Page("Mouse Tumor Biology System")_;_script infofile_;_ZIP::ssf7.xml_;_
Browser("Mouse Tumor Biology System").CloseAllTabs

Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("HOME").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("HOME")_;_script infofile_;_ZIP::ssf8.xml_;_