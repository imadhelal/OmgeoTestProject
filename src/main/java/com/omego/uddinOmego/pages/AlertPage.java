package com.omego.uddinOmego.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.omego.uddinOmego.utilities.BasePage;

public class AlertPage extends BasePage {
	WebDriver driver=null; 
public AlertPage(WebDriver driver) {
		this.driver=driver;
	}
	private String alertPage="//span[@class='Label']";
	private String alertTex= "ALERT 5.0 Is Here!";
	private String dropdownFindProduct="//a[@class='chzn-single']/span";	
	private String alert="//ul[@class='chzn-results']/li[2]";
	
	


	public void selectAlertFromDd(){
		//expectedCondition(By.xpath(dropdownFindProduct));
	    //selectDropDown(getXpath(), dropdownFindProduct,"ALERT"); 
		Actions act= new Actions(driver);
		WebElement parentmanue=driver.findElement(By.xpath(dropdownFindProduct));
		WebElement chieldmanue=driver.findElement(By.xpath(alert));
		act.moveToElement(parentmanue).click().perform();
		act.moveToElement(chieldmanue).click().perform();
	}
	
	
	public void alertPageVerify(){
		String text=driver.findElement(By.xpath(alertPage)).getText();
		assertValue(alertTex, text);
		System.out.println(text);
	}

}
