package day4;
import java.util.*;
public class GenderAge {

	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        String s=sc.next();
	        int age=sc.nextInt();
	        double i=0;
	        if(s.equals("Male"))
	        {
	            if(age<=60)
	            i=9.2;
	            else
	            i=8.3;
	        }
	        else
	        {
	            if(age<=58)
	            i=8.2;
	            else
	            i=7.6;
	        }
	        System.out.println("Intrest="+i);
	    }
	}