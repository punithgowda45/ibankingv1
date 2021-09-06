package script1;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic1.BaseTest;
import generic1.Excel;
import page1.Homepage;
import page1.Loginpage;

public class TestLoginpage extends BaseTest{

	@DataProvider
	public Object[][] getdata() throws EncryptedDocumentException, FileNotFoundException, IOException {
		Object data[][]=Excel.getdata(XL_path, "Validlogin");
		return data;
		
	}
	@Test(dataProvider="getdata")
	public void validlogin(String un,String pw) throws IOException {
		
		Loginpage loginpage=new Loginpage(driver);
		loginpage.setusername(un);
		loginpage.setpassword(pw);
		loginpage.clicklogin();
		
		Homepage homepage=new Homepage(driver);
		boolean result = homepage.verifyhomepage(wait, "Guru");
		if(result==false) {
			screenshot(driver,"validlogin");
		}
		Assert.assertEquals(result, true);
		
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
		}
		else {
			homepage=new Homepage(driver);
			homepage.logoutclick();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
		
	}
}
