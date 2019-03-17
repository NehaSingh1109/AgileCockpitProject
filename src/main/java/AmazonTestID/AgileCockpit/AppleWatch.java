package AmazonTestID.AgileCockpit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class AppleWatch extends BaseClass{
		
 public static WebDriver driver;
 BaseClass b= new BaseClass();
	@BeforeMethod
	public  void setupApplication()
	{
		
		b.getUrl("https://www.amazon.in/");
		}
	
	@Test
	public void excution() {
			b.type("Apple watch");
			b.butt();//click action
			b.getpart(7);
			b.rating(10);
		
	}
	
	
	@AfterMethod
	public void closeApplication()
	{
		driver.quit();
		
		
	}
	
	
}
