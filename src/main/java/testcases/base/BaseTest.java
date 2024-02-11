package testcases.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	
	public static WebDriver driver ; 
	@BeforeSuite
	public void beforeSuite() {
		////before class 
	}
	@AfterSuite
	public void Kill() throws Exception {
		driver.quit();
		
	}
	@AfterTest
	public void ConfigAT() {
		driver.close();
	}
	
	@BeforeTest
	public void configBc() throws Throwable {
		
		init("Chrome");
			
		
	}
	
	
	
	public WebDriver init(String bType){
		
		
		try{
			if(bType.equals("Edge"))
				driver= new EdgeDriver();
			else if(bType.equals("Chrome")){
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
//				options.addArguments("--headless", "--window-size=1920,1200");
//				options.setProxy(null);
//				options.addArguments("download.default_directory", "");
				options.addArguments("--incognito");
				driver= new ChromeDriver(options);
			}	//init(data.get("Browser"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		
		
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return driver;
	}

}
