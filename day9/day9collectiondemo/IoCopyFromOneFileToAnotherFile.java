package day9collectiondemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class IoCopyFromOneFileToAnotherFile {

	public static void main(String[] args) throws IOException {
		
	
		File filein = new File("input.txt");
		File fileout = new File("output.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(filein));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));
		
		int ch;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		};
		
		br.close();
		bw.close();
	
	}
}