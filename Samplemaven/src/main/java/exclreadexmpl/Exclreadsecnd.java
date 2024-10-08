package exclreadexmpl;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Exclreadsecnd {
	
	static FileInputStream file;
	static XSSFWorkbook book;
	static XSSFSheet sheet1;
	public static String firstStringData(int row1,int cell1) throws IOException
	
	{
		file=new FileInputStream("C:\\Users\\swathish\\Downloads\\excl read.xlsx");
		book=new XSSFWorkbook(file);
		sheet1=book.getSheet("MYSHEET");
		XSSFRow r=sheet1.getRow(row1);
		XSSFCell c=r.getCell(cell1);
		return c.getStringCellValue();
	}
public static String firstIntegerData(int row1,int cell1) throws IOException
	
	{
		file=new FileInputStream("C:\\Users\\swathish\\Downloads\\excl read.xlsx");
		book=new XSSFWorkbook(file);
		sheet1=book.getSheet("MYSHEET");
		XSSFRow r=sheet1.getRow(row1);
		XSSFCell c=r.getCell(cell1);
		int x=(int) c.getNumericCellValue();
		return String.valueOf(x);
		}
}