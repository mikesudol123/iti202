
public class ActualGame {


	boolean gameOver = false;
	boolean hasBlade = false;
	boolean hasSword = false;
	boolean hasBear = true;
	boolean hasAnts = true;
	boolean hasDragon = true;
	boolean hasDinner = true;
	boolean hasTrap1 = true;
	boolean hasTrap2 = true;

	Ants ant = new Ants();
	Bear b = new Bear();
	Dragon d = new Dragon();
	Player p = new Player();


	String[] rooms = new String[13];

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
				if(d==1) {
					System.out.println("Ye exit the door to the north, a nice smell fills yer nose.");
					location = 1;
				}
				else if(d==4) {
					System.out.println("As ye leave out the western door a pungent aroma and a deep growl attacks yer senses.");
					location = 6;
				}
				else {
					System.out.println("There is no door to the south or east.");

				}
}

		else if(location == 1) {
				if (hasDinner = true){
				p.setHealth(p.getHealth() + 10);
				System.out.println("Ye eat a turkey leg the size of your head and feel refreshed (gain 10 health). Your current health is: " + p.getHealth());
				hasDinner = false;
			}
				System.out.println("Where would yeh like to go, please enter a cardinal directon");
			if(d==1) {
				System.out.println("Ye exit the north door and find yerself in a long hallway... the door to yer east glows and ye hear a roar to the north!");
				location = 13;
			}
			else if(d==2) {
				System.out.println("Ye are back where you started.");
				location = 4;

			}
			else if(d==3) {
				System.out.println("Ye enter an armory and see a skeleton holding a small sword and sheild...");
				location = 2;
			}
			else if(d==4) {
				System.out.println("ACK! Yer leg gets caught in a bear trap.");
				location = 3;

			}
		}

		else if(location == 2) {
				if(hasSword = false){
					p.setDamage(p.getDamage() + 10);
					System.out.println("Ye pick up a sword! Your damage is now: " + p.getDamage());
					hasSword = true;

}
				System.out.println("Where would yeh like to go, please enter a cardinal directon.");
			if(d==1) {
				System.out.println("Alas! Ye exit the north door and find yourself face to face with a ancient knight holding a massive glowing sword!");
				location = 5;
			}
			else if(d==2) {
				System.out.println("There is no door to the south.");
			}
			else if(d==3) {
				System.out.println("There is no door to the east.");
			}
			else if(d==4) {
				System.out.println("Yer in a large dining room.");
				location = 1;

			}
		}
		else if(location == 3) {
			if(hasTrap1 == true){
				p.setHealth(p.getHealth() - 7);
			hasTrap1 = false;
		}
				System.out.println("Where would yeh like to go, please enter a cardinal directon.");
			if(d==1) {
				System.out.println("There is no door to the north.");

			}
			else if(d==2) {
				System.out.println("ACK! Ants everywhere!!");
				location = 7;

			}
			else if(d==3) {
				System.out.println("Ye enter a dining room.");
				location = 1;
			}
			else if(d==4) {
				System.out.println("There is no door to the east.");

			}
		}
		else if(location == 5) {
			hasBlade = true;
				System.out.println("Where would yeh like to go, please enter a cardinal directon.");
			if(d==1) {
				System.out.println("There is no door to the north.");
			}
			else if(d==2) {
				System.out.println("Ye are in a armory.");
				location = 2;

			}
			else if(d==3) {
				System.out.println("There is no door to the east.");
			}
			else if(d==4) {
				System.out.println("Ye exit the west door and find youself in a long hallway... the door to yer east glows and ye hear a roar to the north...");
				location = 13;

			}
		}
		else if(location == 6) {
			if(hasBear == true){
				p.setHealth(p.getHealth() - b.getDamage());
				System.out.println("OOF! Ye are attacked by a bear and take " + b.getDamage() + "damage. Yer current health is: " + p.getHealth());
			hasBear = false;
		}
				System.out.println("Where would yeh like to go, please enter a cardinal directon.");
			if(d==1) {
				System.out.println("Ack!! Ants everywhere!!");
				location = 7;
			}
			else if(d==2) {
				System.out.println("There is no door to the south.");

			}
			else if(d==3) {
				System.out.println("Yer back where ye started.");
				location = 4;
			}
			else if(d==4) {
				System.out.println("ACK! Ye step in a bear trap! Wish that got the bear...");
				location = 8;

			}
		}
		else if(location == 7) {
			if(hasAnts == true){

			p.setHealth(p.getHealth() - ant.getDamage());
			System.out.println("ACK! Ye get attacked by ants... Yer Current Health is: " + p.getHealth());
			hasAnts = false;

		}
				System.out.println("Where would yeh like to go, please enter a cardinal directon");
			if(d==1) {
				System.out.println("There is no door to the north.");
			}
			else if(d==2) {
				System.out.println("Watch yerself...you are in the bear room.");
				location = 6;

			}
			else if(d==3) {
				System.out.println("There is no door to the east.");
			}
			else if(d==4) {
				System.out.println("ACK! ANOTHER TRAP.");
				location = 3;

			}
		}
		else if(location == 8) {
			if(hasTrap2 == true){
				p.setHealth(p.getHealth() - 5);
				System.out.println("Your current health is: " + p.getHealth());
			hasTrap2 = false;
		}
				System.out.println("Where would yeh like to go, please enter a cardinal directon.");
			if(d==1) {
				System.out.println("Ye find an ancient axe with AKASH inlayed in it");
				location = 12;
			}
			else if(d==2) {
				System.out.println("There is no door to the south.");

			}
			else if(d==3) {
				System.out.println("Back to the bear room ye go...");
				location = 6;
			}
			else if(d==4) {
				System.out.println("There is no door to the south.");

			}
		}
		else if(location == 9) {
			if(hasBlade == true){
				System.out.println("Ye raise yer sword and the dragon is quickly smoted... as he melts in front of the power of the BLADE OF AKASH!");
				hasDragon = false;
		}
		else if(hasBlade == false){
			System.out.println("Ye are eaten whole by the dragon... as he laughs at yer puny sword. Ye call yerself a knight??");
			p.setHealth(0);

		}
				System.out.println("Where would yeh like to go, please enter a cardinal directon.");
			if(d==1) {
				System.out.println("Ye see crumbling walls... but are suddenly sinking into the floor, it's quicksand!!!");
				location = 10;
			}
			else if(d==2) {
				System.out.println("There is no door to the south.");

			}
			else if(d==3) {
				System.out.println("Ye exit the lair into a room filled with gold! Ye fill your pockets and a climb ladder leading up on the surface!");
				location = 11;
			}
			else if(d==4) {
				System.out.println("There is no door to the south.");

			}
		}
		else if(location == 10) {
				p.setHealth(p.getHealth() - 5);
				System.out.println("Ye step in quicksand and take some damage, your current health is: " + p.getHealth());
				System.out.println("Where would yeh like to go, please enter a cardinal directon.");
			if(d==1) {
				System.out.println("There is no door to the north.");
			}
			else if(d==2) {
				System.out.println("BEWARE! Ye are in the dragon's lair again!!");
				location = 9;

			}
			else if(d==3) {
				System.out.println("There is no door to the east.");
			}
			else if(d==4) {
				System.out.println("There is no door to the south.");

			}
		}
		else if(location == 11) {
			System.out.println("Wow, ye escaped, knight.");
			gameOver = true;

		}
		else if(location == 12) {
			hasBlade = true;
				System.out.println("Where would yeh like to go, please enter a cardinal directon.");
			if(d==1) {
				System.out.println("There is no door to the north.");
			}
			else if(d==2) {
				System.out.println("ACK! Ye are in the bear trap room again.");
				location = 8;

			}
			else if(d==3) {
				System.out.println("There is no door to the east.");
			}
			else if(d==4) {
				System.out.println("There is no door to the west.");

			}
		}
		else if(location == 13) {
				System.out.println("Where would yeh like to go, please enter a cardinal directon.");
			if(d==1) {
				System.out.println("Ye have entered the dragons lair, better have a good sword!!");
				location = 9;
			}
			else if(d==2) {
				System.out.println("Ye are in the dining room.");
				location = 1;

			}
			else if(d==3) {
				System.out.println("Ye see a knight with a glowing sword... he hands it over to you.");
				location = 5;
			}
			else if(d==4) {
				System.out.println("There is no door to the west.");

			}
		}

	}


}
