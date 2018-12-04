package pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook wb;
		XSSFSheet sheetr;
		XSSFCell cell;
		String path="D:\\vusikela.xlsx";
		String sheet="Sheet1";
		FileInputStream fis =new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		sheetr=wb.getSheet(sheet);
		 cell=sheetr.getRow(1).getCell(1);
		 String cellnum=cell.getStringCellValue();
		 System.out.println(cellnum);
		

	}

}
