package xcl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class excl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1= new File("C:\\Users\\patel\\Desktop\\QA Practice\\t.xls");
		FileInputStream fis= new FileInputStream(f1);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet ws1= wb.getSheet("Sheet1");
		Cell c2=ws1.getRow(1).getCell(4);
		if(c2==null) {
			c2 = ws1.getRow(1).createCell(4);
		}
		
		c2.setCellValue("newly modified");
		fis.close();
		
		FileOutputStream outputstream = new FileOutputStream(f1);
		wb.write(outputstream);
		wb.close();
		outputstream.close();

			

//		int r= ws1.getLastRowNum();
//		System.out.println(r);
		
//	for (int i=0; i<r;i++) {
//		Row rs= ws1.getRow(i);
//		
//		
//		
//		int col=rs.getLastCellNum();
//		
//		for(int j=0;j<col;j++) {
//			Cell c1 = rs.getCell(j);
//			
//			switch(c1.getCellType())
//			{
//            case Cell.CELL_TYPE_STRING:
//                System.out.println(c1.getStringCellValue());
//                break;
//            case Cell.CELL_TYPE_BOOLEAN:
//                System.out.println(c1.getBooleanCellValue());
//                break;
//            case Cell.CELL_TYPE_NUMERIC:
//                System.out.println(c1.getNumericCellValue());
//                break;
//            case Cell.CELL_TYPE_BLANK:
//                System.out.println(c1.getStringCellValue());
//                break;
//
//			}
//			
//			
//			
//			
//			
//			
//			
//			
//		}
//	}
	

	}

}
