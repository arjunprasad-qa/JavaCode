package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Witout_SelectClass {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		WebElement E1 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		// E1.click();
		E1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		E1.sendKeys(Keys.ARROW_DOWN);
		// E1.click();
	}

}
