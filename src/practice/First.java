package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\\\DesktopData\\\\UKM\\\\Sellenium\\\\chromedriver.exe");
WebDriver  driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://demoqa.com/");
Actions act=new Actions(driver);

//act.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Element')]"))).click().perform();;
JavaScriptHelper js = new JavaScriptHelper(driver);
js.scrollDownVertically();
driver.findElement(By.xpath("//*[text()='Elements']")).click();

	driver.findElement(By.className("text")).click();;
	WebDriverWait wt=new WebDriverWait(driver,10);
//	wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userName"))));
	driver.findElement(By.id("userName")).click();
	
	driver.findElement(By.id("userEmail")).sendKeys("ujvala@malinator.com");
	driver.findElement(By.id("currentAddress")).sendKeys("Mumbai");
	driver.findElement(By.id("permanentAddress")).sendKeys("Solapur");
	//js.scrollDownVertically();
	driver.findElement(By.id("submit")).click();
	}

}
