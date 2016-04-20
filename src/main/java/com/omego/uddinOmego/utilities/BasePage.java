package com.omego.uddinOmego.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.base.Function;

public class BasePage extends OmegoDriver {
	

	private final static String xpath="xpath";
	private final static String id ="id";
	private final static String cssSelector="css";
	private final static String name="name";
	public static FluentWait<WebDriver> wait = null;
	public static Function<WebDriver, WebElement> fwait = null;
		
	public static String getXpath() {
		return xpath;
	}
	
	public static String getID(){
		return id;
	}
		
	public static String getCssSelector(){
		return cssSelector;
	}
	
	public static String getName(){
		return name;
	}
	//click on button
	public void clickOnButton(String locator, String attributeLocator){
		try{
			WebElement ele= getElement(locator, attributeLocator);
			ele.click();
		} catch (NoSuchElementException e){
			e.printStackTrace();
			Reporter.log("No Such Element Found Exception Occured on: "
			+locator +"  " +attributeLocator);
		}
	}
	//Enter data into text field
		public void enterDataIntoTextField(String locator, String attributeLocator,
				String value){
			WebElement ele= getElement(locator, attributeLocator);
			ele.sendKeys(value);
						
			}
		
		// This method is use assert value from web Page
		public  void assertValue (String expected, String[] headerListOfAboutOmego) {
			Assert.assertEquals(expected, headerListOfAboutOmego);
		}

		public void assertValue(String expected, String actualResult) {
			Assert.assertEquals(expected, actualResult);
		}

		public void assertValue(boolean expected, String actualResult) {
			Assert.assertEquals(expected, actualResult);
		}
		public void assertValue(boolean expected) {
			Assert.assertTrue(expected);
		}
		public void assertValue(int expected, int actualResult) {
			Assert.assertEquals(expected, actualResult);
		}
		
		//To handle drop down
		public void selectDropDown (String locator, String attributeLocator,
				 String value){
			     WebElement ele = getElement(locator, attributeLocator);
			     Select dropDown = new Select(ele);
			     dropDown.selectByVisibleText(value);
			     //dropDown.selectByIndex(value);
		         }
		//handle explicit synchronization 
		public void expectedCondition(By locator){
			WebDriverWait expectedWaits = new WebDriverWait(driver, 30);
			expectedWaits.pollingEvery(2, TimeUnit.SECONDS);
			expectedWaits.until(ExpectedConditions.visibilityOfElementLocated(locator));

			
		}
		
	

}


		
