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


	}

}