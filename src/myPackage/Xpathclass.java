package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathclass {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.xpath("//html[@id='facebook']"));
        driver.findElement(By.xpath("//input[@type='password']"));
        
	}

}