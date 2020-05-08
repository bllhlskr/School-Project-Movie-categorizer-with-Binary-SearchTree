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
		ll.searchTree("horrorTree").deserializeBinaryTree(readFile("horrorTree"));
		ll.searchTree("comedyTree").deserializeBinaryTree(readFile("comedyTree"));
		ll.searchTree("dramaTree").deserializeBinaryTree(readFile("dramaTree"));
		ll.searchTree("romanceTree").deserializeBinaryTree(readFile("romanceTree"));
	
	
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

                   
        			
					 switch(category) {
					 case 1 :
						 System.out.println("Add film name ");
		        			String filmName = in.nextLine();
		        			System.out.println("Add film year");
		        			int year = sc.nextInt();
		        			System.out.println("Add film a rate");
		        			double rate = sc.nextDouble();
		        			scifiTree.addNode(filmName, year, rate);
		        			System.out.println("------------------------");
							System.out.println("Film, year and rate added to the sci-fi tree");
							System.out.println("------------------------");
		        			break;
					 case 2 :
						 System.out.println("Add film name ");
		        			String filmName2 = in.nextLine();
		        			System.out.println("Add film year");
		        			int year2 = sc.nextInt();
		        			System.out.println("Add film a rate");
		        			double rate2 = sc.nextDouble();
		        			horrorTree.addNode(filmName2, year2, rate2);
		        			System.out.println("------------------------");
							System.out.println("Film, year and rate added to the sci-fi tree");
							System.out.println("------------------------");
					 case 3:
						 System.out.println("Add film name ");
		        			String filmName3 = in.nextLine();
		        			System.out.println("Add film year");
		        			int year3 = sc.nextInt();
		        			System.out.println("Add film a rate");
		        			double rate3 = sc.nextDouble();
		        			comedyTree.addNode(filmName3, year3, rate3);
		        			System.out.println("------------------------");
							System.out.println("Film, year and rate added to the sci-fi tree");
							System.out.println("------------------------");
		        			break;
					 case 4 :
						 System.out.println("Add film name ");
		        			String filmName4 = in.nextLine();
		        			System.out.println("Add film year");
		        			int year4 = sc.nextInt();
		        			System.out.println("Add film a rate");
		        			double rate4 = sc.nextDouble();
		        			dramaTree.addNode(filmName4, year4, rate4);
		        			System.out.println("------------------------");
							System.out.println("Film, year and rate added to the sci-fi tree");
							System.out.println("------------------------");
		        			break;
					 case 5 :
						 System.out.println("Add film name ");
		        			String filmName5 = in.nextLine();
		        			System.out.println("Add film year");
		        			int year5 = sc.nextInt();
		        			System.out.println("Add film a rate");
		        			double rate5 = sc.nextDouble();
		        			romanceTree.addNode(filmName5, year5, rate5);
		        			System.out.println("------------------------");
							System.out.println("Film, year and rate added to the sci-fi tree");
							System.out.println("------------------------");
		        			break;
					 default :
							System.out.println("-------------------");
							System.out.println("This category number is wrong");
							System.out.println("-------------------");
	                         break;
						
						
						}
					 
					continue;
					
		
				
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
					switch(categoryUpdate) {
					case 1 : 
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
						break;
						
					case 2 : 
						System.out.println("Horror Movies");
						horrorTree.inOrderTraversalTree(horrorTree.root);
						System.out.println("Please enter current the film name ");
						String film2=in.nextLine();
						System.out.println("Please enter the current film rate");
						double inRate2 = sc.nextDouble();
						System.out.println("Please enter the new film name ");
						String newfilm2=in.nextLine();
						System.out.println("Please enter the new  film rate");
						double newinRate2 = sc.nextDouble();
						System.out.println("Please enter the new  film year");
						int newYear2 = sc.nextInt();
						horrorTree.update(inRate2, newinRate2, newYear2, film2,newfilm2);
						break;
					case 3 :
						System.out.println("Comedy Movies");
						comedyTree.inOrderTraversalTree(comedyTree.root);
						System.out.println("Please enter current the film name ");
						String film3=in.nextLine();
						System.out.println("Please enter the current film rate");
						double inRate3 = sc.nextDouble();
						System.out.println("Please enter the new film name ");
						String newfilm3=in.nextLine();
						System.out.println("Please enter the new  film rate");
						double newinRate3 = sc.nextDouble();
						System.out.println("Please enter the new  film year");
						int newYear3= sc.nextInt();
						comedyTree.update(inRate3, newinRate3, newYear3, film3,newfilm3);
						break;
					case 4 : 
						System.out.println("Drama Movies");
						dramaTree.inOrderTraversalTree(dramaTree.root);
						System.out.println("Please enter current the film name ");
						String film4=in.nextLine();
						System.out.println("Please enter the current film rate");
						double inRate4= sc.nextDouble();
						System.out.println("Please enter the new film name ");
						String newfilm4=in.nextLine();
						System.out.println("Please enter the new  film rate");
						double newinRate4 = sc.nextDouble();
						System.out.println("Please enter the new  film year");
						int newYear4 = sc.nextInt();
						dramaTree.update(inRate4, newinRate4, newYear4, film4,newfilm4);
						break;
					case 5: 
						System.out.println("Romance Movies");
						romanceTree.inOrderTraversalTree(romanceTree.root);
						System.out.println("Please enter current the film name ");
						String film5=in.nextLine();
						System.out.println("Please enter the current film rate");
						double inRate5 = sc.nextDouble();
						System.out.println("Please enter the new film name ");
						String newfilm5=in.nextLine();
						System.out.println("Please enter the new  film rate");
						double newinRate5= sc.nextDouble();
						System.out.println("Please enter the new  film year");
						int newYear5 = sc.nextInt();
						romanceTree.update(inRate5, newinRate5, newYear5, film5,newfilm5);
						break;
						default :
						System.out.println("-------------------");
						System.out.println("This category number is wrong");
						System.out.println("-------------------");
                         break;
					
					
					}
				continue;
				
				case 4 :
					
					System.out.println("Please choose the movie category");
					System.out.println("1.Sci-Fi");
					System.out.println("2.Horror");
					System.out.println("3.Comedy");
					System.out.println("4.Drama");
					System.out.println("5.Romance");
					
					int categoryRemove = sc.nextInt();
					switch(categoryRemove) {
					case 1: 
						System.out.println("Sci-fi Movies");
						scifiTree.inOrderTraversalTree(scifiTree.root);
						System.out.println("Please enter the film name");
						String film=in.nextLine();
						System.out.println("Please enter the film's rate to delete film");
						double inRate = sc.nextDouble();
						scifiTree.remove(inRate, film);
						break;
					case 2 :
						System.out.println("Horror Movies");
						horrorTree.inOrderTraversalTree(horrorTree.root);
						System.out.println("Please enter the film name");
						String film2=in.nextLine();
						System.out.println("Please enter the film's rate to delete film");
						double inRate2 = sc.nextDouble();
						horrorTree.remove(inRate2, film2);
						break;
					case 3 :
						System.out.println("Comedy Movies");
						comedyTree.inOrderTraversalTree(comedyTree.root);
						System.out.println("Please enter the film name");
						String film3=in.nextLine();
						System.out.println("Please enter the film's rate to delete film");
						double inRate3 = sc.nextDouble();
						comedyTree.remove(inRate3, film3);
						break;
					case 4:
						System.out.println("Drama Movies");
						dramaTree.inOrderTraversalTree(dramaTree.root);
						System.out.println("Please enter the film name");
						String film4=in.nextLine();
						System.out.println("Please enter the film's rate to delete film");
						double inRate4 = sc.nextDouble();
						dramaTree.remove(inRate4, film4);
						
					case 5:
						System.out.println("romance Movies");
						romanceTree.inOrderTraversalTree(romanceTree.root);
						System.out.println("Please enter the film name");
						String film5=in.nextLine();
						System.out.println("Please enter the film's rate to delete film");
						double inRate5 = sc.nextDouble();
						romanceTree.remove(inRate5, film5);
						break;
					default : 
						System.out.println("-------------------");
						System.out.println("This category number is wrong");
						System.out.println("-------------------");
                         break;
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
				default :
					System.out.println("Wrong command");
			}
	  }
		
	  }

	

	  

}



		   
	


