package wordCount.modules;

import java.io.BufferedReader;

import wordCount.driver.Driver;
import wordCount.treesForStrings.BST;
import  wordCount.treesForStrings.Node;
import wordCount.util.FileProcessor;

public class PopulateTree implements VisitorI{
	public static BufferedReader br = null;
	Node node;
	public PopulateTree() {
		node = null;
	}
	
	@Override
	public void visit(BST tree) {
		testInsert(tree);
	}
	public void testInsert(BST tree) {
		String line = "";
		FileProcessor fileProcessor = new FileProcessor(Driver.inputFilePath);
		//while (br == null) 
		while(true)
		{
			line = fileProcessor.readLine(br);
			if (line == null) {
				break;
			}
<<<<<<< HEAD
			String[] div = line.split(" ",-1);
			for(int i=0;i<div.length;i++) {
				tree.insert(div[i]);	
=======
			int bNum = 0;
			//String[] div = line.split(" ",-1);
			try {
				//bNum = Integer.parseInt(div[0]);	
			}catch(NumberFormatException e) {
				System.err.println("B-Number should be an Integer");
				System.exit(0);
>>>>>>> branch 'master' of https://github.com/csx42-summer-2018/csx42-s18-assign-5-Dips94
			}
<<<<<<< HEAD
=======
			//root=null
			insert(root,line);
>>>>>>> branch 'master' of https://github.com/csx42-summer-2018/csx42-s18-assign-5-Dips94
		}
		tree.inorderRec(tree.getRootNode());
	}
<<<<<<< HEAD
=======
	void insert(Node root,String word) {
			String[] splitword=word.split(" ",-1);
			for (String s: splitword){
			node = createRec(s);
			root = insertToTree(root, node);
			}
	}

	public Node createRec(String word){
	Node node = new Node(word);
	return node;	
	}
	public Node insertToTree(Node root,Node node){
		if (root==null) {System.out.println("doen");
			root = node;
            		return root;
		}
		System.out.println(root.data+"   " +node.data);
		int value = root.data.compareTo(node.data);
		
        if (value<0 ) {//leftside root.data is smaller
        	root.left = insertToTree(root.left,node);
        }
            
        else if (value >0) {//rght side nood data is smaller
        	root.right = insertToTree(root.right,node);
        }
        return root;
    }

>>>>>>> branch 'master' of https://github.com/csx42-summer-2018/csx42-s18-assign-5-Dips94

}
