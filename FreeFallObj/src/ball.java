import java.awt.*;
import javax.swing.*;

/**
 * The animation panel of the project
 * @author Ernestine
 *
 */
public class ball extends JPanel {
	// sets size of ball
	/**
	 * The dimensions of the ball
	 */
	int intX = 30;
	int intY = 30;
	// sets location of the ball
	/**
	 * Sets locations of the ball
	 */
	int intDistanceX = 50;
	int intDistanceY = 300;
	
	/**
	 * Default values of acceleration due to gravity on Earth
	 */
	double dblGravity = 9.8; // gravity of earth
	/**
	 * Variable for velocity in the y-axis
	 */
	double vy; // velocity of y-axis
	
	boolean blnDrag; // used to check if user is dragging ball

	// method
	/**
	 * Draws balls and sets location of the ball
	 * vy is randomized
	 * The ball is forced to stay inside box
	 */
	/**
	 *
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(0, 20, 540, 529);
		Graphics2D g2 = (Graphics2D) g;
		// renders ball, makes it rounder
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.fillOval(intDistanceX, intDistanceY, intX, intY);

		// randomizes velocity of y-axis
		vy = Math.pow((Math.random() * -15) + -5, 2) / (2 * dblGravity);

		intDistanceY += vy; // vy updates Y Distance of ball
		vy += dblGravity; // dblGravity updates vy

		// if ball hits the floor, ball should stay on the floor
		if (intDistanceY + intY > 529) {
			intDistanceY = 540 - intY;
		} else if (intDistanceY < 20) { // if ball hits the ceiling, ball should fall
			intDistanceY = intDistanceY + intY;
		}

		// if ball hits the right wall, ball should stay inside the box
		if (intDistanceX + intX > 540) {
			intDistanceX = 540 - intX;
		}

	}

	// constructor
	/**
	 * Constructs an object
	 */
	ball() {
		super();
	}

}
