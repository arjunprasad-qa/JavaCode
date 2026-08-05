package selenium.Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Autosuggestion_Handling2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);

		// Application based Pop up
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("q")).sendKeys("Shoes");
		Thread.sleep(3000);

		List<WebElement> list = driver.findElements(By.xpath("//form/ul/li"));
		int counts = list.size();
		System.out.println("Counts of Autosuggestion : " + counts);

		// clicking on 2nd option in Auto suggestion
		list.get(1).click();

	}
}
