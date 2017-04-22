/**This class is for Signout action
 * 
 */
package appModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Home_Page;

/**
 * @author Anand
 *
 */
public class Signout_Action {
	public static void Execute(WebDriver driver) throws Throwable{
		Home_Page Home_PageVar= PageFactory.initElements(driver, Home_Page.class);
		Home_PageVar.logout_trello();
	}

}
