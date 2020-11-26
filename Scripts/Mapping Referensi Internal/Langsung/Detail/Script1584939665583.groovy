import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('http://ndsantasena.southeastasia.cloudapp.azure.com:8080/Default.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/UserName'), 'anggi1')

WebUI.setEncryptedText(findTestObject('All/password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('All/Sign In'))

WebUI.delay(3)

for (def rowNum = 1; rowNum <= findTestData('Mapping Referensi Internal/Filter Mapping Referensi Internal').getRowNumbers(); rowNum++) {
    WebUI.refresh()

    WebUI.setText(findTestObject('All/filter'), findTestData('Mapping Referensi Internal/Filter Mapping Referensi Internal').getValue(
            2, rowNum))

    WebUI.delay(1)

    WebUI.click(findTestObject('All/View'))

    WebUI.delay(1)

    WebUI.click(findTestObject('All/Detail'))

    WebUI.delay(5)

    WebUI.takeScreenshot(('D:\\poject\\goaml2\\Katalon\\Screenshots Maker\\' + findTestData('Mapping Referensi Internal/Filter Mapping Referensi Internal').getValue(
            2, rowNum)) + ' Detail.png')

    WebUI.refresh()
}

