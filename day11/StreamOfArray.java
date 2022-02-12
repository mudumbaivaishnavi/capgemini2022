package day11;


import java.util.stream.Stream;
public class StreamOfArray {
	public static void  main(String ar[]) {
		Stream<String> stream = Stream.of( new String[]{"Vaishnavi","Aishwarya","Hema"} );
		stream.forEach(p -> System.out.println(p));

}
}