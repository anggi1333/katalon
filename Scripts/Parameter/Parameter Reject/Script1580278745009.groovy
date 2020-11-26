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

WebUI.openBrowser('http://ndsantasena.southeastasia.cloudapp.azure.com:8080/Default.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/UserName'), 'anggi2')

WebUI.setText(findTestObject('All/password'), 'P@ssw0rd1')

WebUI.click(findTestObject('All/Sign In'))

WebUI.delay(3)

for (def rowNum = 1; rowNum <= findTestData('Parameter/Parameter').getRowNumbers(); rowNum++) {
    WebUI.refresh()

    WebUI.setText(findTestObject('All/filter'), findTestData('Parameter/Parameter').getValue(2, rowNum))

    WebUI.delay(2)

    WebUI.click(findTestObject('All/View'))

    WebUI.delay(3)

    WebUI.click(findTestObject('All/detail approval'))

    WebUI.delay(1)

    WebUI.click(findTestObject('All/reject'))

    WebUI.delay(1)

    WebUI.refresh(FailureHandling.STOP_ON_FAILURE)
}

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

