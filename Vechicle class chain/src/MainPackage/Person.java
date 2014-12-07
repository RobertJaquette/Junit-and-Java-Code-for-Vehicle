package MainPackage;
import java.util.UUID;

public class Person {
	String Firstname;
	String Lastname;
	UUID PersonID;
	public Person(String Firstname, String Lastname, UUID PersonID){
		this.Firstname = Firstname;
		this.Lastname = Lastname;
		this.PersonID = PersonID;
		}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		this.Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		this.Lastname = lastname;
	}
	public UUID getPersonID() {
		return PersonID;
	}
	public void setPersonID(UUID personID) {
		this.PersonID = UUID.randomUUID();
	}	
}