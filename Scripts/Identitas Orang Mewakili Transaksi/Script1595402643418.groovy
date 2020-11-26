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

for (def rowNum = 1; rowNum <= findTestData('GoAMLReport/Transaksi').getRowNumbers(); rowNum++) {
    WebUI.delay(6)

    if (findTestData('GoAMLReport/Transaksi').getValue(13, rowNum) == 'true') {
        WebUI.click(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/01/01 Yes'))

        WebUI.delay(8)

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/01/02 Jenis Kelamin'), 'F - Female')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/01/02 Jenis Kelamin'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/01/03 Gelar'), 'Missfortune')

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/01/04 Nama Lengkap'), 'Anggi Firmansah')

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/01/05 Tanggl Lahir'), '13-Mar-93')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/01/05 Tanggl Lahir'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/01/06 Tempat Lahir'), 'Jakarta')

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/01/07 Nama Ibu Kandung'), 'Ibu')

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/01/09 NIK'), '31333')

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/01/10 No Passpor'), '123444')

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/01/11 Negara Penerbit Paspor'), 
            'Indonesia')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/01/11 Negara Penerbit Paspor'), 
            Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/01/12 No Identitas Lain'), '555555555')

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/04/01 Kwrg 1'), 'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/04/01 Kwrg 1'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/04/02 Kwrg 2'), 'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/04/02 Kwrg 2'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/04/03 Kwrg 3'), 'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/04/03 Kwrg 3'), Keys.chord(Keys.ENTER))

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/04/04 Negara Domisili'), 'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/04/04 Negara Domisili'), Keys.chord(
                Keys.ENTER))

        WebUI.scrollToElement(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/04/10 Pekerjaa'), 3)

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/04/10 Pekerjaa'), 'IT IT an')

        WebUI.scrollToElement(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/04/11 Tempat Bekerja'), 
            3)

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/04/11 Tempat Bekerja'), 'JAKARTA')

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/07/10 Sumber Dana'), 'Maling')

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/07/11 Catatan'), 'tydacc addacc')

        WebUI.scrollToElement(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/02/01 Add'), 3)

        WebUI.click(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/02/01 Add'))

        WebUI.delay(5)

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/02/02 Kategori Kontak'), 'D - Domisili')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/02/02 Kategori Kontak'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/02/03 Alat Komunikasi'), 'PSTN - PSTN')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/02/03 Alat Komunikasi'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/02/05 Nomor Telepon'), '0986745632')

        WebUI.delay(2)

        WebUI.scrollToElement(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/02/08 Save'), 3)

        WebUI.click(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/02/08 Save'))

        WebUI.delay(5)

        WebUI.scrollToElement(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/03/01 Add'), 3)

        WebUI.click(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/03/01 Add'))

        WebUI.delay(5)

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/03/02 Tipe Alamat'), 'D - Domisili')

        WebUI.delay(5)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/03/02 Tipe Alamat'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/03/03 Alamat'), 'Jl. sdhjsadkjsnadklsandkjasd')

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/03/05 Kota'), 'Jakarta')

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/03/07 Negara'), 'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/03/07 Negara'), Keys.chord(Keys.ENTER))

        WebUI.delay(2)

        WebUI.click(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/03/10 Save'))

        WebUI.delay(2)

        WebUI.scrollToElement(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/05/01 Add'), 3)

        WebUI.click(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/05/01 Add'))

        WebUI.delay(5)

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/05/02 Tipe Alamat'), 'K - Kantor')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/05/02 Tipe Alamat'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/05/03 Alamat'), 'Tangerang')

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/05/05 Kota'), 'Tgrng')

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/05/07 Negara'), 'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/05/07 Negara'), Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/05/10 Save'))

        WebUI.delay(3)

        WebUI.scrollToElement(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/06/01 Add'), 3)

        WebUI.click(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/06/01 Add'))

        WebUI.delay(3)

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/06/02 Kategori Kontak'), 'R - Rumah')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/06/02 Kategori Kontak'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/06/03 Alat Komunikasi'), 'MOB - Mobile')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/06/03 Alat Komunikasi'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/06/04 Nomor Telepon'), '089234789233')

        WebUI.click(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/06/07 Save'), FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(3)

        WebUI.scrollToElement(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/07/01 Add'), 3)

        WebUI.click(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/07/01 Add'))

        WebUI.delay(3)

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/07/02 Jenis Dokumen Identitas'), 
            'SUKET - Surat Keterangan Kependudukan')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/07/02 Jenis Dokumen Identitas'), 
            Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/07/02 No Identitas'), '12321444')

        WebUI.setText(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/07/06 Negara Penerbit Identitas'), 
            'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/07/06 Negara Penerbit Identitas'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('GoAmlReport/08 Identitas Orang Mewakili Transaksi/07/08 Save'), FailureHandling.STOP_ON_FAILURE)
    }
}

