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

'Buka Browser\r\n'
WebUI.openBrowser('http://ndsantasena.southeastasia.cloudapp.azure.com:8080/Default.aspx')

'Maksimal Windows\r\n'
WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/UserName'), 'anggi1')

WebUI.setEncryptedText(findTestObject('All/password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('All/Sign In'))

WebUI.delay(3)

WebUI.setText(findTestObject('All/filter'), 'WIC')

WebUI.delay(1)

WebUI.click(findTestObject('All/View'))

WebUI.delay(3)

for (def rowNum = 1; rowNum <= findTestData('Parameter/WIC Add').getRowNumbers(); rowNum++) {
    WebUI.click(findTestObject('All/New Record'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Parameter/WIC/Add/1 Gelar'),
		findTestData('Parameter/WIC Add').getValue(1, rowNum))
	
	WebUI.setText(findTestObject('Parameter/WIC/Add/2 Nama Lengkap'),
		findTestData('Parameter/WIC Add').getValue(1, rowNum))
	
	WebUI.setText(findTestObject('Parameter/WIC/Add/3 Tanggal Lahir'),
		findTestData('Parameter/WIC Add').getValue(1, rowNum))
	
	WebUI.setText(findTestObject('Parameter/WIC/Add/4 Tempat Lahir'),
		findTestData('Parameter/WIC Add').getValue(1, rowNum))
	
	WebUI.setText(findTestObject('Parameter/WIC/Add/5 Nama Ibu Kandung'),
		findTestData('Parameter/WIC Add').getValue(1, rowNum))
	
	WebUI.setText(findTestObject('Parameter/WIC/Add/6 Nama Alias'),
		findTestData('Parameter/WIC Add').getValue(1, rowNum))
	
	WebUI.setText(findTestObject('Parameter/WIC/Add/7 NIK'),
		findTestData('Parameter/WIC Add').getValue(1, rowNum))
	
	WebUI.setText(findTestObject('Parameter/WIC/Add/8 No Passport'),
		findTestData('Parameter/WIC Add').getValue(1, rowNum))
	
	WebUI.setText(findTestObject('Parameter/WIC/Add/9 Negara Penerbit Passport'),
		findTestData('Parameter/WIC Add').getValue(1, rowNum))
	
	WebUI.setText(findTestObject('Parameter/WIC/Add/_10 No Identitas Lain'),
		findTestData('Parameter/WIC Add').getValue(1, rowNum))
	
	WebUI.setText(findTestObject('Parameter/WIC/Add/_10 No Identitas Lain'),
		findTestData('Parameter/WIC Add').getValue(1, rowNum))
	
	WebUI.setText(findTestObject('Parameter/WIC/Add/_11 Kwarga 1'),
		findTestData('Parameter/WIC Add').getValue(1, rowNum))

	WebUI.setText(findTestObject('Parameter/WIC/Add/_10 No Identitas Lain'),
		findTestData('Parameter/WIC Add').getValue(1, rowNum))

}

