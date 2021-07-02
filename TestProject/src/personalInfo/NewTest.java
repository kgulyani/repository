package personalInfo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	private WebDriver driver;
	
  @Test
  public void f() {
	  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	  driver.get("http://www.google.com");
	  WebElement googleSearch = driver.findElement(By.xpath("//input[@name='q']"));
	  googleSearch.sendKeys("Defination of animal");
	  
	  
	
  }
  
  
  @Test
  public void f1() {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  
	  driver.get("https://orderappetit.com/");
	  WebElement searchTab = driver.findElement(By.xpath("//input[@placeholder ='What are you craving?']"));
	  searchTab.sendKeys("Pizza");
	  WebElement searchButton = driver.findElement(By.cssSelector("div.search_web button.ant-btn.ant-btn-primary.search_btn"));
	  searchButton.click();
	  WebElement searchRest = driver.findElement(By.xpath("//span[text()='Wise Guys Pizza']"));
      searchRest.click();	
      WebElement searchDate = driver.findElement(By.id("date"));
      searchDate.click();
      
      String a="yy";
      
      List<WebElement> rows= driver.findElements(By.cssSelector("tr.zA.zE"));
      
      String xpath="//span[contains(text(),'%s')]/parent::span/parent::div/parent::td/preceding-sibling::td/div[@role='checkbox']";
      
      String.format(xpath, "Uber");
      
      for(WebElement w : rows ) 
      {
    	  List<WebElement> coulmns= w.findElements(By.tagName("td"));
    	  	for(WebElement column : coulmns)
    	  	{
    	  		if(column.getText().equals("Uber"))
      		  {
    	  			column.click();
      			  break;
      		  }	
    	  	}
      }
      
      for(int i=0 ; i< rows.size(); i++ ) 
      {
    	  
    	  List<WebElement> coulmns= rows.get(i).findElements(By.tagName("td"));
    	  for(int j=0; j<coulmns.size(); j++)
    	  {
    		  if(coulmns.get(j).getText().equals("Uber"))
    		  {
    			  coulmns.get(1).click();
    			  break;
    		  }
    	  }
      }
      
      
      
      
      
	  //"//*[@id="root"]/div/section/section/main/div/div[2]/div/div[1]/div/div/div[1]/div/div[1]/span"
	  
  }
  
 

  @BeforeClass
  public void beforeClass() {
	  
  }

  @AfterClass
  public void afterClass() {
	  
  }
  
  

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\TestProject\\src\\chromedriver\\chromedriver.exe");
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", map);
		driver = new ChromeDriver(options);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
