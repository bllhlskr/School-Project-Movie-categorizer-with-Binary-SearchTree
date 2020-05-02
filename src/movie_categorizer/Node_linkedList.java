package movie_categorizer;

public class Node_linkedList {
	BinarySearchTree tree;
	String treeName;
	public Node_linkedList  next;
	
	public Node_linkedList(BinarySearchTree tree,String treeName) {
		this.tree= tree;
		this.treeName = treeName;
		next = null;
	}

	public BinarySearchTree getTree() {
		return tree;
	}

	public void setTree(BinarySearchTree tree) {
		this.tree = tree;
	}

	public String getTreeName() {
		return treeName;
	}

	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

	public Node_linkedList getNext() {
		return next;
	}

	public void setNext(Node_linkedList next) {
		this.next = next;
	}
	
	
	
}
