package pageObjects;

import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page {
	 WebDriver driver;

	public Home_Page(WebDriver ldriver){
		this.driver = ldriver;
	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='header']/div[4]/a[2]/span[2]")
	WebElement lnk_myAccount;
	
	@FindBy(how=How.XPATH,using="html/body/div[5]/div/div[2]/div/div/div/ul[3]/li/a")
	WebElement lnk_LogOut;
	
	public void logout_trello() throws Throwable{
		Thread.sleep(5000);
		lnk_myAccount.click();
		
		if (lnk_LogOut.isDisplayed()){
			lnk_LogOut.click();
		}
		
	}
	
/*	public static WebElement lnk_myAccount(WebDriver driver) {
		// TODO Auto-generated method stub
		WebElement lnk_myAccount = driver.findElement(By.xpath(".//*[@id='header']/div[4]/a[2]/span[2]"));
		return lnk_myAccount;
	}*/
	
/*	public static WebElement lnk_LogOut(WebDriver driver) {
		// TODO Auto-generated method stub
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[5]/div/div[2]/div/div/div/ul[3]/li/a")));
		WebElement lnk_LogOut = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div/div/div/ul[3]/li/a"));
		
		return lnk_LogOut;
	}*/


}
