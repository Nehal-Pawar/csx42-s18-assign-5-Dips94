package maxKVisitors.util;

public class PopulateVisitor implements IVisitor
{
	/**
	 * this method adds elements to array in MyVector class
	 * @param  myv from class MyVector 
	 */
	public void visit(MyVector myv)
	{
		FileProcessor F1 = new FileProcessor();
	        F1.openFile(myv.getFileName());
		String number = "";
		while (number != null) {
			number = F1.nextint();
			if(number == null)break;
				
				myv.addelement(Integer.parseInt(number));	
		}
		
	}

	/**
	 * this method adds elements to array in MyArray class
	 * @param  mya from class MyArray 
	 */
	public void visit(MyArray mya)
	{
		FileProcessor F1 = new FileProcessor();
	        F1.openFile(mya.getFileName());
		String number = "";
		while (number != null) {
			number = F1.nextint();
			if(number == null)break;
				
				mya.addelement(Integer.parseInt(number));	
		}
				
	}
}
