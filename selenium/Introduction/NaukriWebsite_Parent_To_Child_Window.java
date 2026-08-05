package selenium.Introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NaukriWebsite_Parent_To_Child_Window {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount");
		Thread.sleep(3000);

		WebElement E1 = driver.findElement(By.xpath("//span[text()='Google']"));
		E1.click();

		// Code for Parent child window pop up

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> i1 = ids.iterator();
		String parent = i1.next();
		String child = i1.next();

		driver.switchTo().window(child);
		Thread.sleep(2000);

		driver.quit();

	}
}
