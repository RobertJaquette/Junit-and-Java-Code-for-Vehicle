package MainPackage;

public abstract class Vehicle implements Vehicle_Interface {
	String Name; 
	String Color; 
	int Weight;
	Person owner;
	public Vehicle(){
		
	}
	public Vehicle(String Name, String Color, int Weight, Person owner){
		this.Name = Name;
		this.Color = Color;
		this.Weight = Weight;
		this.setOwner(owner);
	}
	
	public void transferOwnership(Person newOwner){
		
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

}