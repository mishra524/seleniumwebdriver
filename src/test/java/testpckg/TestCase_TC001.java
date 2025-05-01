package testpckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_TC001 {

	public static void main(String[] args) {
		
		//ChromeDriver driver1 = new ChromeDriver();//ChromeDriver is a class - Here, we are creating object through a Constructor which will launch Chrome browser
		//OR
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.opencart.com");
		driver.get("https://google.co.in");
		
		driver.manage().window().maximize();
		
		String expTitle= driver.getTitle();
		String actTitle= "Your Store";
		
		if (expTitle.equals(actTitle))
		{
			System.out.println("This is a Passed Test");
		}
		else
			System.out.println("This is a Failed Test");

	
	driver.close();
	}

}
