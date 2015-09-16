package ua.ak.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import ua.ak.dao.FieldOperationDao;
import ua.ak.domain.FieldOperation;
import ua.ak.service.FieldOperationService;


@Service()
public class FieldOperationServiceImpl implements FieldOperationService {

	@Autowired
	private FieldOperationDao dao;
	
	
	
	public void add(double date, String fieldCode, double fiedArea, String operation, double doneHa, String tractor,
			String registrationNumber, String tractordriver, double motorHours, String equipment, String serialNumber,
			double fuelLiters, String crop, String seedsType, double seedsUsageQty, String fertilizerType,
			double fertilizerUsageQty, String chemicalsType, double chemicalsUsageQty, double year, double seedsAmount,
			double fertilizerAmount, double chemicalsAmount) {
		Date dataC;
		//DateUtil.getJavaDate(Double.parseDouble(c;
	//	dao.save(new FieldOperation(dateC, fieldCode, fiedArea, operation, doneHa, tractor, registrationNumber, tractordriver, motorHours, equipment, serialNumber, fuelLiters, crop, seedsType, seedsUsageQty, fertilizerType, fertilizerUsageQty, chemicalsType, chemicalsUsageQty, year));
		
	}

	public void update(long id, String date, String fieldCode, double fiedArea, String operation, double doneHa,
			String tractor, String registrationNumber, String tractordriver, double motorHours, String equipment,
			String serialNumber, double fuelLiters, String crop, String seedsType, double seedsUsageQty,
			String fertilizerType, double fertilizerUsageQty, String chemicalsType, double chemicalsUsageQty,
			double year, double seedsAmount, double fertilizerAmount, double chemicalsAmount) {
		// TODO Auto-generated method stub
		
	}

	public List<FieldOperation> getAll() {		
		return dao.findAll();
	}

	public FieldOperation getById(Long id) {
		return dao.getOne(id);
	}

	
	
	public void delete(Long id) {
		
		
	}

	public FieldOperationDao getDao() {
		return dao;
	}

	public void setDao(FieldOperationDao dao) {
		this.dao = dao;
	}
	
	
	

}
