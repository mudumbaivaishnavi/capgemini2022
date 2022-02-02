package day4;

import java.util.Scanner;

public class ReverseAGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int output =0;
		int i = (int) Math.pow(10, String.valueOf(input).length() - 1);
		while (input !=0) {
			int digit = input % 10;
			output += digit * i;
			i/= 10;
			input /=10;
		}
		System.out.println(output);
		sc.close();
	}

}
