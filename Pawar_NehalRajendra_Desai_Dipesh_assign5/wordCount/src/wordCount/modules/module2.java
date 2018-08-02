package wordCount.modules;

import wordCount.treesForStrings.BST;
import  wordCount.treesForStrings.Node;

public class module2 implements VisitorI{
	Node node;
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
		System.out.println("Distinct"+distinctWord);
		System.out.println(count);
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
		System.out.println(NoOfchar);
	}

}
