package ua.ak.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inputs {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String inputsName;
	private String inputsType;
	private double inputsPrice;
	
	public Inputs() {
	
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getInputsName() {
		return inputsName;
	}

	public void setInputsName(String inputsName) {
		this.inputsName = inputsName;
	}

	public String getInputsType() {
		return inputsType;
	}

	public void setInputsType(String inputsType) {
		this.inputsType = inputsType;
	}

	public double getInputsPrice() {
		return inputsPrice;
	}

	public void setInputsPrice(double inputsPrice) {
		this.inputsPrice = inputsPrice;
	}
	

	
	
	
}
