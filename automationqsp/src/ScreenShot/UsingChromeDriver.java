package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class UsingChromeDriver {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:/www.google.com");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/Scr1.jpeg");
		Files.copy(src, dest);
		driver.close();
}}
