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
        WebUI.click(findTestObject('GoAmlReport/01 General Information/07 Tambah Transaksi'))

        WebUI.delay(6)

        WebUI.setText(findTestObject('GoAmlReport/Nomor Transaksi'), findTestData('GoAMLReport/Transaksi').getValue(12, 
                rowNum))

        WebUI.setText(findTestObject('GoAmlReport/02 Transaksi/01 No Ref Transaksi'), '12133746')

        WebUI.setText(findTestObject('GoAmlReport/02 Transaksi/02 Lokasi Transaksi'), 'Jakarta')

        WebUI.setText(findTestObject('GoAmlReport/02 Transaksi/03 Keterangan Transaksi'), 'Noted')

        WebUI.setText(findTestObject('GoAmlReport/02 Transaksi/04 Tgl Transaksi'), findTestData('GoAMLReport/Transaksi').getValue(
                2, rowNum))

        WebUI.setText(findTestObject('GoAmlReport/02 Transaksi/05 Nama Teller'), 'Miss Teller')

        WebUI.setText(findTestObject('GoAmlReport/02 Transaksi/06 Nama Pejabat'), 'Mr Pejabat')

        WebUI.setText(findTestObject('GoAmlReport/02 Transaksi/07 Tgl Pembukuan'), '01-May-20')

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/02 Transaksi/07 Tgl Pembukuan'), Keys.chord(Keys.ENTER))

        WebUI.scrollToElement(findTestObject('GoAmlReport/02 Transaksi/08 Cara Trx Dilakukan'), 3)

        WebUI.setText(findTestObject('GoAmlReport/02 Transaksi/08 Cara Trx Dilakukan'), findTestData('GoAMLReport/Transaksi').getValue(
                3, rowNum))

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/02 Transaksi/08 Cara Trx Dilakukan'), Keys.chord(Keys.ENTER))

        WebUI.scrollToElement(findTestObject('GoAmlReport/02 Transaksi/09 Cara Trx Lain'), 3)

        WebUI.setText(findTestObject('GoAmlReport/02 Transaksi/09 Cara Trx Lain'), 'Tidak-Ada')

        WebUI.scrollToElement(findTestObject('GoAmlReport/02 Transaksi/10 Nilai Trx (IDR)'), 3)

        WebUI.setText(findTestObject('GoAmlReport/02 Transaksi/10 Nilai Trx (IDR)'), findTestData('GoAMLReport/Transaksi').getValue(
                4, rowNum))

        WebUI.setText(findTestObject('GoAmlReport/02 Transaksi/11 Type Trx'), findTestData('GoAMLReport/Transaksi').getValue(
                5, rowNum))

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/02 Transaksi/11 Type Trx'), Keys.chord(Keys.ENTER))
    }
}

