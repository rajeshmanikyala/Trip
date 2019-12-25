package com.trip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

	WebDriver ldriver;
	WebDriverWait wait= new WebDriverWait(ldriver, 120);
	Actions a = new Actions(ldriver);
	public SearchPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[@class='brand-global-nav-action-search-Search__label--3PRUD']") WebElement searchbox;
	@FindBy(xpath="//input[@id='mainSearch']") WebElement dataSent;
	@FindBy(xpath="//div[@class='inner']") WebElement gobutton;
	@FindBy(xpath="//span[contains(text(),'Club Mahindra Madikeri, Coorg')]") WebElement coorglink;
	@FindBy(xpath="//a[@class='ui_button primary']") WebElement writeReview;
	@FindBy(xpath="//span[@id='bubble_rating']") WebElement hover1;
	public void searchBoxlink(){
	searchbox.click();
		}
	public void searchWord(){
		dataSent.click();
		dataSent.sendKeys("Club Mahindra");
	}
	public void goLink(){
		gobutton.click();
	}
	public void firstLink(){
		coorglink.click();
	}
	public void reviewLink(){
		writeReview.click();
	}
	public void mainHover(){
		a.moveToElement(hover1, 50, 0).click().build().perform();
	}
}
