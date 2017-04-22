package automationFramework;

		import java.util.concurrent.TimeUnit;
		import org.junit.Test;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import pageObjects.*;
		import utility.Constant;
		// Import Package utility.*
		import utility.*;
		import appModules.SignIn_Action;

	public class Apache_POI_TC {

			private static WebDriver driver = null;

		@Test
		public  void trelloLogin() throws Exception{

        //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method

        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
    //    System.setProperty("webdriver.gecko.driver","C:/Users/Anand/drivers/geckodriver-v0.15.0-win64/geckodriver.exe");
    //    driver = new FirefoxDriver();
    //    driver.get(Constant.URL);
        
        WebDriver driver  = BrowserFactory.startBrower("firefox", Constant.URL);
        System.out.println("Lets login Anand");
        SignIn_Action.Execute(driver);

        System.out.println("Login Successfully, now it is the time to Log Off buddy.");

        Home_Page.lnk_LogOut(driver).click(); 

        driver.quit();

        //This is to send the PASS value to the Excel sheet in the result column.

        ExcelUtils.setCellData("Pass", 1, 3);

		}

	}