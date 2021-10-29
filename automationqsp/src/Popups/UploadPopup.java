package Popups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadPopup {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='PIM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Add Employee']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("abc");
		driver.findElement(By.id("middleName")).sendKeys("xyz");
		driver.findElement(By.id("lastName")).sendKeys("jkl");
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys("18");
		
		WebElement target = driver.findElement(By.id("photofile"));
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("");
		
		
		
		
		
	}

}