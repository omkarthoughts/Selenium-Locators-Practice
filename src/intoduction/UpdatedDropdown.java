package intoduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // url in the browser

		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());

		// count the no of check boxes
		System.out.println(driver.findElements(By.cssSelector("checkbox")).size());

		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		driver.findElement(By.id("div1")).getAttribute("style");

		if (driver.findElement(By.id("div1")).getAttribute("style").contains("0.5")) {
			System.out.println("is Enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// div[contains(text(),'Family & Friends')]
		/*
		 * int i; while(i<5) {
		 * driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"
		 * )).click(); i++; }
		 */

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		for (int i = 1; i < 5; i++) {
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();

			System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());

		}
		Assert.assertEquals(driver.findElement(By.cssSelector("#divpaxinfo")).getText(), "5 Adult");
	}

}
