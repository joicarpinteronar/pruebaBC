package com.automationpractice.Testing.TestAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.StaticWait;

public class RegisterPage extends BasePage {

	@FindBy(id = "firstName")
	private WebElement txtFirstName;

	@FindBy(id = "lastName")
	private WebElement txtLastName;

	@FindBy(id = "email")
	private WebElement txtEmail;
	By cbxMonth = By.id("birthMonth");
	By cbxDay = By.id("birthDay");
	By cbxYear = By.id("birthYear");
	
	@FindBy(id = "password")
	private WebElement txtPassword;
	@FindBy(id = "confirmPassword")
	private WebElement txtPasswordConfirmation;
	@FindBy(xpath = "//div[5]/label/span")
	private WebElement chkTermsUse;
	@FindBy(xpath = "//div[6]/label/span")
	private WebElement chkPrivacySecurity;
	
	
	@FindBy(xpath = "//a/span")
	private WebElement btnNext;
	@FindBy(xpath = "//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a")
	private WebElement btnNextStep;

	public RegisterPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void addDataRegisterStep1(String firstName, String lastName, String email, String month, String day, String year) {
		waitVisibility(txtFirstName);
		writeText(txtFirstName, firstName);
		
		waitVisibility(txtLastName);
		writeText(txtLastName, lastName);
		waitVisibility(txtEmail);
		writeText(txtEmail, email);
		Select unoSel = new Select(driver.findElement(cbxMonth));
    	unoSel.selectByVisibleText(month);
    	Select unoSel1 = new Select(driver.findElement(cbxDay));
    	unoSel1.selectByVisibleText( day);
    	Select unoSel2 = new Select(driver.findElement(cbxYear));
    	unoSel2.selectByVisibleText(year);
		waitVisibility(btnNext);
		click(btnNext);
		StaticWait.WaitForSeconds(2);
		waitVisibility(btnNext);
		click(btnNext);
		StaticWait.WaitForSeconds(2);
		waitVisibility(btnNext);
		click(btnNext);
		StaticWait.WaitForSeconds(2);
		waitVisibility(btnNext);
		click(btnNext);
		StaticWait.WaitForSeconds(2);
		
	}
	
	public void addPassword(String password, String passwordconfirmation) {
		waitVisibility(txtPassword);
		writeText(txtPassword,  password);
		waitVisibility(txtPasswordConfirmation);
		writeText(txtPasswordConfirmation, passwordconfirmation);
		
		waitVisibility(chkTermsUse);
		click(chkTermsUse);
		StaticWait.WaitForSeconds(2);
		waitVisibility(chkPrivacySecurity);
		click(chkPrivacySecurity);
		StaticWait.WaitForSeconds(2);
		waitVisibility(btnNext);
		click(btnNext);
		StaticWait.WaitForSeconds(2);
		
	}

}
