package dropdownexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","G:\\selenium\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://vctcpune.com/selenium/practice.html");
        //identify the box and store in reference variable 
         WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
         // create object of select class
         Select s=new Select(dropdown);
         //by using select class method we can select values of listbox
         s.selectByVisibleText("option2");
         Thread.sleep(1000);
         s.selectByIndex(1);
         Thread.sleep(0);
         s.selectByValue("option3");
         
         
	}

}
