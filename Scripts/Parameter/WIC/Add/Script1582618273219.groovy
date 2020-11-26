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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

'Buka Browser\r\n'
WebUI.openBrowser('http://ndsantasena.southeastasia.cloudapp.azure.com:8080/Default.aspx')

'Maksimal Windows\r\n'
WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/UserName'), 'anggi1')

WebUI.setEncryptedText(findTestObject('All/password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('All/Sign In'))

for (def rowNum = 1; rowNum <= findTestData('Parameter/WIC Add').getRowNumbers(); rowNum++) {
    WebUI.refresh()

    WebUI.delay(3)

    WebUI.setText(findTestObject('All/filter'), 'WIC')

    WebUI.delay(1)

    WebUI.click(findTestObject('All/View'))

    WebUI.delay(3)

    WebUI.click(findTestObject('All/New Record'))

    WebUI.delay(3)

    if (findTestData('Parameter/WIC Add').getValue(32, rowNum) == 'Individu') {
        WebUI.setText(findTestObject('Parameter/WIC/Add/1 Gelar'), findTestData('Parameter/WIC Add').getValue(1, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/2 Nama Lengkap'), findTestData('Parameter/WIC Add').getValue(2, 
                rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/3 Tanggal Lahir'), findTestData('Parameter/WIC Add').getValue(3, 
                rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/4 Tempat Lahir'), findTestData('Parameter/WIC Add').getValue(4, 
                rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/5 Nama Ibu Kandung'), findTestData('Parameter/WIC Add').getValue(
                5, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/6 Nama Alias'), findTestData('Parameter/WIC Add').getValue(6, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/7 NIK'), findTestData('Parameter/WIC Add').getValue(7, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/8 No Passport'), findTestData('Parameter/WIC Add').getValue(8, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/9 Negara Penerbit Passport'), findTestData('Parameter/WIC Add').getValue(
                9, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_10 No Identitas Lain'), findTestData('Parameter/WIC Add').getValue(
                10, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_11 Kwarga 1'), findTestData('Parameter/WIC Add').getValue(11, rowNum))

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('Parameter/WIC/Add/_11 Kwarga 1'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_12 Kwarga 2'), findTestData('Parameter/WIC Add').getValue(12, rowNum))

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('Parameter/WIC/Add/_12 Kwarga 2'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_13 Kwarga 3'), findTestData('Parameter/WIC Add').getValue(13, rowNum))

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('Parameter/WIC/Add/_13 Kwarga 3'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('Parameter/WIC/Add/Negara Domisili'), findTestData('Parameter/WIC Add').getValue(14, 
                rowNum))

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('Parameter/WIC/Add/Negara Domisili'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_14 Email'), findTestData('Parameter/WIC Add').getValue(15, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_15 Pekerjaan'), findTestData('Parameter/WIC Add').getValue(16, 
                rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_16 Tempat Bekerja'), findTestData('Parameter/WIC Add').getValue(
                17, rowNum))

        WebUI.click(findTestObject('Parameter/WIC/Button/New Detail 1'))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_17 Kategori Kontak'), findTestData('Parameter/WIC Add').getValue(
                18, rowNum))

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('Parameter/WIC/Add/_17 Kategori Kontak'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_18 J Alat Kom'), findTestData('Parameter/WIC Add').getValue(19, 
                rowNum))

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('Parameter/WIC/Add/_18 J Alat Kom'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_19 Kode Area Tlp'), findTestData('Parameter/WIC Add').getValue(
                20, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_20 No Tlp'), findTestData('Parameter/WIC Add').getValue(21, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_21 No Extensi'), findTestData('Parameter/WIC Add').getValue(22, 
                rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_22 Catatan'), findTestData('Parameter/WIC Add').getValue(23, rowNum))

        WebUI.click(findTestObject('Parameter/WIC/Button/Save'))

        WebUI.click(findTestObject('Parameter/WIC/Button/New Detail 2'))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_23 Type Alamat'), findTestData('Parameter/WIC Add').getValue(24, 
                rowNum))

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('Parameter/WIC/Add/_23 Type Alamat'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_24 Alamat'), findTestData('Parameter/WIC Add').getValue(25, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_25 Kecamatan'), findTestData('Parameter/WIC Add').getValue(26, 
                rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_26 Kota'), findTestData('Parameter/WIC Add').getValue(27, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_27 Kode Pos'), findTestData('Parameter/WIC Add').getValue(28, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_28 Negara'), findTestData('Parameter/WIC Add').getValue(29, rowNum))

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('Parameter/WIC/Add/_28 Negara'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_29 Provinsi'), findTestData('Parameter/WIC Add').getValue(30, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Add/_30 catatan'), findTestData('Parameter/WIC Add').getValue(31, rowNum))

        WebUI.click(findTestObject('Parameter/WIC/Button/save 2'))
    } else if (findTestData('Parameter/WIC Add').getValue(32, rowNum) == 'Corporate') {
        WebUI.setText(findTestObject('Parameter/WIC/Button/Corp'), 'Corporate')

        WebUI.setText(findTestObject('Parameter/WIC/Corporate/1/1 Nama Korporasi'), findTestData('Parameter/WIC Add').getValue(
                33, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Corporate/1/2 Nama Komersial'), findTestData('Parameter/WIC Add').getValue(
                34, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Corporate/1/3 Bentuk Korporasi'), findTestData('Parameter/WIC Add').getValue(
                35, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Corporate/1/4 No Induk Berusaha'), findTestData('Parameter/WIC Add').getValue(
                36, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Corporate/1/5 Bidang Usaha'), findTestData('Parameter/WIC Add').getValue(
                33, rowNum))

        WebUI.setText(findTestObject('Parameter/WIC/Corporate/1/5 Bidang Usaha'), findTestData('Parameter/WIC Add').getValue(
                34, rowNum))
    }
}

WebUI.closeBrowser()

