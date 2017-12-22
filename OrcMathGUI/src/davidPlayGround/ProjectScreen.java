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
	private WindAnimation wind;
	
	public ProjectScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		snowBackground = new Graphic(0,0,950,750, "resources/snowBack.jpg");
		santa = new Graphic(500, 40, 100, 100, "resources/santa.jpg");
		changeButton = new Button(50,50,60,40,"Change", new Action() {
			
			@Override
			public void act() {
				MiniProjectGUI.ChristplusCard.setScreen(MiniProjectGUI.back);
				MiniProjectGUI.ChristplusCard.setBounds(100,100,1500,700);
			}
		});
		wind = new WindAnimation(50,50,100,100);
		viewObjects.add(snowBackground);
		viewObjects.add(changeButton);
		viewObjects.add(santa);
		viewObjects.add(wind);
	}
	
}
