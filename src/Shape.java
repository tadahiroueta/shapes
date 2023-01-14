
public interface Shape {
         //Instead of using class, use the interface keyword in the header
	
	/*
	 * Create two abstract methods
	 * First one called getPerimeter - returns a double, does not receive anything
	 * Second one called getArea - returns a double, does not receive anything.
	 */
	abstract double getPerimeter();
	abstract double getArea();

	/*
	 * Methods are to be abstract only
	 * No implemented code.
	 * end with a semicolon.
	 */
	
}
