package selenium.Introduction;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_AmazonLoginPage {

	public static void main(String[] args) throws InterruptedException, IOException {

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
		password.sendKeys("Arjun@@@1883");

		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
		Thread.sleep(3000);

		Date d1 = new Date();
		System.out.println(d1);
		String dateFormat1 = d1.toString();
		String dateFormat2 = dateFormat1.replace(":", " ");

		// Screenshot code
		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		/*
		 * File dest = new File(
		 * "C:\\Users\\user\\eclipse-workspace\\selenium68Batch\\Screenshot\\TestCase1"
		 * + Math.random() + ".png");
		 */

		// File dest = new
		// File("C:\\\\Users\\\\user\\\\eclipse-workspace\\\\selenium68Batch\\\\Screenshot\\\\TestCase1"+
		// new Screenshot_AmazonLoginPage().getClass() + ".png");

		File dest = new File(
				"C:\\Users\\user\\eclipse-workspace\\selenium68Batch\\Screenshot\\TestCase1" + dateFormat2 + ".png");

		FileHandler.copy(source, dest);
	}

}
