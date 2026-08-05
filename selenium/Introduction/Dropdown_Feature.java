package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Feature {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		WebElement E1 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

		Select dropdown = new Select(E1);
		dropdown.selectByIndex(2);
		// dropdown.selectByValue("search-alias=alexa-skills");
		// dropdown.selectByVisibleText("Appliances");

	}

}
