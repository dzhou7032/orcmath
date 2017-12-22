package davidPlayGround;

import guiTeacher.GUIApplication;

public class MiniProjectGUI extends GUIApplication {

	static MiniProjectGUI ChristplusCard;
	static ProjectScreen front;
	static ProjectScreenBack back;
	
	
	public MiniProjectGUI(int width, int height) {
		super(width, height);
		setUndecorated(true);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		front = new ProjectScreen(500, 500);
		setBounds(100,100,2000,750);
		setScreen(front);
		back = new ProjectScreenBack(1000,1000);
	}
	public static void main(String[] args) {
		ChristplusCard = new MiniProjectGUI(950, 700);
		Thread go = new Thread(ChristplusCard);
		go.start();
	}
	
}
