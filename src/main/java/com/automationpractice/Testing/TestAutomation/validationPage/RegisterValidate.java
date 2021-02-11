package com.automationpractice.Testing.TestAutomation.validationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.Testing.TestAutomation.pages.BasePage;

public class RegisterValidate extends BasePage {

	@FindBy(xpath = "//h1")
	private WebElement userCreate;

	public RegisterValidate(WebDriver driver) {
		super(driver);
	}

	public String validateRegister() {
		return exists(userCreate);
	}

}
