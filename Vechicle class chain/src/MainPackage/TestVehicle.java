package MainPackage;

import java.util.UUID;

public class TestVehicle implements Vehicle_Interface {
	
	public static void main(String [ ] args){
		Person PersonA = new Person("Rob", "Jaquette",UUID.randomUUID());
		Truck Truck1 = new Truck("F-250","BLUE",10000, PersonA, 4);
		Person PersonB = new Person("Renee", "Arya", UUID.randomUUID());
		Truck1.transferOwnership(PersonB);
		MotorCycle MotorCycle1 = new MotorCycle("Indian","black", 1000, PersonA ,false);
}
}