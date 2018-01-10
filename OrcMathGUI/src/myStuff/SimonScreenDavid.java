package myStuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenDavid extends ClickableScreen implements Runnable {
	TextLabel label;
	ButtonInterfaceDavid[] buttonsOnScreen;
	ProgressInterfaceDavid progress;
	ArrayList<MoveInterfaceDavid> sequence;
	
	int roundNumber;
	boolean acceptingInput;
	int sequenceIndex;
	int lastSelectedButton;
	
	public SimonScreenDavid(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		label.setText("");
		nextRound();
		
	}

	private void nextRound() {
		acceptingInput = false;
		roundNumber++;
		MoveInterfaceDavid move = randomMove();
		sequence.add(move);
	//	progress.setSequenceSize(sequence.size());
		changeText("Simon's turn");
		label.setText("");
		playSequence();
		changeText("Your turn");
		acceptingInput = true;
		sequenceIndex = 0;
	}
	private void playSequence() {
		ButtonInterfaceDavid b = null;
		for(int i = 0; i < sequence.size(); i++) {
			if(b != null) {
				b.dim();
				b = sequence.get(i).getAButton();
				b.highlight();
				int sleepTime = (10000 - (roundNumber * 100)) + 1000;
				try {
					Thread.sleep(sleepTime);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				b.dim();
			}
		}
	}
	private void changeText(String string) {
		label.setText(string);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		for(ButtonInterfaceDavid b: buttonsOnScreen){ 
		    viewObjects.add(b); 
		}
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceDavid>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);

	}

	private MoveInterfaceDavid randomMove() {
		int bIndex = (int)(Math.random()*buttonsOnScreen.length);
			while (bIndex == lastSelectedButton) {
				bIndex = (int)(Math.random()*buttonsOnScreen.length);
			}
		return getMove(bIndex);
	}
	private MoveInterfaceDavid getMove(int bIndex) {
	    return null;
	}

	private ProgressInterfaceDavid getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 4;
		buttonsOnScreen = new ButtonInterfaceDavid[numberOfButtons];
		Color[] colors = new Color[numberOfButtons];
		colors[0] = Color.red;
		colors[1] = Color.blue;
		colors[2] = Color.green;
		colors[3] = Color.yellow;
		
		for (int i =0;i<buttonsOnScreen.length;i++) {
			ButtonInterfaceDavid d = getAButton();
			buttonsOnScreen[i] = d;
			d.setColor(colors[i]);
			d.setX(i+10);
			d.setY(i+10);
		d.setAction(new Action(){
			public void act() {
				if(acceptingInput) {
					Thread blink = new Thread(new Runnable() {
						public void run() {
							d.highlight();
							try {
								Thread.sleep(800);
							}catch(InterruptedException e){
								e.printStackTrace();
							}
							d.dim();
						}
					});	
					blink.start();
					if(d==sequence.get(sequenceIndex).getAButton()) {
						sequenceIndex++;
					}else {
						ProgressInterfaceDavid.gameOver();
					}
					if(sequenceIndex == sequence.size()) {
						Thread nextRound = new Thread(SimonScreenDavid.this);
						nextRound.start();
					}
				}
			}
		});
		}
		
	}

	private ButtonInterfaceDavid getAButton() {
		
		return new ButtonJessi(0,0,50,50,"", null);
	}
}
