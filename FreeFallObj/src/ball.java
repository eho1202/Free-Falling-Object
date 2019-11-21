import java.awt.*;
import javax.swing.*;

public class ball extends JPanel {
	// Properties of the ball
	int intX = 30;
	int intY = 30;
	double dblDistanceX = 20;
	double dblDistanceY = 50;
	int intX1;
	int intY1;
	double dblGravity = -9.8;
	double dblMass = 10;
	double dblSpeed;
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval((int)dblDistanceX, (int)dblDistanceY, intX, intY );
		g.drawRect(0, 0, 649, 649);
	}
	
	ball() {
		super();
	}
	
}
