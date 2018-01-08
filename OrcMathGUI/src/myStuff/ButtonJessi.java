package myStuff;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonJessi extends Button implements ButtonInterfaceDavid{

	private Color original;

	public ButtonJessi(int x, int y, int w, int h, String text, Action action) {
		super(x, y, 20, 30, "", action);
	}
	
	@Override
	public void setColor(Color color) {
		this.setColor(color);
		color = original;
		setBackground(color);
		
	}
	
	@Override
	public void highlight() {
		setColor(original.brighter());
	}
	
	@Override
	public void dim()
	{
		setColor(original.darker());
	}
	
	public void drawButton(Graphics2D g, boolean hover) {
		if(hover == true) {
		      highlight();
			
		}
		else {
			dim();
		}
		
		g.setColor(original);
		g.drawRect(20, 50, 100, 100);
	}

	@Override
	public void getAbutton() {
		// TODO Auto-generated method stub
		
	}
	
}
