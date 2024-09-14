package First_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\AutomationFiles\\Driver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/pune");
		
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
	        loginButton.click();
		
	        try {
	            Thread.sleep(3000);  // Explicit wait for the login modal to appear
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        WebElement mobileNumberInput = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
	        mobileNumberInput.sendKeys("1234567890");

	        WebElement sendOtpButton = driver.findElement(By.xpath("//span[contains(text(),'Send One Time Password']"));
	        sendOtpButton.click();
	        
	        try {
	            Thread.sleep(5000);  // Wait for OTP process to finish
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	            }
	        driver.quit();

	}

}
