package factory.design.patterns;

public class ShapeFactory {
	
	public Shape createShape(String s) {
		if(s.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		else if(s.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		else if(s.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}
}
