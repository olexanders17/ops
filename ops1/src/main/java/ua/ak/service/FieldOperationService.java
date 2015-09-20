package ua.ak.service;

import java.util.List;

import ua.ak.domain.FieldOperation;

public interface FieldOperationService {

	void add(double date, String fieldCode, double fiedArea, String operation, double doneHa, String tractor,
			String registrationNumber, String tractordriver, double motorHours, String equipment, String serialNumber,
			double fuelLiters, String crop, String seedsType, double seedsUsageQty, String fertilizerType,
			double fertilizerUsageQty, String chemicalsType, double chemicalsUsageQty, double year, double seedsAmount,
			double fertilizerAmount, double chemicalsAmount);

	void update(long id, String date, String fieldCode, double fiedArea, String operation, double doneHa,
			String tractor, String registrationNumber, String tractordriver, double motorHours, String equipment,
			String serialNumber, double fuelLiters, String crop, String seedsType, double seedsUsageQty,
			String fertilizerType, double fertilizerUsageQty, String chemicalsType, double chemicalsUsageQty,
			double year, double seedsAmount, double fertilizerAmount, double chemicalsAmount);

	public void fromExceltoDatabse(); 
	
	List<FieldOperation> getAll();	
	FieldOperation getById(Long id);
	void delete(Long id);

	void add(FieldOperation fieldOperation);

}
