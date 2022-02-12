//Terminal Operation
package day11;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class Reduce {
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
		Optional<String> reduced = memberNames.stream().reduce((s1,s2) -> s1 + "#" + s2);
		 
		reduced.ifPresent(System.out::println);
	}
}