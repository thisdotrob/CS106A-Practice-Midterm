import stanford.karel.*;

public class InnerBorderKarel extends SuperKarel {

	
	public void run() {
		move();
		turnLeft();
		for(int i = 0; i < 4; i++) {
			drawBorder();
		}
	}
	
	private void drawBorder() {
		move();
		turnRight();
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
		turnAround();
	}
	
}
	
	