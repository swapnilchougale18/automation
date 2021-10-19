package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathOrangeHrm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[.='PIM']")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Swapnil");
	    driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("Sanjay");
	    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Chougale");
	    driver.findElement(By.xpath("//input[@class='formInputText valid']"));
	    driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	}
}