package Scrolling;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StillPerticulerWord {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		WebElement target = driver.findElement(By.xpath("//a[@class='button button-with-border']"));
		Point loc = target.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		Thread.sleep(3000);
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		jsc.executeScript("window.scrollBy("+xaxis+","+(yaxis-100)+")");
}}
