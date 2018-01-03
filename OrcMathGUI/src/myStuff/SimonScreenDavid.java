package myStuff;

import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenDavid extends ClickableScreen implements Runnable {
	TextLabel currentRound;
	ButtonInterfaceDavid[] buttonsOnScreen;
	ProgressInterfaceDavid gameinfo;
	ArrayList<MoveInterfaceDavid> Sequence;
	
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
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}
}
