package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));

		if (e1.isDisplayed() && e1.isEnabled()) {
			e1.sendKeys("toys" + Keys.ENTER);
		} else {
			System.out.println("YOur componnet is either absent or disable");
		}

	}

}
