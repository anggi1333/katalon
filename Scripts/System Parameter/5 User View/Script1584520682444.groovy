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

CustomKeywords.'newpackage.Login.goLogin'()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/filter'), 'User View')

WebUI.delay(1)

WebUI.click(findTestObject('All/View'))

WebUI.delay(1)

for (def rowNum = 1; rowNum <= findTestData('System Parameter/User View').getRowNumbers(); rowNum++) {
    if (findTestData('System Parameter/User View').getValue(1, rowNum) == 'Add') {
        WebUI.click(findTestObject('All/New Record'))

        WebUI.setText(findTestObject('System Parameter/User Management/User View/1 User ID'), findTestData('System Parameter/User View').getValue(
                2, rowNum))

        WebUI.setText(findTestObject('System Parameter/User Management/User View/2 Username'), findTestData('System Parameter/User View').getValue(
                3, rowNum))

        WebUI.setText(findTestObject('System Parameter/User Management/User View/3 Role'), findTestData('System Parameter/User View').getValue(
                4, rowNum))

        WebUI.setText(findTestObject('System Parameter/User Management/User View/4 Group Menu'), findTestData('System Parameter/User View').getValue(
                5, rowNum))

        WebUI.setText(findTestObject('System Parameter/User Management/User View/5 Password'), findTestData('System Parameter/User View').getValue(
                6, rowNum))

        WebUI.setText(findTestObject('System Parameter/User Management/User View/6 RePassword'), findTestData('System Parameter/User View').getValue(
                7, rowNum))

        WebUI.setText(findTestObject('System Parameter/User Management/User View/7 Email Address'), findTestData('System Parameter/User View').getValue(
                8, rowNum))

        WebUI.click(findTestObject('System Parameter/User Management/User View/999 save'))

        WebUI.click(findTestObject('All/confirm'))
    }
    
    if (findTestData('System Parameter/User View').getValue(1, rowNum) == 'Edit') {
        WebUI.setText(findTestObject('System Parameter/User Management/User View/8 Filter'), findTestData('System Parameter/User View').getValue(
                2, rowNum))

        WebUI.delay(1)

        WebUI.click(findTestObject('System Parameter/User Management/User View/9 Edit'))

        WebUI.setText(findTestObject('System Parameter/User Management/User View/1 User ID'), findTestData('System Parameter/User View').getValue(
                2, rowNum))

        WebUI.setText(findTestObject('System Parameter/User Management/User View/2 Username'), findTestData('System Parameter/User View').getValue(
                3, rowNum))

        WebUI.setText(findTestObject('System Parameter/User Management/User View/3 Role'), findTestData('System Parameter/User View').getValue(
                4, rowNum))

        WebUI.setText(findTestObject('System Parameter/User Management/User View/4 Group Menu'), findTestData('System Parameter/User View').getValue(
                5, rowNum))

        WebUI.setText(findTestObject('System Parameter/User Management/User View/5 Password'), findTestData('System Parameter/User View').getValue(
                6, rowNum))

        WebUI.setText(findTestObject('System Parameter/User Management/User View/6 RePassword'), findTestData('System Parameter/User View').getValue(
                7, rowNum))

        WebUI.setText(findTestObject('System Parameter/User Management/User View/7 Email Address'), findTestData('System Parameter/User View').getValue(
                8, rowNum))

        WebUI.click(findTestObject('System Parameter/User Management/User View/999 save'))

        WebUI.click(findTestObject('All/confirm'))
    }
    
    if (findTestData('System Parameter/User View').getValue(1, rowNum) == 'Delete') {
        WebUI.setText(findTestObject('System Parameter/User Management/User View/8 Filter'), findTestData('System Parameter/User View').getValue(
                2, rowNum))

        WebUI.delay(2)

        WebUI.click(findTestObject('System Parameter/User Management/User View/10 delete'))

        WebUI.click(findTestObject('All/delete 2'))

        WebUI.click(findTestObject('All/confirm'))
    }
}

