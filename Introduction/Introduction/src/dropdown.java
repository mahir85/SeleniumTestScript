import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19292\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//To verify check box checked or not friendsandfamily
		System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
		//To get the checkbox count
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		//driver.findElement(By.id("divpaxinfo")).click();
		//System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
		//Thread.sleep(2000);
		//Select s=new Select(driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_Adult\']")));
		//s.selectByValue("5");
		//s.selectByIndex(3);
		//s.selectByVisibleText("9");
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//driver.close();
		//driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		//driver.findElement(By.xpath("//a[@value='CCU']")).click();
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='CCU'] //a[@value='CCU']")).click();
		
	}
}	
