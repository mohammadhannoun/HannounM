package srs20120042;

import java.util.HashMap;

public class HTUConfig {
	// Implementaion of the sigleton design pattern
	public static HTUConfig instance = null;
	private HashMap<String, String> configMap;

	// Defalut constructor declared as private to prevent direct object construction
	private HTUConfig() {
		configMap = new HashMap<String, String>();
		configMap.put("Year", "2021");
		configMap.put("Semester", "Fall");
	}

	// A method to update a vlue in the configMap map
	public void update(String key, String value) {
		configMap.put(key, value);
	}

	// A method to get the value of a key in the configMap map
	public String get(String key) {
		return configMap.get(key);
	}

	// A method that checks whether one object has been instantiated or not
	public static HTUConfig getInstance() {
		// Constructing an object if the value of instance was null
		if (instance == null) {
			instance = new HTUConfig();
		}
		// returning the only object if one object has been already created
		return instance;
	}

	// toString method that prints the yeae and
	@Override
	public String toString() {
		return "[" + "Year: " + get("Year") + ", semester: " + get("Semester") + "]";
	}
}
