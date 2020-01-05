package Masters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exe_lib {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		lib_class lib = new lib_class();
		
		lib.openapp("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		lib.login("Admin", "admin123");
		lib.nationality("asdf");
	}

}
