package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlAndSendkeys {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String webURL = driver.getCurrentUrl();
		System.out.println(webURL);
		//WebElement userid = driver.findElement(By.id("email"));
		//userid.sendKeys("ashwini");
		driver.findElement(By.id("email")).sendKeys("ashwini");
		//driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
