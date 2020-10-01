package Milestone;

import java.util.Scanner;

	public class MainMenu {
		Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
	//Open scanning the input
		
		new MainMenu().showMainMenu();
		//new MainMenu().showEmpolyeeMenu();
	
	}

	public void showEmpolyeeMenu() {
		// TODO Auto-generated method stub
		
	}
	
	//Display menu graphics
	public void showMainMenu() {
		System.out.println("Main Menu:");
		System.out.println("Welcome to DART, your good old game rental system. The competition has no steam to keep up! ");
		System.out.println("\n");
		System.out.println("Please specify your role by entering one of the options given: ");
		System.out.println("1. Enter “M” for Manager");
		System.out.println("2. Enter “E” for Empolyee");
		System.out.println("3. Enter “C” for Customer");
		System.out.println("1. Enter “X” to exit system");
		
		//read the value
		String val=input.nextLine();
	
		
		if(val.equals("M")){
			System.out.println("You have selected the Manager Menu ");
			new ManagerMenu();
		
		} else if (val.equals("E")) {
			System.out.println("You have selected the empolyee Menu");
			new EmpolyeeMenu();	
		
		} else if (val.equals("C")) {
			System.out.println("You have selected the Customer Menu");
			new CustomerMenu();
		
		
		} else {
				showMainMenu();
				}
			}
		}
		
		
		
		
	
		
	


