import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\user\\AppData\\Local\\Temp\\Katalon\\Test Cases\\GoAML Report 1\\20200922_144519\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
import org.openqa.selenium.Keys as Keys

'Buka Browser\\r\\n'
not_run: WebUI.openBrowser('http://goaml.southeastasia.cloudapp.azure.com/goaml/Default.aspx')

'Maksimal Windows\\r\\n'
not_run: WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/UserName'), 'anggi1')

WebUI.setEncryptedText(findTestObject('All/password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('All/Sign In'))

WebUI.delay(3)

WebUI.setText(findTestObject('All/filter'), 'Report')

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('GoAmlReport/View'), 3)

WebUI.click(findTestObject('GoAmlReport/View'))

WebUI.delay(3)

WebUI.click(findTestObject('All/New Record'))

WebUI.callTestCase(findTestCase('GoAML Report 2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('GoAML Report 3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Identitas Orang Mewakili Transaksi'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('GoAML Report 4'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('GoAML Report 5'), [:], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/GoAML Report 1', new TestCaseBinding('Test Cases/GoAML Report 1',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
