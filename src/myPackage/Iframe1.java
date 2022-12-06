package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException
	
	{
		//System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://demoqa.com/frames");  	
        driver.switchTo().frame("frame1");
	WebElement Text1=driver.findElement(By.id("sampleHeading"));
	System.out.println(Text1.getText());
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("frame2");
	WebElement Text2=driver.findElement(By.id("sampleHeading"));
        	System.out.println(Text2.getText());
	
	
	
	
	
	
	}

}
