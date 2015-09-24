package ua.ak.utils;

import java.util.List;

import org.springframework.stereotype.Component;

import ua.ak.domain.FieldOperation;
import ua.ak.domain.Inputs;

@Component
public class AmountsForFieldOperations {

	public FieldOperation getAmounts(FieldOperation fieldOperation, List<Inputs> inputs) {

		for (Inputs inputsElement : inputs) {

			if (fieldOperation.getChemicalsType().equals(inputsElement.getInputsName())) {
				fieldOperation.setChemicalsAmount(fieldOperation.getChemicalsUsageQty() * inputsElement.getInputsPrice());
			}

			else if (fieldOperation.getSeedsType().equals(inputsElement.getInputsName())) {
				fieldOperation.setSeedsAmount(fieldOperation.getSeedsUsageQty() * inputsElement.getInputsPrice());
			}

			else if (fieldOperation.getFertilizerType().equals(inputsElement.getInputsName())) {
				fieldOperation.setFertilizerAmount(fieldOperation.getFertilizerUsageQty() * inputsElement.getInputsPrice());
			}

		}
		return fieldOperation;

	}

}
