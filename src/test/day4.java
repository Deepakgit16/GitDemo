package test;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class day4 {
	
	
	
	@Test
	public void WebLoginHomeLoan() {
		//selenium
		System.out.println("WebLoginHome");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan() {
		//Appium
		System.out.println("MobileLoginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan() {
		//RestAPI automation
		System.out.println("APILoginHome");
	}
}
