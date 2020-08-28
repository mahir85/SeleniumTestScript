import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19292\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("Hello World");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Hello world");
		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println (driver.findElement(By.xpath("//*[@id=\'error\']")).getText());
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='CCU']")).click();
	}

}
