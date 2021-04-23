package Excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {
	/*
	 * Data fetching from Excel
	 */
	protected static CharSequence datafetching() throws Exception {
			
		FileInputStream  file=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\899612_RoyalCarribeanAlaska\\Excel\\carribean.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		String value=cell.toString();
		workbook.close();
		return value;
	}
	
}
