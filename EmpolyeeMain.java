package Milestone;

import java.util.Scanner;

 public class EmpolyeeMain {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the empolyees name");
		String name = sc.nextLine();
		
		System.out.println("Enter the empolyees ID");
		int ID = sc.nextInt();
		
		System.out.println("Enter the empolyees grossSalary ");
		double grossSalary = sc.nextDouble();
		
		System.out.println("Enter the empolyees birth year ");
		int birthYear = sc.nextInt();
		
		
		System.out.println("Enter the empolyees addres ");
		String address = sc.nextLine();
		
		System.out.println("Empolyee name: " + name + "birth year"
				+ "Gross Salary: "
				);
		
		Employee employee = new Employee(name, address, ID, birthYear, grossSalary);
		employee.calculateAge();
		System.out.println(employee);

		
	} 
		

}
