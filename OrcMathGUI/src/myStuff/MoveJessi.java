package myStuff;

public class MoveJessi implements MoveInterfaceDavid {

	@Override
	public ButtonInterfaceDavid getAButton() {
		return new ButtonJessi(0,0,50,50,"", null);
	}

}
