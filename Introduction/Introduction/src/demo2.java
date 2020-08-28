import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19292\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Hello world");
		//driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("hello world");
		//driver.findElement(By.xpath("//input[@id='Login']")).click();
		//System.out.println (driver.findElement(By.cssSelector("#error")).getText());
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("hellow");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("flld");
		driver.findElement(By.cssSelector("input[id='Login'] ")).click();
		//System.out.println (driver.findElement(By.xpath("//*[@id='error']")).getText());
		System.out.println (driver.findElement(By.xpath("//*[@id='error']")).getText());
		
		
	}

}
