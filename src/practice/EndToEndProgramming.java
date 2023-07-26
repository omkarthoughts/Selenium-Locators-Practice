package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndProgramming {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='DEL']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("is Enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		for (int i = 1; i < 5; i++) {
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();

			System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());

		}

		WebElement staticDropdowns = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdowns);
		dropdown.selectByIndex(3);

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
