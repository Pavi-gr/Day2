package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BoweserLaunch {
	
	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver(); add some one
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
				
		
		
		driver.get("https://www.facebook.com/");
		
	}

}
