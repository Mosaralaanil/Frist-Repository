package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class blogspot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
 driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		// 1) Find total number of rows 
		
				int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //7  preferred
				//int rows=driver.findElements(By.tagName("tr")).size(); //8   prefered only if you have one single table
				System.out.println("Number of rows:"+ rows); //7
				
				
				//2) Find total number of columns
				
				int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
				//int cols=driver.findElements(By.tagName("th")).size(); // dont prefer if you have multiple tables
				
				System.out.println("Number of columns:"+ cols); //4
				
				
				//3) Read specific row & column data
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[2]")).getText();
				System.out.println(value); //Amit
				String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[3]")).getText();
				System.out.println(value1);//java
				String value2=driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[4]")).getText();
				System.out.println(value2);//500
				String value3=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]")).getText();
				System.out.println(value3);//Selenium
				String value4=driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[2]")).getText();
				System.out.println(value4);//Animesh
				String value5=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
				System.out.println(value5);//Master In Selenium
				String value6=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[4]")).getText();
				System.out.println(value6);//2000
				String value7=driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[3]")).getText();
				System.out.println(value7);//Javascript
				String value8=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[2]")).getText();
				System.out.println(value8);//Amit
		
              //4) Read data from all the rows & columns
				
				System.out.println("Book Name"+"     "+"Author"+"    "+"Subject"+"       "+"Price");
				
				
				for(int r=2;r<=rows;r++)
				{
                //  4 elements in the row so thats why inside for loop will run for 4 times
					for(int c=1;c<=cols;c++)
					{
						String value9=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
						System.out.print(value9+"\t"); 
					}
					System.out.println();
				}
				
				//5) Print book names whose author is Amit
				for(int i=2;i<=rows;i++)
				{
					String author = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td[2]")).getText();			
					if(author.equalsIgnoreCase("amit"))
					{
						String book =driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td[1]")).getText();
						System.out.println(author+"------>"+book);
					}
				}
//				
//				  for(int r=2;r<=rows;r++)
//				  {
//					String author=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[2]")).getText();
//					
//					if(author.equals("Amit"));
//					{
//				      String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
//				      System.out.println(author+"    "+bookname);
//					}
//				 } 	  				  
			// 6) find sum of price for all books
				  
				  int sum=0;
			      for(int r=2;r<=rows;r++)
				 {
				  String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr[\"+r+\"]//td[4]")).getText();
				  sum=sum+Integer.parseInt(price);
				 }
			      System.out.println("books price"+sum);
                
            //     driver.quit();
				
	}

}
