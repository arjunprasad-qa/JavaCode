package selenium.Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignmet_87 {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver = new EdgeDriver();
		// ChromeDriver driver = new ChromeDriver(options);

		Thread.sleep(3000);
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		driver.manage().window().maximize();

		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Toys" + Keys.ENTER);

		List<WebElement> list = driver.findElements(By.className("a-button-text"));

		int addToCart = list.size();
		System.out.println("Count of Add to Card button :" + addToCart);
		Thread.sleep(3000);
		// driver.close();

	}

}
