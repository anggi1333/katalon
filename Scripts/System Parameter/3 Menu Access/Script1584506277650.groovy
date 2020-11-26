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

WebUI.setText(findTestObject('All/filter'), 'Menu Access')

WebUI.delay(1)

WebUI.click(findTestObject('All/View'))

WebUI.delay(3)

WebUI.setText(findTestObject('System Parameter/Manu Access/1 Group Menu Name'), findTestData('System Parameter/Menu Access').getValue(
        1, 1))

WebUI.delay(1)

for (def rowNum = 1; rowNum <= findTestData('System Parameter/Menu Access').getRowNumbers(); rowNum++) {
    if (findTestData('System Parameter/Menu Access').getValue(2, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Manu Access/2 Edit'))
    }
    
    WebUI.setText(findTestObject('System Parameter/Manu Access/3 Sub Module'), findTestData('System Parameter/Menu Access').getValue(
            3, rowNum))

    WebUI.delay(3)

    if (findTestData('System Parameter/Menu Access').getValue(4, rowNum) == 'true') {
        WebUI.check(findTestObject('System Parameter/Manu Access/4 Add'))
    }
    
    if (findTestData('System Parameter/Menu Access').getValue(5, rowNum) == 'true') {
        WebUI.check(findTestObject('System Parameter/Manu Access/5 Edit'))
    }
    
    if (findTestData('System Parameter/Menu Access').getValue(6, rowNum) == 'true') {
        WebUI.check(findTestObject('System Parameter/Manu Access/6 Delete'))
    }
    
    if (findTestData('System Parameter/Menu Access').getValue(7, rowNum) == 'true') {
        WebUI.check(findTestObject('System Parameter/Manu Access/7 View'))
    }
    
    if (findTestData('System Parameter/Menu Access').getValue(8, rowNum) == 'true') {
        WebUI.check(findTestObject('System Parameter/Manu Access/8 Activation'))
    }
    
    if (findTestData('System Parameter/Menu Access').getValue(9, rowNum) == 'true') {
        WebUI.check(findTestObject('System Parameter/Manu Access/9 Approval'))
    }
    
    if (findTestData('System Parameter/Menu Access').getValue(10, rowNum) == 'true') {
        WebUI.check(findTestObject('System Parameter/Manu Access/10 Upload'))
    }
    
    if (findTestData('System Parameter/Menu Access').getValue(11, rowNum) == 'true') {
        WebUI.check(findTestObject('System Parameter/Manu Access/11 Detail'))
    }
}

