package automation.seleniumgridtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
public class GridTest2 {

	@Test
public static void testGrid2() throws MalformedURLException, InterruptedException {
		
		FirefoxOptions options = new FirefoxOptions();
		//options.setCapability("browserVersion", "105");
		options.setCapability("platformName", "Windows");
		// Showing a test name instead of the session id in the Grid UI
		options.setCapability("se:name", "My simple test2"); 
		// Other type of metadata can be seen in the Grid UI by clicking on the 
		// session info or via GraphQL
		options.setCapability("se:sampleMetadata", "Sample metadata value2"); 
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.104:4444"), options);
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		driver.quit();

	}

}
