package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class UsingEventFirringWebDriver {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.selenium.dev");
		EventFiringWebDriver ts = new EventFiringWebDriver(driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/Scr5.jpeg");
		Files.copy(src, dest);
		driver.close();
	}
}
