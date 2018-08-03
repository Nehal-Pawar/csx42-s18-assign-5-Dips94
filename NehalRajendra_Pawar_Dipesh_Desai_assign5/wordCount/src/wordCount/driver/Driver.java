package wordCount.driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import wordCount.modules.PopulateTree;
import wordCount.modules.module2;
import wordCount.treesForStrings.BST;
import wordCount.util.MyLogger;
import wordCount.util.Results;

/**
 * @author Dipesh Desai
 *
 */
public class Driver {
	/**
	 * This is the main method
	 * 
	 * @return Nothing.
	 */
	public static String inputFilePath;
	public static int numberOfIterations;
	public static int debugLevel;
	public static String outputFilePath;

	public static void main(String[] args)
			throws FileNotFoundException, NumberFormatException, CloneNotSupportedException {
		/*
		 * As the build.xml specifies the arguments as argX, in case the argument value
		 * is not given java takes the default value specified in build.xml. To avoid
		 * that, below condition is used
		 */
		if (args.length != 4 || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")
				|| args[3].equals("${arg3}")) {
			System.err.println("Error: Incorrect number of arguments. Program accepts 4 argumnets. <input.txt> <output.txt> <Number of iteration> <Debug value> ");
			System.exit(0);
		}

		Results results = new Results();
		try {
			inputFilePath = args[0];
			File file = new File(inputFilePath);
			@SuppressWarnings("unused")
			FileReader fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.err.println("Input File not found, Give the correct path");
			System.exit(0);
		}

		outputFilePath = args[1];

		try {
			numberOfIterations = Integer.parseInt(args[2]);
		} catch (NumberFormatException e) {
			System.err.println("Number of iterations should be an Integer");
			System.exit(0);
		}

		try {
			debugLevel = Integer.parseInt(args[3]);
			MyLogger.setDebugValue(debugLevel);
		} catch (NumberFormatException e) {
			System.err.println("Debug level argument should be an Integer");
			System.exit(0);
		}

		long startTime = System.currentTimeMillis();
		results.writeToMyLogger(String.valueOf(startTime));
		for (int i = 0; i < numberOfIterations; i++) {
		results.writeToMyLogger(String.valueOf(i));
			BST tree = new BST();
			PopulateTree v1 = new PopulateTree();
			tree.accept(v1);
			module2 v2 = new module2();
			tree.accept(v2);
			if(i==0){
			results.storeToFile("Distinct : " + v2.distinctWord + "\ntotal words : " + v2.count);
			results.storeToFile("No of Char : " + v2.NoOfchar);}
			results.writeToFile(outputFilePath);
			
		}
		long finishTime = System.currentTimeMillis();
		results.writeToMyLogger(String.valueOf(finishTime));
		long totalTime = (finishTime - startTime) / numberOfIterations;
		results.writeToMyLogger(String.valueOf((finishTime - startTime)));		
		results.writeToStdout(String.valueOf(totalTime));

	}
}
