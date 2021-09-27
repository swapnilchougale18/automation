package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/download");
		Thread.sleep(2000);
		String titleOfWebPage = driver.getTitle();
		System.out.println(titleOfWebPage);
		driver.close();
		

	}

}
