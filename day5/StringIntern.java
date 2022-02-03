package day5;

public class StringIntern {
	public static void main(String args[]){  
		String s1=new String("hello");  
		String s2="hello";  
		String s3=s1.intern();
		
		System.out.println(s1==s2);
		//false because reference variables are pointing to different instance  
		System.out.println(s2==s3);
		//true because reference variables are pointing to same instance  
		}

}
