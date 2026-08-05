package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_RightClick {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		Thread.sleep(5000);

		WebElement E1 = driver.findElement(By.xpath("//a[text()='About']"));
		Actions a1 = new Actions(driver);
		a1.contextClick(E1).perform();
	}

}
