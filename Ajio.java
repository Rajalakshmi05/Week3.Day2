package Week3.Day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(" https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags", Keys.ENTER);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);
		System.out.println("Number of Brand names");
		List<WebElement> appa = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + appa.size());
		for(WebElement ram:appa)	{
			String names=ram.getText();
			System.out.println(names);
		}
		List<WebElement> daddy = driver.findElements(By.className("nameCls"));
		System.out.println("Size"+daddy.size());
		for(WebElement son:daddy) {
			String name=son.getText();
			System.out.println(name);
			}
		List<WebElement> full = driver.findElements(By.className("Price"));
			System.out.println("Price:"+full.size());
			for(WebElement single:full) {
				String howmuch=single.getText();
			System.out.println(howmuch);
			}
			}


}
