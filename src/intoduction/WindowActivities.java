package intoduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		//seleniumManager on (Beta Phase 4.6.0)
		System.setProperty("webdriver.chrome.driver", "/E:/Drivers/chromedriver.exe"); //this step is optional 
																				//you can keep it or not doesen't matter
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.com"); // system will wait until all the 
										  //component will load (First time always use this)
		
		driver.navigate().to("https://rahulshettyacademy.com"); //it used for internally navigate when browser is loaded
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
	}

}
 