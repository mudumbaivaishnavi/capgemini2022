package day5;
import java.util.Scanner;
public class SubstitutionCipherTechnique {
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String s=sc.nextLine();
	        String res="";
	        for(int i=0;i<s.length();i++)
	        {
	            char t=s.charAt(i);
	            int temp=t;
	            if(Character.isAlphabetic(t))
	            {
	                temp=temp-7;
	                if(t>='a'&&t<='z')
	                if(temp<97)
	                temp=temp+26;
	                if(t>='A'&&t<='Z')
	                if(temp<65)
	                temp=temp+26;
	                res+=(char)temp;
	            }
	            else if(t==' ')
	            res+=t;
	        }
	        if(res.length()>0)
	        System.out.println(res);
	        else
	        System.out.print("No hidden message");
	    }
	}