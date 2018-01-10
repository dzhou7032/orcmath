package myStuff;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiTeacher.Utilities;
import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonJessi extends Button implements ButtonInterfaceDavid{

	public ButtonJessi(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, "", action);
	}
	
	@Override
	public void setColor(Color color) {
		this.setBackground(color);
		update();
	}
	
	@Override
	public void highlight() {
		Color gotColor = getBackgroundColor();
		this.setBackground(Utilities.lighten(gotColor, 50));
		update();
	}
	
	@Override
	public void dim()
	{
		Color gotColor = getBackgroundColor();
		this.setBackground(Utilities.lighten(gotColor, -50));
		update();
	}
	public void drawButton(Graphics2D g, boolean hover) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		drawShape(g, hover);
		g.setColor(getForeground());
	}
	

	
}
