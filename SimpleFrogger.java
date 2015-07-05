import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class SimpleFrogger extends GraphicsProgram {
	
	private static final int SQSIZE = 75;
	private static final int NROWS = 4;
	private static final int NCOLS = 7;
	public static final int APPLICATION_WIDTH = NCOLS * SQSIZE;
	public static final int APPLICATION_HEIGHT = NROWS * SQSIZE;
	
	public void run() {

		addFrog();
		
		addMouseListeners();
	}
	
	private void addFrog() {
		frog = new GImage("frog.gif");
		double x = (NCOLS / 2) * SQSIZE;
		double y = (NROWS - 1) * SQSIZE;
		add(frog, x ,y);
		
		double scaleX = SQSIZE / frog.getWidth();
		double scaleY = SQSIZE / frog.getHeight();
		frog.scale(scaleX,scaleY);		
	}
	
	public void mouseClicked(MouseEvent e){
		int frogX = (int)frog.getX() + (SQSIZE / 2);
		int frogY = (int)frog.getY() + (SQSIZE / 2);
		int diffX = e.getX() - frogX;
		int diffY = e.getY() - frogY;
		
		if( Math.abs(diffX) > Math.abs(diffY) ) {
			moveX(diffX);
		}
		else {
			moveY(diffY);
		}
	}
	
	private void moveX(int diffX) {
		if (diffX > 0 && (frog.getX() + SQSIZE * 1.5) < APPLICATION_WIDTH) {
			frog.move(SQSIZE,0);
		}
		else if (diffX < 0 && (frog.getX() - SQSIZE) >= 0 ) {
			frog.move(-SQSIZE,0);
		}
	}
	
	private void moveY(int diffY) {
		if (diffY > 0 && (frog.getY() + SQSIZE * 1.5) < APPLICATION_HEIGHT) {
			frog.move(0,SQSIZE);
		}
		else if (diffY < 0 && (frog.getY() - SQSIZE) >= 0 ) {
			frog.move(0,-SQSIZE);
		}
	}
	
	private GImage frog;
}
