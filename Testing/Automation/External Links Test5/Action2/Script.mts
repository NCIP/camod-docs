'Ensure caMOD home page exists
If  Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Exist = True Then
	Reporter.ReportEvent micPass, "caMOD Home", "caMOD home page exists."
	Else
	Reporter.ReportEvent micFail, "caMOD Home", "caMOD home page does not exist."
	ExitAction("Test execution stopped by user")
End If

'Naviagte to Simple Search and open a model which has ZFIN Identifier
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models").Link("SEARCH MODELS")_;_script infofile_;_ZIP::ssf1.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_2").WebButton("Clear").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 2").WebButton("Clear")_;_script infofile_;_ZIP::ssf2.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebEdit("modelDescriptor").Set "XEF1-TEL-AML1 " @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebEdit("modelDescriptor")_;_script infofile_;_ZIP::ssf3.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_3").WebButton("Search").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 3").WebButton("Search")_;_script infofile_;_ZIP::ssf4.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_4").Link("XEF1-TEL-AML1").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 4").Link("XEF1-TEL-AML1")_;_script infofile_;_ZIP::ssf5.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_5").Link("GENETIC DESCRIPTION").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 5").Link("GENETIC DESCRIPTION")_;_script infofile_;_ZIP::ssf6.xml_;_
wait(1)
Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("ZDB-GENO-070524-1").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 6").Link("ZDB-GENO-070524-1")_;_script infofile_;_ZIP::ssf7.xml_;_
wait(1)
URL = Browser("Genotype: Tg(XlEef1a1:ETV6-RUN").Page("Genotype: Tg(XlEef1a1:ETV6-RUN").GetROProperty("url")

'Ensure ZFIN Genotype page opens
If  Browser("Genotype: Tg(XlEef1a1:ETV6-RUN").Page("Genotype: Tg(XlEef1a1:ETV6-RUN").Exist = True Then
	Reporter.ReportEvent micPass, "ZFIN", "ZFIN Genotype page opened."

	DataTable.GetSheet(dtGlobalSheet).SetCurrentRow(31)
	DataTable(6, dtGlobalSheet) = "Pass"
	DataTable(7, dtGlobalSheet) = URL

	Else
	Reporter.ReportEvent micFail, "ZFIN", "ZFIN Genotype page did not opened."
	ExitAction("Test execution stopped by user")
End If

Browser("Genotype: Tg(XlEef1a1:ETV6-RUN").Page("Genotype: Tg(XlEef1a1:ETV6-RUN").Sync @@ hightlight id_;_Browser("Genotype: Tg(XlEef1a1:ETV6-RUN").Page("Genotype: Tg(XlEef1a1:ETV6-RUN")_;_script infofile_;_ZIP::ssf8.xml_;_
Browser("Genotype: Tg(XlEef1a1:ETV6-RUN").CloseAllTabs

Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models_6").Link("HOME").Click @@ hightlight id_;_Browser("caMOD - Cancer Models").Page("caMOD - Cancer Models 6").Link("HOME")_;_script infofile_;_ZIP::ssf9.xml_;_
