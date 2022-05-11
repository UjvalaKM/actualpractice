package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\DesktopData\\UKM\\Sellenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement email = driver.findElement(By.xpath("//form//div//input"));
	email.sendKeys("Sharvi");
	List<WebElement> ele = driver.findElements(By.xpath("//form//div//input"));
	int i=1;
	
	for(WebElement each:ele)
	{
		each.sendKeys("Ujvala"+i);
		i++;
	}
	}

}
