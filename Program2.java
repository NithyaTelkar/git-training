import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestingWebpage 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		WebDriverWait wait;
//		wait= new WebDriverWait(driver,30);
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\TCB\\chromedriver_win32 (114)\\chromedriver.exe");
	    driver=new ChromeDriver(options);
	    
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[9]/a")).click();
//		driver.close();
	}

}
