package xcl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class wxc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 File f1= new File("C:\\Users\\patel\\Desktop\\QA Practice\\rc.xls");
//FileInputStream fis= new FileInputStream(f1);
HSSFWorkbook wb = new HSSFWorkbook();
HSSFSheet ws1= wb.createSheet("Sheet1");
Row r= ws1.createRow(0);

Cell c2=r.createCell(0);

c2.setCellValue("new");

//new 



FileOutputStream fos= new FileOutputStream(f1);
wb.write(fos);
wb.close();
fos.close();

	}

}
