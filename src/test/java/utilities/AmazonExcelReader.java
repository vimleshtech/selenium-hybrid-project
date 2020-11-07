package utilities;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class AmazonExcelReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String[][] readTestcase(){
		
		String data[][] =null;
		try {
		
			FileInputStream fs =new FileInputStream("C:\\Users\\Vimlesh.Kumar\\eclipse-workspace\\SeleniumExample\\src\\test\\java\\keyfiles\\Testcase.xls");
			HSSFWorkbook book =new HSSFWorkbook(fs);
			HSSFSheet sheet = book.getSheetAt(0);
			
			//set row and col count where data is present 
			int rowCount = sheet.getPhysicalNumberOfRows();
			int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			
			//allocate memory for data two dimenssion array
			//skip the header 
			data =new String[rowCount-1][colCount];
			
			//read data from excel and store to array (data)
			for(int i=1;i<rowCount;i++) {
				HSSFRow row =sheet.getRow(i);
				
				HSSFCell cell = row.getCell(0);
				String tno = cell.getStringCellValue();
				
				cell = row.getCell(1);
				String desc =cell.getStringCellValue();
				
				cell = row.getCell(2);
				String step = cell.getStringCellValue();
				
				cell = row.getCell(3);
				String exp_result = cell.getStringCellValue();
				
				
				data[i-1][0] = tno;
				data[i-1][1] = desc;
				data[i-1][2] = step;
				data[i-1][3] = exp_result;
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return data;
	}
	
	
	public static String[][] readSteps(){
		
		String data[][] =null;
		try {
		
			FileInputStream fs =new FileInputStream("C:\\Users\\Vimlesh.Kumar\\eclipse-workspace\\SeleniumExample\\src\\test\\java\\keyfiles\\VerifyvalidSignIn.xls");
			HSSFWorkbook book =new HSSFWorkbook(fs);
			HSSFSheet sheet = book.getSheetAt(0);
			
			//set row and col count where data is present 
			int rowCount = sheet.getPhysicalNumberOfRows();
			int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			
			//allocate memory for data two dimenssion array
			//skip the header 
			data =new String[rowCount-1][colCount];
			
			//read data from excel and store to array (data)
			for(int i=1;i<rowCount;i++) {
				HSSFRow row =sheet.getRow(i);
				
				HSSFCell cell = row.getCell(0);
				String steps = cell.getStringCellValue();
				
				cell = row.getCell(1);
				String locator_type =cell.getStringCellValue();
				
				cell = row.getCell(2);
				String locator_value = cell.getStringCellValue();
				
				cell = row.getCell(3);
				String test_data = cell.getStringCellValue();
				
				cell = row.getCell(4);
				String assert_type = cell.getStringCellValue();
				
				
				data[i-1][0] = steps;
				data[i-1][1] = locator_type;
				data[i-1][2] = locator_value;
				data[i-1][3] = test_data;
				data[i-1][4] = assert_type;
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return data;
	}
		
	
}
