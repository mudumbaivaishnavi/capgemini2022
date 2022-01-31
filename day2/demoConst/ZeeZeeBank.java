package com.demoConst;
import java.util.Scanner;

public class ZeeZeeBank {
	 public static int balance=15000;
	 public static void main (String[] args) {
	        
	        String account_number="9876543210";
	         
	        Scanner sc=new Scanner(System.in);
	       
	        System.out.println("Enter the amount to be deposited:");
	        int dep_amt=sc.nextInt();
	      deposit(balance,dep_amt);
	        System.out.println("Available balance is:"+balance);
	        
	        System.out.println("Enter the amount to be withdrawn:");
	        int wdw_amt=sc.nextInt();
	        withdraw(balance,wdw_amt);
	        if(balance<0)
	            System.out.println("Insufficient balance");
	        else
	        System.out.println("Available balance is:"+balance);
	    }
	    public static void deposit(int bal,int dep){
	        balance=bal+dep;
	    }
	     public static void withdraw(int bal,int wdw){
	        balance=bal-wdw;
	    }
	    
} 



