package Pagepckg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
ChromeDriver driver;
	
    @FindBy(xpath="//*[@id=\"user-name\"]")  
	
	WebElement user;
	
    @FindBy(xpath="//*[@id=\"password\"]")
	
	WebElement pass;
    
    @FindBy(xpath="//*[@id=\"login-button\"]")
	
	WebElement login;
    
    public Loginpage(ChromeDriver driver)
    
    {
    	
    	this.driver=driver;
    	
    	PageFactory.initElements(driver, this);
    	
    }
    
  public void loginclick()
    
    {
    	
    	login.click();
    }
  
  public void setValues(String email, String pswd)
  
  {
	  
	user.clear();
	  
   	user.sendKeys(email);
   	
   	pass.clear();
   	
    pass.sendKeys(pswd);
  	
   }

}
