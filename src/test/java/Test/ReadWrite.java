package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
	
		Properties properties = new Properties();
		FileInputStream inputStream = new FileInputStream("/Users/phyothihaoo/eclipse-workspace/SeleniumPractice/src/test/resources/Properties/testData.properties");
		properties.load(inputStream);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		
		FileOutputStream outputStream = new FileOutputStream("/Users/phyothihaoo/eclipse-workspace/SeleniumPractice/src/test/resources/Properties/testData.properties");
		
		properties.setProperty("testdata", "001");
		properties.store(outputStream, "This is customer ID");
		
		
	}

}
