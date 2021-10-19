package xpath;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScannerUsingMyntra {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String search = sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys(search);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		Thread.sleep(3000);
    	driver.findElement(By.xpath("//label[text()='Puma']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Black']")).click();
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//label[text()='Rs. 6444 to Rs. 12629']")).click();
		Thread.sleep(3000);*/
		String price = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
		System.out.println(price);
		driver.close();

	}
}
