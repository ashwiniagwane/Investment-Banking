package neoStockPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neostoxutility.Utility1;

public class HomePagePOM
{
@FindBy(xpath="//span[@id='lbl_curbalancetop']")private WebElement balance;
@FindBy(xpath="//span[@id='lbl_username']")private WebElement username;
@FindBy(id="lnk_logout")private WebElement logout;
@FindBy(xpath="(//a[text()='OK'])[2]")private WebElement okbutton;
@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement closebutton;

public HomePagePOM (WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
public String availablebalance()
{
	
	String actualbalance = balance.getText();
	Reporter.log("actual balance ", true);
	return actualbalance;
}
public String availableusername(WebDriver driver)
{
	String actualusername = username.getText();
	Reporter.log("actual username", true);
	return actualusername;
}

	
 public void handlePOPup(WebDriver driver)
 {
	 Utility1.wait(driver, 1000); 
	 okbutton.click();
	 closebutton.click();
	 Reporter.log("handled the popup", true);
 }
 public void logoutaccount(WebDriver driver)
 {
	 balance.click();
	 Utility1.wait(driver, 1000);
	 logout.click(); 
	 Reporter.log("logout from account", true);
 }
	
}
