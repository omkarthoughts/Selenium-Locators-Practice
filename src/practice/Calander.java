package practice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

	//	ChromeOptions options = new ChromeOptions();
	//	options.setExperimentalOption("exclusiveSwitches", Arrays.asList("disable-popup-blocking"));

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// April 25
		driver.findElement(By.xpath("(//input[@id='form-field-travel_comp_date'])[1]"));
		// driver.findElement(By.cssSelector("#form-field-travel_comp_date")).click();

		while (!driver.findElement(By.cssSelector("span[class='cur-month']")).getText().contains("April")) {
			driver.findElement(By.cssSelector("span[class='flatpickr-next-month'] svg")).click();
		}

		List<WebElement> dates = driver
				.findElements(By.cssSelector("[class='dayContainer'] span[class='flatpickr-day ']"));
		// Grab a common Attribute //put into a list and Iterate
		int count = driver.findElements(By.cssSelector("[class='dayContainer'] span[class='flatpickr-day ']")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector("[class='dayContainer'] span[class='flatpickr-day ']"))
					.get(i).getText();
			if (text.equalsIgnoreCase("25")) {
				driver.findElements(By.cssSelector("[class='dayContainer'] span[class='flatpickr-day ']")).get(i)
						.click();
				break;
			}

		}

	}

}
