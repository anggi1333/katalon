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

    WebUI.setText(findTestObject('referensi laporan/filter refrensi laporan'), 'xxx')

    WebUI.delay(5)

    WebUI.takeScreenshot(('D:\\poject\\goaml Sinarmas\\Screenshots Maker\\' + findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            2, rowNum)) + ' inValid.png')

    WebUI.delay(3)

    WebUI.setText(findTestObject('referensi laporan/filter refrensi laporan'), findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            2, rowNum))

    WebUI.delay(5)

    WebUI.takeScreenshot(('D:\\poject\\goaml Sinarmas\\Screenshots Maker\\' + findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            2, rowNum)) + ' Valid.png')

    WebUI.delay(5)

    WebUI.click(findTestObject('All/detail'))

    WebUI.delay(4)

    WebUI.takeScreenshot(('D:\\poject\\goaml Sinarmas\\Screenshots Maker\\' + findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            2, rowNum)) + ' Detail.png')

    WebUI.delay(4)

    WebUI.click(findTestObject('All/detail back'))

    WebUI.delay(4)

    WebUI.setText(findTestObject('referensi laporan/filter refrensi laporan'), findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            2, rowNum))

    WebUI.delay(6)

    WebUI.click(findTestObject('All/edit'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('referensi laporan/Ref Laporan/keterangan'), findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            3, rowNum))

    WebUI.delay(2)

    WebUI.takeScreenshot(('D:\\poject\\goaml Sinarmas\\Screenshots Checker\\' + findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            2, rowNum)) + ' Edit 1.png')

    WebUI.click(findTestObject('All/save'))

    WebUI.delay(2)

    WebUI.takeScreenshot(('D:\\poject\\goaml Sinarmas\\Screenshots Checker\\' + findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            2, rowNum)) + ' Edit 2.png')

    WebUI.delay(2)

    WebUI.click(findTestObject('All/confirm'))
}

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

