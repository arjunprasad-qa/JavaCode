package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MKTDemoSite_BoyCheckbox_AbsoluteXPath {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/user/OneDrive/Desktop/GroTech%20Mind/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		;

		WebElement w1 = driver.findElement(By.xpath("(/html/body/form[2])/input[1]"));
		w1.click();

		WebElement w2 = driver.findElement(By.xpath("(/html/body/input[5])"));
		w2.click();

	}

}
