package selenium.Introduction;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrower_Class {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver = new EdgeDriver();
		// ChromeDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		String s1 = driver.getTitle();
		System.out.println(s1);

		String s2 = driver.getWindowHandle();
		System.out.println(s2);

		Set<String> s3 = driver.getWindowHandles();
		System.out.println(s3);
		driver.findElement(By.id("ap_email_login")).sendKeys("arjun1991@gmail.com");
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.id("ap_password")).sendKeys("password123");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(3000);

		driver.quit();
	}

}
