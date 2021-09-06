package script1;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic1.BaseTest;
import generic1.Excel;
import page1.Addcustomerpage;

public class TestAddcustomerpage extends BaseTest {
	
	@DataProvider
	public Object[][] getdata() throws EncryptedDocumentException, FileNotFoundException, IOException {
		Object data[][]=Excel.getdata(XL_path, "Sheet1");
		return data;
	}
	
	@Test(dataProvider="getdata")
	public void customerdetails(String cn,String mm,String dd,String yy,String add,String city,String state,String pin,String phone) throws IOException, InterruptedException {
		
		Addcustomerpage page=new Addcustomerpage(driver);
		page.setusername("mngr350355");
		page.setpassword("avyzYna");
		page.clicklogin();
		page.clicknewcustomer();
		page.customername(cn);
		page.clickgender();
		page.enterdob(mm,dd,yy);
		page.enteraddress(add);
		page.entercity(city);
		page.enterstate(state);
		page.enterpin(pin);
		page.enterphone(phone);
		String mail=randomstring()+"@gmail.com";
		page.entermail(mail);
		page.enterpassword("avyzYna");
		page.clicksubmit();
		
		
//		if(isAlertPresent()==true) {
//			driver.switchTo().alert().accept();
//	}
//		screenshot(driver,"customerdetails");
		
}}

