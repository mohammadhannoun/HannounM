package section16;

import java.util.ArrayList;
import java.util.List;

class Dat {
	private int number;

	public Dat(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Dat [number=" + number + "]";
	}
	
}

public class Class_192 {
	public static void main(String[] args) {
		List<Dat> list = new ArrayList<Dat>();
		list.add(new Dat(1));
		list.add(new Dat(2));
		list.add(new Dat(4));
		list.add(new Dat(3));
		list.add(new Dat(5));
		
		list.forEach(d -> {
			System.out.println(d.getNumber());
			System.out.println("hI");
		});
		
	}
}
