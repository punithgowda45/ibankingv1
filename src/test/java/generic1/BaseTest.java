package generic1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import page1.Addcustomerpage;

public class BaseTest implements IConst {
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	public boolean isAlertPresent() {
		try{
			driver.switchTo().alert();
			return true;
			}
		catch(NoAlertPresentException e) {
			return false;
			}
	}
	
	@BeforeMethod
	public void openapp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,ETO);
		driver.manage().window().maximize();
		driver.get(APP_URL);
		
//		Addcustomerpage page=new Addcustomerpage(driver);
//		page.setusername("mngr350355");
//		page.setpassword("avyzYna");
//		page.clicklogin();
//		page.clicknewcustomer();
	}
 
	@AfterMethod
	public void closeapp() {
	 driver.quit();
 }
	public void screenshot(WebDriver driver,String classname) throws IOException {
		int index=1;
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		String scfile = "./images/p1"+index+".png";
		FileUtils.copyFile(scr, new File(scfile));
		System.out.println("screenshot" +index+ "taken");
		index++;
	}
	
	public String randomstring() {
		String generatedstring = RandomStringUtils.randomAlphabetic(10);
		return generatedstring;
	}
}
