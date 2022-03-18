package das.assign;

public class TestHashMap {
	public static void main(String[] args) {
		Task4 event = new Task4();
		
		event.insert("Mohmmad", 19);
		event.insert("Samer", 36);
		event.insert("Adel", 34);
		event.insert("Oday", 32);
		event.insert("Sanaa", 56);
		event.insert("eyad", 65);
		event.insert("Raghad", 25);
		event.insert("sjdkns", 51);
		event.insert("sjdkn", 51);
		event.insert("sjdks", 51);
		event.insert("sjdns", 51);
		event.insert("sjkns", 51);
		event.insert("sdkns", 51);
		
		event.print();
		
		event.insert("dkns", 51);
		System.out.println("-----------------");
		event.print();
		System.out.println("-----------------");
		System.out.println(event.search("Mohmmad"));
		System.out.println();
		
		event.remove("Mohmmad");
		System.out.println("---------------");
		event.print();
	}
}
