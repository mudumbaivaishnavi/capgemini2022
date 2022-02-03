package day5;

public class StringDemo {

	public static void main(String[] ar) {

		String s1="cat";
		String s2="cat";
		String s3=new String ("cat");
		 
		System.out.println("s1==s2:"+(s1==s2));
		System.out.println("s1==s3:"+(s1==s3));
		
		if (s1.equals(s3))
			System.out.println("Same");
			else {
				System.out.println("Not Same");
			}
			
	}
}