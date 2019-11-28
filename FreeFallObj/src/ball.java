import java.awt.*;
import javax.swing.*;

public class ball extends JPanel {
	// Properties of the ball
	int intX = 30;
	int intY = 30;
	int intDistanceX = 50;
	int intDistanceY = 300;
	int intX1;
	int intY1;
	double dblGravity = 9.8;
	double bounce = 0.7;
	double friction = 0.1;
	double vx = 5; // velocity of x-axis
	double vy; // velocity of y-axis
	boolean blnFall;
	boolean blnDrag;
	
	int dragFromX = 0;
	int dragFromY = 0;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(intDistanceX, intDistanceY, intX, intY );
		g.drawRect(0, 20, 649, 629);
		
		vy = Math.pow((Math.random() * -15) + -5, 2) / (2 * dblGravity);
		
		intDistanceY += vy;
		vy += dblGravity;
		
		
			
		// if ball hits the floor
		if (intDistanceY + intY > 649) {
			intDistanceY = 649 - intY;
			vy = vy * -bounce;
			if (vy < 0 && vy > -2.1) {
				vy = 0;
			}
			if (Math.abs(vx) < 1.1) {
				vx = 0;
			}
			
			if (vx > 0) {
				vx = vx - friction;
			}
			if (vx < 0 ) {
				vx = vx + friction;
			}
			
		} else if (intDistanceY < 20) {
			intDistanceY = intDistanceY + intY;
			vy = vy * -bounce;
			if (vy < 0 && vy > -2.1) {
				vy = 0;
			}
			if (Math.abs(vx) < 1.1) {
				vx = 0;
			}
			
			if (vx > 0) {
				vx = vx - friction;
			}
			if (vx < 0 ) {
				vx = vx + friction;
			}
		
		}
		
	}
		
}
