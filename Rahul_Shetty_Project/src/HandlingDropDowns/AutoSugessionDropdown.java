package HandlingDropDowns;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugessionDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//uL[@id='ui-id-1'] //Li"));
		for (WebElement option : options) {
			//System.out.println(option.getText());// if u want to print the list of options
			if (option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}

	}

}
