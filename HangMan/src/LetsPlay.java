import java.util.ArrayList;


public class LetsPlay{
	Words w = new Words();
	Table t =  new Table();
	String rndWord = w.randomWord();
	String minusSymbol = t.getMinusSymbol(rndWord);
	final char[] array  = minusSymbol.toCharArray();
	public	ArrayList<Character> enteredLetters = new ArrayList<Character>();
	static int counter = 0;


	public void guessALetter( char userGuess){

		if(enteredLetters.contains(userGuess)){
			counter++;
			System.out.println("you've already tried this letter ("+ userGuess+")");
		}
		else{
			enteredLetters.add(userGuess);
		}

		for(int i=0; i< array.length; i++)
		{

			if(	rndWord.charAt(i) == userGuess  ){
				array[i] = userGuess;
			}
			else if(rndWord.charAt(i) == Character.toUpperCase(userGuess) ){
				array[i] = Character.toUpperCase(userGuess);
			}

		}

		if(!rndWord.contains(""+userGuess)){
			counter++;
			System.out.println(counter);
			if(counter==1){
				System.out.println("FIRST ");
				t.theManHanging1();
			}
			else if(counter == 2){
				System.out.println("hej");
				t.theManHanging1();
				t.theManHanging2();
			}
			else if(counter == 3){
				t.theManHanging1();
				t.theManHanging2();
				t.theManHanging3();

			}
			else if(counter == 4){
				t.theManHanging1();
				t.theManHanging2();
				t.theManHanging3();
				t.theManHanging4();

			}
			else{
				t.theManHanging1();
				t.theManHanging2();
				t.theManHanging3();
				t.theManHanging4();
				t.theManHanging5();

			}

		}

		System.out.println(counter);
		System.out.println(array);

	}

	public void usedLetter(){
		System.out.println("Used letters " + toString());
	}

	@Override
	public String toString(){
		StringBuilder myBuilder = new StringBuilder();
		for(char c : enteredLetters){
			myBuilder.append(" "+c);
		}
		return myBuilder.toString() ;
	}


}


