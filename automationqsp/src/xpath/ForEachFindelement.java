package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEachFindelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("bike");
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]/span"));
		
		for (WebElement we:suggestions) {
			String text=we.getText();
			 System.out.println(text);
			 
			
		}
		driver.close();

	}

}
