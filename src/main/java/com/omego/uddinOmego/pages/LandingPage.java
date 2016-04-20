package com.omego.uddinOmego.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.omego.uddinOmego.utilities.BasePage;

public class LandingPage extends BasePage {
	public static WebDriver driver=null;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private String aboutTab="html/body/div[1]/div[1]/div[2]/div[2]/ul/li[1]/a";//"//li[@class='first about']/a";
	private String xpathOfAboutOmgeo="//span[@class='LabelHighlighted'][4]";
	private String textOfAboutOmgeo="Omgeo’s Global Presence";
		
	
	public void clickOnAbouttab(){
		clickOnButton(getXpath(), aboutTab);
	}
	
	public void verifyaboutOmegoPage(){
		String text=driver.findElement(By.xpath(xpathOfAboutOmgeo)).getText();
		System.out.println(text);
		assertValue(textOfAboutOmgeo, text);
    	  	
	}
	
	}	


	
