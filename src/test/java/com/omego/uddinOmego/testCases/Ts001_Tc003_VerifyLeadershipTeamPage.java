package com.omego.uddinOmego.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.omego.uddinOmego.pages.LandingPage;
import com.omego.uddinOmego.utilities.OmegoDriver;

public class Ts001_Tc003_VerifyLeadershipTeamPage extends OmegoDriver {
	
	@Test
	public void verifyLeadershipPage() {
		landingPage().clickOnAbouttab();
		driver.get("https://www.omgeo.com");
		leadershipTeam().clickOnLeadershipTeam();
		leadershipTeam().clickOnAnExecutive();
		
		
					
				}
	

}
