package day9collectiondemo;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;
import java.util.HashSet;

class IoHashSet  {

	public static void main(String[] args) throws IOException {
	
		File filein = new File("inputFile.txt");
		File fileout = new File("outputFile.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(filein));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));
		
		HashSet<String> map = new HashSet<>();
		
		String str;
		while ((str = br.readLine()) != null) {
			str = str.trim();
		
				if (!map.contains(str))
					map.add(str);
		
					
		};
		
		Iterator<String> it = map.iterator();
		while (it.hasNext()) {
			
			bw.write(it.next() + "\n");
		}
		
		br.close();
		bw.close();
		
	}

}