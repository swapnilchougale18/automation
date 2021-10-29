package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultContent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Desktop/frame/username.html");
		driver.findElement(By.id("un")).sendKeys("Swap");
		driver.switchTo().frame("frnm");
		driver.findElement(By.id("pwd")).sendKeys("Chougale");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("un")).clear();
	}

}
