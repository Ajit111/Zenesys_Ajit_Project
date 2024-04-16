package Page;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpage {
	
	
	public void i_open_the_chrome_browser() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://mvnrepository.com/artifact/io.cucumber/cucumber-java/7.16.1");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		 driver.close();
		 
		 
				
	}

}



