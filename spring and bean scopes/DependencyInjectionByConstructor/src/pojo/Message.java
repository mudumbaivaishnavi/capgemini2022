package pojo;

public class Message {
	String message;
	int id;
	
	public Message() {
		System.out.println("Default Constructor");
	}
	

	public Message(int id) {
		super();
		this.id = id;
	}


	public Message(String message) {
		super();
		this.message = message;
	}
	
	public void show() {
		System.out.println("calling without constructor object creation: " + id + " " + message);
	}
	
	
	

}