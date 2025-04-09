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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Scenario1_RegisterAndLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/customer/account/login/')

WebUI.setText(findTestObject('LoginPage/input_Email'), GlobalVariable.dynamicEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/InputPassword'), '4yGpCGFCzLQzDKd7wRNdnQ==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.click(findTestObject('HomePage/Men'))

WebUI.doubleClick(findTestObject('HomePage/MenSection/Jackets'))

WebUI.click(findTestObject('HomePage/MenSection/SecondJacketInList'))

WebUI.click(findTestObject('ProductPage/Size'))

WebUI.click(findTestObject('ProductPage/Color'))

WebUI.click(findTestObject('ProductPage/AddtoCart'))

WebUI.verifyElementVisible(findTestObject('ProductPage/SuccessMessage'), FailureHandling.STOP_ON_FAILURE)

