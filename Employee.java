package Milestone;

import java.util.Scanner;

public class Employee {
	
		//declare variable 
	    private String name;
		private String addres;
		private int ID;
		private int birthYear;
		private int age;
		private double grossSalary;
		
	
		//constructor
	     public Employee (String name, String addres, int ID, int birthYear, double grossSalary) {
				this.addres= addres;
				this.birthYear = birthYear;
				this.grossSalary = grossSalary;
				this.ID = ID;	
				this.name = name;
				this.age = 0;
	  }	
	         
		//getters
     	public String getName(){
			return name;
		}
     	
     	public int getID() {
			return ID;
			
		}
     	
     	public int getBirthYear() {
			return birthYear;
			
		}
     	public String getAddres() {
			return addres;
			
		}
     	public double getGrossalary() {
			return grossSalary;
			
		}
     	
     	
     	//Setters
		public void setName (String name) {
			this.name = name;
		}
		
		
		public void setId(int ID) {
			this.ID = ID;
		}
		
		
		public void setAddres(String addres) {
			this.addres = addres;
			
		}
		
		public void setGrossSalary(int grossSalary) {
			this.grossSalary = grossSalary;
			
		}
		
		public void setBirthYear() {
			this.birthYear = birthYear;
		}
		
		public void registerEmpolyee () {
			System.out.println("Register an empolyee");
		}
		
		public void calculateAge(){
			int currentYear = 2020;
			this.age = currentYear - birthYear;
		}
		
	
		
		public String toString() {
			return "Empolyees name is " + this.name + " ID " +this.ID +
					" birth year " + this.birthYear + " Gross salary " + this.grossSalary +"SEK";
		}

}


