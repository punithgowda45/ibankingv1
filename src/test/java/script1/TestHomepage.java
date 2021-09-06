package script1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic1.BaseTest;
import page1.Homepage;

public class TestHomepage extends BaseTest {
	
@Test
	public void testhomepage() throws IOException {
	Homepage homepage=new Homepage(driver);
	boolean result = homepage.verifyhomepage(wait, "Guru");
	if(result==false) {
		screenshot(driver,"validlogin");
	}
	Assert.assertEquals(result, true);
	
	
}
}