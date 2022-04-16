
public class Property {
	private String city, owner, propertyName;
	private double rentAmount;
	private Plot plot;
	
	//No-Arg Property constructor
	public Property()
	{
		city = "";
		owner = "";
		propertyName = "";
		rentAmount = 0;
		plot = new Plot(0, 0, 1, 1);
	}
	
	//4 Arg Property constructor
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		plot = new Plot(0, 0, 1, 1);
	}
	
	//8 Arg Property constructor
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		plot = new Plot(x, y, width, depth);
	}
	
	//Copy constructor
	public Property(Property p)
	{
		this.propertyName = p.propertyName;
		this.city = p.city;
		this.owner = p.owner;
		this.rentAmount = p.rentAmount;
		plot = new Plot(p.plot.getX(), p.plot.getY(), p.plot.getWidth(), p.plot.getDepth());
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	public Plot getPlot () {
		return this.plot;
	}
	
	public Plot setPlot(int x, int y, int width, int depth) {
		plot = new Plot(x, y, width, depth);
		return plot;
	}

	@Override
	public String toString() {
		return "Property Name: " + propertyName + "\nLocated in " + city + "\nBelonging to: " + owner +
				"\n Rent Amount: " + rentAmount;
	}
	
	
}
