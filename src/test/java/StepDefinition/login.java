package StepDefinition;

import Page.loginpage;
import io.cucumber.java.en.Given;

public class login {
	
	
 loginpage L =new loginpage();
 
 
	
	@Given("I Open the Chrome Browser")
	public void i_open_the_chrome_browser() throws InterruptedException {
    L.i_open_the_chrome_browser();
	}

	/*@Then("I verify the browser is launched successfully")
	public void i_verify_the_browser_is_launched_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User go to website")
	public void user_go_to_website() {
	  
	}*/


}
