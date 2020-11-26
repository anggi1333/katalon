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

WebUI.openBrowser('http://localhost/GoAml/Default.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/UserName'), 'adminmaker')

WebUI.setText(findTestObject('All/password'), 'N@wadata99$$1')

WebUI.click(findTestObject('All/Sign In'))

WebUI.delay(3)

for (def rowNum = 1; rowNum <= findTestData('Referensi Laporan Upload').getRowNumbers(); rowNum++) {
    WebUI.refresh()

    WebUI.setText(findTestObject('All/filter'), findTestData('Referensi Laporan Upload').getValue(2, rowNum))

    WebUI.delay(2)

    WebUI.click(findTestObject('All/view 2'))

    WebUI.delay(3)

    //WebUI.switchToFrame(findTestObject('All/Iframe'), 3)
    WebUI.uploadFile(findTestObject('All/upload'), 'D:\\poject\\goaml2\\Katalon\\Excel File\\Referensi Laporan\\Upload\\Upload.xlsx')

    WebUI.delay(2)

    WebUI.click(findTestObject('All/save'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('All/import mode'), 'update')

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('All/import mode'), Keys.chord(Keys.ENTER))

    WebUI.delay(2)

    WebUI.click(findTestObject('All/save'))

    WebUI.delay(2)

    WebUI.click(findTestObject('All/save upload'))

    WebUI.delay(2)

    WebUI.click(findTestObject('All/confirm'))
}

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

