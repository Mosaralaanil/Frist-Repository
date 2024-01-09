package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class blogspotpracties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
    			driver.manage().window().maximize();
    			
    			// 1) Find total number of rows 
    			
    			int rows=driver.findElements(By.xpath("//*[@id=\"customers\"]//tr")).size(); 
    			//int rows=driver.findElements(By.tagName("tr")).size(); 
    			System.out.println("Number of rows:"+ rows);//7
    			
    			
    			//2) Find total number of columns
    			
    			int cols=driver.findElements(By.xpath("//*[@id=\"customers\"]//th")).size();
    			//int cols=driver.findElements(By.tagName("th")).size(); 
    			System.out.println("Number of columns:"+ cols);//3
    	
    			//3) Read specific row & column data
    			
    			String value=driver.findElement(By.xpath("//*[@id=\"customers\"]//tr[2]/td[2]")).getText();
    			System.out.println(value);//Maria Anders
    			String value1=driver.findElement(By.xpath("//*[@id=\"customers\"]//tr[4]//td[1]")).getText();
    			System.out.println(value1);//Microsoft
    			String value2=driver.findElement(By.xpath("//*[@id=\"customers\"]//tr[3]//td[2]")).getText();
    			System.out.println(value2);//francisco chang
    			String value3=driver.findElement(By.xpath("//*[@id=\"customers\"]//tr[5]//td[3]")).getText();
    			System.out.println(value3);//uk
    			String value4=driver.findElement(By.xpath("//*[@id=\"customers\"]//tr[6]//td[1]")).getText();
    			System.out.println(value4);//Adobe
    			String value5=driver.findElement(By.xpath("//*[@id=\"customers\"]//tr[4]//td[2]")).getText();
    			System.out.println(value5);//Roland Mendel
    			String value6=driver.findElement(By.xpath("//*[@id=\"customers\"]//tr[2]//td[3]")).getText();
    			System.out.println(value6);//Roland Mendel
    			String value7=driver.findElement(By.xpath("//*[@id=\"customers\"]//tr[3]//td[1]")).getText();
    			System.out.println(value7);//Meta
    			String value8=driver.findElement(By.xpath("//*[@id=\"customers\"]//tr[7]//td[2]")).getText();
    			System.out.println(value8);//Giovanni Rovelli
    			

	}

}
