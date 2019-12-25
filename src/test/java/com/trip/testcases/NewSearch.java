package com.trip.testcases;

import java.util.Set;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewSearch extends TestBase {

	@Test
	public void launchTest() throws InterruptedException {

		Actions a = new Actions(driver);
		WebElement search1 = driver
				.findElement(By.xpath("//span[@class='brand-global-nav-action-search-Search__label--3PRUD']"));
		search1.click();
		driver.findElement(By.xpath("//input[@id='mainSearch']")).sendKeys("club Mahindra");
		driver.findElement(By.xpath("//div[@class='inner']")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//span[contains(text(),'Club Mahindra Madikeri, Coorg')]")).click();
		// Window handling
		Set<String> Allwindows = driver.getWindowHandles();
		for (String i : Allwindows) {
			String titles = driver.switchTo().window(i).getTitle();
			System.out.println(titles);
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='ui_button primary']")));
		} catch (Exception e) {
			System.out.println("Clickable Exception");
		}
		driver.findElement(By.xpath("//a[@class='ui_button primary']")).click();
		// Window Handling
		Set<String> Allwindows1 = driver.getWindowHandles();
		for (String j : Allwindows1) {
			String titles1 = driver.switchTo().window(j).getTitle();
			System.out.println(titles1);
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='bubble_rating']")));
		} catch (Exception e) {
			System.out.println("Clickable Exception");
		}
		WebElement element = driver.findElement(By.xpath("//span[@id='bubble_rating']"));
		a.moveToElement(element, 50, 0).click().build().perform();
		driver.findElement(By.id("ReviewTitle")).sendKeys("New title");
		driver.findElement(By.xpath("//textarea[@id='ReviewText']")).sendKeys(
				"I had visited this place with my family for a holiday. Overall had a good experience. The rooms were clean. The food and dining experience was excellent. Esepecially, the staff were very helpful. There was a chef named Durga who helped me with meal preferences and there was a lady named Shrestha in the dining area who was particularly polite and helpful. Overall, they ensure a good stay for their guests.");
		driver.findElement(By.xpath("//div[@class='c-cell jfy_cloud tag content category-Business']")).click();
		Select travel = new Select(driver.findElement(By.xpath("//select[@id='trip_date_month_year']")));
		travel.selectByIndex(1);
		WebElement hotel = driver.findElement(By.xpath("//span[@id='qid12_bubbles']"));
		a.moveToElement(hotel, 50, 0).click().build().perform();
		Thread.sleep(1000);
		WebElement element1 = driver.findElement(By.id("noFraud"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebElement second = driver.findElement(By.id("qid190_bubbles"));
		a.moveToElement(second, 50, 0).click().build().perform();
		Thread.sleep(1000);
		WebElement third = driver.findElement(By.xpath("//span[@id='qid14_bubbles']"));
		a.moveToElement(third, 50, 0).click().build().perform();
		Thread.sleep(1000);

		element1.click();
		Thread.sleep(2000);
		if (element1.isEnabled()) {
			System.out.println("It Selected");
		} else {
			System.out.println("Not Selected");
		}

	}

}
