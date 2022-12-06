package neostoxtestclasses;

import org.testng.annotations.Test;

import neoStockPOM.HomePagePOM;
import neoStockPOM.PasswardPagePOM;
import neoStockPOM.SignInPagePOM;
import neostoxBase.Base1;
import neostoxutility.Utility1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NewTestclass extends Base1
{
	SignInPagePOM login;
	 PasswardPagePOM pass;
	 HomePagePOM home;
	 @BeforeClass
  public void launchNeostox() throws IOException, InterruptedException
	 {
		 launchBrowser();
		 login=new SignInPagePOM(driver);
		 pass=new PasswardPagePOM(driver);
		 home=new HomePagePOM(driver);
	 
	 }
  
  @BeforeMethod
  public void loginintoNeostox() throws IOException, InterruptedException
  {
  login.entermobnumber(driver, Utility1.readDataFromPropertyFile("mobilefield"));
  login.clickonsignin(driver);
  Utility1.wait(driver, 1000);
  pass.enterpassward(driver, Utility1.readDataFromPropertyFile("passward"));
  Thread.sleep(1000);
  pass.clickonsubmit(driver);
  Thread.sleep(1000);
  home.handlePOPup(driver);
  
  }
  @Test
  public void validateUsername() throws IOException 
  {
	 Assert.assertEquals(home.availableusername(driver),Utility1.readDataFromPropertyFile("expusername"),"TC is failed if actual and expectes name are not matchingg"); 
	  Utility1.screenshot(driver, home.availableusername(driver));
 }

  @AfterMethod
  public void logoutfromneostox()
  {
	home.logoutaccount(driver);  
	  
	  
  }


  @AfterClass
  public void closebrowser()
  {
	  driver.close();
	  Reporter.log("closing browser", true);
	  
  }

}
