package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page {

	public static WebElement lnk_myAccount(WebDriver driver) {
		// TODO Auto-generated method stub
		WebElement lnk_myAccount = driver.findElement(By.xpath(".//*[@id='header']/div[4]/a[2]/span[2]"));
		return lnk_myAccount;
	}
	
	public static WebElement lnk_LogOut(WebDriver driver) {
		// TODO Auto-generated method stub
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[5]/div/div[2]/div/div/div/ul[3]/li/a")));
		WebElement lnk_LogOut = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div/div/div/ul[3]/li/a"));
		
		return lnk_LogOut;
	}
	
	//.//*[@id='header']/div[4]/a[2]/span[2]

}
