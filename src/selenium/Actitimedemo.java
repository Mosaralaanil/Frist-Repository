package selenium;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitimedemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Random r = new Random();
		int names =r.nextInt(1000);
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);//loginpage
		driver.findElement(By.xpath("//div[@id=\"container_tasks\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"addNewButton\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"item createNewProject\"]")).click();
		driver.findElement(By.xpath("(//input[@placeholder=\"Enter Project Name\"])[2]")).sendKeys("SRH"+names);
		driver.findElement(By.xpath("(//div[@class='dropdownButton'])[15]")).click();
		driver.findElement(By.xpath("//div[text()=\"-- New Customer --\"]")).click();
		driver.findElement(By.xpath("(//input[@placeholder=\"Enter Customer Name\"])[2]")).sendKeys("IPL"+names);
		driver.findElement(By.xpath("//textarea[starts-with(@placeholder,\"Add Project\")]")).sendKeys("SRH TEAM"+names);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[text()=\"Add new row\"]")).click();
		int rows=driver.findElements(By.xpath("//table[@class=\"createTasksTable hideAddToTT\"]/colgroup/following-sibling::tbody/tr")).size();
		System.out.println(rows);
        for(int r1=1;r1<=rows;r1++)
		{
			String name = "Kane Williamson"+r1;
			driver.findElement(By.xpath("//table[@class=\"createTasksTable hideAddToTT\"]/colgroup/following-sibling::tbody/tr["+r1+"]/td[1]"+"/input[@class=\"inputFieldWithPlaceholder\"]")).sendKeys(name+names);
		}
		driver.findElement(By.xpath("//div[text()=\"Create Project\"]")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()=\"New\"])[1]"))).click();
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()=\"In Progress\"])[1]")));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()=\"New\"])[2]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()=\"In Progress\"])[2]"))).click();
        
        
	}

}
