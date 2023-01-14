
public class RightTriangle implements Shape {
	//This class should implement the Shape Interface
	
	private double base;
	private double height;
	private double hypotenuse; 
	
	public RightTriangle(double b, double h)
	{
		base = b;
		height = h;
		hypotenuse = Math.hypot(base, height);
	}
	
	public double getBase()
	{
		return base;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getHypotenuse()
	{
		return hypotenuse;
	}	
	
	//Must implement the methods in the interfaces
	@Override
	public double getPerimeter() {
		return base + height + hypotenuse;
	}

	@Override
	public double getArea() {
		return base * height / 2;
	}

	public String toString()
	{
		return "Perimeter: " + getPerimeter() + " Area: " + getArea();
	}
}
