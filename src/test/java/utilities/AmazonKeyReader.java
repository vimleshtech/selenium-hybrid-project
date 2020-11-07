package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class AmazonKeyReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static Properties readData() {
		
		Properties prop =null;
		
		try {
			
			FileInputStream fs = new FileInputStream("C:\\Users\\Vimlesh.Kumar\\eclipse-workspace\\SeleniumExample\\src\\test\\java\\keyfiles\\testdata.properties");
			prop =new Properties();
			prop.load(fs);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return prop;
	}
	
	public static Properties readKeys() {
		
		Properties prop =null;
		try {
			FileInputStream fs =new FileInputStream("C:\\Users\\Vimlesh.Kumar\\eclipse-workspace\\SeleniumExample\\src\\test\\java\\keyfiles\\amazon-test-elements.properties");
			prop =new Properties();
			prop.load(fs);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return prop;
	}

}
