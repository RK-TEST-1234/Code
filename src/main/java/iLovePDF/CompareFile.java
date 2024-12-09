package iLovePDF;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CompareFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	 FileInputStream file1 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	 FileInputStream file2 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	 FileInputStream file3 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	 FileInputStream file4 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	 FileInputStream file5 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	 FileInputStream file6 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	 FileInputStream file7 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	 FileInputStream file8 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	 FileInputStream file9 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	 FileInputStream file10 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	 FileInputStream file11 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	 FileInputStream file12 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	 FileInputStream file13 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	 FileInputStream file14 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	 FileInputStream file15 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	 FileInputStream file16 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
	
	 
//	 FileInputStream file = new FileInputStream("path");
//   String sheet= WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//	  System.out.print(sheet);

     String sheet1= WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
    String sheet2= WorkbookFactory.create(file2).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
     String sheet3= WorkbookFactory.create(file3).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
     String sheet4= WorkbookFactory.create(file4).getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
     String sheet5= WorkbookFactory.create(file5).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
     String sheet6= WorkbookFactory.create(file6).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
     String sheet7= WorkbookFactory.create(file7).getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
     String sheet8= WorkbookFactory.create(file8).getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
     String sheet9= WorkbookFactory.create(file9).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
     String sheet10= WorkbookFactory.create(file10).getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
     String sheet11= WorkbookFactory.create(file11).getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
     String sheet12= WorkbookFactory.create(file12).getSheet("Sheet1").getRow(4).getCell(2).getStringCellValue();
     String sheet13= WorkbookFactory.create(file13).getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
     String sheet14= WorkbookFactory.create(file14).getSheet("Sheet1").getRow(2).getCell(3).getStringCellValue();
     String sheet15= WorkbookFactory.create(file15).getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
     String sheet16= WorkbookFactory.create(file16).getSheet("Sheet1").getRow(4).getCell(3).getStringCellValue();
     

     
     FileInputStream file01 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     FileInputStream file02 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     FileInputStream file03= new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     FileInputStream file04 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     FileInputStream file05 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     FileInputStream file06 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     FileInputStream file07 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     FileInputStream file08 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     FileInputStream file09 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     FileInputStream file010 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     FileInputStream file011 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     FileInputStream file012 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     FileInputStream file013 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     FileInputStream file014 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     FileInputStream file015 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     FileInputStream file016 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
     
     
     
     
   


     String sheet01= WorkbookFactory.create(file01).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
     String sheet02= WorkbookFactory.create(file02).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
     String sheet03= WorkbookFactory.create(file03).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
     String sheet04= WorkbookFactory.create(file04).getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
     String sheet05= WorkbookFactory.create(file05).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
     String sheet06= WorkbookFactory.create(file06).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
     String sheet07= WorkbookFactory.create(file07).getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
     String sheet08= WorkbookFactory.create(file08).getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
     String sheet09= WorkbookFactory.create(file09).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
     String sheet010= WorkbookFactory.create(file010).getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
     String sheet011= WorkbookFactory.create(file011).getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
     String sheet012= WorkbookFactory.create(file012).getSheet("Sheet1").getRow(4).getCell(2).getStringCellValue();
     String sheet013= WorkbookFactory.create(file013).getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
     String sheet014= WorkbookFactory.create(file014).getSheet("Sheet1").getRow(2).getCell(3).getStringCellValue();
     String sheet015= WorkbookFactory.create(file015).getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
     String sheet016= WorkbookFactory.create(file016).getSheet("Sheet1").getRow(4).getCell(3).getStringCellValue();
     

 	if(sheet1 != sheet01)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet1 + sheet01);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet1 + sheet01);
 	}



 	
 	if(sheet2!=sheet02)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet2 + sheet02);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet2 + sheet02);
 	}


 	
 	if(sheet1!=sheet03)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet3 + sheet03);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet3 + sheet03);
 	}


 	
 	if(sheet4!=sheet04)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet4 + sheet04);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet4 + sheet04);
 	}


 	
 	if(sheet5!=sheet05)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet5 + sheet05);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet5 + sheet05);
 	}



 	
 	if(sheet6!=sheet06)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet6 + sheet06);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet6 + sheet06);
 	}


 	
 	if(sheet7!=sheet07)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet7 + sheet07);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet7 + sheet07);
 	}


 	
 	if(sheet8!=sheet08)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet8 + sheet08);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet8 + sheet08);
 	}


 	
 	if(sheet9!=sheet09)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet9 + sheet09);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet9 + sheet09);
 	}

 	
 	if(sheet10!=sheet010)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet10 + sheet010);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet10 + sheet010);
 	}


 	if(sheet11!=sheet011)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet11 + sheet011);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet11 + sheet011);
 	}


 	
 	if(sheet12!=sheet012)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet12 + sheet012);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet12 + sheet012);
 	}


 	
 	if(sheet13!=sheet013)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet13 + sheet013);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet13 + sheet013);
 	}




 	
 	if(sheet14!=sheet014)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet14 + sheet014);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet14 + sheet014);
 	}



 	
 	if(sheet15!=sheet015)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet15 + sheet015);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet15 + sheet015);
 	}


 	
 	if(sheet16!=sheet016)
 	{
 	System.out.println("Test Case pass" +" --->  "

 	+ sheet16 + sheet016);
 	}
 	else
 	{
 	System.out.println("fail"  + sheet16 + sheet016);
 	}

	}
	
	

}

