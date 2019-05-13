import java.util.Scanner;


public class TextAdventure extends ActualGame{



	public static void main(String[] args) {

		System.out.println("Game start");

		Scanner input = new Scanner(System.in);

		ActualGame game = new ActualGame();
		ActualGame.populateRooms();

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
