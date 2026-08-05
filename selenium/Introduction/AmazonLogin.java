package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(3000);
		driver.manage().window().maximize();

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
		Thread.sleep(3000);
		driver.close();

	}

}
