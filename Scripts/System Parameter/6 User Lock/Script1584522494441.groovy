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

CustomKeywords.'newpackage.Login.goLogin'()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/filter'), 'User Lock')

WebUI.delay(1)

WebUI.click(findTestObject('All/View'))

WebUI.delay(1)

for (def rowNum = 1; rowNum <= findTestData('System Parameter/User Lock').getRowNumbers(); rowNum++) {
    WebUI.setText(findTestObject('System Parameter/User Management/User Lock/0 Filter'), findTestData('System Parameter/User Lock').getValue(
            1, rowNum))

    WebUI.delay(1)

    WebUI.click(findTestObject('System Parameter/User Management/User Lock/1 Edit'))
	if (findTestData('System Parameter/User Lock').getValue(2, rowNum) == 'true') {
        WebUI.check(findTestObject('System Parameter/User Management/User Lock/2 InUse'))	
    }
	if (findTestData('System Parameter/User Lock').getValue(2, rowNum) == 'false'){ 
        WebUI.uncheck(findTestObject('System Parameter/User Management/User Lock/2 InUse'))
   }
    if (findTestData('System Parameter/User Lock').getValue(3, rowNum) == 'true') {
        WebUI.check(findTestObject('System Parameter/User Management/User Lock/3 LockUser'))
	}
	if (findTestData('System Parameter/User Lock').getValue(3, rowNum) == 'false') {
        WebUI.uncheck(findTestObject('System Parameter/User Management/User Lock/3 LockUser'))
    }
    
    WebUI.click(findTestObject('System Parameter/User Management/User Lock/4 Save'))

    WebUI.click(findTestObject('System Parameter/User Management/User Lock/5 Ok'))
}

