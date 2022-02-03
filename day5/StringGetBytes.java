package day5;

public class StringGetBytes {
	public static void main(String args[]){  
		String s1="abcdef";  
		byte[] barr=s1.getBytes();  
		for(int i=0;i<barr.length;i++){  
		System.out.println(barr[i]);  
		}  
		}

}
