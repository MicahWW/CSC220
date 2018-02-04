class TreeNode {
	private char data;
	private TreeNode left;
	private TreeNode right;
	private TreeNode parent;
	
	public TreeNode() {
		data = 0;
		left = null;
		right = null;
		parent = null;
	}
	
	public char getData() {
		return this.data;
	}
	
	public void setData(char data) {
		this.data = data;
	}
	
	public TreeNode getLeft() {
		return this.left;
	}
	
	public TreeNode getRight() {
		return this.right;
	}
	
	public TreeNode getParent() {
		return this.parent;
	}
	
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
}

public class BinaryTree {
	private TreeNode root;
	private int num_nodes;
	
	public BinaryTree() {
		root = null;
		num_nodes = 0;
	}
	
	public TreeNode getRoot() {
		return this.root;
	}
	
	public void setRoot(TreeNode tn) {
		this.root = tn;
	}
	
	public void insert(char data) {
		TreeNode newNode = new TreeNode();
		newNode.setData(data);		
		
		if (root == null) {
			setRoot(newNode);
		} else {
			TreeNode current = getRoot();
			TreeNode parent;
			boolean cont = true;
			
			while(cont) {
				parent = current;
				
				if (data < current.getData()) {
					current = current.getLeft();
					
					if (current == null) {
						parent.setLeft(newNode);
						cont = false;
					}
				} else {
					current = current.getRight();
					
					if (current == null) {
						parent.setRight(newNode);
						cont = false;
					}
				}
			}
		}
			
		num_nodes += 1;
	}
	
	public void delete(char data) {
		
	}
	
	public char getMax() {
		return 'h';
	}
	
	public char getMin() {
		return 'l';
	}

	public TreeNode search(TreeNode tn, char data) {
		return tn;
	}
}