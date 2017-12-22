package davidPlayGround;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;

public class WindAnimation extends AnimatedComponent {

	public WindAnimation(int x, int y, int w, int h) {
		super(x, y, w, h);
		
		addSequence("resources/windtransparent.png", 150, 0, 0, 90, 90, 6);
		Thread animation=new Thread(this);
		animation.start();
		update();
	}
	public void update(Graphics2D g) {
	//	g.setColor(Color.red);
	//	g.fillRect(0, 0, getWidth(), getHeight());
		super.update(g);
	}
	
}
