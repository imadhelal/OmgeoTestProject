package com.omego.uddinOmego.testCases;

import org.testng.annotations.Test;

import com.omego.uddinOmego.utilities.OmegoDriver;

public class Ts001_Tc002_VerifyNavigateOmgeoAlertPage extends OmegoDriver {
	@Test
	public void verifyNavigateToOmegoAlert(){
		alertPage().selectAlertFromDd();
		alertPage().alertPageVerify();
		//driver.navigate().back();
		
	}

}
