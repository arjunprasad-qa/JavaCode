package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Popup {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(5000);

		WebElement E1 = driver.findElement(By.id("file"));
		E1.sendKeys("C:\\Users\\user\\OneDrive\\Desktop\\GroTech Mind\\Sample.xlsx");

	}

}
