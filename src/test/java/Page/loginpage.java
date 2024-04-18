package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpage {
	public static WebDriver driver; 
	
	
	public void i_open_the_chrome_browser() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new EdgeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		Thread.sleep(600);

		}
	
	
	public void enter_username() throws InterruptedException {
	   
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

	}
//	
//	public void Enter_Password() {
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");	
//	}
//	
//	public void click_on_login_button() {
//		driver.findElement(By.id("login-button")).click();
//	}
//	
//	
}



