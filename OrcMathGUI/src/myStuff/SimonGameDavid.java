package myStuff;

import guiTeacher.GUIApplication;
import guiTeacher.components.TextLabel;

public class SimonGameDavid extends GUIApplication {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static SimonGameDavid test;
	public static SimonScreenDavid testscreen;
	
	public SimonGameDavid(int width, int height) {
		super(width, height);
		setVisible(true);
	}
	public static void main(String[] args) {
		test = new SimonGameDavid(1000, 1000);
		Thread go = new Thread(test);
		go.start();
	}
	
	public void initScreen() {
		testscreen = new SimonScreenDavid(getWidth(), getHeight());
		setScreen(testscreen);
	}
}
