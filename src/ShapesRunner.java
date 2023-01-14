import java.util.*;

public class ShapesRunner {

	public static void main(String[] args) {
		Shape[] objects = new Shape[6];
		objects[0] = new RightTriangle(1, 1);
		objects[1] = new RightTriangle(12, 28);
		objects[2] = new Square(12);
		objects[3] = new RightTriangle(9, 12);
		objects[4] = new Square(3);
		objects[5] = new Square(5);
		for(int i = 0; i < objects.length; i++)
		{
			System.out.println(objects[i].getPerimeter() + " " + objects[i].getArea());
			   //If all objects must implement the same methods you don't have to test each
			   //object to see if it can run the method.
		}
		List<Shape> shapes = Arrays.asList(objects);
		SortingShapes shapeSorter = new SortingShapes();
		shapes.sort(shapeSorter);
		System.out.println(shapes);
	}	
}
