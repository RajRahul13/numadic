package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop = new Properties();
	static String projectPatch = System.getProperty("user.dir");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
		getProperties();

	}

	public static void getProperties() {

		String projectPatch = System.getProperty("user.dir");
		InputStream input = null;
		try {
			input = new FileInputStream(projectPatch+"/src/test/java/config/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			prop.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browser = prop.getProperty("browser");
		String name = prop.getProperty("name");
		System.out.println(browser + name);
	}

	public static void setProperties() {
		try {
			OutputStream output = new FileOutputStream(projectPatch+"/src/test/java/config/config.properties");
			prop.setProperty("browser", "FireFox");
			prop.setProperty("name", "Rahul");
			prop.store(output, null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	};



}
