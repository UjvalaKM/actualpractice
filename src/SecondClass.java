import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\DesktopData\\UKM\\Sellenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		By em=By.id("email");
		WebElement emailId = driver.findElement(em);
		emailId.sendKeys("XYZ");
		By ps=By.name("pass");
		WebElement password = driver.findElement(ps);
		
		password.sendKeys("1234");
		By btn=By.name("login");
		WebElement button = driver.findElement(btn);
		button.click();
	}

}
