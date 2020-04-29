package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.project.utils.DriverClass.getChromeDriver;
import static com.project.utils.Common.*;

public class HomePage {
	
	WebDriver driver = getChromeDriver();
	
	@FindBy(id="origin-event")
	private WebElement origin;
	
	@FindBy(css="[id='origin-picker'] [data-code='YEG']")
	private WebElement originLocation;
	
	@FindBy(id="destination-event")
	private WebElement destination;
	
	@FindBy(css="[id='destination-picker'] [data-code='YHM']")
	private WebElement destinationLocation;
	
	@FindBy(id="depart-date")
	private WebElement departure;
	
	@FindBy(xpath="(//*[@data-full='2020-4-7'])[2]")
	private WebElement departureDate;
	
	@FindBy(xpath="(//*[@value='Search'])[1]")
	private WebElement submitSearch;
	
	public HomePage() {     
       PageFactory.initElements(driver, this);
	}	
	
	public static HomePage getHomePage() {
		return new HomePage();
	}
	
	public HomePage enterOrigin() {
		origin.click();		
		scrollToElement(originLocation);
		originLocation.click();
		return this;
	}
	
	public HomePage enterDestination() {
		destination.click();		
		scrollToElement(destinationLocation);
		destinationLocation.click();
		return this;
	}
	
	
	public HomePage enterDate() {		
		departure.click();
		departureDate.click();
		return this;
	}
	
	public HomePage submit() {
		submitSearch.click();
		return this;
	}
	

}
