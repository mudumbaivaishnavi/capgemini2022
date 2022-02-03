package day5;

public class WithOutFirstAndLastChar {
	public static void main(String[] args) {
		String str = "Wipro";
		
		str = str.substring(1, str.length() - 1);
		
		System.out.println(str);
	}

}
