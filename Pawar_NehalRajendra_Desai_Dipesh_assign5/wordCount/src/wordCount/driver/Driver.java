package wordCount.driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

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
	public static int kVal;
	public static int debugLevel;

	public static void main(String[] args)
			throws FileNotFoundException, NumberFormatException, CloneNotSupportedException {
		/*
		 * As the build.xml specifies the arguments as argX, in case the argument value
		 * is not given java takes the default value specified in build.xml. To avoid
		 * that, below condition is used
		 */
		if (args.length != 3 || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")) {
			System.err.println("Error: Incorrect number of arguments. Program accepts 3 argumnets.");
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

		try {
			kVal = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.err.println("Value of K should be an Integer");
			System.exit(0);
		}

		try {
			debugLevel = Integer.parseInt(args[2]);
			MyLogger.setDebugValue(debugLevel);
		} catch (NumberFormatException e) {
			System.err.println("Debug level argument should be an Integer");
			System.exit(0);
		}
	}
}
