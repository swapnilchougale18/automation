

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMyntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.myntra.com");

		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("jacket");
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();

		driver.findElement(By.xpath("//label[@class='common-customRadio gender-label']/descendant::input[@value='men,men women']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='vertical-filters-label common-customCheckbox']/descendant::input[@value='Puma']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class=\"common-customCheckbox vertical-filters-label\"]/descendant::input[@value=\"1124.0 TO 4006.0\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[@class='common-customCheckbox'])[4]")).click();
		Thread.sleep(3000);
		String prize = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
		System.out.println(prize);



	}

}