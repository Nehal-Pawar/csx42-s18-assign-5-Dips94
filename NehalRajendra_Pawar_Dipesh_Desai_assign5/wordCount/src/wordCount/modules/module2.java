package wordCount.modules;

import wordCount.treesForStrings.BST;
import  wordCount.treesForStrings.Node;
import wordCount.util.Results;

public class module2 implements VisitorI{
	Node node;
	public Results Write2=new Results();
	public int count=0;
	public int distinctWord = 0;
	public int NoOfchar=0;
	public module2() {
		node = null;
	}
	/*
	** this method calls creates file and calls insert from tree class for every word
	** @parameter BST class tree
	*/
	
	@Override
	public void visit(BST tree) {
		Node root=tree.getRootNode();
		inorderRec(root);
	}
	/*
	** this method calls traverses  tree  for every word and counts words,charters,distince char
	** @parameter Node rootnode
	*/

	public void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			for(int i=0;i<root.Rep;i++) {
				count++;
				NoOfchar=NoOfchar+root.data.length();	
			}
			distinctWord++;
			inorderRec(root.right);
		}
	}

}
