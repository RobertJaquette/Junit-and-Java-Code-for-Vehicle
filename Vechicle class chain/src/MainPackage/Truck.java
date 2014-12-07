package MainPackage;

public class Truck extends Vehicle {
	int NumberOfAxels;
	
	public Truck(String Name, String Color, int Weight, Person owner, int NumberOfAxels) {
		super(Name, Color, Weight, owner);
		this.NumberOfAxels = NumberOfAxels;
	}

}
