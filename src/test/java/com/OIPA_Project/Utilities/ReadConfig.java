package com.OIPA_Project.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties p;
	
	public ReadConfig() {
		
		File src = new File("./Configuration/Config.properties");
		
		try {
			
			FileInputStream fis = new FileInputStream(src);
			p = new Properties();
			p.load(fis);
		} catch (Exception e) {
			
			System.out.println("Exception is" + e.getMessage());
			
		}
	}
	
	public String getAppURL() {
		String url=p.getProperty("SITURL");
		return url;
	}
	public String getUserName() {
		String username=p.getProperty("UserName");
		return username;
	}
	public String getPassword() {
		String Password=p.getProperty("PassWord");
		return Password;
	}
	public String getChromepath() {
		String Chromepath=p.getProperty("Chromepath");
		return Chromepath;
	}
	public String getFirefoxpath() {
		String Firefoxpath=p.getProperty("Firefoxpath");
		return Firefoxpath;
	}
	public String getMsEdgepath() {
		String MsEdgePath=p.getProperty("MsEdgepath");
		return MsEdgePath;
	}
	
	public String getOIPAUrl() {
		String oipaurl=p.getProperty("OIPASITURL");
		return oipaurl;
	}
	
	public String getOipaUserName() {
		String oipausername=p.getProperty("OIPAUsername");
		return oipausername;
		
	}
	
	public String getOipaPassWord() {
		String oipapassword=p.getProperty("OIPAPassword");
		return oipapassword;
		
	}
	

}
