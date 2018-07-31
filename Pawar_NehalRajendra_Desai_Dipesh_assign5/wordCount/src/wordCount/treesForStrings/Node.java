package wordCount.treesForStrings;

import wordCount.modules.VisitorI;

public class Node {
	public String data;
	public Node left, right;

	/* Constructor */

	public Node(String item) {
		data = item;
		left = right = null;
	}

	/* set left node */

	public void setLeft(Node n) {
		left = n;
	}

	/* set right node */

	public void setRight(Node n) {
		right = n;
	}

	/* get left node */

	public Node getLeft() {
		return left;
	}

	/* get right node */

	public Node getRight() {
		return right;
	}

	/* set data to node */

	public void setData(String d) {
		data = d;
	}

	/* get data */

	public String getData() {
		return data;
	}
	void accept(VisitorI visitor) {
		visitor.visit(this);
	}
	
}