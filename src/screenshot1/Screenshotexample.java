package screenshot1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshotexample {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/login/");
    Thread.sleep(1000);
     File SOURCE = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     System.out.println(SOURCE);
     File desti=new File("G:\\selenium\\screen\\fbimg1.png");
     FileHandler.copy(SOURCE, desti);
     
     
     
     
     
     
    
	}

}
