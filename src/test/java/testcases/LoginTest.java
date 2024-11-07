package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.BaseTest;
import utility.DataUtils;


public class LoginTest extends BaseTest{

	@Test(dataProviderClass = DataUtils.class,dataProvider = "Data")
	public void doLogin(String username,String password) {
		type("username_ID",username);
		type("pswd_NAME",password);
		click("loginBtn_XPATH");
	}
	
	
}
