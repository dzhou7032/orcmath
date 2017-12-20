package davidPlayGround;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CharacterMaker {

	ArrayList<Animation> newCharacters;
	public CharacterMaker() {
		newCharacters = new ArrayList<Animation>();
		newCharacters.add(new Animation("David","red", 17, "resources/characterA"));
		newCharacters.add(new Animation("GodDavid", "blue", 17, "resources/characterB"));
		newCharacters.add(new Animation("SuperGodDavid", "green", 17, "resources/characterC"));
	}
	public static void main(String[] args) {
		CharacterMaker maker = new CharacterMaker();
		maker.addCharacter();
		System.out.println(maker.getCSVContent());
	}
	public void addCharacter(){
		Scanner in = new Scanner(System.in);
	//	System.out.println("Would you like to load a file?");
	//	if (in.nextLine().equals("Yes")) {
	//		
	//	}
		System.out.println("What is your name?");
	 	String namez = in.nextLine();
		System.out.println("What color are your eyes?");
		String colorz = in.nextLine();
		System.out.println("How old are you?");
		int agez = in.nextInt();
		String locationz = null;
		System.out.println("Where is your picture located?");
		while(locationz == null || locationz.equals("")) {
			locationz = in.nextLine();
		}
		Animation yup = new Animation(namez, colorz, agez, locationz);
		System.out.println(yup);
		newCharacters.add(yup);
		in.close();
		try {
		FileWriter fw=new FileWriter("test.csv");
		System.out.println("run");
		 fw.write(newCharacters.toString());    
		 fw.close();   
		}
		catch(IOException e){
			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
		}
	}
	public String getCSVContent() {
		String data = "";
		for(Animation a: newCharacters) {
			data += a+"\n"; 
		}
		return data;
	}
}
