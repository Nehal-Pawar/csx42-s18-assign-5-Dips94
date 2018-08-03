package wordCount.treesForStrings;

import wordCount.modules.VisitorI;
import wordCount.treesForStrings.Node;

public class BST {
	private Node rootNode = null;
	
	/*
	** this method is called in populatetree call that passes word to be added to tree
	** @parameter word from file
	*/
	public void insert(String word) {
		Node node = search(rootNode, word);
		if (node == null) {
			node = createRec(word);
			rootNode = insertToTree(rootNode, node);
		} else {
			updateOccurences(node, word);
		}

	}
	/*
	** this method is called in insert  passes word to be added to new node for creation
	** @parameter word from file
	*/
	public Node createRec(String word) {
		Node node = new Node(word);
		return node;
	}
	
	/*
	** this method is called to counts repeated words
	** @parameter word from file
	** @parameter node that has same data
	*/
	public void updateOccurences(Node node, String word) {
		if (node.data.equals(word)) {
			node.Rep += 1;
		}
	}

	/*
	** this method is called insert to add new node to tree by traversing from rootnode
	** @parameter root from tree
	** @parameter node that has same data
	*/
	public Node insertToTree(Node root, Node node) {
		if (root == null) {
			root = node;
			return root;
		}
		int value = root.data.compareTo(node.data);

		if (value > 0) {// leftside root.data is smaller
			root.left = insertToTree(root.left, node);
		}

		else if (value < 0) {// rght side nood data is smaller
			root.right = insertToTree(root.right, node);
		}
		return root;
	}

	/*
	** this method is called insert to check if word is repeated in file 
	** @parameter root to compare data
	** @parameter new word for comparison 
	*/
	public Node search(Node root, String word) {
		if (root == null || root.data.equals(word)) {
			return root;
		}
		int value = root.data.compareTo(word);
		if (value > 0)
			return search(root.left, word);

		return search(root.right, word);
	}

	public Node getRootNode() {
		return rootNode;
	}

	public void accept(VisitorI visitor) {
		visitor.visit(this);
	}
}
