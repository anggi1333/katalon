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

'Buka Browser\r\n'
WebUI.openBrowser('http://ndsantasena.southeastasia.cloudapp.azure.com:8080/Default.aspx')

'Maksimal Windows\r\n'
WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/UserName'), 'anggi1')

WebUI.setEncryptedText(findTestObject('All/password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('All/Sign In'))

WebUI.delay(3)

WebUI.setText(findTestObject('All/filter'), 'Reporting Person')

WebUI.delay(1)

WebUI.click(findTestObject('All/View'))

WebUI.delay(2)

for (def rowNum = 1; rowNum <= findTestData('Parameter/Reporting Person').getRowNumbers(); rowNum++) {
    WebUI.click(findTestObject('Parameter/Reporting Person/Add'))

    WebUI.setText(findTestObject('Parameter/Reporting Person/1/1 KodeLaporan'), findTestData('Parameter/Reporting Person').getValue(
            1, rowNum))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('Parameter/Reporting Person/1/1 KodeLaporan'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Parameter/Reporting Person/1/2 Full Name'), findTestData('Parameter/Reporting Person').getValue(
            2, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/1/3 BirthDate'), findTestData('Parameter/Reporting Person').getValue(
            3, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/1/4 BirthPlace'), findTestData('Parameter/Reporting Person').getValue(
            4, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/1/5 Gender'), findTestData('Parameter/Reporting Person').getValue(
            5, rowNum))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('Parameter/Reporting Person/1/5 Gender'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Parameter/Reporting Person/1/6 MotherName'), findTestData('Parameter/Reporting Person').getValue(
            6, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/1/7 Alias'), findTestData('Parameter/Reporting Person').getValue(
            7, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/1/8 NIK'), findTestData('Parameter/Reporting Person').getValue(
            8, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/1/9 Passport'), findTestData('Parameter/Reporting Person').getValue(
            9, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/1/_10 Negara Penerbit Passport'), findTestData('Parameter/Reporting Person').getValue(
            10, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/1/_11 OtherID'), findTestData('Parameter/Reporting Person').getValue(
            11, rowNum))

    WebUI.click(findTestObject('Parameter/Reporting Person/2/00 New Identity'))

    WebUI.setText(findTestObject('Parameter/Reporting Person/2/1 Modal_Type'), findTestData('Parameter/Reporting Person').getValue(
            12, rowNum))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('Parameter/Reporting Person/2/1 Modal_Type'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Parameter/Reporting Person/2/2 Modal_Number'), findTestData('Parameter/Reporting Person').getValue(
            13, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/2/3 Modal_IssueDate'), findTestData('Parameter/Reporting Person').getValue(
            14, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/2/4 Modal_ExpiryDate'), findTestData('Parameter/Reporting Person').getValue(
            15, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/2/5 Modal_IssuedBy'), findTestData('Parameter/Reporting Person').getValue(
            16, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/2/6 Modal_Country'), findTestData('Parameter/Reporting Person').getValue(
            17, rowNum))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('Parameter/Reporting Person/2/6 Modal_Country'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Parameter/Reporting Person/2/7 Modal_Comments'), findTestData('Parameter/Reporting Person').getValue(
            18, rowNum))

    WebUI.click(findTestObject('Parameter/Reporting Person/2/8 Save'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Parameter/Reporting Person/3/00 New Phone'))

    WebUI.setText(findTestObject('Parameter/Reporting Person/3/1 PhoneModal_Type'), findTestData('Parameter/Reporting Person').getValue(
            19, rowNum))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('Parameter/Reporting Person/3/1 PhoneModal_Type'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Parameter/Reporting Person/3/2 PhoneModal_Tool'), findTestData('Parameter/Reporting Person').getValue(
            20, rowNum))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('Parameter/Reporting Person/3/2 PhoneModal_Tool'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Parameter/Reporting Person/3/3 RegionCode'), findTestData('Parameter/Reporting Person').getValue(
            21, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/3/4 Number'), findTestData('Parameter/Reporting Person').getValue(
            22, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/3/5 NumberEx'), findTestData('Parameter/Reporting Person').getValue(
            23, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/3/6 PhoneModal_Comment'), findTestData('Parameter/Reporting Person').getValue(
            24, rowNum))

    WebUI.click(findTestObject('Parameter/Reporting Person/3/7 Save'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Parameter/Reporting Person/4/00 New Address'))

    WebUI.setText(findTestObject('Parameter/Reporting Person/4/1 Type'), findTestData('Parameter/Reporting Person').getValue(
            25, rowNum))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('Parameter/Reporting Person/4/1 Type'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Parameter/Reporting Person/4/2 Address'), findTestData('Parameter/Reporting Person').getValue(
            26, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/4/3 Town'), findTestData('Parameter/Reporting Person').getValue(
            27, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/4/4 City'), findTestData('Parameter/Reporting Person').getValue(
            28, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/4/5 PostalCode'), findTestData('Parameter/Reporting Person').getValue(
            29, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/4/6 Country'), findTestData('Parameter/Reporting Person').getValue(
            30, rowNum))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('Parameter/Reporting Person/4/6 Country'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Parameter/Reporting Person/4/6 Province'), findTestData('Parameter/Reporting Person').getValue(
            31, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/4/7 Catatan'), findTestData('Parameter/Reporting Person').getValue(
            32, rowNum))

    WebUI.click(findTestObject('Parameter/Reporting Person/4/Save'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Parameter/Reporting Person/5/1 Nationality1'), findTestData('Parameter/Reporting Person').getValue(
            33, rowNum))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('Parameter/Reporting Person/5/1 Nationality1'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Parameter/Reporting Person/5/2 Nationality2'), findTestData('Parameter/Reporting Person').getValue(
            34, rowNum))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('Parameter/Reporting Person/5/2 Nationality2'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Parameter/Reporting Person/5/3 Nationality3'), findTestData('Parameter/Reporting Person').getValue(
            35, rowNum))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('Parameter/Reporting Person/5/3 Nationality3'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Parameter/Reporting Person/5/4 Residence'), findTestData('Parameter/Reporting Person').getValue(
            36, rowNum))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('Parameter/Reporting Person/5/4 Residence'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Parameter/Reporting Person/5/5 Email1'), findTestData('Parameter/Reporting Person').getValue(
            37, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/5/6 Email2'), findTestData('Parameter/Reporting Person').getValue(
            38, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/5/7 Email3'), findTestData('Parameter/Reporting Person').getValue(
            39, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/5/8 Email4'), findTestData('Parameter/Reporting Person').getValue(
            40, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/5/9 Email5'), findTestData('Parameter/Reporting Person').getValue(
            41, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/5/_10 Job'), findTestData('Parameter/Reporting Person').getValue(
            42, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/5/_11 JobPlace'), findTestData('Parameter/Reporting Person').getValue(
            43, rowNum))

    if (findTestData('Parameter/Reporting Person').getValue(44, rowNum) == 'true') {
        WebUI.click(findTestObject('Parameter/Reporting Person/5/_12 Meninggal'))
        WebUI.setText(findTestObject('Parameter/Reporting Person/5/_13 Tanggal Meninggal'), findTestData('Parameter/Reporting Person').getValue(
                45, rowNum))
    }
    
    WebUI.setText(findTestObject('Parameter/Reporting Person/5/_14 TaxNumber'), findTestData('Parameter/Reporting Person').getValue(
            46, rowNum))

    WebUI.setText(findTestObject('Parameter/Reporting Person/5/_15 Comments'), findTestData('Parameter/Reporting Person').getValue(
            47, rowNum))

    if (findTestData('Parameter/Reporting Person').getValue(49, rowNum) == 'true') {
        WebUI.click(findTestObject('Parameter/Reporting Person/5/PEPS'))
    }
    
    WebUI.setText(findTestObject('Parameter/Reporting Person/5/Sumber Dana'), findTestData('Parameter/Reporting Person').getValue(
            48, rowNum))
}

