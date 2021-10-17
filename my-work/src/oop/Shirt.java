package oop;

public class Shirt {
	String color;
	char size;
		Shirt(String newColor, char newSize){
			color= newColor;
			size= newSize;
		}
		public void setColor(String newColor) {
			System.out.println(newColor);
		}
		public void setSize(char newSize) {
			System.out.println(newSize);
		}
		
}
