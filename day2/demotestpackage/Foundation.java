package demotestpackage;

public class Foundation {
	 //public static void main(String args[]) {
	  private int var1=15;
	   int var2=10;//default variable
	  protected int var3=13;
	  public int var4=16;
	  


public static void main(String[] args) {
	Foundation f=new Foundation();
	System.out.println(f.var1);
	//private variable is accessible since it is in same class if different class not accessible
	System.out.println(f.var2);//default is accessible
	System.out.println(f.var3);//protected is accessible
	System.out.println(f.var4);//public is accessible

}
}

