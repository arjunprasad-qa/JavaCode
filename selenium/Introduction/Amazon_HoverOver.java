package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HoverOver {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);

		WebElement E1 = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(E1).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();

		Thread.sleep(2000);
		WebElement emailID = driver.findElement(By.id("ap_email_login"));
		emailID.sendKeys("8293476245");

		WebElement continuebutton = driver.findElement(By.id("continue"));
		continuebutton.click();
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Arjun@123");

		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
		Thread.sleep(3000);

	}

}
