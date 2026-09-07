package org.BlueNile.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Org_BlueNile_FileUtility {

	public  String toReadDataFromPropertiesFile(String Filepath, String key) throws IOException {
		FileInputStream fis = new FileInputStream(Filepath);
        Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	 
	 public String toReadDataFromExcelFile(String Filepath, String sh,int n,int m) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(Filepath);
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet sheet = wb.getSheet(sh);
      Row row = sheet.getRow(n);
      Cell cell = row.getCell(m);
      String value = cell.getStringCellValue();
      return value;
		
	
	}

}

