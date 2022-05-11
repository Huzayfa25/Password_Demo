package Actionpage.passwd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Locatorpage.passwd.Locator_passwd;
import Utility.passwd.TestBase_Passwd;
import Utility.passwd.Util_Passwd;

public class Action_passwd extends TestBase_Passwd {
	

	Locator_passwd LocatorPass = new Locator_passwd();
	
	
	public void ClickonDefaultbutton () {
		
		LocatorPass.ClickDefault.click();
		
	}
	
	public void ClickonGenerate3Passwordsbutton  () {
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");

		
		LocatorPass.ClickGeneratePassword.click();
		
		
	}

	public void VerifyPasswordisdisplayed () throws Exception {
		
	boolean VerifyDisplay = 	LocatorPass.VerifyPasswordDisplayed.isDisplayed();
	
	Assert.assertTrue(VerifyDisplay);
	Thread.sleep(5000);
	
	Util_Passwd.takescreenshot(driver, "generate3password");
	}
	
	public void ExpandtheWORDSButton () throws Exception {
		
		LocatorPass.ExpandtheWORDS.click();
		Thread.sleep(2000);
	}
	
	public void SelectNumberofWords  () throws Exception {
		
		LocatorPass.SelectNumberofWords.click();
		
	Select DropDownDemo = new Select(driver.findElement(By.id("num_words")));
		
	DropDownDemo.selectByValue("2");
		
	Thread.sleep(2000);
	
	}
	
	public void SelectMinimumLength () throws Exception {
		
		LocatorPass.SelectMinimumLength.click();
		
		Select DropDownDemo = new Select(driver.findElement(By.id("word_length_min")));
		
		DropDownDemo.selectByValue("4");
		
		Thread.sleep(2000);
		
	}
	
	public void SelectMaximumLength () {
		
		LocatorPass.SelectMaximumLength.click();
		
	Select DropDownDemo = new Select(driver.findElement(By.id("word_length_max")));
		
		DropDownDemo.selectByValue("5");
		
	}
	
	public void ExpandTRANSFORMATIONSButton () {
		
		LocatorPass.ExpandTRANSFORMATIONSButton.click();
		
	}
	
	public void SelectCaseTransformation () throws Exception {
		
		LocatorPass.SelectCaseTransformation.click();
		
Select DropDownDemo = new Select(driver.findElement(By.id("case_transform")));
		
		DropDownDemo.selectByIndex(5);
		
		
		Thread.sleep(5000);
		
	}
	
	public void ExpandSEPARATORButton () {
		
		LocatorPass.ExpandSEPARATORButton.click();
		
	}
	
	public void SelectSpecifiedCharacter () throws Exception {
		
		LocatorPass.SelectSpecifiedCharacter.click();
		
Select DropDownDemo = new Select(driver.findElement(By.id("separator_type")));
		
		DropDownDemo.selectByIndex(1);
		
		Thread.sleep(5000);
		
		
	}
	
	public void typeinthecharacter () throws Exception {
		
		LocatorPass.typeinthecharacter.clear();
		
		LocatorPass.typeinthecharacter.sendKeys("@");
		
		Thread.sleep(5000);
		
		Util_Passwd.takescreenshot(driver, "type_character");
	}
	
	public void PasswordsGenerate () throws Exception {
		
		LocatorPass.PasswordsGenerate.click();
		
		Thread.sleep(5000);
		
		Util_Passwd.takescreenshot(driver, "password_generate");
		
	}
	
}
