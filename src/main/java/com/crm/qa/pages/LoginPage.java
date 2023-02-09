package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{	
	//Page Factory - OR:
	
	private By loginButton1= By.xpath("//a[contains(text(), 'Log In')]");
	private By email1= By.name("email");
	private By password1= By.name("password");
	private By crmImage1= By.xpath("//a[@class='brand-name']/*[local-name()='svg']/*[local-name()='image']");
	private By loginUser1= By.xpath("//div[contains(text(), 'Login')]");
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
//	WebDriverWait myWait= new WebDriverWait(driver, 10);	
//	private By userName= By.name("username");
	
	public boolean validateCRMImage(){
	return	myWait.until(ExpectedConditions.visibilityOfElementLocated(crmImage1)).isDisplayed();
		//return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd){
		myWait.until(ExpectedConditions.visibilityOfElementLocated(loginButton1)).click();		
		myWait.until(ExpectedConditions.visibilityOfElementLocated(email1)).sendKeys(un);
		myWait.until(ExpectedConditions.visibilityOfElementLocated(password1)).sendKeys(pwd);
		myWait.until(ExpectedConditions.visibilityOfElementLocated(loginUser1)).click();	
		
		//loginBtn.click();
//		    	JavascriptExecutor js = (JavascriptExecutor)driver;
//		    	js.executeScript("arguments[0].click();", loginBtn);		    	
		return new HomePage();
	}
	
}
