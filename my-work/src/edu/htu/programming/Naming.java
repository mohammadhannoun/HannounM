package edu.htu.programming;
import java.util.Scanner;
public class Naming {

	public static void main(String[] args) {
	Scanner name = new Scanner(System.in);
	System.out.print("Your Name : ");
	String myName = name.nextLine();
	System.out.println("Hello From "+myName);
	name.close();
	}

}
