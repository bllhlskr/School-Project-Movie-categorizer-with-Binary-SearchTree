package movie_categorizer;


import java.util.ArrayList;

public class BinarySearchTree{
	Node root;
	int count =1;



 
public void addNode(String name,int year, double rate ) {
	Node newNode = new Node(name,year,rate);
	

	if(root==  null) {
		root = newNode;
		
	}else {
		Node currentNode = root;
		Node parent ;
		while(true) {
			
			parent = currentNode;
			
			if(rate <currentNode.rate) {
				
				currentNode = currentNode.leftChild;
			if(currentNode == null) {
				
				parent.leftChild = newNode;
				return;
			
			}
			}
			else {
				currentNode = currentNode.rightChild;
				if(currentNode == null) {
					parent.rightChild = newNode;
				return;
					
				}
		}
		
		}
	}
	
}

public void inOrderTraversalTree(Node currentNode){
	
	if(currentNode !=null) {
		inOrderTraversalTree(currentNode.leftChild);
		System.out.println(count++ + " " + currentNode);
	
		
		inOrderTraversalTree(currentNode.rightChild);

	}
	
	}


	public void postOrderTraversalTree(Node currentNode){
		if(currentNode !=null) {
			postOrderTraversalTree(currentNode.leftChild);
		    postOrderTraversalTree(currentNode.rightChild);
			System.out.println(currentNode);
			

		}
		}
	
public Node findNode(double rate,String s) {
	Node currentNode= root;
	
	while(currentNode.rate != rate || !currentNode.name.equals(s) ) {
		
		if(rate<currentNode.rate) {
			currentNode = currentNode.leftChild;
			
		}else {
			currentNode = currentNode.rightChild;
		}
		if(currentNode ==null) {
			return null;
			
			}
		
		}
	count = 1;
		return currentNode;
}
	
	
	//REMOVE
public boolean remove(double rate,String s) {
	
	if(findNode(rate,s) == null) {
		System.out.println("------------------");
		System.out.println("This film isnt in the tree");
		System.out.println("------------------");
		return false;
	}
	else {
	Node currentNode = root;
	Node parent = root;
	boolean isItAleftChild=true;
	
	while(currentNode.rate!= rate || !currentNode.name.equals(s) ) {
		
		parent = currentNode;
		
		if(rate < currentNode.rate) {
			isItAleftChild=true;
			currentNode = currentNode.leftChild;
			
		}
		else {
			isItAleftChild=false;
			currentNode = currentNode.rightChild;
			
		}
			
			
			if(currentNode==null) {

				count =1;
				return false;
			}
		}
	
		
		if(currentNode.leftChild == null && currentNode.rightChild == null) {
			
			if(currentNode==root) {
				root=null;
				
			}
			else if(isItAleftChild)
			{
				parent.leftChild = null;
				
			}
			else {
				parent.rightChild = null;
			}
		}
		
		else if (currentNode.rightChild == null) {
			
			if(currentNode == root) {
				root = currentNode.leftChild;
				
			}else if(isItAleftChild) {
				parent.leftChild = currentNode.leftChild;
				
			}else {
				parent.rightChild = currentNode.leftChild;
			}
		}
		
		
		else if(currentNode.leftChild==null) {
		
		if(currentNode == root) {
			root = currentNode.rightChild;
		}
		
		else if(isItAleftChild) {
			
		parent.leftChild = currentNode.rightChild;	
		}
		else {
			parent.rightChild = currentNode.rightChild;
		}
		
		}
		
		
		else {
			Node replacement = getReplacement(currentNode);
			if(currentNode == root ) {
				root = replacement;
			}else if(isItAleftChild) {
				parent.leftChild = replacement;
			}else {
				parent.rightChild = replacement;
			}
			replacement.leftChild = currentNode.leftChild;
			
		}
		}
	
	count =1;
	return true;
		
	  }
	

	
	 public  String serializeBinaryTree(Node rootNode) {
	        if (rootNode == null) {
	            return "null,";
	        }
	 
	        StringBuilder sb = new StringBuilder();
	        sb.append(rootNode.getName());
	        sb.append(",");
	       
	        sb.append(rootNode.getYear());
	        sb.append(",");
	        sb.append(rootNode.getRate());
	        sb.append(",");
	 
	        sb.append(serializeBinaryTree(rootNode.getLeftChild()));
	        sb.append(serializeBinaryTree(rootNode.getRightChild()));
	        
	        return sb.toString();
	    }
	 
	 
	 public  void deserializeBinaryTree(String data) {
	        String[] s =  data.split(",");
	       
	        ArrayList<String> values = new ArrayList<String>();
	        
	        for(String data1 : s) {
	        	
	           if(!data1.contentEquals("null")) { 
	              values.add(data1);
	           }
	        }
for (int i = 0; i < values.size(); i+=3) {
	  addNode(values.get(i) , Integer.parseInt(values.get(i+1)) ,
			  Double.parseDouble(values.get(i+2)));
	        	
	        }
	        
	    }
		public Node getReplacement(Node replacedNode) {
			
			Node replacementParent = replacedNode;
			Node replacement = replacedNode;
			
			Node currentNode = replacedNode.rightChild;
			
			while(currentNode != null) {
				replacementParent = replacement;
				replacement = currentNode ;
				currentNode = currentNode.leftChild;
			}
			if(replacement != replacedNode.rightChild) {
				replacementParent.leftChild = replacement.rightChild;
				replacement.rightChild = replacedNode.rightChild;
			}
			return replacement;
			
		}
		
	 
	
	
	
	public void update(double rate,double newRate,int year,String s,String newName) {
		
		Node current = null;
		if(findNode(rate,s)== null) {
			System.out.println("--------------");
			System.out.println("this movie isnt in the tree");
			System.out.println("--------------");
		}
		else {
			
			remove(rate,s);
			addNode(newName,year,newRate);
			System.out.println("---------------------");
			System.out.println("Film updated");
			System.out.println("---------------------");			}
		count=1;
		
		
		
		
	}
	
 

}
