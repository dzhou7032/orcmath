package myStuff;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class ProgressJessi extends Component implements ProgressInterfaceDavid{


	private int roundNum;
	private int sequenceNum;
	private boolean loss;
	
	public ProgressJessi(int x, int y, int w, int h) {
		super(40, 300, 250, 250);
	}

	@Override
	public void update(Graphics2D g) {
		clear();
		g.drawRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		g.drawString("Round: ", 50, 50);
		g.drawString("Current sequence length: ", 100, 50);
		if(loss) {
			g.drawString("You Lose", 150, 50);
		}
	}

	@Override
	public void setRound(int x) {
		this.roundNum = x;
		update();
	}

	@Override
	public void setSequenceSize(int x) {
		this.sequenceNum = x;
		update();
	}

}
