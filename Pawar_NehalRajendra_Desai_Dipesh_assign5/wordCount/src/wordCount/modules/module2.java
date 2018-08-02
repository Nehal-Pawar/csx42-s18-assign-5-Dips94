package wordCount.modules;

import wordCount.treesForStrings.BST;
import  wordCount.treesForStrings.Node;
import wordCount.util.Results;

public class module2 implements VisitorI{
	Node node;
	public Results Write2=new Results();
	int count=0;
	int distinctWord = 0;
	int NoOfchar=0;
	public module2() {
		node = null;
	}
	
	@Override
	public void visit(BST tree) {
		Node root=tree.getRootNode();
		inorderRec(root);
		numberofwords(root);
		numberofcharactersthetree(root);
	}
	public void numberofwords(Node root){	
		Write2.storeNewResult("Distinct : "+distinctWord+"\ntotal words : "+count);
		/*System.out.println("Distinct : "+distinctWord);
		System.out.println("total words : "+count);*/
	}
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
	public void numberofcharactersthetree(Node root){
		Write2.storeNewResult("No of Char : "+NoOfchar);
	}

}
