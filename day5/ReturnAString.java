package day5;
import java.util.*;

public class ReturnAString {

    public static void main (String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        if(a.length() > b.length())
        System.out.println(b+a+b);
        else
        System.out.println(a+b+a);
    }
}