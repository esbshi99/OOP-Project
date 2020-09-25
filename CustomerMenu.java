package Milestone;
import java.util.Scanner;

public class CustomerMenu {
	boolean mainMenu; //instance variable --> automatically false
	
	public static void main(String[] args) {
		 CustomerMenu menu = new CustomerMenu(); //create new instance variable
		 menu.runCustomerMenu();
		
	}
	
	public void runCustomerMenu() {
		
		while(!mainMenu) {
			printCustomerMenu();
			int option = getInput(); //new method 
			performAction(option); // a method that will perform the actual work.
				
		}
				
		
	}
	
	
	private void printCustomerMenu() {
		System.out.println("\nType one of the options below: ");
		System.out.println("1. Rent a game");
		System.out.println("2. Return a game ");
		System.out.println("3. Return to Main Menu");

	
	}

	private int getInput() {
		Scanner input = new Scanner(System.in); //create new scanner
		int option = -1;
		
		do {
			System.out.print("\nType your choice here: ");
			try {
				option = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid choice. Please type only numbers");
				
				}
				if(option < 0 || option > 3) {
					System.out.println("please try again. ");
					
				}

			} while (option < 0 || option > 3);
			return option;
		
		}
			
		
	private static void performAction(int option)
	{
		if(option ==1 ) {
			System.out.println("Rent a game. ");
			
		}else if(option == 2) {
			System.out.println("Return a game. ");
			
			
		}else if(option == 3) {
			System.out.println("Return to Main Menu. ");
		
		}
		
	}
}
	





