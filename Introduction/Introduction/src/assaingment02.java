import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assaingment02 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19292\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Select s=new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("4");
		Select n=new Select(driver.findElement(By.id("Childrens")));
		n.selectByVisibleText("5");
		Select i=new Select(driver.findElement(By.id("Infants")));
		i.selectByValue("1");
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigooo");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
		driver.close();
		
		
		
		
		
		
		
	}
}
