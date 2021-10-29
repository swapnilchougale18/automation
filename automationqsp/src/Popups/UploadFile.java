package Popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://smallpdf.com/pdf-to-word");
		driver.findElement(By.xpath("//span[.='Choose Files']")).click();
		Runtime.getRuntime().exec("C:\\Users\\Admin\\git\\repository\\automationqsp\\Autoid\\FileOpen.exe");
	}

}
