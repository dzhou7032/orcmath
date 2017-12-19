package davidPlayGround;

import guiTeacher.GUIApplication;
import guiTeacher.components.RadioButton;

public class CatalogMakerGUI extends GUIApplication {

	public CatalogMakerGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		CatalogScreen s = new CatalogScreen(getWidth(), getHeight());
		setScreen(s);
	}

	public static void main(String[] args) {
		CatalogMakerGUI sample = new CatalogMakerGUI(800, 850);
		Thread go = new Thread(sample);
		go.start();
	}

}

