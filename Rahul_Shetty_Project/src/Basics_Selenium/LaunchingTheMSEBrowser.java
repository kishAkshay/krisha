package Basics_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingTheMSEBrowser {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.pavanonlinetrainings.com/");
	}

}
