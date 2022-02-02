package day4;

import java.util.Scanner;
public class EvenNumbersBetween23And57 {


	   public static void main(String args[]) {
			int n = 57;
			System.out.println("Even Numbers from 23 to "+n+" are: ");
			for (int i = 23; i <= n; i++) {
			   //if number%2 == 0 it means its an even number
			   if (i % 2 == 0) {
				System.out.println(i + " ");
			   }
			}
		   }
		}
