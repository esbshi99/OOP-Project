import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Customer {
	private String customerId;
	private String customerName;
	 ArrayList<Customer> customerList = new ArrayList<Customer>();

    
    public Customer (String customerId, String customerName) {
    	this.customerId = customerId;
    	this.customerName = customerName;
    }
    
    
    public void getStatus() {
        System.out.println( this.customerId + ": " + this.customerName );
    }
    
    
    Scanner in = new Scanner(System.in);
    public void initCustomer(int customerNumer) {
    	int i = 0;
    do {
    	

    	UUID uuid = UUID.randomUUID();
    	String customerId = uuid.toString();
    	customerId = customerId.substring(0, Math.min(customerId.length(), 5)); 
    	
    	System.out.println("Create customer by inputing customer name,");
		System.out.print("Name: ");

		String customerName = in.nextLine();

		Customer customerInfo = new Customer(customerId, customerName);
		
		customerList.add(customerInfo);
		customerList.get(i).getStatus();
		
    	i++;
    } while(i < customerNumer);
    
    }
    
    public String getCustomerId() {
    	return this.customerId;
    }
    
    public void delete() {
    	
    	this.customerList.get(0);
			System.out.println("Enter id of customer you want to delete: ");

			String deleteGameId = in.nextLine();
				 in.close();
			
				for(int x = 0; x < this.customerList.size(); x++) {
						if	(deleteGameId.equals(this.customerList.get(x).getCustomerId())) {
							customerList.remove(x);
									System.out.println("Customer was deleted!");
									break;
							} else if (x == this.customerList.size() - 1) {
								System.out.println("Invalid customer id!");

							}
						in.close();
									
 	
						
}
				}
}
	
