package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
@FindBy(id="userName") private WebElement untb;
@FindBy(id="passWord") private WebElement pwdtb;
@FindBy(xpath="//input[@title='Sign In']") private WebElement loginbtn;


public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setusername(String un) {
	untb.sendKeys(un);
}
public void setpassword(String pwd) {
	pwdtb.sendKeys(pwd);
}
public void clicklogin() {
	loginbtn.click();
}

}