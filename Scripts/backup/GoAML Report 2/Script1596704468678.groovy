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

for (def rowNum = 1; rowNum <= findTestData('GoAMLReport/General Information').getRowNumbers(); rowNum++) {
    WebUI.delay(90)

    WebUI.click(findTestObject('GoAmlReport/01 General Information/01 Jenis Laporan'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(20)

    if (findTestData('GoAMLReport/General Information').getValue(1, rowNum) == 'LAPT - LTKM') {
        WebUI.click(findTestObject('GoAmlReport/01 General Information/Isi Jenis Laporan/1 LAPT - LTKM'))

        WebUI.delay(20)

        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'CaseManagement ID') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
        
        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'CIF') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ARROW_DOWN))

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
    }
    
    if (findTestData('GoAMLReport/General Information').getValue(1, rowNum) == 'LTKM - LTKM') {
        WebUI.click(findTestObject('GoAmlReport/01 General Information/Isi Jenis Laporan/2 LTKM - LTKM'))

        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'CaseManagement ID') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
        
        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'CIF') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ARROW_DOWN))

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
    }
    
    if (findTestData('GoAMLReport/General Information').getValue(1, rowNum) == 'LTKMH - LTKM') {
        WebUI.click(findTestObject('GoAmlReport/01 General Information/Isi Jenis Laporan/3 LTKMH - LTKM'))

        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'CaseManagement ID') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
        
        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'CIF') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ARROW_DOWN))

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
    }
    
    if (findTestData('GoAMLReport/General Information').getValue(1, rowNum) == 'LTKMP - LTKM') {
        WebUI.click(findTestObject('GoAmlReport/01 General Information/04 Tidakan Pelapor'))
    }
    
    if (findTestData('GoAMLReport/General Information').getValue(1, rowNum) == 'LTKMT - LTKM') {
        WebUI.click(findTestObject('GoAmlReport/01 General Information/05 Type Report'))

        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'CaseManagement ID') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
        
        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'CIF') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ARROW_DOWN))

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
    }
    
    if (findTestData('GoAMLReport/General Information').getValue(1, rowNum) == 'LTKTK - LTKT') {
        WebUI.click(findTestObject('GoAmlReport/01 General Information/Isi Jenis Laporan/6 LTKTK - LTKT'))

        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'CIF') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
        
        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'WIC') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ARROW_DOWN))

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
    }
    
    if (findTestData('GoAMLReport/General Information').getValue(1, rowNum) == 'LTKTM - LTKT') {
        WebUI.click(findTestObject('GoAmlReport/01 General Information/Isi Jenis Laporan/7 LTKTM - LTKT'))

        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'CIF') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
        
        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'WIC') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ARROW_DOWN))

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
        
        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'Sender Reference') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ARROW_DOWN))

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ARROW_DOWN))

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
    }
    
    if (findTestData('GoAMLReport/General Information').getValue(1, rowNum) == 'TKLIB - LTKL') {
        WebUI.click(findTestObject('GoAmlReport/01 General Information/Isi Jenis Laporan/8 TKLIB - LTKL'))

        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'CIF') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
        
        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'WIC') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ARROW_DOWN))

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
        
        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'Sender Reference') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.delay(10)

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ARROW_DOWN))

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ARROW_DOWN))

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
    }
    
    if (findTestData('GoAMLReport/General Information').getValue(1, rowNum) == 'TKLOB - LTKL') {
        WebUI.click(findTestObject('GoAmlReport/01 General Information/Isi Jenis Laporan/9 TKLOB - LTKL'))

        if (findTestData('GoAMLReport/General Information').getValue(4, rowNum) == 'Sender Reference') {
            WebUI.setText(findTestObject('GoAmlReport/01 General Information/05 Type Report'), 'transaksi unik')

            WebUI.sendKeys(findTestObject('GoAmlReport/01 General Information/05 Type Report'), Keys.chord(Keys.ENTER))
        }
    }
    
    WebUI.setText(findTestObject('GoAmlReport/01 General Information/02 Tgl Laporan'), findTestData('GoAMLReport/General Information').getValue(
            3, 1))

    WebUI.setText(findTestObject('GoAmlReport/01 General Information/03 Alasan'), 'No Reason')

    WebUI.setText(findTestObject('GoAmlReport/01 General Information/04 Tidakan Pelapor'), 'Tidak Bertindak')

    WebUI.setText(findTestObject('GoAmlReport/01 General Information/06 No Value Report'), 'Testing Anggi 2906')

    if (findTestData('GoAMLReport/General Information').getValue(6, rowNum) == 'true') {
        WebUI.click(findTestObject('GoAmlReport/Indikator'))

        WebUI.delay(5)

        WebUI.setText(findTestObject('GoAmlReport/Indikator 2'), findTestData('GoAMLReport/General Information').getValue(
                7, rowNum))

        WebUI.delay(3)

        WebUI.sendKeys(findTestObject('GoAmlReport/Indikator 2'), Keys.chord(Keys.ENTER))

        WebUI.delay(2)

        WebUI.click(findTestObject('GoAmlReport/save indikator'))
    }
}

