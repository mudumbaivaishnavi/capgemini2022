package day6;
	class Number implements Runnable 
	{ 
	  public void run() 
	   { 
	     try 
	       { 
	        for(int i=1;i<=10;i++) 
	        {                   
	        	if(i==6)
	          Thread.sleep(5000);          
	          System.out.println(i); 
	        } 
	        } 
	       catch(InterruptedException e) 
	           { 
	             System.out.println("Exception..."+e); 
	           } 
	    } 
	} 
	 
	class ThreadWhichPrints1To10 
	{ 
	  public static void main(String [] args) 
	   { 
	     Number m1 = new Number(); 
	     Thread thread = new Thread(m1); 
	     thread.start(); 
	   } 
	}


