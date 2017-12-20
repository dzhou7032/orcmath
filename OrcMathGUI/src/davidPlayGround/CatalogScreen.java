package davidPlayGround;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen implements FileRequester {

	private static final long serialVersionID = 258186143576427947L;
	private TextField field;
	private TextField Title;
	private TextField Author;
	private TextField pages;
	private TextArea text;
	private Button addButton;
	private Button saveButton;
	private Button deleteButton;
	private FileOpenButton openButton;
	private Button loadButton;
	private CharacterMaker catalog;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
	}
	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		catalog = new CharacterMaker();
		
		openButton = new FileOpenButton(600, 40, 40, 40, null, this);
		saveButton = new Button(700, 40, 40, 40, "Save", new Action() {
			
			@Override
			public void act() {
				saveClicked();
				
			}
		});
		addButton = new Button(650, 40, 40, 40, "Add", new Action() {
			
			@Override
			public void act() {
				addClicked();
				
			}
		} );
		deleteButton = new Button(540, 40, 50, 40, "Delete", new Action() {
			
			@Override
			public void act() {
				deleteClicked();
				
			}
		});
		loadButton = new Button(500, 40, 40, 40, "Load", new Action() {
			
			@Override
			public void act() {
				loadClicked();
				
			}
		});
		text = new TextArea(100, 100, 100, 70, "This is where text goes");
		viewObjects.add(loadButton);
		viewObjects.add(text);
		viewObjects.add(deleteButton);
		viewObjects.add(openButton);
		viewObjects.add(addButton);
		viewObjects.add(saveButton);
		field = new TextField(40, 40, 200, 30, "Text goes here", "Description");
		field.setInputType(field.INPUT_TYPE_NUMERIC);
		RadioButton rb1 = new RadioButton(300, 40, 30, 30, "X", null);
		RadioButton rb2 = new RadioButton(400, 40, 30, 30, "Y", null);
		rb1.addPeer(rb2);
		rb2.addPeer(rb1);
		viewObjects.add(rb1);
		viewObjects.add(rb2);
		viewObjects.add(field);
	}
	protected void loadClicked() {
		// TODO Auto-generated method stub
		
	}
	protected void deleteClicked() {
		// TODO Auto-generated method stub
		
	}
	protected void saveClicked() {
		// TODO Auto-generated method stub
		
	}
	protected void addClicked() {
		Animation update = new Animation("name", "color", 17, "place");
		text.setText(update.toString());
		
	}
	@Override
	public void setFile(File f) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public JFrame getWindow() {
		// TODO Auto-generated method stub
		return null;
	}

}
