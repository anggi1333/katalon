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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable


WebUI.openBrowser('http://localhost/GoAml/Default.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/UserName'), 'sysadmin')

WebUI.setText(findTestObject('All/password'), 'superuser')

WebUI.click(findTestObject('All/Sign In'))

WebUI.setText(findTestObject('All/filter'), 'Group Management')

WebUI.delay(1)

WebUI.click(findTestObject('All/View'))

WebUI.delay(3)

WebUI.click(findTestObject('All/New Record'))

WebUI.setText(findTestObject('System Parameter/Group Management/1 Teks 1'), 'Test Group Menu Name')

WebUI.setText(findTestObject('System Parameter/Group Management/2 teks 2'), 'Test Group Menu Name Description')

WebUI.click(findTestObject('All/save'))

WebUI.click(findTestObject('All/confirm'))

WebUI.delay(1)

WebUI.setText(findTestObject('System Parameter/Group Management/Filter'), 'Test Group Menu Name')

WebUI.delay(1)

WebUI.click(findTestObject('All/Detail'))

WebUI.delay(1)

WebUI.setText(findTestObject('System Parameter/Group Management/1 Teks 1'), 'Test Group Menu Name Edit')

WebUI.setText(findTestObject('System Parameter/Group Management/2 teks 2'), 'Test Group Menu Name Description Edit')

WebUI.click(findTestObject('All/save'))

WebUI.click(findTestObject('All/confirm'))

WebUI.delay(1)

WebUI.setText(findTestObject('System Parameter/Group Management/Filter'), 'Test Group Menu Name')

WebUI.delay(1)

WebUI.click(findTestObject('All/edit'))

WebUI.click(findTestObject('All/delete 2'))

WebUI.click(findTestObject('All/confirm'))

