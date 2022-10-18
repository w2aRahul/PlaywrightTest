package rough;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;

import base.BaseTest;

public class UserRegTest extends BaseTest{
	
	
	@Test
	public void doLogin2() {
		
		Browser browser = getBrowser("firefox");
		navigate(browser,"http://google.com");
		type("searchBox","Hello Playwright");
		
	}
	
	
	
	@Test
	public void doGmailLogin2() {
		
		Browser browser = getBrowser("chrome");
		navigate(browser,"http://gmail.com");
		type("username","trainer@way2automation.com");
		
	}

}
