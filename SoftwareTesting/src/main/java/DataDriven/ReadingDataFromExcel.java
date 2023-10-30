package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file=new FileInputStream("C:\\kanna\\data1.xlsx");

		XSSFWorkbook workbook=new XSSFWorkbook(file);

		XSSFSheet sheet=workbook.getSheet("Sheet1");//providing sheet name
		//XSSFSheet sheet=workbook.getSheetAt(0);////providing sheet name

		int rowcount=sheet.getLastRowNum(); //returns the row count
		int colcount=sheet.getRow(0).getLastCellNum(); //returns the column/cell  count

		//for(int i=0;i<rowcount-2;i++) for specific col to get

		for(int i=0;i<rowcount-2;i++) 
		{
			XSSFRow currentrow=sheet.getRow(i); //focused on current row

			for(int j=0;j<colcount;j++) 
			{
				String value=currentrow.getCell(j).toString();//read the values cell
				System.out.print("   "  +value);
			}
			System.out.println();
		}
	}
}


