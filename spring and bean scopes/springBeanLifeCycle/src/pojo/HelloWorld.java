package pojo;


public class HelloWorld {
	public void init()  {
		System.out.println("Bean has been initiated, I'm the init() method");
	}
	
	public void destroy() {
		System.out.println("Container has been closed, I'm the destroy() method");
	}
	
	

}