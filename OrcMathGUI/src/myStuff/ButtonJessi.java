package myStuff;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.Utilities;
import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonJessi extends Button implements ButtonInterfaceDavid{

	public ButtonJessi(int x, int y, int w, int h, String text, Action action) {
		super(x, y, 20, 30, "", action);
	}
	
	@Override
	public void setColor(Color color) {
		setBackground(color);
	}
	
	@Override
	public void highlight() {
		Color gotColor = getBackgroundColor();
		setBackground(Utilities.lighten(gotColor, 50));
	}
	
	@Override
	public void dim()
	{
		Color gotColor = getBackgroundColor();
		setBackground(Utilities.lighten(gotColor, -50));
	}
	


	
}
