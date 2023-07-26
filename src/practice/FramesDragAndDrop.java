package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		WebElement target = driver.findElement(By.cssSelector("#droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
	}

}
