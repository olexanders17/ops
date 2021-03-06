package ua.ak.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.ak.dao.FieldOperationDao;
import ua.ak.dao.InputsDao;
import ua.ak.domain.FieldOperation;
import ua.ak.domain.Inputs;
import ua.ak.service.FieldOperationService;
import ua.ak.utils.AllFieldsTableUtil;
import ua.ak.utils.AmountsForFieldOperations;
import ua.ak.utils.ExcelReaderSingleColumn;

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
	@Override
	public void fromExceltoDatabse(String filename) {

		ExcelReaderSingleColumn er = new ExcelReaderSingleColumn(filename);
		List<FieldOperation> list = er.getAllOperations();
		List<Inputs> inputsList = daoInputs.findAll();

		// List<FieldOperation> foAfterAmounts= afo.getAmounts(list,
		// inputsList);

		// update amounts
		for (FieldOperation fieldOperation : list) {
			afo.getAmounts(fieldOperation, inputsList);

		}

		dao.save(list);

	}

	@Override
	public void updateBudgetDataNames() {
		List<FieldOperation> foList = dao.findAll();
		List<Inputs> inputsList = daoInputs.findAll();

		// attach budget names
		for (FieldOperation fo : foList) {
			for (Inputs inputs : inputsList) {

				if ((fo.getInputName() != null) && (inputs.getInputsName() != null) && fo.getInputName().equals(inputs.getInputsName())) {
					fo.setInputName(inputs.getInputsNameBudget());
					dao.save(fo);
				}

			}

		}
		// recalualte total amounts
		for (FieldOperation fo : foList) {
			for (Inputs inputs : inputsList) {

				if ((fo.getInputName() != null) && (inputs.getInputsName() != null) && fo.getInputName().equals(inputs.getInputsName())) {
					fo.setInputAmount(fo.getInputUsageQty() * inputs.getInputsPrice());
					dao.save(fo);
				}

			}

		}
	}

	@Override
	public List<AllFieldsTableUtil> ActBudgetAllfields() {

		List<FieldOperation> listFieldOperationsOr = dao.findAll();
		List<FieldOperation> listFieldOperations = new ArrayList<FieldOperation>();

		for (FieldOperation fo : listFieldOperationsOr) {
			if (fo.getYear() == Double.parseDouble("2015")) {
				listFieldOperations.add(fo);
			}

		}

		for (FieldOperation fo2 : listFieldOperations) {
			System.out.println(fo2);

		}

		return null;

	}

	@Override
	public void deleteAll() {
		dao.deleteAll();

	}

	@Override
	public void test() {
		System.out.println("METHOD TEST");
		// FieldOperationDaoImpl2 dao2 = new FieldOperationDaoImpl2();
		//
		// System.out.println(dao2.findData());

	}

}
