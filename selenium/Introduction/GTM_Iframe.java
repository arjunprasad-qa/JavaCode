package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GTM_Iframe {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.grotechminds.com");
		driver.manage().window().maximize();
		Thread.sleep(11000);
		WebElement E1 = driver.findElement(By.id("chat-bot-launcher-button"));
		E1.click();
		Thread.sleep(2000);
		driver.switchTo().frame("chat-bot-iframe");
		Thread.sleep(2000);
		driver.findElement(By.id("textInput")).sendKeys("Sumit");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://grotechminds.com/courses/']")).click();

	}

}
