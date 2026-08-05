package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_84 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);

		/*
		 * // Action done by user by clicking on Enter button on Keyboard
		 * 
		 * driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		 */

		driver.findElement(By.id("APjFqb")).sendKeys("India" + Keys.ENTER);

	}

}
