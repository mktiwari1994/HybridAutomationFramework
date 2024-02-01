package com.automation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;


public class LoginTestCRM extends BaseClass {
	
	
	@Test
	public void loginApp() {
		logger = report.createTest("Login To CRM");
		String email = excel.getStringData("Login", 0, 0);
		String password = excel.getStringData("Login", 0, 1);
		logger.info("Started Application");
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToCrm(email,password);
		logger.pass("Login Success");
		
	}
	
}
