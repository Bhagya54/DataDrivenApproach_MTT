package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utility.DataUtils;

public class UserReg extends BaseTest {

	@Test(dataProviderClass = DataUtils.class,dataProvider = "Data")
	public void doUserReg(String firstName,String lastName) {
		System.out.println(firstName + " " + lastName);
	}
	
	
	
	
}
