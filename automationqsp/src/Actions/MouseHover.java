package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		WebElement target = driver.findElement(By.xpath("//a[@title='Rings' and .='Rings ']"));
         Actions act = new Actions(driver);
         act.moveToElement(target).perform();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//a[.='Engagement']")).click();
}}
