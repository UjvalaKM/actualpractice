import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\DesktopData\\UKM\\Sellenium\\chromedriver.exe");
	System.setProperty("webdriver.edge.driver","D:\\DesktopData\\UKM\\Sellenium\\msedgedriver.exe");
	//ChromeDriver cd=new ChromeDriver();
		
	//	System.setProperty("webdriver.chrome.driver", "D:\\DesktopData\\UKM\\Sellenium\\chromedriver.exe");

		ChromeDriver chDriver = new ChromeDriver();
		//ChromeDriver chDriver2 = new ChromeDriver();		
	//	EdgeDriver edDriver = new EdgeDriver();
		
		
		
		//edDriver.get("http://demo.automationtesting.in/Register.html");
		chDriver.get("https://www.javatpoint.com/");
	//	chDriver2.get("http://demo.automationtesting.in/Register.html");
		
		chDriver.close();
	//	edDriver.close();
	//	chDriver2.close();
		
	}



	
	}


