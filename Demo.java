package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//For Valid Credentials
		
		WebElement D = driver.findElement(By.cssSelector("#user-name"));
		D.click();
		D.sendKeys("standard_user");
		
		WebElement D1 = driver.findElement(By.cssSelector("#password"));
		D1.click();
		D1.sendKeys("secret_sauce");
		
		WebElement D2 = driver.findElement(By.cssSelector("#login-button"));
		D2.click();
		System.out.println("Successful!");
		Thread.sleep(3000);
		driver.navigate().back();
		
		
		
		
		//For Invalid Credentials
		// 1. Valid Username, Invalid Password
		WebElement D4 = driver.findElement(By.cssSelector("#user-name"));
		D4.click();
		D4.sendKeys("standard_user");
		
		WebElement D5 = driver.findElement(By.cssSelector("#password"));
		D5.click();
		D5.sendKeys("secret_");
		
		WebElement D6 = driver.findElement(By.cssSelector("#login-button"));
		D6.click();
		
		System.out.println("Invalid Login Error: Epic sadface: Username and password do not match any user in this service!");
		Thread.sleep(3000);
		
		
		
		//2. Invalid Username, Valid Password
//		WebElement D7 = driver.findElement(By.cssSelector("#user-name"));
//		D7.click();
//		D7.sendKeys("standard_user");
//		
//		WebElement D8 = driver.findElement(By.cssSelector("#password"));
//		D8.click();
//		D8.sendKeys("secret_");
//		
//		WebElement D9 = driver.findElement(By.cssSelector("#login-button"));
//		D9.click();
//		
//		System.out.println("Invalid Login Error: Epic sadface: Username and password do not match any user in this service!");
//		Thread.sleep(3000);
//		
//		
//		
////		//3. Invalid username, Inavlid password
//		WebElement D10 = driver.findElement(By.cssSelector("#user-name"));
//		D10.click();
//		D10.sendKeys("standard_user");
//		
//		WebElement D11 = driver.findElement(By.cssSelector("#password"));
//		D11.click();
//		D11.sendKeys("secret_");
//		
//		WebElement D12 = driver.findElement(By.cssSelector("#login-button"));
//		D12.click();		
//		System.out.println("Invalid Login Error: Epic sadface: Username and password do not match any user in this service!");
//		Thread.sleep(3000);
//		
		
		
	}

}
