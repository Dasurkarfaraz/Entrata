package testcases.base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;





public class BasePage extends BaseTest{
	
	
	
	public void LoadURL(String URL)
	{
		driver.get(URL);
	}
	
	public void CokieAccept() {
		boolean exists = driver.findElements( By.xpath("//button[text()=\"Accept Cookies\"]") ).size() != 0;
		if(exists) {
		clickonElement(By.xpath("//button[text()=\"Accept Cookies\"]"));
		}
		else {
			System.out.println("Accept Cokie Not Present");
		}
	}

	
	public void SendKeys(By buttonID, String text)
	{try{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(buttonID));
		 driver.findElement(buttonID).sendKeys(text);
	}catch(Exception ex){
		ex.printStackTrace();
		
	}
	}
	
	public void clickonElement(By buttonID)
	{try{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		wait.until(ExpectedConditions.elementToBeClickable(buttonID));
		 js.executeScript("arguments[0].click();", driver.findElement(buttonID));
		
	}catch(Exception ex){
		ex.printStackTrace();
		
	}
	}
	
	public static void waitForVisibility(WebElement element, WebDriver driver){
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void waitForVisibilityof(List<WebElement> list, WebDriver driver){
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElements(list));
	}
	public static void waitForclickability(By element, WebDriver driver){
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void waitForVisibilityOfElements(By elementsId, WebDriver driver){
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementsId));
	}
	public static void waitForVisibilityShort(WebElement element, WebDriver driver){
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	@SuppressWarnings("deprecation")
	public void waitForInvisibility(By element, WebDriver driver){
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
		
	}
		public boolean isElementPresent_By(By locator){
			
				
			//test.log(LogStatus.INFO, "Trying to find element -> "+locator);
			int s = driver.findElements(locator).size();
			if(s==0){
			//	test.log(LogStatus.INFO, "Element not found");
				return false;
				
			}
			else{
			//	test.log(LogStatus.INFO, "Element found");
				return true;
			}
					
		}
	public boolean isElementPresent(String locator){
		//test.log(LogStatus.INFO, "Trying to find element -> "+locator);
		int s = driver.findElements(By.xpath(locator)).size();
		if(s==0){
		//	test.log(LogStatus.INFO, "Element not found");
			return false;
		}
		else{
		//	test.log(LogStatus.INFO, "Element found");
			return true;
		}
			
	}
	public void element_AssertTrue(By Locator){
	boolean element_Assert = isElementPresent_By(Locator);
	Assert.assertTrue(element_Assert);

	
	}
	
	public void SelectBytext(By Locator , String text) {
		Select drpCountry = new Select(driver.findElement(Locator));
		drpCountry.selectByVisibleText(text);
	}
		
	
	
	
	
}
