package wordCount.modules;

import java.io.BufferedReader;

import wordCount.driver.Driver;
import wordCount.treesForStrings.BST;
import  wordCount.treesForStrings.Node;
import wordCount.util.FileProcessor;

public class PopulateTree implements VisitorI{
	public static BufferedReader br = null;
	Node node;
	public PopulateTree() {
		node = null;
	}
	/*
	** this method calls overides visitI class 
	** @parameter BST class tree
	*/
	@Override
	public void visit(BST tree) {
		testInsert(tree);
	}
	/*
	** this method calls creates file and calls insert from tree class for every word
	** @parameter BST class tree
	*/
	public void testInsert(BST tree) {
		try{
		String line = "";
		FileProcessor fileProcessor = new FileProcessor(Driver.inputFilePath);
		while (br != null) {
			line = fileProcessor.readLine(br);
			if (line == null) {
				break;
			}
			if(line.isEmpty())continue;
			String[] div = line.split(" ",-1);
			for(int i=0;i<div.length;i++) {
				tree.insert(div[i]);	
			}
		}
		br.close();
		}
		catch(Exception e){
		e.printStackTrace();
		}
	}

}
