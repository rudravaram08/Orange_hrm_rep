package Masters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datapro_2 extends lib_class {
	
	 lib_class dp = new lib_class();
  @Test(dataProvider= "kbd" )
  public void f(String n) throws InterruptedException {
	  
	  lib_class dp = new lib_class();
	  dp.openapp("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	  dp.login("Admin", "admin123");
	  dp.nationality(n);
	 
  }
  
  @DataProvider(name="kbd") 
  public Object[][] nd() {
	  
	  Object[][] kb = new Object[2][1];
	  
	  kb[0][0] = "asdesd";
	  kb[0][1] ="sdessdd";
      kb[0][2] ="dfresd";
	  
	return null;
	  
  }
  
}
