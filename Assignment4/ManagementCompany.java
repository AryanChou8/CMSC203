import java.util.Arrays;

public class ManagementCompany {
	private int MAX_PROPERTY = 5, MGMT_WIDTH = 10, MGMT_DEPTH = 10, count = 0;
	private double mgmFeePer;
	private String name, taxID;
	private Property[] properties = new Property[MAX_PROPERTY];
	private Plot plot;
	
	//No Arg ManagementCompany Constructor
	public ManagementCompany() {
		name = "";
		taxID = "";
		mgmFeePer = 0;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	
	//3 Arg ManagementCompany Constructor
	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	
	//7 Arg ManagementCompany Constructor
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		plot = new Plot(x, y, width, depth);
	}
	
	//Copy Constructor
	public ManagementCompany(ManagementCompany otherCompany) {
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFeePer = otherCompany.mgmFeePer;
		plot = new Plot(otherCompany.plot);
	}
	
	/* Adds a property to the management property unless there are too many properties, the property does not exist,
	 * the plot goes beyond the management property, or if there is another property aready there
	 * Does this with a property parameter
	 */
	public int addProperty(Property property) {
		if(count == MAX_PROPERTY) {
			return -1;
		} else if(property == null) {
			return -2;
		} else if (!plot.encompasses(property.getPlot())) {
			return -3;
		} else {
			for(int i=0; i<count; i++) {
				Property p = properties[i];
				if(p.getPlot().overlaps(property.getPlot()))
					return -4;
			}
		}
		
		properties[count] = property;
		
		return count++; //Returns where the position is, then increments it.
	}
	
	//Does the same thing as the method above by turning the inputted information into a property and adding the property
	public int addProperty(String name, String city, double rent, String owner) {
		Property property = new Property(name, city, rent, owner);
		
		return this.addProperty(property);
	}
	
	//Does the same thing as the method above
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		Property property = new Property(name, city, rent, owner, x, y, width, depth);
		
		return this.addProperty(property);
	}
	
	//Goes through all the property and return the total rent amount
	public double totalRent() {
		int total = 0;
		for(int i = 0; i < count; i++) {
			total += properties[i].getRentAmount();
		}
		
		return total;
	}
	
	//Returns the rent amount of the property with the highest
	public double maxRentProp() {
		double max = 0;
		for(int i = 0; i < count; i++) {
			if(max < properties[i].getRentAmount()) {
				max = properties[i].getRentAmount();
			}
		}
		
		return max;
	}
	
	//Returns which property has the highest rent
	private int maxRentPropertyIndex() {
		double max = 0, index = 0;
		for(int i = 0; i < MAX_PROPERTY; i++) {
			if(max < properties[i].getRentAmount()) {
				max = (int) properties[i].getRentAmount();
				index = i;
			}
		}
		
		return (int) index;
	}
	
	//Gets an int parameter for the index that displays the information of the property at that index
	private String displayPropertyAtIndex(int i) {
		return properties[i].toString();
	}
	
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}

	public String getName() {
		return this.name;
	}
	
	public Plot getPlot() {
		return this.plot;
	}
	
	@Override
	public String toString() {
		return "ManagementCompany [properties=" + Arrays.toString(properties) + "]";
	}
}
