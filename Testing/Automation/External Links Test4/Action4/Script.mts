'Ensure caMOD home page exists
If  Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Exist = True Then
	Reporter.ReportEvent micPass, "caMOD Home", "caMOD home page exists."
	Else
	Reporter.ReportEvent micFail, "caMOD Home", "caMOD home page does not exist."
	ExitAction("Test execution stopped by user")
End If

'Naviagte to Simple Search and open a model which has link for NSC Number and CAS Number on Carcinogenic Intervention page
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS")_;_script infofile_;_ZIP::ssf1.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").WebButton("Clear").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").WebButton("Clear")_;_script infofile_;_ZIP::ssf2.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebEdit("modelDescriptor").Set "p19(Arf) null" @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebEdit("modelDescriptor")_;_script infofile_;_ZIP::ssf3.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebButton("Search").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebButton("Search")_;_script infofile_;_ZIP::ssf4.xml_;_
wait(2)
 @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 4").Link("BALB/c p53 null transplant-pit")_;_script infofile_;_ZIP::ssf5.xml_;_
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_4").Link("p19(Arf) null").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 4").Link("p19(Arf) null")_;_script infofile_;_ZIP::ssf7.xml_;_
wait(2)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("CARCINOGENIC INTERVENTIONS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 6").Link("CARCINOGENIC INTERVENTIONS")_;_script infofile_;_ZIP::ssf8.xml_;_

'Click on NSC number
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_7").Link("408823").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 7").Link("57-97-6")_;_script infofile_;_ZIP::ssf9.xml_;_
URL = Browser("Basic Chemical Data").Page("Basic Chemical Data").GetROProperty("url")

'Ensure Basic Chemical Data page opens
If  Browser("Basic Chemical Data").Page("Basic Chemical Data").Exist = True Then
	Reporter.ReportEvent micPass, "NSC Number", "Basic Chemical Data page opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(24)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "NSC Number", "Basic Chemical Data page did not opened."
	ExitAction("Test execution stopped by user")
End If

Browser("Basic Chemical Data").Page("Basic Chemical Data").Sync @@ hightlight id_;_Browser("Basic Chemical Data").Page("Basic Chemical Data")_;_script infofile_;_ZIP::ssf11.xml_;_
Browser("Basic Chemical Data").CloseAllTabs

'Click on CAS number
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_7").Link("57-97-6").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 7").Link("57-97-6")_;_script infofile_;_ZIP::ssf9.xml_;_
URL = Browser("Basic Chemical Data").Page("Basic Chemical Data").GetROProperty("url")
'Browser("Basic Chemical Data").Dialog("Internet Explorer").WinButton("OK").Click @@ hightlight id_;_198024_;_script infofile_;_ZIP::ssf10.xml_;_

'Ensure Basic Chemical Data page opens
If  Browser("Basic Chemical Data").Page("Basic Chemical Data").Exist = True Then
	Reporter.ReportEvent micPass, "CAS Number", "Basic Chemical Data page opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(25)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "CAS Number", "Basic Chemical Data page did not opened."
	ExitAction("Test execution stopped by user")
End If

Browser("Basic Chemical Data").Page("Basic Chemical Data").Sync @@ hightlight id_;_Browser("Basic Chemical Data").Page("Basic Chemical Data")_;_script infofile_;_ZIP::ssf11.xml_;_
Browser("Basic Chemical Data").CloseAllTabs

Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_7").Link("HOME").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 7").Link("HOME")_;_script infofile_;_ZIP::ssf12.xml_;_
