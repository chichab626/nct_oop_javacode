package oop.week6;

class SportsVehicle {
	String manufacturer;
}

class SUV extends SportsVehicle {
	int capacity;
}

class Sedan extends SportsVehicle {
	String model;
}

public class Inheritance {

	public static void main(String[] args) {
		SUV suv = new SUV();
		suv.manufacturer = "Toyota";
		suv.capacity = 6;

		Sedan sedan = new Sedan();
		sedan.manufacturer = "Honda";
		sedan.model = "Civic";

		System.out.println("SUV details: " + suv.manufacturer 
				+ " capacity " + suv.capacity);
		
		System.out.println("Sedan details: " + sedan.manufacturer 
				+ " model " + sedan.model);

	}

}
