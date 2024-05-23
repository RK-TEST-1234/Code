package Exam;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream file1 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	     String sheet1= WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	     System.out.println(sheet1 );
	}

}
