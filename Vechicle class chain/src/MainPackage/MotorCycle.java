package MainPackage;

public class MotorCycle extends Vehicle {
	boolean hasSideCar;
	public MotorCycle(String Name, String Color, int Weight, Person owner, boolean hasSideCar) {
		super(Name, Color, Weight, owner);
		this.hasSideCar = hasSideCar;
}
}