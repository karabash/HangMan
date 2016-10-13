import java.util.ArrayList;
import java.util.Random;

public class Words{

	private ArrayList<String> list = new ArrayList<String>();
	private Random rnd = new Random();

	StringBuilder setThemTogether = new StringBuilder();
	private void setWords(){
		list.add("Istanbul");
		list.add("Stockholm");
		list.add("Ankara");
		list.add("Berlin");
		list.add("Gotland");
		
	}

	public String randomWord(){
		setWords();
		int index = rnd.nextInt(list.size() );
		return list.get(index).toString();
	}

}
