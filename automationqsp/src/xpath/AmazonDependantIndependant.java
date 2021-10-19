package xpath;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDependantIndependant {
public static void main(String[] args) throws InterruptedException {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name of laptop");
	String laptopName=sc.nextLine();
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys(laptopName);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(3000);
	String prizeOfLap = driver.findElement(By.xpath("//span[.='"+laptopName+"']/ancestor::div[@class='a-section a-spacing-none']/descendant::span[@class='a-price-whole']")).getText();
	System.out.println(prizeOfLap);
	driver.close();
	
}
}
