package davidPlayGround;

import java.awt.Rectangle;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class ProjectScreen extends FullFunctionScreen {
	private static final long serialVersionID = 258186143576427947L;
	private Button changeButton;
	private Graphic santa;
	private Graphic snowBackground;
	
	public ProjectScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
	//		addSequence("resources/spritesheet.jpg", 150, 0, 240, 254, 253, 4);
		//	Thread animation=new Thread(this);
		//	animation.start();
		//	update();
		snowBackground = new Graphic(0,0,950,750, "resources/snowBack.jpg");
		santa = new Graphic(500, 40, 100, 100, "resources/santa.jpg");
		changeButton = new Button(50,50,60,40,"Change", new Action() {
			
			@Override
			public void act() {
				MiniProjectGUI.ChristplusCard.setScreen(MiniProjectGUI.back);
				MiniProjectGUI.ChristplusCard.setBounds(40,100,900,500);
			}
		});
		viewObjects.add(snowBackground);
		viewObjects.add(changeButton);
		viewObjects.add(santa);
	}
	
}
