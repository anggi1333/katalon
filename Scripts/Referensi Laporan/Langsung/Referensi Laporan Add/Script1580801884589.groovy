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

WebUI.openBrowser('http://10.1.94.157/goAML/Login.aspx?ReturnUrl=%2fgoAML%2fDefault.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/UserName'), 'anggi1')

WebUI.setText(findTestObject('All/password'), 'P@ssw0rd')

WebUI.delay(1)


WebUI.click(findTestObject('All/Sign In'))

WebUI.delay(1)

for (def rowNum = 1; rowNum <= findTestData('Referensi Laporan Data Files/referensi laporan').getRowNumbers(); rowNum++) {
    WebUI.refresh()

    WebUI.setText(findTestObject('All/filter'), findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            2, rowNum))

    WebUI.delay(1)

    WebUI.click(findTestObject('referensi laporan/view'))

    WebUI.delay(3)

    WebUI.takeScreenshot(('D:\\poject\\GoAML BTPN\\Screenshots Maker\\' + findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            2, rowNum)) + ' View.png')

    WebUI.click(findTestObject('All/New Record'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('referensi laporan/Ref Laporan/Text 1'), findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            1, rowNum))

    WebUI.setText(findTestObject('referensi laporan/Ref Laporan/Text 2'), findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            2, rowNum))

    WebUI.delay(3)

    WebUI.takeScreenshot(('D:\\poject\\GoAML BTPN\\Screenshots Maker\\' + findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            2, rowNum)) + ' Add New Record 1.png')

    WebUI.click(findTestObject('All/save'))

    WebUI.delay(3)

    WebUI.takeScreenshot(('D:\\poject\\GoAML BTPN\\Screenshots Maker\\' + findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            2, rowNum)) + ' Add New Record 2.png')

    WebUI.delay(1)

    WebUI.click(findTestObject('All/confirm'))
}

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

