package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependantAndIndependant {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("samsung");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		Thread.sleep(4000);	
		 String mobilePrize = driver.findElement(By.xpath("//div[.=\"SAMSUNG Galaxy F12 (Sky Blue, 64 GB)\"]/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[@class=\"_30jeq3 _1_WHN1\"]")).getText();
		System.out.println(mobilePrize);
	}

}
