package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunTestFromMavenCommand {
WebDriver driver;	
	
	@BeforeMethod(alwaysRun =  true)
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}
	
	
	
	@AfterMethod(alwaysRun =  true)
	public void tearDown() {
		driver.close();
	}
	
	
	@Test(groups={"regression", "Smoke"})
	public void Test1() {
		System.out.println("Test_1_First");
	}
	
	@Test(groups={"regression"})
	public void Test2() {
		System.out.println("Test_2_Second");
	}
	
	@Test(groups={"regression"})
	public void Test3() {
		System.out.println("Test3");
	}
	
	@Test(groups={"regression", "Smoke"})
	public void Test4() {
		System.out.println("Test4");
	}
	
	@Test(groups={"regression", "Smoke"})
	public void Test5() {
		System.out.println("Test5");
	}
	
	@Test(groups={"regression"})
	public void Test6() {
		System.out.println("Test6");
	}
	

}
