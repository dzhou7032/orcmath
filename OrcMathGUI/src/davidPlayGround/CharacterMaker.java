package davidPlayGround;

import java.util.ArrayList;

public class CharacterMaker {

	ArrayList<Animation> newCharacters;
	public CharacterMaker() {
		newCharacters = new ArrayList<Animation>();
		newCharacters.add(new Animation("David","red", 17, "resources/characterA"));
		newCharacters.add(new Animation("GodDavid", "blue", 17, "resources/characterB"));
		newCharacters.add(new Animation("SuperGodDavid", "green", 17, "resources/characterC"));
	}
	public static void main(String[] args) {
		
	}
	public String getCSVContent() {
		String data = "";
		for(Animation a: newCharacters) {
			data += a+"\n"; 
		}
		return data;
	}
}
