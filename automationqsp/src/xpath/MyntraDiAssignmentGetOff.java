package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraDiAssignmentGetOff {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Jacket");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[1]")).click();
		driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label']/ancestor::div[@class='condition-render-verticalFilters condition-render-boundary-top']/descendant::label[@class='vertical-filters-label common-customCheckbox'])[3]")).click();

		String off = driver.findElement(By.xpath("(//span[@class='product-discountPercentage'])[1]")).getText();
		System.out.println(off);

	}}