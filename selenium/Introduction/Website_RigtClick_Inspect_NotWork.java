package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Website_RigtClick_Inspect_NotWork {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retailnetbanking.icici.bank.in/login-page");
		Thread.sleep(4000);
		driver.manage().window().maximize();

		WebElement E1 = driver.findElement(By.id("user-id"));
		E1.sendKeys("1234567");
		Thread.sleep(2000);
	}

}
