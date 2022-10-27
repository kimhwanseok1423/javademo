package ncs.test12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("1", "apple,1200,3");
		prop.setProperty("2", "banana,2500,2");
		prop.setProperty("3", "grape,4500,5");
		prop.setProperty("4", "orange,800,10");
		prop.setProperty("5", "melone,500,2");
		fileSave(prop);
		//fileOpen(prop);
	}
	public static void fileSave(Properties p) {
		try {
			p.storeToXML(new FileOutputStream("./src/ncs/test12/data.xml"),null);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
