
public class Node {

	protected int value;
	protected Node left;
	protected Node right;
	
	public Node(int value) {
		this.value = value;
	}
	
	public void addLeftNode(int value) {
		this.left = new Node(value);
	}
	
	public void addRightNode (int value) {
		this.right = new Node(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int countUnivalSubtree() {
		int count = 0;
		
		if ( this.getLeft() != null ) {
			if ( this.value == this.getLeft().getValue()) {
				count += 1;
			}
			count += this.getLeft().countUnivalSubtree();
		}
		
		if ( this.getRight() != null ) {
			if ( this.value == this.getRight().getValue()) {
				count += 1;
			}
			count += this.getRight().countUnivalSubtree();
		}
		
		if ( this.getRight() != null && this.getLeft() != null ) {
			if ( this.value == this.getRight().getValue() && this.value == this.getLeft().getValue()) {
				count += 1;
			}
		}
		
		return count;
	}
}
