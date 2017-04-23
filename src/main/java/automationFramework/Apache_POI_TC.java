package automationFramework;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import appModules.SignIn_Action;
import appModules.Signout_Action;
import junit.framework.Assert;
import pageObjects.Home_Page;
// Import Package utility.*
import utility.BrowserFactory;
import utility.Constant;
import utility.ExcelUtils;

	public class Apache_POI_TC {

			private static WebDriver driver = null;

		@Test
		public  void trelloLogin() throws Throwable{

        //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
        
        WebDriver driver  = BrowserFactory.startBrower("firefox", Constant.URL);

        SignIn_Action.Execute(driver);
        
        ExtentReports logger = ExtentReports.get(Apache_POI_TC.class);
        logger.init("C:/Users/Anand/workspace/OnlineStore/target/Reports/AdvanceReport.html", true);
        logger.startTest("Verify Trello page title");
        
        String title = driver.getTitle();
        
        logger.log(LogStatus.INFO, "Page title is captured");
        
        Assert.assertTrue(title.contains("Trello"));
        logger.log(LogStatus.PASS, "Title is verified");
        logger.attachScreenshot("C:/Users/Anand/Pictures/Nikon/20170416 Napier/100D5200.jpg");
        logger.endTest();
        
        Signout_Action.Execute(driver);

        driver.quit();

        //This is to send the PASS value to the Excel sheet in the result column.

        ExcelUtils.setCellData("Pass", 1, 3);

		}

	}