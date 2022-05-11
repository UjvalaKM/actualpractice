package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\DesktopData\\UKM\\Sellenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement we = driver.findElement(By.id("email"));
	we.sendKeys("Ujvala@123.com");
	String dd = we.getAttribute("value");
	System.out.println(dd);
	System.out.println(we.getAttribute("type"));
	}

}
