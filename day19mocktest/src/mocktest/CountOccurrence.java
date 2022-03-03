package mocktest;

import java.util.*;

public class CountOccurrence {
 
  static int findOccurrences(String str, char search)
  {
      
      int count=0;
      for(int i=0;i<str.length();i++)
      if(str.charAt(i) == search)
      count++;
      
      return count ;
  }
   
  public static void main(String args[]) 
  {
      Scanner sc=new Scanner(System.in);
  String input = sc.next();
  char search = sc.next().charAt(0);             
  
  int result = findOccurrences(input,search); 
  
  System.out.println("The Character '"+search+"' appears "+result+" times.");
  }
}