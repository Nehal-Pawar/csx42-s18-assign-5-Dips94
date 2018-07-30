package maxKVisitors.util;

import java.util.*;

public class ModifiedBubbleSortVisitor implements IVisitor
{
	/**
	 * This method sorts elemtnts from MyVector vector myv in descending order
	 * @param  myv from class MyVector 
	 */

	public void visit(MyVector myv)
	{
		Vector<Integer> vec=myv.getvec();
		String Result="MyVector Bubble sort maxK are : ";
		
		int n = vec.size();
		for (int i = 0; i < n-1; i++)
		    for (int j = 0; j < n-i-1; j++)
		      if (vec.get(j) < vec.get(j + 1)) 
			{
		        int swap = vec.get(j);
		        vec.set(j, vec.get(j + 1));
		        vec.set(j + 1, swap);
		    	}
			for (int j = 0; j < myv.getK(); j++) {
			    Result=Result+vec.get(j)+" ";
			}			
			myv.setResults(Result);
	}

	/**
	 * This method sorts elemtnts from Myarray arraylist mya in descending order
	 * @param  myv from class MyArray 
	 */

	public void visit(MyArray mya)
	{
		ArrayList<Integer> vec=mya.getlist();
		String Result="MyArray Bubble sort maxK are : ";
		int n = vec.size();
		for (int i = 0; i < n-1; i++)
		    for (int j = 0; j < n-i-1; j++)
		      if (vec.get(j) < vec.get(j + 1)) 
			{
		        int swap = vec.get(j);
		        vec.set(j, vec.get(j + 1));
		        vec.set(j + 1, swap);
		    	}
			for (int j = 0; j < mya.getK(); j++) {
			    Result=Result+vec.get(j)+" ";
			}
			mya.setResults(Result);
	}
}
