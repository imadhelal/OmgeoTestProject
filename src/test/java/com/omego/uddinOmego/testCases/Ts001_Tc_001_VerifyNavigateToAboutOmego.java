package com.omego.uddinOmego.testCases;

import org.testng.annotations.Test;

import com.omego.uddinOmego.utilities.OmegoDriver;

public class Ts001_Tc_001_VerifyNavigateToAboutOmego extends OmegoDriver {
	
	@Test
	public void verifyNavigateToAboutOmeg(){
		landingPage().clickOnAbouttab();
		landingPage().verifyaboutOmegoPage();
		
	}
	
	

}
