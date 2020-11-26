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

'Buka Browser\r\n'
WebUI.openBrowser('http://ndsantasena.southeastasia.cloudapp.azure.com:8080/Default.aspx')

'Maksimal Windows\r\n'
WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/UserName'), 'anggi1')

WebUI.setEncryptedText(findTestObject('All/password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('All/Sign In'))

WebUI.delay(3)

WebUI.setText(findTestObject('All/filter'), 'Exchange Rate')

WebUI.delay(1)

WebUI.click(findTestObject('All/View'))

WebUI.delay(3)

for (def rowNum = 1; rowNum <= findTestData('Parameter/Exchange Rate add').getRowNumbers(); rowNum++) {
    WebUI.click(findTestObject('All/New Record'))

    WebUI.setText(findTestObject('Parameter/Text 1 Exchange Rate'), findTestData('Parameter/Exchange Rate add').getValue(
            1, rowNum))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Parameter/Text 1 Exchange Rate'), Keys.chord(Keys.ENTER))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Parameter/Text 2 Exchange Rate'), findTestData('Parameter/Exchange Rate add').getValue(
            2, rowNum))

    WebUI.setText(findTestObject('Parameter/Text 3 Exchange Rate'), findTestData('Parameter/Exchange Rate add').getValue(
            3, rowNum))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Parameter/Text 3 Exchange Rate'), Keys.chord(Keys.ENTER))

    WebUI.delay(2)

    WebUI.click(findTestObject('All/save'))

    WebUI.delay(1)

    WebUI.click(findTestObject('All/confirm'))

    Thread.sleep(3000)
}

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

