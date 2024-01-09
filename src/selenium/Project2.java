package selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Project2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/v1/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          System.out.println("title of the page is: "+driver.getTitle());
          driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
          driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
         driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")).click();
         Thread.sleep(2000);
         
      // ------> A-Z
         
//         WebElement selectcontainer1= driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select"));
//         Select sc=new Select(selectcontainer1);
//         sc.selectByIndex(0); 
//         Thread.sleep(2000); 
//        String inventory_container1  = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div")).getText(); // prooduct list
// 	      System.out.println(inventory_container1);
// 	      driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
// 	      Thread.sleep(2000);
// 	      driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click();
// 	      Thread.sleep(2000);
// 	      driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")).click();
// 	      Thread.sleep(2000);
// 	      driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button")).click();
// 	      Thread.sleep(2000);
// 	      driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button")).click();
// 	      Thread.sleep(2000);
// 	      driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[3]/button")).click();
// 	     
// 	     driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
// //	     driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
// 	     driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
// 	     Thread.sleep(2000);
// 	     driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("Anil");
// 	     driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("reddy");
// 	     driver.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys("500030");
// //	     driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/a")).click();
// 	     driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
// 	     Thread.sleep(2000);
//// 	     driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[1]")).click();
// 	     driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
// 	     
// 	    String finshyourorder1 = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText(); // order finsh
//	    System.out.println(finshyourorder1);
	   
         
 	//-------->  Z TO A
         
//         
// 	    WebElement selectcontainer2= driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select"));
//        Select sc1=new Select(selectcontainer2);
//        sc1.selectByIndex(1); 
//        Thread.sleep(2000); 
//        String inventory_container2  = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div")).getText(); // prooduct list
//	     System.out.println(inventory_container2);
//        
//         driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
//         Thread.sleep(2000);
//         driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click();
//         Thread.sleep(2000);
//         driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")).click();
//         Thread.sleep(2000);
//         driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button")).click();
//         Thread.sleep(2000);
//         driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button")).click();
//         Thread.sleep(2000);
//         driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[3]/button")).click();
//         Thread.sleep(2000);
//         driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
//       //	 driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
//       	     driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
//       	     Thread.sleep(2000);
//       	     driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("harish");
//       	     driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("reddy");
//       	     driver.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys("500031");
//       //	 driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/a")).click();
//       	     driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
//       	     Thread.sleep(2000);
//      //  	 driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[1]")).click();
//       	     driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
//       	     
//       	    String finshyourorder2 = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText(); // order finsh
//      	    System.out.println(finshyourorder2);
//         
//       //--------> Price (low to high) 
//         
//         WebElement selectcontainer3= driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select"));
//         Select sc2=new Select(selectcontainer3);
//         sc2.selectByIndex(2); 
//         Thread.sleep(2000); 
//         String inventory_container3 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div")).getText(); // prooduct list
//	     System.out.println(inventory_container3);
//	     driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
//	     Thread.sleep(2000);
//	     driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click();
//	     Thread.sleep(2000);
//	     driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")).click();
//	     Thread.sleep(2000);
//	     driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button")).click();
//	     Thread.sleep(2000);
//	     driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button")).click();
//	     Thread.sleep(2000);
//	     driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[3]/button")).click();
//	     Thread.sleep(2000);
//	     Thread.sleep(2000);
//          driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
//     //	  driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
//     	     driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
//     	     Thread.sleep(2000);
//     	     driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("raj");
//     	     driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("kumar");
//     	     driver.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys("500032");
//     //	     driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/a")).click();
//     	     driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
//     	     Thread.sleep(2000);
//    //  	 driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[1]")).click();
//     	     driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
//     	     
//     	    String finshyourorder3 = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText(); // order finsh
//    	    System.out.println(finshyourorder3);
    	    
    	    
    	 // -----> Price (high to low)
    	    
    	    WebElement selectcontainer4= driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select"));
            Select sc3=new Select(selectcontainer4);
            sc3.selectByIndex(2); 
            Thread.sleep(2000); 
            String inventory_container4 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div")).getText(); // prooduct list
   	        System.out.println(inventory_container4);
   	        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[3]/button")).click();
	        Thread.sleep(2000);
	        Thread.sleep(2000);
             driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
    //	     driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
    	     driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
    	     Thread.sleep(2000);
    	     driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("Sunil");
    	     driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("Varma");
    	     driver.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys("500030");
    //	     driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/a")).click();
    	     driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
    	     Thread.sleep(2000);
   //   	 driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[1]")).click();
    	     driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
    	     
    	    String finshyourorder4 = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText(); // order finsh
   	        System.out.println(finshyourorder4);
   	        

   	        String Em = "THANK YOU FOR YOUR ORDER";
   			String email = driver.findElement(By.xpath("//h2[@class=\"complete-header\"]")).getText();
   			if (email.contains(Em)) {
   				System.out.println("it matched");
   			} else {
   				System.out.println("it not matched");
   			}
   	    
      	    
 	  
	}

}
