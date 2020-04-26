package movie_categorizer;



public class Node{
	int year;
	String name;
	double rate;
	Node leftChild =null;
	Node rightChild  =null;
	
	Node(String name,int year,double rate){
		this.year = year;
		this.name= name;
		this.rate = rate;
	}
	
	
	
	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getRate() {
		return rate;
	}



	public void setRate(double rate) {
		this.rate = rate;
	}



	public Node getLeftChild() {
		return leftChild;
	}



	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}



	public Node getRightChild() {
		return rightChild;
	}



	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}



	public String toString() {
		return name + " rate is : " +rate+" film year is : " +year;
		
	}

}
