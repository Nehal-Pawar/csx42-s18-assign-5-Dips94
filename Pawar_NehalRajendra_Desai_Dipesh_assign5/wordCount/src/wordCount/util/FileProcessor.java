package maxKVisitors.util;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileProcessor
{
    FileReader F = null;
    BufferedReader BR = null;

	/**
	 * This method creates objects for  fileprocessor to read file
	 * @param String InputFileName
	 */
    public void openFile(String InputFileName)
    {
        try
        {
            F = new FileReader(InputFileName);
            BR = new BufferedReader(F);
            
        }
        catch (FileNotFoundException e)
        {
		MyLogger.writeMessage("File not found at location: " + InputFileName, MyLogger.DebugLevel.FILE_PROCESSOR);
            System.err.println("File not found at location: " + InputFileName);
            System.exit(1);
        }
    }

	/**
	 * This method returns line by line read fe=rom file
	 * @return String line
	 */
    public String nextint()
    {
        String line = null;
        try
        {
            line = BR.readLine();
        }
        catch (Exception e)
        {
            System.err.println("Error while reading file");
	    MyLogger.writeMessage("Error while reading file" , MyLogger.DebugLevel.FILE_PROCESSOR);
            System.exit(1);
        }
        return line;
    }
}
