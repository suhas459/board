package Board;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
protected	WebDriver driver; 
	
	public void logInBlackBoard() throws InterruptedException {
		 driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.navigate().to("https://www.blackboard.com/group/136");
		Thread.sleep(1500);		
	}
	
	
}
