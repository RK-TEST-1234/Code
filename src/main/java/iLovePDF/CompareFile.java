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
     
//     System.out.print(sheet1);
//   System.out.print(sheet5);
//   System.out.print(sheet9);
//   System.out.println(sheet13);
//
//   System.out.print(sheet2);
//   System.out.print(sheet6);
//   System.out.print(sheet10);
//   System.out.println(sheet14);
//
//    System.out.print(sheet3);
//    System.out.print(sheet7);
//    System.out.print(sheet11);
//    System.out.println(sheet15);
//
//     System.out.print(sheet4);
//     System.out.print(sheet8);
//     System.out.print(sheet12);
//     System.out.println(sheet16);
     
     
     
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
     
//     System.out.print(sheet01);
//   System.out.print(sheet05);
//   System.out.print(sheet09);
//   System.out.println(sheet013);
//
//   System.out.print(sheet02);
//   System.out.print(sheet06);
//   System.out.print(sheet010);
//   System.out.println(sheet014);
//
//    System.out.print(sheet03);
//    System.out.print(sheet07);
//    System.out.print(sheet011);
//    System.out.println(sheet015);
//
//     System.out.print(sheet04);
//     System.out.print(sheet08);
//     System.out.print(sheet012);
//     System.out.println(sheet016);
     
     	
	}
	
	
    public static  void practice(int numer,int number1, String text) throws EncryptedDocumentException, IOException {
        FileInputStream file1 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel1.xlsx");
        FileInputStream file2 = new FileInputStream("C:\\Users\\RK\\Desktop\\New folder\\Excel2.xlsx");
        Sheet sheet= WorkbookFactory.create(file1).getSheet("Sheet1");
        Row row=sheet.getRow(numer);
        String text1=row.getCell(number1).getStringCellValue();
//       String text= cell.getStringCellValue();
//        double valiue=cell.getNumericCellValue();
//       
		
       
	}
}

