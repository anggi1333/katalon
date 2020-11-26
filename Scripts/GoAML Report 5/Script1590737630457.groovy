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

    if (findTestData('GoAMLReport/Transaksi').getValue(1, rowNum) == 'true') {
        if (findTestData('GoAMLReport/Transaksi').getValue(9, rowNum) == 'true') {
            WebUI.check(findTestObject('GoAmlReport/04 Identitas Penerima/01 F My Client'), FailureHandling.STOP_ON_FAILURE)
        }
        
        if (findTestData('GoAMLReport/Transaksi').getValue(10, rowNum) == 'uang tunai') {
            WebUI.scrollToElement(findTestObject('GoAmlReport/04 Identitas Penerima/02 Ins Trx Tujuan'), 3)

            WebUI.setText(findTestObject('GoAmlReport/04 Identitas Penerima/02 Ins Trx Tujuan'), 'Uang Tunai')

            WebUI.delay(3)

            WebUI.sendKeys(findTestObject('GoAmlReport/04 Identitas Penerima/02 Ins Trx Tujuan'), Keys.chord(Keys.ENTER))
        }
        
        if (findTestData('GoAMLReport/Transaksi').getValue(10, rowNum) == 'rekening') {
            WebUI.delay(3)

            WebUI.scrollToElement(findTestObject('GoAmlReport/04 Identitas Penerima/02 Ins Trx Tujuan'), 3)

            WebUI.setText(findTestObject('GoAmlReport/04 Identitas Penerima/02 Ins Trx Tujuan'), 'Rekening')

            WebUI.delay(3)

            WebUI.sendKeys(findTestObject('GoAmlReport/04 Identitas Penerima/02 Ins Trx Tujuan'), Keys.chord(Keys.ARROW_DOWN))

            WebUI.sendKeys(findTestObject('GoAmlReport/04 Identitas Penerima/02 Ins Trx Tujuan'), Keys.chord(Keys.ENTER))
        }
        
        //         WebUI.setText(findTestObject('GoAmlReport/03 Identitas Pengirim/04 Mata Uang Asing'), 'Tidak Ada')
        WebUI.scrollToElement(findTestObject('GoAmlReport/04 Identitas Penerima/05 Nominal Valas'), 3)

        WebUI.setText(findTestObject('GoAmlReport/04 Identitas Penerima/05 Nominal Valas'), '500000')

        WebUI.scrollToElement(findTestObject('GoAmlReport/04 Identitas Penerima/06 Kurs'), 3)

        WebUI.setText(findTestObject('GoAmlReport/04 Identitas Penerima/06 Kurs'), 'nope')

        WebUI.setText(findTestObject('GoAmlReport/04 Identitas Penerima/999 Mata Uang Tujuan'), 'TWD - Taiwan Dollar')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/04 Identitas Penerima/999 Mata Uang Tujuan'), Keys.chord(Keys.ENTER))

        WebUI.scrollToElement(findTestObject('GoAmlReport/04 Identitas Penerima/07 Negara Trx Tujuan'), 3)

        WebUI.setText(findTestObject('GoAmlReport/04 Identitas Penerima/07 Negara Trx Tujuan'), 'ital')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/04 Identitas Penerima/07 Negara Trx Tujuan'), Keys.chord(Keys.ENTER))
    }
    
    if (findTestData('GoAMLReport/Transaksi').getValue(11, rowNum) == 'account') {
        WebUI.scrollToElement(findTestObject('GoAmlReport/04 Identitas Penerima/08 Informasi Penerima'), 3)

        WebUI.setText(findTestObject('GoAmlReport/04 Identitas Penerima/08 Informasi Penerima'), findTestData('GoAMLReport/Transaksi').getValue(
                11, rowNum))

        WebUI.delay(8)

        WebUI.sendKeys(findTestObject('GoAmlReport/04 Identitas Penerima/08 Informasi Penerima'), Keys.chord(Keys.ENTER))

        WebUI.delay(5)

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account To/01 Nama PJK'), 3)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account To/01 Nama PJK'), 'PJK')

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account To/02 Kode PJK'), 3)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account To/02 Kode PJK'), '000')

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account To/03 Kode Swift'), 3)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account To/03 Kode Swift'), '1233')

        WebUI.delay(5)

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account To/04 Kantor Rekening'), 3)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account To/04 Kantor Rekening'), 'asu')

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account To/05 No Rekening'), 3)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account To/05 No Rekening'), '999999999')

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account To/06 Mata Uang Rekening'), 3)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account To/06 Mata Uang Rekening'), 'Rupiah')

        WebUI.delay(5)

        WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account To/06 Mata Uang Rekening'), Keys.chord(Keys.ENTER))

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account To/07 No Pengguna Jasa'), 3)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account To/07 No Pengguna Jasa'), '0000000')

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account To/08 Jenis Rekening'), 3)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account To/08 Jenis Rekening'), 'PLA - Lainnya Perorangan')

        WebUI.delay(5)

        WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account To/08 Jenis Rekening'), Keys.chord(Keys.ENTER))

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account To/09 Tanggal Pembukaan Rekeing'), 3)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account To/09 Tanggal Pembukaan Rekeing'), '14-Feb-20')

        WebUI.delay(5)

        WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account To/09 Tanggal Pembukaan Rekeing'), Keys.chord(Keys.ENTER))

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account To/10 Status Rekening'), 3)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account To/10 Status Rekening'), 'AKT - Aktif')

        WebUI.delay(5)

        WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account To/10 Status Rekening'), Keys.chord(Keys.ENTER))

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account To/Rek Korporasi No'), 3)

        WebUI.click(findTestObject('GoAmlReport/06 Account/Account To/Rek Korporasi No'))

        WebUI.delay(1)

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/span_Tambah Signatory'), 
            3)

        WebUI.click(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/span_Tambah Signatory'))

        WebUI.delay(5)

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/01 Jenis Kelamin'), 
            3)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/01 Jenis Kelamin'), 'F - Female')

        WebUI.delay(5)

        WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/01 Jenis Kelamin'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/02 Nama Lengkap'), 'Ageeeeee')

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/03 Tanggal Lahir'), '07-May-97')

        WebUI.delay(5)

        WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/03 Tanggal Lahir'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/03 Tempat Lahir'), 'Jakarta')

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/05 Kewarganegaraan'), 
            3)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/05 Kewarganegaraan'), 'indone')

        WebUI.delay(5)

        WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/05 Kewarganegaraan'), 
            Keys.chord(Keys.ENTER))

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/06 Negara Domisili'), 
            3)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/06 Negara Domisili'), 'indone')

        WebUI.delay(5)

        WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/06 Negara Domisili'), 
            Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/07 Pekerjaan'), 'IT IT an')

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account Tab To/01 Telepon/Tambah Telepon'), 3)

        WebUI.click(findTestObject('GoAmlReport/06 Account/Account Tab To/01 Telepon/Tambah Telepon'))

        WebUI.delay(5)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/01 Telepon/01 Kategori Kontak'), 'D - Domisili')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account Tab To/01 Telepon/01 Kategori Kontak'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/01 Telepon/02 Alat Komunikasi'), 'PSTN - PSTN')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account Tab To/01 Telepon/02 Alat Komunikasi'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/01 Telepon/03 No Telepon'), '0986745632')

        WebUI.delay(2)

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account Tab To/01 Telepon/Save'), 3)

        WebUI.click(findTestObject('GoAmlReport/06 Account/Account Tab To/01 Telepon/Save'))

        WebUI.delay(2)

        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account Tab To/02 Alamat/span_Tambah Alamat'), 3)

        WebUI.click(findTestObject('GoAmlReport/06 Account/Account Tab To/02 Alamat/span_Tambah Alamat'))

        WebUI.delay(5)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/02 Alamat/01 Type Alamat'), 'D - Domisili')

        WebUI.delay(5)

        WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account Tab To/02 Alamat/01 Type Alamat'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/02 Alamat/02 Alamat'), 'Jl. sdhjsadkjsnadklsandkjasd')

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/02 Alamat/03 Kota'), 'Jakarta')

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/02 Alamat/03 Negara'), 'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account Tab To/02 Alamat/03 Negara'), Keys.chord(Keys.ENTER))

        WebUI.delay(2)

        WebUI.click(findTestObject('GoAmlReport/06 Account/Account Tab To/02 Alamat/save'))

        WebUI.delay(2)

        // WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account Tab To/03 Alamat Tempat Bekerja/Tambah Alamat Bekerja'), 
        //       3)
        //   WebUI.click(findTestObject('GoAmlReport/06 Account/Account Tab To/03 Alamat Tempat Bekerja/Tambah Alamat Bekerja'))
        //                WebUI.delay(5)
        //     WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/03 Alamat Tempat Bekerja/01 Type Alamat'), 
        //         'K - Kantor')
        //      WebUI.delay(3)
        //   WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account Tab To/03 Alamat Tempat Bekerja/01 Type Alamat'), 
        //        Keys.chord(Keys.ENTER))
        //    WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/03 Alamat Tempat Bekerja/02 Alamat'), 
        //                    'Tangerang')
        //    WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/03 Alamat Tempat Bekerja/03 Kota'), 
        //   'Tgrng')
        //    WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/03 Alamat Tempat Bekerja/03 Negara'), 
        //       'ID - INDONESIA')
        //   WebUI.delay(3)
        //    WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account Tab To/03 Alamat Tempat Bekerja/03 Negara'), 
        //     Keys.chord(Keys.ENTER))
        //WebUI.click(findTestObject('GoAmlReport/06 Account/Account Tab To/03 Alamat Tempat Bekerja/save'))
        //WebUI.delay(3)
        //WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account Tab To/04 Telepon Tempat Bekerja/span_Tambah Telepon'), 
        //  3)
        //    WebUI.click(findTestObject('GoAmlReport/06 Account/Account Tab To/04 Telepon Tempat Bekerja/span_Tambah Telepon'))
        //   WebUI.delay(3)
        //   WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/04 Telepon Tempat Bekerja/01 Kategori Kontak'), 
        //      'R - Rumah')
        //   WebUI.delay(3)
        //   WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account Tab To/04 Telepon Tempat Bekerja/01 Kategori Kontak'), 
        //    Keys.chord(Keys.ENTER))
        //  WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/04 Telepon Tempat Bekerja/02 Alat Komunikasi'), 
        //      'MOB - Mobile')
        //  WebUI.delay(3)
        //   WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account Tab To/04 Telepon Tempat Bekerja/02 Alat Komunikasi'), 
        //      Keys.chord(Keys.ENTER))
        //  WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/04 Telepon Tempat Bekerja/03 Nomor Telepon'), 
        //      '089234789233')
        //  WebUI.click(findTestObject('GoAmlReport/06 Account/Account Tab To/04 Telepon Tempat Bekerja/save'), FailureHandling.STOP_ON_FAILURE)
        //      WebUI.delay(3)
        WebUI.scrollToElement(findTestObject('GoAmlReport/06 Account/Account Tab To/05 Dokumen Identitas/Tambah Dokumen Identitas'), 
            3)

        WebUI.click(findTestObject('GoAmlReport/06 Account/Account Tab To/05 Dokumen Identitas/Tambah Dokumen Identitas'))

        WebUI.delay(3)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/05 Dokumen Identitas/01 Jenis Dokumen Identitas'), 
            'SUKET - Surat Keterangan Kependudukan')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account Tab To/05 Dokumen Identitas/01 Jenis Dokumen Identitas'), 
            Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/05 Dokumen Identitas/02 No Identitas'), '12321444')

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/05 Dokumen Identitas/03 Negara Penerbit'), 'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/06 Account/Account Tab To/05 Dokumen Identitas/03 Negara Penerbit'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('GoAmlReport/06 Account/Account Tab To/05 Dokumen Identitas/Save'), FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/08 Sumber Dana'), 'Minta')

        WebUI.click(findTestObject('GoAmlReport/06 Account/Account Tab To/Account To Signatory/Save'))
    }
    
    if (findTestData('GoAMLReport/Transaksi').getValue(11, rowNum) == 'person') {
        WebUI.setText(findTestObject('GoAmlReport/04 Identitas Penerima/08 Informasi Penerima'), findTestData('GoAMLReport/Transaksi').getValue(
                11, rowNum))

        WebUI.delay(8)

        WebUI.sendKeys(findTestObject('GoAmlReport/04 Identitas Penerima/08 Informasi Penerima'), Keys.chord(Keys.ENTER))

        WebUI.delay(5)

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person To/01 Jenis Kelamin'), 'F - Female')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/05 Person/Person To/01 Jenis Kelamin'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person To/02 Gelar'), 'Missfortune')

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person To/03 Nama Lengkap'), 'Anggi Firmansah')

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person To/04 Tanggal Lahir'), '13-Mar-93')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/05 Person/Person To/04 Tanggal Lahir'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person To/05 Tempat Lahir'), 'Jakarta')

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person To/06 NIK'), '13221')

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person To/06 Nama Ibu Kandung'), 'Ibu')

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person To/07 No Paspor'), '123444')

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person To/08 Negara Penerbit Paspor'), 'Indonesia')

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person To/09 No Identitas Lain'), '555555555')

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person To/10 Kewarganegaraan'), 'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/05 Person/Person To/10 Kewarganegaraan'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person To/11 Negara Domisili'), 'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/05 Person/Person To/11 Negara Domisili'), Keys.chord(Keys.ENTER))

        WebUI.scrollToElement(findTestObject('GoAmlReport/05 Person/Person To/04 Tanggal Lahir'), 3)

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person To/12 Pekerjaan'), 'IT IT an')

        WebUI.scrollToElement(findTestObject('GoAmlReport/05 Person/Person To/13 Sumber Dana'), 3)

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person To/13 Sumber Dana'), 'Gaji')

        WebUI.scrollToElement(findTestObject('GoAmlReport/05 Person/Person Tab To/01 Telepon/Tambah Telepon'), 3)

        WebUI.click(findTestObject('GoAmlReport/05 Person/Person Tab To/01 Telepon/Tambah Telepon'))

        WebUI.delay(5)

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/01 Telepon/01 Kategori Kontak'), 'D - Domisili')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/05 Person/Person Tab To/01 Telepon/01 Kategori Kontak'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/01 Telepon/02 Alat Komunikasi'), 'PSTN - PSTN')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/05 Person/Person Tab To/01 Telepon/02 Alat Komunikasi'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/01 Telepon/03 No Telepon'), '0986745632')

        WebUI.delay(2)

        WebUI.scrollToElement(findTestObject('GoAmlReport/05 Person/Person Tab To/01 Telepon/Save'), 3)

        WebUI.click(findTestObject('GoAmlReport/05 Person/Person Tab To/01 Telepon/Save'))

        WebUI.delay(5)

        WebUI.scrollToElement(findTestObject('GoAmlReport/05 Person/Person Tab To/02 Alamat/span_Tambah Alamat'), 3)

        WebUI.click(findTestObject('GoAmlReport/05 Person/Person Tab To/02 Alamat/span_Tambah Alamat'))

        WebUI.delay(5)

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/02 Alamat/01 Type Alamat'), 'D - Domisili')

        WebUI.delay(5)

        WebUI.sendKeys(findTestObject('GoAmlReport/05 Person/Person Tab To/02 Alamat/01 Type Alamat'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/02 Alamat/02 Alamat'), 'Jl. sdhjsadkjsnadklsandkjasd')

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/02 Alamat/03 Kota'), 'Jakarta')

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/02 Alamat/03 Negara'), 'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/05 Person/Person Tab To/02 Alamat/03 Negara'), Keys.chord(Keys.ENTER))

        WebUI.delay(2)

        WebUI.click(findTestObject('GoAmlReport/05 Person/Person Tab To/02 Alamat/save'))

        WebUI.delay(2)

        WebUI.scrollToElement(findTestObject('GoAmlReport/05 Person/Person Tab To/03 Alamat Tempat Bekerja/Tambah Alamat Bekerja'), 
            3)

        WebUI.click(findTestObject('GoAmlReport/05 Person/Person Tab To/03 Alamat Tempat Bekerja/Tambah Alamat Bekerja'))

        WebUI.delay(5)

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/03 Alamat Tempat Bekerja/01 Type Alamat'), 'K - Kantor')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/05 Person/Person Tab To/03 Alamat Tempat Bekerja/01 Type Alamat'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/03 Alamat Tempat Bekerja/02 Alamat'), 'Tangerang')

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/03 Alamat Tempat Bekerja/03 Kota'), 'Tgrng')

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/03 Alamat Tempat Bekerja/03 Negara'), 'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/05 Person/Person Tab To/03 Alamat Tempat Bekerja/03 Negara'), Keys.chord(
                Keys.ENTER))

        WebUI.delay(3)

        WebUI.click(findTestObject('GoAmlReport/05 Person/Person Tab To/03 Alamat Tempat Bekerja/save'))

        WebUI.delay(3)

        WebUI.scrollToElement(findTestObject('GoAmlReport/05 Person/Person Tab To/04 Telepon Tempat Bekerja/span_Tambah Telepon'), 
            3)

        WebUI.click(findTestObject('GoAmlReport/05 Person/Person Tab To/04 Telepon Tempat Bekerja/span_Tambah Telepon'))

        WebUI.delay(3)

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/04 Telepon Tempat Bekerja/01 Kategori Kontak'), 
            'R - Rumah')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/05 Person/Person Tab To/04 Telepon Tempat Bekerja/01 Kategori Kontak'), 
            Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/04 Telepon Tempat Bekerja/02 Alat Komunikasi'), 
            'MOB - Mobile')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/05 Person/Person Tab To/04 Telepon Tempat Bekerja/02 Alat Komunikasi'), 
            Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/04 Telepon Tempat Bekerja/03 Nomor Telepon'), 
            '089234789233')

        WebUI.click(findTestObject('GoAmlReport/05 Person/Person Tab To/04 Telepon Tempat Bekerja/save'), FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(3)

        WebUI.scrollToElement(findTestObject('GoAmlReport/05 Person/Person Tab To/05 Dokumen Identitas/Tambah Dokumen Identitas'), 
            3)

        WebUI.click(findTestObject('GoAmlReport/05 Person/Person Tab To/05 Dokumen Identitas/Tambah Dokumen Identitas'))

        WebUI.delay(3)

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/05 Dokumen Identitas/01 Jenis Dokumen Identitas'), 
            'SUKET - Surat Keterangan Kependudukan')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/05 Person/Person Tab To/05 Dokumen Identitas/01 Jenis Dokumen Identitas'), 
            Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/05 Dokumen Identitas/02 No Identitas'), '12321444')

        WebUI.setText(findTestObject('GoAmlReport/05 Person/Person Tab To/05 Dokumen Identitas/03 Negara Penerbit'), 'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/05 Person/Person Tab To/05 Dokumen Identitas/03 Negara Penerbit'), Keys.chord(
                Keys.ENTER))

        WebUI.click(findTestObject('GoAmlReport/05 Person/Person Tab To/05 Dokumen Identitas/Save'), FailureHandling.STOP_ON_FAILURE)
    }
    
    if (findTestData('GoAMLReport/Transaksi').getValue(11, rowNum) == 'entity') {
        WebUI.setText(findTestObject('GoAmlReport/04 Identitas Penerima/08 Informasi Penerima'), findTestData('GoAMLReport/Transaksi').getValue(
                11, rowNum))

        WebUI.delay(8)

        WebUI.sendKeys(findTestObject('GoAmlReport/04 Identitas Penerima/08 Informasi Penerima'), Keys.chord(Keys.ENTER))

        WebUI.delay(5)

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account To/01 Nama Korporasi'), 'Simpan Pinjam')

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account To/02 Bentuk Korporasi'), 'PD - Perusahaan Daerah')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account To/02 Bentuk Korporasi'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account To/03 Bidang Usaha'), 'Rentenir')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account To/03 Negara'), Keys.chord(Keys.ENTER))

        WebUI.delay(3)

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account To/03 Negara'), 'indone')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account To/03 Negara'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account To/04 NPWP'), '123213123')

        WebUI.scrollToElement(findTestObject('GoAmlReport/07 Entity/Account Tab To/01 Telepon/Tambah Telepon'), 3)

        WebUI.click(findTestObject('GoAmlReport/07 Entity/Account Tab To/01 Telepon/Tambah Telepon'))

        WebUI.delay(5)

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/01 Telepon/01 Kategori Kontak'), 'D - Domisili')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account Tab To/01 Telepon/01 Kategori Kontak'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/01 Telepon/02 Alat Komunikasi'), 'PSTN - PSTN')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account Tab To/01 Telepon/02 Alat Komunikasi'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/01 Telepon/03 No Telepon'), '0986745632')

        WebUI.delay(2)

        WebUI.scrollToElement(findTestObject('GoAmlReport/07 Entity/Account Tab To/01 Telepon/Save'), 3)

        WebUI.click(findTestObject('GoAmlReport/07 Entity/Account Tab To/01 Telepon/Save'), FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(3)

        WebUI.scrollToElement(findTestObject('GoAmlReport/07 Entity/Account Tab To/02 Alamat/span_Tambah Alamat'), 3)

        WebUI.click(findTestObject('GoAmlReport/07 Entity/Account Tab To/02 Alamat/span_Tambah Alamat'))

        WebUI.delay(5)

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/02 Alamat/01 Type Alamat'), 'D - Domisili')

        WebUI.delay(5)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account Tab To/02 Alamat/01 Type Alamat'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/02 Alamat/02 Alamat'), 'Jl. sdhjsadkjsnadklsandkjasd')

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/02 Alamat/03 Kota'), 'Jakarta')

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/02 Alamat/03 Negara'), 'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account Tab To/02 Alamat/03 Negara'), Keys.chord(Keys.ENTER))

        WebUI.delay(2)

        WebUI.click(findTestObject('GoAmlReport/07 Entity/Account Tab To/02 Alamat/save'))

        WebUI.click(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/00 Add'))

        WebUI.scrollToElement(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/00 Add'), 3)

        WebUI.delay(5)

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/01 Jenis Kelamin'), 'F - Female')

        WebUI.delay(5)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/01 Jenis Kelamin'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/02 Nama Lengkap'), 'Aman ')

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/10 Tanggal Lahir'), '01-Aug-96')

        WebUI.delay(2)

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/12 Tempat Lahir'), 'Jakarta')

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/04 Kewarganegaraan'), 'indone')

        WebUI.delay(5)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/04 Kewarganegaraan'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/05 Negara Domisili'), 'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/05 Negara Domisili'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/06 Pekerjaan'), 'Kerja Serabutan')

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/07 Sumber Dana'), 'Maling')

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/08 Peran'), 'UBO - Ultimate Beneficial Owner')

        WebUI.delay(2)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/08 Peran'), Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/09 Telepon/Tambah Telepon'))

        WebUI.scrollToElement(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/09 Telepon/01 Kategori Kontak'), 
            3)

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/09 Telepon/01 Kategori Kontak'), 
            'K - Kantor')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/09 Telepon/01 Kategori Kontak'), 
            Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/09 Telepon/02 Alat Komunikasi'), 
            'PSTN - PSTN')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/09 Telepon/02 Alat Komunikasi'), 
            Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/09 Telepon/03 No Telepon'), '222222222')

        WebUI.click(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/09 Telepon/Save'), FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(4)

        WebUI.scrollToElement(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/10 Alamat/span_Tambah Alamat'), 
            3)

        WebUI.click(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/10 Alamat/span_Tambah Alamat'))

        WebUI.delay(3)

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/10 Alamat/01 Type Alamat'), 'R - Rumah')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/10 Alamat/01 Type Alamat'), Keys.chord(
                Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/10 Alamat/02 Alamat'), 'Jl Jalan Jln')

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/10 Alamat/03 Kota'), 'Jakarte')

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/10 Alamat/03 Negara'), 'Indonesi')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/10 Alamat/03 Negara'), Keys.chord(
                Keys.ENTER))

        WebUI.click(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/10 Alamat/save'), FailureHandling.STOP_ON_FAILURE)

        WebUI.scrollToElement(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/11 Dokumen Identitas/Tambah Dokumen Identitas'), 
            3)

        WebUI.click(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/11 Dokumen Identitas/Tambah Dokumen Identitas'))

        WebUI.delay(3)

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/11 Dokumen Identitas/01 Jenis Dokumen Identitas'), 
            'SUKET - Surat Keterangan Kependudukan')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/11 Dokumen Identitas/01 Jenis Dokumen Identitas'), 
            Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/11 Dokumen Identitas/02 No Identitas'), 
            '12321444')

        WebUI.setText(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/11 Dokumen Identitas/03 Negara Penerbit'), 
            'ID - INDONESIA')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/11 Dokumen Identitas/03 Negara Penerbit'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/11 Dokumen Identitas/Save'))

        WebUI.click(findTestObject('GoAmlReport/07 Entity/Account Tab To/03 Director/99 Save'))

        WebUI.delay(2)
    }
    
    //WebUI.click(findTestObject('GoAmlReport/02 Transaksi/Save'), FailureHandling.STOP_ON_FAILURE)
}

