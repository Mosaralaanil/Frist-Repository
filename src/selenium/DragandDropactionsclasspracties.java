package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDropactionsclasspracties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		Actions acs = new Actions(driver);
        
	    WebElement Dragelement = driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		 WebElement Dropelement = driver.findElement(By.xpath("//*[@id=\"box106\"]"));
         acs.dragAndDrop(Dragelement,Dropelement).build().perform();
        
        WebElement Dragelement1 = driver.findElement(By.xpath("//*[@id=\"box7\"]"));
        WebElement Dropelement1 = driver.findElement(By.xpath("//*[@id=\"box107\"]"));
        acs.dragAndDrop(Dragelement1,Dropelement1).build().perform();
        
        WebElement Dragelement2 = driver.findElement(By.xpath("//*[@id=\"box1\"]"));
        WebElement Dropelement2 = driver.findElement(By.xpath("//*[@id=\"box101\"]"));
        acs.dragAndDrop(Dragelement2,Dropelement2).build().perform();
     
       WebElement Dragelement3 = driver.findElement(By.xpath("//*[@id=\"box4\"]"));
        WebElement Dropelement3 = driver.findElement(By.xpath("//*[@id=\"box104\"]"));
        acs.dragAndDrop(Dragelement3,Dropelement3).build().perform();      
  
        WebElement Dragelement4 = driver.findElement(By.xpath("//*[@id=\"box5\"]"));
       WebElement Dropelement4 = driver.findElement(By.xpath("//*[@id=\"box105\"]"));
        acs.dragAndDrop(Dragelement4,Dropelement4).build().perform();      
  
        WebElement Dragelement5 = driver.findElement(By.xpath("//*[@id=\"box2\"]"));
        WebElement Dropelement5 = driver.findElement(By.xpath("//*[@id=\"box102\"]"));
        acs.dragAndDrop(Dragelement5,Dropelement5).build().perform();      
        
        WebElement Dragelement6 = driver.findElement(By.xpath("//*[@id=\"box3\"]"));
        WebElement Dropelement6 = driver.findElement(By.xpath("//*[@id=\"box103\"]"));
        acs.dragAndDrop(Dragelement6,Dropelement6).build().perform();

	}

}
