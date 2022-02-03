package day5;

public class StringFormat {
	public static void main(String args[]){  
		String name="vaishnavi";  
		String sf1=String.format("name is %s",name);  
		String sf2=String.format("value is %f",55.25250);  
		String sf3=String.format("value is %12.5f",55.25250);
		//returns 12 char fractional part filling with 0  
		  
		System.out.println(sf1);  
		System.out.println(sf2);  
		System.out.println(sf3);  
		}

}
