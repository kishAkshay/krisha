package Basics_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reseting_PWD {

	public static void main(String[] args) throws InterruptedException {
		String name = "rahul";
		WebDriver driver = new FirefoxDriver();
		Reseting_PWD callmethod = new Reseting_PWD();
		String realpassword = callmethod.getpassword(driver);
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(realpassword);
		Thread.sleep(1000);
		driver.findElement(By.className("signInBtn")).click();

	}

	public String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		Thread.sleep(1000);
		String gettext = driver.findElement(By.cssSelector("p[class*='infoMsg']")).getText();
		// Please use temporary password 'rahulshettyacademy' to Login.

		String[] splittext1 = gettext.split("'");
		// index[0]- Please use temporary password
		// index[1]- rahulshettyacademy' to Login.
		String[] splittext2 = splittext1[1].split("'");
		// index[0]- rahulshettyacademy
		// index[1]- to Login.
		String actualpassword = splittext2[0];
		return actualpassword;

	}

}
