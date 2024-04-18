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
	//	driver.get("http://adbc4806fc81c4f3a980a0aedb189b77-2042542790.us-east-1.elb.amazonaws.com/#/");
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		Thread.sleep(600);

		}
	
	
	public void enter_username() throws InterruptedException {
	   
		//driver.findElement(By.xpath("/html/body/app-root/body/app-sign-in/div/form/div/div/div[2]/div/div[1]/div/input")).sendKeys("alok@gmail.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

	}
	
    public void Enter_Password()throws InterruptedException {
     //	driver.findElement(By.xpath("/html/body/app-root/body/app-sign-in/div/form/div/div/div[2]/div/div[2]/div/input")).sendKeys("aaaaaa");
    	
    	driver.findElement(By.id("password")).sendKeys("secret_sauce");	
	}
	
	public void click_on_login_button()throws InterruptedException {
		//driver.findElement(By.xpath("/html/body/app-root/body/app-sign-in/div/form/div/div/div[2]/div/div[4]/button")).click();
		
		driver.findElement(By.id("login-button")).click();
	}
 
	public void click_on_add_to_cart_button() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	}
	
//	public void click_on_Remove_button() throws InterruptedException {
//		Thread.sleep(900);
//		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
//	}
	
	public void click_on_cart_button() {
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).click();
		
	}
	
	public void click_on_Checkout_button() throws InterruptedException {
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(900);
		driver.close();
	}
	
}



