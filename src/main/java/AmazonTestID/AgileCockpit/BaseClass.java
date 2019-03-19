package AmazonTestID.AgileCockpit;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public void getpart(int product) {
		// TODO Auto-generated method stub
		List<WebElement> itemList = AppleWatch.driver.findElements(By.xpath("//*[contains(@data-attribute,'Apple')]"));
		for (WebElement Item : itemList) {
			System.out.println("List items are " + Item.getText());
		}

		for (int i = 0; i < itemList.size(); i++) {

			if (i == product) {
				System.out.println(itemList.get(i).getText());

				List<WebElement> price = AppleWatch.driver.findElements(By.xpath(
						"//div[@class='a-fixed-left-grid-col a-col-right']//div//div//span[@class='a-size-base a-color-price s-price a-text-bold']"));
				for (int j = i; j < price.size(); j++) {
					if (j == product) {
						System.out.println(price.get(j).getText());
						break;
					}
				}

			}
		}

	}

	public void rating(int product) {
		List<WebElement> rating = AppleWatch.driver
				.findElements(By.xpath("//*[contains(@class,'a-size-small a-link-normal a-text-normal')]"));

		for (WebElement R : rating) {
			System.out.println("List rating are" + R.getText());
		}

		for (int j = 0; j < rating.size(); j++) {
			if (j == product) {
				System.out.println("Rating is =   " + rating.get(j).getText());
				break;
			}
		}
	}

	public void getUrl(String URL) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nsneh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		AppleWatch.driver = new ChromeDriver();
		AppleWatch.driver.get(URL);
		AppleWatch.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void type(String Data) {
		WebElement element = AppleWatch.driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys(Data);

	}

	public void butt() {
		WebElement element = AppleWatch.driver.findElement(By.xpath(".//*[@value='Go']"));
		element.click();
	}

}
