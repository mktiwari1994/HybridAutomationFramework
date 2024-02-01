package com.automation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	//screenshot,alerts,frames,multiple windows,sync issue,javascript executor
	
	public static String captureScreenshot(WebDriver driver) {
		String screenShotPath=System.getProperty("user.dir")+"/Screenshots/freeCRM "+getCurrentDateTime()+".png";
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println("captured Screenshot");
		try {
			FileHandler.copy(src, new File(screenShotPath));
		} catch (IOException e) {
			System.out.println("unable to capture screenshot >>"+e.getMessage());
		}
		return screenShotPath;
	}
	
	public static String getCurrentDateTime() {
		DateFormat customDate=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate=new Date();
		return customDate.format(currentDate);
	}
}