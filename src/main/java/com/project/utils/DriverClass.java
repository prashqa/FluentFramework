package com.project.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverClass {

	private static WebDriver driver;
	private static WebDriverWait wait;
	
	private DriverClass(){
        // prevent instantiation
    }
	
	//need to add waits
	
	public static WebDriver getChromeDriver() {
		if(driver == null){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		}
		return driver;
	}
	
	public static WebDriver getFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		return driver;
	}
	
	public static WebDriverWait getExplicitwait() {
		if(wait == null){
            wait = new WebDriverWait(getChromeDriver(), 10);
        }
        return wait;
		
	}

}
