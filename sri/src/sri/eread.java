package sri;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class eread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File file =new File("E:\\excelread.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(inputStream);
		
		XSSFSheet sheet=wb.getSheet("Student_Data");
		
	//	 XSSFSheet sheet1=wb.getSheetAt(1);
		 
	//	 XSSFRow row1=sheet.getRow(1);
		 
		 sheet.getRow(1).getCell(1);
		 
	     //String address= cell.getStringCellValue();

	        
	     //System.out.println("Address is :"+ address);


	}

}
