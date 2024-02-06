package com.numadic.QAtests;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
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
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			
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
			
			WebDriverManager.chromedriver().setup();
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
		
		//for finding rows
		List <WebElement> rows = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		int rowNum = rows.size();
		
		//for finding columns
		List <WebElement> cols = driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th"));
		int cloNum = cols.size();
		
		for(WebElement header : cols) {
			String headername = header.getText();
			System.out.print(headername+" ");
		}
		
		List<WebElement> ElementNo = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr/td"));
		int EleNum = ElementNo.size();
		System.out.println();
		for(WebElement ele : ElementNo) {
			String eleVal = ele.getText();
			System.out.print(eleVal+" ");
		
		}
		
	}

		
}
