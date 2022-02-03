package day5;

public class StringConCat {
    //Adds strings
	public static void main(String[] ar) {
		String s1="This";
		String s2="is";
		String s3="Vaishnavi";
		
		String s4=s1.concat(" ").concat(s2).concat(" ").concat(s3);
		System.out.println(s4);
		
		String str = "Country";  
		 
		String s = "India is my ".concat(str);  
		  
		System.out.println(s);  
		
	}
}