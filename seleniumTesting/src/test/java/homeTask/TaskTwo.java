package homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskTwo {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		//chrome driver location setup
		WebDriverManager.chromedriver().setup();
				
		//web driver Object Create
		WebDriver driver = new ChromeDriver();
				
				
		//visit the url
		driver.get(" https://katalon-demo-cura.herokuapp.com/");
		
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		
		
		//delay for 3 sec
		Thread.sleep(3000);
		
		//click on the make appointment button by using id locator
		driver.findElement(By.id("btn-make-appointment")).click();
		
		//delay for 2 sec
		Thread.sleep(2000);
		
		//fill-up username by using name locator
		driver.findElement(By.name("username")).sendKeys("John Doe");
		
		
		//delay for 2 sec
		Thread.sleep(2000);
			
		//fill-up password by using xpath locator
		driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");
		
		
		//delay for 2 sec
		Thread.sleep(2000);
		
		
		//click on the login button by using id locator
		driver.findElement(By.id("btn-login")).click();
		
		//delay for 2 sec
		Thread.sleep(2000);
		
		
		//quit the browser
		driver.quit();
		
		
		
	}

}
