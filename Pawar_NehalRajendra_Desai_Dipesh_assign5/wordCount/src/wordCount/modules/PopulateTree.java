package wordCount.modules;

import java.io.BufferedReader;

import wordCount.driver.Driver;
import  wordCount.treesForStrings.Node;
import wordCount.util.FileProcessor;

public class PopulateTree implements VisitorI{
	public static BufferedReader br = null;
	Node node;
	public PopulateTree() {
		node = null;
	}
	
	@Override
	public void visit(Node root) {
		testInsert(root);
	}
	public void testInsert(Node root) {
		String line = "";
		FileProcessor fileProcessor = new FileProcessor(Driver.inputFilePath);
		while (br != null) {
			line = fileProcessor.readLine(br);
			if (line == null) {
				break;
			}
			int bNum = 0;
			String[] div = line.split(":",-1);
			try {
				bNum = Integer.parseInt(div[0]);	
			}catch(NumberFormatException e) {
				System.err.println("B-Number should be an Integer");
				System.exit(0);
			}
			insert(root,div[1]);
		}
	}
	void insert(Node root,String word) {
			node = createRec(word);
			root = insertToTree(root, node);
	}

	public Node createRec(String word){
	Node node = new Node(word);
	return node;	
	}
	public Node insertToTree(Node root,Node node){
		if (root == null) {
			root = node;
            return root;
		}
		int value = root.data.compareToIgnoreCase(node.data);
		
        if (value<0 ) {//leftside root.data is smaller
        	root.left = insertToTree(root.left,node);
        }
            
        else if (value >0) {//rght side nood data is smaller
        	root.right = insertToTree(root.right,node);
        }
        return root;
    }


}