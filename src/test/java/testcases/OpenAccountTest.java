package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseTest;
import utilities.Constants;
import utilities.DataProviders;
import utilities.DataUtil;
import utilities.ExcelReader;

public class OpenAccountTest extends BaseTest {
	
	@Test(dataProviderClass = DataProviders.class, dataProvider = "bankManagerDP")
	public void openAccountTest(Hashtable<String,String> data) {
		
		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
		DataUtil.checkExecution("BankManagerSuite", "OpenAccountTest", data.get("Runmode"), excel);
		browser = getBrowser(data.get("browser"));
		navigate(browser, Constants.URL);
		click("bmlBtn_CSS");
		click("openaccount_CSS");
		select("customer_CSS",data.get("customer"));
		select("currency_CSS",data.get("currency"));
		click("process_CSS");
		
	}

}
