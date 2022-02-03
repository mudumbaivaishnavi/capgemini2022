package day5;

public class StringGetChars {
	public static void main(String args[]){  
		 String str = new String("hello  how r u");  
		      char[] ch = new char[10];  
		      try{  
		         str.getChars(5, 14, ch, 0);  
		         System.out.println(ch);  
		      }catch(Exception ex){System.out.println(ex);}

}}
