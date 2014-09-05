
public class Main {

	public static void main(String[] args) {
		try {
			Triangle impossibleTriangle = new Triangle("Impossible", 1.0, 1.0, 10.0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		Triangle possibleTriangle = new Triangle("Triangle", 4.0, 10.0, 9.0);
		Circle possibleCircle = new Circle("Circle", 2.4);
		printShapeInfo(possibleTriangle);
		printShapeInfo(possibleCircle);
	}
	
	//prints the perimeter and surface area for shape subclasses
	public static void printShapeInfo(Shape shape) {
		System.out.println(shape.getName() + "'s perimeter: " + shape.getPerimeter());
		System.out.println(shape.getName() + "'s surface area: " + shape.getSurfaceArea());
	}

}
