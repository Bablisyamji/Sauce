package Testpckg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Basepckg.Baseclass;
import Pagepckg.Loginpage;
import Utilities.Excelutils;
public class Logintest extends Baseclass {
	
	
	@Test(priority=1)
	 
	public void login() throws Exception

	{
		
		Loginpage p1=new Loginpage(driver);
		
		String xl="E:\\Book2.xlsx";
		
		String Sheet="Sheet1";
		
		int rowCount=Excelutils.getRowCount(xl, Sheet);
		
		for(int i=1; i<=rowCount; i++)
			
		{
			
			
			String UserName=Excelutils.getCellValue(xl, Sheet, i, 0);
			
			System.out.println("username:"+UserName);
			
			String pwd=Excelutils.getCellValue(xl, Sheet, i, 1);
			
			System.out.println("password:"+pwd);
			
			p1.setValues(UserName, pwd);
			
			p1.loginclick();
				
		}
		
	}
	
	@Test(priority=2)
	
	public void addtocart() throws Exception
	
	{
		
		
		List<WebElement>li=driver.findElements(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/button"));
		
		for(WebElement ele:li)
			
		{
			
			String text=ele.getText();
			
			if(text.equalsIgnoreCase("Add to Cart"))
				
			{
				
				ele.click();
				
			}
			 
		}
		
	}
	
	
@Test(priority=3)

public void cartclick() throws Exception

{
	
	driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
	
}

@Test(priority=4)

public void checkout() throws Exception

{
	
	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[2]")).click();
	
}

@Test(priority=5)

public void continueclick() throws Exception

{
	
	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input")).sendKeys("abc");
	
	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[2]/input")).sendKeys("xyz");
	
	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[3]/input")).sendKeys("123456");
	
	Thread.sleep(1000);
	
	
	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[2]/input")).click();
	
	Thread.sleep(1000);
	
}

@Test(priority=6)

public void hambergclick() throws Exception

{
	
	driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button")).click();
	
	Thread.sleep(1000);
	
}

@Test(priority=7)

public void logout() throws Exception

{
	
	driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")).click();
	
	
}

}
		
		
	


