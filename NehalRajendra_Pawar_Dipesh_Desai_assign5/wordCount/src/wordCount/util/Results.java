package wordCount.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Vector;

public class Results  implements FileDisplayInterface, StdoutDisplayInterface{

	public List<String> TestResult = new Vector<String>();
    String result = "";

    /**write to output file the list that stores result
     *@param filename
     */
    public void writeToFile(String fileName)
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (String str : TestResult)
            {
                writer.write(str);
                writer.write("\n");
            }
            writer.close();
        }
        catch (Exception e)
        {
            System.out.println("Exception while writing to file." + e.toString());
            System.exit(1);
        }
    }

    /**
     * this method displays string passed 
     * @param String s
     */
    public void writeToStdout(String s)
    {
    	System.out.println(s);
    }


    /** store and display result from all tests
     * @param result
     */
    public void storeNewResult(String result)
    {
        TestResult.add(result);
    }		
}
