

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	ManagementCompany m1;
	Property p1, p2, p3;
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		
		//student add three properties, with plots, to mgmt co
		p1 = new Property("House", "Germantown", 1000, "John Doe", 2, 1, 2, 2);
		p2 = new Property("Apartment", "Frederick", 2000, "Bob Saget", 4, 1, 2, 2);
		p3 = new Property("Tower", "Germantown", 1400, "Steve Jobs", 6, 1, 2, 2);
		
		m1 = new ManagementCompany("Google", "123456", 3);
		
		m1.addProperty(p1);
		m1.addProperty(p2);
		m1.addProperty(p3);
	}

	@After
	public void tearDown() throws Exception{
		p1 = p2 = p3 = null;
		m1 = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//student should add property with 4 args & default plot (0,0,1,1)
		//student should add property with 8 args
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		m1.addProperty(new Property("Cavern", "City", 1200, "Bill"));
		m1.addProperty("Bush", "Bush City", 5, "Nature", 3, 4, 1, 1);
		m1.addProperty("Another Bush", "Bush City", 10, "Nature", 1, 1, 12, 10);
	}
 
	@Test
	public void testMaxRentProp() {
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(m1.maxRentProp(), 2000.0, 0);
	}

	@Test
	public void testTotalRent() {
		//student should test if totalRent returns the total rent of properties
		assertEquals(m1.totalRent(), 4400, 0);
	}

 }