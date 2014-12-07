package MainPackage;

public class Car extends Vehicle {
	
	int NumberOfDoors;
	public Car(String Name, String Color, int Weight, Person owner, int NumberOfDoors) {
		super(Name, Color, Weight, owner);
		this.NumberOfDoors = NumberOfDoors;
	}
}
