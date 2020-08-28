import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assiagmnet {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\19292\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//To check CheckBox
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		Thread.sleep(3000);
		// To Unchecked the Check box
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		//To Verify Successfully Unchecked expected output should be False
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		// To get the count of Check Boxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
