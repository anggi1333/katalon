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

CustomKeywords.'newpackage.Login.goLogin'()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/filter'), 'Data Access')

WebUI.delay(1)

WebUI.click(findTestObject('All/View'))

for (def rowNum = 1; rowNum <= findTestData('System Parameter/Data Access').getRowNumbers(); rowNum++) {
    if (findTestData('System Parameter/Data Access').getValue(1, rowNum) == 'Add') {
        WebUI.click(findTestObject('All/New Record'))

        WebUI.setText(findTestObject('System Parameter/Data Access/1 Role Name'), findTestData('System Parameter/Data Access').getValue(
                2, rowNum))

        WebUI.sendKeys(findTestObject('System Parameter/Data Access/1 Role Name'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('System Parameter/Data Access/2 Module'), findTestData('System Parameter/Data Access').getValue(
                3, rowNum))

        WebUI.sendKeys(findTestObject('System Parameter/Data Access/2 Module'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('System Parameter/Data Access/3 Filter Data'), findTestData('System Parameter/Data Access').getValue(
                4, rowNum))

        WebUI.setText(findTestObject('System Parameter/Data Access/2 Module Action'), findTestData('System Parameter/Data Access').getValue(
                5, rowNum))

        WebUI.sendKeys(findTestObject('System Parameter/Data Access/2 Module Action'), Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('All/save'))

        WebUI.click(findTestObject('All/confirm'))
    }
    
    if (findTestData('System Parameter/Data Access').getValue(1, rowNum) == 'Edit') {
        WebUI.setText(findTestObject('System Parameter/Data Access/5 Filter'), findTestData('System Parameter/Data Access').getValue(
                2, rowNum))

        WebUI.delay(2)

        WebUI.click(findTestObject('All/edit'))

        WebUI.setText(findTestObject('System Parameter/Data Access/1 Role Name'), findTestData('System Parameter/Data Access').getValue(
                2, rowNum))

        WebUI.sendKeys(findTestObject('System Parameter/Data Access/1 Role Name'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('System Parameter/Data Access/2 Module'), findTestData('System Parameter/Data Access').getValue(
                3, rowNum))

        WebUI.sendKeys(findTestObject('System Parameter/Data Access/2 Module'), Keys.chord(Keys.ENTER))

        WebUI.setText(findTestObject('System Parameter/Data Access/3 Filter Data'), findTestData('System Parameter/Data Access').getValue(
                4, rowNum))

        WebUI.setText(findTestObject('System Parameter/Data Access/2 Module Action'), findTestData('System Parameter/Data Access').getValue(
                5, rowNum))

        WebUI.sendKeys(findTestObject('System Parameter/Data Access/2 Module Action'), Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('All/save'))

        WebUI.click(findTestObject('All/confirm'))
    }
    
    if (findTestData('System Parameter/Data Access').getValue(1, rowNum) == 'Delete') {
        WebUI.setText(findTestObject('System Parameter/Data Access/5 Filter'), findTestData('System Parameter/Data Access').getValue(
                2, rowNum))

        WebUI.delay(2)

        WebUI.click(findTestObject('All/delete'))

        WebUI.click(findTestObject('All/delete 2'))

        WebUI.click(findTestObject('All/confirm'))
    }
}

