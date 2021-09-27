package methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPostion {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Dimension arg0= new Dimension(300,200);
	driver.manage().window().setSize(arg0);
	Point arg01=new Point(400, 300);
	driver.manage().window().setPosition(arg01);

	}

}
