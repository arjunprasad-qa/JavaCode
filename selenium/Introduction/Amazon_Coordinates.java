package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Coordinates {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//a[text()='Amazon Science']"));
		int x = e1.getLocation().getX();
		int y = e1.getLocation().getY();
		System.out.println("X Axis : " + x + " and " + "Y axis :" + y);

		int x1 = e1.getSize().getHeight();
		int y1 = e1.getSize().getWidth();
		System.out.println("Height : " + x1 + " and " + "Width :" + y1);

	}
}