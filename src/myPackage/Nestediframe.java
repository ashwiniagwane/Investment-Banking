package myPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestediframe {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/nestedframes");
 Thread.sleep(2000);
//switch to parent frame
driver.switchTo().frame("frame1");
 String text1 = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
	System.out.println(text1);
	//switch to child frame
	
	WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
	driver.switchTo().frame(childframe);
	 String text2 = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	System.out.println(text2);
	}
	

}
