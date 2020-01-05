package Basic_script;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basic_c {

	public static void main(String[] args) throws InterruptedException {


		/*Scanner s= new Scanner(System.in);
		System.out.println("enter from month");
		String m = s.nextLine();
		System.out.println("enter 1st date ");
		int d= s.nextInt();*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		/*driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		Select s = new Select (driver.findElement(By.xpath("//select[@id='systemUser_userType']")));
		s.selectByVisibleText("ESS");
		driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("Steven Edwards");
		driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys("bbbbbbbb");
		Select s1 = new Select (driver.findElement(By.xpath("//select[@id='systemUser_status']")));
		s1.selectByVisibleText("Enabled");
		driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		*/
		//leave
		
		/*driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
		driver.findElement(By.xpath("//a[@id='menu_leave_assignLeave']")).click();
		driver.findElement(By.xpath("//input[@id='assignleave_txtEmployee_empName']")).sendKeys("Jasmine Morgan");
		Select l = new Select(driver.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']")));
		l.selectByVisibleText("FMLA US");
		Thread.sleep(10000);
		//datepicker
		
		driver.findElement(By.xpath("//li[4]//img[1]")).click();
		
		Select ms = new Select(driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//select[@class='ui-datepicker-month']"))); 
	
		
			ms.selectByVisibleText(m);            
	
		List<WebElement> rows =driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//table//tr"));
		for(int i=1;i<=rows.size();i++)
		{
			List<WebElement> col =driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//table//tr["+i+"]//td"));
			
			for(int j=1;i<=col.size();j++) 
			{
				WebElement cell =driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//table//tr["+i+"]//td["+j+"]"));
			    if(cell.getText().equals(d)) {
			    	cell.click();
			    }
			}
			
			
		}*/
		//nationality
		driver.findElement(By.xpath("//a[@id='menu_admin_nationality']")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		driver.findElement(By.xpath("//input[@id='nationality_name']")).sendKeys("ghy");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();

	

}

}

