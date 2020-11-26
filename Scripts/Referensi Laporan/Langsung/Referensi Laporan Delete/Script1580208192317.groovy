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

WebUI.openBrowser('http://10.1.94.157/goAML/Default.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/UserName'), 'anggi1')

WebUI.setText(findTestObject('All/password'), 'P@ssw0rd')

WebUI.click(findTestObject('All/Sign In'))

WebUI.delay(3)

for (def rowNum = 1; rowNum <= findTestData('Referensi Laporan Data Files/referensi laporan').getRowNumbers(); rowNum++) {
    WebUI.refresh()

    WebUI.setText(findTestObject('All/filter'), findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            2, rowNum))

    WebUI.delay(2)

    WebUI.click(findTestObject('referensi laporan/view'))

    WebUI.delay(3)

    WebUI.setText(findTestObject('referensi laporan/filter refrensi laporan'), findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            2, rowNum))

    WebUI.delay(2)

    //WebUI.switchToFrame(findTestObject('All/Iframe'), 3)
    WebUI.click(findTestObject('All/delete'))

    WebUI.delay(2)

    WebUI.takeScreenshot(('D:\\poject\\goaml Sinarmas\\Screenshots Maker\\' + findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
          2, rowNum)) +' Delete 1.png')
    WebUI.delay(2)

    WebUI.click(findTestObject('All/delete 2'))

    WebUI.delay(2)

    WebUI.takeScreenshot(('D:\\poject\\goaml Sinarmas\\Screenshots Maker\\' + findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
          2, rowNum)) +' Delete 2.png')
    WebUI.delay(2)

      WebUI.delay(2)

    WebUI.click(findTestObject('All/confirm'))
}

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

