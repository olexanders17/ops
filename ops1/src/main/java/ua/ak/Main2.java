package ua.ak;

import java.io.IOException;
import java.util.List;

public class Main2 {

	public static void main(String[] args) throws IOException {
		
		ExcelReader excelReader = new ExcelReader();
		
		List<FieldOperation> list = excelReader.getAllOperations();

		for (FieldOperation fieldOperation : list) {
			System.out.println(fieldOperation);
		}
		
	}

}
