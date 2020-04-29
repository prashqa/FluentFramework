package com.project.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static com.project.utils.DriverClass.getChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
	
	WebDriver driver;
	
@BeforeSuite
public void openBrowser() {
	driver = getChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
}

@BeforeMethod
public void goToHomePage() {
	driver.navigate().to("https://www.flyswoop.com");
}

@AfterSuite(alwaysRun=true)
public void closeBrowser() throws InterruptedException {
	Thread.sleep(5000);
	driver.close();
}

}
