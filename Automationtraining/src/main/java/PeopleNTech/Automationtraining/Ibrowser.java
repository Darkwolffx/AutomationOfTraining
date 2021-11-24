package PeopleNTech.Automationtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowser {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //1)How to open the browser
	    for(int i=1;i<=5;i++)
	    {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chase Wolff\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
	
    driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.com");
	driver.manage().window().maximize();
	Thread.sleep(500);
	driver.navigate().refresh();
	Thread.sleep(500);
	driver.navigate().back();
	Thread.sleep(500);
	driver.navigate().forward();
	Thread.sleep(500);
	driver.getWindowHandle();
	System.out.println(driver.getWindowHandle());
	driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	driver.close();
	}
	}
}
