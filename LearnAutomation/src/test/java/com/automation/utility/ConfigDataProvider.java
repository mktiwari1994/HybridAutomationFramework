package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;



public class ConfigDataProvider {
	Properties pro;
		public ConfigDataProvider() {
			
			try {
				File src=new File("./Config/Config.properties");
				FileInputStream fis=new FileInputStream(src);
				pro=new Properties();
				pro.load(fis);
			} catch (Exception e) {
				
				System.out.println("unable to read config file >>"+e.getMessage());
			}
		}
		
		public String getBrowser() {
			return pro.getProperty("Browser");
		}
		
		public String getStagingUrl() {
			return pro.getProperty("qaUrl");
		}
}
