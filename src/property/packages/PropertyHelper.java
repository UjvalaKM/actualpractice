
	package property.packages;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	public class PropertyHelper {
		private Properties proObj;
		
		public PropertyHelper(String fileName) 
		{
	       try {
			File f = new File(System.getProperty("user.dir")+"\\"+fileName);
				System.out.println(System.getProperty(key));
				FileInputStream fis = new FileInputStream(f);
				
				 proObj = new Properties();
				
				proObj.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
		
		
		public String getPropertyValue(String key)
		{		
			return proObj.getProperty(key);
		}

	}


