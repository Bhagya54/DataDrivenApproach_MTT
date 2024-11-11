package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utility.DataUtils;

public class AddAccountTest extends BaseTest {

	@Test(dataProviderClass = DataUtils.class,dataProvider = "Data")
	public void addAccount(String firstName,String lastName,String Currency) {
		click("openAccountBtn_XPATH");
		select("CstName_ID", firstName+" " +lastName);
		select("Currency_ID",Currency);
		click("processBtn_XPATH");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al = driver.switchTo().alert();
		String alertText=al.getText();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(alertText.contains("Account created successfully"),"Please check unabe to create an account");
	
		al.accept();
	}
}
