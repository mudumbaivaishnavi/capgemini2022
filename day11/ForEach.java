//Terminal Operation
package day11;

import java.util.ArrayList;
import java.util.List;
public class ForEach {
	public static void  main(String ar[]) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Hema");
		memberNames.add("Kumar");
		memberNames.add("Aishwarya");
		memberNames.add("Venu");
		memberNames.add("Ron");
		memberNames.add("Harry");
		memberNames.add("Vaishnavi");
		memberNames.add("Akash");
		
		memberNames.forEach(System.out::println);
	}
}