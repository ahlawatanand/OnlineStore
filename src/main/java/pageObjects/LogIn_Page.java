package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LogIn_Page {

	WebDriver driver;
	//constructor
	public LogIn_Page(WebDriver ldriver){
		this.driver = ldriver;
	}
	
/*	@FindBy(how=How.ID,using="user")
	WebElement txtbx_UserName;*/
	
/*	@FindBy(how=How.XPATH,using="(//a[contains(text(),'Log In')]")
	WebElement btn_LogIn;*/
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div[2]/a[1]")
	WebElement btn_LogIn;
	
	@FindBy(how=How.XPATH,using=".//*[@id='user']")
	WebElement txtbx_UserName;
	
	
	@FindBy(how=How.ID,using="password")
	WebElement txtbx_Password;
	
	@FindBy(how=How.ID,using="login")
	WebElement btn_LogIn2;
	
	public void login_trello(String uName, String pass) throws Exception{
		btn_LogIn.click();
		Thread.sleep(1000);
		txtbx_UserName.sendKeys(uName);
		txtbx_Password.sendKeys(pass);
		btn_LogIn2.click();
		
	}
	
	/*public static WebElement btn_LogIn(WebDriver driver) {
		// TODO Auto-generated method stub
		WebElement btn_LogIn = driver.findElement(By.xpath("html/body/div[1]/div[2]/a[1]"));
	//	btn_LogIn.click();
		return btn_LogIn;
	}

	public static WebElement txtbx_UserName(WebDriver driver) {
		// TODO Auto-generated method stub
		WebElement txtbx_UserName = driver.findElement(By.id("user']"));
		return txtbx_UserName;
	}

	public static WebElement txtbx_Password(WebDriver driver) {
		// TODO Auto-generated method stub
		WebElement txtbx_Password = driver.findElement(By.xpath(".//*[@id='password']"));
		return txtbx_Password;
	}

	public static WebElement btn_LogIn2(WebDriver driver) {
		// TODO Auto-generated method stub
		
		WebElement btn_LogIn2 = driver.findElement(By.id("login"));
		//WebElement btn_LogIn2 = driver.findElement(By.xpath(".//*[@id='login'][@value='Log In']"));
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(btn_LogIn2));
		
		return btn_LogIn2;
	}*/




	
	
}
