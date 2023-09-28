import java.util.ArrayList;

class Main{
	public static void  main(String[] args){
	ArrayList<String> gameOptions = new ArrayList<>();

	gameOptions.add("1) Start Game");
	gameOptions.add("2) Resume Game");
	gameOptions.add("3) Pause Game");
	gameOptions.add("4) End Game");

	GameMenu t1=new GameMenu(gameOptions);
	String userChoice = t1.getAction();
	int userInput = Integer.parseInt(userChoice);
	doAction(userInput);


	}

public static void doAction(int action){
	int input=action;
	switch(input){
	case 1:
		System.out.println("Starting the game now");
		break;
	case 2:
		System.out.println("Fetching previously saved game data");
		break;
	case 3:
		System.out.println("Game paused");
		break;
	case 4:
		System.out.println("Ending game");
		break;
	default:
		System.out.println("Invalid choice");
		break;
	



	}



}


}