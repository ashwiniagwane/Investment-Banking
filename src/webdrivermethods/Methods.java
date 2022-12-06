package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		//Get method
		driver.get("https://www.facebook.com/");
		
		//maximize method
		driver.manage().window().maximize();
	
		//minimize method
		//driver.manage().window().minimize(); 
		
		//get title method
		String webtitle = driver.getTitle();
		System.out.println(webtitle);
		
		//close method
		driver.close();
		
	}

}
