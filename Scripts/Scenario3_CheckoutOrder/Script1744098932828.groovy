import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

// Call previous scenario to register, login and add jacket to cart
WebUI.callTestCase(findTestCase('Scenario2_AddJacketToCart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('HomePage/Cart'))

WebUI.click(findTestObject('ProductPage/ProceedToCheckout'))

WebUI.setText(findTestObject('ProductPage/Company'), 'Edible Arrangements')

WebUI.setText(findTestObject('ProductPage/StreetAddress'), '123 Test Street')

WebUI.setText(findTestObject('ProductPage/City'), 'Karachi')

WebUI.setText(findTestObject('ProductPage/Zipcode'), '74000')

WebUI.click(findTestObject('ProductPage/SelectCountry'))

WebUI.click(findTestObject('ProductPage/OptionCountry'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ProductPage/PhoneNumber'), '03001234567')

WebUI.click(findTestObject('ProductPage/ShippingMethod'))

WebUI.click(findTestObject('ProductPage/NextButton'))

WebUI.click(findTestObject('ProductPage/PlaceOrder'))

WebUI.verifyTextPresent('Thank you for your purchase!', false)

WebUI.closeBrowser()

