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
		
		if (getRoot() == null) {
			setRoot(newNode);
		} else {
			TreeNode current = getRoot();
			TreeNode parent;
			boolean cont = true;
			
			while(cont) {
				parent = current;
				if (data == current.getData()) {
					cont = false;
				} else if (data < current.getData()) {
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
		TreeNode current = getRoot();
		TreeNode parent = getRoot();
		boolean leftChild = true;
		
		if (current != null) {
		
			while (current.getData() != data) {
				parent = current;
				
				if (data < current.getData()) {
					leftChild = true;
					current = current.getLeft();
				} else {
					current = current.getRight();
					leftChild = false;
				}
				
				if (current == null) {
					return;
				}
			}
			
			if (current.getLeft() == null && current.getRight() == null) {
				if (current == getRoot()) {
					setRoot(null);
				} else if (leftChild) {
					parent.setLeft(null);
				} else {
					parent.setRight(null);
				}
				//System.out.println("Dang1");
				
			} else if (current.getRight() == null) {
				if (current == getRoot()) {
					setRoot(current.getLeft());
				} else if (leftChild) {
					parent.setLeft(current.getLeft());
				} else {
					parent.setRight(current.getLeft());
				}
				//System.out.println("Dang2");
				
			} else if (current.getLeft() == null) {
				if (current == getRoot()) {
					setRoot(current.getRight());
				} else if (leftChild) {
					parent.setLeft(current.getRight());
				} else {
					parent.setRight(current.getRight());
				}
				//System.out.println("Dang3");
				
			} else {
				//System.out.println("Dang4");
				TreeNode replaceParent = current;
				TreeNode replace = current;
				TreeNode focus = current.getRight();
				
				while (focus != null) {
					replaceParent = replace;
					replace = focus;
					focus = focus.getLeft();
				}
				
				if (replace != current.getRight()) {
					replaceParent.setLeft(replace.getRight());
					replace.setRight(current.getRight());
				}
				
				if (current == getRoot()) {
					setRoot(replace);
				} else if (leftChild) {
					parent.setLeft(replace);
				} else {
					parent.setRight(replace);
				}
				replace.setLeft(current.getLeft());
			}
			num_nodes -= 1;
		}
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