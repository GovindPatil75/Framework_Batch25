package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider() throws Exception {
		
		String FilePath=System.getProperty("user.dir")+"\\Config\\Config.Properties";
		FileInputStream file=new FileInputStream(FilePath);
		pro=new Properties();
		pro.load(file);
	}

	public String getBaseUrl() {
		
		return pro.getProperty("BaseUrl");
	}
	
    public String getUsername() {
		
		return pro.getProperty("Username");
	}
    
    public String getPassword() {
	
	return pro.getProperty("Password");
}
	
	
}
