package oop;

public class DemoCar {
	public static void main(String[] args) {
		Car p1 =new Car();
		Car p2 =new Car();		
		p1.carModel= "C 200";
		p1.carName= "Mercedes";
		p1.yearOfProduction= 2020;
		p2.carModel= "Sonata";
		p2.carName= "Hyundai";
		p2.yearOfProduction= 2012;
		p1.carDescription();
		p2.carDescription();
	}
}
