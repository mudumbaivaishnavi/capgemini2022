package day5;

public class StringAll {
	public static void main(String args[]){  
		//StringJoin
		String joinString1=String.join("-","hello","how","r","u");  
		System.out.println(joinString1);  
		
//StringIndex
	String s2="hello how r u";
	int index1=s2.lastIndexOf('r');
	System.out.println(index1);
	
//StringLength
	String s3="hi";  
	String s4="all";  
	System.out.println("string length is: "+s3.length()); 
	System.out.println("string length is: "+s4.length());
	
//StringReplace
	String s5="hello how r u";  
	String replaceString=s5.replace('h','a');
	System.out.println(replaceString);
	
//StringReplaceAll
	String s6="My name is vaishnavi.";  
	String replaceString6=s6.replaceAll("is","was"); 
	System.out.println(replaceString6); 
	
//StringSplit
	String s7="my name is vaishnavi";  
	String[] words=s7.split("\\s");  
	for(String w:words){  
	System.out.println(w);
	
//StringStartsWith
	String s8="My name is vaishnavi";    
	System.out.println(s8.startsWith("My"));  // true  
	System.out.println(s8.startsWith("My name"));   // true  
	System.out.println(s8.startsWith("my name"));  //false
	
//StringSubString
	String s9="vaishnavi";  
	System.out.println(s9.substring(2,4));  
	System.out.println(s9.substring(2));
	
//StringToCharArray
	String s10="hello";  
	char[] ch=s10.toCharArray();  
	for(int i=0;i<ch.length;i++){  
	System.out.print(ch[i]);  
	}
	System.out.println();
	
//StringToLowerCase
	String s11="MY NAmE is VaishnaVI";  
	String s11lower=s11.toLowerCase();  
	System.out.println(s11lower); 
	
//StringToUpperCase
	String s12="my name is vaishnavi";  
	String s12upper=s12.toUpperCase();  
	System.out.println(s12upper); 
	
//StringTrim
	String s13="  my name   ";  
	System.out.println(s13+"vaishnavi");//without trim()  
	System.out.println(s13.trim()+"vaishnavi");
	
//StringValueOf
	int value=50;  
	String s14=String.valueOf(value);  
	System.out.println(s14+10);
	}
	}
}
