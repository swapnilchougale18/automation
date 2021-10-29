package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Automation/AlertPopup.html");
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Thread.sleep(5000);
		Alert al = driver.switchTo().alert();
		al.accept();
	}

}
