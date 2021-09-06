package page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcustomerpage {
	@FindBy(name="uid") private WebElement untb;
	@FindBy(name="password") private WebElement pwtb;
	@FindBy(name="btnLogin") private WebElement loginbtn;
	@FindBy(xpath="//a[text()='New Customer']") private WebElement newcust;
	@FindBy(xpath="//input[@name='name']") private WebElement custname;
	@FindBy(xpath="(//input[@name='rad1'])[1]") private WebElement gender;
	@FindBy(id="dob") private WebElement dob;
	@FindBy(name="addr") private WebElement address;
	@FindBy(name="city") private WebElement city;
	@FindBy(name="state") private WebElement state;
	@FindBy(name="pinno") private WebElement pin;
	@FindBy(name="telephoneno") private WebElement telephone;
	@FindBy(name="emailid") private WebElement email;
	@FindBy(name="password") private WebElement password;
	@FindBy(name="sub") private WebElement submit;
	@FindBy(xpath="//a[text()='Continue']") private WebElement conti;
	
	public Addcustomerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setusername(String un) {
		untb.sendKeys(un);
	}

	public void setpassword(String pwd) {
		pwtb.sendKeys(pwd);
	}
	
	public void clicklogin() {
		loginbtn.click();
		System.out.println("login successfull");
	}
	
	public void clicknewcustomer() {
		newcust.click();
	}
	
	public void customername(String cn) {
		custname.sendKeys(cn);
	}
	
	public void clickgender() {
		gender.click();
	}
	
	public void enterdob(String mm,String dd,String yyyy) {
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yyyy);
	}
	
	public void enteraddress(String add) {
		address.sendKeys(add);
	}
	
	public void entercity(String cityname) {
		city.sendKeys(cityname);
	}
	
	public void enterstate(String statename) {
		state.sendKeys(statename);
	}
	
	public void enterpin(String pinno) {
		pin.sendKeys(pinno);
	}
	
	public void enterphone(String phoneno) {
		telephone.sendKeys(phoneno);
	}
	
	public void entermail(String mailid) {
		email.sendKeys(mailid);
	}
	
	public void enterpassword(String paswrd) {
		password.sendKeys(paswrd);
	}
	
	public void clicksubmit() {
		submit.click();
	}
	
	public void clickcontinue() {
		conti.click();
	}
}


