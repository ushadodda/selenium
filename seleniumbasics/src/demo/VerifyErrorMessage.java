package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("doddausha@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Password");
		
		driver.findElement(By.id("loginbutton")).click();
		
	}

}
