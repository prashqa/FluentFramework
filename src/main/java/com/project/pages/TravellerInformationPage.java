package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.project.utils.DriverClass.getChromeDriver;
import static com.project.utils.Common.*;
import static com.project.utils.Utilities.*;


public class TravellerInformationPage {
	
	WebDriver driver = getChromeDriver();
	
	@FindBy(id="firstName0")
	private WebElement firstName;
	
	@FindBy(id="lastName0")
	private WebElement lastName;
	
	@FindBy(id="travellerTitle0")
	private WebElement travellerTitle;
	
	@FindBy(id="email")
	private WebElement email;
	
	public TravellerInformationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public static TravellerInformationPage getTravellerInformationPage() {
		return new TravellerInformationPage();
	}
	
	public TravellerInformationPage enterName() {
		firstName.sendKeys(generateFirstName());
		lastName.sendKeys(generateLastName());		
		return this;		
	}
	
	public TravellerInformationPage enterEmail() {	
		email.sendKeys(generateEmail());		
		return this;
	}
	
	public TravellerInformationPage enterTitle(Title title) {
		selectFromDropDown(travellerTitle).selectByValue(title.toString());	
		return this;
	}
}
