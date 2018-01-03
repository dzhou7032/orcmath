package myStuff;

import guiTeacher.GUIApplication;
import guiTeacher.components.TextLabel;

public class SimonGameDavid extends GUIApplication {
	public SimonGameDavid(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
	}
	
	public void initScreen() {
		SimonScreenDavid screen1 = new SimonScreenDavid(getWidth(), getHeight());
		setScreen(screen1);
	}
}
