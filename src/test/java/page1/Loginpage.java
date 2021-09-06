package page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
@FindBy(name="uid") private WebElement untb;
@FindBy(name="password") private WebElement pwtb;
@FindBy(name="btnLogin") private WebElement loginbtn;

public Loginpage(WebDriver driver) {
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
}
