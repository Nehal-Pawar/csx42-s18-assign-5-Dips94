package wordCount.util;


import wordCount.modules.PopulateTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileProcessor
{
	public FileProcessor(String filePath) {
		try {
			PopulateTree.br = new BufferedReader(new FileReader(filePath));
		}catch(FileNotFoundException e) {
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
	} catch (IOException e) {
		e.printStackTrace();
	}
	return line;
}
}
