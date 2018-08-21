package automationtTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	
	
	public WebDriver driver;
	
	
	  @BeforeTest
	  public void f() {	  
	 	  System.out.println("launching firefox browser"); 
	  	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");

	  }
	  
	  @AfterMethod
	  
	  public void AfterTest()
	  {
		  
		  System.out.println("---------aferMethod ran each test---------");
	  }
}
