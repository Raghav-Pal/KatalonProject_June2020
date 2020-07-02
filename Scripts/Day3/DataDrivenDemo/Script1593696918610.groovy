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
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

//TestDataFactory.findTestData("Data Files/LoginData").get

WebUI.navigateToUrl('https://orangehrm-demo-6x.orangehrmlive.com/auth/login')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_OrangeHRM 65101         2005 - 2020 Ora_d64d2b'))

WebUI.setText(findTestObject('Page_OrangeHRM/input_OrangeHRM Demo_txtUsername'), username)

WebUI.setText(findTestObject('Page_OrangeHRM/input_OrangeHRM Demo_txtPassword'), password)

WebUI.click(findTestObject('Page_OrangeHRM/input_OrangeHRM Demo_Submit'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_keyboard_arrow_down'))

WebUI.click(findTestObject('Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

