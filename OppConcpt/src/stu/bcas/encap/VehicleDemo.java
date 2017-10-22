package stu.bcas.encap;

public class VehicleDemo {
	public static void main(String args []) {
		Vehicle vehicle =new Vehicle ();
		
		vehicle.setVehicleNumber("NP154521");
		vehicle.setModelName("H545241GVHG");
		vehicle.setCapacity(200.00);
		vehicle.setColor("Blue");
		vehicle.setManufacturingYear(2017);
		
		System.out.println("\nVehicle Number : " + vehicle.getVehicleNumber() + "\nModel name : "+ vehicle.getModelName() + "\nCapacity : " + vehicle.getCapacity()+"\nVehicle Color : "+ vehicle.getColor()+"\nManufacture : " + vehicle.getManufacturingYear());
		
	}

}
