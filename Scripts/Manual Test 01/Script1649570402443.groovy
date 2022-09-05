import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.keyword.excel.ExcelKeywords

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, "Search Pegawai")
String employeeName = ExcelKeywords.getCellValueByAddress(sheet, "A2")
String id = ExcelKeywords.getCellValueByAddress(sheet, "B2")
String employeementStatus = ExcelKeywords.getCellValueByAddress(sheet, "C2")

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Manual Mode/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'admin')

WebUI.setText(findTestObject('Manual Mode/Page_OrangeHRM/input_Username_txtPassword'), 'admin123')

WebUI.click(findTestObject('Manual Mode/Page_OrangeHRM/input_Password_Submit'))

WebUI.verifyTextPresent('Welcome Saurabh', false, FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Manual Mode/Page_OrangeHRM/b_PIM'))

WebUI.click(findTestObject('Manual Mode/Page_OrangeHRM/Page_OrangeHRM/a_Employee List'))

//WebUI.setText(findTestObject('Object Repository/Manual Mode/Page_OrangeHRM/input_Employee Name_empsearchemployee_nameempName'), employeeName)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Manual Mode/Page_OrangeHRM/employeementStatusObject'), employeementStatus)
WebUI.click(findTestObject('Object Repository/Manual Mode/Page_OrangeHRM/input_Sub Unit__search'))

WebUI.delay(5)
WebUI.closeBrowser()