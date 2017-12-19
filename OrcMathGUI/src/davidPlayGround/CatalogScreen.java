package davidPlayGround;

import java.util.List;

import guiTeacher.components.RadioButton;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {

	private static final long serialVersionID = 258186143576427947L;
	private TextField field;
	private TextField Title;
	private TextField Author;
	private TextField pages;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
	}
	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		field = new TextField(40, 40, 200, 30, "Text goes here", "Description");
		RadioButton rb1 = new RadioButton(300, 40, 30, 30, "X", null);
		RadioButton rb2 = new RadioButton(400, 40, 30, 30, "Y", null);
		rb1.addPeer(rb2);
		rb2.addPeer(rb1);
		viewObjects.add(rb1);
		viewObjects.add(rb2);
		viewObjects.add(field);
	}

}
