import java.util.*;

public class TraversingTheTrees {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		
		try {
			while ((line = sc.nextLine()) != null) {
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
				for (int i = line.length() - 1; i >= 0; i--) {
					System.out.println("\nRemoving " + line.charAt(i) + ":");
					tree.delete(line.charAt(i));
					printTree(tree.getRoot(), 0);
				}
			}
		} catch(Exception e) {}
	}
	
	public static void Inorder(TreeNode tn) {
		if (tn != null) {
			Inorder(tn.getLeft());
			System.out.print(tn.getData() + " ");
			Inorder(tn.getRight());
		}
	}
		
	public static void Preorder(TreeNode tn) {
		if (tn != null) {
			System.out.print(tn.getData() + " ");
			Preorder(tn.getLeft());
			Preorder(tn.getRight());
		}
	}
	
	public static void Postorder(TreeNode tn) {
		if (tn != null) {
			Inorder(tn.getLeft());
			Inorder(tn.getRight());
			System.out.print(tn.getData() + " ");
		}
	}

	public static void RInorder(TreeNode tn) {
	}
	
	public static void printTree(TreeNode tn, int lev) {
		int i;
		if (tn != null) {
			printTree(tn.getRight(), lev+1);
			for (i=0; i<lev; i++) {
				System.out.print("\t");
			}
			System.out.println(tn.getData());
			printTree(tn.getLeft(), lev+1);
		}			
	}
}