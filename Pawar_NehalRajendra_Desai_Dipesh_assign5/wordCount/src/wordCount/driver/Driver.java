package wordCount.driver;

import wordCount.util.Results;
import wordCount.util.MyLogger;
import java.util.*;

public class Driver
{
    public static void main(String[] args)
    {
        
	
        //Read all the parameters and vlaidate if all are taken thorugh command line

        for (int i = 0; i < args.length; i++)
            if (args[i].equals("${arg" + i + "}"))
            {               
                System.err.println("incorrect args passed, Expected <input.txt>  <max/k> <debug value>. \n exiting \n");
                System.exit(1);
            }
	
	String INPUTFILE = args[0];
        int K = Integer.parseInt(args[1]);
        String DEBUGVALUE = args[2];
        try
        {
            MyLogger.setDebugValue(Integer.parseInt(args[2]));
        }
        catch (Exception e)
        {
            System.err.println("fifth argument cannot be parse to integer to set debug value.");
            System.exit(1);
        }
	
	IVisitor Obj2=new ModifiedBubbleSortVisitor();
	IVisitor Obj3=new MaxHeapVisitor();	
        IVisitor Obj=new PopulateVisitor();

	MyVector myv1=new MyVector(); 
        myv1.setFileName(INPUTFILE);
	myv1.setK(K);	
	myv1.accept(Obj);	
	myv1.accept(Obj2);

	MyVector myv2=new MyVector(); 
        myv2.setFileName(INPUTFILE);
	myv2.accept(Obj);        
	myv2.accept(Obj3);


	MyArray mya1=new MyArray(); 
	mya1.setFileName(INPUTFILE);
	mya1.setK(K);
        mya1.accept(Obj);
	mya1.accept(Obj2);
    
	MyArray mya2=new MyArray(); 
	mya2.setFileName(INPUTFILE);
        mya2.accept(Obj);
	mya2.accept(Obj3);

	Results Display=new Results();
	Display.writeToStdout(myv1.getResults());
	Display.writeToStdout(myv2.getResults());
	Display.writeToStdout(mya1.getResults());
	Display.writeToStdout(mya2.getResults());
    }
}
