package com.project.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static com.project.utils.DriverClass.getChromeDriver;
import static com.project.utils.DriverClass.getExplicitwait;

public class Common {

	static WebDriver driver = getChromeDriver();
	
	public static void waitUntilElementIsClickable(WebElement element) {
		getExplicitwait().until(ExpectedConditions.elementToBeClickable(element));		
	}
	
	public static void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static Select selectFromDropDown(WebElement element) {
		Select dropdown = new Select(element);
		return dropdown;
	}
}
