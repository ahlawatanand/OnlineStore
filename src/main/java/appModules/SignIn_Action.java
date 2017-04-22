package appModules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.*;
import utility.Constant;
import utility.ExcelUtils;

// Now this method does not need any arguments

public class SignIn_Action {

	public static void Execute(WebDriver driver) throws Exception {

		// This is to get the values from Excel sheet, passing parameters (Row
		// num &amp; Col num)to getCellData method

		String sUserName = ExcelUtils.getCellData(1, 1);
		String sPassword = ExcelUtils.getCellData(1, 2);
		
		LogIn_Page login_pageVar= PageFactory.initElements(driver, LogIn_Page.class);
		
		login_pageVar.login_trello(Constant.Username, Constant.Password);
		
		/*LogIn_Page.btn_LogIn(driver).click();
		LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);
		LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
		//LogIn_Page.txtbx_Password(driver).sendKeys(Keys.ENTER);
		System.out.println("entered password");
		
		
		
		
		LogIn_Page.btn_LogIn2(driver).submit();*/
		
	/*	System.out.println("HomePage");*/
		// lnk_myAccount
	/*	Home_Page.lnk_myAccount(driver).click();*/
	//	Home_Page.lnk_LogOut(driver).click();

	}

}