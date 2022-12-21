package InitializBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InirializeAmazon {

	public static void runAmazonTest () {
		WebDriverManager.chromedriver().setup();
		WebDriver Amazon=new ChromeDriver();
		
		Amazon.get("https://www.Amazon.com");
		Amazon.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Amazon.manage().window().maximize();
		Amazon.navigate().refresh();
		Amazon.close();
		}

}
