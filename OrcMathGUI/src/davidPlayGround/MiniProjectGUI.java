package davidPlayGround;

import guiTeacher.GUIApplication;

public class MiniProjectGUI extends GUIApplication {

	static MiniProjectGUI ChristplusCard;
	static ProjectScreen front;
	static ProjectScreen back;
	
	
	public MiniProjectGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		ProjectScreen PS = new ProjectScreen(getWidth(), getHeight());
		setScreen(PS);
		
	}
	public static void main(String[] args) {
		ChristplusCard = new MiniProjectGUI(500, 850);
		front = new ProjectScreen(600,400);
		back = new ProjectScreen(600,400);
		Thread go = new Thread(ChristplusCard);
		go.start();
	}
	
}
