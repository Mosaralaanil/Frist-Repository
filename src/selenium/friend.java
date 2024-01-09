package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class friend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Abdul");
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Azeem");
		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("abdul126@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abdul@12345");
		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("abdul@12345");
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();

		String actual = "Abdul Azeem";
		String email = driver.findElement(By.xpath("(//div[@class=\"box-content\"])[1]")).getText();
		System.out.println(email);
//		String exp=email.equals(actual)
		if (email.contains(actual)) {
//		if(email.equals(actual)) {

			System.out.println("your name is confirmed");
		} else {
			System.out.println("your name is unmatched");
		}
//        driver.findElement(By.linkText("Create an Account")).click();
//		driver.findElement(By.id("firstname")).sendKeys("narasimha");
//		driver.findElement(By.name("lastname")).sendKeys("pusapati");
//		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("naniraju12@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Nani@1234");
//		driver.findElement(By.name("password_confirmation")).sendKeys("Nani@1234");
//		driver.findElement(By.xpath("//button[@class=\"action submit primary\"]")).click();
//		String print=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/div[2]/div/div[1]")).getText();
//		if(print.equals("naniraju12@gmail.com")) {
//			System.out.println("matched");
//		}
//		else {
//			System.out.println("not matched");
//		}
//		
		
		

	}

}