import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LetsPlay play = new LetsPlay();
		
		User user = new User();
		boolean checkWin = false;
		
		//set user name
		System.out.println("Enter your name");
		String userName = input.nextLine();
		user.setUserName(userName);
		while(true){
			System.out.println(user.getUserName() + " enter a letter"); //get user name

			play.guessALetter(input.next().charAt(0));

			play.usedLetter();
			String text = String.valueOf(play.array);

			if(text.equals(play.rndWord)){
				System.out.println("You've found the word");
				checkWin = true;
			}

			if(LetsPlay.counter == 5 || checkWin){
				System.out.println("Do you wanna play again"+
						"\n1)Yes 2)No ");
				int playAgain = input.nextInt();
				if(playAgain<3 && playAgain>0){
					if(playAgain==1){
						checkWin = false;
						LetsPlay.counter =0;
						play.enteredLetters.clear();
						play = new LetsPlay();
					}
					else{
						System.out.println("BY!");
						System.exit(0);
					}
				}
			}
		}


	}
}