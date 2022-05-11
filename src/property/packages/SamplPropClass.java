package property.packages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SamplPropClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f=new File(System.getProperty("C:\\Users\\SHREE\\eclipse-workspace\\SeleniumWorkspace\\PropertyFilePractice.properties"));
FileInputStream fis=new FileInputStream(f);
Properties prop=new Properties();
prop.load(fis);
System.out.println(prop.getProperty("baseUrl"));
System.out.println(prop.getProperty("useName"));
System.out.println(prop.getProperty("pass"));
	}

}
