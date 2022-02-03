package day5;
import java.util.*;
public class StringIndexOf {  
	
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String s=sc.next();
	        char i=sc.next().charAt(0);
	        int c=s.indexOf(i);
	        System.out.println(c);
	    }
	
	}