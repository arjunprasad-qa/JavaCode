package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchProduct_Click1stProduct_WebElement {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
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
		password.sendKeys("password123");

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
		Thread.sleep(1000);
		driver.close();

	}

}
