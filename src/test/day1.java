package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterSuite
	public void AfterSuit() {
		System.out.println("AfterSuit");
		System.out.println("GitDemo");
		System.out.println("Deepak ");
		System.out.println("Gitstuff");
		System.out.println();

		System.out.println("change in master");

		System.out.println("change in develop");
		System.out.println("change in develop from gitstuff");

		
	}
	
	@BeforeMethod
	public void BeforMethod() {
		System.out.println("BeforMethod execute before every method in a class scope");
	}
	@BeforeMethod
	public void BeforMethwod() {
		System.out.println("BeforMethodqwqw execute before every method in a class scope");
	}
	
	@AfterMethod
	public void AfteMethod() {
		System.out.println("AfteMethod execute after every method in a class scope");
	}
	
	@AfterTest
	public void lastExecution() {
		System.out.println("lastExecution");
	}
	
	@Test(groups= {"Smoke"})
	public void demo() {
		System.out.println("hello");
	}
	
	@Test
	public void secondTest() {
		System.out.println("bye");
	}
}
