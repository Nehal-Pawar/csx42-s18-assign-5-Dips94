package wordCount.util;


import wordCount.modules.PopulateTree;

import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileProcessor
{
	 Scanner sc2 = null;
	public FileProcessor(String filePath) {
		 try {
			PopulateTree.br = new BufferedReader(new FileReader(filePath));
				
		   
			//sc2 = new Scanner(new File(filePath));

		    } catch (FileNotFoundException e) {
			e.printStackTrace();  
		    }
		   
		
	}
	/**
	   * This method is used to read one line from the input file at a time. 
	   * @return String.
	   */
	public String readLine(BufferedReader br) {
	String line = "";
	try {
		line = br.readLine();
			//System.out.println("sas");
		/* while (sc2.hasNextLine()) {
			    Scanner s2 = new Scanner(sc2.nextLine());
			while (s2.hasNext()) {
			    String s = s2.next();
			    System.out.println(s);
			return s;
			}
		    }*/
	} catch (IOException e) {
		e.printStackTrace();
	}
	return line;
}
}
