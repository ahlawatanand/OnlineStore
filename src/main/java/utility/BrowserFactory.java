/**
 * this class is to initialise the webdrivers: FireFox, Chrome, IE
 */
package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Anand
 *
 */
public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrower(String browserName, String URL){
		if (browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","C:/Users/Anand/drivers/geckodriver-v0.15.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:/Users/Anand/drivers/chrome/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "C:/Users/Anand/drivers/ie/IEDriverServer_32.exe");
														//C:\Users\Anand\drivers\ie
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
		
	}

}
