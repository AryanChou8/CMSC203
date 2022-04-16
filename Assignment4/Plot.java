
/*
 * Class: CMSC203 CRN XXXX
 Program: Assignment 4 Design
 Instructor: Professor Monshi
 Summary of Description: Creates a management 
 Due Date: 03/18/2021
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Student: Aryan Choudhary

 */

public class Plot extends Object {
	private int x, y, width, depth;
	
	//No-Arg Plot constructor
	public Plot()
	{
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}
	//4 Arg Plot constructor
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	//Copy constructor
	public Plot(Plot p)
	{
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}
	
	//Checks if a plot overlaps another plot
	public boolean overlaps(Plot plot)
	{
		
		return !((y + depth <= plot.y || plot.y + plot.depth <= y) || (x + width <= plot.x || plot.x + plot.width <= x));
	}
	
	//Checks if a plot encompasses another plot
	public boolean encompasses(Plot plot)
	{
		if(x <= plot.getX() && y <= plot.getY() && x + width >= plot.getX() + plot.getWidth() && y + depth >= plot.getY() + plot.getDepth()) {
			return true;
		}
		return false;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;
	}
	
}
