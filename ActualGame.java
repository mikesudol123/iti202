
public class ActualGame {


	boolean gameOver = false;
	boolean hasBlade = false;
	boolean hasSword = false;
	boolean hasBear = true;
	boolean hasAnts = true;
	boolean hasDragon = true;



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
			System.out.println("you are in an empty room");
				System.out.println("Where would you like to go, please enter a cardinal directon");
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

		else if(location == 1) {
				System.out.println("Where would you like to go, please enter a cardinal directon");
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

		else if(location == 2) {
				System.out.println("Where would you like to go, please enter a cardinal directon");
			if(d==1) {
				System.out.println("You exit the north door and find yourself face to face with a ancient knight holding a massive glowing sword");
				location = 5;
			}
			else if(d==2) {
				System.out.println("There is no door to the south");
			}
			else if(d==3) {
				System.out.println("there is no door to the east");
			}
			else if(d==4) {
				System.out.println("Your in a large dining room");
				location = 1;

			}
		}
		else if(location == 3) {
				System.out.println("Where would you like to go, please enter a cardinal directon");
			if(d==1) {
				System.out.println("there is no door to the north");

			}
			else if(d==2) {
				System.out.println("ANTZ");
				location = 7;

			}
			else if(d==3) {
				System.out.println("You enter a dining room");
				location = 1;
			}
			else if(d==4) {
				System.out.println("no east door");

			}
		}
		else if(location == 5) {
				System.out.println("Where would you like to go, please enter a cardinal directon");
			if(d==1) {
				System.out.println("there is no north door");
			}
			else if(d==2) {
				System.out.println("You are in a armory");
				location = 2;

			}
			else if(d==3) {
				System.out.println("no east door");
			}
			else if(d==4) {
				System.out.println("You exit the west door and find youself in a long hallway, the door to your east glows and you hear a roar to the north");
				location = 13;

			}
		}
		else if(location == 6) {
				System.out.println("Where would you like to go, please enter a cardinal directon");
			if(d==1) {
				System.out.println("ANTZ");
				location = 7;
			}
			else if(d==2) {
				System.out.println("No door to the south");

			}
			else if(d==3) {
				System.out.println("your back where you started");
				location = 4;
			}
			else if(d==4) {
				System.out.println("You step in a bear trap, wish the bear had hit that");
				location = 8;

			}
		}
		else if(location == 7) {
				System.out.println("Where would you like to go, please enter a cardinal directon");
			if(d==1) {
				System.out.println("there is no north door");
			}
			else if(d==2) {
				System.out.println("You are in the bear room");
				location = 6;

			}
			else if(d==3) {
				System.out.println("no east door");
			}
			else if(d==4) {
				System.out.println("ANOTHER TRAP");
				location = 3;

			}
		}
		else if(location == 8) {
				System.out.println("Where would you like to go, please enter a cardinal directon");
			if(d==1) {
				System.out.println("you find a ancient axe with akash inlayed in it");
				location = 12;
			}
			else if(d==2) {
				System.out.println("no south door");

			}
			else if(d==3) {
				System.out.println("back to the bear room you go");
				location = 6;
			}
			else if(d==4) {
				System.out.println("no south door");

			}
		}
		else if(location == 9) {
				System.out.println("Where would you like to go, please enter a cardinal directon");
			if(d==1) {
				System.out.println("You see crumbling walls but are suddnly sinking into the floor, its quicksand");
				location = 10;
			}
			else if(d==2) {
				System.out.println("there is no room to the south");

			}
			else if(d==3) {
				System.out.println("CONGRATS U ESCAPED");
				location = 11;
			}
			else if(d==4) {
				System.out.println("no south door");

			}
		}
		else if(location == 10) {
				System.out.println("Where would you like to go, please enter a cardinal directon");
			if(d==1) {
				System.out.println("there is no north door");
			}
			else if(d==2) {
				System.out.println("You are in the dragons lair again");
				location = 9;

			}
			else if(d==3) {
				System.out.println("no east door");
			}
			else if(d==4) {
				System.out.println("no south door");

			}
		}
		else if(location == 11) {
			System.out.println("you escaped congrats");
			gameOver = true;

		}
		else if(location == 12) {
				System.out.println("Where would you like to go, please enter a cardinal directon");
			if(d==1) {
				System.out.println("there is no north door");
			}
			else if(d==2) {
				System.out.println("You are in the bear trap room again");
				location = 8;

			}
			else if(d==3) {
				System.out.println("no east door");
			}
			else if(d==4) {
				System.out.println("no west door");

			}
		}
		else if(location == 13) {
				System.out.println("Where would you like to go, please enter a cardinal directon");
			if(d==1) {
				System.out.println("You have entered the dragons lair, better have a good sword");
				location = 9;
			}
			else if(d==2) {
				System.out.println("You are in the dining room");
				location = 1;

			}
			else if(d==3) {
				System.out.println("You see a knight with a glowing sword, he hands it over to you");
				location = 5;
			}
			else if(d==4) {
				System.out.println("no west door");

			}
		}

	}


}
