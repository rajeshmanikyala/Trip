package com.trip.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeClass

	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver2.exe");
		// System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")
		// + "\\drivers\\geckodriver.exe");
		driver = new ChromeDriver();
		// driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);

		driver.get("https://www.tripadvisor.in");
	}

	@AfterClass

	public void tearDown() {
		driver.quit();
	}
}
