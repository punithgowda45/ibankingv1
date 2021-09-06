package page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Homepage {
	@FindBy(xpath="//a[text()='Log out']") private WebElement logoutbtn;
	
public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public boolean verifyhomepage(WebDriver driver,String etitle) {
	String atitle = driver.getTitle();
	System.out.println(atitle);
	return atitle.equals(etitle);
}

public void logoutclick() {
	logoutbtn.click();
	
}

public boolean verifyhomepage(WebDriverWait wait,String etitle) {
	try {
		wait.until(ExpectedConditions.titleContains(etitle));
		System.out.println("home page is displayed");
		return true;
	}
	catch(Exception e) {
		System.out.println("invalid login");
		return false;
	}
	
	
}
}
