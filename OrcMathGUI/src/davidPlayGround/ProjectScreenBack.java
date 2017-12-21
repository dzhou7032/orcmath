package davidPlayGround;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class ProjectScreenBack extends FullFunctionScreen {
	private static final long serialVersionID = 258186143576427947L;
	private Button changeButton;
	private Graphic santa;
	
	public ProjectScreenBack(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		santa = new Graphic(500, 40, 100, 100, "resources/santa.jpg");
		changeButton = new Button(50,50,60,40,"Change", new Action() {
			
			@Override
			public void act() {
				MiniProjectGUI.ChristplusCard.setScreen(MiniProjectGUI.front);
			}
		});
		viewObjects.add(changeButton);
		viewObjects.add(santa);
	}
	
}