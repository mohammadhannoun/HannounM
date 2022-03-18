package factory.design.patterns;

public class ShapeClient {
	public static void main(String[] args) {
		ShapeFactory sF = new ShapeFactory();
		Shape s = sF.createShape("circle");
		s.draw();
	}
}
