package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_RelativeXPath {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement w1 = driver.findElement(By.xpath("//textarea"));
		w1.sendKeys("Toys" + Keys.ENTER);
		// driver.close();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		WebElement f1 = driver.findElement(By.xpath("(//input)[5]"));
		f1.sendKeys("MotorCar" + Keys.ENTER);

	}

}
