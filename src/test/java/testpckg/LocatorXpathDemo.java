package testpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		driver. get ("https://demo.opencart.com");
		
		//xpath with single attribute
		
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Tshirt");
		
		//xpath with multiple attribute
		
		
	}

}
