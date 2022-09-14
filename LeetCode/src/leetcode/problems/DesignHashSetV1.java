package leetcode.problems;

import java.util.HashMap;

public class DesignHashSetV1 {
	HashMap<Integer, Integer> map;
	 public DesignHashSetV1() {
	      map = new HashMap<Integer, Integer>();
	    }
	    
	    public void add(int key) {
	        if(!map.containsKey(key)){
	            map.put(key, 1);
	        }
	    }
	    
	    public void remove(int key) {
	        map.remove(key);
	    }
	    
	    public boolean contains(int key) {
	       return map.containsKey(key);
	    }
}
