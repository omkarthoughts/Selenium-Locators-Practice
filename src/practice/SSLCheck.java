package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();

		proxy.setHttpProxy("myhttpproxy:4444");
		options.setCapability("proxy", proxy);
		
		
		ChromeOptions options1 = new ChromeOptions();
		options1.setExperimentalOption("excludeSwitches",
	     Arrays.asList("disable-popup-blocking")); // handle windows popups

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		
		FirefoxOptions options3 = new FirefoxOptions(); //for FireFox Browser
		EdgeOptions Options2 = new EdgeOptions();	    //for Edge Browser
		
		options1.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options1);

		driver.get("htpp://expired.badssl.com");
		System.out.println(driver.getTitle());

	}

}
