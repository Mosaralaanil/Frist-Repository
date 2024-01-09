package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alertpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://demo.automationtesting.in/Alerts.html");
        String candname="anil";
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();   
//        Thread.sleep(2000);
//        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
        Alert Name=driver.switchTo().alert();
        Name.sendKeys(candname);
        Thread.sleep(2000);
        Name.accept();
//        driver.switchTo().alert().sendKeys("anil");
//        driver.switchTo().alert().accept();
//        String Alertmessage2=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
//        System.out.println(Alertmessage2);
//        Thread.sleep(2000);
       // if(Alertmessage2.contains(CandName))// validation for alert contains methed
       // {
       //	  System.out.println("validation Successful..!");
       // }
       // else
       // {
       //   System.out.println("validation Failed..!");
       // }
       // driver.quit();
        
        //Alertpractice.java
//        Hello anil How are you today
//      	String validation[]= Alertmessage2.split(" ");
//         String Expectedresult=validation[1];
//          System.out.println(Expectedresult);
//          if(candname.equals(Expectedresult)) {
//          	 System.out.println("validation successfull");
//           }else {
//          	 System.out.println("validation failed");
//	}
    
	}
}
