package utilities;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReader {

	//public static void main(String[] args) {

	public static String[][] getData(){
		
		String data[][] = null; //declare two dimenssion empty array 
				
		//Exception or error handling 
		try {
			//write logical code here
			FileInputStream fs =new FileInputStream("C:\\Users\\Vimlesh.Kumar\\eclipse-workspace\\SeleniumExample\\src\\test\\java\\keyfiles\\Testdata.xls");
			HSSFWorkbook book = new HSSFWorkbook(fs); 
			
			int sheetCount  = book.getNumberOfSheets();			
			//get one worksheet
			HSSFSheet sheet = book.getSheetAt(0); 
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			
			System.out.println("Count of worksheet "+sheetCount);
			System.out.println("Count of row "+rowCount);
			System.out.println("Count of column "+colCount);
			
			//allocate the size of array
			data = new String[rowCount-1][colCount-1]; //-1 , for skip the header 
			
			//read all data except header (sheet or row or column index start from 0)
			for(int i=1;i<rowCount;i++) {
				
				HSSFRow row = sheet.getRow(i);
				//System.out.println(row);
				
				HSSFCell cell  = row.getCell(0);
				String tid = cell.getStringCellValue();
								
				cell  = row.getCell(1);
				String username = cell.getStringCellValue();
								
				cell  = row.getCell(2);
				String password = cell.getStringCellValue();
								
				System.out.println("User data "+tid+"\t"+username+"\t"+password);
				
				data[i-1][0] = tid;
				data[i-1][1] = username;
				data[i-1][2] = password;
				
			}			
			
		}
		catch (Exception e) {
			//handle the error 
			System.out.println(e.toString());
			
		}
				
		return data;
	}

}
