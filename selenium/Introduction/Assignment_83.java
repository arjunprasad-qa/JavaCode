package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_83 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);

		driver.findElement(By.id("APjFqb")).sendKeys("India");
		Thread.sleep(3000);

		// Action done by user by clicking search button
		driver.findElement(By.name("btnK")).click();

	}

}
