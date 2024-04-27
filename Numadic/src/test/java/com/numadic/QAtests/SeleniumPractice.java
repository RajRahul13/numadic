	package com.numadic.QAtests;

import java.io.File;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setupDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String Title = driver.getTitle();
		String currentURL = driver.getCurrentUrl();
		System.out.println(Title +" "+ currentURL);
		
		//image element
		List <WebElement> img = driver.findElements(By.tagName("img"));
		for(WebElement imge : img) {
		String height = imge.getAttribute("height");
		System.out.println(height);
		}
		
		//TakescreenShot
		TakesScreenshot ts = (TakesScreenshot)driver;
		String filename = System.getProperty("user.dir")+File.separator+"screenshotsDemo"+File.separator;
		File src = ts.getScreenshotAs(OutputType.FILE);
	
		try {
			FileUtils.copyFile(src, new File(filename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			String val = link.getText();
			System.out.println(val);
			
		//	verifyLink(url) ; //uncomment when need to find brokenlink
		}
		
		verifyWebTable();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		
	}
	
	
	public static void setupDriver() {
		//for opening in incognito mode
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
//			
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver(options);
			driver = new ChromeDriver(options);
			
	}
	
	//for verifying broken link
	public static void verifyLink(String url) {
		try {
		URL link = new URL(url);
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
		httpURLConnection.connect();


		if (httpURLConnection.getResponseCode() == 200) {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage());
		} else {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
		}
		} catch (Exception e) {
		System.out.println(url + " - " + "is a broken link");
		}
	}
	
	public static void verifyWebTable() {
		
		WebElement table = driver.findElement(By.id("table1"));
		
		
		//for finding rows
		List <WebElement> tr = table.findElements(By.tagName("tr"));
		
		//iterating through each rows
		for(int i=0;i<tr.size();i++) {
			WebElement row = tr.get(i);
		}
			//for getting heading in table
			List<WebElement> th = driver.findElements(By.tagName("th"));
			for(int j=0;j<th.size();j++) {
				WebElement head = th.get(j);
				String headtext = head.getText();
				System.out.println(headtext);
			}
			
			//
			
			List<WebElement> td = driver.findElements(By.tagName("td"));
			for(int j=0;j<td.size();j++) {
				WebElement data = td.get(j);
				String dataText = data.getText();
				System.out.println(dataText);
				
				//comment
			}
		
		
		
	}

		
}
