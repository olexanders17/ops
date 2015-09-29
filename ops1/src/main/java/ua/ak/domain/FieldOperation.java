package ua.ak.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "FIELD_OPERATION")
public class FieldOperation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	@Column(name = "REGISTRATION_NUMBER")
	private String registrationNumber;

	@Column(name = "TRACTOR_DRIVER")
	private String tractordriver;

	@Column(name = "MOTOR_HOURS")
	private double motorHours;

	@Column(name = "EQUIPMENT")
	private String equipment;

	@Column(name = "SERIAL_NUMBER")
	private String serialNumber;

	@Column(name = "FUEL_LITERS")
	private double fuelLiters;

	@Column(name = "CROP")
	private String crop;

	@Column(name = "SEEDS_NAME")
	private String seedsName;

	@Column(name = "SEEDS_USAGE_QTY")
	private double seedsUsageQty;

	@Column(name = "FERTILIZER_NAME")
	private String fertilizerName;

	@Column(name = "FERTILIZER_USAGE_QTY")
	private double fertilizerUsageQty;

	@Column(name = "CHEMICALS_NAME")
	private String chemicalsName;

	@Column(name = "CHEMICALS_USAGE_QTY")
	private double chemicalsUsageQty;

	@Column(name = "YEAR")
	private double year;

	@Column(name = "SEEDS_AMOUNT")
	private double seedsAmount;

	@Column(name = "FERTILIZER_AMOUNT")
	private double fertilizerAmount;

	@Column(name = "CHEMICALS_AMOUNT")
	private double chemicalsAmount;

	@Column(name = "SEEDS_NAME_BUDGET")
	private String seedsNameBudget;

	@Column(name = "SEEDS_TYPE_BUDGET")
	private String seedsTypeBudget;

	@Column(name = "CHEMICALS_NAME_BUDGET")
	private String chemicalNameBudget;

	@Column(name = "CHEMICALS_TYPE_BUDGET")
	private String chemicalTypeBudget;

	@Column(name = "FERTILIZER_NAME_BUDGET")
	private String fertilizerlNameBudget;

	@Column(name = "FERTILIZER_TYPE_BUDGET")
	private String fertilizerlTypeBudget;

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
		this.seedsName = seedsType;
		this.seedsUsageQty = seedsUsageQty;
		this.fertilizerName = fertilizerType;
		this.fertilizerUsageQty = fertilizerUsageQty;
		this.chemicalsName = chemicalsType;
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

	public String getSeedsName() {
		return seedsName;
	}

	public void setSeedsName(String seedsType) {
		this.seedsName = seedsType;
	}

	public double getSeedsUsageQty() {
		return seedsUsageQty;
	}

	public void setSeedsUsageQty(double seedsUsageQty) {
		this.seedsUsageQty = seedsUsageQty;
	}

	public String getFertilizerName() {
		return fertilizerName;
	}

	public void setFertilizerName(String fertilizerType) {
		this.fertilizerName = fertilizerType;
	}

	public double getFertilizerUsageQty() {
		return fertilizerUsageQty;
	}

	public void setFertilizerUsageQty(double fertilizerUsageQty) {
		this.fertilizerUsageQty = fertilizerUsageQty;
	}

	public String getChemicalsName() {
		return chemicalsName;
	}

	public void setChemicalsName(String chemicalsType) {
		this.chemicalsName = chemicalsType;
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

	public String getSeedsNameBudget() {
		return seedsNameBudget;
	}

	public void setSeedsNameBudget(String seedsNameBudget) {
		this.seedsNameBudget = seedsNameBudget;
	}

	public String getSeedsTypeBudget() {
		return seedsTypeBudget;
	}

	public void setSeedsTypeBudget(String seedsTypeBudget) {
		this.seedsTypeBudget = seedsTypeBudget;
	}

	public String getChemicalNameBudget() {
		return chemicalNameBudget;
	}

	public void setChemicalNameBudget(String chemicalNameBudget) {
		this.chemicalNameBudget = chemicalNameBudget;
	}

	public String getChemicalTypeBudget() {
		return chemicalTypeBudget;
	}

	public void setChemicalTypeBudget(String chemicalTypeBudget) {
		this.chemicalTypeBudget = chemicalTypeBudget;
	}

	public String getFertilizerlNameBudget() {
		return fertilizerlNameBudget;
	}

	public void setFertilizerlNameBudget(String fertilizerlNameBudget) {
		this.fertilizerlNameBudget = fertilizerlNameBudget;
	}

	public String getFertilizerlTypeBudget() {
		return fertilizerlTypeBudget;
	}

	public void setFertilizerlTypeBudget(String fertilizerlTypeBudget) {
		this.fertilizerlTypeBudget = fertilizerlTypeBudget;
	}

	@Override
	public String toString() {
		return "FieldOperation [id=" + id + ", date=" + date + ", fieldCode=" + fieldCode + ", fiedArea=" + fiedArea + ", operation=" + operation
				+ ", doneHa=" + doneHa + ", tractor=" + tractor + ", registrationNumber=" + registrationNumber + ", tractordriver=" + tractordriver
				+ ", motorHours=" + motorHours + ", equipment=" + equipment + ", serialNumber=" + serialNumber + ", fuelLiters=" + fuelLiters
				+ ", crop=" + crop + ", seedsType=" + seedsName + ", seedsUsageQty=" + seedsUsageQty + ", fertilizerType=" + fertilizerName
				+ ", fertilizerUsageQty=" + fertilizerUsageQty + ", chemicalsType=" + chemicalsName + ", chemicalsUsageQty=" + chemicalsUsageQty
				+ ", year=" + year + ", seedsAmount=" + seedsAmount + ", fertilizerAmount=" + fertilizerAmount + ", chemicalsAmount="
				+ chemicalsAmount + ", seedsNameBudget=" + seedsNameBudget + ", seedsTypeBudget=" + seedsTypeBudget + ", chemicalNameBudget="
				+ chemicalNameBudget + ", chemicalTypeBudget=" + chemicalTypeBudget + ", fertilizerlNameBudget=" + fertilizerlNameBudget
				+ ", fertilizerlTypeBudget=" + fertilizerlTypeBudget + "]";
	}

}
