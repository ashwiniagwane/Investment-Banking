package neostoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neostoxutility.Utility1;

public class Base1
{
protected static WebDriver driver;
public void launchBrowser() throws IOException, InterruptedException
{
	driver=new ChromeDriver();
	driver.get(neostoxutility.Utility1.readDataFromPropertyFile("url"));
	driver.manage().window().maximize();
	Utility1.wait(driver, 1000);
	Reporter.log("launching url", true);
	Thread.sleep(1000);
}





}
