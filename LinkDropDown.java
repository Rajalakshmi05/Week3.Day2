package Week3.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		allLinks.get(0).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		List<WebElement> newLinks = driver.findElements(By.tagName("a"));
		System.out.println(newLinks.get(1).getAttribute("href"));
		driver.close();

	}

}
