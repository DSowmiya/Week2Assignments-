package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//call Implicitywait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
		//Click create new account
		driver.findElement(By.linkText("Create New Account")).click();
		
		//Create first name and surname
		driver.findElement(By.name("firstname")).sendKeys("xyz");
		driver.findElement(By.name("lastname")).sendKeys("123");
		
		//mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("4444555555");
		driver.findElement(By.id("password_step_input")).sendKeys("12345");
		
		//BOD drop down
		
		WebElement date = driver.findElement(By.id("day"));
		Select select = new Select(date);
		select.selectByVisibleText("1");

		
		WebElement month = driver.findElement(By.id("month"));
		Select select2 = new Select(month);
		select2.selectByValue("12");
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select select3 = new Select(year);
		select3.selectByValue("2010");
		
		
//radio button select female
		driver.findElement(By.name("sex")).click();
		
		//doubt need to discuss
		//WebElement button =driver.findElement(By.name("sex"));
		//Select select4 = new Select(button);
		//select4.selectByValue("1");
						
			}

	
}
