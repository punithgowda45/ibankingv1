package generic1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
public static Object[][] getdata(String path,String sheet) throws EncryptedDocumentException, FileNotFoundException, IOException {

	
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		Sheet sheet1 = wb.getSheet(sheet);
		int rowcount = sheet1.getLastRowNum();
		int colcount = sheet1.getRow(0).getLastCellNum();
		Object[][] data=new Object[rowcount][colcount];
		for(int i=0;i<=rowcount;i++) {
			try {
				for(int j=0;j<=colcount;j++) {
					try {
						 data[i][j]=sheet1.getRow(i+1).getCell(j).getStringCellValue();
						}
					catch(Exception e) {
						}
			}
			}
			catch(Exception e) {
		}
	}
	
	
	return data;
	
}
}
