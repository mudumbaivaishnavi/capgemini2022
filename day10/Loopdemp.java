package day10;

import java.util.ArrayList;

public class Loopdemp {
public static void main(String ar[]) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("apple");
		list.add("banana");
		list.add("mango");

		list.forEach((number)->System.out.println(number));
		
}

}


