package maxKVisitors.util;

import java.util.*;

public  class MyArray implements AddElementInterface
{
	ArrayList<Integer> list=new ArrayList<Integer>();
	public  String FileName;
	static int K;
	public String Results;
	/**
	 * This method adds elemtnts from fileprocessor tp MyArray array
	 * @param int number from fileprocessor
	 */
	
	public void addelement(int number)
	{
		 list.add(number);		
	}
	
	/**
	 * This method sets file that is send to  fileprocessor 
	 * @param String Name
	 */
	public void  setFileName(String Name)
	{
		FileName=Name;
	}
	
	/**
	 * This method reutrns  file that is send to  fileprocessor 
	 * @return String Name
	 */
	public String getFileName()
	{
		return FileName;
	}
	
	/**
	 * This method reutrns vector
	 * @return ArrayList<Integer>
	 */
	
	public ArrayList<Integer> getlist()
	{
		return list;
	}

	/**
	 * This method calls the compile time Visitor class vector
	 * @param IVisitor
	 */
	public void accept(IVisitor Visitor)
	{
		Visitor.visit(this);
	}
	
	/**
	 * This method returns number of elements to be displayed
	 * @return int K
	 */
	public int getK()
	{
		return K;
	}
		
	/**
	 * This method sets number of elements to be displayed
	 * @param int K
	 */
	public void setK(int Re)
	{
		K=Re;
	}
	
	/**
	 * This method returns concanetated result 
	 * @return string K
	 */
	public String getResults()
	{
		return Results;
	}
	
	/**
	 * This method sets concanetated result 
	 * @param string Re
	 */	
	public void setResults(String Re)
	{
		Results=Re;
	}

}
