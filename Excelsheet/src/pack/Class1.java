package pack;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class1 
{
public static void main(String[] args) throws Exception {
		FileInputStream fis =new FileInputStream("D:\\Automation.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Sheet s=wb.getSheet("Sheet1");
	
	int rc=s.getLastRowNum();
	

	for(int i=0;i<=rc;i++)
	{
		Row r=s.getRow(i);
	
		int cc=r.getLastCellNum();
		for(int j=0;j<cc;j++)
		{
			Cell c=r.getCell(j);
			String str=c.getStringCellValue();
			Object numaric = null;

			if(str.equals(numaric))
       { 
	 System.out.println(str);
		}
else
	{
            System.out.println(str);
	}
		}
            
           
}
}
	
	}
	/*switch (c.getCellType()) {
            case Cell .CELL_TYPE_STRING:
                    System.out.println(r.getCell(j).getStringCellValue() + " ");
                    break;

            case Cell.CELL_TYPE_NUMERIC:
                    System.out.println((int)r.getCell(j).getNumericCellValue() + " ");
                    break;
            }*/
/*int result = Integer.parseInt(str);			
	System.out.println(result);*/

 