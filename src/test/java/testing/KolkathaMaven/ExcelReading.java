package testing.KolkathaMaven;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {
	
	public static void main(String[] args) throws IOException {
		
		
		Workbook wb = new XSSFWorkbook("C:\\Users\\Varsha\\Desktop\\Book2.xlsx");
		
		Sheet sheet = wb.getSheetAt(0);
		/*Row row = sheet.getRow(3);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		System.out.println(data);*/
		
		//System.out.println(wb.getSheetAt(0).getRow(3).getCell(0).getStringCellValue());
		
		
		int rowCount =  sheet.getLastRowNum();
		
		
		for(int i=0;i<= rowCount;i++)
		{
			
			int cellCount = sheet.getRow(i).getLastCellNum();
			
			for(int j =0;j<cellCount;j++)
			{
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			
		}

}
}