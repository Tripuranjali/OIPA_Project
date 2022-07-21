package com.OIPA_Project.PageObjects;



import java.io.File;
import java.io.IOException;

//import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
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
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+ "/Screenshots/"+ tname+ ".png");
		FileUtils.copyFile(source, target);
	}
//	public static String capture(WebDriver driver, String screenShotName) throws Exception
//    {
//        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//        String dest = System.getProperty("user.dir") + "/Screenshots/" + screenShotName + ".png";
//        ImageIO.write(screenshot.getImage(),"PNG",new File(dest));
//        return dest;
//        System.out.println("Screenshots taken for failure testcases:");
//    }
}
