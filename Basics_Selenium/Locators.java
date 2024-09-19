package Basics_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("akshay");
		driver.findElement(By.name("inputPassword")).sendKeys("ak@1234%");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Akshay");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("akshay@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9900630204");
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.cssSelector("p[class='infoMsg']")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("p[style*='color']")).getText());
		driver.findElement(By.xpath("//button[text()='Log Out']"));
		
	}

}
