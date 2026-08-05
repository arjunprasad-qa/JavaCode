package selenium.Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks_google {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.tagName("a"));

		int linkCount = list.size();
		System.out.println("No. of Links : " + linkCount);

		for (int i = 0; i < linkCount; i++) {
			WebElement e1 = list.get(i);
			String str1 = e1.getDomAttribute("href");
			System.out.println(str1);
			String str2 = e1.getText();
			System.out.println("LinkText :" + str2);
		}

	}

}
