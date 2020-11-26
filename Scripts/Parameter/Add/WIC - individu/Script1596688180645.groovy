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

WebUI.openBrowser('http://goaml.southeastasia.cloudapp.azure.com/goaml/Login.aspx?ReturnUrl=%2fgoaml%2fDefault.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/UserName'), 'anggi1')

WebUI.setEncryptedText(findTestObject('All/password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('All/Sign In'))

WebUI.delay(3)

WebUI.setText(findTestObject('All/filter'), 'WIC')

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('WIC/View'), 3)

WebUI.click(findTestObject('WIC/View'))

WebUI.delay(3)

WebUI.click(findTestObject('All/New Record'))

WebUI.setText(findTestObject('WIC/Individu/01/01 WIC No'), '12133746')

WebUI.setText(findTestObject('WIC/Individu/01/03 Gelar'), 'Mr')

WebUI.setText(findTestObject('WIC/Individu/01/04 Nama Lengkap'), 'Nggih')

WebUI.setText(findTestObject('WIC/Individu/01/05 Tanggal Lahir'), '8/11/1994')

WebUI.setText(findTestObject('WIC/Individu/01/06 Tempat Lahir'), 'Jakarta')

WebUI.setText(findTestObject('WIC/Individu/01/07 Nama Ibu Kandung'), 'Anya')

WebUI.setText(findTestObject('WIC/Individu/01/08 Nama Alias'), 'Ng')

WebUI.setText(findTestObject('WIC/Individu/01/09 NIK'), '3212321232123212')

WebUI.setText(findTestObject('WIC/Individu/01/10 No Passport'), '32123212')

WebUI.setText(findTestObject('WIC/Individu/01/11 Negara Penerbit Passport'), 'Indonesia')

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('WIC/Individu/01/11 Negara Penerbit Passport'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('WIC/Individu/01/12 No Identitas Lain'), '44431')

WebUI.setText(findTestObject('WIC/Individu/01/13 Kewarganegaraan 1'), 'Indon')

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('WIC/Individu/01/13 Kewarganegaraan 1'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('WIC/Individu/01/14 Kewarganegaraan 2'), 'Indon')

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('WIC/Individu/01/14 Kewarganegaraan 2'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('WIC/Individu/01/15 Kewarganegaraan 3'), 'Indon')

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('WIC/Individu/01/15 Kewarganegaraan 3'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('WIC/Individu/01/16 Negara Domisili'), 'indon')

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('WIC/Individu/01/16 Negara Domisili'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('WIC/Individu/01/02 Jenis Kelamin'), 'Female')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('WIC/Individu/01/02 Jenis Kelamin'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('WIC/Individu/02/01 New Phone Detail'))

WebUI.delay(2)

WebUI.setText(findTestObject('WIC/Individu/02/02 Kategori Kontak'), 'Kantor')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('WIC/Individu/02/02 Kategori Kontak'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('WIC/Individu/02/03 Jenis Alat Komunikasi'), 'fax ')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('WIC/Individu/02/03 Jenis Alat Komunikasi'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('WIC/Individu/02/04 Kode Area Telepon'), '021')

WebUI.setText(findTestObject('WIC/Individu/02/05 No Telepon'), '0214234124')

WebUI.setText(findTestObject('WIC/Individu/02/06 No Extensi'), '33333333')

WebUI.setText(findTestObject('WIC/Individu/02/07 Catatan'), 'no note')

WebUI.click(findTestObject('WIC/Individu/02/08 Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('WIC/Individu/03/01 New Address'), 2)

WebUI.click(findTestObject('WIC/Individu/03/01 New Address'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('WIC/Individu/03/02 Tipe Alamat'), 'Kantor')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('WIC/Individu/03/02 Tipe Alamat'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('WIC/Individu/03/03 Alamat'), 'Jl Jakarta')

WebUI.setText(findTestObject('WIC/Individu/03/04 Kecamatan'), 'Kalideres')

WebUI.setText(findTestObject('WIC/Individu/03/05 Kota'), 'Jakarta')

WebUI.setText(findTestObject('WIC/Individu/03/06 Kode Pos'), '11132')

WebUI.setText(findTestObject('WIC/Individu/03/07 Negara'), 'Indonesia')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('WIC/Individu/03/07 Negara'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.setText(findTestObject('WIC/Individu/03/08 Provinsi'), 'Jakk')

WebUI.setText(findTestObject('WIC/Individu/03/09 Catatan'), 'No Note')

WebUI.click(findTestObject('WIC/Individu/03/09 Save'), FailureHandling.STOP_ON_FAILURE)

