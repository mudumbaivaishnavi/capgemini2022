package day5;
import java.util.Scanner;
public class RepetitionsOfLastNCharacters {
	  public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the string");
	        String a=sc.nextLine();
	        System.out.println("Enter the index");
	        int b=sc.nextInt();
	        String res="";
	        String temp=a.substring(b-1);
	        for(int i=0;i<b;i++)
	        res+=temp;

	        System.out.print(res);
	  }

}


  