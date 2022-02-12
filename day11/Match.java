//Terminal Operation
package day11;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Match { 
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
		boolean matchedResult = memberNames.stream()
		        .anyMatch((s) -> s.startsWith("R"));
		 
		System.out.println(matchedResult);   
		 
		matchedResult = memberNames.stream()
		        .allMatch((s) -> s.startsWith("k"));
		 
		System.out.println(matchedResult);    
		 
		matchedResult = memberNames.stream()
		        .noneMatch((s) -> s.startsWith("k"));
		 
		System.out.println(matchedResult);     

}
}