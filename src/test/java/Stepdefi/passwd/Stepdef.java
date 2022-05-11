package Stepdefi.passwd;


import Actionpage.passwd.Action_passwd;
import Utility.passwd.TestBase_Passwd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef extends TestBase_Passwd {
	
	Action_passwd HomePageActionPass = new Action_passwd();
	
	
	
		@Given("Launch  {string}")
		public void launch(String URL) {
			
			getURL(URL);
			
			
		 
		}
	
	@When("Click on the Default button")
	public void click_on_the_default_button() {
	 
		HomePageActionPass.ClickonDefaultbutton();
	}

	@When("Click on Generate {int} Passwords button")
	public void click_on_generate_passwords_button(Integer int1) {
	
		HomePageActionPass.ClickonGenerate3Passwordsbutton();
	}

	@Then("Verify Password is displayed")
	public void verify_password_is_displayed() throws Exception {
	   
		HomePageActionPass.VerifyPasswordisdisplayed();
	}

	@When("Expand the WORDS Button")
	public void expand_the_words_button() throws Exception {
	
		HomePageActionPass.ExpandtheWORDSButton();
	}

	@When("Select Number of Words")
	public void select_number_of_words() throws Exception {
	  
		HomePageActionPass.SelectNumberofWords();
	}

	@Then("Select Minimum Length")
	public void select_minimum_length() throws Exception {
		
		HomePageActionPass.SelectMinimumLength();
		
	  
	}

	@Then("Select Maximum Length")
	public void select_maximum_length() {
	  
		HomePageActionPass.SelectMaximumLength();
	}

	@Then("Expand the TRANSFORMATIONS Button")
	public void expand_the_transformations_button() {
		
		HomePageActionPass.ExpandTRANSFORMATIONSButton();
	    
	}

	@Then("Select Case Transformation")
	public void select_case_transformation() throws Exception {
		
		HomePageActionPass.SelectCaseTransformation();
	 
	}

	@Then("Expand the SEPARATOR Button")
	public void expand_the_separator_button() {
		
		HomePageActionPass.ExpandSEPARATORButton();
	    
	}

	@Then("Select Specified Character")
	public void select_specified_character() throws Exception {
		
		HomePageActionPass.SelectSpecifiedCharacter();
	   
	}

	@Then("type @ in the character")
	public void type_in_the_character() throws Exception {
		
		HomePageActionPass.typeinthecharacter();
		
	    
	}

	@Then("Click on Passwords Generate button")
	public void click_on_passwords_generate_button() throws Exception {
		
		HomePageActionPass.PasswordsGenerate();
	    
	}

}

