package mainPackage;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import MainPackage.Person;
import MainPackage.Truck;

public class Vehicle_Junit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	
	public void test() {
	Person PersonA = new Person("Rob", "Jaquette",UUID.randomUUID());
	Truck Truck1 = new Truck("F-250","BLUE",10000, PersonA, 4);
	Person PersonB = new Person("Renee", "Arya", UUID.randomUUID());
	Truck1.transferOwnership(PersonB);
	Person owner = Truck1.getOwner();
	assertEquals("This should be the new driver",PersonB, owner);
	}
}
