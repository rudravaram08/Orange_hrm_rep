package Masters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dummy_tng {
	
	
  @Test(dataProvider="wd")
  public void tt(String ud,String pw) {
	  
	  ChromeOptions  options = new ChromeOptions();
	  
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		System.out.println("app_opened");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(ud);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pw);
  }
  
  @DataProvider(name="wd")
  public Object[] pq()
  {
	  
 Object[][] ld = new Object[3][2];
	  
	  ld[0][0] = "Admin";
	  ld[0][1] ="admin123";
	  
      ld[1][0] ="Admin";	  
	  ld[1][1] = "admin123";
	  
	  ld[2][0] ="Admin";
      ld[2][1] ="admin123";
	  
	return ld;
	  
  }
  
}
