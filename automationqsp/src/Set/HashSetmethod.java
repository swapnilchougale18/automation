package Set;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashSetmethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Desktop/Automation/singleselectdropdown.html");
		WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdown);
		List<WebElement> optionsofDropdown = sel.getOptions();

		HashSet<String>s = new HashSet<String>();

		for (int i = 0; i < optionsofDropdown.size(); i++) {
			String options = optionsofDropdown.get(i).getText();
			s.add(options);


		}
		for(String swap:s)
		{
			System.out.println(swap);
		}
		driver.close();
	}
}
