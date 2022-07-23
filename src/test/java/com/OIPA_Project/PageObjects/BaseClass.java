package com.OIPA_Project.PageObjects;



import java.io.File;
import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;

//import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.OIPA_Project.Utilities.ReadConfig;

//import ru.yandex.qatools.ashot.AShot;
//import ru.yandex.qatools.ashot.Screenshot;
//import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();	
	public String SITURL = readconfig.getAppURL() ;
	public String UserName = readconfig.getUserName();
	public String PassWord = readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	
	@Parameters("browser")
	
	@BeforeClass
	public void setup(String br) {
		
		logger=Logger.getLogger("OIPA_Project");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("Chrome"))	{
			System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
			driver = new ChromeDriver();
			logger.info("Testing in Chrome browser");
		
		} else if (br.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxpath());
			driver = new FirefoxDriver();
			logger.info("Testing in Firefox browser");
			
		} else if (br.equals("MsEdge")) {
			System.setProperty("webdriver.msedge.driver", readconfig.getMsEdgepath());
			driver = new EdgeDriver();
			logger.info("Testing in Edge browser");
		}
		
		driver.get(SITURL);
		
	}
	
	
	@AfterClass
	public void teardown() {
		driver.manage().window().minimize();
	}
	
	public static String captureScreen(WebDriver driver, String tname) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destination =System.getProperty("user.dir")+"/Screenshots/"+tname+".png";
		File Finaldestination = new File(destination);
		FileUtils.copyFile(source, Finaldestination);
		return destination;
	}

}
