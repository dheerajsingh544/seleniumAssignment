package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readUserData {
	
	public static Properties readData() throws IOException {
	Properties prop=new Properties();
	FileInputStream ip;
	try {
		ip = new FileInputStream("C:\\Users\\3pg.itgroup\\eclipse-seleniumtrainig\\session1\\config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return prop;
}
}
