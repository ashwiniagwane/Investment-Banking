package neoStockPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neostoxutility.Utility1;

public class SignInPagePOM
{
@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobilefield;
@FindBy(xpath="//a[@id='lnk_signup1']")private WebElement signin;

public SignInPagePOM (WebDriver driver)
{
PageFactory.initElements(driver, this);
}
 
public void entermobnumber(WebDriver driver,String mobnumber)
{
	Utility1.wait(driver, 1000);
	mobilefield.sendKeys(mobnumber);
	Reporter.log("sending mobile number", true);
}


public void clickonsignin(WebDriver driver)
{
	signin.click();
	Utility1.wait(driver, 1000);
	Reporter.log("click on signin", true);
}






}
