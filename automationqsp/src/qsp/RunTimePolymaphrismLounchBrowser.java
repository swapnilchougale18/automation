package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymaphrismLounchBrowser {
public static void main(String[] args)throws InterruptedException {
	WebDriver driver;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the browser name that you want to open");
	String browserValue = sc.nextLine();
	
	if(browserValue.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.close();
		
	}
	else if(browserValue.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.close();
}
	else
	{
		System.out.println("enter valid input");
	}
	}
}
