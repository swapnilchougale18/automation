package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMultipleOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Desktop/Automation/multipleselectdropdown.html");
		WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdown);
		for (int i = 0; i <=5; i++) 
		{
			sel.selectByIndex(i);
			Thread.sleep(3000);

		}
	  for (int i = 0; i <=5; i++) {
		  sel.deselectByIndex(i);
		  Thread.sleep(2000);
		
	}

		driver.close();
	}

}
