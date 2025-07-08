package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class day3 {

	@BeforeClass
	public void BeforClass() {
		// BeforClass
		System.out.println("BeforClass");
	}

	@AfterClass
	public void AfteClass() {
		// BeforClass
		System.out.println("AfteClass");
	}

	@org.testng.annotations.Parameters({ "URL" }) 
	@Test
	public void parametr(String urlname) {
		
		System.out.println(urlname);
	}
	
	
	@org.testng.annotations.Parameters({ "URL" }) 
	@Test
	public void paraametr(String ulname) {
		
		System.out.println(ulname);
	}

	@Test
	public void WebLoginCarLoan() {
		// selenium
		System.out.println("WebLoginCar");
	}

	@Test
	public void MobileLoginCarLoan() {
		// Appium
		System.out.println("MobileLoginCar");
	}

	@BeforeSuite
	public void BefoeSuit() {
		System.out.println("BefoeSuit");
	}

	@Test(enabled = false)
	public void MobileSigninCarLoan() {
		// Appium
		System.out.println("MobileSigninCar");
	}

	@Test(groups = { "Smoke" })
	public void MobileSignOutCarLoan() {
		// Appium
		System.out.println("MobileSignOutCar");
	}
	
	@Test(dataProvider = "getData")
	public void Mlogin(String un, String pass) {
		// Appium
		System.out.println(un);
		System.out.println(pass);
	}

	@Test(dependsOnMethods = { "MobileLoginCarLoan" })
	public void APICarLoan() {
		// RestAPI automation
		System.out.println("APILoginCar");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] obj = new Object[3][2];
		obj[0][0]="FuN";
		obj[0][1]="Fpass";
		
		obj[1][0]="Sun";
		obj[1][1]="Spass";
		
		obj[2][0]="Tun";
		obj[2][1]="Tpass";
		
		return obj;
		
	}
}
