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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://goaml.southeastasia.cloudapp.azure.com/goAML-Sinarmas/Login.aspx')

WebUI.setText(findTestObject('Object Repository/New Folder1/Page_Log in/input_User ID is required_txtUsername'), 'sysadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder1/Page_Log in/input_User ID is required_txtPassword'), 
    'h1bZaoNZrXJGImBBMGIoZQ==')

WebUI.sendKeys(findTestObject('Object Repository/New Folder1/Page_Log in/input_User ID is required_txtPassword'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/New Folder1/Page_/input_Filter_TriggerField1'), 'ok')

