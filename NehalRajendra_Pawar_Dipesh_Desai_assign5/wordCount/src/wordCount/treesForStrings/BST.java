package wordCount.treesForStrings;

import wordCount.modules.VisitorI;
import wordCount.treesForStrings.Node;

public class BST {
	private Node rootNode = null;

	public void insert(String word) {
		Node node = search(rootNode, word);
		if (node == null) {
			node = createRec(word);
			rootNode = insertToTree(rootNode, node);
		} else {
			updateOccurences(node, word);
		}

	}

	public Node createRec(String word) {
		Node node = new Node(word);
		return node;
	}

	public void updateOccurences(Node node, String word) {
		if (node.data.equals(word)) {
			node.Rep += 1;
		}
	}

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
