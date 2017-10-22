package stu.bcas.encap;

public class Vehicle {
	private String vehicleNumber;
	private String modelName;
	private String color;
	private Double capacity;
	private int manufacturingYear;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getCapacity() {
		return capacity;
	}
	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}
	public int getManufacturingYear() {
		return manufacturingYear;
	}
	public void setManufacturingYear(int manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Vehicle [vehicleNumber=");
		sb.append(vehicleNumber);
		sb.append(", modelName=");
		sb.append(modelName);
		sb.append(", color=");
		sb.append(color);
		sb.append(", capacity=");
		sb.append(capacity);
		sb.append(", manufacturingYear=");
		sb.append(manufacturingYear);
		sb.append("]");
		return sb.toString();
	}
	
}
	


