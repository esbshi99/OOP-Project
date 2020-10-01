package Milestone;

import java.util.Scanner;


public class ManagerMenu {
boolean mainMenu;


	public ManagerMenu() {

		
		RunMangerMenu();
	
	}
	
	public void RunMangerMenu() {
	
		while(!mainMenu) {
			printManagerMenu();
			int val1 = getInput(); //new method 
			performAction(val1); // a method that will perform the actual work.
				
		}
		
	}
	
	
	public void printManagerMenu () {
		
		System.out.print("Please enter the password for the Manager menu: ");
		Scanner input = new Scanner(System.in);
		String passWord = input.nextLine();

		
		if(passWord.equals("admin123")){
			System.out.println("\n Manager Screen - Type one of the options below");
			System.out.println("1. Add an employee");
			System.out.println("2. View all employees");
			System.out.println("3. Return to Main Menu");
	
		} else {
			System.out.println("Invalid Password");
	
		
		}
	
	}


	private int getInput() {
		Scanner input = new Scanner(System.in); //create new scanner
		int val1 = -1;
		
		do {
			System.out.print("\nType your choice here: ");
			try {
				val1 = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid choice. Please type only numbers");
				
				}
				if(val1 < 0 || val1 > 3) {
					System.out.println("please try again. ");
					
				}

			} while (val1 < 0 || val1 > 3);
			return val1;
		
		}
	
	private  void performAction(int val1)
	{ 
	
		if(val1 == 1) {
		System.out.println("Add an empolyee");	
	
	}else if(val1 == 2) {
		System.out.println("View all empolyee");
		
	} else if(val1 == 3) {
		
		new MainMenu().showMainMenu();
		
			}

	//input.close();


	}


}

	


