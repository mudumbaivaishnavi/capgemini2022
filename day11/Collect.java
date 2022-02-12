//Terminal Operation
package day11;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Collect { 
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
		
		List<String> memNamesInUppercase = memberNames.stream().sorted()
              .map(String::toUpperCase)
              .collect(Collectors.toList());

        System.out.print(memNamesInUppercase);
	}
}