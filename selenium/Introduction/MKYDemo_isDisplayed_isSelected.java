package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MKYDemo_isDisplayed_isSelected {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/GroTech%20Mind/learningHTML1.html");
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.name("name2"));

		if (e1.isDisplayed()) {
			if (e1.isSelected()) {
				System.out.println("Already selected checkbox");
			}

			else {
				System.out.println("Checkbox not selected ,please select");
				Thread.sleep(4000);
				e1.click();
			}
		}

	}

}
