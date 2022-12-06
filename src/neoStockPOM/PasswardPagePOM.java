package neoStockPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neostoxutility.Utility1;

public class PasswardPagePOM {
@FindBy(id="txt_accesspin")private WebElement passwardfield;
@FindBy(id="lnk_submitaccesspin")private WebElement submitbutton;

public PasswardPagePOM(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void enterpassward(WebDriver driver,String passward)
{
	Utility1.wait(driver, 1000);
	passwardfield.sendKeys(passward);
	Reporter.log("sending passward", true);
}

public void clickonsubmit(WebDriver driver)
{
	submitbutton.click();
	Utility1.wait(driver, 1000);
	Reporter.log("click on submmit button", true);
}
	
	
}
