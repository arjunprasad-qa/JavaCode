package selenium.Introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_AddToWishlist {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

		WebElement E1 = driver.findElement(By.id("nav-link-accountList"));
		Thread.sleep(2000);
		Actions a1 = new Actions(driver);
		a1.moveToElement(E1).perform();

		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
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

		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Toys" + Keys.ENTER);
		Thread.sleep(4000);

		// How to Search the product and click on the 1st Product with List<WebElement>
		/*
		 * 
		 * List<WebElement> first_prod =
		 * driver.findElements(By.xpath("//img[@class='s-image']"));
		 * first_prod.get(0).click();
		 * 
		 */

		// How to Search the product and click on the 1st Product with WebElement
		WebElement first_prod = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		first_prod.click();
		Thread.sleep(2000);

		// Code for Parent child window pop up

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> i1 = ids.iterator();
		String parent = i1.next();
		String child = i1.next();

		driver.switchTo().window(child);
		Thread.sleep(2000);

		WebElement E2 = driver.findElement(By.id("add-to-wishlist-button-submit"));
		E2.click();
		Thread.sleep(2000);
		WebElement continueShopping = driver.findElement(By.id("continue-shopping"));
		continueShopping.click();
		Thread.sleep(3000);
		driver.quit();

	}

}
