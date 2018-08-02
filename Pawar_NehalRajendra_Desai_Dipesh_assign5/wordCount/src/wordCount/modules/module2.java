package wordCount.modules;

import java.io.BufferedReader;

import wordCount.driver.Driver;
import wordCount.treesForStrings.BST;
import  wordCount.treesForStrings.Node;
import wordCount.util.FileProcessor;

public class module2 implements VisitorI{
	public static BufferedReader br = null;
	Node node;
	int count=0;
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
		System.out.println(count);
	}
	public void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			count++;
			NoOfchar=NoOfchar+root.data.length();
			inorderRec(root.right);
		}
	}
	public void numberofcharactersthetree(Node root){
		System.out.println(NoOfchar);
	}

}
