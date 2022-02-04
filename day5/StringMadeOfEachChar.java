package day5;
import java.util.Scanner;
public class StringMadeOfEachChar {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 strings");
        String a=sc.nextLine();
        String b=sc.nextLine();
        String res="";
        char c1=b.charAt(0);
        char c2=b.charAt(b.length()-1);
        for(int i=0;i<a.length();i++)
        {
        if(a.charAt(i)==c1)
            if(i-1>=0)
            res=res+a.charAt(i-1);
        if(a.charAt(i)==c2)
            if(i+1<a.length())
            res=res+a.charAt(i+1);
            
        }

        System.out.print(res);
    }
    
    

}

