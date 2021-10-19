package Freams;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='widget-global-2zgg1b066f5']")).click();
		//driver.findElement(By.xpath("//input[@id='name']"));
		//driver.findElement(By.xpath("//input[@id='email']"));
	}

}
