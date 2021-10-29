package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Automation/confirmationPopup.html");
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Thread.sleep(5000);
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

}



