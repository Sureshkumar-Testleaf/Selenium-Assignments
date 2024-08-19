package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LauchURL {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.close();
		
	}

}

//syntax for find elements or Locators

//driver.findelement(by.locator("value"))
