package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static com.project.utils.DriverClass.getChromeDriver;
import static com.project.utils.Common.*;
import org.testng.*;

public class SearchResultsPage {
	
	WebDriver driver = getChromeDriver();
	
	@FindBy(css="strong.fare")
	private WebElement fare;
	
	@FindBy(className="shop-cart-toggle button tertiary")
	private WebElement detailsButton;
	
	@FindBy(css="[class='btn full-width btn-primary'] span")
	//@FindBy(xpath="//*[@class='btn full-width btn-primary']/span")
	private WebElement continueButton;
	
	@FindBy(css="[class='primary continue-btn'")
	private WebElement continueAsAnonymous;
	
	public SearchResultsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public static SearchResultsPage getSearchResultsPage() {
		return new SearchResultsPage();
	}
	
	public void verifySearchResults() {
		
		Assert.assertTrue(fare.isDisplayed());
//		Assert.assertTrue(detailsButton.isDisplayed());
		scrollToElement(continueButton);
		continueButton.click();		
		waitUntilElementIsClickable(continueAsAnonymous);
		scrollToElement(continueAsAnonymous);
		continueAsAnonymous.click();
		
	}

}
