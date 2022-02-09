package day9collectiondemo;

import java.io.*;
public class Io {
  
	 public static void main(String args[]) throws FileNotFoundException,IOException{
		 // file has "hello hi";
		 FileInputStream fin=new FileInputStream("C:xyz.txt");    
		    BufferedInputStream bin=new BufferedInputStream(fin);    
		    int i;    
		    System.out.println("reading file");
		    while((i=bin.read())!=-1){    
		     System.out.print((char)i);    
		    }    
		    System.out.println();
		    bin.close();    
		    fin.close();
		 FileOutputStream fout=new FileOutputStream("C:xyz.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout); 
	     System.out.println("writing file");
	     String s="This is demo.";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     FileReader fr=new FileReader("C:xyz.txt");    
         BufferedReader br=new BufferedReader(fr);    
         System.out.println("after writing file");
         int j;    
         while((j=br.read())!=-1){  
         System.out.print((char)j);  
         }  
         br.close();    
         fr.close();  
	        
	    System.out.println("success"); 
	  
	 }    
	}