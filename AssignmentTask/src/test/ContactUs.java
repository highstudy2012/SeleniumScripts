package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUs {


public static void main(String[] args) {
	
	System.out.println("Hello World");

	
	System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
			
	driver.get("https://demo.opencart.com/index.php?route=information/contact");	
	driver.manage().window().maximize();
	
	 WebElement Name;
	 WebElement username = driver.findElement(By.id("input-name"));
	 username.sendKeys("Zohaib");
	 
	 WebElement email;
	 WebElement email1 = driver.findElement(By.id("input-email"));
	 email1.sendKeys("test123@gmail.com");
	 
	 WebElement enquiry;
	 WebElement enquiry1 = driver.findElement(By.id("input-enquiry"));
	 enquiry1.sendKeys("Test abcd efgh@123.com");
	 
	 WebElement SubmitButton = driver.findElement(By.className("btn-primary"));
	 SubmitButton.click(); 
	 
	 String actualpagetitle = driver.getTitle();
	 String expectedTitle = "Contact Us";
	 
	 if (actualpagetitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
	
	driver.close();
	
	driver.quit();
	

}
}
