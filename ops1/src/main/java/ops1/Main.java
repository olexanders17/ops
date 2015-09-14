package ops1;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DateUtil;

import utils.DataFormatConverter;

public class Main {

	public static void main(String[] args) throws IOException {


		DataFormatConverter dfc = new DataFormatConverter();
		System.out.println(DateUtil.getJavaDate(41258));
		
		//SimpleDateFormat  dat= new  Si
		
		
		//		InputStream in = new FileInputStream("Ops.xlsx");
//
//		XSSFWorkbook fff;
//
//		XSSFWorkbook exelBook = new XSSFWorkbook(in);
//		XSSFSheet excelSheet = exelBook.getSheet("Daily activities");
//		XSSFRow myRow;
//		String module;
//		String date;
//
//		List<FieldOperation> listFieldOperation = new ArrayList<FieldOperation>();
//		for (int i = 2; i < 6; i++) {
//			myRow = excelSheet.getRow(i);
//			module = myRow.getCell(1).getStringCellValue();
//			date = myRow.getCell(2).getStringCellValue();
//
//			listFieldOperation.add(new FieldOperation(module));
//		}
//
//		for (FieldOperation fielOperation : listFieldOperation) {
//			System.out.println(fielOperation);
//
//		}
//
//	}

}
}
