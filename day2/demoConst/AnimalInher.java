package demoConst;

class Animal {
    void eat()
   {
       System.out.println("eat method");

   }
    void sleep()
   {
       System.out.println("sleep method");

   }

}
class Bird extends Animal{
  
   public void eat() {
       
       System.out.println("overide eat");
   }

   
   public void sleep() {
 
       System.out.println("override sleep");
   }

   public void fly()
   {
       System.out.println("in fly method");

   }
}
public class AnimalInher {
	 public static void main(String[] args) {
	       
	      
	       Animal a =new Animal();
	       a.eat();
	       a.sleep();
	       
	       Bird b = new Bird();
	       
	       b.fly();
	   }

}