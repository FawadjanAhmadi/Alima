package InitializBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class InitializTekSchool extends InirializeAmazon {

	public static void RunTest()throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
	
		
		WebDriver TekSchool= new ChromeDriver();
		WebDriver AmazonTest= new ChromeDriver();
	
		TekSchool.get("https://tek-retail-ui.azurewebsites.net");
		TekSchool.manage().window().maximize();
		TekSchool.navigate().refresh();
		Thread.sleep(10000);
		TekSchool.close();
		
		AmazonTest.get("https://www.Amazon.com");
		AmazonTest.manage().window().maximize();
		Thread.sleep(10000);
		AmazonTest.navigate().refresh();
		AmazonTest.close();
		

	}

}
