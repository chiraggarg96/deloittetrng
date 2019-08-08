package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo_properties {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		
		FileReader reader= new FileReader("BatchMates.txt");
		
		properties.load(reader);
		
		System.out.println(properties.get("username"));
		

	}

}
