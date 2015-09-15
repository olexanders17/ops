package ua.ak.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FieldOperation {

	@Id
	@GeneratedValue()
	private long id;

	@Column(name = "DATE_OPERATION")
	private Date date;
	@Column(name = "FIELD_CODE")
	private String fieldCode;
	@Column(name = "FIED_AREA")
	private double fiedArea;
	@Column(name = "OPERATION")
	private String operation;
	@Column(name = "DONE_HA")
	private double doneHa;
	@Column(name = "TRACTOR")
	private String tractor;
	private String registrationNumber;
	private String tractordriver;
	private double motorHours;
	private String equipment;
	private String serialNumber;
	private double fuelLiters;
	private String crop;
	private String seedsType;
	private double seedsUsageQty;
	private String fertilizerType;
	private double fertilizerUsageQty;
	private String chemicalsType;
	private double chemicalsUsageQty;
	private double year;

	private double seedsAmount;
	private double fertilizerAmount;
	private double chemicalsAmount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getSeedsAmount() {
		return seedsAmount;
	}

	public void setSeedsAmount(double seedsAmount) {
		this.seedsAmount = seedsAmount;
	}

	public double getFertilizerAmount() {
		return fertilizerAmount;
	}

	public void setFertilizerAmount(double fertilizerAmount) {
		this.fertilizerAmount = fertilizerAmount;
	}

	public double getChemicalsAmount() {
		return chemicalsAmount;
	}

	public void setChemicalsAmount(double chemicalsAmount) {
		this.chemicalsAmount = chemicalsAmount;
	}

	public FieldOperation() {

	}

	public FieldOperation(Date date, String fieldCode, double fiedArea, String operation, double doneHa, String tractor, String registrationNumber,
			String tractordriver, double motorHours, String equipment, String serialNumber, double fuelLiters, String crop, String seedsType,
			double seedsUsageQty, String fertilizerType, double fertilizerUsageQty, String chemicalsType, double chemicalsUsageQty, double year) {
		super();
		this.date = date;
		this.fieldCode = fieldCode;
		this.fiedArea = fiedArea;
		this.operation = operation;
		this.doneHa = doneHa;
		this.tractor = tractor;
		this.registrationNumber = registrationNumber;
		this.tractordriver = tractordriver;
		this.motorHours = motorHours;
		this.equipment = equipment;
		this.serialNumber = serialNumber;
		this.fuelLiters = fuelLiters;
		this.crop = crop;
		this.seedsType = seedsType;
		this.seedsUsageQty = seedsUsageQty;
		this.fertilizerType = fertilizerType;
		this.fertilizerUsageQty = fertilizerUsageQty;
		this.chemicalsType = chemicalsType;
		this.chemicalsUsageQty = chemicalsUsageQty;
		this.year = year;
	}

	public FieldOperation(Date date, String fieldCode, double fiedArea) {
		super();
		this.date = date;
		this.fieldCode = fieldCode;
		this.fiedArea = fiedArea;
	}

	private void calculateAmounts() {

		// seedsAmount=seedsUsageQty*

	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFieldCode() {
		return fieldCode;
	}

	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}

	public double getFiedArea() {
		return fiedArea;
	}

	public void setFiedArea(double fiedArea) {
		this.fiedArea = fiedArea;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getDoneHa() {
		return doneHa;
	}

	public void setDoneHa(double doneHa) {
		this.doneHa = doneHa;
	}

	public String getTractor() {
		return tractor;
	}

	public void setTractor(String tractor) {
		this.tractor = tractor;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getTractordriver() {
		return tractordriver;
	}

	public void setTractordriver(String tractordriver) {
		this.tractordriver = tractordriver;
	}

	public double getMotorHours() {
		return motorHours;
	}

	public void setMotorHours(double motorHours) {
		this.motorHours = motorHours;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getFuelLiters() {
		return fuelLiters;
	}

	public void setFuelLiters(double fuelLiters) {
		this.fuelLiters = fuelLiters;
	}

	public String getCrop() {
		return crop;
	}

	public void setCrop(String crop) {
		this.crop = crop;
	}

	public String getSeedsType() {
		return seedsType;
	}

	public void setSeedsType(String seedsType) {
		this.seedsType = seedsType;
	}

	public double getSeedsUsageQty() {
		return seedsUsageQty;
	}

	public void setSeedsUsageQty(double seedsUsageQty) {
		this.seedsUsageQty = seedsUsageQty;
	}

	public String getFertilizerType() {
		return fertilizerType;
	}

	public void setFertilizerType(String fertilizerType) {
		this.fertilizerType = fertilizerType;
	}

	public double getFertilizerUsageQty() {
		return fertilizerUsageQty;
	}

	public void setFertilizerUsageQty(double fertilizerUsageQty) {
		this.fertilizerUsageQty = fertilizerUsageQty;
	}

	public String getChemicalsType() {
		return chemicalsType;
	}

	public void setChemicalsType(String chemicalsType) {
		this.chemicalsType = chemicalsType;
	}

	public double getChemicalsUsageQty() {
		return chemicalsUsageQty;
	}

	public void setChemicalsUsageQty(double chemicalsUsageQty) {
		this.chemicalsUsageQty = chemicalsUsageQty;
	}

	public double getYear() {
		return year;
	}

	public void setYear(double year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "FieldOperation [date=" + date + ", fieldCode=" + fieldCode + ", fiedArea=" + fiedArea + ", operation=" + operation + ", doneHa="
				+ doneHa + ", tractor=" + tractor + ", registrationNumber=" + registrationNumber + ", tractordriver=" + tractordriver
				+ ", motorHours=" + motorHours + ", equipment=" + equipment + ", serialNumber=" + serialNumber + ", fuelLiters=" + fuelLiters
				+ ", crop=" + crop + ", seedsType=" + seedsType + ", seedsUsageQty=" + seedsUsageQty + ", fertilizerType=" + fertilizerType
				+ ", fertilizerUsageQty=" + fertilizerUsageQty + ", chemicalsType=" + chemicalsType + ", chemicalsUsageQty=" + chemicalsUsageQty
				+ ", year=" + year + "]";
	}

}
