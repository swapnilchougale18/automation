package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class udemyLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.udemy.com/join/login-popup/");
		Thread.sleep(1000);
		driver.findElement(By.id("email--1")).sendKeys("Admin123");
		driver.findElement(By.id("id_password")).sendKeys("admin123");
		driver.findElement(By.id("submit-id-submit")).click();

	}
}
