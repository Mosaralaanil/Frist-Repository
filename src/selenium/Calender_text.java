package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender_text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)");
		
		 Thread.sleep(2000); 
	        driver.findElement(By.id("first_date_picker")).click();
	        
	       String mm=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
	       String yy=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
	       
	       String mon="June";
	       int yer=2001;
	       String dayy="4";
	       String yer1=Integer.toString(yer);
	       
	       int current_year=2024;
	       
	       while(true) {
	    	   mm=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
		       yy=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
		       
	    	   if (yer > current_year) {
	    		   if(mm.equals(mon) && yy.equals(yer1)) {
	    			   break;
	    		   }
	    		   else {

	    			   driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
	    		   }
	    		   
	    	   }
	    	   else {
	    		   if (yer < current_year) {
	    			   if(mm.equals(mon) && yy.equals(yer1)) {
	    				   break;
	    			   }
	    			   else {
	    				   driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();    				   
	    			   }
	    		   }
	    	   }
	    	   
      } 
	       java.util.List<WebElement> jj=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table//td"));
	       for(WebElement kk:jj) {
	    	   if(kk.getText().equals(dayy)) {
	    		   kk.click();
	    		   break;
	    	   }
	    	   
	       }

	}

}
