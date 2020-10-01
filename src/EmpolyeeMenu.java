package Milestone;

import java.util.Scanner;

public class EmpolyeeMenu {
	boolean mainMenu;
	

	public EmpolyeeMenu() {
		
		RunEmpolyeeMenu();
	}
		
	public void RunEmpolyeeMenu() {
		
		while(!mainMenu) {
			printEmpolyeeMenu();
			int option = getInput(); //new method 
			performAction(option); // a method that will perform the actual work.
				
		}
		
	}
		
	
	public void printEmpolyeeMenu() {
		System.out.println("Please enter the password ");
		Scanner input = new Scanner(System.in);
		String passWord = input.nextLine();
	
	//checks if the user entered the right password

		if(passWord.equals("password123")){
			System.out.println("\n Manager Screen - Type one of the options below");
			System.out.println("1. Register a game");
			System.out.println("2. Remove a game");
			System.out.println("3. Register a customer");
			System.out.println("4. Remove a customer");
			System.out.println("5. Show total rent profit");
			System.out.println("6. View all games");
			System.out.println("7. Return to Main Menu");

			
	} else {
		System.out.println("Invalid Password");
		
			}
	}

	
	private int getInput() {
		Scanner input = new Scanner(System.in); 
		int option = -1;
		
		do {
			System.out.print("\nType your choice here: ");
			try {
				option = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid choice. Please type only numbers");
				
				}
				if(option < 0 || option > 7) {
					System.out.println("please try again. ");
					
				}

			} while (option < 0 || option > 3);
			return option;
		
		}
	

		
		private void performAction(int value){
		
			if(value == 1 ) {
				System.out.println("Register a game. ");
				
			}else if(value == 2) {
				System.out.println("Remvove a game ");
				
				
			}else if(value == 3 ) {
				System.out.println("Remvove a game ");

			}else if(value == 4 ) {
				System.out.println("Register a customer ");
				
			}else if(value ==  5) {
				System.out.println("Show total rent profit ");

			}else if(value == 6 ) {
				System.out.println("View all games ");

			
			}else if(value == 7) {
				new MainMenu().showMainMenu();
			
			}
		
		
		//input.close();

		//need to go back to the main menu

				}

		}

		

