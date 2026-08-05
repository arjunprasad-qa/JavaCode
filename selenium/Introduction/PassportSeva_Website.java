package selenium.Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PassportSeva_Website {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String url = "https://services1.passportindia.gov.in/forms/registration?_gl=1%2A1tqecv1%2A_ga%2AMTU3OTQ1ODE0MS4xNzg0NDM2OTMx%2A_ga_B4255W3J9F%2AczE3ODQ0MzY5MzEkbzEkZzEkdDE3ODQ0MzgzMDAkajYwJGwwJGgw%2A_ga_JTJJBP5DNH%2AczE3ODQ0MzY5MzEkbzEkZzEkdDE3ODQ0MzgzMDAkajYwJGwwJGgw";
		driver.get(url);
		Thread.sleep(3000);
		WebElement E1 = driver.findElement(By.xpath("(//div[@data-focusable='true'])[8]"));
		E1.click();

		WebElement E2 = driver.findElement(By.xpath("//select"));
		Select dropdown = new Select(E2);
		dropdown.selectByValue("8");

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Arjun123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("test123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[20]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("arjun22");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Arjun$$11");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Clear']")).click();

	}
}
