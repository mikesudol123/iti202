import java.util.Scanner;


public class TextAdventure extends ActualGame{



	public static void main(String[] args) {

			System.out.println("Welcome to The Hunt for The Blade of Akash.\r\n" + "Move along into the rooms searching for The Blade of Akash.\r\n" + 
				"Collect Armor, Health, and Defense stats.\r\n" + 
				"Once you found The Blade of Akash, defeat the Dragon.");
		System.out.println("Please enter your name.");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		System.out.println("Welcome Knight " + name + ".");
		ActualGame game = new ActualGame();
		game.populateRooms();
		
		
		String nav;
		int x;


		while(game.gameOver==false){
			nav="";
			x=0;

			System.out.println("Where would you like to go, please enter a cardinal directon");
			nav= input.nextLine();
			if (nav.equals("north"))
			x = 1;
			else if (nav.equals("south"))
			x = 2;
			else if (nav.equals("west"))
			x = 3;
			else if (nav.equals("east"))
			x = 4;

			game.navigation(x);
			nav="";

		}

		input.close();






	}
}
