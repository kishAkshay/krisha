package Basics_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Following_Sibling {

	public static void main(String[] args) {
		//// header/div[3]//nav/div[2]//Li[5]
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com");
		System.out.println(
				driver.findElement(By.xpath("//header/div[3]//nav//Li[4]/following-sibling::Li[1]")).getText());

	}

}
