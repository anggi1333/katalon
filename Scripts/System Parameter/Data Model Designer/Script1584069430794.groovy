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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('http://goaml.southeastasia.cloudapp.azure.com/goaml/Default.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/UserName'), 'sysadmin')

WebUI.setText(findTestObject('All/password'), 'superuser')

WebUI.click(findTestObject('All/Sign In'))

WebUI.setText(findTestObject('All/filter'), 'Data Model Designer')

WebUI.delay(1)

WebUI.click(findTestObject('All/View'))

WebUI.delay(3)

WebUI.click(findTestObject('All/New Record'))

WebUI.delay(1)

for (def rowNum = 1; rowNum <= findTestData('System Parameter/Module Designer').getRowNumbers(); rowNum++) {
    WebUI.setText(findTestObject('System Parameter/Model Designer/Data Model Designer/module name'), findTestData('System Parameter/Module Designer').getValue(
            1, rowNum))

    WebUI.setText(findTestObject('System Parameter/Model Designer/Data Model Designer/module label'), findTestData('System Parameter/Module Designer').getValue(
            2, rowNum))

    WebUI.setText(findTestObject('System Parameter/Model Designer/Data Model Designer/module desc'), findTestData('System Parameter/Module Designer').getValue(
            3, rowNum))

    if (findTestData('System Parameter/Module Designer').getValue(4, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/add'))
    }
    
    if (findTestData('System Parameter/Module Designer').getValue(5, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/edit'))
    }
    
    if (findTestData('System Parameter/Module Designer').getValue(6, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/delete'))
    }
    
    if (findTestData('System Parameter/Module Designer').getValue(7, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/view'))
    }
    
    if (findTestData('System Parameter/Module Designer').getValue(8, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/upload'))
    }
    
    if (findTestData('System Parameter/Module Designer').getValue(9, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/activ'))
    }
    
    if (findTestData('System Parameter/Module Designer').getValue(10, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/approval'))
    }
    
    if (findTestData('System Parameter/Module Designer').getValue(11, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/detail'))
    }
    
    if (findTestData('System Parameter/Module Designer').getValue(12, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/designer'))
    }
    
    break
}

for (def rowNum = 1; rowNum <= findTestData('System Parameter/Module Designer 2').getRowNumbers(); rowNum++) {
    if (findTestData('System Parameter/Module Designer 2').getValue(1, rowNum) == 'true') {
        WebUI.delay(3)

        WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/2/1 add'))
    }
    
    WebUI.delay(3)

    WebUI.setText(findTestObject('System Parameter/Model Designer/Data Model Designer/2/2 Field Name'), findTestData('System Parameter/Module Designer 2').getValue(
            2, rowNum))

    WebUI.setText(findTestObject('System Parameter/Model Designer/Data Model Designer/2/2__ Field Label'), findTestData(
            'System Parameter/Module Designer 2').getValue(3, rowNum))

    WebUI.setText(findTestObject('System Parameter/Model Designer/Data Model Designer/2/3 Squence'), findTestData('System Parameter/Module Designer 2').getValue(
            4, rowNum))

    if (findTestData('System Parameter/Module Designer 2').getValue(5, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/2/4 Primary Key'))
    }
    
    if (findTestData('System Parameter/Module Designer 2').getValue(6, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/2/5 Require'))
    }
    
    if (findTestData('System Parameter/Module Designer 2').getValue(7, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/2/6 Unik'))
    }
    
    if (findTestData('System Parameter/Module Designer 2').getValue(8, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/2/7 Show In View'))
    }
    
    if (findTestData('System Parameter/Module Designer 2').getValue(9, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/2/8 Show In Form'))
    }
    
    WebUI.setText(findTestObject('System Parameter/Model Designer/Data Model Designer/2/9 Default Value'), findTestData(
            'System Parameter/Module Designer 2').getValue(10, rowNum))

    WebUI.setText(findTestObject('System Parameter/Model Designer/Data Model Designer/2/_10 Ext Type'), findTestData('System Parameter/Module Designer 2').getValue(
            11, rowNum))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('System Parameter/Model Designer/Data Model Designer/2/_10 Ext Type'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('System Parameter/Model Designer/Data Model Designer/2/_11 Field Type'), findTestData('System Parameter/Module Designer 2').getValue(
            12, rowNum))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('System Parameter/Model Designer/Data Model Designer/2/_11 Field Type'), Keys.chord(Keys.ENTER))

    if (findTestData('System Parameter/Module Designer 2').getValue(12, rowNum) == 'FLOAT') {
        WebUI.setText(findTestObject('System Parameter/Model Designer/Data Model Designer/2/_10 Ext Type'), findTestData(
                'System Parameter/Module Designer 2').getValue(13, rowNum))
    } else if (findTestData('System Parameter/Module Designer 2').getValue(12, rowNum) == 'REAL') {
        WebUI.setText(findTestObject('System Parameter/Model Designer/Data Model Designer/2/_12 Field Size'), findTestData(
                'System Parameter/Module Designer 2').getValue(13, rowNum))
    } else if (findTestData('System Parameter/Module Designer 2').getValue(12, rowNum) == 'MONEY') {
        WebUI.setText(findTestObject('System Parameter/Model Designer/Data Model Designer/2/_12 Field Size'), findTestData(
                'System Parameter/Module Designer 2').getValue(13, rowNum))
    } else if (findTestData('System Parameter/Module Designer 2').getValue(12, rowNum) == 'VARCHAR') {
        WebUI.setText(findTestObject('System Parameter/Model Designer/Data Model Designer/2/_12 Field Size'), findTestData(
                'System Parameter/Module Designer 2').getValue(13, rowNum))
    } else if (findTestData('System Parameter/Module Designer 2').getValue(12, rowNum) == 'Varbinary') {
        WebUI.setText(findTestObject('System Parameter/Model Designer/Data Model Designer/2/_12 Field Size'), findTestData(
                'System Parameter/Module Designer 2').getValue(13, rowNum))
    }
    
    WebUI.click(findTestObject('System Parameter/Model Designer/Data Model Designer/2/_13 Save'))
}

