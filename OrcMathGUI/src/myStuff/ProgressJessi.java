package myStuff;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class ProgressJessi extends Component implements ProgressInterfaceDavid{

	public int round;
	public int sequenceSize;
	
	public ProgressJessi(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.drawString("Round: " + this.round, this.getX(), this.getX());
	}

	@Override
	public void setSequenceSize(int y) {
		this.sequenceSize = y;
	}

	@Override
	public void setRound(int roundNumber) {
		this.round = roundNumber;
	}

}
