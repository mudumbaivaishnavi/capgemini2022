package demoConst;
import java.util.*;
class Compartment {
	double heights;
	double widths;
	double breadths;
	public Compartment(double height, double width,double breadth) {
		heights = height;
		widths = width;
		breadths = breadth;
	}
	
}

public class CompartmentMeth {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Compartment compartment = new Compartment(4.5,50.2,85.2);
		
		System.out.println(compartment.heights);
		System.out.println(compartment.widths);
		System.out.println(compartment.breadths);


}




}
