package day8;

import java.util.*;
public class TreeSetCapableOfStoringStringObjects {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		//Collection<String> set = new TreeSet<>(Collections.reverseOrder());
		set.add("vaishnavi");
		set.add("mudumbai");
		set.add("v");
		set.add("m");
		
		Iterator<String> it = set.iterator();
		String query = "Harry";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}


}


	
