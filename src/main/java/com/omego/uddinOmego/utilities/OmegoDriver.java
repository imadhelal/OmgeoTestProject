package com.omego.uddinOmego.utilities;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;




import com.omego.uddinOmego.pages.AlertPage;
import com.omego.uddinOmego.pages.LandingPage;
import com.omego.uddinOmego.pages.LeadershipTeamPage;

public class OmegoDriver {

	public static WebDriver driver =null;
	public static String url="https://www.omgeo.com";
	
	
	
	@BeforeSuite
	    public void setUp() {
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	
	@AfterSuite
	public void tearDown(){
	driver.close();
	}
  
	
	public static WebElement getElement(String locator, String attributeOfLocator){
		if(locator.equalsIgnoreCase("id")){
			return driver.findElement(By.id(attributeOfLocator));
		}else if(locator.equalsIgnoreCase("className")){
			return driver.findElement(By.className(attributeOfLocator));
		}else if(locator.equalsIgnoreCase("name")){
			return driver.findElement(By.name(attributeOfLocator));
		}else if(locator.equalsIgnoreCase("xpath")){
			return driver.findElement(By.xpath(attributeOfLocator));
		}else if(locator.equalsIgnoreCase("css")){
			return driver.findElement(By.cssSelector(attributeOfLocator));
		}else
			throw new NoSuchElementException("No Such Element" + attributeOfLocator);
	}
	
	//Object for home page
	public LandingPage landingPage(){
		LandingPage landPage= new LandingPage(driver);
		return landPage;
	}
	//Object for alert page
	public AlertPage alertPage(){
		AlertPage altp= new AlertPage(driver);
		return altp;
	}
	//Object for leadership Team page
	public LeadershipTeamPage leadershipTeam(){
		LeadershipTeamPage ltp= new LeadershipTeamPage(driver);
		return ltp;
	}
	

}

