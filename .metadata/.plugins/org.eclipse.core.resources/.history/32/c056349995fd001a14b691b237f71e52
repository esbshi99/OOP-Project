import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class CreateGame {
	   String gameId;
       String title;
       String genre;
       double dailyRent;
       String rentStatus;
       public ArrayList<CreateGame> gameInfo = new ArrayList<CreateGame>();
       	

       
        public CreateGame(String gameId, String title, String genre, double dailyRent) {
        	this.gameId = gameId;
            this.title = title;
            this.genre = genre;
            this.dailyRent = dailyRent;
            this.rentStatus = "Available";
            this.gameInfo =  new ArrayList<CreateGame>();
        }
        Scanner in = new Scanner(System.in);
       
        public void gameInit(int gameAmount) {
        	//Using ArrayList to create multiple objects
        	
        	// Inside loop so user can create multiple games, change "i<2" to a user input declaring the amount of games intended to be registered.
        	int i = 0;
        	do {
        		UUID uuid = UUID.randomUUID();
        		String gameId = uuid.toString();
        		gameId = gameId.substring(0, Math.min(gameId.length(), 5)); 
        		
        		System.out.println("Create game by inputing details,");
        		System.out.print("Title: ");
        		String title = in.nextLine();
        		
        		System.out.print("Genre: ");
        		String genre = in.nextLine();
        		
        		
        		System.out.print("Rent price: ");
        		Double dailyRent = in.nextDouble();
        		in.nextLine();
        		CreateGame gameObject = new CreateGame(gameId, title, genre, dailyRent);
        		
        		
        		gameInfo.add(gameObject);
        		gameInfo.get(i).getStatus();
        		i++;
        	} while (i < gameAmount);
        }
        
        public void getStatus() {
            System.out.println( this.gameId + ": " + this.title + ". " + this.genre + ". " + this.dailyRent + ":-. Status: " + this.rentStatus + ".");
        }
        
        public String getGameId() {
        	return this.gameId;
        }
        
        
        public void delete() {
        	
        	this.gameInfo.get(0);
				System.out.println("Enter id of game you want to delete: ");

				String deleteGameId = in.nextLine();
					 in.close();
				
					for(int x = 0; x < this.gameInfo.size(); x++) {
							if	(deleteGameId.equals(this.gameInfo.get(x).getGameId())) {
								gameInfo.remove(x);
										System.out.println("Game was deleted!");
										break;
								} else if (x == this.gameInfo.size() - 1) {
									System.out.println("Invalid game id!");

								}
										
     	
							
    }
					}
        
        }
        

    