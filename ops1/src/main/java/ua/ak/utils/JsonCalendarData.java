package ua.ak.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;

import ua.ak.domain.FieldOperation;

public class JsonCalendarData {

	public String getJsonCalendarData(List<FieldOperation> fieldOperations) {

		// to realise logic
		String title;
		Date start;
		Date end;

		double doneHa;
		String operation;
		String crop;

		List<calendarDto> calendarDtoList = new ArrayList<>();

		Set<String> set = new HashSet<String>();
		// List<String> listStr = new ArrayList<String>();
		// Set<String> cropSet;
		double tmpAmount = 0;

		for (FieldOperation fo : fieldOperations) {
			if (set.add(fo.getCrop() + "#" + fo.getOperation() + fo.getDate())) {

				for (FieldOperation foIn : fieldOperations) {
					if ((fo.getCrop().equals(foIn.getCrop()))
							&& (fo.getOperation().equals(foIn.getOperation()) && (fo.getDate().equals(foIn.getDate())))) {
						tmpAmount = tmpAmount + foIn.getDoneHa();
					}
				}

				// listStr.add(fo.getCrop() + " " + fo.getOperation() + " " +
				// (int) tmpAmount);
				calendarDtoList.add(new calendarDto(fo.getDate(), fo.getCrop() + " " + fo.getOperation() + " " + (int) tmpAmount));

				tmpAmount = 0;

			}
		}

		System.out.println(calendarDtoList);

		Gson gson = new Gson();
		String gsonStr = gson.toJson(calendarDtoList);
		return gsonStr;
	}

}

class calendarDto {

	Date actionDate;
	String DateOperationDescription;

	public calendarDto(Date actionDate, String dateOperationDescription) {
		super();
		this.actionDate = actionDate;
		DateOperationDescription = dateOperationDescription;
	}

	public Date getActionDate() {
		return actionDate;
	}

	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

	public String getDateOperationDescription() {
		return DateOperationDescription;
	}

	public void setDateOperationDescription(String dateOperationDescription) {
		DateOperationDescription = dateOperationDescription;
	}

	@Override
	public String toString() {
		return "calendarDto [actionDate=" + actionDate + ", DateOperationDescription=" + DateOperationDescription + "]";
	}

}
