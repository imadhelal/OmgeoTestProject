package com.omego.uddinOmego.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.omego.uddinOmego.utilities.BasePage;

public class LeadershipTeamPage extends BasePage {
	public static WebDriver driver=null;
	 public LeadershipTeamPage(WebDriver driver) {
			this.driver=driver;
		}
	
	private String xpathOfLeadershipManue="html/body/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li[2]/a";//"//ul[@class='clearfix']/li[2]/a";
    private String xpathForCeo="html/body/div[1]/div[2]/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/span/a";
    private String textFromCEO="President and Chief Executive Officer, Omgeo";
	public void clickOnLeadershipTeam(){
		expectedCondition(By.xpath(xpathOfLeadershipManue));
    	clickOnButton(getXpath(), xpathOfLeadershipManue);
    }
    
    public void clickOnAnExecutive(){
    	clickOnButton(getXpath(), xpathForCeo);
    }

    public void verifyTextSpecificToMember(){
     driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id='simplemodal-data']/iframe")));
		String textCEOFromXpath = driver.findElement(By.xpath("html/body/table/tbody/tr/td/em")).getText();
		System.out.println(textCEOFromXpath);
       assertValue(textFromCEO, textCEOFromXpath); 
    
    }
}
