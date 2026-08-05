package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MKTDemoSite {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/GroTech%20Mind/learningHTML1.html");
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.tagName("a"));
		e1.click();
		Thread.sleep(5000);
		driver.close();

	}

}
