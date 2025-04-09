import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/customer/account/login')

WebUI.setText(findTestObject('LoginPage/input_Email'), 'Waliullah@gmail.com')

WebUI.setEncryptedText(findTestObject('LoginPage/InputPassword'), '4yGpCGFCzLQzDKd7wRNdnQ==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.setText(findTestObject('HomePage/SearchBox'), 'Nike')

WebUI.sendKeys(findTestObject('HomePage/SearchBox'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('SearchPage/SearchResultHeader'), 10)

WebUI.verifyTextPresent('Nike', true)

WebUI.closeBrowser()

