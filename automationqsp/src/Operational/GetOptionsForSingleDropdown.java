package Operational;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsForSingleDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Desktop/Automation/singleselectdropdown.html");
	      WebElement dropdown = driver.findElement(By.id("menu"));
	     Select sel = new Select(dropdown);
	    List<WebElement> options = sel.getOptions();
	    for (int i = 0; i < options.size(); i++) {
	    	String name = options.get(i).getText();
	    	 System.out.println(name);
		}
       
        driver.close();
	}

}
