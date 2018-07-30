class Tree 
{
        String data;
        Tree left, right;

	 /* Constructor */
 
        public Tree(String item) 
	{
            key = item;
            left = right = null;
        }	    

	public Tree(String n)
	{
	 left = null;

	 right = null;

	 data = n;
	}

	/* set left node */

	public void setLeft(Tree n)
	{
	 left = n;
	}

	/* set right node */ 

	public void setRight(Tree n)
	{
	 right = n;
	}

	/*  get left node */

	public Tree getLeft()
	{
	 return left;
	}

	/* get right node */

	public Tree getRight()
	{
	 return right;
	}

	/* set data to node */

	public void setData(String d)
	{
	 data = d;
	}

	/* get data  */

	public String getData()
	{
	 return data;
	}     
}
