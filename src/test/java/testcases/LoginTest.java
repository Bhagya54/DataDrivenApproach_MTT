package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.BaseTest;


public class LoginTest extends BaseTest{

	@Test(dataProvider = "Data")
	public void doLogin(String username,String password) {
		type("username_ID",username);
		type("pswd_NAME",password);
		click("loginBtn_XPATH");
	}
	
	@DataProvider(name="Data")
	public Object[][] getData(){
		
		
		String sheetName="login";
		int noOfRows = excel.getRowCount(sheetName);//3
		int noOfCols = excel.getColumnCount(sheetName);//2
		
		Object[][] credentials = new Object[noOfRows-1][noOfCols];
		
		for(int row=2;row<=noOfRows;row++) {//3
			for(int col = 0;col<noOfCols;col++) {
				credentials[row-2][col] = excel.getCellData(sheetName, col,row);//0,2
			}
		}
		return credentials;
	}
}
