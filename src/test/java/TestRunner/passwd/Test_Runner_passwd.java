package TestRunner.passwd;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



import Utility.passwd.TestBase_Passwd;


@io.cucumber.testng.CucumberOptions(features = {"src/test/resources/Features"} , 
plugin = {"json:target/cucumber.json"},
glue = "Stepdefi.passwd")
public class Test_Runner_passwd extends io.cucumber.testng.AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void settingup() {
		
		TestBase_Passwd testing = new TestBase_Passwd();
		testing.initil();

		
		
	}

	@AfterTest
	public void CloseDown() {
		TestBase_Passwd testing = new TestBase_Passwd();
		testing.driver.quit();
		
	}
		
		
		
		
	}



