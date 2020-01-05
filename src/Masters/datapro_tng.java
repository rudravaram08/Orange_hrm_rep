package Masters;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datapro_tng extends lib_class
{
	
	lib_class t = new lib_class();
	
	@BeforeTest
	public void app() throws InterruptedException
	{
		t.openapp("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		t.login("Admin", "admin123");
	}
	@Test(dataProvider="idata")
	public void user(String rt,String re,String ru,String rs,String rp,String rpc) throws InterruptedException
	{
		System.out.println("hi");
		t.rolec(rt, re, ru, rs, rp, rpc);
	}
	
	@DataProvider(name="idata")
	public Object[] udata()
	{
		Object[][] kd = new Object[2][6];
		
		
		kd[0][0]="ESS";
		kd[0][1]="John Smith";
		kd[0][2]="GTREDHY";
		kd[0][3]="Enabled";
		kd[0][4]="123456";
		kd[0][5]="123456";
		kd[1][0]="ESS";
		kd[1][1]="John Smith";
		kd[1][2]="HYTRDEF";
		kd[1][3]="Enabled";
		kd[1][4]="123456dfff";
		kd[1][5]="123456dfff";
		return kd;
	}

	
}
