package ua.ak.run;

import java.io.IOException;
import java.util.List;

import ua.ak.domain.FieldOperation;
import ua.ak.utils.ExcelReader;

public class Main2 {

	public static void main(String[] args) throws IOException {
		
		ExcelReader excelReader = new ExcelReader();
		
		List<FieldOperation> list = excelReader.getAllOperations();

		for (FieldOperation fieldOperation : list) {
			System.out.println(fieldOperation);
		}
		
	}

}
