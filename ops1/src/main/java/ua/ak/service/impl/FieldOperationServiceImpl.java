package ua.ak.service.impl;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.ak.dao.FieldOperationDao;
import ua.ak.dao.InputsDao;
import ua.ak.domain.FieldOperation;
import ua.ak.domain.Inputs;
import ua.ak.service.FieldOperationService;
import ua.ak.utils.AmountsForFieldOperations;
import ua.ak.utils.ExcelReader;

@Service()
public class FieldOperationServiceImpl implements FieldOperationService {

	@Autowired
	private FieldOperationDao dao;

	@Autowired
	private InputsDao daoInputs;

	@Autowired
	private AmountsForFieldOperations afo;

	public void add(double date, String fieldCode, double fiedArea, String operation, double doneHa, String tractor, String registrationNumber,
			String tractordriver, double motorHours, String equipment, String serialNumber, double fuelLiters, String crop, String seedsType,
			double seedsUsageQty, String fertilizerType, double fertilizerUsageQty, String chemicalsType, double chemicalsUsageQty, double year,
			double seedsAmount, double fertilizerAmount, double chemicalsAmount) {
		Date dataC;
		// DateUtil.getJavaDate(Double.parseDouble(c;
		// dao.save(new FieldOperation(dateC, fieldCode, fiedArea, operation,
		// doneHa, tractor, registrationNumber, tractordriver, motorHours,
		// equipment, serialNumber, fuelLiters, crop, seedsType, seedsUsageQty,
		// fertilizerType, fertilizerUsageQty, chemicalsType, chemicalsUsageQty,
		// year));

	}

	public void update(long id, String date, String fieldCode, double fiedArea, String operation, double doneHa, String tractor,
			String registrationNumber, String tractordriver, double motorHours, String equipment, String serialNumber, double fuelLiters, String crop,
			String seedsType, double seedsUsageQty, String fertilizerType, double fertilizerUsageQty, String chemicalsType, double chemicalsUsageQty,
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

	public void add(FieldOperation fieldOperation) {
		dao.save(fieldOperation);

	}

	public FieldOperationDao getDao() {
		return dao;
	}

	public void setDao(FieldOperationDao dao) {
		this.dao = dao;
	}

	// Just only load
	public void fromExceltoDatabse() {

		try {
			ExcelReader er = new ExcelReader();
			List<FieldOperation> list = er.getAllOperations();

			List<Inputs> inputsList = daoInputs.findAll();

			for (FieldOperation fieldOperation : list) {
				dao.save(afo.getAmounts(fieldOperation, inputsList));
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void updateBudgetData() {
		List<FieldOperation> foList = dao.findAll();
		List<Inputs> inputsList = daoInputs.findAll();

		for (FieldOperation fo : foList) {
			for (Inputs inputs : inputsList) {

				if ((fo.getChemicalsType() != null) && (fo.getChemicalsType() != null) && fo.getChemicalsType().equals(inputs.getInputsName())) {
					fo.setChemicalNameBudget(inputs.getInputsNameBudget());
					dao.save(fo);
				}
				// else if
				// (fo.getFertilizerType().equals(inputs.getInputsName())) {
				// fo.setChemicalsType(inputs.getInputsNameBudget());
				// dao.save(fo);
				//
				// }

			}

		}

	}

}
