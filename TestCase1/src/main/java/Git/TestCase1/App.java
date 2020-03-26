package Git.TestCase1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class App
{
	WebDriver driver;

	@BeforeTest
	public void OpenBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTraining\\Installation Stuff\\Driver\\ChromeDriver2\\chromedriver.exe");
		
		//   WebDriverManager.chromedriver().setup();
           ChromeOptions chromeOptions = new ChromeOptions();
          
           chromeOptions.addArguments("headless");
            driver = new ChromeDriver(chromeOptions);
	}

	@Test
	public void OpenAUT() {
		

		//driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
		driver.get("https://intellipaat.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='s']")).sendKeys("Devops");
		driver.findElement(By.xpath("//*[@name='s']")).click();
	}
	@Test
	public void SelectCourse() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,800)");
		driver.findElement(By.xpath("//*[contains(text(),'Cloud and DevOps Architect ')]")).click();
	}

	
@AfterTest
    public void aftertest()
    {
    driver.quit();    //Close the browser
    }
}
