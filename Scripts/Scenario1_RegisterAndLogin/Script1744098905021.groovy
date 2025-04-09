import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

String timestamp = System.currentTimeMillis().toString()

String email = ('waliullah' + timestamp) + '@example.com'

GlobalVariable.dynamicEmail = email

WebUI.openBrowser('')

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('HomePage/CreateAnAccount'))

WebUI.setText(findTestObject('RegisterPage/InputFirstName'), 'Waliullah')

WebUI.setText(findTestObject('RegisterPage/InputLastName'), 'Khan')

WebUI.setText(findTestObject('RegisterPage/InputEmail'), email)

WebUI.setEncryptedText(findTestObject('RegisterPage/InputPassword'), '4yGpCGFCzLQzDKd7wRNdnQ==')

WebUI.setEncryptedText(findTestObject('RegisterPage/InputConfirmPassword'), '4yGpCGFCzLQzDKd7wRNdnQ==')

WebUI.click(findTestObject('RegisterPage/Btn_createAnAccount'))

WebUI.verifyTextPresent('Thank you for registering with Main Website Store.', false)

WebUI.verifyTextPresent('Waliullah Khan', false)

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/customer/account/logout/')

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/')

//WebUI.click(findTestObject('HomePage/SignIn'))
WebUI.setText(findTestObject('LoginPage/input_Email'), email)

WebUI.setEncryptedText(findTestObject('LoginPage/InputPassword'), '4yGpCGFCzLQzDKd7wRNdnQ==')

TestObject loginButton = new TestObject().addProperty('xpath', ConditionType.EQUALS, '(//button[@type=\'submit\' and .//span[text()=\'Sign In\']])[1]')

WebUI.click(loginButton)

WebUI.verifyTextPresent('Welcome, Waliullah Khan!', false)

WebUI.closeBrowser()

