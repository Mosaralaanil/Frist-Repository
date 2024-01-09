package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class omayo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://omayo.blogspot.com/2013/05/page-one.html?m=0");
        driver.manage().window().maximize();
//        WebElement list= driver.findElement(By.xpath("//*[@id=\"multiselect1\"]"));
//        Select sc=new Select(list);
//        sc.selectByValue("volvox");
//        Thread.sleep(2000);
//        sc.selectByIndex(0);
//        sc.selectByValue("swiftx");
//        Thread.sleep(2000);
//        sc.selectByIndex(1);
//        sc.selectByValue("Hyundaix");
//        Thread.sleep(2000);
//        sc.selectByIndex(2);
//        sc.selectByValue("audix");
//        Thread.sleep(2000);
//        sc.selectByIndex(3);
//        
//        driver.findElement(By.xpath("//*[@id=\"drop1\"]")).click();
//        WebElement list1= driver.findElement(By.xpath("//*[@id=\"drop1\"]"));
//        Select li=new Select(list1);
//        li.selectByValue("abc");
//        li.selectByIndex(0);
//        Thread.sleep(2000);
//        li.selectByValue("def");
//        li.selectByIndex(1);
//        Thread.sleep(2000);
//        li.selectByValue("ghi");
//        li.selectByIndex(2);
//        Thread.sleep(2000);
//        li.selectByValue("jkl");
//        li.selectByIndex(3);
//        Thread.sleep(2000);
//        li.selectByValue("mno");
//        li.selectByIndex(4);
//        Thread.sleep(2000);
//       
//       driver.findElement(By.xpath("//*[@id=\"link1\"]")).click();
//       driver.navigate().back();
//       driver.findElement(By.xpath("//*[@id=\"link2\"]")).click();
//       driver.navigate().back();
//        
//        WebElement t =driver.findElement(By.name("fname"));
//        t.sendKeys(" ");
//        System.out.println("Value is: " + t.getAttribute("value"));
//    
//        driver.findElement(By.xpath("//*[@id=\"link2\"]")).click();
//         driver.navigate().back();
//          
//          driver.findElement(By.xpath("//button[@id=\"but2\"]")).click();
        
//           driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button[1]")).click();
//           Thread.sleep(2000);
//           driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button[2]")).click();
//           Thread.sleep(2000);
//           driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button[3]")).click();
//               driver.findElement(By.xpath("//*[@id=\"alert2\"]")).click();
//               driver.findElement(By.xpath("//*[@id=\"tb2\"]"));
//                Thread.sleep(10000);
//                 System.out.println("TextWillBeDisplayedWithDelay");
        
             driver.findElement(By.xpath("//*[@id=\"HTML37\"]")).click();
              driver.findElement(By.xpath("//*[@id=\"HTML37\"]/div[1]/p/a")).click();
              driver.switchTo().parentFrame();
        
//                driver.findElement(By.xpath("//*[@id=\"HTML41\"]/div[1]"));
//                Thread.sleep(2000);            
//                driver.findElement(By.xpath("//*[@id=\"timerButton\"]")).click();
//                Thread.sleep(2000);
//                 driver.findElement(By.xpath("//*[@id=\"myBtn\"]")).click();
//             
//                   driver.findElement(By.xpath("//*[@id=\"HTML44\"]/div[1]/button[2]")).click();
//                   Thread.sleep(2000);
//                   driver.findElement(By.xpath("//*[@id=\"button9\"]")).click();
//                   driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[21]/div[1]/button[2]")).click();
//                   WebElement Copytext = driver.findElement(By.xpath("//*[@id=\"HTML46\"]/div[1]/button"));  
//                   Actions act = new Actions(driver);     
//                   act.doubleClick(Copytext).build().perform();
//                   driver.switchTo().alert().accept();
//                   
//                     driver.findElement(By.xpath("//*[@id=\"HTML47\"]/div[1]"));
//                     driver.findElement(By.xpath("//*[@id=\"dte\"]")).click();
//                     Thread.sleep(5000);
//                     driver.findElement(By.xpath("//*[@id=\"HTML47\"]/div[1]/button")).click();
//                     
//                       
//		// 1) Find total number of rows 
//	               	int rows=driver.findElements(By.xpath("//*[@id=\"table1\"]//tr")).size(); 
//	               	System.out.println("Number of rows:"+ rows);//5
//		
//		//2) Find total number of columns
//	             	int cols=driver.findElements(By.xpath("//*[@id=\"table1\"]//th")).size();
//	             	System.out.println("Number of columns:"+ cols);//3
//		
//		//3) Read specific row & column data
//		String value=driver.findElement(By.xpath("//*[@id=\"table1\"]//tr[2]/td[3]")).getText();
//		System.out.println(value);//Pune
//		String value1=driver.findElement(By.xpath("//*[@id=\"table1\"]//tr[4]//td[1]")).getText();
//		System.out.println(value1);//Dheepthi
//		String value2=driver.findElement(By.xpath("//*[@id=\"table1\"]//tr[3]//td[2]")).getText();
//		System.out.println(value2);//29
//		String value3=driver.findElement(By.xpath("//*[@id=\"table1\"]//tr[2]//td[1]")).getText();
//		System.out.println(value3);//Manish
//		String value4=driver.findElement(By.xpath("//*[@id=\"table1\"]//tr[2]//td[2]")).getText();
//		System.out.println(value4);//25
//		String value5=driver.findElement(By.xpath("//*[@id=\"table1\"]//tr[3]//td[1]")).getText();
//		System.out.println(value5);//Praveen
//		String value6=driver.findElement(By.xpath("//*[@id=\"table1\"]//tr[4]//td[2]")).getText();
//		System.out.println(value6);//31
//		String value7=driver.findElement(By.xpath("//*[@id=\"table1\"]//tr[3]//td[3]")).getText();
//		System.out.println(value7);//Bangalore  
//		String value8=driver.findElement(By.xpath("//*[@id=\"table1\"]//tr[1]//td[3]")).getText();
//		System.out.println(value8);//Delhi
//		String value9=driver.findElement(By.xpath("//*[@id=\"table1\"]//tr[1]//td[2]")).getText();
//		System.out.println(value9);//22
//		String value10=driver.findElement(By.xpath("//*[@id=\"table1\"]//tr[1]//td[1]")).getText();
//		System.out.println(value10);//Kishore
//		
//		    driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[1]")).sendKeys("Anil");
//		    driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[2]")).sendKeys("reddy");
//		    driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/button")).click();
//            
//           driver.findElement(By.xpath("//iframe[@id='iframe2']"));
//           driver.switchTo().frame(1);
//           
//            driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[1]")).sendKeys("raju");
//            driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[2]")).sendKeys("kumar");
//            driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[3]")).click();
//            Thread.sleep(2000);
//            driver.switchTo().alert().dismiss();
//              Thread.sleep(2000); 
//             driver.findElement(By.xpath("//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[2]/input")).click();
//          
//             driver.findElement(By.id("radio1")).click();
//             driver.findElement(By.id("radio2")).click();
//        
//                driver.findElement(By.xpath("//*[@id=\"alert1\"]")).click();
//                Thread.sleep(2000);
//                driver.switchTo().alert().accept();
//               
//                 driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
//               Thread.sleep(2000);
//               driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
//             
//                  WebElement Copytext = driver.findElement(By.xpath("//*[@id=\"rotb\"]"));
//                  Actions acs = new Actions(driver);     
//                  acs.doubleClick(Copytext).build().perform();
//        
//                  driver.findElement(By.xpath("//*[@id='prompt']")).click();
//                  driver.switchTo().alert().sendKeys("anil");
//                  driver.switchTo().alert().accept();
//                    
//                  driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
//                  Thread.sleep(2000);
//                  driver.switchTo().alert().accept();
//                  
//                     driver.findElement(By.name("textboxn")).sendKeys("textboxn");
//        
//                    driver.findElement(By.id("sa")).click();
//                    Thread.sleep(2000);
//                    driver.findElement(By.name("sa")).click();
//        
//                     driver.findElement(By.className("classone")).sendKeys("classone");
//                     driver.findElement(By.xpath("//*[@id=\"HTML28\"]/div[1]/input")).sendKeys("anil");
//                        
//                        driver.findElement(By.xpath("//input[@value=\"Bike\"]")).click();
//                        Thread.sleep(2000);
//                        driver.findElement(By.xpath("//input[@value=\"Bicycle\"]")).click();
//                        Thread.sleep(2000);
//                        driver.findElement(By.xpath("//input[@value=\"Car\"]")).click();
//                  
//                        
//                         driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[1]")).click();
//                         Thread.sleep(2000);
//                         driver.findElement(By.xpath("//input[@value=\"Book\"]")).click();
//                         Thread.sleep(2000);
//                         driver.findElement(By.xpath("//input[@value=\"Laptop\"]")).click();
//                         Thread.sleep(2000);
//                         driver.findElement(By.xpath("//input[@value=\"Bag\"]")).click();
//      
//                          WebElement click = driver.findElement(By.xpath("//p[@id=\"testdoubleclick\"]"));  
//                          Actions act1 = new Actions(driver);     
//                          act.doubleClick(click).build().perform();
//                          
//                              driver.findElement(By.xpath("//*[@id=\"HTML34\"]/div[1]/div/button")).click();
//                              Thread.sleep(2000);
//                              driver.findElement(By.xpath("//*[@id=\"myDropdown\"]/a[1]")).click();
//                         //     driver.findElement(By.xpath("//*[@id=\"myDropdown\"]/a[2]")).click();
//                         //       driver.findElement(By.xpath("//*[@id=\"myDropdown\"]/a[3]")).click();


                   
	} 

}
