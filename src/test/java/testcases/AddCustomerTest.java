package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utility.DataUtils;

public class AddCustomerTest extends BaseTest{

	@Test(dataProviderClass = DataUtils.class,dataProvider = "Data")
	public void addCustomer(String fname,String lname,String zipcode) {
		click("addCustomerstmrBtn_XPATH");
		type("firstName_XPATH", fname);
		type("lastName_XPATH",lname);
		type("postalCode_XPATH",zipcode);
		click("addCstmrBtn_XPATH");
		
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
		Assert.assertTrue(alertText.contains("Customer added successfully"),"Please check unabe to add the customer");
	
		al.accept();
	}
}
