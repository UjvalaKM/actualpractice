package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\DesktopData\\UKM\\Sellenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement fb = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
	String str = fb.getCssValue("font-family");
	System.out.println(str);
	String a = fb.getCssValue("vertical-align");
	System.out.println(a);
	String b = fb.getCssValue("text-align");
	System.out.println(b);
	String color=fb.getCssValue("color");
	System.out.println(color);
	String size=fb.getCssValue("font-size");
	System.out.println(size);
	}

}
