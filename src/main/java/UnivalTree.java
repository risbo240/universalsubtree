
public class UnivalTree {

	public UnivalTree() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// Initialisation de mon binary tree
		BinaryTree myTree = new BinaryTree(0);
		myTree.getRoot().addLeftNode(1);
		myTree.getRoot().addRightNode(0);
		myTree.getRoot().getRight().addRightNode(0);
		myTree.getRoot().getRight().addLeftNode(1);
		myTree.getRoot().getRight().getLeft().addRightNode(1);
		myTree.getRoot().getRight().getLeft().addLeftNode(1);
		
		System.out.println("Le nombre de sous arbres unival est de "+ myTree.getRoot().countUnivalSubtree());
	}

}
