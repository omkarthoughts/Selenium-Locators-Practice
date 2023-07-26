package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
	public static void main(String[] args) throws InterruptedException {
	
		//1. give me the count of all the links on the page
		//2. count of links in the footer sections
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));	//Limiting WebDriver Scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//3. count of links in the footer column section
		WebElement columndriver = footerdriver.findElement(By.xpath("//body[1]/div[6]/table[1]/tbody[1]/tr[1]/td[1]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//4. click on each link in the column and check if the pages are opening
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		}
		
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while(it.hasNext())
		{
			it.next();
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
		}//grab the title from each window
}
}