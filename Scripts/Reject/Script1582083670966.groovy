import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

'Buka Browser\r\n'
WebUI.openBrowser('http://ndsantasena.southeastasia.cloudapp.azure.com:8080/Default.aspx')

'Maksimal Windows\r\n'
WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/UserName'), 'anggi2')

WebUI.setEncryptedText(findTestObject('All/password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('All/Sign In'))

WebUI.delay(2)

KeywordLogger log = new KeywordLogger()

WebUI.delay(2)

for (def rowNum = 1; rowNum <= findTestData('Referensi Laporan Data Files/referensi laporan').getRowNumbers(); rowNum++) {
    WebUI.refresh()

    WebUI.setText(findTestObject('All/filter'), findTestData('Referensi Laporan Data Files/referensi laporan').getValue(
            2, rowNum))

    WebUI.delay(2)

    WebUI.click(findTestObject('All/View'))

    //WebUI.click(findTestObject('All/View'))
    //FLIX
    try {
        while (true) {
            WebUI.delay(1)

            WebUI.click(findTestObject('All/detail approval'))

            WebUI.delay(1)

            WebUI.click(findTestObject('All/reject'))

            WebUI.delay(1)

            WebUI.click(findTestObject('All/confirm'))

            WebUI.delay(2 // WebUI.click(findTestObject('All/View'))
                ) //   WebUI.click(findTestObject('All/View'))
        }
    }
    catch (StepFailedException e) {
        //	WebUI.closeBrowser()
    } 
}

WebUI.closeBrowser()

WebUI.focus(findTestObject(null))

