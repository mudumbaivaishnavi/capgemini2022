package day4;
 
import java.util.Scanner;
public class PrimeOrNotWithSample {
	
	  public static void main(String[] args) {
		  
		  Scanner sc=new Scanner(System.in);

		  String s=sc.next();
		  if(s.charAt(0)<'0'||s.charAt(0)>'9')
		  {
		      System.out.println("enter valid input");
		      System.exit(0);
		  }
		  int num=Integer.parseInt(s);
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }
if(num==1||num==0)
System.out.println(num+" is neither prime nor composite");
	    else if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}