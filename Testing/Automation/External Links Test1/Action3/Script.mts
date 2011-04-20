

'Import external spread sheet
'dataFile1 = "\\nci6116g.nci.nih.gov\group\NCICB\QA\MadhaviK\Automation\caMOD\TestData\ExternalLinksData.xls"
dataFile1 = "C:\Madhavi Automation\caMOD\Test Data\ExternalLinksData.xls"

DataTable.Import dataFile1

colName1 = "TestResult_" & Now
ColName2 = "ActualLink_" & Now


'Add 2 new columns for current test results
DataTable.GetSheet(dtGlobalSheet).AddParameter colName1, ""
DataTable.GetSheet(dtGlobalSheet).AddParameter colName2, ""














