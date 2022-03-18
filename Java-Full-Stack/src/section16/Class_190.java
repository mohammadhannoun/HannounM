package section16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data {
	private String name;

	public Data(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
	
}

public class Class_190 {
	public static void main(String[] args) {
		List<Data> list = new ArrayList<Data>();
		list.add(new Data("Samer"));
		list.add(new Data("Mohammad"));
		list.add(new Data("Oday"));
		list.add(new Data("Raghad"));
		list.add(new Data("Adel"));
		
		Collections.sort(list, (Data o1, Data o2)->
		{
			if(o1.getName().length() > o2.getName().length()) return 1;
			if(o1.getName().length() < o2.getName().length()) return -1;
			else return 0;
			
		});		
		for(Data s : list) {
			System.out.println(s);
		}
	}
}