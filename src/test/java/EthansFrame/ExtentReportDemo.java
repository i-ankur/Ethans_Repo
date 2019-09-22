package EthansFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.facebook.com/");

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\Ankur\\Downloads\\selenium_jars\\Screenshots\\Batch.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(htmlReporter);
		ExtentTest logger = report.createTest("TC_01_VerifyLogin","User is able to login Successfully");
		logger.log(Status.PASS, "UserName entered Successfully");
		logger.log(Status.PASS, "Password entered Successfully");
		logger.log(Status.FAIL, "Unable to click on Login Button");
		logger.log(Status.INFO, "Home page not displayed");
		
		report.flush();             //always use--used to push logs into html file
		
		
	}

}
