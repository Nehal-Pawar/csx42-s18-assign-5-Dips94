package maxKVisitors.util;

import maxKVisitors.util.MyVector;
import maxKVisitors.util.MyArray;

public interface IVisitor
{
	/**
	 * @param  myv from class MyVector 
	 */
	void visit(MyVector myv);

	/**
	 * @param  mya from class MYArray 
	 */
	void visit(MyArray mya);
}
