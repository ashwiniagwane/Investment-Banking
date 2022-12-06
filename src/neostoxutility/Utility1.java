package neostoxutility;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility1
{
public static String readDataFromPropertyFile(String key) throws IOException   
	{
    Properties prop=new Properties();
    FileInputStream myFile =new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\seleniumProject\\neostox1.properties");
    prop.load(myFile);
    String value=prop.getProperty(key);
	return value;
    }
	
	public static void screenshot(WebDriver driver,String screen1) throws IOException
	
	{
File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest=new File("G:\\selenium\\screen\\"+screen1+".png");
FileHandler.copy(src1, dest);
	}
	public static void wait(WebDriver driver,int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	}
	
	public static void scrollintoview(WebDriver driver,WebElement element)
	{
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		JS.executeScript("argument[0].scrollintoview()", element);
	}
}
