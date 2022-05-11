import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\DesktopData\\UKM\\Sellenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@placeholder='Email address or phone number']")).sendKeys("Harshel");

driver.findElement(By.linkText("Facebook Lite")).click();
driver.findElement(By.partialLinkText("Voting Information")).click();
	}

}
