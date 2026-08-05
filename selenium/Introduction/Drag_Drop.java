package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(5000);

		WebElement drag = driver.findElement(By.id("drag4"));

		WebElement drop = driver.findElement(By.id("div2"));

		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
	}

}
