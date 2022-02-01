package demoday3;

//overload uisng methods
class Circle {
	void Area(double radius) {
		double result = 3.17 * radius;
		System.out.println(result);
	}
	// return type
	double Area(double lenght, double breadth) {
		double result = lenght * breadth;
		return result;
	}
}
public class MethodOverloading {
	public static void main(String ar[]) {
		Circle c = new Circle();
		c.Area(12.1);
		double temp = c.Area(15, 45);
		System.out.println(temp);
	}
}