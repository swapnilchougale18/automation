package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadPopup {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		driver.get("https:/www.selenium.dev");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		driver.findElement(By.xpath("//a[.='4.0.0']")).click();
	 
		//Runtime.getRuntime().exec("C:\\Users\\Admin\\git\\repository\\automationqsp\\Autoid\\download.exe");
       
		Robot robo = new Robot();
		for (int i = 0; i <4; i++) {
			robo.keyPress(KeyEvent.VK_TAB);
			robo.keyRelease(KeyEvent.VK_TAB);
		}
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
}

}