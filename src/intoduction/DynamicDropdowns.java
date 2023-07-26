package intoduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com"); //url in the browser
				
		driver.findElement(By.cssSelector("div[data-testid='to-testID-origin'] div[class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'AGR')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'DEL')]")).click();
		
	}

}
