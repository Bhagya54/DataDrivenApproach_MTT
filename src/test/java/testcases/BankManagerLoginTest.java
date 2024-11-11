package testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class BankManagerLoginTest extends BaseTest{

	
	@Test
	public void doBankMgrLogin() {
		click("bankMgrLoginBtn_XPATH");
		wait.until(ExpectedConditions.visibilityOf(getWebElement("addCustomerstmrBtn_XPATH")));
		boolean status=isElementPresent("addCustomerstmrBtn_XPATH");
		/*if(status==true) {
			System.out.println("Bank Manager login is successful");
		}
		else {
		System.out.println("Bank Manager login is not successful");
		}*/
		
		Assert.assertTrue(status,"Bank Manager login is not successful");
		
	}
}
