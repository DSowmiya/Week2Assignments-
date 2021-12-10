package week2.Assignments;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Buttonprgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
			
				
				driver.get("http://leafground.com/pages/Button.html");
				Thread.sleep(1000);
				driver.findElement(By.id("home")).click();	
				driver.navigate().back();
				
				
				
				//Find position of button x,y 
				String Position;				
				Position=driver.findElement(By.xpath("//button[@id='position']")).getAttribute("x,y");
				System.out.println("Position of button:" +Position);
				
				
				//find color of button 
				String color;
				color= driver.findElement(By.xpath("//button[@style='background-color:lightgreen']")).getCssValue("Button color");
				System.out.println("Button color:" +color);
				
				//find height and width of button
				org.openqa.selenium.Dimension value = driver.findElement(By.xpath("//button[@style='background-color:lightblue']")).getSize();
				System.out.println("Width and height of button is:" +value);
				
				driver.close();
				
				
				
	}

}
