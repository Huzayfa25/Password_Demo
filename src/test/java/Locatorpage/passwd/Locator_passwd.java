package Locatorpage.passwd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utility.passwd.TestBase_Passwd;

public class Locator_passwd extends TestBase_Passwd  {
	
	
public Locator_passwd() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH, using="//input[@value=\"DEFAULT\"]")
	public WebElement ClickDefault;
	
	
	@FindBy(how=How.XPATH, using="//input[@id=\"generate_password_btn\"]")
	public WebElement  ClickGeneratePassword;
	
	@FindBy(how=How.XPATH, using="//textarea[@id=\"generated_password\"]")
	public WebElement VerifyPasswordDisplayed;
	
	@FindBy(how=How.XPATH, using="//img[@id=\"section_words_icon\"]")
	public WebElement ExpandtheWORDS;
	
	@FindBy(how=How.XPATH, using="//select[@id=\"num_words\"]")
	public WebElement SelectNumberofWords ;
	
	@FindBy(how=How.XPATH, using="//select[@id=\"word_length_min\"]")
	public WebElement SelectMinimumLength;
	
	@FindBy(how=How.XPATH, using="//select[@id=\"word_length_max\"]")
	public WebElement SelectMaximumLength;
	
	@FindBy(how=How.XPATH, using="//img[@id=\"section_transformations_icon\"]")
	public WebElement ExpandTRANSFORMATIONSButton;

	@FindBy(how=How.XPATH, using="//select[@id=\"case_transform\"]")
	public WebElement SelectCaseTransformation;

	@FindBy(how=How.XPATH, using="//img[@id=\"section_separator_icon\"]")
	public WebElement  ExpandSEPARATORButton ;
;

	@FindBy(how=How.XPATH, using="//select[@id=\"separator_type\"]")
	public WebElement SelectSpecifiedCharacter  ;

	@FindBy(how=How.XPATH, using="//input[@id=\"separator_type_char_tb\"]")
	public WebElement typeinthecharacter ;

	@FindBy(how=How.XPATH, using="//input[@id=\"generate_password_btn\"]")
	public WebElement PasswordsGenerate;

}
