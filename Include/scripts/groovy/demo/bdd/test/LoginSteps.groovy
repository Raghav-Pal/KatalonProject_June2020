package demo.bdd.test

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class LoginSteps {


	@Given("user is on login page")
	public void user_is_on_login_page() {

		println " I am inside GIVEN step"
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
	}

	@When("user enters (.*) and (.*)")
	public void user_enters_username_and_password(String username, String password) {

		println " I am inside WHEN step"
		WebUI.setText(findTestObject('Page_OrangeHRM/input_LOGIN Panel_txtUsername (1)'), username)
		WebUI.setText(findTestObject('Page_OrangeHRM/input_Username_txtPassword (1)'), password)
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {

		println " I am inside AND step"
		WebUI.click(findTestObject('Page_OrangeHRM/input_Password_Submit (1)'))
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {

		println " I am inside THEN step"
		WebUI.verifyTextPresent('Welcome Admin', false, FailureHandling.OPTIONAL)
		WebUI.closeBrowser()
	}
}
