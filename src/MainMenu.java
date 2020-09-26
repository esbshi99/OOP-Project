package Milestone;
import java.util.Scanner;

public class MainMenu {
	
	Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//Open scanning the input
		
		new MainMenu().showMainMenu();
	
	}

		
	
	public void showMainMenu() {
	
		//Display the welcome message
		System.out.println("Welcome to DART, your good old game rental system. The competition has no steam to keep up! ");
		//Display options
		System.out.println("\n Please specify your role by entering one of the options given: \n 1. Enter \"M\" for Manager\n 2. Enter \"E\" for Employee \n 3. Enter \"C\" for Customer\n 4. Enter \"X\" to exit the system");
		//read the value
		String val=input.nextLine();
		
		if(val.equals("C")) {
			new CustomerMenu();
		} else {
			showMainMenu();
		}
		
		
	}
		
	}


