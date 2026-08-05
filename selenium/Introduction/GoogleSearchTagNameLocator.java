package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		WebElement searchbox = driver.findElement(By.tagName("textarea"));
		searchbox.sendKeys("door keys");

	}

}
