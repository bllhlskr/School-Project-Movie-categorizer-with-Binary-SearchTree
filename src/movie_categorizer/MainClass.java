package movie_categorizer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class MainClass {
	static Scanner sc = new Scanner(System.in);
	static Scanner in = new Scanner(System.in);
	static BinarySearchTree scifiTree = new BinarySearchTree();
	static BinarySearchTree horrorTree = new BinarySearchTree();
	static BinarySearchTree comedyTree = new BinarySearchTree();
	static BinarySearchTree dramaTree = new BinarySearchTree();
	static BinarySearchTree romanceTree = new BinarySearchTree();
	static Linked_List ll = new Linked_List();
	
	
	public static String readFile(String textName) {
		File file = new File("Movie categorizer_"+textName+".txt");
	Scanner sc = null;
	try {
		sc = new Scanner(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return sc.nextLine();
	}
	
	 public static void writeToFile(String a,String textName) {
		 File x = new File("Movie categorizer_"+textName+".txt");
			
			Formatter formatter;
				if(x.exists()) {
					
				}else {

					try {
					formatter = new Formatter("Movie categorizer_"+textName+".txt");
				
				System.out.println("created a file");
				
				}catch(IOException e) {
					e.printStackTrace();
				}
			  }
				 try {
					 BufferedWriter writer = new BufferedWriter(new FileWriter(x));
					    writer.write(a);
					     
					    writer.close();
				 }catch(IOException e) {
					 e.printStackTrace();
				 }
	 }
	  public static void main(String[] args) {
		
		ll.addTree(scifiTree, "scifiTree");
		ll.addTree(horrorTree, "horrorTree");
		ll.addTree(comedyTree, "comedyTree");
		ll.addTree(dramaTree, "dramaTree");
		ll.addTree(romanceTree, "romanceTree");
	ll.searchTree("scifiTree").deserializeBinaryTree(readFile("scifiTree"));
//	
		ll.searchTree("horrorTree").deserializeBinaryTree(readFile("horrorTree"));
		ll.searchTree("comedyTree").deserializeBinaryTree(readFile("comedyTree"));
		ll.searchTree("dramaTree").deserializeBinaryTree(readFile("dramaTree"));
		ll.searchTree("romanceTree").deserializeBinaryTree(readFile("romanceTree"));
//	
	
	int firstChoise =9999;
		
			
			while(firstChoise !=0) {
				System.out.println("Press 1 to add new film ");
				System.out.println("Press 2 to see all films in tree");
				System.out.println("Press 3 to update a film ");
				System.out.println("Press 4 to delete film");
				System.out.println("Press 0 to save and exit");
				firstChoise = sc.nextInt();
				switch(firstChoise) {
				
				case 1:
					System.out.println("Please choose the movie category");
					System.out.println("1.Sci-Fi");
					System.out.println("2.Horror");
					System.out.println("3.Comedy");
					System.out.println("4.Drama");
					System.out.println("5.Romance");
					int category = sc.nextInt();
//					ll.traverseAllTreesForName();
//					System.out.println("0.add a new category");
//					
//                    
//                    if(category == 0) {
//						BinarySearchTree newTree = new BinarySearchTree();
//						System.out.println("Please add new category name");
//						String treeName = in.nextLine();
//						ll.addTree(newTree, treeName);
//						continue;
//					}
                    System.out.println("Add film name ");
        			String filmName = in.nextLine();
        			System.out.println("Add film year");
        			int year = sc.nextInt();
        			System.out.println("Add film a rate");
        			double rate = sc.nextDouble();
					 
					
					if(category == 1) {
				       
						
						scifiTree.addNode(filmName, year, rate);
						System.out.println("------------------------");
						System.out.println("Film, year and rate added to the sci-fi tree");
						System.out.println("------------------------");
						
						continue;
					}	if(category == 2) {
				
						horrorTree.addNode(filmName, year, rate);
						System.out.println("------------------------");
						System.out.println("Film, year and rate added to the horror tree");
						System.out.println("------------------------");
						
						continue;
					}if(category == 3) {
				
						comedyTree.addNode(filmName, year, rate);
						System.out.println("------------------------");
						System.out.println("Film, year and rate added to the comedy tree");
						System.out.println("------------------------");
						
						continue;
					}if(category == 4) {
				
						dramaTree.addNode(filmName, year, rate);
						System.out.println("------------------------");
						System.out.println("Film, year and rate added to the drama tree");
						System.out.println("------------------------");
						
						continue;
					}if(category == 5) {
				
						romanceTree.addNode(filmName, year, rate);
						System.out.println("------------------------");
						System.out.println("Film, year and rate added to the romance tree");
						System.out.println("------------------------");
						
						continue;
					}
			
					
				
				
				case 2 : 
					
					ll.traverseAllTrees();

					break;
				
				case 3 :
					System.out.println("Please choose the movie category");
					System.out.println("1.Sci-Fi");
					System.out.println("2.Horror");
					System.out.println("3.Comedy");
					System.out.println("4.Drama");
					System.out.println("5.Romance");
					
					int categoryUpdate = sc.nextInt();
					if(categoryUpdate ==1) {
						System.out.println("Sci-fi Movies");
						scifiTree.inOrderTraversalTree(scifiTree.root);
						System.out.println("Please enter the film name ");
						String film=in.nextLine();
						System.out.println("Please enter the current film rate");
						double inRate = sc.nextDouble();
						System.out.println("Please enter the new film name ");
						String newfilm=in.nextLine();
						System.out.println("Please enter the new  film rate");
						double newinRate = sc.nextDouble();
						System.out.println("Please enter the new  film year");
						int newYear = sc.nextInt();
						scifiTree.update(inRate, newinRate, newYear, film,newfilm);
						
					}
					if(categoryUpdate ==2) {
						System.out.println("Horror Movies");
						horrorTree.inOrderTraversalTree(horrorTree.root);
						System.out.println("Please enter current the film name ");
						String film=in.nextLine();
						System.out.println("Please enter the current film rate");
						double inRate = sc.nextDouble();
						System.out.println("Please enter the new film name ");
						String newfilm=in.nextLine();
						System.out.println("Please enter the new  film rate");
						double newinRate = sc.nextDouble();
						System.out.println("Please enter the new  film year");
						int newYear = sc.nextInt();
						horrorTree.update(inRate, newinRate, newYear, film,newfilm);
						
					}
					if(categoryUpdate ==3) {
						System.out.println("Comedy Movies");
						comedyTree.inOrderTraversalTree(comedyTree.root);
						System.out.println("Please enter current the film name ");
						String film=in.nextLine();
						System.out.println("Please enter the current film rate");
						double inRate = sc.nextDouble();
						System.out.println("Please enter the new film name ");
						String newfilm=in.nextLine();
						System.out.println("Please enter the new  film rate");
						double newinRate = sc.nextDouble();
						System.out.println("Please enter the new  film year");
						int newYear = sc.nextInt();
						comedyTree.update(inRate, newinRate, newYear, film,newfilm);
						
					}
					if(categoryUpdate ==4) {
						System.out.println("Drama Movies");
						dramaTree.inOrderTraversalTree(dramaTree.root);
						System.out.println("Please enter current the film name ");
						String film=in.nextLine();
						System.out.println("Please enter the current film rate");
						double inRate = sc.nextDouble();
						System.out.println("Please enter the new film name ");
						String newfilm=in.nextLine();
						System.out.println("Please enter the new  film rate");
						double newinRate = sc.nextDouble();
						System.out.println("Please enter the new  film year");
						int newYear = sc.nextInt();
						dramaTree.update(inRate, newinRate, newYear, film,newfilm);
						
					}
					if(categoryUpdate ==5) {
						System.out.println("Romance Movies");
						romanceTree.inOrderTraversalTree(romanceTree.root);
						System.out.println("Please enter current the film name ");
						String film=in.nextLine();
						System.out.println("Please enter the current film rate");
						double inRate = sc.nextDouble();
						System.out.println("Please enter the new film name ");
						String newfilm=in.nextLine();
						System.out.println("Please enter the new  film rate");
						double newinRate = sc.nextDouble();
						System.out.println("Please enter the new  film year");
						int newYear = sc.nextInt();
						romanceTree.update(inRate, newinRate, newYear, film,newfilm);
						
					}
					System.out.println("---------------------");
					System.out.println("Film updated");
					System.out.println("---------------------");
				continue;
				
				case 4 :
					boolean flag = true;
					System.out.println("Please choose the movie category");
					System.out.println("1.Sci-Fi");
					System.out.println("2.Horror");
					System.out.println("3.Comedy");
					System.out.println("4.Drama");
					System.out.println("5.Romance");
					
					int categoryRemove = sc.nextInt();
					if(categoryRemove ==1) {
						System.out.println("Sci-fi Movies");
						scifiTree.inOrderTraversalTree(scifiTree.root);
						System.out.println("Please enter the film name");
						String film=in.nextLine();
						System.out.println("Please enter the film's rate to delete film");
						double inRate = sc.nextDouble();
						
						if(scifiTree.remove(inRate,film) == false) {
							flag=false;
						}else {
							flag = true;
						}
						
					}
					if(categoryRemove ==2) {
						System.out.println("Horror Movies");
						horrorTree.inOrderTraversalTree(horrorTree.root);
						System.out.println("Please enter the film name");
						String film=in.nextLine();
						System.out.println("Please enter the film's rate to delete film");
						double inRate = sc.nextDouble();
						
						if(horrorTree.remove(inRate,film) == false) {
							flag=false;
						}else {
							flag = true;
						}
						
					}
					if(categoryRemove ==3) {
						System.out.println("Comedy Movies");
						comedyTree.inOrderTraversalTree(comedyTree.root);
						System.out.println("Please enter the film name");
						String film=in.nextLine();
						System.out.println("Please enter the film's rate to delete film");
						double inRate = sc.nextDouble();
						
						if(comedyTree.remove(inRate,film) == false) {
							flag=false;
						}else {
							flag = true;
						}
						
					}
					if(categoryRemove ==4) {
						System.out.println("Drama Movies");
						dramaTree.inOrderTraversalTree(dramaTree.root);
						System.out.println("Please enter the film name");
						String film=in.nextLine();
						System.out.println("Please enter the film's rate to delete film");
						double inRate = sc.nextDouble();
						
						if(dramaTree.remove(inRate,film) == false) {
							flag=false;
						}else {
							flag = true;
						}
						
					}
					if(categoryRemove ==5) {
						System.out.println("romance Movies");
						romanceTree.inOrderTraversalTree(romanceTree.root);
						System.out.println("Please enter the film name");
						String film=in.nextLine();
						System.out.println("Please enter the film's rate to delete film");
						double inRate = sc.nextDouble();
						
						if(romanceTree.remove(inRate,film) == false) {
							flag=false;
						}else {
							flag = true;
						}
					}
				if(flag) {
					System.out.println("------------------------");
					System.out.println("Your film is deleted");
					System.out.println("------------------------");
				}
					
					continue;
				
                 case 0 :
                	 writeToFile(scifiTree.serializeBinaryTree(scifiTree.root),"scifiTree");
                	 writeToFile(horrorTree.serializeBinaryTree(horrorTree.root),"horrorTree");
                	 writeToFile(comedyTree.serializeBinaryTree(comedyTree.root),"comedyTree");
                	 writeToFile(dramaTree.serializeBinaryTree(dramaTree.root),"dramaTree");
                	 writeToFile(romanceTree.serializeBinaryTree(romanceTree.root),"romanceTree");
                	 System.out.println("----------------");
                	 System.out.println("SAVE & EXIT");
                	 System.out.println("----------------");
					break ;
				
			}
	  }
		
	  }
//	  public static void addFilm() {
//
//			System.out.println("add film name ");
//			String filmName = in.nextLine();
//			System.out.println("add film year");
//			int year = sc.nextInt();
//			System.out.println("add film a rate");
//			double rate = sc.nextDouble();
//	  }
//	  public static void addMovie() {
//			System.out.println("add film name ");
//			 String name = in.nextLine();
//			System.out.println("add film year");
//			int year = sc.nextInt();
//			System.out.println("add film a rate");
//			 double rate = sc.nextDouble();
//			 
//			//theTree.addNode(name,year, rate);
//			System.out.println("------------------------");
//			System.out.println("film, year and rate added to the sci*-Fi tree");
//			System.out.println("------------------------");
//			
//	  }
	
	

	  

}



		   
	


