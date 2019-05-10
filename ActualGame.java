
public class ActualGame {

	
	String[] rooms = new String[12];
	
	int location = 4;
	
	
	public void populateRooms() {
		rooms[0] = "Chicken Dinner";
		rooms[1] = "Armory";
		rooms[2] = "Bear Trap";
		rooms[3] = "Empty Room";
		rooms[4] = "THE LEGENDARY BLADE OF AKASH";
		rooms[5] = "A literal bear";
		rooms[6] = "AAAAANNNNNNTTTTTSSSS";
		rooms[7] = "why is there a second bear trap?";
		rooms[8] = "The big dragon boss";
		rooms[9] = "Quicksand";
		rooms[10] = "Escape with the treasure";
		rooms[11] = "Super Secret Axe of Akash";
		rooms[12] = "spooky hallway";
		
	}
	
	public void navigation(int d) {
		if(location==4) {
			System.out.println("you are in an empty room");{
				if(d==1) {
					System.out.println("you exit the door to the north, a nice smell fills your nose");
					location = 1;
				}
				else if(d==4) {
					System.out.println("As you leave out the western door a pungent aroma and a deep growl attacks your senses");
					location = 6;
				}
				else {
					System.out.println("there is no door to the south or east");
					
				}
			}
			
		}
		else if(location == 1) {
			if(d==1) {
				System.out.println("You exit the north door and find youself in a long hallway, the door to your east glows and you hear a roar to the north");
				location = 13;
			}
			else if(d==2) {
				System.out.println("You are back where you started");
				location = 4;
				
			}
			else if(d==3) {
				System.out.println("You enter an armory and see a skeleton holding a small sword and sheild");
				location = 2;
			}
			else if(d==4) {
				System.out.println("Your leg gets caught in a bear trap");
				location = 3;
				
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
