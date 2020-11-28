package org.jenkins.com.JenkinsProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System. setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		// Initialize browser.
		 driver=new ChromeDriver();
		 System.out.println("running");
		 driver.get("https://accounts.google.com/");

	}

}
