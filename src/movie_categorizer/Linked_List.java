package movie_categorizer;

public class Linked_List {
	private Node_linkedList root;
	private int size;



	public void addTree(BinarySearchTree tree,String treeName) {
		Node_linkedList node = new Node_linkedList(tree,treeName);
		if (root == null)
			root = node;
		else {
			Node_linkedList currentNode = root;
			while (currentNode.next != null)
				currentNode = currentNode.next;

			currentNode.next = node;
		}

		size++;
	}
	
	public BinarySearchTree searchTree(String name) {
		Node_linkedList currentNode = root;
		while (currentNode != null) {
			if(currentNode.treeName == name) {
				return currentNode.tree;
			}
			currentNode  =currentNode.next;
			
		}
		return null;
	}
	public void traverseAllTrees() {
		Node_linkedList currentNode = root;
		while(currentNode != null) {
			System.out.println(currentNode.treeName.toUpperCase());
			currentNode.tree.inOrderTraversalTree(currentNode.tree.root);
			System.out.println("----------------------");
			currentNode  = currentNode.next;
		}
		System.out.println("------------------------");
		System.out.println("All films listed");
		System.out.println("------------------------");
		
	}
	public void traverseAllTreesForName() {
		Node_linkedList currentNode = root;
		int count = 1;
		while(currentNode != null) {
			System.out.println(count +"."+currentNode.treeName);
			currentNode  = currentNode.next;
			count++;
		}
		count=1;
		
		
	}
	
}
