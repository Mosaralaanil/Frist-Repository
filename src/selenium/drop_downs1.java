package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class drop_downs1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().window().maximize();
        WebElement Country=driver.findElement(By.xpath("//*[@id=\"country-list\"]"));
        Select sc=new Select(Country);
        sc.selectByIndex(0);
	    Thread.sleep(2000);
//	    sc.selectByValue("1");
//	    Thread.sleep(2000);
//	    sc.selectByIndex(2);
//	    Thread.sleep(2000);
//	    sc.selectByValue("3");
//	    Thread.sleep(2000);
//	    sc.selectByIndex(4);
//	    Thread.sleep(2000);
	    sc.selectByValue("5");
	    Thread.sleep(2000);
	    
	   WebElement State=driver.findElement(By.xpath("//*[@id=\"state-list\"]"));
	   Select st=new Select(State);
//	   st.selectByIndex(0);
//	   Thread.sleep(2000);
//	    st.selectByIndex(1);
//	    Thread.sleep(2000);
//	    st.selectByValue("17");
//	    Thread.sleep(2000);
//	    st.selectByIndex(3);
//	    Thread.sleep(2000);
//	    st.selectByValue("19");
//	    Thread.sleep(2000);
//	    st.selectByIndex(4);
//	    Thread.sleep(2000);
//	    st.selectByValue("20");

//	    st.selectByIndex(0);
//	    Thread.sleep(2000);
//	    st.selectByIndex(1);
//	    Thread.sleep(2000);
//	    st.selectByValue("2");
//	    Thread.sleep(2000);
//	    st.selectByIndex(3);
//	    Thread.sleep(2000);
//	    st.selectByValue("6");
//	    Thread.sleep(2000);
//	    st.selectByIndex(4);
//	    Thread.sleep(2000);
//	    st.selectByValue("10");
	    
//	    st.selectByIndex(0);
//	    Thread.sleep(2000);
//	    st.selectByIndex(1);
//	    Thread.sleep(2000);
//	    st.selectByValue("12");
//	    Thread.sleep(2000);
//	    st.selectByIndex(3);
//	    Thread.sleep(2000);
//	    st.selectByValue("14");
//	    Thread.sleep(2000);
//	    st.selectByIndex(4);
//	    Thread.sleep(2000);
//	    st.selectByValue("15");
	    
//	    st.selectByIndex(0);
//	    Thread.sleep(2000);
//	    st.selectByIndex(1);
//	    Thread.sleep(2000);
//	    st.selectByValue("22");
//	    Thread.sleep(2000);
//	    st.selectByIndex(3);
//	    Thread.sleep(2000);
//	    st.selectByValue("24");
//	    Thread.sleep(2000);
//	    st.selectByIndex(5);
	   
	    st.selectByIndex(0);
	    Thread.sleep(2000);
	    st.selectByIndex(1);
	    Thread.sleep(2000);
	    st.selectByValue("3");
	    Thread.sleep(2000);
	    st.selectByIndex(3);
	    Thread.sleep(2000);
	    st.selectByValue("7");
	    Thread.sleep(2000);
	    st.selectByValue("8");
	    	    
	}

}
