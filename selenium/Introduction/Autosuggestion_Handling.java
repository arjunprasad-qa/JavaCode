package selenium.Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Handling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.id("APjFqb")).sendKeys("Bangalore");
		Thread.sleep(3000);

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		int counts = list.size();
		System.out.println("Counts of Autosuggestion : " + counts);

		// clicking on 2nd option in Auto suggestion
		list.get(1).click();

	}
}
