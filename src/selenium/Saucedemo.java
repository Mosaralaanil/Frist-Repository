package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Saucedemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.println("title of the page is: "+driver.getTitle());
        // login page 
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]")).click();
        Thread.sleep(2000);
        
 //--------> Price (low to high)  
  
//        WebElement selectcontainer= driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
//        Select sc=new Select(selectcontainer);
//        sc.selectByIndex(2);  
//	    Thread.sleep(2000); 
//	    String inventory_container = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div")).getText(); // prooduct list
//	    System.out.println(inventory_container1);
//	    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
//	    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
//	    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
//	    driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("Anil");
//      driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Reddy");
//      driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("500030");
//	    driver.findElement(By.xpath("//*[@name=\"continue\"]")).click();
//      driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
//	    String finshyourorder  = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText(); // order finsh
//	    System.out.println(finshyourorder);
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
        
    
 // ------> A-Z
        
//	    WebElement selectcontainer1= driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
//        Select sc1=new Select(selectcontainer1);
//        sc1.selectByIndex(0); //Name A-Z 
//	    Thread.sleep(2000);
//	    String finshyourorder2 = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText(); // order finsh
//	    System.out.println(finshyourorder2);
//	    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
//	    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
//	    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
//	    driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("Shiva");
//      driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("kumar");
//      driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("500030");
//	    driver.findElement(By.xpath("//*[@name=\"continue\"]")).click();
//      driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
//	    String finshyourorder1 = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText(); // order finsh
//	    System.out.println(finshyourorder1);
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
//	    
	 
 // -------> Z-A
        
//	    WebElement selectcontainer2= driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
//        Select sc2=new Select(selectcontainer2);
//        sc2.selectByIndex(1); 
//	    Thread.sleep(3000);
//	    String inventory_container3  = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div")).getText(); // prooduct list
//	    System.out.println(inventory_container3);
//	    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
//	    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
//	    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
//	    driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("raju");
//        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("kumar");
//        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("500030");
//	    driver.findElement(By.xpath("//*[@name=\"continue\"]")).click();
//        driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
//	    String finshyourorder3  = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText(); // order finsh
//	    System.out.println(finshyourorder3);
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
//	    
      
 // -----> Price (high to low)
	    WebElement selectcontainer3= driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
        Select sc3=new Select(selectcontainer3);
        sc3.selectByIndex(3); 
        Thread.sleep(3000);
	    String inventory_container3  = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div")).getText(); // prooduct list
	    System.out.println(inventory_container3);
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click(); // Select product
	    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
	    driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click(); // product checkout
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("Arun");// Your Information
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("reddy");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("500030");
	    driver.findElement(By.xpath("//*[@name=\"continue\"]")).click(); // continue to order
	    driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
	    String finshyourorder4 = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText(); // order finsh
	    System.out.println(finshyourorder4);
	    Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click(); // back to home
	    
	    
   }
}
     