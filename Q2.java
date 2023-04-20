package Q1;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Q2 {
	@Test
	public void Function() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		System.out.println("Logged in successfully");
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"shopping_cart_link\"]")).click();
		System.out.println("Product added to cart");
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		System.out.println("Redirected to the Your information page");
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("KAMALESH");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("T");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("637202");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		 
		        if(driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText().equals("Checkout: Overview")) {
		        	System.out.println("Product overview page is displayed");
		        }
		        System.out.println("Name of the product: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText());
		        System.out.println("Price of the product: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());
		        if(driver.getTitle().equals("Swag Labs")) {
		        	System.out.println("Title matched");
		        }
		        if(driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html")) {
		        	System.out.println("URL matched");
		        }
		    } 


	}
