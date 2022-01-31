package demoConst;


class Persons {
	String name;
	public void Person(String n) {
		name = n;
	}
}
class Teacher extends Persons {
	double salary;
	String subject;
	public Teacher (double sal, String sub) {
		salary = sal;
		subject = sub;
	}
	void PrintDetails() {
		System.out.println("Subject is " +subject);
		System.out.println("The Salary of the Teacher is " +salary);
	}
}
class Student extends Persons {
	String university;
	Student(){}
	public Student (String u) {
		university  = u;
	}
	
}
class CollegeStudent extends Student {
	public CollegeStudent (String u) {
		super(u);
		
		// TODO Auto-generated constructor stub
	}
	
	
	int year;
	String major;
	public  CollegeStudent(int y, String maj) {
		year = y;
		major = maj;
	}
	void PrintDetails() {
		System.out.println("The year of Study is " +year);
		System.out.println("The major of college student is " +major);
	}
	 
	}
class HighSchoolInher{
	public static void main(String[] args) {
		Teacher p=new
				Teacher(50000,"Chemistry");
		CollegeStudent s=new
				CollegeStudent(2022,"ECE");
		p.PrintDetails();
		s.PrintDetails();
	}
}

