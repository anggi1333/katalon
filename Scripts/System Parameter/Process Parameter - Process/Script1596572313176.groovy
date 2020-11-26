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

WebUI.openBrowser('http://localhost/GoAml/Default.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('All/UserName'), 'sysadmin')

WebUI.setText(findTestObject('All/password'), 'superuser')

WebUI.click(findTestObject('All/Sign In'))

WebUI.setText(findTestObject('All/filter'), 'Task')

WebUI.delay(1)

WebUI.click(findTestObject('All/View'))

WebUI.delay(3)

WebUI.click(findTestObject('All/New Record'))

WebUI.delay(1)

for (def rowNum = 1; rowNum <= findTestData('System Parameter/Process Parameter - Task').getRowNumbers(); rowNum++) {
    WebUI.setText(findTestObject('System Parameter/Process Parameter/Task/01 Task Name'), findTestData('System Parameter/Process Parameter - Task').getValue(
            1, rowNum))

    WebUI.setText(findTestObject('System Parameter/Process Parameter/Task/02 Task Desc'), findTestData('System Parameter/Process Parameter - Task').getValue(
            2, rowNum))
}

for (def rowNum = 1; rowNum <= findTestData('System Parameter/Process Parameter - Task').getRowNumbers(); rowNum++) {
    if (findTestData('System Parameter/Process Parameter - Task').getValue(3, rowNum) == 'true') {
        WebUI.click(findTestObject('System Parameter/Process Parameter/Task/03 Add New Detail'))
    }
    
    WebUI.click(findTestObject('System Parameter/Process Parameter/Task/04 Task Detail Type'))

    WebUI.delay(2)

    if (findTestData('System Parameter/Process Parameter - Task').getValue(4, rowNum) == 'SSIS') {
        WebUI.delay(2)

        WebUI.click(findTestObject('System Parameter/Process Parameter/Task/04 SSIS'))

        WebUI.delay(2)

        if (findTestData('System Parameter/Process Parameter - Task').getValue(5, rowNum) == 'A') {
            WebUI.uploadFile(findTestObject('System Parameter/Process Parameter/Task/05 Upload'), 'D:\\Test Upload\\A.dtsx')
        }
        
        if (findTestData('System Parameter/Process Parameter - Task').getValue(5, rowNum) == 'B') {
            WebUI.uploadFile(findTestObject('System Parameter/Process Parameter/Task/05 Upload'), 'D:\\Test Upload\\B.dtsx')
        }
        
        if (findTestData('System Parameter/Process Parameter - Task').getValue(5, rowNum) == 'C') {
            WebUI.uploadFile(findTestObject('System Parameter/Process Parameter/Task/05 Upload'), 'D:\\Test Upload\\C.dtsx')
        }
        
        if (findTestData('System Parameter/Process Parameter - Task').getValue(5, rowNum) == 'D') {
            WebUI.uploadFile(findTestObject('System Parameter/Process Parameter/Task/05 Upload'), 'D:\\Test Upload\\D.dtsx')
        }
        
        WebUI.click(findTestObject('System Parameter/Process Parameter/Task/07 Save'))
    }
    
    if (findTestData('System Parameter/Process Parameter - Task').getValue(4, rowNum) == 'Store Procedure') {
        WebUI.delay(2)

        WebUI.click(findTestObject('System Parameter/Process Parameter/Task/04 Store Procedure'))
    }
    
    if (findTestData('System Parameter/Process Parameter - Task').getValue(4, rowNum) == 'SSIS in SQL Agent') {
        WebUI.delay(2)

        WebUI.click(findTestObject('System Parameter/Process Parameter/Task/04 SSIS in SQL Agent'))
    }
    
    if (findTestData('System Parameter/Process Parameter - Task').getValue(4, rowNum) == 'API') {
        WebUI.delay(2)

        WebUI.click(findTestObject('System Parameter/Process Parameter/Task/04 API'))
    }
}

