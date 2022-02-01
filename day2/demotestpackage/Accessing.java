package demotestpackage;

public class Accessing {
	public static void main(String[] args) {
		System.out.println("Acessing variables from outside");
		Foundation k=new Foundation();
		
	//	System.out.println(k.var1);//private variable is not accessible
	//	System.out.println(k.var2);//protected variable is not accessible
	//	System.out.println(k.var3);//default variable is not accessible
		
		
		System.out.println(k.var3);//public variable is accessible
	}

}
