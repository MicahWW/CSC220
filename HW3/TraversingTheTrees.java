import java.util.*;

public class BinaryTreeTest
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String line;
		
		try
		{
			while ((line = sc.nextLine()) != null)
			{
				BinaryTree tree = new BinaryTree();
				for (int i = 0; i < line.length(); i++)
					tree.insert(line.charAt(i));
				System.out.print("       Preorder: ");
				Preorder(tree.getRoot());
				System.out.print("\n        Inorder: ");
				Inorder(tree.getRoot());
				System.out.print("\n      Postorder: ");
				Postorder(tree.getRoot());
				System.out.print("\nReverse Inorder: ");
				RInorder(tree.getRoot());
				System.out.println();
				printTree(tree.getRoot(), 0);
				for (int i = line.length() - 1; i >= 0; i--)
				{
					System.out.println("\nRemoving " + line.charAt(i) + ":");
					tree.delete(line.charAt(i));
					printTree(tree.getRoot(), 0);
				}
			}
		} catch(Exception e) {}
	}
	
	public static void Inorder(TreeNode tn)
	{
	}
		
	public static void Preorder(TreeNode tn)
	{
	}
	
	public static void Postorder(TreeNode tn)
	{
	}

	public static void RInorder(TreeNode tn)
	{
	}
	
	public static void printTree(TreeNode tn, int lev)
	{
	}
}