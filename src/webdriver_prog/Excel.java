package webdriver_prog;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class Excel {
	public static void main(String args[]) throws Exception{
		FileInputStream file = new FileInputStream("C:\\Users\\dell\\Downloads\\Webdriver_Application\\ReadExcel.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet("Sheet1");
		int i=2;
		String empid= st.getCell(0, i).getContents();
		String name= st.getCell(1, i).getContents();
		String email= st.getCell(2, i).getContents();
		String no= st.getCell(3, i).getContents();
		System.out.println(empid);
		System.out.println(name);
		System.out.println(email);
		System.out.println(no);
	}

}
