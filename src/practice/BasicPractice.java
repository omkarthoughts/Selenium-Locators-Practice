package practice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E://Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Implicit Wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5)); // Explicit Wait
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// format/split it to get actual vegetable name form -(Brocolli - 1 Kg)
			// convert arrays in to array list for easy search
			// check weather name you selected is present in array list or not
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName)) {
				j++;
				// Click on Add TO Cart Button
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}
}