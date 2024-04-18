package StepDefinition;

import org.openqa.selenium.WebDriver;

import Page.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class login {
	
	
 loginpage L =new loginpage();
 
 public static WebDriver driver; 
	
	@Given("I Open the Chrome Browser")
	public void i_open_the_chrome_browser() throws InterruptedException {
    L.i_open_the_chrome_browser();
	}
	

	@Given ("Enter Username")
	public void enter_username() throws InterruptedException {
    L.enter_username();
	}
	
//	@Then ("click on login button")
//	public void Then_click_on_login_button() {
//	L.click_on_login_button();
//	}
//	@Then("I verify the browser is launched successfully")
//	public void i_verify_the_browser_is_launched_successfully() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User go to website")
//	public void user_go_to_website() {
//	  
//	}
//

}
