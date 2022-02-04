package day6;
import java.util.*;
public class StoreColours implements Runnable {
	public static void main(String[] args) {
		StoreColours StoreColours = new StoreColours();
		Thread t1 = new Thread(StoreColours);
		t1.start();
	}
	public void run() {
		Random random = new Random();
		String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
		int index;
		
		while ((index = random.nextInt(6)) != 4) {
			System.out.println(colours[index]);
		}		
	}

}
