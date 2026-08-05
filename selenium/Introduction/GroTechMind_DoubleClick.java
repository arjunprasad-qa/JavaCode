package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GroTechMind_DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://grotechminds.com/registeration-form/");
		Thread.sleep(5000);

		WebElement E1 = driver.findElement(By.id("firstName"));
		E1.sendKeys("MKT");

		Actions a1 = new Actions(driver);
		a1.doubleClick(E1).perform();

		E1.sendKeys(Keys.CONTROL + "C");

		WebElement E2 = driver.findElement(By.id("lastName"));
		E2.sendKeys(Keys.CONTROL + "V");

	}
}
