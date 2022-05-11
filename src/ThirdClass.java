import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\DesktopData\\UKM\\Sellenium\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("ABC");
driver.findElement(By.name("pass")).sendKeys("1234");
driver.findElement(By.name("login")).click();
	}

}
