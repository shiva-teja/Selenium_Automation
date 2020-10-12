package setup;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelPage {
	public static FileInputStream Excel;
	public static Workbook book;
	public static Sheet sheet;
	
	public static void excel() throws EncryptedDocumentException,IOException{
		
		String usrdir=System.getProperty("user.dir");
		System.out.println(usrdir);
		Excel=new FileInputStream(usrdir+"/src/test/resources"+"/input.xlsx");
		book=WorkbookFactory.create(Excel);
		sheet=book.getSheetAt(0);
		
	}
	public static String data(int row,int col)
	{
		String Loc=sheet.getRow(row).getCell(col).getStringCellValue();
		return Loc;
	}

}
