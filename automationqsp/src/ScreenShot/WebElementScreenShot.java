package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebElementScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.google.com");
		
		WebElement target = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		
		File src = target.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/Scr6.jpeg");
		Files.copy(src, dest);
		driver.close();

}
}
