package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4edit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		// enter mail address
		driver.findElement(By.id("email")).sendKeys("sowmiyadevarajan04@gmail.com");
		
		//Append text amd keyboard tab 
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Text key");
		
		//get default text entered 
		driver.findElement(By.xpath("//input[@value='TestLeaf']")).sendKeys("TestLeaf");
		
		//clear text 
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		//edit field
		driver.findElement(By.xpath("//input[@style='width:350px;background-color:LightGrey;']")).isEnabled();
		
		String tite=driver.getTitle(); 
		System.out.println("tile");
		

		
	}

}
