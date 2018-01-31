class TreeNode
{
	private char data;
	private TreeNode left;
	private TreeNode right;
	private TreeNode parent;
	
	public TreeNode()
	{
		data = 0;
		left = null;
		right = null;
		parent = null;
	}
	
	public char getData()
	{
		return this.data;
	}
	
	public void setData(char data)
	{
		this.data = data;
	}
	
	public TreeNode getLeft()
	{
		return this.left;
	}
	
	public TreeNode getRight()
	{
		return this.right;
	}
	
	public TreeNode getParent()
	{
		return this.parent;
	}
	
	public void setLeft(TreeNode left)
	{
		this.left = left;
	}
	
	public void setRight(TreeNode right)
	{
		this.right = right;
	}
	
	public void setParent(TreeNode parent)
	{
		this.parent = parent;
	}
}

public class BinaryTree
{	
	private TreeNode root;
	private int num_nodes;
	
	public BinaryTree()
	{
		root = null;
		num_nodes = 0;
	}
	
	public TreeNode getRoot()
	{
		return this.root;
	}
	
	public void setRoot(TreeNode tn)
	{
		this.root = tn;
	}
	
	public void insert(char data)
	{
	}
	
	public void delete(char data)
	{
	}
	
	public char getMax()
	{
	}
	
	public char getMin()
	{
	}

	public TreeNode search(TreeNode tn, char data)
	{
	}
}