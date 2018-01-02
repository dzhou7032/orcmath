package davidPlayGround;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class CustomButton extends Button {

	private String string1;
	private String string2;
	private Color color1;
	
	public CustomButton(int x, int y) {
		super(x, y, 50, 50,"",null);
		
	}
	
	public void drawButton(Graphics2D g, boolean hover) {
		g.setColor(Color.black);
		g.drawString(string1, 50, 50);
		g.drawString(string2, 80, 80);
		g.drawOval(100, 100, 10, 10);
	}
	
	public void updateString1(String string1) {
		
	}
	public void updateString2(String string2) {
		
	}
	public void updateColor1(Color color1) {
		
	}
	
}
