package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_PartialLinkText_Selenium {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.google.com"); Thread.sleep(3000);
		 * driver.findElement(By.linkText("About")).click();
		 */

		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Mobiles")).click();
		driver.manage().window().maximize();

		driver.findElement(By.partialLinkText("Kitchen")).click();

	}

}
