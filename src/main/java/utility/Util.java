package utility;

import	java.io.FileInputStream;
import	java.io.FileNotFoundException;
import	java.io.IOException;
import	org.apache.poi.EncryptedDocumentException;
import	org.apache.poi.ss.usermodel.Sheet;
import	org.apache.poi.ss.usermodel.WorkbookFactory;
public	class	Util	{
public	static	String	readExcel(int	rowNum,	int	colNum)	throws	
EncryptedDocumentException,	IOException
{
	
	FileInputStream file=new FileInputStream("");
	Sheet excelsheet=WorkbookFactory.create(file).getSheet("Sheet1");
	return excelsheet.getRow(rowNum).getCell(colNum).getStringCellValue();
}
}