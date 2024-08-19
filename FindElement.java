package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
				
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("9710044771");
	driver.findElement(By.id("pass")).sendKeys("591007");
	driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	Thread.sleep(3000);
	if(title.contains("Facebook"))
	{
		System.out.println("Success");
	}
	else {
		System.out.println("Fail");
	}
	driver.close();
 }

}
