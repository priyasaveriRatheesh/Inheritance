package exclreadexmpl;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread 
{
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	public static String getStringData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\swathish\\Downloads\\excl read.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue();
	}
	
		public static String getIntegerData(int a,int b) throws IOException
		{
		f=new FileInputStream("C:\\Users\\swathish\\Downloads\\excl read.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		int x=(int) c.getNumericCellValue();
		return String.valueOf(x);
	}
	}
