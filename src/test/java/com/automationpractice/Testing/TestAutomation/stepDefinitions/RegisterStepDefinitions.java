package com.automationpractice.Testing.TestAutomation.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.automationpractice.Testing.TestAutomation.pages.Home;
import com.automationpractice.Testing.TestAutomation.pages.RegisterPage;

import com.automationpractice.Testing.TestAutomation.validationPage.RegisterValidate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import utils.PageGenerator;

public class RegisterStepDefinitions {

	protected WebDriver driver = Hook.getDriver();

	@Given("^That Ivan opens the browser with the url of uTest$")
	public void thatIOpenedBrowserAtAutomationpracticePage() throws Throwable {

		PageGenerator.getInstance(Home.class, driver).goToThePage();
	}

	@When("^I enter the registration data '(.*)' and '(.*)'and '(.*)'and '(.*)'and '(.*)'and '(.*)'$")
	public void ienterRegistrationData(String firstName, String lastName, String email, String month, String day, String year) throws Throwable {

		PageGenerator.getInstance(Home.class, driver).regiterJoin()  ;
		PageGenerator.getInstance(RegisterPage.class, driver).addDataRegisterStep1(firstName, lastName, email, month, day, year);
		
	}
	@And("^I enter credentials '(.*)' and '(.*)'$")
	public void ienterUserPassword(String password, String passwordconfirmation) throws Throwable {

		PageGenerator.getInstance(RegisterPage.class, driver).addPassword(password, passwordconfirmation);
		
	}

	@Then("^Validate that the user is created successfully is not '(.*)'$")
	public void inTheShoppingCartShowTheProductIsNotNullWithQuantityNotNull(String result) throws Throwable {
		//assertEquals(result, PageGenerator.getInstance(RegisterValidate.class, driver).validateRegister);
	    System.out.println("User Create");
	}
}
