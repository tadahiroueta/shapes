
public class Square implements Shape {
	    //This class implements Shape interface
	
	private double length;
	
	public Square(int len)
	{
		length = len;
	}
	
	public double getLength()
	{
		return length;
	}
	
	//Must implement the methods in the interfaces
	@Override
	public double getPerimeter() {
		return length * 4;
	}

	@Override
	public double getArea() {
		return Math.pow(length, 2);
	}

	public String toString()
	{
		return "Perimeter: " + getPerimeter() + " Area: " + getArea();
	}
}
