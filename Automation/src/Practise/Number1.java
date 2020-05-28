package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Number1 {

	
	public static void main(String args[]) {
		
		System.setProperty("Webdriver.chrome.driver", "D:\\Eclipse\\Selenium\\chromedriver_win32\\.chromedriver.exe");
		
		WebDriver chrome =new ChromeDriver();
		
		chrome.get("");
		
		
	}
	
}
