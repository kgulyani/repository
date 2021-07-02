package execution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import classObject.Car;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Car = new Car();
		Car.setModel("kanika");
		Car.eccelrate();
		
		System.out.println(Car.getModel());
		System.out.println(Car.getWheels());
		
		Car = new Car();
		Object a = Car;
		Car.setModel("jagmohan");
		Car.eccelrate();
		System.out.println(Car.getModel());
		System.out.println(((Car)a).getWheels());
	
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\TestProject\\src\\chromedriver\\chromedriver.exe");
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", map);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement element = driver.findElement(By.xpath("//*[@id = 'email']"));
		element.sendKeys("email id");
		WebElement element2 = driver.findElement(By.xpath("//*[@id = 'pass']"));
		element2.sendKeys("password");
		
		element2.submit();
		driver.quit();
	}

}
