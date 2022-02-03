package day5;
import java.util.Scanner;
public class StringsAppendThemTogether {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 2 strings");
        String s1=sc.next().toLowerCase();
        String s2=sc.next().toLowerCase();
        String res="";
        if(s1.charAt(s1.length()-1)==s2.charAt(0))
        {
            res+=s1;
            for(int i=1;i<s2.length();i++)
            res+=s2.charAt(i);
        }
        else res=s1+s2;
        System.out.println(res);
    }

}
